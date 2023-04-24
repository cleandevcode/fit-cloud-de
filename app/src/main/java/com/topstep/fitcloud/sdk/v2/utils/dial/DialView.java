package com.topstep.fitcloud.sdk.v2.utils.dial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloud.sdk.v2.R;
import com.topstep.fitcloud.sdk.v2.utils.dial.a;
import sj.e;

/* loaded from: classes2.dex */
public class DialView extends View {

    /* renamed from: a */
    public final Paint f12492a;

    /* renamed from: b */
    public final Paint f12493b;

    /* renamed from: c */
    public e f12494c;

    /* renamed from: d */
    public a.b f12495d;

    /* renamed from: e */
    public a.EnumC0212a f12496e;

    /* renamed from: f */
    public boolean f12497f;

    /* renamed from: g */
    public int f12498g;

    /* renamed from: h */
    public boolean f12499h;

    /* renamed from: i */
    public int f12500i;

    /* renamed from: j */
    public int f12501j;

    /* renamed from: k */
    public final RectF f12502k;

    /* renamed from: l */
    public final Matrix f12503l;

    /* renamed from: m */
    public final Matrix f12504m;

    /* renamed from: n */
    public Bitmap f12505n;

    /* renamed from: o */
    public Bitmap f12506o;

    /* renamed from: p */
    public int f12507p;

    /* renamed from: q */
    public final PorterDuffXfermode f12508q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.b bVar = a.b.CENTER;
        this.f12507p = 800;
        this.f12508q = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint(7);
        this.f12492a = paint;
        paint.setColor(-1184275);
        Paint paint2 = new Paint(5);
        this.f12493b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialView, 0, 0);
            if (obtainStyledAttributes.getInt(R.styleable.DialView_dv_shape, 0) == 0) {
                this.f12494c = new e(0, obtainStyledAttributes.getInt(R.styleable.DialView_dv_shape_width, 240), obtainStyledAttributes.getInt(R.styleable.DialView_dv_shape_height, 240), obtainStyledAttributes.getInt(R.styleable.DialView_dv_shape_corners, 0));
            } else {
                int i10 = obtainStyledAttributes.getInt(R.styleable.DialView_dv_shape_width, 240);
                this.f12494c = new e(1, i10, i10, 0);
            }
            int i11 = obtainStyledAttributes.getInt(R.styleable.DialView_dv_background_scale_type, 0);
            if (i11 != 1) {
                if (i11 == 2) {
                    bVar = a.b.AUTO_CROP;
                }
            } else {
                bVar = a.b.CENTER_CROP;
            }
            this.f12495d = bVar;
            this.f12496e = a.EnumC0212a.a(obtainStyledAttributes.getInt(R.styleable.DialView_dv_style_position, 0));
            boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.DialView_dv_check_enabled, false);
            this.f12497f = z10;
            if (z10) {
                int i12 = (int) (getResources().getDisplayMetrics().density * 4.0f);
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.DialView_dv_check_line_width, i12);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.DialView_dv_check_line_padding, i12);
                int color = obtainStyledAttributes.getColor(R.styleable.DialView_dv_check_line_color, -366842);
                paint2.setStrokeWidth(dimensionPixelOffset);
                paint2.setColor(color);
                this.f12498g = dimensionPixelOffset + dimensionPixelOffset2;
                this.f12499h = obtainStyledAttributes.getBoolean(R.styleable.DialView_dv_checked, false);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.DialView_dv_background_src);
            if (drawable instanceof BitmapDrawable) {
                this.f12505n = ((BitmapDrawable) drawable).getBitmap();
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.DialView_dv_style_src);
            if (drawable2 instanceof BitmapDrawable) {
                this.f12506o = ((BitmapDrawable) drawable2).getBitmap();
            }
            this.f12507p = obtainStyledAttributes.getInt(R.styleable.DialView_dv_style_base_on_width, this.f12507p);
            paint.setColor(obtainStyledAttributes.getColor(R.styleable.DialView_dv_background_none_color, paint.getColor()));
            obtainStyledAttributes.recycle();
        } else {
            this.f12494c = new e(0, 240, 240, 0);
            this.f12495d = bVar;
            this.f12496e = a.EnumC0212a.TOP;
        }
        this.f12502k = new RectF();
        this.f12503l = new Matrix();
        this.f12504m = new Matrix();
    }

    public final void a(Bitmap bitmap, int i10) {
        if (this.f12506o == bitmap && this.f12507p == i10) {
            return;
        }
        this.f12506o = bitmap;
        this.f12507p = i10;
        if (bitmap != null) {
            a.b(bitmap, i10, this.f12502k.width(), this.f12502k.height(), this.f12496e, this.f12504m);
        }
        invalidate();
    }

    public Bitmap getBackgroundBitmap() {
        return this.f12505n;
    }

    public a.b getBackgroundScaleType() {
        return this.f12495d;
    }

    public e getShape() {
        return this.f12494c;
    }

    public int getStyleBaseOnWidth() {
        return this.f12507p;
    }

    public Bitmap getStyleBitmap() {
        return this.f12506o;
    }

    public a.EnumC0212a getStylePosition() {
        return this.f12496e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        canvas.translate((getWidth() - this.f12500i) / 2.0f, (getHeight() - this.f12501j) / 2.0f);
        int saveLayer = canvas.saveLayer(this.f12502k, this.f12492a, 31);
        e eVar = this.f12494c;
        boolean z11 = false;
        if (eVar.f27095a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.drawCircle(this.f12502k.centerX(), this.f12502k.centerY(), this.f12502k.width() / 2.0f, this.f12492a);
        } else {
            RectF rectF = this.f12502k;
            float f10 = eVar.f27098d;
            canvas.drawRoundRect(rectF, f10, f10, this.f12492a);
        }
        Bitmap bitmap = this.f12505n;
        if (bitmap != null && !bitmap.isRecycled()) {
            float f11 = this.f12498g;
            canvas.translate(f11, f11);
            this.f12492a.setXfermode(this.f12508q);
            canvas.drawBitmap(this.f12505n, this.f12503l, this.f12492a);
            this.f12492a.setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
        Bitmap bitmap2 = this.f12506o;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            int save = canvas.save();
            float f12 = this.f12498g;
            canvas.translate(f12, f12);
            canvas.drawBitmap(this.f12506o, this.f12504m, this.f12492a);
            canvas.restoreToCount(save);
        }
        if (this.f12497f && this.f12499h) {
            float strokeWidth = this.f12493b.getStrokeWidth() / 2.0f;
            if (this.f12494c.f27095a == 1) {
                z11 = true;
            }
            float f13 = this.f12500i;
            if (z11) {
                float f14 = f13 / 2.0f;
                canvas.drawCircle(f14, this.f12501j / 2.0f, f14 - strokeWidth, this.f12493b);
                return;
            }
            canvas.drawRect(strokeWidth, strokeWidth, f13 - strokeWidth, this.f12501j - strokeWidth, this.f12493b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        this.f12500i = defaultSize;
        int i13 = this.f12498g;
        int i14 = defaultSize - (i13 * 2);
        e eVar = this.f12494c;
        int i15 = (int) ((eVar.f27097c / eVar.f27096b) * i14);
        this.f12501j = (i13 * 2) + i15;
        int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i11);
        if (this.f12501j > defaultSize2) {
            this.f12501j = defaultSize2;
            int i16 = this.f12498g;
            i15 = defaultSize2 - (i16 * 2);
            e eVar2 = this.f12494c;
            int i17 = (int) ((eVar2.f27096b / eVar2.f27097c) * i15);
            this.f12500i = (i16 * 2) + i17;
            i14 = i17;
        }
        RectF rectF = this.f12502k;
        float f10 = this.f12498g;
        rectF.set(f10, f10, i14 + i12, i12 + i15);
        a.a(this.f12505n, this.f12502k.width(), this.f12502k.height(), this.f12495d, this.f12503l);
        a.b(this.f12506o, this.f12507p, this.f12502k.width(), this.f12502k.height(), this.f12496e, this.f12504m);
        setMeasuredDimension(this.f12500i, this.f12501j);
    }

    public void setBackgroundBitmap(Bitmap bitmap) {
        if (this.f12505n != bitmap) {
            this.f12505n = bitmap;
            if (bitmap != null) {
                a.a(bitmap, this.f12502k.width(), this.f12502k.height(), this.f12495d, this.f12503l);
            }
            invalidate();
        }
    }

    public void setBackgroundNoneColor(int i10) {
        if (i10 != this.f12492a.getColor()) {
            this.f12492a.setColor(i10);
            Bitmap bitmap = this.f12505n;
            if (bitmap == null || bitmap.isRecycled()) {
                invalidate();
            }
        }
    }

    public void setBackgroundScaleType(a.b bVar) {
        if (this.f12495d == bVar) {
            return;
        }
        this.f12495d = bVar;
        a.a(this.f12505n, this.f12502k.width(), this.f12502k.height(), this.f12495d, this.f12503l);
        invalidate();
    }

    public void setChecked(boolean z10) {
        if (this.f12499h == z10) {
            return;
        }
        this.f12499h = z10;
        invalidate();
    }

    public void setShape(e eVar) {
        if (this.f12494c.equals(eVar)) {
            return;
        }
        this.f12494c = eVar;
        requestLayout();
    }

    public void setStylePosition(a.EnumC0212a enumC0212a) {
        if (this.f12496e == enumC0212a) {
            return;
        }
        this.f12496e = enumC0212a;
        a.b(this.f12506o, this.f12507p, this.f12502k.width(), this.f12502k.height(), this.f12496e, this.f12504m);
        invalidate();
    }
}
