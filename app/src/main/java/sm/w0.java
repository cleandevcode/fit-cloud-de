package sm;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class w0<T> extends tm.b<y0> implements q0<T>, f, tm.o<T> {

    /* renamed from: e */
    public final int f27321e;

    /* renamed from: f */
    public final int f27322f;

    /* renamed from: g */
    public final rm.f f27323g;

    /* renamed from: h */
    public Object[] f27324h;

    /* renamed from: i */
    public long f27325i;

    /* renamed from: j */
    public long f27326j;

    /* renamed from: k */
    public int f27327k;

    /* renamed from: l */
    public int f27328l;

    /* loaded from: classes2.dex */
    public static final class a implements pm.q0 {

        /* renamed from: a */
        public final w0<?> f27329a;

        /* renamed from: b */
        public long f27330b;

        /* renamed from: c */
        public final Object f27331c;

        /* renamed from: d */
        public final xl.d<tl.l> f27332d;

        public a(w0 w0Var, long j10, Object obj, pm.j jVar) {
            this.f27329a = w0Var;
            this.f27330b = j10;
            this.f27331c = obj;
            this.f27332d = jVar;
        }

        @Override // pm.q0
        public final void c() {
            w0<?> w0Var = this.f27329a;
            synchronized (w0Var) {
                if (this.f27330b >= w0Var.q()) {
                    Object[] objArr = w0Var.f27324h;
                    gm.l.c(objArr);
                    int i10 = (int) this.f27330b;
                    if (objArr[(objArr.length - 1) & i10] == this) {
                        objArr[i10 & (objArr.length - 1)] = qi.h.f24862a;
                        w0Var.j();
                        tl.l lVar = tl.l.f28297a;
                    }
                }
            }
        }
    }

    public w0(int i10, int i11, rm.f fVar) {
        this.f27321e = i10;
        this.f27322f = i11;
        this.f27323g = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b0, code lost:
        throw r8.v();
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yl.a k(sm.w0 r8, sm.g r9, xl.d r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.w0.k(sm.w0, sm.g, xl.d):yl.a");
    }

    @Override // sm.v0, sm.f
    public final Object a(g<? super T> gVar, xl.d<?> dVar) {
        k(this, gVar, dVar);
        return yl.a.COROUTINE_SUSPENDED;
    }

    @Override // tm.o
    public final f<T> b(xl.f fVar, int i10, rm.f fVar2) {
        return ((i10 == 0 || i10 == -3) && fVar2 == rm.f.SUSPEND) ? this : new tm.i(i10, fVar, fVar2, this);
    }

    @Override // sm.q0
    public final void c() {
        synchronized (this) {
            v(q() + this.f27327k, this.f27326j, q() + this.f27327k, q() + this.f27327k + this.f27328l);
            tl.l lVar = tl.l.f28297a;
        }
    }

    @Override // sm.q0
    public final boolean d(T t10) {
        int i10;
        boolean z10;
        xl.d<tl.l>[] dVarArr = ie.b.f16773c;
        synchronized (this) {
            if (s(t10)) {
                dVarArr = p(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (xl.d<tl.l> dVar : dVarArr) {
            if (dVar != null) {
                dVar.l(tl.l.f28297a);
            }
        }
        return z10;
    }

    @Override // tm.b
    public final y0 f() {
        return new y0();
    }

    @Override // tm.b
    public final tm.c[] g() {
        return new y0[2];
    }

    public final Object i(y0 y0Var, x0 x0Var) {
        pm.j jVar = new pm.j(1, mf.a0.i(x0Var));
        jVar.u();
        synchronized (this) {
            if (t(y0Var) < 0) {
                y0Var.f27354b = jVar;
            } else {
                jVar.l(tl.l.f28297a);
            }
            tl.l lVar = tl.l.f28297a;
        }
        Object t10 = jVar.t();
        if (t10 == yl.a.COROUTINE_SUSPENDED) {
            return t10;
        }
        return tl.l.f28297a;
    }

    public final void j() {
        if (this.f27322f == 0 && this.f27328l <= 1) {
            return;
        }
        Object[] objArr = this.f27324h;
        gm.l.c(objArr);
        while (this.f27328l > 0) {
            long q10 = q();
            int i10 = this.f27327k;
            int i11 = this.f27328l;
            if (objArr[(objArr.length - 1) & ((int) ((q10 + (i10 + i11)) - 1))] == qi.h.f24862a) {
                this.f27328l = i11 - 1;
                objArr[(objArr.length - 1) & ((int) (q() + this.f27327k + this.f27328l))] = null;
            } else {
                return;
            }
        }
    }

    public final void l() {
        Object[] objArr;
        Object[] objArr2 = this.f27324h;
        gm.l.c(objArr2);
        objArr2[(objArr2.length - 1) & ((int) q())] = null;
        this.f27327k--;
        long q10 = q() + 1;
        if (this.f27325i < q10) {
            this.f27325i = q10;
        }
        if (this.f27326j < q10) {
            if (this.f28302b != 0 && (objArr = this.f28301a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        y0 y0Var = (y0) obj;
                        long j10 = y0Var.f27353a;
                        if (j10 >= 0 && j10 < q10) {
                            y0Var.f27353a = q10;
                        }
                    }
                }
            }
            this.f27326j = q10;
        }
    }

    public final void m(Object obj) {
        int i10 = this.f27327k + this.f27328l;
        Object[] objArr = this.f27324h;
        if (objArr == null) {
            objArr = r(0, 2, null);
        } else if (i10 >= objArr.length) {
            objArr = r(i10, objArr.length * 2, objArr);
        }
        objArr[((int) (q() + i10)) & (objArr.length - 1)] = obj;
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        xl.d<tl.l>[] dVarArr;
        a aVar;
        if (!d(t10)) {
            pm.j jVar = new pm.j(1, mf.a0.i(dVar));
            jVar.u();
            xl.d<tl.l>[] dVarArr2 = ie.b.f16773c;
            synchronized (this) {
                if (s(t10)) {
                    jVar.l(tl.l.f28297a);
                    dVarArr = p(dVarArr2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, this.f27327k + this.f27328l + q(), t10, jVar);
                    m(aVar2);
                    this.f27328l++;
                    if (this.f27322f == 0) {
                        dVarArr2 = p(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                jVar.z(new pm.r0(aVar));
            }
            for (xl.d<tl.l> dVar2 : dVarArr) {
                if (dVar2 != null) {
                    dVar2.l(tl.l.f28297a);
                }
            }
            Object t11 = jVar.t();
            yl.a aVar3 = yl.a.COROUTINE_SUSPENDED;
            if (t11 != aVar3) {
                t11 = tl.l.f28297a;
            }
            if (t11 == aVar3) {
                return t11;
            }
        }
        return tl.l.f28297a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final xl.d<tl.l>[] p(xl.d<tl.l>[] dVarArr) {
        Object[] objArr;
        y0 y0Var;
        pm.j jVar;
        int length = dVarArr.length;
        if (this.f28302b != 0 && (objArr = this.f28301a) != null) {
            int i10 = 0;
            int length2 = objArr.length;
            dVarArr = dVarArr;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj != null && (jVar = (y0Var = (y0) obj).f27354b) != null && t(y0Var) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        gm.l.e(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = jVar;
                    y0Var.f27354b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long q() {
        return Math.min(this.f27326j, this.f27325i);
    }

    public final Object[] r(int i10, int i11, Object[] objArr) {
        boolean z10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i11];
            this.f27324h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long q10 = q();
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = (int) (i12 + q10);
                objArr2[i13 & (i11 - 1)] = objArr[(objArr.length - 1) & i13];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean s(T t10) {
        if (this.f28302b == 0) {
            if (this.f27321e != 0) {
                m(t10);
                int i10 = this.f27327k + 1;
                this.f27327k = i10;
                if (i10 > this.f27321e) {
                    l();
                }
                this.f27326j = q() + this.f27327k;
            }
            return true;
        }
        if (this.f27327k >= this.f27322f && this.f27326j <= this.f27325i) {
            int ordinal = this.f27323g.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m(t10);
        int i11 = this.f27327k + 1;
        this.f27327k = i11;
        if (i11 > this.f27322f) {
            l();
        }
        long q10 = q() + this.f27327k;
        long j10 = this.f27325i;
        if (((int) (q10 - j10)) > this.f27321e) {
            v(j10 + 1, this.f27326j, q() + this.f27327k, q() + this.f27327k + this.f27328l);
        }
        return true;
    }

    public final long t(y0 y0Var) {
        long j10 = y0Var.f27353a;
        if (j10 < q() + this.f27327k) {
            return j10;
        }
        if (this.f27322f > 0 || j10 > q() || this.f27328l == 0) {
            return -1L;
        }
        return j10;
    }

    public final Object u(y0 y0Var) {
        Object obj;
        xl.d<tl.l>[] dVarArr = ie.b.f16773c;
        synchronized (this) {
            long t10 = t(y0Var);
            if (t10 < 0) {
                obj = qi.h.f24862a;
            } else {
                long j10 = y0Var.f27353a;
                Object[] objArr = this.f27324h;
                gm.l.c(objArr);
                Object obj2 = objArr[((int) t10) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f27331c;
                }
                y0Var.f27353a = t10 + 1;
                Object obj3 = obj2;
                dVarArr = w(j10);
                obj = obj3;
            }
        }
        for (xl.d<tl.l> dVar : dVarArr) {
            if (dVar != null) {
                dVar.l(tl.l.f28297a);
            }
        }
        return obj;
    }

    public final void v(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long q10 = q(); q10 < min; q10++) {
            Object[] objArr = this.f27324h;
            gm.l.c(objArr);
            objArr[((int) q10) & (objArr.length - 1)] = null;
        }
        this.f27325i = j10;
        this.f27326j = j11;
        this.f27327k = (int) (j12 - min);
        this.f27328l = (int) (j13 - j12);
    }

    public final xl.d<tl.l>[] w(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        Object[] objArr;
        if (j10 > this.f27326j) {
            return ie.b.f16773c;
        }
        long q10 = q();
        long j15 = this.f27327k + q10;
        if (this.f27322f == 0 && this.f27328l > 0) {
            j15++;
        }
        if (this.f28302b != 0 && (objArr = this.f28301a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j16 = ((y0) obj).f27353a;
                    if (j16 >= 0 && j16 < j15) {
                        j15 = j16;
                    }
                }
            }
        }
        if (j15 <= this.f27326j) {
            return ie.b.f16773c;
        }
        long q11 = q() + this.f27327k;
        if (this.f28302b > 0) {
            i10 = Math.min(this.f27328l, this.f27322f - ((int) (q11 - j15)));
        } else {
            i10 = this.f27328l;
        }
        xl.d<tl.l>[] dVarArr = ie.b.f16773c;
        long j17 = this.f27328l + q11;
        if (i10 > 0) {
            dVarArr = new xl.d[i10];
            Object[] objArr2 = this.f27324h;
            gm.l.c(objArr2);
            long j18 = q11;
            int i11 = 0;
            while (true) {
                if (q11 < j17) {
                    int i12 = (int) q11;
                    j11 = j15;
                    Object obj2 = objArr2[(objArr2.length - 1) & i12];
                    um.x xVar = qi.h.f24862a;
                    if (obj2 != xVar) {
                        if (obj2 != null) {
                            a aVar = (a) obj2;
                            j12 = j17;
                            int i13 = i11 + 1;
                            dVarArr[i11] = aVar.f27332d;
                            objArr2[i12 & (objArr2.length - 1)] = xVar;
                            objArr2[((int) j18) & (objArr2.length - 1)] = aVar.f27331c;
                            j14 = 1;
                            j18++;
                            if (i13 >= i10) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j12 = j17;
                        j14 = 1;
                    }
                    q11 += j14;
                    j15 = j11;
                    j17 = j12;
                } else {
                    j11 = j15;
                    j12 = j17;
                    break;
                }
            }
            q11 = j18;
        } else {
            j11 = j15;
            j12 = j17;
        }
        int i14 = (int) (q11 - q10);
        if (this.f28302b == 0) {
            j13 = q11;
        } else {
            j13 = j11;
        }
        long max = Math.max(this.f27325i, q11 - Math.min(this.f27321e, i14));
        if (this.f27322f == 0 && max < j12) {
            Object[] objArr3 = this.f27324h;
            gm.l.c(objArr3);
            if (gm.l.a(objArr3[((int) max) & (objArr3.length - 1)], qi.h.f24862a)) {
                q11++;
                max++;
            }
        }
        v(max, j13, q11, j12);
        j();
        if (dVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return p(dVarArr);
        }
        return dVarArr;
    }
}
