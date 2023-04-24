package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import bi.m0;
import com.topstep.fitcloud.pro.R;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import g7.a;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class EcgReportView extends View {

    /* renamed from: a */
    public long f12285a;

    /* renamed from: b */
    public int[] f12286b;

    /* renamed from: c */
    public float f12287c;

    /* renamed from: d */
    public int f12288d;

    /* renamed from: e */
    public float f12289e;

    /* renamed from: f */
    public boolean f12290f;

    /* renamed from: g */
    public int f12291g;

    /* renamed from: h */
    public float f12292h;

    /* renamed from: i */
    public int f12293i;

    /* renamed from: j */
    public int f12294j;

    /* renamed from: k */
    public int f12295k;

    /* renamed from: l */
    public int f12296l;

    /* renamed from: m */
    public float f12297m;

    /* renamed from: n */
    public float f12298n;

    /* renamed from: o */
    public float f12299o;

    /* renamed from: p */
    public float f12300p;

    /* renamed from: q */
    public float f12301q;

    /* renamed from: r */
    public Paint f12302r;

    /* renamed from: s */
    public Paint f12303s;

    /* renamed from: t */
    public Paint f12304t;

    /* renamed from: u */
    public Path f12305u;

    /* renamed from: v */
    public float f12306v;

    /* renamed from: w */
    public SimpleDateFormat f12307w;

    /* renamed from: x */
    public DisplayMetrics f12308x;

    public EcgReportView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12297m = 0.07152582f;
        this.f12298n = 3.0f;
        this.f12307w = m0.n();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12308x = displayMetrics;
        this.f12288d = -3355444;
        float f10 = displayMetrics.density;
        float f11 = 1.0f * f10;
        this.f12289e = f11;
        this.f12290f = true;
        this.f12291g = -3355444;
        this.f12292h = f11 * 1.5f;
        this.f12293i = 5;
        float f12 = f10 * 2.0f;
        this.f12294j = 100;
        this.f12295k = 25;
        this.f12296l = 10;
        int i10 = 40;
        int i11 = -65536;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EcgReportView, 0, 0);
            i10 = obtainStyledAttributes.getInt(11, 40);
            this.f12288d = obtainStyledAttributes.getColor(9, this.f12288d);
            this.f12289e = obtainStyledAttributes.getDimension(10, this.f12289e);
            this.f12290f = obtainStyledAttributes.getBoolean(6, this.f12290f);
            this.f12291g = obtainStyledAttributes.getColor(5, this.f12288d);
            this.f12292h = obtainStyledAttributes.getDimension(8, this.f12289e * 1.5f);
            this.f12293i = obtainStyledAttributes.getInt(7, this.f12293i);
            i11 = obtainStyledAttributes.getColor(1, -65536);
            f12 = obtainStyledAttributes.getDimension(2, f12);
            this.f12294j = obtainStyledAttributes.getInt(3, this.f12294j);
            this.f12295k = obtainStyledAttributes.getInt(4, this.f12295k);
            this.f12296l = obtainStyledAttributes.getInt(0, this.f12296l);
            obtainStyledAttributes.recycle();
        }
        this.f12299o = a.b(getContext());
        float c10 = a.c(getContext());
        this.f12300p = c10;
        this.f12287c = i10 * c10;
        this.f12301q = this.f12299o / ((1000.0f / this.f12295k) / (1000.0f / this.f12294j));
        this.f12305u = new Path();
        Paint paint = new Paint(5);
        this.f12304t = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f12304t.setColor(i11);
        this.f12304t.setStrokeWidth(f12);
        this.f12304t.setPathEffect(new CornerPathEffect(200.0f));
        this.f12302r = new Paint(5);
        this.f12306v = this.f12308x.density * 12.0f;
        this.f12303s = new Paint(5);
    }

    private void setAmplitude(int i10) {
        if (this.f12296l != i10) {
            this.f12296l = i10;
        }
    }

    private void setSampleRate(int i10) {
        if (i10 <= 0) {
            i10 = 100;
        }
        if (this.f12294j != i10) {
            this.f12294j = i10;
            this.f12301q = this.f12299o / ((1000.0f / this.f12295k) / (1000.0f / i10));
        }
    }

    private void setSpeed(int i10) {
        if (i10 != this.f12295k) {
            this.f12295k = i10;
            this.f12301q = this.f12299o / ((1000.0f / i10) / (1000.0f / this.f12294j));
        }
    }

    public final float a(int i10) {
        int i11 = this.f12296l;
        return this.f12287c - (((((i10 * this.f12297m) / 1000.0f) * i11) - ((this.f12298n * i11) / 10.0f)) * this.f12300p);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        boolean z10;
        Paint paint;
        float f10;
        boolean z11;
        Paint paint2;
        float f11;
        super.onDraw(canvas);
        if (this.f12286b != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int i10 = paddingLeft + width;
            int height2 = paddingTop + ((getHeight() - getPaddingTop()) - getPaddingBottom());
            int ceil = ((int) Math.ceil(height / this.f12300p)) + 1;
            for (int i11 = 0; i11 < ceil; i11++) {
                if (this.f12290f && i11 % this.f12293i == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f12303s.setColor(this.f12291g);
                    paint2 = this.f12303s;
                    f11 = this.f12292h;
                } else {
                    this.f12303s.setColor(this.f12288d);
                    paint2 = this.f12303s;
                    f11 = this.f12289e;
                }
                paint2.setStrokeWidth(f11);
                float f12 = (i11 * this.f12300p) + 0.0f + paddingTop;
                canvas.drawLine(paddingLeft, f12, i10, f12, this.f12303s);
            }
            int ceil2 = ((int) Math.ceil(width / this.f12299o)) + 1;
            for (int i12 = 0; i12 < ceil2; i12++) {
                if (this.f12290f && i12 % this.f12293i == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f12303s.setColor(this.f12291g);
                    paint = this.f12303s;
                    f10 = this.f12292h;
                } else {
                    this.f12303s.setColor(this.f12288d);
                    paint = this.f12303s;
                    f10 = this.f12289e;
                }
                paint.setStrokeWidth(f10);
                float f13 = (i12 * this.f12299o) + 0.0f + paddingLeft;
                canvas.drawLine(f13, paddingTop, f13, height2, this.f12303s);
            }
        }
        int[] iArr = this.f12286b;
        if (iArr != null && iArr.length > 0) {
            int width2 = ((int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) / this.f12301q)) + 1;
            int ceil3 = (int) Math.ceil(this.f12286b.length / width2);
            int paddingLeft2 = getPaddingLeft();
            for (int i13 = 0; i13 < ceil3; i13++) {
                this.f12305u.reset();
                int i14 = width2 * i13;
                float f14 = paddingLeft2;
                float f15 = i13;
                this.f12305u.moveTo(f14, (this.f12287c * f15) + a(this.f12286b[i14]));
                for (int i15 = 1; i15 < width2; i15++) {
                    int i16 = i14 + i15;
                    int[] iArr2 = this.f12286b;
                    if (i16 >= iArr2.length) {
                        break;
                    }
                    this.f12305u.lineTo((this.f12301q * i15) + f14, (this.f12287c * f15) + a(iArr2[i16]));
                }
                canvas.drawPath(this.f12305u, this.f12304t);
            }
        }
        if (this.f12285a != 0) {
            String string = getResources().getString(com.topstep.fitcloudpro.R.string.ecg_report_speed_amplitude_test_time, Integer.valueOf(this.f12295k), Integer.valueOf(this.f12296l), this.f12307w.format(new Date(this.f12285a)));
            this.f12302r.setTextSize(this.f12306v);
            this.f12302r.setColor(-16777216);
            float measureText = this.f12302r.measureText(string);
            Paint.FontMetrics fontMetrics = this.f12302r.getFontMetrics();
            float f16 = fontMetrics.descent;
            float f17 = fontMetrics.ascent;
            float f18 = f16 - f17;
            float f19 = -f17;
            float f20 = this.f12308x.density * 4.0f;
            if (getLayoutDirection() == 0) {
                canvas.drawText(string, (getWidth() - f20) - measureText, (getHeight() - f20) - (f18 - f19), this.f12302r);
            } else {
                canvas.drawText(string, f20, (getHeight() - f20) - (f18 - f19), this.f12302r);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int[] iArr = this.f12286b;
        int ceil = (iArr == null || iArr.length <= 0) ? 0 : (int) Math.ceil(this.f12286b.length / (((int) (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / this.f12301q)) + 1));
        this.f12302r.setTextSize(this.f12306v);
        this.f12302r.setColor(-16777216);
        Paint.FontMetrics fontMetrics = this.f12302r.getFontMetrics();
        setMeasuredDimension(getMeasuredWidth(), (int) Math.max(View.MeasureSpec.getSize(i11), (ceil * this.f12287c) + (fontMetrics.descent - fontMetrics.ascent) + getPaddingTop() + getPaddingBottom()));
    }

    public void setData(EcgRecord ecgRecord) {
        this.f12285a = ecgRecord.getTime().getTime();
        this.f12286b = ecgRecord.getIntArrays();
        setSampleRate(ecgRecord.getSampleBase());
        ecgRecord.getType();
        this.f12297m = 0.07152582f;
        this.f12298n = 3.0f;
        setSpeed(25);
        setAmplitude(10);
        requestLayout();
    }
}
