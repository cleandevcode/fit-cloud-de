package i5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k5.a;
import m5.e;
import m5.l;
import n5.d;
import t4.o;
import t4.t;
import t4.x;
import x4.k;

/* loaded from: classes.dex */
public final class i<R> implements d, j5.g, h {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a */
    public final String f16532a;

    /* renamed from: b */
    public final d.a f16533b;

    /* renamed from: c */
    public final Object f16534c;

    /* renamed from: d */
    public final f<R> f16535d;

    /* renamed from: e */
    public final e f16536e;

    /* renamed from: f */
    public final Context f16537f;

    /* renamed from: g */
    public final com.bumptech.glide.h f16538g;

    /* renamed from: h */
    public final Object f16539h;

    /* renamed from: i */
    public final Class<R> f16540i;

    /* renamed from: j */
    public final a<?> f16541j;

    /* renamed from: k */
    public final int f16542k;

    /* renamed from: l */
    public final int f16543l;

    /* renamed from: m */
    public final com.bumptech.glide.j f16544m;

    /* renamed from: n */
    public final j5.h<R> f16545n;

    /* renamed from: o */
    public final List<f<R>> f16546o;

    /* renamed from: p */
    public final k5.b<? super R> f16547p;

    /* renamed from: q */
    public final Executor f16548q;

    /* renamed from: r */
    public x<R> f16549r;

    /* renamed from: s */
    public o.d f16550s;

    /* renamed from: t */
    public long f16551t;

    /* renamed from: u */
    public volatile o f16552u;

    /* renamed from: v */
    public int f16553v;

    /* renamed from: w */
    public Drawable f16554w;

    /* renamed from: x */
    public Drawable f16555x;

    /* renamed from: y */
    public Drawable f16556y;

    /* renamed from: z */
    public int f16557z;

    public i(Context context, com.bumptech.glide.h hVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.j jVar, j5.h hVar2, ArrayList arrayList, e eVar, o oVar, a.C0315a c0315a) {
        e.a aVar2 = m5.e.f20367a;
        this.f16532a = D ? String.valueOf(hashCode()) : null;
        this.f16533b = new d.a();
        this.f16534c = obj;
        this.f16537f = context;
        this.f16538g = hVar;
        this.f16539h = obj2;
        this.f16540i = cls;
        this.f16541j = aVar;
        this.f16542k = i10;
        this.f16543l = i11;
        this.f16544m = jVar;
        this.f16545n = hVar2;
        this.f16535d = null;
        this.f16546o = arrayList;
        this.f16536e = eVar;
        this.f16552u = oVar;
        this.f16547p = c0315a;
        this.f16548q = aVar2;
        this.f16553v = 1;
        if (this.C == null && hVar.f5675h.f5678a.containsKey(com.bumptech.glide.e.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // i5.d
    public final boolean a() {
        boolean z10;
        synchronized (this.f16534c) {
            z10 = this.f16553v == 4;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean b(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.j jVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.j jVar2;
        int i15;
        boolean equals;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f16534c) {
            i10 = this.f16542k;
            i11 = this.f16543l;
            obj = this.f16539h;
            cls = this.f16540i;
            aVar = this.f16541j;
            jVar = this.f16544m;
            List<f<R>> list = this.f16546o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        i iVar = (i) dVar;
        synchronized (iVar.f16534c) {
            i13 = iVar.f16542k;
            i14 = iVar.f16543l;
            obj2 = iVar.f16539h;
            cls2 = iVar.f16540i;
            aVar2 = iVar.f16541j;
            jVar2 = iVar.f16544m;
            List<f<R>> list2 = iVar.f16546o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = l.f20382a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof k) {
                equals = ((k) obj).a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.g
    public final void c(int i10, int i11) {
        Object obj;
        int round;
        int i12 = i10;
        this.f16533b.a();
        Object obj2 = this.f16534c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    k("Got onSizeReady in " + m5.h.a(this.f16551t));
                }
                if (this.f16553v == 3) {
                    this.f16553v = 2;
                    float f10 = this.f16541j.f16501b;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f10);
                    }
                    this.f16557z = i12;
                    if (i11 == Integer.MIN_VALUE) {
                        round = i11;
                    } else {
                        round = Math.round(f10 * i11);
                    }
                    this.A = round;
                    if (z10) {
                        k("finished setup for calling load in " + m5.h.a(this.f16551t));
                    }
                    o oVar = this.f16552u;
                    com.bumptech.glide.h hVar = this.f16538g;
                    Object obj3 = this.f16539h;
                    a<?> aVar = this.f16541j;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            this.f16550s = oVar.b(hVar, obj3, aVar.f16511l, this.f16557z, this.A, aVar.f16518s, this.f16540i, this.f16544m, aVar.f16502c, aVar.f16517r, aVar.f16512m, aVar.f16524y, aVar.f16516q, aVar.f16508i, aVar.f16522w, aVar.f16525z, aVar.f16523x, this, this.f16548q);
                            if (this.f16553v != 2) {
                                this.f16550s = null;
                            }
                            if (z10) {
                                k("finished onSizeReady in " + m5.h.a(this.f16551t));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj2;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:39:0x0003, B:41:0x0007, B:43:0x0011, B:45:0x0013, B:47:0x001b, B:49:0x001f, B:51:0x0023, B:57:0x002f, B:58:0x0038, B:59:0x003a, B:63:0x0046, B:64:0x004d), top: B:68:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // i5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16534c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            n5.d$a r1 = r5.f16533b     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.f16553v     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.d()     // Catch: java.lang.Throwable -> L4e
            t4.x<R> r1 = r5.f16549r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f16549r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            i5.e r3 = r5.f16536e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.e(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            j5.h<R> r3 = r5.f16545n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch: java.lang.Throwable -> L4e
            r3.h(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.f16553v = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            t4.o r0 = r5.f16552u
            r0.getClass()
            t4.o.e(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.i.clear():void");
    }

    public final void d() {
        if (!this.B) {
            this.f16533b.a();
            this.f16545n.d(this);
            o.d dVar = this.f16550s;
            if (dVar != null) {
                synchronized (o.this) {
                    dVar.f27681a.h(dVar.f27682b);
                }
                this.f16550s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable e() {
        int i10;
        if (this.f16555x == null) {
            a<?> aVar = this.f16541j;
            Drawable drawable = aVar.f16506g;
            this.f16555x = drawable;
            if (drawable == null && (i10 = aVar.f16507h) > 0) {
                this.f16555x = j(i10);
            }
        }
        return this.f16555x;
    }

    public final boolean f() {
        e eVar = this.f16536e;
        return eVar == null || !eVar.getRoot().a();
    }

    @Override // i5.d
    public final boolean g() {
        boolean z10;
        synchronized (this.f16534c) {
            z10 = this.f16553v == 6;
        }
        return z10;
    }

    @Override // i5.d
    public final void h() {
        int i10;
        synchronized (this.f16534c) {
            try {
                if (!this.B) {
                    this.f16533b.a();
                    int i11 = m5.h.f20372b;
                    this.f16551t = SystemClock.elapsedRealtimeNanos();
                    int i12 = 3;
                    if (this.f16539h == null) {
                        if (l.i(this.f16542k, this.f16543l)) {
                            this.f16557z = this.f16542k;
                            this.A = this.f16543l;
                        }
                        if (this.f16556y == null) {
                            a<?> aVar = this.f16541j;
                            Drawable drawable = aVar.f16514o;
                            this.f16556y = drawable;
                            if (drawable == null && (i10 = aVar.f16515p) > 0) {
                                this.f16556y = j(i10);
                            }
                        }
                        if (this.f16556y == null) {
                            i12 = 5;
                        }
                        l(new t("Received null model"), i12);
                        return;
                    }
                    int i13 = this.f16553v;
                    if (i13 != 2) {
                        boolean z10 = false;
                        if (i13 == 4) {
                            n(this.f16549r, r4.a.MEMORY_CACHE, false);
                            return;
                        }
                        List<f<R>> list = this.f16546o;
                        if (list != null) {
                            for (f<R> fVar : list) {
                                if (fVar instanceof c) {
                                    ((c) fVar).getClass();
                                }
                            }
                        }
                        this.f16553v = 3;
                        if (l.i(this.f16542k, this.f16543l)) {
                            c(this.f16542k, this.f16543l);
                        } else {
                            this.f16545n.a(this);
                        }
                        int i14 = this.f16553v;
                        if (i14 == 2 || i14 == 3) {
                            e eVar = this.f16536e;
                            if ((eVar == null || eVar.d(this)) ? true : true) {
                                this.f16545n.f(e());
                            }
                        }
                        if (D) {
                            k("finished run method in " + m5.h.a(this.f16551t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i5.d
    public final boolean i() {
        boolean z10;
        synchronized (this.f16534c) {
            z10 = this.f16553v == 4;
        }
        return z10;
    }

    @Override // i5.d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f16534c) {
            int i10 = this.f16553v;
            z10 = i10 == 2 || i10 == 3;
        }
        return z10;
    }

    public final Drawable j(int i10) {
        Resources.Theme theme = this.f16541j.f16520u;
        if (theme == null) {
            theme = this.f16537f.getTheme();
        }
        com.bumptech.glide.h hVar = this.f16538g;
        return c5.b.a(hVar, hVar, i10, theme);
    }

    public final void k(String str) {
        StringBuilder a10 = p.a.a(str, " this: ");
        a10.append(this.f16532a);
        Log.v("GlideRequest", a10.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008b A[Catch: all -> 0x0098, TryCatch #2 {, blocks: (B:76:0x0008, B:78:0x0011, B:80:0x0045, B:81:0x0048, B:83:0x0052, B:84:0x0055, B:133:0x00de, B:134:0x00e0, B:86:0x0059, B:88:0x005d, B:89:0x0062, B:91:0x0068, B:93:0x0078, B:95:0x007c, B:99:0x0088, B:101:0x008b, B:103:0x008f, B:111:0x009d, B:113:0x00a1, B:115:0x00a5, B:117:0x00ad, B:119:0x00b1, B:120:0x00b7, B:122:0x00bb, B:124:0x00bf, B:126:0x00c7, B:128:0x00cb, B:129:0x00d1, B:131:0x00d5, B:132:0x00d9), top: B:141:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(t4.t r6, int r7) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.i.l(t4.t, int):void");
    }

    public final void m(x xVar, Object obj, r4.a aVar) {
        boolean z10;
        f();
        this.f16553v = 4;
        this.f16549r = xVar;
        if (this.f16538g.f5676i <= 3) {
            StringBuilder a10 = android.support.v4.media.d.a("Finished loading ");
            a10.append(obj.getClass().getSimpleName());
            a10.append(" from ");
            a10.append(aVar);
            a10.append(" for ");
            a10.append(this.f16539h);
            a10.append(" with size [");
            a10.append(this.f16557z);
            a10.append("x");
            a10.append(this.A);
            a10.append("] in ");
            a10.append(m5.h.a(this.f16551t));
            a10.append(" ms");
            Log.d("Glide", a10.toString());
        }
        e eVar = this.f16536e;
        if (eVar != null) {
            eVar.j(this);
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<f<R>> list = this.f16546o;
            if (list != null) {
                z10 = false;
                for (f<R> fVar : list) {
                    z10 |= fVar.a();
                }
            } else {
                z10 = false;
            }
            f<R> fVar2 = this.f16535d;
            if (fVar2 == null || !fVar2.a()) {
                z11 = false;
            }
            if (!(z11 | z10)) {
                this.f16547p.getClass();
                this.f16545n.c(obj);
            }
        } finally {
            this.B = false;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x00bb -> B:123:0x00be). Please submit an issue!!! */
    public final void n(x<?> xVar, r4.a aVar, boolean z10) {
        i<R> iVar;
        i<R> iVar2;
        Throwable th2;
        Object obj;
        String str;
        boolean z11;
        this.f16533b.a();
        x<?> xVar2 = null;
        try {
            synchronized (this.f16534c) {
                try {
                    this.f16550s = null;
                    if (xVar == null) {
                        l(new t("Expected to receive a Resource<R> with an object of " + this.f16540i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = xVar.get();
                    try {
                        if (obj2 != null && this.f16540i.isAssignableFrom(obj2.getClass())) {
                            e eVar = this.f16536e;
                            if (eVar != null && !eVar.f(this)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                this.f16549r = null;
                                this.f16553v = 4;
                                this.f16552u.getClass();
                                o.e(xVar);
                            }
                            m(xVar, obj2, aVar);
                            return;
                        }
                        this.f16549r = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f16540i);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(xVar);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        l(new t(sb2.toString()), 5);
                        this.f16552u.getClass();
                        o.e(xVar);
                    } catch (Throwable th3) {
                        th2 = th3;
                        xVar2 = xVar;
                        iVar = this;
                        try {
                        } catch (Throwable th4) {
                            iVar2 = iVar;
                            th = th4;
                            i<R> iVar3 = iVar2;
                            th2 = th;
                            iVar = iVar3;
                            throw th2;
                        }
                        try {
                            throw th2;
                        } catch (Throwable th5) {
                            th = th5;
                            if (xVar2 != null) {
                                iVar.f16552u.getClass();
                                o.e(xVar2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    iVar2 = this;
                    i<R> iVar32 = iVar2;
                    th2 = th;
                    iVar = iVar32;
                    throw th2;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            iVar = this;
        }
    }

    @Override // i5.d
    public final void pause() {
        synchronized (this.f16534c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f16534c) {
            obj = this.f16539h;
            cls = this.f16540i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
