package ga;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import ga.j;
import ga.l;
import java.util.BitSet;

/* loaded from: classes.dex */
public class f extends Drawable implements b1.j, m {

    /* renamed from: x */
    public static final String f15067x = f.class.getSimpleName();

    /* renamed from: y */
    public static final Paint f15068y;

    /* renamed from: a */
    public b f15069a;

    /* renamed from: b */
    public final l.f[] f15070b;

    /* renamed from: c */
    public final l.f[] f15071c;

    /* renamed from: d */
    public final BitSet f15072d;

    /* renamed from: e */
    public boolean f15073e;

    /* renamed from: f */
    public final Matrix f15074f;

    /* renamed from: g */
    public final Path f15075g;

    /* renamed from: h */
    public final Path f15076h;

    /* renamed from: i */
    public final RectF f15077i;

    /* renamed from: j */
    public final RectF f15078j;

    /* renamed from: k */
    public final Region f15079k;

    /* renamed from: l */
    public final Region f15080l;

    /* renamed from: m */
    public i f15081m;

    /* renamed from: n */
    public final Paint f15082n;

    /* renamed from: o */
    public final Paint f15083o;

    /* renamed from: p */
    public final fa.a f15084p;

    /* renamed from: q */
    public final a f15085q;

    /* renamed from: r */
    public final j f15086r;

    /* renamed from: s */
    public PorterDuffColorFilter f15087s;

    /* renamed from: t */
    public PorterDuffColorFilter f15088t;

    /* renamed from: u */
    public int f15089u;

    /* renamed from: v */
    public final RectF f15090v;

    /* renamed from: w */
    public boolean f15091w;

    /* loaded from: classes.dex */
    public class a {
        public a() {
            f.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a */
        public i f15093a;

        /* renamed from: b */
        public w9.a f15094b;

        /* renamed from: c */
        public ColorStateList f15095c;

        /* renamed from: d */
        public ColorStateList f15096d;

        /* renamed from: e */
        public ColorStateList f15097e;

        /* renamed from: f */
        public ColorStateList f15098f;

        /* renamed from: g */
        public PorterDuff.Mode f15099g;

        /* renamed from: h */
        public Rect f15100h;

        /* renamed from: i */
        public float f15101i;

        /* renamed from: j */
        public float f15102j;

        /* renamed from: k */
        public float f15103k;

        /* renamed from: l */
        public int f15104l;

        /* renamed from: m */
        public float f15105m;

        /* renamed from: n */
        public float f15106n;

        /* renamed from: o */
        public float f15107o;

        /* renamed from: p */
        public int f15108p;

        /* renamed from: q */
        public int f15109q;

        /* renamed from: r */
        public int f15110r;

        /* renamed from: s */
        public int f15111s;

        /* renamed from: t */
        public boolean f15112t;

        /* renamed from: u */
        public Paint.Style f15113u;

        public b(b bVar) {
            this.f15095c = null;
            this.f15096d = null;
            this.f15097e = null;
            this.f15098f = null;
            this.f15099g = PorterDuff.Mode.SRC_IN;
            this.f15100h = null;
            this.f15101i = 1.0f;
            this.f15102j = 1.0f;
            this.f15104l = 255;
            this.f15105m = 0.0f;
            this.f15106n = 0.0f;
            this.f15107o = 0.0f;
            this.f15108p = 0;
            this.f15109q = 0;
            this.f15110r = 0;
            this.f15111s = 0;
            this.f15112t = false;
            this.f15113u = Paint.Style.FILL_AND_STROKE;
            this.f15093a = bVar.f15093a;
            this.f15094b = bVar.f15094b;
            this.f15103k = bVar.f15103k;
            this.f15095c = bVar.f15095c;
            this.f15096d = bVar.f15096d;
            this.f15099g = bVar.f15099g;
            this.f15098f = bVar.f15098f;
            this.f15104l = bVar.f15104l;
            this.f15101i = bVar.f15101i;
            this.f15110r = bVar.f15110r;
            this.f15108p = bVar.f15108p;
            this.f15112t = bVar.f15112t;
            this.f15102j = bVar.f15102j;
            this.f15105m = bVar.f15105m;
            this.f15106n = bVar.f15106n;
            this.f15107o = bVar.f15107o;
            this.f15109q = bVar.f15109q;
            this.f15111s = bVar.f15111s;
            this.f15097e = bVar.f15097e;
            this.f15113u = bVar.f15113u;
            if (bVar.f15100h != null) {
                this.f15100h = new Rect(bVar.f15100h);
            }
        }

        public b(i iVar) {
            this.f15095c = null;
            this.f15096d = null;
            this.f15097e = null;
            this.f15098f = null;
            this.f15099g = PorterDuff.Mode.SRC_IN;
            this.f15100h = null;
            this.f15101i = 1.0f;
            this.f15102j = 1.0f;
            this.f15104l = 255;
            this.f15105m = 0.0f;
            this.f15106n = 0.0f;
            this.f15107o = 0.0f;
            this.f15108p = 0;
            this.f15109q = 0;
            this.f15110r = 0;
            this.f15111s = 0;
            this.f15112t = false;
            this.f15113u = Paint.Style.FILL_AND_STROKE;
            this.f15093a = iVar;
            this.f15094b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f15073e = true;
            return fVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f15068y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
            r3 = this;
            ga.a r0 = new ga.a
            r1 = 0
            float r2 = (float) r1
            r0.<init>(r2)
            int[] r2 = com.google.android.material.R.styleable.MaterialShape
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            int r6 = com.google.android.material.R.styleable.MaterialShape_shapeAppearance
            int r6 = r5.getResourceId(r6, r1)
            int r7 = com.google.android.material.R.styleable.MaterialShape_shapeAppearanceOverlay
            int r7 = r5.getResourceId(r7, r1)
            r5.recycle()
            ga.i$a r4 = ga.i.a(r4, r6, r7, r0)
            ga.i r5 = new ga.i
            r5.<init>(r4)
            r3.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.f.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.f15086r;
        b bVar = this.f15069a;
        jVar.a(bVar.f15093a, bVar.f15102j, rectF, this.f15085q, path);
        if (this.f15069a.f15101i != 1.0f) {
            this.f15074f.reset();
            Matrix matrix = this.f15074f;
            float f10 = this.f15069a.f15101i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f15074f);
        }
        path.computeBounds(this.f15090v, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            this.f15089u = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10) {
            int color = paint.getColor();
            int d10 = d(color);
            this.f15089u = d10;
            if (d10 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        b bVar = this.f15069a;
        float f10 = bVar.f15106n + bVar.f15107o + bVar.f15105m;
        w9.a aVar = bVar.f15094b;
        if (aVar != null) {
            return aVar.a(f10, i10);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x013e, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0234  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f15072d.cardinality() > 0) {
            Log.w(f15067x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f15069a.f15110r != 0) {
            canvas.drawPath(this.f15075g, this.f15084p.f14211a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f15070b[i10];
            fa.a aVar = this.f15084p;
            int i11 = this.f15069a.f15109q;
            Matrix matrix = l.f.f15178a;
            fVar.a(matrix, aVar, i11, canvas);
            this.f15071c[i10].a(matrix, this.f15084p, this.f15069a.f15109q, canvas);
        }
        if (this.f15091w) {
            b bVar = this.f15069a;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f15111s)) * bVar.f15110r);
            b bVar2 = this.f15069a;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f15111s)) * bVar2.f15110r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(this.f15075g, f15068y);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.c(rectF)) {
            float a10 = iVar.f15122f.a(rectF) * this.f15069a.f15102j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.f15083o;
        Path path = this.f15076h;
        i iVar = this.f15081m;
        this.f15078j.set(h());
        Paint.Style style = this.f15069a.f15113u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f15083o.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = this.f15083o.getStrokeWidth() / 2.0f;
        }
        this.f15078j.inset(f10, f10);
        f(canvas, paint, path, iVar, this.f15078j);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15069a.f15104l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f15069a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f15069a;
        if (bVar.f15108p == 2) {
            return;
        }
        if (bVar.f15093a.c(h())) {
            outline.setRoundRect(getBounds(), this.f15069a.f15093a.f15121e.a(h()) * this.f15069a.f15102j);
            return;
        }
        b(h(), this.f15075g);
        if (this.f15075g.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f15075g);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f15069a.f15100h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.f15079k.set(getBounds());
        b(h(), this.f15075g);
        this.f15080l.setPath(this.f15075g, this.f15079k);
        this.f15079k.op(this.f15080l, Region.Op.DIFFERENCE);
        return this.f15079k;
    }

    public final RectF h() {
        this.f15077i.set(getBounds());
        return this.f15077i;
    }

    public final void i(Context context) {
        this.f15069a.f15094b = new w9.a(context);
        q();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f15073e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f15069a.f15098f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f15069a.f15097e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f15069a.f15096d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f15069a.f15095c) != null && colorStateList4.isStateful())));
    }

    public final void j(float f10) {
        b bVar = this.f15069a;
        if (bVar.f15106n != f10) {
            bVar.f15106n = f10;
            q();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f15069a;
        if (bVar.f15095c != colorStateList) {
            bVar.f15095c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void l(float f10) {
        b bVar = this.f15069a;
        if (bVar.f15102j != f10) {
            bVar.f15102j = f10;
            this.f15073e = true;
            invalidateSelf();
        }
    }

    public final void m(Paint.Style style) {
        this.f15069a.f15113u = style;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f15069a = new b(this.f15069a);
        return this;
    }

    public final void n() {
        b bVar = this.f15069a;
        if (bVar.f15108p != 2) {
            bVar.f15108p = 2;
            super.invalidateSelf();
        }
    }

    public final boolean o(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f15069a.f15095c == null || color2 == (colorForState2 = this.f15069a.f15095c.getColorForState(iArr, (color2 = this.f15082n.getColor())))) {
            z10 = false;
        } else {
            this.f15082n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f15069a.f15096d == null || color == (colorForState = this.f15069a.f15096d.getColorForState(iArr, (color = this.f15083o.getColor())))) {
            return z10;
        }
        this.f15083o.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15073e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, z9.l.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = o(iArr) || p();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter = this.f15087s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f15088t;
        b bVar = this.f15069a;
        this.f15087s = c(bVar.f15098f, bVar.f15099g, this.f15082n, true);
        b bVar2 = this.f15069a;
        this.f15088t = c(bVar2.f15097e, bVar2.f15099g, this.f15083o, false);
        b bVar3 = this.f15069a;
        if (bVar3.f15112t) {
            this.f15084p.a(bVar3.f15098f.getColorForState(getState(), 0));
        }
        if (!j1.b.a(porterDuffColorFilter, this.f15087s) || !j1.b.a(porterDuffColorFilter2, this.f15088t)) {
            return true;
        }
        return false;
    }

    public final void q() {
        b bVar = this.f15069a;
        float f10 = bVar.f15106n + bVar.f15107o;
        bVar.f15109q = (int) Math.ceil(0.75f * f10);
        this.f15069a.f15110r = (int) Math.ceil(f10 * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f15069a;
        if (bVar.f15104l != i10) {
            bVar.f15104l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15069a.getClass();
        super.invalidateSelf();
    }

    @Override // ga.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f15069a.f15093a = iVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f15069a.f15098f = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f15069a;
        if (bVar.f15099g != mode) {
            bVar.f15099g = mode;
            p();
            super.invalidateSelf();
        }
    }

    public f(b bVar) {
        j jVar;
        this.f15070b = new l.f[4];
        this.f15071c = new l.f[4];
        this.f15072d = new BitSet(8);
        this.f15074f = new Matrix();
        this.f15075g = new Path();
        this.f15076h = new Path();
        this.f15077i = new RectF();
        this.f15078j = new RectF();
        this.f15079k = new Region();
        this.f15080l = new Region();
        Paint paint = new Paint(1);
        this.f15082n = paint;
        Paint paint2 = new Paint(1);
        this.f15083o = paint2;
        this.f15084p = new fa.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f15153a;
        } else {
            jVar = new j();
        }
        this.f15086r = jVar;
        this.f15090v = new RectF();
        this.f15091w = true;
        this.f15069a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.f15085q = new a();
    }
}
