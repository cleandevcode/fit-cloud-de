package v2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* renamed from: g */
    public static final LinearInterpolator f28998g = new LinearInterpolator();

    /* renamed from: h */
    public static final c2.b f28999h = new c2.b();

    /* renamed from: i */
    public static final int[] f29000i = {-16777216};

    /* renamed from: a */
    public final a f29001a;

    /* renamed from: b */
    public float f29002b;

    /* renamed from: c */
    public Resources f29003c;

    /* renamed from: d */
    public ValueAnimator f29004d;

    /* renamed from: e */
    public float f29005e;

    /* renamed from: f */
    public boolean f29006f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final RectF f29007a = new RectF();

        /* renamed from: b */
        public final Paint f29008b;

        /* renamed from: c */
        public final Paint f29009c;

        /* renamed from: d */
        public final Paint f29010d;

        /* renamed from: e */
        public float f29011e;

        /* renamed from: f */
        public float f29012f;

        /* renamed from: g */
        public float f29013g;

        /* renamed from: h */
        public float f29014h;

        /* renamed from: i */
        public int[] f29015i;

        /* renamed from: j */
        public int f29016j;

        /* renamed from: k */
        public float f29017k;

        /* renamed from: l */
        public float f29018l;

        /* renamed from: m */
        public float f29019m;

        /* renamed from: n */
        public boolean f29020n;

        /* renamed from: o */
        public Path f29021o;

        /* renamed from: p */
        public float f29022p;

        /* renamed from: q */
        public float f29023q;

        /* renamed from: r */
        public int f29024r;

        /* renamed from: s */
        public int f29025s;

        /* renamed from: t */
        public int f29026t;

        /* renamed from: u */
        public int f29027u;

        public a() {
            Paint paint = new Paint();
            this.f29008b = paint;
            Paint paint2 = new Paint();
            this.f29009c = paint2;
            Paint paint3 = new Paint();
            this.f29010d = paint3;
            this.f29011e = 0.0f;
            this.f29012f = 0.0f;
            this.f29013g = 0.0f;
            this.f29014h = 5.0f;
            this.f29022p = 1.0f;
            this.f29026t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i10) {
            this.f29016j = i10;
            this.f29027u = this.f29015i[i10];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f29003c = context.getResources();
        a aVar = new a();
        this.f29001a = aVar;
        aVar.f29015i = f29000i;
        aVar.a(0);
        aVar.f29014h = 2.5f;
        aVar.f29008b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f28998g);
        ofFloat.addListener(new c(this, aVar));
        this.f29004d = ofFloat;
    }

    public static void d(float f10, a aVar) {
        int i10;
        if (f10 > 0.75f) {
            float f11 = (f10 - 0.75f) / 0.25f;
            int[] iArr = aVar.f29015i;
            int i11 = aVar.f29016j;
            int i12 = iArr[i11];
            int i13 = iArr[(i11 + 1) % iArr.length];
            int i14 = (i12 >> 24) & 255;
            int i15 = (i12 >> 16) & 255;
            int i16 = (i12 >> 8) & 255;
            int i17 = i12 & 255;
            i10 = ((i14 + ((int) ((((i13 >> 24) & 255) - i14) * f11))) << 24) | ((i15 + ((int) ((((i13 >> 16) & 255) - i15) * f11))) << 16) | ((i16 + ((int) ((((i13 >> 8) & 255) - i16) * f11))) << 8) | (i17 + ((int) (f11 * ((i13 & 255) - i17))));
        } else {
            i10 = aVar.f29015i[aVar.f29016j];
        }
        aVar.f29027u = i10;
    }

    public final void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f29006f) {
            d(f10, aVar);
            float floor = (float) (Math.floor(aVar.f29019m / 0.8f) + 1.0d);
            float f12 = aVar.f29017k;
            float f13 = aVar.f29018l;
            aVar.f29011e = (((f13 - 0.01f) - f12) * f10) + f12;
            aVar.f29012f = f13;
            float f14 = aVar.f29019m;
            aVar.f29013g = t0.e.a(floor, f14, f10, f14);
        } else if (f10 != 1.0f || z10) {
            float f15 = aVar.f29019m;
            if (f10 < 0.5f) {
                interpolation = aVar.f29017k;
                f11 = (f28999h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f16 = aVar.f29017k + 0.79f;
                interpolation = f16 - (((1.0f - f28999h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = f16;
            }
            aVar.f29011e = interpolation;
            aVar.f29012f = f11;
            aVar.f29013g = (0.20999998f * f10) + f15;
            this.f29002b = (f10 + this.f29005e) * 216.0f;
        }
    }

    public final void b(float f10) {
        this.f29001a.f29023q = f10;
        invalidateSelf();
    }

    public final void c(float f10, float f11, float f12, float f13) {
        a aVar = this.f29001a;
        float f14 = this.f29003c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        aVar.f29014h = f15;
        aVar.f29008b.setStrokeWidth(f15);
        aVar.f29023q = f10 * f14;
        aVar.a(0);
        aVar.f29024r = (int) (f12 * f14);
        aVar.f29025s = (int) (f13 * f14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f29002b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f29001a;
        RectF rectF = aVar.f29007a;
        float f10 = aVar.f29023q;
        float f11 = (aVar.f29014h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f29024r * aVar.f29022p) / 2.0f, aVar.f29014h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = aVar.f29011e;
        float f13 = aVar.f29013g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f29012f + f13) * 360.0f) - f14;
        aVar.f29008b.setColor(aVar.f29027u);
        aVar.f29008b.setAlpha(aVar.f29026t);
        float f16 = aVar.f29014h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f29010d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, aVar.f29008b);
        if (aVar.f29020n) {
            Path path = aVar.f29021o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f29021o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            aVar.f29021o.moveTo(0.0f, 0.0f);
            aVar.f29021o.lineTo(aVar.f29024r * aVar.f29022p, 0.0f);
            Path path3 = aVar.f29021o;
            float f18 = aVar.f29022p;
            path3.lineTo((aVar.f29024r * f18) / 2.0f, aVar.f29025s * f18);
            aVar.f29021o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((aVar.f29024r * aVar.f29022p) / 2.0f), (aVar.f29014h / 2.0f) + rectF.centerY());
            aVar.f29021o.close();
            aVar.f29009c.setColor(aVar.f29027u);
            aVar.f29009c.setAlpha(aVar.f29026t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f29021o, aVar.f29009c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f29001a.f29026t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f29004d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f29001a.f29026t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29001a.f29008b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator;
        long j10;
        this.f29004d.cancel();
        a aVar = this.f29001a;
        float f10 = aVar.f29011e;
        aVar.f29017k = f10;
        float f11 = aVar.f29012f;
        aVar.f29018l = f11;
        aVar.f29019m = aVar.f29013g;
        if (f11 != f10) {
            this.f29006f = true;
            valueAnimator = this.f29004d;
            j10 = 666;
        } else {
            aVar.a(0);
            a aVar2 = this.f29001a;
            aVar2.f29017k = 0.0f;
            aVar2.f29018l = 0.0f;
            aVar2.f29019m = 0.0f;
            aVar2.f29011e = 0.0f;
            aVar2.f29012f = 0.0f;
            aVar2.f29013g = 0.0f;
            valueAnimator = this.f29004d;
            j10 = 1332;
        }
        valueAnimator.setDuration(j10);
        this.f29004d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f29004d.cancel();
        this.f29002b = 0.0f;
        a aVar = this.f29001a;
        if (aVar.f29020n) {
            aVar.f29020n = false;
        }
        aVar.a(0);
        a aVar2 = this.f29001a;
        aVar2.f29017k = 0.0f;
        aVar2.f29018l = 0.0f;
        aVar2.f29019m = 0.0f;
        aVar2.f29011e = 0.0f;
        aVar2.f29012f = 0.0f;
        aVar2.f29013g = 0.0f;
        invalidateSelf();
    }
}
