package com.topstep.fitcloud.pro.ui.sport.detail;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.List;

/* loaded from: classes2.dex */
public class HeartRateLineChart extends View {

    /* renamed from: a */
    public int f12200a;

    /* renamed from: b */
    public int f12201b;

    /* renamed from: c */
    public boolean f12202c;

    /* renamed from: d */
    public int f12203d;

    /* renamed from: e */
    public int f12204e;

    /* renamed from: f */
    public Paint f12205f;

    /* renamed from: g */
    public Paint f12206g;

    /* renamed from: h */
    public RectF f12207h;

    /* renamed from: i */
    public float f12208i;

    /* renamed from: j */
    public float f12209j;

    /* renamed from: k */
    public float f12210k;

    /* renamed from: l */
    public DashPathEffect f12211l;

    /* renamed from: m */
    public Path f12212m;

    /* renamed from: n */
    public PorterDuffXfermode f12213n;

    /* renamed from: o */
    public LinearGradient f12214o;

    /* renamed from: p */
    public int f12215p;

    /* renamed from: q */
    public List<SportHeartRate> f12216q;

    public HeartRateLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12200a = 3600;
        this.f12201b = 600;
        this.f12202c = false;
        this.f12203d = 250;
        this.f12204e = 50;
        this.f12215p = 25;
        Context context2 = getContext();
        l.f(context2, "context");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{16842808});
        l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(5);
        this.f12205f = paint;
        paint.setTextSize(g7.a.a(getContext(), 14.0f));
        this.f12205f.setColor(color);
        Paint paint2 = new Paint(5);
        this.f12206g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f12206g.setColor(color);
        this.f12207h = new RectF();
        this.f12208i = g7.a.a(getContext(), 1.5f);
        this.f12209j = g7.a.a(getContext(), 1.0f);
        this.f12210k = g7.a.a(getContext(), 2.5f);
        this.f12211l = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        this.f12212m = new Path();
        this.f12213n = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f10;
        Resources resources;
        int i11;
        int i12;
        super.onDraw(canvas);
        float measureText = this.f12205f.measureText(String.valueOf(this.f12203d));
        float a10 = g7.a.a(getContext(), 3.5f);
        Paint.FontMetrics fontMetrics = this.f12205f.getFontMetrics();
        float f11 = fontMetrics.descent - fontMetrics.ascent;
        RectF rectF = this.f12207h;
        rectF.left = measureText + a10;
        int i13 = this.f12203d;
        if ((i13 + 0) / i10 == (i13 - 0) / this.f12204e) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = f11 + a10;
        if (z10) {
            f10 = f11 / 2.0f;
        } else {
            f10 = 0.0f;
        }
        rectF.top = f12 + f10;
        rectF.bottom = (getHeight() - f11) - a10;
        if (this.f12202c) {
            resources = getContext().getResources();
            i11 = R.string.unit_hour;
        } else {
            resources = getContext().getResources();
            i11 = R.string.unit_minute;
        }
        String string = resources.getString(i11);
        this.f12207h.right = (getWidth() - this.f12205f.measureText(string)) - ((this.f12205f.measureText("60") / 2.0f) + a10);
        canvas.drawText(getContext().getResources().getString(R.string.unit_frequency_per_minute), 0.0f, -fontMetrics.ascent, this.f12205f);
        int i14 = 0;
        while (i14 <= this.f12203d) {
            String valueOf = String.valueOf(i14);
            RectF rectF2 = this.f12207h;
            float height = rectF2.bottom - (((i14 + 0) / (this.f12203d + 0)) * rectF2.height());
            canvas.drawText(valueOf, measureText - this.f12205f.measureText(valueOf), (height - fontMetrics.ascent) - (f11 / 2.0f), this.f12205f);
            Paint paint = this.f12206g;
            if (i14 == 0) {
                paint.setStrokeWidth(this.f12208i);
                this.f12206g.setPathEffect(null);
            } else {
                paint.setStrokeWidth(this.f12209j);
                this.f12206g.setPathEffect(this.f12211l);
            }
            this.f12212m.reset();
            this.f12212m.moveTo(this.f12207h.left, height - (this.f12206g.getStrokeWidth() / 2.0f));
            this.f12212m.lineTo(this.f12207h.right, height - (this.f12206g.getStrokeWidth() / 2.0f));
            canvas.drawPath(this.f12212m, this.f12206g);
            i14 += this.f12204e;
        }
        float f13 = (this.f12207h.bottom + a10) - fontMetrics.ascent;
        canvas.drawText(string, getWidth() - this.f12205f.measureText(string), f13, this.f12205f);
        int i15 = 0;
        while (i15 <= this.f12200a) {
            if (i15 != 0) {
                if (this.f12202c) {
                    i12 = i15 / 3600;
                } else {
                    i12 = i15 / 60;
                }
                String valueOf2 = String.valueOf(i12);
                RectF rectF3 = this.f12207h;
                canvas.drawText(valueOf2, ((((i15 + 0) / (this.f12200a + 0)) * rectF3.width()) + rectF3.left) - (this.f12205f.measureText(valueOf2) / 2.0f), f13, this.f12205f);
            }
            i15 += this.f12201b;
        }
        List<SportHeartRate> list = this.f12216q;
        if (list != null && list.size() > 0) {
            this.f12206g.setStrokeWidth(this.f12210k);
            this.f12206g.setPathEffect(null);
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            this.f12206g.setAlpha(255);
            this.f12212m.reset();
            boolean z11 = false;
            for (int i16 = 0; i16 < this.f12216q.size(); i16++) {
                if (this.f12216q.get(i16).f9615b > 0) {
                    int i17 = this.f12216q.get(i16).f9614a;
                    RectF rectF4 = this.f12207h;
                    float width = (((i17 + 0) / (this.f12200a + 0)) * rectF4.width()) + rectF4.left;
                    int i18 = this.f12216q.get(i16).f9615b;
                    RectF rectF5 = this.f12207h;
                    float height2 = rectF5.bottom - (((i18 + 0) / (this.f12203d + 0)) * rectF5.height());
                    if (!z11) {
                        this.f12212m.moveTo(width, height2);
                        z11 = true;
                    } else {
                        this.f12212m.lineTo(width, height2);
                    }
                }
            }
            canvas.drawPath(this.f12212m, this.f12206g);
            this.f12206g.setStyle(Paint.Style.FILL);
            this.f12206g.setXfermode(this.f12213n);
            if (this.f12214o == null) {
                int[] iArr = {getContext().getResources().getColor(R.color.sport_heart_rate_maximal), getContext().getResources().getColor(R.color.sport_heart_rate_maximal), getContext().getResources().getColor(R.color.sport_heart_rate_anaerobic), getContext().getResources().getColor(R.color.sport_heart_rate_aerobic), getContext().getResources().getColor(R.color.sport_heart_rate_hiit), getContext().getResources().getColor(R.color.sport_heart_rate_warm_up)};
                float f14 = 220 - this.f12215p;
                float f15 = this.f12203d;
                this.f12214o = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), iArr, new float[]{0.0f, 1.0f - ((0.9f * f14) / f15), 1.0f - ((0.8f * f14) / f15), 1.0f - ((0.7f * f14) / f15), 1.0f - ((f14 * 0.6f) / f15), 1.0f}, Shader.TileMode.CLAMP);
            }
            this.f12206g.setShader(this.f12214o);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f12206g);
            canvas.restoreToCount(saveLayer);
            this.f12206g.setStyle(Paint.Style.STROKE);
            this.f12206g.setXfermode(null);
            this.f12206g.setShader(null);
        }
    }

    public void setAge(int i10) {
        this.f12215p = i10;
        this.f12214o = null;
    }

    public void setDatas(List<SportHeartRate> list) {
        this.f12216q = list;
        invalidate();
    }

    public void setXAxis(int i10) {
        int i11;
        this.f12200a = i10;
        int ceil = (int) Math.ceil(i10 / 60.0f);
        if (ceil < 5) {
            i11 = 60;
        } else if (ceil <= 30) {
            i11 = 300;
        } else if (ceil > 120) {
            this.f12201b = 3600;
            this.f12202c = true;
            invalidate();
        } else {
            i11 = 600;
        }
        this.f12201b = i11;
        this.f12202c = false;
        invalidate();
    }
}
