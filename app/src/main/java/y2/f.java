package y2;

import a1.f;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import b1.a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends y2.e {

    /* renamed from: j */
    public static final PorterDuff.Mode f30856j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public g f30857b;

    /* renamed from: c */
    public PorterDuffColorFilter f30858c;

    /* renamed from: d */
    public ColorFilter f30859d;

    /* renamed from: e */
    public boolean f30860e;

    /* renamed from: f */
    public boolean f30861f;

    /* renamed from: g */
    public final float[] f30862g;

    /* renamed from: h */
    public final Matrix f30863h;

    /* renamed from: i */
    public final Rect f30864i;

    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e */
        public z0.c f30865e;

        /* renamed from: f */
        public float f30866f;

        /* renamed from: g */
        public z0.c f30867g;

        /* renamed from: h */
        public float f30868h;

        /* renamed from: i */
        public float f30869i;

        /* renamed from: j */
        public float f30870j;

        /* renamed from: k */
        public float f30871k;

        /* renamed from: l */
        public float f30872l;

        /* renamed from: m */
        public Paint.Cap f30873m;

        /* renamed from: n */
        public Paint.Join f30874n;

        /* renamed from: o */
        public float f30875o;

        public b() {
            this.f30866f = 0.0f;
            this.f30868h = 1.0f;
            this.f30869i = 1.0f;
            this.f30870j = 0.0f;
            this.f30871k = 1.0f;
            this.f30872l = 0.0f;
            this.f30873m = Paint.Cap.BUTT;
            this.f30874n = Paint.Join.MITER;
            this.f30875o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f30866f = 0.0f;
            this.f30868h = 1.0f;
            this.f30869i = 1.0f;
            this.f30870j = 0.0f;
            this.f30871k = 1.0f;
            this.f30872l = 0.0f;
            this.f30873m = Paint.Cap.BUTT;
            this.f30874n = Paint.Join.MITER;
            this.f30875o = 4.0f;
            this.f30865e = bVar.f30865e;
            this.f30866f = bVar.f30866f;
            this.f30868h = bVar.f30868h;
            this.f30867g = bVar.f30867g;
            this.f30890c = bVar.f30890c;
            this.f30869i = bVar.f30869i;
            this.f30870j = bVar.f30870j;
            this.f30871k = bVar.f30871k;
            this.f30872l = bVar.f30872l;
            this.f30873m = bVar.f30873m;
            this.f30874n = bVar.f30874n;
            this.f30875o = bVar.f30875o;
        }

        @Override // y2.f.d
        public final boolean a() {
            return this.f30867g.b() || this.f30865e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0025  */
        @Override // y2.f.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                z0.c r0 = r6.f30867g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f31841b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f31842c
                if (r1 == r4) goto L1c
                r0.f31842c = r1
                r0 = 1
                goto L1d
            L1c:
                r0 = 0
            L1d:
                z0.c r1 = r6.f30865e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f31841b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f31842c
                if (r7 == r4) goto L36
                r1.f31842c = r7
                goto L37
            L36:
                r2 = 0
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.f.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f30869i;
        }

        public int getFillColor() {
            return this.f30867g.f31842c;
        }

        public float getStrokeAlpha() {
            return this.f30868h;
        }

        public int getStrokeColor() {
            return this.f30865e.f31842c;
        }

        public float getStrokeWidth() {
            return this.f30866f;
        }

        public float getTrimPathEnd() {
            return this.f30871k;
        }

        public float getTrimPathOffset() {
            return this.f30872l;
        }

        public float getTrimPathStart() {
            return this.f30870j;
        }

        public void setFillAlpha(float f10) {
            this.f30869i = f10;
        }

        public void setFillColor(int i10) {
            this.f30867g.f31842c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f30868h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f30865e.f31842c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f30866f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f30871k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f30872l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f30870j = f10;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: y2.f$f */
    /* loaded from: classes.dex */
    public static class C0568f {

        /* renamed from: p */
        public static final Matrix f30892p = new Matrix();

        /* renamed from: a */
        public final Path f30893a;

        /* renamed from: b */
        public final Path f30894b;

        /* renamed from: c */
        public final Matrix f30895c;

        /* renamed from: d */
        public Paint f30896d;

        /* renamed from: e */
        public Paint f30897e;

        /* renamed from: f */
        public PathMeasure f30898f;

        /* renamed from: g */
        public final c f30899g;

        /* renamed from: h */
        public float f30900h;

        /* renamed from: i */
        public float f30901i;

        /* renamed from: j */
        public float f30902j;

        /* renamed from: k */
        public float f30903k;

        /* renamed from: l */
        public int f30904l;

        /* renamed from: m */
        public String f30905m;

        /* renamed from: n */
        public Boolean f30906n;

        /* renamed from: o */
        public final o0.b<String, Object> f30907o;

        public C0568f() {
            this.f30895c = new Matrix();
            this.f30900h = 0.0f;
            this.f30901i = 0.0f;
            this.f30902j = 0.0f;
            this.f30903k = 0.0f;
            this.f30904l = 255;
            this.f30905m = null;
            this.f30906n = null;
            this.f30907o = new o0.b<>();
            this.f30899g = new c();
            this.f30893a = new Path();
            this.f30894b = new Path();
        }

        public C0568f(C0568f c0568f) {
            this.f30895c = new Matrix();
            this.f30900h = 0.0f;
            this.f30901i = 0.0f;
            this.f30902j = 0.0f;
            this.f30903k = 0.0f;
            this.f30904l = 255;
            this.f30905m = null;
            this.f30906n = null;
            o0.b<String, Object> bVar = new o0.b<>();
            this.f30907o = bVar;
            this.f30899g = new c(c0568f.f30899g, bVar);
            this.f30893a = new Path(c0568f.f30893a);
            this.f30894b = new Path(c0568f.f30894b);
            this.f30900h = c0568f.f30900h;
            this.f30901i = c0568f.f30901i;
            this.f30902j = c0568f.f30902j;
            this.f30903k = c0568f.f30903k;
            this.f30904l = c0568f.f30904l;
            this.f30905m = c0568f.f30905m;
            String str = c0568f.f30905m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f30906n = c0568f.f30906n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v19 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            float f10;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f30876a.set(matrix);
            cVar.f30876a.preConcat(cVar.f30885j);
            canvas.save();
            ?? r92 = 0;
            C0568f c0568f = this;
            int i12 = 0;
            while (i12 < cVar.f30877b.size()) {
                d dVar = cVar.f30877b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.f30876a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f11 = i10 / c0568f.f30902j;
                    float f12 = i11 / c0568f.f30903k;
                    float min = Math.min(f11, f12);
                    Matrix matrix2 = cVar.f30876a;
                    c0568f.f30895c.set(matrix2);
                    c0568f.f30895c.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f13 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r92], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    if (max > 0.0f) {
                        f10 = Math.abs(f13) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        Path path = this.f30893a;
                        eVar.getClass();
                        path.reset();
                        f.a[] aVarArr = eVar.f30888a;
                        if (aVarArr != null) {
                            f.a.b(aVarArr, path);
                        }
                        Path path2 = this.f30893a;
                        this.f30894b.reset();
                        if (eVar instanceof a) {
                            Path path3 = this.f30894b;
                            if (eVar.f30890c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.f30894b.addPath(path2, this.f30895c);
                            canvas.clipPath(this.f30894b);
                        } else {
                            b bVar = (b) eVar;
                            float f14 = bVar.f30870j;
                            if (f14 != 0.0f || bVar.f30871k != 1.0f) {
                                float f15 = bVar.f30872l;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (bVar.f30871k + f15) % 1.0f;
                                if (this.f30898f == null) {
                                    this.f30898f = new PathMeasure();
                                }
                                this.f30898f.setPath(this.f30893a, r92);
                                float length = this.f30898f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path2.reset();
                                if (f18 > f19) {
                                    this.f30898f.getSegment(f18, length, path2, true);
                                    this.f30898f.getSegment(0.0f, f19, path2, true);
                                } else {
                                    this.f30898f.getSegment(f18, f19, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f30894b.addPath(path2, this.f30895c);
                            z0.c cVar2 = bVar.f30867g;
                            if (cVar2.f31840a != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && cVar2.f31842c == 0) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                if (this.f30897e == null) {
                                    Paint paint = new Paint(1);
                                    this.f30897e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f30897e;
                                Shader shader = cVar2.f31840a;
                                if (shader != null) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    shader.setLocalMatrix(this.f30895c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f30869i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i13 = cVar2.f31842c;
                                    float f20 = bVar.f30869i;
                                    PorterDuff.Mode mode = f.f30856j;
                                    paint2.setColor((i13 & 16777215) | (((int) (Color.alpha(i13) * f20)) << 24));
                                }
                                paint2.setColorFilter(null);
                                Path path4 = this.f30894b;
                                if (bVar.f30890c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas.drawPath(this.f30894b, paint2);
                            }
                            z0.c cVar3 = bVar.f30865e;
                            if (cVar3.f31840a != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12 && cVar3.f31842c == 0) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                if (this.f30896d == null) {
                                    z14 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f30896d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z14 = true;
                                }
                                Paint paint4 = this.f30896d;
                                Paint.Join join = bVar.f30874n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f30873m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f30875o);
                                Shader shader2 = cVar3.f31840a;
                                if (shader2 == null) {
                                    z14 = false;
                                }
                                if (z14) {
                                    shader2.setLocalMatrix(this.f30895c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f30868h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i14 = cVar3.f31842c;
                                    float f21 = bVar.f30868h;
                                    PorterDuff.Mode mode2 = f.f30856j;
                                    paint4.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f30866f * f10 * min);
                                canvas.drawPath(this.f30894b, paint4);
                            }
                        }
                    }
                    c0568f = this;
                    i12++;
                    r92 = 0;
                }
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f30904l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f30904l = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a */
        public int f30908a;

        /* renamed from: b */
        public C0568f f30909b;

        /* renamed from: c */
        public ColorStateList f30910c;

        /* renamed from: d */
        public PorterDuff.Mode f30911d;

        /* renamed from: e */
        public boolean f30912e;

        /* renamed from: f */
        public Bitmap f30913f;

        /* renamed from: g */
        public ColorStateList f30914g;

        /* renamed from: h */
        public PorterDuff.Mode f30915h;

        /* renamed from: i */
        public int f30916i;

        /* renamed from: j */
        public boolean f30917j;

        /* renamed from: k */
        public boolean f30918k;

        /* renamed from: l */
        public Paint f30919l;

        public g() {
            this.f30910c = null;
            this.f30911d = f.f30856j;
            this.f30909b = new C0568f();
        }

        public g(g gVar) {
            this.f30910c = null;
            this.f30911d = f.f30856j;
            if (gVar != null) {
                this.f30908a = gVar.f30908a;
                C0568f c0568f = new C0568f(gVar.f30909b);
                this.f30909b = c0568f;
                if (gVar.f30909b.f30897e != null) {
                    c0568f.f30897e = new Paint(gVar.f30909b.f30897e);
                }
                if (gVar.f30909b.f30896d != null) {
                    this.f30909b.f30896d = new Paint(gVar.f30909b.f30896d);
                }
                this.f30910c = gVar.f30910c;
                this.f30911d = gVar.f30911d;
                this.f30912e = gVar.f30912e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f30908a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f30920a;

        public h(Drawable.ConstantState constantState) {
            this.f30920a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f30920a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f30920a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f30855a = (VectorDrawable) this.f30920a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f30855a = (VectorDrawable) this.f30920a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f30855a = (VectorDrawable) this.f30920a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public f() {
        this.f30861f = true;
        this.f30862g = new float[9];
        this.f30863h = new Matrix();
        this.f30864i = new Rect();
        this.f30857b = new g();
    }

    public f(g gVar) {
        this.f30861f = true;
        this.f30862g = new float[9];
        this.f30863h = new Matrix();
        this.f30864i = new Rect();
        this.f30857b = gVar;
        this.f30858c = a(gVar.f30910c, gVar.f30911d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d7, code lost:
        if (r8 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.C0049a.a(drawable);
        }
        return this.f30857b.f30909b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f30857b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f30859d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f30855a == null || Build.VERSION.SDK_INT < 24) {
            this.f30857b.f30908a = getChangingConfigurations();
            return this.f30857b;
        }
        return new h(this.f30855a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f30857b.f30909b.f30901i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f30857b.f30909b.f30900h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d9  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return a.C0049a.d(drawable);
        }
        return this.f30857b.f30912e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f30857b;
            if (gVar != null) {
                C0568f c0568f = gVar.f30909b;
                if (c0568f.f30906n == null) {
                    c0568f.f30906n = Boolean.valueOf(c0568f.f30899g.a());
                }
                if (c0568f.f30906n.booleanValue() || ((colorStateList = this.f30857b.f30910c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f30860e && super.mutate() == this) {
            this.f30857b = new g(this.f30857b);
            this.f30860e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        g gVar = this.f30857b;
        ColorStateList colorStateList = gVar.f30910c;
        if (colorStateList != null && (mode = gVar.f30911d) != null) {
            this.f30858c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        C0568f c0568f = gVar.f30909b;
        if (c0568f.f30906n == null) {
            c0568f.f30906n = Boolean.valueOf(c0568f.f30899g.a());
        }
        if (c0568f.f30906n.booleanValue()) {
            boolean b10 = gVar.f30909b.f30899g.b(iArr);
            gVar.f30918k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f30857b.f30909b.getRootAlpha() != i10) {
            this.f30857b.f30909b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.C0049a.e(drawable, z10);
        } else {
            this.f30857b.f30912e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f30859d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            b1.a.d(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f30857b;
        if (gVar.f30910c != colorStateList) {
            gVar.f30910c = colorStateList;
            this.f30858c = a(colorStateList, gVar.f30911d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f30857b;
        if (gVar.f30911d != mode) {
            gVar.f30911d = mode;
            this.f30858c = a(gVar.f30910c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f30855a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f30855a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a */
        public final Matrix f30876a;

        /* renamed from: b */
        public final ArrayList<d> f30877b;

        /* renamed from: c */
        public float f30878c;

        /* renamed from: d */
        public float f30879d;

        /* renamed from: e */
        public float f30880e;

        /* renamed from: f */
        public float f30881f;

        /* renamed from: g */
        public float f30882g;

        /* renamed from: h */
        public float f30883h;

        /* renamed from: i */
        public float f30884i;

        /* renamed from: j */
        public final Matrix f30885j;

        /* renamed from: k */
        public int f30886k;

        /* renamed from: l */
        public String f30887l;

        public c() {
            this.f30876a = new Matrix();
            this.f30877b = new ArrayList<>();
            this.f30878c = 0.0f;
            this.f30879d = 0.0f;
            this.f30880e = 0.0f;
            this.f30881f = 1.0f;
            this.f30882g = 1.0f;
            this.f30883h = 0.0f;
            this.f30884i = 0.0f;
            this.f30885j = new Matrix();
            this.f30887l = null;
        }

        @Override // y2.f.d
        public final boolean a() {
            for (int i10 = 0; i10 < this.f30877b.size(); i10++) {
                if (this.f30877b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // y2.f.d
        public final boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f30877b.size(); i10++) {
                z10 |= this.f30877b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f30885j.reset();
            this.f30885j.postTranslate(-this.f30879d, -this.f30880e);
            this.f30885j.postScale(this.f30881f, this.f30882g);
            this.f30885j.postRotate(this.f30878c, 0.0f, 0.0f);
            this.f30885j.postTranslate(this.f30883h + this.f30879d, this.f30884i + this.f30880e);
        }

        public String getGroupName() {
            return this.f30887l;
        }

        public Matrix getLocalMatrix() {
            return this.f30885j;
        }

        public float getPivotX() {
            return this.f30879d;
        }

        public float getPivotY() {
            return this.f30880e;
        }

        public float getRotation() {
            return this.f30878c;
        }

        public float getScaleX() {
            return this.f30881f;
        }

        public float getScaleY() {
            return this.f30882g;
        }

        public float getTranslateX() {
            return this.f30883h;
        }

        public float getTranslateY() {
            return this.f30884i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f30879d) {
                this.f30879d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f30880e) {
                this.f30880e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f30878c) {
                this.f30878c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f30881f) {
                this.f30881f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f30882g) {
                this.f30882g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f30883h) {
                this.f30883h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f30884i) {
                this.f30884i = f10;
                c();
            }
        }

        public c(c cVar, o0.b<String, Object> bVar) {
            e aVar;
            this.f30876a = new Matrix();
            this.f30877b = new ArrayList<>();
            this.f30878c = 0.0f;
            this.f30879d = 0.0f;
            this.f30880e = 0.0f;
            this.f30881f = 1.0f;
            this.f30882g = 1.0f;
            this.f30883h = 0.0f;
            this.f30884i = 0.0f;
            Matrix matrix = new Matrix();
            this.f30885j = matrix;
            this.f30887l = null;
            this.f30878c = cVar.f30878c;
            this.f30879d = cVar.f30879d;
            this.f30880e = cVar.f30880e;
            this.f30881f = cVar.f30881f;
            this.f30882g = cVar.f30882g;
            this.f30883h = cVar.f30883h;
            this.f30884i = cVar.f30884i;
            String str = cVar.f30887l;
            this.f30887l = str;
            this.f30886k = cVar.f30886k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f30885j);
            ArrayList<d> arrayList = cVar.f30877b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f30877b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (!(dVar instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        aVar = new a((a) dVar);
                    }
                    this.f30877b.add(aVar);
                    String str2 = aVar.f30889b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a */
        public f.a[] f30888a;

        /* renamed from: b */
        public String f30889b;

        /* renamed from: c */
        public int f30890c;

        /* renamed from: d */
        public int f30891d;

        public e() {
            this.f30888a = null;
            this.f30890c = 0;
        }

        public f.a[] getPathData() {
            return this.f30888a;
        }

        public String getPathName() {
            return this.f30889b;
        }

        public void setPathData(f.a[] aVarArr) {
            if (!a1.f.a(this.f30888a, aVarArr)) {
                this.f30888a = a1.f.e(aVarArr);
                return;
            }
            f.a[] aVarArr2 = this.f30888a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f219a = aVarArr[i10].f219a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f220b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f220b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f30888a = null;
            this.f30890c = 0;
            this.f30889b = eVar.f30889b;
            this.f30891d = eVar.f30891d;
            this.f30888a = a1.f.e(eVar.f30888a);
        }
    }
}
