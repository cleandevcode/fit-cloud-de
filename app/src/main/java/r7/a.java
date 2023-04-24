package r7;

import a8.e;
import a8.f;
import a8.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;
import s.c0;
import s7.j;
import t7.d;
import t7.k;
import x7.h;
import z7.i;

@SuppressLint({"RtlHardcoded"})
/* loaded from: classes.dex */
public abstract class a<T extends d<? extends x7.b<? extends k>>> extends b<T> implements w7.b {
    public int E;
    public boolean F;
    public boolean H;
    public boolean L;
    public boolean M;
    public boolean Q;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: c0 */
    public Paint f25400c0;

    /* renamed from: d0 */
    public Paint f25401d0;

    /* renamed from: e0 */
    public boolean f25402e0;

    /* renamed from: f0 */
    public boolean f25403f0;

    /* renamed from: g0 */
    public boolean f25404g0;

    /* renamed from: h0 */
    public float f25405h0;

    /* renamed from: i0 */
    public boolean f25406i0;

    /* renamed from: j0 */
    public j f25407j0;

    /* renamed from: k0 */
    public j f25408k0;

    /* renamed from: l0 */
    public z7.j f25409l0;

    /* renamed from: m0 */
    public z7.j f25410m0;

    /* renamed from: n0 */
    public e f25411n0;

    /* renamed from: o0 */
    public e f25412o0;

    /* renamed from: p0 */
    public i f25413p0;

    /* renamed from: q0 */
    public long f25414q0;

    /* renamed from: r0 */
    public long f25415r0;

    /* renamed from: s0 */
    public RectF f25416s0;

    /* renamed from: t0 */
    public Matrix f25417t0;

    /* renamed from: u0 */
    public a8.b f25418u0;

    /* renamed from: v0 */
    public a8.b f25419v0;

    /* renamed from: w0 */
    public float[] f25420w0;

    public a(Context context) {
        super(context);
        this.E = 100;
        this.F = false;
        this.H = false;
        this.L = true;
        this.M = true;
        this.Q = true;
        this.U = true;
        this.V = true;
        this.W = true;
        this.f25402e0 = false;
        this.f25403f0 = false;
        this.f25404g0 = false;
        this.f25405h0 = 15.0f;
        this.f25406i0 = false;
        this.f25414q0 = 0L;
        this.f25415r0 = 0L;
        this.f25416s0 = new RectF();
        this.f25417t0 = new Matrix();
        new Matrix();
        this.f25418u0 = a8.b.b(0.0d, 0.0d);
        this.f25419v0 = a8.b.b(0.0d, 0.0d);
        this.f25420w0 = new float[2];
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = 100;
        this.F = false;
        this.H = false;
        this.L = true;
        this.M = true;
        this.Q = true;
        this.U = true;
        this.V = true;
        this.W = true;
        this.f25402e0 = false;
        this.f25403f0 = false;
        this.f25404g0 = false;
        this.f25405h0 = 15.0f;
        this.f25406i0 = false;
        this.f25414q0 = 0L;
        this.f25415r0 = 0L;
        this.f25416s0 = new RectF();
        this.f25417t0 = new Matrix();
        new Matrix();
        this.f25418u0 = a8.b.b(0.0d, 0.0d);
        this.f25419v0 = a8.b.b(0.0d, 0.0d);
        this.f25420w0 = new float[2];
    }

    @Override // w7.b
    public final e c(j.a aVar) {
        return aVar == j.a.LEFT ? this.f25411n0 : this.f25412o0;
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f10;
        float f11;
        y7.b bVar = this.f25433m;
        if (bVar instanceof y7.a) {
            y7.a aVar = (y7.a) bVar;
            a8.c cVar = aVar.f31204p;
            if (cVar.f370b != 0.0f || cVar.f371c != 0.0f) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                a8.c cVar2 = aVar.f31204p;
                cVar2.f370b = ((a) aVar.f31210d).getDragDecelerationFrictionCoef() * cVar2.f370b;
                a8.c cVar3 = aVar.f31204p;
                cVar3.f371c = ((a) aVar.f31210d).getDragDecelerationFrictionCoef() * cVar3.f371c;
                float f12 = ((float) (currentAnimationTimeMillis - aVar.f31202n)) / 1000.0f;
                a8.c cVar4 = aVar.f31204p;
                float f13 = cVar4.f370b * f12;
                float f14 = cVar4.f371c * f12;
                a8.c cVar5 = aVar.f31203o;
                float f15 = cVar5.f370b + f13;
                cVar5.f370b = f15;
                float f16 = cVar5.f371c + f14;
                cVar5.f371c = f16;
                MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f15, f16, 0);
                a aVar2 = (a) aVar.f31210d;
                if (aVar2.Q) {
                    f10 = aVar.f31203o.f370b - aVar.f31195g.f370b;
                } else {
                    f10 = 0.0f;
                }
                if (aVar2.U) {
                    f11 = aVar.f31203o.f371c - aVar.f31195g.f371c;
                } else {
                    f11 = 0.0f;
                }
                aVar.d(obtain, f10, f11);
                obtain.recycle();
                g viewPortHandler = ((a) aVar.f31210d).getViewPortHandler();
                Matrix matrix = aVar.f31193e;
                viewPortHandler.l(matrix, aVar.f31210d, false);
                aVar.f31193e = matrix;
                aVar.f31202n = currentAnimationTimeMillis;
                if (Math.abs(aVar.f31204p.f370b) < 0.01d && Math.abs(aVar.f31204p.f371c) < 0.01d) {
                    ((a) aVar.f31210d).f();
                    ((a) aVar.f31210d).postInvalidate();
                    a8.c cVar6 = aVar.f31204p;
                    cVar6.f370b = 0.0f;
                    cVar6.f371c = 0.0f;
                    return;
                }
                T t10 = aVar.f31210d;
                DisplayMetrics displayMetrics = f.f387a;
                t10.postInvalidateOnAnimation();
            }
        }
    }

    @Override // w7.b
    public final void e(j.a aVar) {
        j jVar;
        if (aVar == j.a.LEFT) {
            jVar = this.f25407j0;
        } else {
            jVar = this.f25408k0;
        }
        jVar.getClass();
    }

    @Override // r7.b
    public void f() {
        boolean z10;
        o(this.f25416s0);
        RectF rectF = this.f25416s0;
        float f10 = rectF.left + 0.0f;
        float f11 = rectF.top + 0.0f;
        float f12 = rectF.right + 0.0f;
        float f13 = rectF.bottom + 0.0f;
        j jVar = this.f25407j0;
        boolean z11 = false;
        if (jVar.f26656a && jVar.f26647r && jVar.F == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 += jVar.h(this.f25409l0.f32015e);
        }
        j jVar2 = this.f25408k0;
        if (jVar2.f26656a && jVar2.f26647r && jVar2.F == 1) {
            z11 = true;
        }
        if (z11) {
            f12 += jVar2.h(this.f25410m0.f32015e);
        }
        s7.i iVar = this.f25429i;
        if (iVar.f26656a && iVar.f26647r) {
            float f14 = iVar.B + iVar.f26658c;
            int i10 = iVar.C;
            if (i10 == 2) {
                f13 += f14;
            } else {
                if (i10 != 1) {
                    if (i10 == 3) {
                        f13 += f14;
                    }
                }
                f11 += f14;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f11;
        float extraRightOffset = getExtraRightOffset() + f12;
        float extraBottomOffset = getExtraBottomOffset() + f13;
        float extraLeftOffset = getExtraLeftOffset() + f10;
        float c10 = f.c(this.f25405h0);
        g gVar = this.f25438r;
        gVar.f397b.set(Math.max(c10, extraLeftOffset), Math.max(c10, extraTopOffset), gVar.f398c - Math.max(c10, extraRightOffset), gVar.f399d - Math.max(c10, extraBottomOffset));
        if (this.f25421a) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append(this.f25438r.f397b.toString());
            Log.i("MPAndroidChart", sb2.toString());
        }
        e eVar = this.f25412o0;
        this.f25408k0.getClass();
        eVar.g();
        e eVar2 = this.f25411n0;
        this.f25407j0.getClass();
        eVar2.g();
        p();
    }

    public j getAxisLeft() {
        return this.f25407j0;
    }

    public j getAxisRight() {
        return this.f25408k0;
    }

    @Override // r7.b, w7.c, w7.b
    public /* bridge */ /* synthetic */ d getData() {
        return (d) super.getData();
    }

    public y7.e getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        e c10 = c(j.a.LEFT);
        RectF rectF = this.f25438r.f397b;
        c10.c(rectF.right, rectF.bottom, this.f25419v0);
        return (float) Math.min(this.f25429i.f26654y, this.f25419v0.f367b);
    }

    public float getLowestVisibleX() {
        e c10 = c(j.a.LEFT);
        RectF rectF = this.f25438r.f397b;
        c10.c(rectF.left, rectF.bottom, this.f25418u0);
        return (float) Math.max(this.f25429i.f26655z, this.f25418u0.f367b);
    }

    @Override // r7.b, w7.c
    public int getMaxVisibleCount() {
        return this.E;
    }

    public float getMinOffset() {
        return this.f25405h0;
    }

    public z7.j getRendererLeftYAxis() {
        return this.f25409l0;
    }

    public z7.j getRendererRightYAxis() {
        return this.f25410m0;
    }

    public i getRendererXAxis() {
        return this.f25413p0;
    }

    @Override // android.view.View
    public float getScaleX() {
        g gVar = this.f25438r;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f404i;
    }

    @Override // android.view.View
    public float getScaleY() {
        g gVar = this.f25438r;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f405j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // r7.b
    public float getYChartMax() {
        return Math.max(this.f25407j0.f26654y, this.f25408k0.f26654y);
    }

    @Override // r7.b
    public float getYChartMin() {
        return Math.min(this.f25407j0.f26655z, this.f25408k0.f26655z);
    }

    @Override // r7.b
    public void k() {
        super.k();
        this.f25407j0 = new j(j.a.LEFT);
        this.f25408k0 = new j(j.a.RIGHT);
        this.f25411n0 = new e(this.f25438r);
        this.f25412o0 = new e(this.f25438r);
        this.f25409l0 = new z7.j(this.f25438r, this.f25407j0, this.f25411n0);
        this.f25410m0 = new z7.j(this.f25438r, this.f25408k0, this.f25412o0);
        this.f25413p0 = new i(this.f25438r, this.f25429i, this.f25411n0);
        setHighlighter(new v7.b(this));
        this.f25433m = new y7.a(this, this.f25438r.f396a);
        Paint paint = new Paint();
        this.f25400c0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f25400c0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f25401d0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f25401d0.setColor(-16777216);
        this.f25401d0.setStrokeWidth(f.c(1.0f));
    }

    @Override // r7.b
    public final void l() {
        boolean z10;
        float c10;
        float f10;
        Paint paint;
        float f11;
        float f12;
        boolean z11;
        float c11;
        float f13;
        String n10;
        if (this.f25422b == 0) {
            if (this.f25421a) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f25421a) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        z7.d dVar = this.f25436p;
        if (dVar != null) {
            dVar.i();
        }
        n();
        z7.j jVar = this.f25409l0;
        j jVar2 = this.f25407j0;
        jVar.d(jVar2.f26655z, jVar2.f26654y);
        z7.j jVar3 = this.f25410m0;
        j jVar4 = this.f25408k0;
        jVar3.d(jVar4.f26655z, jVar4.f26654y);
        i iVar = this.f25413p0;
        s7.i iVar2 = this.f25429i;
        iVar.d(iVar2.f26655z, iVar2.f26654y);
        if (this.f25432l != null) {
            z7.e eVar = this.f25435o;
            T t10 = this.f25422b;
            if (!eVar.f32035d.f26664g) {
                eVar.f32036e.clear();
                for (int i10 = 0; i10 < t10.d(); i10++) {
                    x7.d c12 = t10.c(i10);
                    List<Integer> J = c12.J();
                    int Y = c12.Y();
                    if (c12 instanceof x7.a) {
                        x7.a aVar = (x7.a) c12;
                        if (aVar.Q()) {
                            String[] S = aVar.S();
                            for (int i11 = 0; i11 < J.size() && i11 < aVar.K(); i11++) {
                                ArrayList arrayList = eVar.f32036e;
                                String str = S[i11 % S.length];
                                int b10 = c12.b();
                                float B = c12.B();
                                float w10 = c12.w();
                                c12.g();
                                arrayList.add(new s7.f(str, b10, B, w10, null, J.get(i11).intValue()));
                            }
                            if (aVar.n() != null) {
                                eVar.f32036e.add(new s7.f(c12.n(), 1, Float.NaN, Float.NaN, null, 1122867));
                            }
                        }
                    }
                    if (c12 instanceof h) {
                        h hVar = (h) c12;
                        for (int i12 = 0; i12 < J.size() && i12 < Y; i12++) {
                            ArrayList arrayList2 = eVar.f32036e;
                            hVar.x(i12).getClass();
                            int b11 = c12.b();
                            float B2 = c12.B();
                            float w11 = c12.w();
                            c12.g();
                            arrayList2.add(new s7.f(null, b11, B2, w11, null, J.get(i12).intValue()));
                        }
                        if (hVar.n() != null) {
                            eVar.f32036e.add(new s7.f(c12.n(), 1, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else {
                        if (c12 instanceof x7.c) {
                            x7.c cVar = (x7.c) c12;
                            if (cVar.g0() != 1122867) {
                                int g02 = cVar.g0();
                                int T = cVar.T();
                                ArrayList arrayList3 = eVar.f32036e;
                                int b12 = c12.b();
                                float B3 = c12.B();
                                float w12 = c12.w();
                                c12.g();
                                arrayList3.add(new s7.f(null, b12, B3, w12, null, g02));
                                ArrayList arrayList4 = eVar.f32036e;
                                String n11 = c12.n();
                                int b13 = c12.b();
                                float B4 = c12.B();
                                float w13 = c12.w();
                                c12.g();
                                arrayList4.add(new s7.f(n11, b13, B4, w13, null, T));
                            }
                        }
                        for (int i13 = 0; i13 < J.size() && i13 < Y; i13++) {
                            if (i13 < J.size() - 1 && i13 < Y - 1) {
                                n10 = null;
                            } else {
                                n10 = t10.c(i10).n();
                            }
                            String str2 = n10;
                            ArrayList arrayList5 = eVar.f32036e;
                            int b14 = c12.b();
                            float B5 = c12.B();
                            float w14 = c12.w();
                            c12.g();
                            arrayList5.add(new s7.f(str2, b14, B5, w14, null, J.get(i13).intValue()));
                        }
                    }
                }
                eVar.f32035d.getClass();
                s7.e eVar2 = eVar.f32035d;
                ArrayList arrayList6 = eVar.f32036e;
                eVar2.getClass();
                eVar2.f26663f = (s7.f[]) arrayList6.toArray(new s7.f[arrayList6.size()]);
            }
            eVar.f32035d.getClass();
            eVar.f32033b.setTextSize(eVar.f32035d.f26659d);
            eVar.f32033b.setColor(eVar.f32035d.f26660e);
            s7.e eVar3 = eVar.f32035d;
            Paint paint2 = eVar.f32033b;
            g gVar = (g) eVar.f28477a;
            float c13 = f.c(eVar3.f26670m);
            float c14 = f.c(eVar3.f26674q);
            float c15 = f.c(eVar3.f26673p);
            float c16 = f.c(eVar3.f26672o);
            float c17 = f.c(0.0f);
            s7.f[] fVarArr = eVar3.f26663f;
            int length = fVarArr.length;
            f.c(eVar3.f26673p);
            s7.f[] fVarArr2 = eVar3.f26663f;
            int length2 = fVarArr2.length;
            int i14 = 0;
            float f14 = 0.0f;
            float f15 = 0.0f;
            while (i14 < length2) {
                s7.f fVar = fVarArr2[i14];
                float f16 = c13;
                if (Float.isNaN(fVar.f26683c)) {
                    f13 = eVar3.f26670m;
                } else {
                    f13 = fVar.f26683c;
                }
                float c18 = f.c(f13);
                if (c18 > f14) {
                    f14 = c18;
                }
                String str3 = fVar.f26681a;
                if (str3 != null) {
                    float measureText = (int) paint2.measureText(str3);
                    if (measureText > f15) {
                        f15 = measureText;
                    }
                }
                i14++;
                c13 = f16;
            }
            float f17 = c13;
            float f18 = 0.0f;
            for (s7.f fVar2 : eVar3.f26663f) {
                String str4 = fVar2.f26681a;
                if (str4 != null) {
                    float a10 = f.a(paint2, str4);
                    if (a10 > f18) {
                        f18 = a10;
                    }
                }
            }
            int b15 = c0.b(eVar3.f26667j);
            if (b15 != 0) {
                if (b15 == 1) {
                    Paint.FontMetrics fontMetrics = f.f391e;
                    paint2.getFontMetrics(fontMetrics);
                    float f19 = fontMetrics.descent - fontMetrics.ascent;
                    float f20 = 0.0f;
                    float f21 = 0.0f;
                    float f22 = 0.0f;
                    boolean z12 = false;
                    for (int i15 = 0; i15 < length; i15++) {
                        s7.f fVar3 = fVarArr[i15];
                        if (fVar3.f26682b != 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (Float.isNaN(fVar3.f26683c)) {
                            c11 = f17;
                        } else {
                            c11 = f.c(fVar3.f26683c);
                        }
                        String str5 = fVar3.f26681a;
                        if (!z12) {
                            f22 = 0.0f;
                        }
                        if (z11) {
                            if (z12) {
                                f22 += c14;
                            }
                            f22 += c11;
                        }
                        if (str5 != null) {
                            if (z11 && !z12) {
                                f22 += c15;
                            } else if (z12) {
                                f20 = Math.max(f20, f22);
                                f21 += f19 + c17;
                                f22 = 0.0f;
                                z12 = false;
                            }
                            f22 += (int) paint2.measureText(str5);
                            if (i15 < length - 1) {
                                f21 = f19 + c17 + f21;
                            }
                        } else {
                            f22 += c11;
                            if (i15 < length - 1) {
                                f22 += c14;
                            }
                            z12 = true;
                        }
                        f20 = Math.max(f20, f22);
                    }
                    eVar3.f26676s = f20;
                    eVar3.f26677t = f21;
                }
            } else {
                Paint.FontMetrics fontMetrics2 = f.f391e;
                paint2.getFontMetrics(fontMetrics2);
                float f23 = fontMetrics2.descent - fontMetrics2.ascent;
                Paint.FontMetrics fontMetrics3 = f.f391e;
                paint2.getFontMetrics(fontMetrics3);
                float f24 = (fontMetrics3.ascent - fontMetrics3.top) + fontMetrics3.bottom + c17;
                gVar.a();
                eVar3.f26679v.clear();
                eVar3.f26678u.clear();
                eVar3.f26680w.clear();
                float f25 = 0.0f;
                int i16 = 0;
                float f26 = 0.0f;
                int i17 = -1;
                float f27 = 0.0f;
                while (i16 < length) {
                    s7.f fVar4 = fVarArr[i16];
                    float f28 = c16;
                    if (fVar4.f26682b != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Float.isNaN(fVar4.f26683c)) {
                        c10 = f17;
                    } else {
                        c10 = f.c(fVar4.f26683c);
                    }
                    String str6 = fVar4.f26681a;
                    s7.f[] fVarArr3 = fVarArr;
                    float f29 = f24;
                    eVar3.f26679v.add(Boolean.FALSE);
                    if (i17 == -1) {
                        f10 = 0.0f;
                    } else {
                        f10 = f25 + c14;
                    }
                    ArrayList arrayList7 = eVar3.f26678u;
                    if (str6 != null) {
                        arrayList7.add(f.b(paint2, str6));
                        if (z10) {
                            f12 = c10 + c15;
                        } else {
                            f12 = 0.0f;
                        }
                        f25 = f10 + f12 + ((a8.a) eVar3.f26678u.get(i16)).f364b;
                        paint = paint2;
                    } else {
                        paint = paint2;
                        arrayList7.add(a8.a.b(0.0f, 0.0f));
                        if (!z10) {
                            c10 = 0.0f;
                        }
                        f25 = f10 + c10;
                        if (i17 == -1) {
                            i17 = i16;
                        }
                    }
                    if (str6 != null || i16 == length - 1) {
                        if (f27 == 0.0f) {
                            f11 = 0.0f;
                        } else {
                            f11 = f28;
                        }
                        f27 += f11 + f25;
                        if (i16 == length - 1) {
                            eVar3.f26680w.add(a8.a.b(f27, f23));
                            f26 = Math.max(f26, f27);
                        }
                    }
                    if (str6 != null) {
                        i17 = -1;
                    }
                    i16++;
                    c16 = f28;
                    fVarArr = fVarArr3;
                    f24 = f29;
                    paint2 = paint;
                }
                float f30 = f24;
                eVar3.f26676s = f26;
                eVar3.f26677t = (f30 * (eVar3.f26680w.size() == 0 ? 0 : eVar3.f26680w.size() - 1)) + (f23 * eVar3.f26680w.size());
            }
            eVar3.f26677t += eVar3.f26658c;
            eVar3.f26676s += eVar3.f26657b;
        }
        f();
    }

    public void n() {
        s7.i iVar = this.f25429i;
        T t10 = this.f25422b;
        iVar.a(((d) t10).f27826d, ((d) t10).f27825c);
        j jVar = this.f25407j0;
        j.a aVar = j.a.LEFT;
        jVar.a(((d) this.f25422b).h(aVar), ((d) this.f25422b).g(aVar));
        j jVar2 = this.f25408k0;
        j.a aVar2 = j.a.RIGHT;
        jVar2.a(((d) this.f25422b).h(aVar2), ((d) this.f25422b).g(aVar2));
    }

    public final void o(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        s7.e eVar = this.f25432l;
        if (eVar != null && eVar.f26656a) {
            int b10 = c0.b(eVar.f26667j);
            if (b10 != 0) {
                if (b10 == 1) {
                    int b11 = c0.b(this.f25432l.f26665h);
                    if (b11 != 0) {
                        if (b11 != 1) {
                            if (b11 == 2) {
                                float f10 = rectF.right;
                                s7.e eVar2 = this.f25432l;
                                rectF.right = Math.min(eVar2.f26676s, this.f25438r.f398c * eVar2.f26675r) + this.f25432l.f26657b + f10;
                                return;
                            }
                            return;
                        }
                        int b12 = c0.b(this.f25432l.f26666i);
                        if (b12 != 0) {
                            if (b12 != 2) {
                                return;
                            }
                            float f11 = rectF.bottom;
                            s7.e eVar3 = this.f25432l;
                            rectF.bottom = Math.min(eVar3.f26677t, this.f25438r.f399d * eVar3.f26675r) + this.f25432l.f26658c + f11;
                            return;
                        }
                        float f12 = rectF.top;
                        s7.e eVar4 = this.f25432l;
                        rectF.top = Math.min(eVar4.f26677t, this.f25438r.f399d * eVar4.f26675r) + this.f25432l.f26658c + f12;
                    }
                    float f13 = rectF.left;
                    s7.e eVar5 = this.f25432l;
                    rectF.left = Math.min(eVar5.f26676s, this.f25438r.f398c * eVar5.f26675r) + this.f25432l.f26657b + f13;
                    return;
                }
                return;
            }
            int b13 = c0.b(this.f25432l.f26666i);
            if (b13 != 0) {
                if (b13 != 2) {
                    return;
                }
                float f112 = rectF.bottom;
                s7.e eVar32 = this.f25432l;
                rectF.bottom = Math.min(eVar32.f26677t, this.f25438r.f399d * eVar32.f26675r) + this.f25432l.f26658c + f112;
                return;
            }
            float f122 = rectF.top;
            s7.e eVar42 = this.f25432l;
            rectF.top = Math.min(eVar42.f26677t, this.f25438r.f399d * eVar42.f26675r) + this.f25432l.f26658c + f122;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:422:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0417  */
    @Override // r7.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.a.onDraw(android.graphics.Canvas):void");
    }

    @Override // r7.b, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        j.a aVar = j.a.LEFT;
        float[] fArr = this.f25420w0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.f25406i0) {
            RectF rectF = this.f25438r.f397b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            c(aVar).e(this.f25420w0);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f25406i0) {
            c(aVar).f(this.f25420w0);
            g gVar = this.f25438r;
            float[] fArr2 = this.f25420w0;
            Matrix matrix = gVar.f409n;
            matrix.reset();
            matrix.set(gVar.f396a);
            float f10 = fArr2[0];
            RectF rectF2 = gVar.f397b;
            matrix.postTranslate(-(f10 - rectF2.left), -(fArr2[1] - rectF2.top));
            gVar.l(matrix, this, true);
            return;
        }
        g gVar2 = this.f25438r;
        gVar2.l(gVar2.f396a, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        y7.b bVar = this.f25433m;
        if (bVar == null || this.f25422b == 0 || !this.f25430j) {
            return false;
        }
        ((y7.a) bVar).onTouch(this, motionEvent);
        return true;
    }

    public void p() {
        if (this.f25421a) {
            StringBuilder a10 = android.support.v4.media.d.a("Preparing Value-Px Matrix, xmin: ");
            a10.append(this.f25429i.f26655z);
            a10.append(", xmax: ");
            a10.append(this.f25429i.f26654y);
            a10.append(", xdelta: ");
            a10.append(this.f25429i.A);
            Log.i("MPAndroidChart", a10.toString());
        }
        e eVar = this.f25412o0;
        s7.i iVar = this.f25429i;
        float f10 = iVar.f26655z;
        float f11 = iVar.A;
        j jVar = this.f25408k0;
        eVar.h(f10, f11, jVar.A, jVar.f26655z);
        e eVar2 = this.f25411n0;
        s7.i iVar2 = this.f25429i;
        float f12 = iVar2.f26655z;
        float f13 = iVar2.A;
        j jVar2 = this.f25407j0;
        eVar2.h(f12, f13, jVar2.A, jVar2.f26655z);
    }

    public void setAutoScaleMinMaxEnabled(boolean z10) {
        this.F = z10;
    }

    public void setBorderColor(int i10) {
        this.f25401d0.setColor(i10);
    }

    public void setBorderWidth(float f10) {
        this.f25401d0.setStrokeWidth(f.c(f10));
    }

    public void setClipValuesToContent(boolean z10) {
        this.f25404g0 = z10;
    }

    public void setDoubleTapToZoomEnabled(boolean z10) {
        this.L = z10;
    }

    public void setDragEnabled(boolean z10) {
        this.Q = z10;
        this.U = z10;
    }

    public void setDragOffsetX(float f10) {
        g gVar = this.f25438r;
        gVar.getClass();
        gVar.f407l = f.c(f10);
    }

    public void setDragOffsetY(float f10) {
        g gVar = this.f25438r;
        gVar.getClass();
        gVar.f408m = f.c(f10);
    }

    public void setDragXEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setDragYEnabled(boolean z10) {
        this.U = z10;
    }

    public void setDrawBorders(boolean z10) {
        this.f25403f0 = z10;
    }

    public void setDrawGridBackground(boolean z10) {
        this.f25402e0 = z10;
    }

    public void setGridBackgroundColor(int i10) {
        this.f25400c0.setColor(i10);
    }

    public void setHighlightPerDragEnabled(boolean z10) {
        this.M = z10;
    }

    public void setKeepPositionOnRotation(boolean z10) {
        this.f25406i0 = z10;
    }

    public void setMaxVisibleValueCount(int i10) {
        this.E = i10;
    }

    public void setMinOffset(float f10) {
        this.f25405h0 = f10;
    }

    public void setOnDrawListener(y7.e eVar) {
    }

    public void setPinchZoom(boolean z10) {
        this.H = z10;
    }

    public void setRendererLeftYAxis(z7.j jVar) {
        this.f25409l0 = jVar;
    }

    public void setRendererRightYAxis(z7.j jVar) {
        this.f25410m0 = jVar;
    }

    public void setScaleEnabled(boolean z10) {
        this.V = z10;
        this.W = z10;
    }

    public void setScaleXEnabled(boolean z10) {
        this.V = z10;
    }

    public void setScaleYEnabled(boolean z10) {
        this.W = z10;
    }

    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.f25429i.A / f10;
        g gVar = this.f25438r;
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        gVar.f402g = f11;
        gVar.j(gVar.f396a, gVar.f397b);
    }

    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.f25429i.A / f10;
        g gVar = this.f25438r;
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        gVar.f403h = f11;
        gVar.j(gVar.f396a, gVar.f397b);
    }

    public void setXAxisRenderer(i iVar) {
        this.f25413p0 = iVar;
    }
}
