package pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yn.c;

/* loaded from: classes2.dex */
public final class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: a */
    public final ScheduledThreadPoolExecutor f24293a;

    /* renamed from: b */
    public volatile boolean f24294b;

    /* renamed from: c */
    public long f24295c;

    /* renamed from: d */
    public final Rect f24296d;

    /* renamed from: e */
    public final Paint f24297e;

    /* renamed from: f */
    public final Bitmap f24298f;

    /* renamed from: g */
    public final GifInfoHandle f24299g;

    /* renamed from: h */
    public final ConcurrentLinkedQueue<yn.a> f24300h;

    /* renamed from: i */
    public ColorStateList f24301i;

    /* renamed from: j */
    public PorterDuffColorFilter f24302j;

    /* renamed from: k */
    public PorterDuff.Mode f24303k;

    /* renamed from: l */
    public final boolean f24304l;

    /* renamed from: m */
    public final yn.d f24305m;

    /* renamed from: n */
    public final e f24306n;

    /* renamed from: o */
    public final Rect f24307o;

    /* renamed from: p */
    public ScheduledFuture<?> f24308p;

    /* renamed from: q */
    public int f24309q;

    /* renamed from: r */
    public int f24310r;

    /* loaded from: classes2.dex */
    public class a extends f {

        /* renamed from: b */
        public final /* synthetic */ int f24311b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, int i10) {
            super(bVar);
            b.this = r1;
            this.f24311b = i10;
        }

        @Override // pl.droidsonroids.gif.f
        public final void a() {
            b bVar = b.this;
            bVar.f24299g.r(bVar.f24298f, this.f24311b);
            this.f24319a.f24305m.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = pl.droidsonroids.gif.GifInfoHandle.f24290b
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            goto L26
        L18:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r0)
            if (r3 == 0) goto L2a
            pl.droidsonroids.gif.GifInfoHandle r4 = new pl.droidsonroids.gif.GifInfoHandle
            r4.<init>(r3)
            r3 = r4
        L26:
            r2.<init>(r3)
            return
        L2a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not open AssetFileDescriptor for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.b.<init>(android.content.ContentResolver, android.net.Uri):void");
    }

    public final void a(long j10) {
        if (this.f24304l) {
            this.f24295c = 0L;
            this.f24305m.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f24308p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f24305m.removeMessages(-1);
        this.f24308p = this.f24293a.schedule(this.f24306n, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f24299g.h() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f24299g.h() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        if (this.f24302j == null || this.f24297e.getColorFilter() != null) {
            z10 = false;
        } else {
            this.f24297e.setColorFilter(this.f24302j);
            z10 = true;
        }
        canvas.drawBitmap(this.f24298f, this.f24307o, this.f24296d, this.f24297e);
        if (z10) {
            this.f24297e.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f24297e.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f24297e.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f24299g.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f24299g.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f24310r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f24309q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f24299g.k() || this.f24297e.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f24304l && this.f24294b) {
            long j10 = this.f24295c;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f24295c = Long.MIN_VALUE;
                this.f24293a.remove(this.f24306n);
                this.f24308p = this.f24293a.schedule(this.f24306n, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f24294b;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f24294b;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f24301i) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f24296d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f24301i;
        if (colorStateList == null || (mode = this.f24303k) == null) {
            return false;
        }
        this.f24302j = b(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f24293a.execute(new a(this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f24297e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24297e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f24297e.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f24297e.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f24301i = colorStateList;
        this.f24302j = b(colorStateList, this.f24303k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f24303k = mode;
        this.f24302j = b(this.f24301i, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.f24304l) {
            if (z10) {
                if (z11) {
                    this.f24293a.execute(new pl.droidsonroids.gif.a(this, this));
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f24294b) {
                return;
            }
            this.f24294b = true;
            a(this.f24299g.o());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (!this.f24294b) {
                return;
            }
            this.f24294b = false;
            ScheduledFuture<?> scheduledFuture = this.f24308p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f24305m.removeMessages(-1);
            this.f24299g.q();
        }
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f24299g.j()), Integer.valueOf(this.f24299g.e()), Integer.valueOf(this.f24299g.h()), Integer.valueOf(this.f24299g.g()));
    }

    public b(Resources resources, int i10) {
        this(new GifInfoHandle(resources.openRawResourceFd(i10)));
        List<String> list = d.f24314a;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        float f10 = (i11 <= 0 || i12 <= 0) ? 1.0f : i12 / i11;
        this.f24310r = (int) (this.f24299g.e() * f10);
        this.f24309q = (int) (this.f24299g.j() * f10);
    }

    public b(GifInfoHandle gifInfoHandle) {
        this.f24294b = true;
        this.f24295c = Long.MIN_VALUE;
        this.f24296d = new Rect();
        this.f24297e = new Paint(6);
        this.f24300h = new ConcurrentLinkedQueue<>();
        e eVar = new e(this);
        this.f24306n = eVar;
        this.f24304l = true;
        int i10 = yn.c.f31820a;
        this.f24293a = c.a.f31821a;
        this.f24299g = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.j(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        this.f24298f = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.k());
        this.f24307o = new Rect(0, 0, gifInfoHandle.j(), gifInfoHandle.e());
        this.f24305m = new yn.d(this);
        eVar.a();
        this.f24309q = gifInfoHandle.j();
        this.f24310r = gifInfoHandle.e();
    }
}
