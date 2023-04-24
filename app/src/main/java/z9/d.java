package z9;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import da.a;
import i1.f;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class d {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public da.a E;
    public da.a F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a */
    public final View f32075a;

    /* renamed from: a0 */
    public ColorStateList f32076a0;

    /* renamed from: b */
    public boolean f32077b;

    /* renamed from: b0 */
    public float f32078b0;

    /* renamed from: c */
    public float f32079c;

    /* renamed from: c0 */
    public float f32080c0;

    /* renamed from: d */
    public boolean f32081d;

    /* renamed from: d0 */
    public float f32082d0;

    /* renamed from: e */
    public float f32083e;

    /* renamed from: e0 */
    public ColorStateList f32084e0;

    /* renamed from: f */
    public float f32085f;

    /* renamed from: f0 */
    public float f32086f0;

    /* renamed from: g */
    public int f32087g;

    /* renamed from: g0 */
    public float f32088g0;

    /* renamed from: h */
    public final Rect f32089h;

    /* renamed from: h0 */
    public float f32090h0;

    /* renamed from: i */
    public final Rect f32091i;

    /* renamed from: i0 */
    public StaticLayout f32092i0;

    /* renamed from: j */
    public final RectF f32093j;

    /* renamed from: j0 */
    public float f32094j0;

    /* renamed from: k0 */
    public float f32096k0;

    /* renamed from: l0 */
    public float f32098l0;

    /* renamed from: m0 */
    public CharSequence f32100m0;

    /* renamed from: o */
    public ColorStateList f32103o;

    /* renamed from: p */
    public ColorStateList f32105p;

    /* renamed from: q */
    public int f32107q;

    /* renamed from: r */
    public float f32109r;

    /* renamed from: s */
    public float f32110s;

    /* renamed from: t */
    public float f32111t;

    /* renamed from: u */
    public float f32112u;

    /* renamed from: v */
    public float f32113v;

    /* renamed from: w */
    public float f32114w;

    /* renamed from: x */
    public Typeface f32115x;

    /* renamed from: y */
    public Typeface f32116y;

    /* renamed from: z */
    public Typeface f32117z;

    /* renamed from: k */
    public int f32095k = 16;

    /* renamed from: l */
    public int f32097l = 16;

    /* renamed from: m */
    public float f32099m = 15.0f;

    /* renamed from: n */
    public float f32101n = 15.0f;
    public boolean J = true;

    /* renamed from: n0 */
    public int f32102n0 = 1;

    /* renamed from: o0 */
    public float f32104o0 = 0.0f;

    /* renamed from: p0 */
    public float f32106p0 = 1.0f;

    /* renamed from: q0 */
    public int f32108q0 = k.f32136m;

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0219a {
        public a() {
            d.this = r1;
        }

        @Override // da.a.InterfaceC0219a
        public final void a(Typeface typeface) {
            d dVar = d.this;
            if (dVar.n(typeface)) {
                dVar.j(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0219a {
        public b() {
            d.this = r1;
        }

        @Override // da.a.InterfaceC0219a
        public final void a(Typeface typeface) {
            d dVar = d.this;
            if (dVar.p(typeface)) {
                dVar.j(false);
            }
        }
    }

    public d(View view) {
        this.f32075a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f32091i = new Rect();
        this.f32089h = new Rect();
        this.f32093j = new RectF();
        float f10 = this.f32083e;
        this.f32085f = t0.e.a(1.0f, f10, 0.5f, f10);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float g(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = h9.a.f16043a;
        return t0.e.a(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        f.d dVar;
        View view = this.f32075a;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        boolean z10 = true;
        if (o0.e.d(view) != 1) {
            z10 = false;
        }
        if (this.J) {
            if (z10) {
                dVar = i1.f.f16216d;
            } else {
                dVar = i1.f.f16215c;
            }
            return dVar.b(charSequence, charSequence.length());
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0109, code lost:
        if (r12.I != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.d.c(float, boolean):void");
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null && this.f32077b) {
            this.T.setTextSize(this.M);
            float f10 = this.f32113v;
            float f11 = this.f32114w;
            float f12 = this.L;
            if (f12 != 1.0f && !this.f32081d) {
                canvas.scale(f12, f12, f10, f11);
            }
            boolean z10 = true;
            if (this.f32102n0 <= 1 || (this.I && !this.f32081d)) {
                z10 = false;
            }
            if (z10 && (!this.f32081d || this.f32079c > this.f32085f)) {
                float lineStart = this.f32113v - this.f32092i0.getLineStart(0);
                int alpha = this.T.getAlpha();
                canvas.translate(lineStart, f11);
                float f13 = alpha;
                this.T.setAlpha((int) (this.f32098l0 * f13));
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    TextPaint textPaint = this.T;
                    float f14 = this.N;
                    float f15 = this.O;
                    float f16 = this.P;
                    int i11 = this.Q;
                    textPaint.setShadowLayer(f14, f15, f16, a1.a.d(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                }
                this.f32092i0.draw(canvas);
                this.T.setAlpha((int) (this.f32096k0 * f13));
                if (i10 >= 31) {
                    TextPaint textPaint2 = this.T;
                    float f17 = this.N;
                    float f18 = this.O;
                    float f19 = this.P;
                    int i12 = this.Q;
                    textPaint2.setShadowLayer(f17, f18, f19, a1.a.d(i12, (Color.alpha(i12) * textPaint2.getAlpha()) / 255));
                }
                int lineBaseline = this.f32092i0.getLineBaseline(0);
                CharSequence charSequence = this.f32100m0;
                float f20 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, this.T);
                if (i10 >= 31) {
                    this.T.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f32081d) {
                    String trim = this.f32100m0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.T.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f32092i0.getLineEnd(0), str.length()), 0.0f, f20, (Paint) this.T);
                }
            } else {
                canvas.translate(f10, f11);
                this.f32092i0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f32101n);
        textPaint.setTypeface(this.f32115x);
        textPaint.setLetterSpacing(this.f32086f0);
        return -this.U.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f32117z;
            if (typeface != null) {
                this.f32116y = da.g.a(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = da.g.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f32116y;
            if (typeface3 == null) {
                typeface3 = this.f32117z;
            }
            this.f32115x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            j(true);
        }
    }

    public final void i() {
        this.f32077b = this.f32091i.width() > 0 && this.f32091i.height() > 0 && this.f32089h.width() > 0 && this.f32089h.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(boolean r13) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.d.j(boolean):void");
    }

    public final void k(int i10) {
        da.e eVar = new da.e(this.f32075a.getContext(), i10);
        ColorStateList colorStateList = eVar.f12934j;
        if (colorStateList != null) {
            this.f32105p = colorStateList;
        }
        float f10 = eVar.f12935k;
        if (f10 != 0.0f) {
            this.f32101n = f10;
        }
        ColorStateList colorStateList2 = eVar.f12925a;
        if (colorStateList2 != null) {
            this.f32076a0 = colorStateList2;
        }
        this.Y = eVar.f12929e;
        this.Z = eVar.f12930f;
        this.X = eVar.f12931g;
        this.f32086f0 = eVar.f12933i;
        da.a aVar = this.F;
        if (aVar != null) {
            aVar.f12924c = true;
        }
        a aVar2 = new a();
        eVar.a();
        this.F = new da.a(aVar2, eVar.f12938n);
        eVar.c(this.f32075a.getContext(), this.F);
        j(false);
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f32105p != colorStateList) {
            this.f32105p = colorStateList;
            j(false);
        }
    }

    public final void m(int i10) {
        if (this.f32097l != i10) {
            this.f32097l = i10;
            j(false);
        }
    }

    public final boolean n(Typeface typeface) {
        da.a aVar = this.F;
        if (aVar != null) {
            aVar.f12924c = true;
        }
        if (this.f32117z != typeface) {
            this.f32117z = typeface;
            Typeface a10 = da.g.a(this.f32075a.getContext().getResources().getConfiguration(), typeface);
            this.f32116y = a10;
            if (a10 == null) {
                a10 = this.f32117z;
            }
            this.f32115x = a10;
            return true;
        }
        return false;
    }

    public final void o(int i10) {
        da.e eVar = new da.e(this.f32075a.getContext(), i10);
        ColorStateList colorStateList = eVar.f12934j;
        if (colorStateList != null) {
            this.f32103o = colorStateList;
        }
        float f10 = eVar.f12935k;
        if (f10 != 0.0f) {
            this.f32099m = f10;
        }
        ColorStateList colorStateList2 = eVar.f12925a;
        if (colorStateList2 != null) {
            this.f32084e0 = colorStateList2;
        }
        this.f32080c0 = eVar.f12929e;
        this.f32082d0 = eVar.f12930f;
        this.f32078b0 = eVar.f12931g;
        this.f32088g0 = eVar.f12933i;
        da.a aVar = this.E;
        if (aVar != null) {
            aVar.f12924c = true;
        }
        b bVar = new b();
        eVar.a();
        this.E = new da.a(bVar, eVar.f12938n);
        eVar.c(this.f32075a.getContext(), this.E);
        j(false);
    }

    public final boolean p(Typeface typeface) {
        da.a aVar = this.E;
        if (aVar != null) {
            aVar.f12924c = true;
        }
        if (this.C != typeface) {
            this.C = typeface;
            Typeface a10 = da.g.a(this.f32075a.getContext().getResources().getConfiguration(), typeface);
            this.B = a10;
            if (a10 == null) {
                a10 = this.C;
            }
            this.A = a10;
            return true;
        }
        return false;
    }

    public final void q(float f10) {
        float f11;
        float a10;
        Rect rect;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f32079c) {
            this.f32079c = f10;
            if (this.f32081d) {
                RectF rectF = this.f32093j;
                if (f10 < this.f32085f) {
                    rect = this.f32089h;
                } else {
                    rect = this.f32091i;
                }
                rectF.set(rect);
            } else {
                this.f32093j.left = g(this.f32089h.left, this.f32091i.left, f10, this.V);
                this.f32093j.top = g(this.f32109r, this.f32110s, f10, this.V);
                this.f32093j.right = g(this.f32089h.right, this.f32091i.right, f10, this.V);
                this.f32093j.bottom = g(this.f32089h.bottom, this.f32091i.bottom, f10, this.V);
            }
            if (this.f32081d) {
                if (f10 < this.f32085f) {
                    this.f32113v = this.f32111t;
                    this.f32114w = this.f32109r;
                    r(0.0f);
                    f11 = 0.0f;
                } else {
                    this.f32113v = this.f32112u;
                    this.f32114w = this.f32110s - Math.max(0, this.f32087g);
                    r(1.0f);
                    f11 = 1.0f;
                }
            } else {
                this.f32113v = g(this.f32111t, this.f32112u, f10, this.V);
                this.f32114w = g(this.f32109r, this.f32110s, f10, this.V);
                r(f10);
                f11 = f10;
            }
            c2.b bVar = h9.a.f16044b;
            this.f32096k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f10, bVar);
            View view = this.f32075a;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(view);
            this.f32098l0 = g(1.0f, 0.0f, f10, bVar);
            o0.d.k(this.f32075a);
            ColorStateList colorStateList = this.f32105p;
            ColorStateList colorStateList2 = this.f32103o;
            if (colorStateList != colorStateList2) {
                this.T.setColor(a(f11, f(colorStateList2), f(this.f32105p)));
            } else {
                this.T.setColor(f(colorStateList));
            }
            float f12 = this.f32086f0;
            float f13 = this.f32088g0;
            if (f12 != f13) {
                this.T.setLetterSpacing(g(f13, f12, f10, bVar));
            } else {
                this.T.setLetterSpacing(f12);
            }
            this.N = g(this.f32078b0, this.X, f10, null);
            this.O = g(this.f32080c0, this.Y, f10, null);
            this.P = g(this.f32082d0, this.Z, f10, null);
            int a11 = a(f10, f(this.f32084e0), f(this.f32076a0));
            this.Q = a11;
            this.T.setShadowLayer(this.N, this.O, this.P, a11);
            if (this.f32081d) {
                int alpha = this.T.getAlpha();
                float f14 = this.f32085f;
                if (f10 <= f14) {
                    a10 = h9.a.a(1.0f, 0.0f, this.f32083e, f14, f10);
                } else {
                    a10 = h9.a.a(0.0f, 1.0f, f14, 1.0f, f10);
                }
                this.T.setAlpha((int) (a10 * alpha));
            }
            o0.d.k(this.f32075a);
        }
    }

    public final void r(float f10) {
        c(f10, false);
        View view = this.f32075a;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.k(view);
    }

    public final boolean s(int[] iArr) {
        ColorStateList colorStateList;
        boolean z10;
        this.R = iArr;
        ColorStateList colorStateList2 = this.f32105p;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f32103o) != null && colorStateList.isStateful())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        j(false);
        return true;
    }
}
