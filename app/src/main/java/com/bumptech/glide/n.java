package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.manager.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n<TranscodeType> extends i5.a<n<TranscodeType>> {
    public final Context A;
    public final o B;
    public final Class<TranscodeType> C;
    public final h D;
    public p<?, ? super TranscodeType> E;
    public Object F;
    public ArrayList H;
    public n<TranscodeType> L;
    public n<TranscodeType> M;
    public boolean Q = true;
    public boolean U;
    public boolean V;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5791a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f5792b;

        static {
            int[] iArr = new int[j.values().length];
            f5792b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5792b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5792b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5792b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5791a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5791a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5791a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5791a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5791a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5791a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5791a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5791a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        i5.g gVar = (i5.g) ((i5.g) new i5.g().d(t4.n.f27657b).l()).p();
    }

    @SuppressLint({"CheckResult"})
    public n(b bVar, o oVar, Class<TranscodeType> cls, Context context) {
        i5.g gVar;
        this.B = oVar;
        this.C = cls;
        this.A = context;
        h hVar = oVar.f5794a.f5662c;
        com.bumptech.glide.a aVar = hVar.f5673f.get(cls);
        if (aVar == null) {
            for (Map.Entry<Class<?>, p<?, ?>> entry : hVar.f5673f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aVar = (p<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.E = (p<?, ? super TranscodeType>) (aVar == null ? h.f5667k : aVar);
        this.D = bVar.f5662c;
        Iterator<i5.f<Object>> it = oVar.f5802i.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        synchronized (oVar) {
            gVar = oVar.f5803j;
        }
        x(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(android.widget.ImageView r4) {
        /*
            r3 = this;
            m5.l.a()
            int r0 = r3.f16500a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = i5.a.e(r0, r1)
            if (r0 != 0) goto L53
            boolean r0 = r3.f16513n
            if (r0 == 0) goto L53
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L53
            int[] r0 = com.bumptech.glide.n.a.f5791a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L27;
                case 4: goto L27;
                case 5: goto L27;
                case 6: goto L3a;
                default: goto L26;
            }
        L26:
            goto L53
        L27:
            com.bumptech.glide.n r0 = r3.clone()
            a5.m$e r1 = a5.m.f292a
            a5.r r2 = new a5.r
            r2.<init>()
            i5.a r0 = r0.g(r1, r2)
            r1 = 1
            r0.f16524y = r1
            goto L54
        L3a:
            com.bumptech.glide.n r0 = r3.clone()
            i5.a r0 = r0.f()
            goto L54
        L43:
            com.bumptech.glide.n r0 = r3.clone()
            a5.m$d r1 = a5.m.f294c
            a5.i r2 = new a5.i
            r2.<init>()
            i5.a r0 = r0.g(r1, r2)
            goto L54
        L53:
            r0 = r3
        L54:
            com.bumptech.glide.h r1 = r3.D
            java.lang.Class<TranscodeType> r2 = r3.C
            a.g r1 = r1.f5670c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6b
            j5.b r1 = new j5.b
            r1.<init>(r4)
            goto L78
        L6b:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L7c
            j5.e r1 = new j5.e
            r1.<init>(r4)
        L78:
            r3.B(r1, r0)
            return
        L7c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.n.A(android.widget.ImageView):void");
    }

    public final void B(j5.h hVar, i5.a aVar) {
        boolean z10;
        b0.c.i(hVar);
        if (this.U) {
            Object obj = new Object();
            p<?, ? super TranscodeType> pVar = this.E;
            i5.d y10 = y(aVar.f16510k, aVar.f16509j, aVar.f16503d, pVar, aVar, null, hVar, obj);
            i5.d g10 = hVar.g();
            if (y10.b(g10)) {
                if (!aVar.f16508i && g10.i()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    b0.c.i(g10);
                    if (!g10.isRunning()) {
                        g10.h();
                        return;
                    }
                    return;
                }
            }
            this.B.j(hVar);
            hVar.b(y10);
            o oVar = this.B;
            synchronized (oVar) {
                oVar.f5799f.f5790a.add(hVar);
                q qVar = oVar.f5797d;
                qVar.f5754a.add(y10);
                if (!qVar.f5756c) {
                    y10.h();
                } else {
                    y10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    qVar.f5755b.add(y10);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final n<TranscodeType> C(Object obj) {
        if (this.f16521v) {
            return clone().C(obj);
        }
        this.F = obj;
        this.U = true;
        m();
        return this;
    }

    public final i5.i D(int i10, int i11, j jVar, p pVar, i5.a aVar, i5.e eVar, j5.h hVar, Object obj) {
        Context context = this.A;
        h hVar2 = this.D;
        return new i5.i(context, hVar2, obj, this.F, this.C, aVar, i10, i11, jVar, hVar, this.H, eVar, hVar2.f5674g, pVar.f5807a);
    }

    @Override // i5.a
    public final i5.a a(i5.a aVar) {
        b0.c.i(aVar);
        return (n) super.a(aVar);
    }

    @Override // i5.a
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (super.equals(nVar) && Objects.equals(this.C, nVar.C) && this.E.equals(nVar.E) && Objects.equals(this.F, nVar.F) && Objects.equals(this.H, nVar.H) && Objects.equals(this.L, nVar.L) && Objects.equals(this.M, nVar.M) && this.Q == nVar.Q && this.U == nVar.U) {
                return true;
            }
        }
        return false;
    }

    @Override // i5.a
    public final int hashCode() {
        return m5.l.h(m5.l.h(m5.l.g(m5.l.g(m5.l.g(m5.l.g(m5.l.g(m5.l.g(m5.l.g(super.hashCode(), this.C), this.E), this.F), this.H), this.L), this.M), null), this.Q), this.U);
    }

    public final n<TranscodeType> w(i5.f<TranscodeType> fVar) {
        if (this.f16521v) {
            return clone().w(fVar);
        }
        if (fVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(fVar);
        }
        m();
        return this;
    }

    public final n<TranscodeType> x(i5.a<?> aVar) {
        b0.c.i(aVar);
        return (n) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i5.d y(int i10, int i11, j jVar, p pVar, i5.a aVar, i5.e eVar, j5.h hVar, Object obj) {
        i5.b bVar;
        i5.b bVar2;
        i5.i D;
        int i12;
        j jVar2;
        int i13;
        int i14;
        if (this.M != null) {
            i5.b bVar3 = new i5.b(obj, eVar);
            bVar = bVar3;
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        n<TranscodeType> nVar = this.L;
        if (nVar == null) {
            D = D(i10, i11, jVar, pVar, aVar, bVar2, hVar, obj);
        } else if (!this.V) {
            p<?, ? super TranscodeType> pVar2 = nVar.Q ? pVar : nVar.E;
            if (i5.a.e(nVar.f16500a, 8)) {
                jVar2 = this.L.f16503d;
            } else {
                int ordinal = jVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    jVar2 = j.IMMEDIATE;
                } else if (ordinal == 2) {
                    jVar2 = j.HIGH;
                } else if (ordinal != 3) {
                    StringBuilder a10 = android.support.v4.media.d.a("unknown priority: ");
                    a10.append(this.f16503d);
                    throw new IllegalArgumentException(a10.toString());
                } else {
                    jVar2 = j.NORMAL;
                }
            }
            j jVar3 = jVar2;
            n<TranscodeType> nVar2 = this.L;
            int i15 = nVar2.f16510k;
            int i16 = nVar2.f16509j;
            if (m5.l.i(i10, i11)) {
                n<TranscodeType> nVar3 = this.L;
                if (!m5.l.i(nVar3.f16510k, nVar3.f16509j)) {
                    i14 = aVar.f16510k;
                    i13 = aVar.f16509j;
                    i5.j jVar4 = new i5.j(obj, bVar2);
                    i5.i D2 = D(i10, i11, jVar, pVar, aVar, jVar4, hVar, obj);
                    this.V = true;
                    n<TranscodeType> nVar4 = this.L;
                    i5.d y10 = nVar4.y(i14, i13, jVar3, pVar2, nVar4, jVar4, hVar, obj);
                    this.V = false;
                    jVar4.f16560c = D2;
                    jVar4.f16561d = y10;
                    D = jVar4;
                }
            }
            i13 = i16;
            i14 = i15;
            i5.j jVar42 = new i5.j(obj, bVar2);
            i5.i D22 = D(i10, i11, jVar, pVar, aVar, jVar42, hVar, obj);
            this.V = true;
            n<TranscodeType> nVar42 = this.L;
            i5.d y102 = nVar42.y(i14, i13, jVar3, pVar2, nVar42, jVar42, hVar, obj);
            this.V = false;
            jVar42.f16560c = D22;
            jVar42.f16561d = y102;
            D = jVar42;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return D;
        }
        n<TranscodeType> nVar5 = this.M;
        int i17 = nVar5.f16510k;
        int i18 = nVar5.f16509j;
        if (m5.l.i(i10, i11)) {
            n<TranscodeType> nVar6 = this.M;
            if (!m5.l.i(nVar6.f16510k, nVar6.f16509j)) {
                int i19 = aVar.f16510k;
                i12 = aVar.f16509j;
                i17 = i19;
                n<TranscodeType> nVar7 = this.M;
                i5.d y11 = nVar7.y(i17, i12, nVar7.f16503d, nVar7.E, nVar7, bVar, hVar, obj);
                bVar.f16528c = D;
                bVar.f16529d = y11;
                return bVar;
            }
        }
        i12 = i18;
        n<TranscodeType> nVar72 = this.M;
        i5.d y112 = nVar72.y(i17, i12, nVar72.f16503d, nVar72.E, nVar72, bVar, hVar, obj);
        bVar.f16528c = D;
        bVar.f16529d = y112;
        return bVar;
    }

    @Override // i5.a
    /* renamed from: z */
    public final n<TranscodeType> clone() {
        n<TranscodeType> nVar = (n) super.clone();
        nVar.E = (p<?, ? super TranscodeType>) nVar.E.clone();
        if (nVar.H != null) {
            nVar.H = new ArrayList(nVar.H);
        }
        n<TranscodeType> nVar2 = nVar.L;
        if (nVar2 != null) {
            nVar.L = nVar2.clone();
        }
        n<TranscodeType> nVar3 = nVar.M;
        if (nVar3 != null) {
            nVar.M = nVar3.clone();
        }
        return nVar;
    }
}
