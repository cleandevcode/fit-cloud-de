package w1;

import java.nio.charset.Charset;
import java.util.List;
import w1.z;

/* loaded from: classes.dex */
public final class j implements c1 {

    /* renamed from: a */
    public final i f29615a;

    /* renamed from: b */
    public int f29616b;

    /* renamed from: c */
    public int f29617c;

    /* renamed from: d */
    public int f29618d = 0;

    public j(i iVar) {
        Charset charset = y.f29729a;
        if (iVar == null) {
            throw new NullPointerException("input");
        }
        this.f29615a = iVar;
        iVar.f29592d = this;
    }

    @Override // w1.c1
    public final String A() {
        T(2);
        return this.f29615a.s();
    }

    @Override // w1.c1
    public final int B() {
        int i10 = this.f29618d;
        if (i10 != 0) {
            this.f29616b = i10;
            this.f29618d = 0;
        } else {
            this.f29616b = this.f29615a.u();
        }
        int i11 = this.f29616b;
        if (i11 == 0 || i11 == this.f29617c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // w1.c1
    public final void C(List<String> list) {
        R(list, false);
    }

    @Override // w1.c1
    public final void D(List<String> list) {
        R(list, true);
    }

    @Override // w1.c1
    public final g E() {
        T(2);
        return this.f29615a.g();
    }

    @Override // w1.c1
    public final void F(List<Float> list) {
        int u10;
        int u11;
        if (!(list instanceof u)) {
            int i10 = this.f29616b & 7;
            if (i10 == 2) {
                int v10 = this.f29615a.v();
                U(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Float.valueOf(this.f29615a.l()));
                } while (this.f29615a.b() < b10);
                return;
            } else if (i10 != 5) {
                throw z.b();
            } else {
                do {
                    list.add(Float.valueOf(this.f29615a.l()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            }
        }
        u uVar = (u) list;
        int i11 = this.f29616b & 7;
        if (i11 == 2) {
            int v11 = this.f29615a.v();
            U(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                uVar.e(this.f29615a.l());
            } while (this.f29615a.b() < b11);
        } else if (i11 != 5) {
            throw z.b();
        } else {
            do {
                uVar.e(this.f29615a.l());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        }
    }

    @Override // w1.c1
    public final int G() {
        T(0);
        return this.f29615a.m();
    }

    @Override // w1.c1
    public final boolean H() {
        int i10;
        if (this.f29615a.c() || (i10 = this.f29616b) == this.f29617c) {
            return false;
        }
        return this.f29615a.x(i10);
    }

    @Override // w1.c1
    public final int I() {
        T(5);
        return this.f29615a.o();
    }

    @Override // w1.c1
    public final void J(List<g> list) {
        int u10;
        if ((this.f29616b & 7) != 2) {
            throw z.b();
        }
        do {
            list.add(E());
            if (this.f29615a.c()) {
                return;
            }
            u10 = this.f29615a.u();
        } while (u10 == this.f29616b);
        this.f29618d = u10;
    }

    @Override // w1.c1
    public final void K(List<Double> list) {
        int u10;
        int u11;
        if (!(list instanceof m)) {
            int i10 = this.f29616b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f29615a.h()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                int v10 = this.f29615a.v();
                V(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Double.valueOf(this.f29615a.h()));
                } while (this.f29615a.b() < b10);
                return;
            }
        }
        m mVar = (m) list;
        int i11 = this.f29616b & 7;
        if (i11 == 1) {
            do {
                mVar.e(this.f29615a.h());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        } else if (i11 != 2) {
            throw z.b();
        } else {
            int v11 = this.f29615a.v();
            V(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                mVar.e(this.f29615a.h());
            } while (this.f29615a.b() < b11);
        }
    }

    @Override // w1.c1
    public final long L() {
        T(0);
        return this.f29615a.n();
    }

    @Override // w1.c1
    public final String M() {
        T(2);
        return this.f29615a.t();
    }

    @Override // w1.c1
    public final void N(List<Long> list) {
        int u10;
        int u11;
        if (!(list instanceof g0)) {
            int i10 = this.f29616b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f29615a.k()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                int v10 = this.f29615a.v();
                V(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Long.valueOf(this.f29615a.k()));
                } while (this.f29615a.b() < b10);
                return;
            }
        }
        g0 g0Var = (g0) list;
        int i11 = this.f29616b & 7;
        if (i11 == 1) {
            do {
                g0Var.e(this.f29615a.k());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        } else if (i11 != 2) {
            throw z.b();
        } else {
            int v11 = this.f29615a.v();
            V(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                g0Var.e(this.f29615a.k());
            } while (this.f29615a.b() < b11);
        }
    }

    public final Object O(p1 p1Var, Class<?> cls, o oVar) {
        switch (p1Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(L());
            case 3:
                return Long.valueOf(d());
            case 4:
                return Integer.valueOf(G());
            case 5:
                return Long.valueOf(e());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return M();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                T(2);
                return Q(z0.f29732c.a(cls), oVar);
            case 11:
                return E();
            case 12:
                return Integer.valueOf(n());
            case 13:
                return Integer.valueOf(t());
            case 14:
                return Integer.valueOf(I());
            case 15:
                return Long.valueOf(l());
            case 16:
                return Integer.valueOf(v());
            case 17:
                return Long.valueOf(w());
        }
    }

    public final <T> T P(d1<T> d1Var, o oVar) {
        int i10 = this.f29617c;
        this.f29617c = ((this.f29616b >>> 3) << 3) | 4;
        try {
            T b10 = d1Var.b();
            d1Var.e(b10, this, oVar);
            d1Var.c(b10);
            if (this.f29616b == this.f29617c) {
                return b10;
            }
            throw z.e();
        } finally {
            this.f29617c = i10;
        }
    }

    public final <T> T Q(d1<T> d1Var, o oVar) {
        i iVar;
        int v10 = this.f29615a.v();
        i iVar2 = this.f29615a;
        if (iVar2.f29589a < iVar2.f29590b) {
            int e10 = iVar2.e(v10);
            T b10 = d1Var.b();
            this.f29615a.f29589a++;
            d1Var.e(b10, this, oVar);
            d1Var.c(b10);
            this.f29615a.a(0);
            iVar.f29589a--;
            this.f29615a.d(e10);
            return b10;
        }
        throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void R(List<String> list, boolean z10) {
        int u10;
        int u11;
        if ((this.f29616b & 7) != 2) {
            throw z.b();
        }
        if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? M() : A());
                if (this.f29615a.c()) {
                    return;
                }
                u10 = this.f29615a.u();
            } while (u10 == this.f29616b);
            this.f29618d = u10;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.d(E());
            if (this.f29615a.c()) {
                return;
            }
            u11 = this.f29615a.u();
        } while (u11 == this.f29616b);
        this.f29618d = u11;
    }

    public final void S(int i10) {
        if (this.f29615a.b() != i10) {
            throw z.f();
        }
    }

    public final void T(int i10) {
        if ((this.f29616b & 7) != i10) {
            throw z.b();
        }
    }

    public final void U(int i10) {
        if ((i10 & 3) != 0) {
            throw z.e();
        }
    }

    public final void V(int i10) {
        if ((i10 & 7) != 0) {
            throw z.e();
        }
    }

    @Override // w1.c1
    public final int a() {
        return this.f29616b;
    }

    @Override // w1.c1
    public final void b(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof x) {
            x xVar = (x) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    xVar.e(this.f29615a.q());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    xVar.e(this.f29615a.q());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29615a.q()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Integer.valueOf(this.f29615a.q()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w1.c1
    public final <T> void c(List<T> list, d1<T> d1Var, o oVar) {
        int u10;
        int i10 = this.f29616b;
        if ((i10 & 7) == 2) {
            do {
                list.add(Q(d1Var, oVar));
                if (!this.f29615a.c() && this.f29618d == 0) {
                    u10 = this.f29615a.u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f29618d = u10;
            return;
        }
        int i11 = z.f29731a;
        throw new z.a();
    }

    @Override // w1.c1
    public final long d() {
        T(0);
        return this.f29615a.w();
    }

    @Override // w1.c1
    public final long e() {
        T(1);
        return this.f29615a.k();
    }

    @Override // w1.c1
    public final void f(List<Integer> list) {
        int u10;
        int u11;
        if (!(list instanceof x)) {
            int i10 = this.f29616b & 7;
            if (i10 == 2) {
                int v10 = this.f29615a.v();
                U(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f29615a.o()));
                } while (this.f29615a.b() < b10);
                return;
            } else if (i10 != 5) {
                throw z.b();
            } else {
                do {
                    list.add(Integer.valueOf(this.f29615a.o()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            }
        }
        x xVar = (x) list;
        int i11 = this.f29616b & 7;
        if (i11 == 2) {
            int v11 = this.f29615a.v();
            U(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                xVar.e(this.f29615a.o());
            } while (this.f29615a.b() < b11);
        } else if (i11 != 5) {
            throw z.b();
        } else {
            do {
                xVar.e(this.f29615a.o());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        }
    }

    @Override // w1.c1
    public final void g(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    g0Var.e(this.f29615a.r());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    g0Var.e(this.f29615a.r());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f29615a.r()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Long.valueOf(this.f29615a.r()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final void h(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof x) {
            x xVar = (x) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    xVar.e(this.f29615a.v());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    xVar.e(this.f29615a.v());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29615a.v()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Integer.valueOf(this.f29615a.v()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w1.c1
    public final <T> void i(List<T> list, d1<T> d1Var, o oVar) {
        int u10;
        int i10 = this.f29616b;
        if ((i10 & 7) == 3) {
            do {
                list.add(P(d1Var, oVar));
                if (!this.f29615a.c() && this.f29618d == 0) {
                    u10 = this.f29615a.u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f29618d = u10;
            return;
        }
        int i11 = z.f29731a;
        throw new z.a();
    }

    @Override // w1.c1
    public final int j() {
        T(5);
        return this.f29615a.j();
    }

    @Override // w1.c1
    public final boolean k() {
        T(0);
        return this.f29615a.f();
    }

    @Override // w1.c1
    public final long l() {
        T(1);
        return this.f29615a.p();
    }

    @Override // w1.c1
    public final void m(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    g0Var.e(this.f29615a.w());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    g0Var.e(this.f29615a.w());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f29615a.w()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Long.valueOf(this.f29615a.w()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final int n() {
        T(0);
        return this.f29615a.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w1.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void o(java.util.Map<K, V> r8, w1.i0.a<K, V> r9, w1.o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.T(r0)
            w1.i r1 = r7.f29615a
            int r1 = r1.v()
            w1.i r2 = r7.f29615a
            int r1 = r2.e(r1)
            K r2 = r9.f29612b
            V r3 = r9.f29614d
        L14:
            int r4 = r7.B()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            w1.i r5 = r7.f29615a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.H()     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            w1.z r4 = new w1.z     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
        L3a:
            w1.p1 r4 = r9.f29613c     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f29614d     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.O(r4, r5, r10)     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            w1.p1 r4 = r9.f29611a     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.O(r4, r5, r5)     // Catch: w1.z.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.H()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            w1.z r8 = new w1.z     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            w1.i r8 = r7.f29615a
            r8.d(r1)
            return
        L65:
            r8 = move-exception
            w1.i r9 = r7.f29615a
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.j.o(java.util.Map, w1.i0$a, w1.o):void");
    }

    @Override // w1.c1
    public final void p(List<Long> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    g0Var.e(this.f29615a.n());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    g0Var.e(this.f29615a.n());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f29615a.n()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Long.valueOf(this.f29615a.n()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final void q(List<Long> list) {
        int u10;
        int u11;
        if (!(list instanceof g0)) {
            int i10 = this.f29616b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f29615a.p()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                int v10 = this.f29615a.v();
                V(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Long.valueOf(this.f29615a.p()));
                } while (this.f29615a.b() < b10);
                return;
            }
        }
        g0 g0Var = (g0) list;
        int i11 = this.f29616b & 7;
        if (i11 == 1) {
            do {
                g0Var.e(this.f29615a.p());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        } else if (i11 != 2) {
            throw z.b();
        } else {
            int v11 = this.f29615a.v();
            V(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                g0Var.e(this.f29615a.p());
            } while (this.f29615a.b() < b11);
        }
    }

    @Override // w1.c1
    public final void r(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof x) {
            x xVar = (x) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    xVar.e(this.f29615a.m());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    xVar.e(this.f29615a.m());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29615a.m()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Integer.valueOf(this.f29615a.m()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final double readDouble() {
        T(1);
        return this.f29615a.h();
    }

    @Override // w1.c1
    public final float readFloat() {
        T(5);
        return this.f29615a.l();
    }

    @Override // w1.c1
    public final void s(List<Integer> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof x) {
            x xVar = (x) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    xVar.e(this.f29615a.i());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    xVar.e(this.f29615a.i());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f29615a.i()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Integer.valueOf(this.f29615a.i()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final int t() {
        T(0);
        return this.f29615a.i();
    }

    @Override // w1.c1
    public final void u(List<Integer> list) {
        int u10;
        int u11;
        if (!(list instanceof x)) {
            int i10 = this.f29616b & 7;
            if (i10 == 2) {
                int v10 = this.f29615a.v();
                U(v10);
                int b10 = this.f29615a.b() + v10;
                do {
                    list.add(Integer.valueOf(this.f29615a.j()));
                } while (this.f29615a.b() < b10);
                return;
            } else if (i10 != 5) {
                throw z.b();
            } else {
                do {
                    list.add(Integer.valueOf(this.f29615a.j()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            }
        }
        x xVar = (x) list;
        int i11 = this.f29616b & 7;
        if (i11 == 2) {
            int v11 = this.f29615a.v();
            U(v11);
            int b11 = this.f29615a.b() + v11;
            do {
                xVar.e(this.f29615a.j());
            } while (this.f29615a.b() < b11);
        } else if (i11 != 5) {
            throw z.b();
        } else {
            do {
                xVar.e(this.f29615a.j());
                if (this.f29615a.c()) {
                    return;
                }
                u11 = this.f29615a.u();
            } while (u11 == this.f29616b);
            this.f29618d = u11;
        }
    }

    @Override // w1.c1
    public final int v() {
        T(0);
        return this.f29615a.q();
    }

    @Override // w1.c1
    public final long w() {
        T(0);
        return this.f29615a.r();
    }

    @Override // w1.c1
    public final <T> T x(d1<T> d1Var, o oVar) {
        T(2);
        return (T) Q(d1Var, oVar);
    }

    @Override // w1.c1
    public final void y(List<Boolean> list) {
        int u10;
        int b10;
        int u11;
        if (list instanceof e) {
            e eVar = (e) list;
            int i10 = this.f29616b & 7;
            if (i10 == 0) {
                do {
                    eVar.e(this.f29615a.f());
                    if (this.f29615a.c()) {
                        return;
                    }
                    u11 = this.f29615a.u();
                } while (u11 == this.f29616b);
                this.f29618d = u11;
                return;
            } else if (i10 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    eVar.e(this.f29615a.f());
                } while (this.f29615a.b() < b10);
            }
        } else {
            int i11 = this.f29616b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f29615a.f()));
                    if (this.f29615a.c()) {
                        return;
                    }
                    u10 = this.f29615a.u();
                } while (u10 == this.f29616b);
                this.f29618d = u10;
                return;
            } else if (i11 != 2) {
                throw z.b();
            } else {
                b10 = this.f29615a.b() + this.f29615a.v();
                do {
                    list.add(Boolean.valueOf(this.f29615a.f()));
                } while (this.f29615a.b() < b10);
            }
        }
        S(b10);
    }

    @Override // w1.c1
    public final <T> T z(d1<T> d1Var, o oVar) {
        T(3);
        return (T) P(d1Var, oVar);
    }
}
