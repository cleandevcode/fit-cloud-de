package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mob.tools.MobLog;
import com.mob.tools.gui.BitmapProcessor;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.UIHandler;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class AsyncImageView extends ImageView implements Handler.Callback, BitmapProcessor.BitmapCallback {
    private static final int MSG_IMG_GOT = 1;
    private static final SecureRandom RND = new SecureRandom();
    private Bitmap defaultBm;
    private int defaultRes;
    private int desiredHeight;
    private int desiredWidth;
    private long diskCacheTime;
    private Bitmap errorBm;
    private int errorRes;
    private boolean lastReqIsOk;
    private long maxBytes;
    private Path path;
    private int quality;
    private float[] rect;
    private WeakReference<AsyncImageView> refAiv;
    private Bitmap result;
    private boolean scaleToCrop;
    private String url;
    private boolean useDiskCache;
    private boolean useRamCache;

    public AsyncImageView(Context context) {
        super(context);
        this.errorRes = 0;
        this.errorBm = null;
        this.refAiv = null;
        this.useRamCache = true;
        this.useDiskCache = true;
        this.diskCacheTime = 0L;
        this.desiredWidth = 0;
        this.desiredHeight = 0;
        this.maxBytes = 0L;
        this.quality = 0;
        init(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.errorRes = 0;
        this.errorBm = null;
        this.refAiv = null;
        this.useRamCache = true;
        this.useDiskCache = true;
        this.diskCacheTime = 0L;
        this.desiredWidth = 0;
        this.desiredHeight = 0;
        this.maxBytes = 0L;
        this.quality = 0;
        init(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.errorRes = 0;
        this.errorBm = null;
        this.refAiv = null;
        this.useRamCache = true;
        this.useDiskCache = true;
        this.diskCacheTime = 0L;
        this.desiredWidth = 0;
        this.desiredHeight = 0;
        this.maxBytes = 0L;
        this.quality = 0;
        init(context);
    }

    private BitmapProcessor.BitmapDesiredOptions getBitmapDesiredOptions() {
        if ((this.desiredWidth <= 1 || this.desiredHeight <= 1) && this.maxBytes < 10240 && this.quality <= 0) {
            return null;
        }
        BitmapProcessor.BitmapDesiredOptions bitmapDesiredOptions = new BitmapProcessor.BitmapDesiredOptions();
        bitmapDesiredOptions.desiredWidth = this.desiredWidth;
        bitmapDesiredOptions.desiredHeight = this.desiredHeight;
        bitmapDesiredOptions.maxBytes = this.maxBytes;
        bitmapDesiredOptions.quality = this.quality;
        return bitmapDesiredOptions;
    }

    private int[] getSize() {
        ViewGroup.LayoutParams layoutParams;
        int width = getWidth();
        int height = getHeight();
        if ((width == 0 || height == 0) && (layoutParams = getLayoutParams()) != null) {
            width = layoutParams.width;
            height = layoutParams.height;
        }
        if (width == 0 || height == 0) {
            measure(0, 0);
            width = getMeasuredWidth();
            height = getMeasuredHeight();
        }
        return new int[]{width, height};
    }

    private Bitmap goCrop(Bitmap bitmap) {
        int[] size;
        int i10;
        int i11;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width == 0.0f || height == 0.0f || (i10 = (size = getSize())[0]) == 0 || (i11 = size[1]) == 0) {
            return bitmap;
        }
        float f10 = (i11 * width) / i10;
        if (f10 == height) {
            return bitmap;
        }
        int[] iArr = new int[4];
        if (f10 < height) {
            int i12 = (int) ((height - f10) / 2.0f);
            iArr[1] = i12;
            iArr[3] = i12;
        } else {
            int i13 = (int) ((width - ((i10 * height) / i11)) / 2.0f);
            iArr[0] = i13;
            iArr[2] = i13;
        }
        try {
            return BitmapHelper.cropBitmap(bitmap, iArr[0], iArr[1], iArr[2], iArr[3]);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return bitmap;
        }
    }

    private void init(Context context) {
        if (isInEditMode()) {
            setBackgroundColor(-16777216);
        } else {
            BitmapProcessor.prepare(context);
        }
    }

    private void myClip(Canvas canvas) {
        if (this.rect != null) {
            if (this.path == null) {
                int width = getWidth();
                int height = getHeight();
                this.path = new Path();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, width, height), this.rect, Path.Direction.CW);
            }
            canvas.clipPath(this.path);
        }
    }

    public void deleteCachedFile(String str) {
        BitmapProcessor.deleteCachedFile(str, getBitmapDesiredOptions());
    }

    public void execute(String str, int i10) {
        execute(str, i10, 0);
    }

    public void execute(String str, int i10, int i11) {
        Bitmap bitmapFromCache;
        if ((this.useRamCache || this.useDiskCache) && this.lastReqIsOk && !TextUtils.isEmpty(str) && str.equals(this.url)) {
            return;
        }
        this.lastReqIsOk = false;
        this.url = str;
        this.result = null;
        this.defaultRes = i10;
        this.errorRes = i11;
        if (TextUtils.isEmpty(str)) {
            if (i11 != 0) {
                i10 = i11;
            }
            setImageResource(i10);
            return;
        }
        BitmapProcessor.BitmapDesiredOptions bitmapDesiredOptions = getBitmapDesiredOptions();
        if (this.useRamCache && (bitmapFromCache = BitmapProcessor.getBitmapFromCache(str, bitmapDesiredOptions)) != null && !bitmapFromCache.isRecycled()) {
            setBitmap(bitmapFromCache);
            this.lastReqIsOk = true;
            return;
        }
        if (i10 > 0) {
            setImageResource(i10);
        }
        WeakReference<AsyncImageView> weakReference = this.refAiv;
        if (weakReference == null || weakReference.get() == null) {
            this.refAiv = new WeakReference<>(this);
        }
        BitmapProcessor.process(str, bitmapDesiredOptions, this.useRamCache, this.useDiskCache, this.diskCacheTime, this);
    }

    public void execute(String str, Bitmap bitmap) {
        execute(str, bitmap, (Bitmap) null);
    }

    public void execute(String str, Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapFromCache;
        if ((this.useRamCache || this.useDiskCache) && this.lastReqIsOk && !TextUtils.isEmpty(str) && str.equals(this.url)) {
            return;
        }
        this.lastReqIsOk = false;
        this.url = str;
        this.result = null;
        this.defaultBm = bitmap;
        this.errorBm = bitmap2;
        if (TextUtils.isEmpty(str)) {
            if (bitmap2 != null) {
                bitmap = bitmap2;
            }
            setImageBitmap(bitmap);
            return;
        }
        BitmapProcessor.BitmapDesiredOptions bitmapDesiredOptions = getBitmapDesiredOptions();
        if (this.useRamCache && (bitmapFromCache = BitmapProcessor.getBitmapFromCache(str, bitmapDesiredOptions)) != null && !bitmapFromCache.isRecycled()) {
            setBitmap(bitmapFromCache);
            this.lastReqIsOk = true;
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            setImageBitmap(bitmap);
        }
        WeakReference<AsyncImageView> weakReference = this.refAiv;
        if (weakReference == null || weakReference.get() == null) {
            this.refAiv = new WeakReference<>(this);
        }
        BitmapProcessor.process(str, bitmapDesiredOptions, this.useRamCache, this.useDiskCache, this.diskCacheTime, this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        WeakReference<AsyncImageView> weakReference;
        AsyncImageView asyncImageView;
        int i10;
        AsyncImageView asyncImageView2;
        Bitmap bitmap;
        if (message.what == 1 && (weakReference = this.refAiv) != null && weakReference.get() != null) {
            try {
                Object obj = message.obj;
                Object obj2 = ((Object[]) obj)[0];
                Object obj3 = ((Object[]) obj)[1];
                if (obj3 == null || obj2 == null || !obj2.equals(this.url)) {
                    if (this.errorRes > 0) {
                        asyncImageView = this.refAiv.get();
                        i10 = this.errorRes;
                    } else {
                        Bitmap bitmap2 = this.errorBm;
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            Bitmap bitmap3 = this.defaultBm;
                            if (bitmap3 == null || bitmap3.isRecycled()) {
                                asyncImageView = this.refAiv.get();
                                i10 = this.defaultRes;
                            } else {
                                asyncImageView2 = this.refAiv.get();
                                bitmap = this.defaultBm;
                            }
                        } else {
                            asyncImageView2 = this.refAiv.get();
                            bitmap = this.errorBm;
                        }
                        asyncImageView2.setImageBitmap(bitmap);
                    }
                    asyncImageView.setImageResource(i10);
                } else {
                    this.result = (Bitmap) obj3;
                    this.refAiv.get().setImageBitmap(this.result);
                    this.lastReqIsOk = true;
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() == 0 || getDrawable().getIntrinsicHeight() == 0) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int saveCount = canvas.getSaveCount();
        canvas.save();
        if (this.result != null) {
            myClip(canvas);
            canvas.drawBitmap(this.result, imageMatrix, new Paint(6));
        } else {
            if (imageMatrix != null || paddingLeft != 0 || paddingTop != 0) {
                if (getCropToPadding()) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    canvas.clipRect(scrollX + paddingLeft, scrollY + paddingTop, ((getRight() + scrollX) - getLeft()) - getPaddingRight(), ((getBottom() + scrollY) - getTop()) - getPaddingBottom());
                }
                canvas.translate(paddingLeft, paddingTop);
                if (imageMatrix != null) {
                    canvas.concat(imageMatrix);
                }
            }
            getDrawable().draw(canvas);
        }
        canvas.restoreToCount(saveCount);
    }

    @Override // com.mob.tools.gui.BitmapProcessor.BitmapCallback
    public void onImageGot(String str, Bitmap bitmap) {
        WeakReference<AsyncImageView> weakReference = this.refAiv;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (str == null || str.trim().length() <= 0 || !str.equals(this.url)) {
            bitmap = null;
        }
        if (bitmap != null && this.scaleToCrop) {
            bitmap = goCrop(bitmap);
        }
        Message message = new Message();
        message.what = 1;
        message.obj = new Object[]{str, bitmap};
        UIHandler.sendMessageDelayed(message, RND.nextInt(300), this);
    }

    public void removeRamCache(String str) {
        if (this.useRamCache) {
            BitmapProcessor.removeBitmapFromRamCache(str, getBitmapDesiredOptions());
        }
    }

    public void setBitmap(Bitmap bitmap) {
        if (this.scaleToCrop) {
            bitmap = goCrop(bitmap);
        }
        setImageBitmap(bitmap);
        this.result = bitmap;
    }

    public void setCompressOptions(int i10, int i11, int i12, long j10) {
        this.desiredWidth = i10;
        this.desiredHeight = i11;
        this.quality = i12;
        this.maxBytes = j10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        MobLog.getInstance().w(new RuntimeException("Not Support"));
    }

    public void setRound(float f10) {
        setRound(f10, f10, f10, f10);
    }

    public void setRound(float f10, float f11, float f12, float f13) {
        this.rect = new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    public void setScaleToCropCenter(boolean z10) {
        this.scaleToCrop = z10;
    }

    public void setUseCacheOption(boolean z10, boolean z11) {
        setUseCacheOption(z10, z11, 0L);
    }

    public void setUseCacheOption(boolean z10, boolean z11, long j10) {
        this.useRamCache = z10;
        this.useDiskCache = z11;
        if (z11) {
            this.diskCacheTime = j10;
        }
    }
}
