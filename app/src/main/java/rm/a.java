package rm;

import bi.z0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import pm.g0;
import pm.q0;
import rm.j;
import um.k;

/* loaded from: classes2.dex */
public abstract class a<E> extends rm.c<E> implements rm.g<E> {

    /* renamed from: rm.a$a */
    /* loaded from: classes2.dex */
    public static final class C0465a<E> implements rm.i<E> {

        /* renamed from: a */
        public final a<E> f25801a;

        /* renamed from: b */
        public Object f25802b = rm.b.f25824d;

        public C0465a(a<E> aVar) {
            this.f25801a = aVar;
        }

        @Override // rm.i
        public final Object a(zl.i iVar) {
            Object f10;
            um.r rVar;
            Object obj = this.f25802b;
            um.x xVar = rm.b.f25824d;
            boolean z10 = false;
            if (obj != xVar) {
                if (obj instanceof m) {
                    m mVar = (m) obj;
                    if (mVar.f25856d != null) {
                        Throwable W = mVar.W();
                        int i10 = um.w.f28941a;
                        throw W;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            Object A = this.f25801a.A();
            this.f25802b = A;
            if (A != xVar) {
                if (A instanceof m) {
                    m mVar2 = (m) A;
                    if (mVar2.f25856d != null) {
                        Throwable W2 = mVar2.W();
                        int i11 = um.w.f28941a;
                        throw W2;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            pm.j l10 = h7.a.l(mf.a0.i(iVar));
            d dVar = new d(this, l10);
            while (true) {
                if (this.f25801a.s(dVar)) {
                    a<E> aVar = this.f25801a;
                    aVar.getClass();
                    l10.z(new f(dVar));
                    break;
                }
                Object A2 = this.f25801a.A();
                this.f25802b = A2;
                if (A2 instanceof m) {
                    m mVar3 = (m) A2;
                    if (mVar3.f25856d == null) {
                        f10 = Boolean.FALSE;
                    } else {
                        f10 = mf.a0.f(mVar3.W());
                    }
                    l10.l(f10);
                } else if (A2 != rm.b.f25824d) {
                    Boolean bool = Boolean.TRUE;
                    fm.l<E, tl.l> lVar = this.f25801a.f25834a;
                    if (lVar != null) {
                        rVar = new um.r(lVar, A2, l10.f24353e);
                    } else {
                        rVar = null;
                    }
                    l10.C(bool, l10.f24369c, rVar);
                }
            }
            return l10.t();
        }

        @Override // rm.i
        public final E next() {
            E e10 = (E) this.f25802b;
            if (e10 instanceof m) {
                Throwable W = ((m) e10).W();
                int i10 = um.w.f28941a;
                throw W;
            }
            um.x xVar = rm.b.f25824d;
            if (e10 != xVar) {
                this.f25802b = xVar;
                return e10;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    /* loaded from: classes2.dex */
    public static class b<E> extends u<E> {

        /* renamed from: d */
        public final pm.i<Object> f25803d;

        /* renamed from: e */
        public final int f25804e;

        public b(pm.j jVar, int i10) {
            this.f25803d = jVar;
            this.f25804e = i10;
        }

        @Override // rm.u
        public final void S(m<?> mVar) {
            pm.i<Object> iVar;
            Object f10;
            if (this.f25804e == 1) {
                iVar = this.f25803d;
                f10 = new rm.j(new j.a(mVar.f25856d));
            } else {
                iVar = this.f25803d;
                f10 = mf.a0.f(mVar.W());
            }
            iVar.l(f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rm.w
        public final um.x d(Object obj) {
            rm.j jVar;
            pm.i<Object> iVar = this.f25803d;
            if (this.f25804e == 1) {
                jVar = new rm.j(obj);
            } else {
                jVar = obj;
            }
            if (iVar.r(jVar, null, R(obj)) == null) {
                return null;
            }
            return pm.k.f24356a;
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ReceiveElement@");
            a10.append(g0.j(this));
            a10.append("[receiveMode=");
            return a1.b.a(a10, this.f25804e, ']');
        }

        @Override // rm.w
        public final void y(E e10) {
            this.f25803d.i();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<E> extends b<E> {

        /* renamed from: f */
        public final fm.l<E, tl.l> f25805f;

        public c(pm.j jVar, int i10, fm.l lVar) {
            super(jVar, i10);
            this.f25805f = lVar;
        }

        @Override // rm.u
        public final fm.l<Throwable, tl.l> R(E e10) {
            return new um.r(this.f25805f, e10, this.f25803d.e());
        }
    }

    /* loaded from: classes2.dex */
    public static class d<E> extends u<E> {

        /* renamed from: d */
        public final C0465a<E> f25806d;

        /* renamed from: e */
        public final pm.i<Boolean> f25807e;

        public d(C0465a c0465a, pm.j jVar) {
            this.f25806d = c0465a;
            this.f25807e = jVar;
        }

        @Override // rm.u
        public final fm.l<Throwable, tl.l> R(E e10) {
            fm.l<E, tl.l> lVar = this.f25806d.f25801a.f25834a;
            if (lVar != null) {
                return new um.r(lVar, e10, this.f25807e.e());
            }
            return null;
        }

        @Override // rm.u
        public final void S(m<?> mVar) {
            um.x w10;
            if (mVar.f25856d == null) {
                w10 = this.f25807e.f(Boolean.FALSE, null);
            } else {
                w10 = this.f25807e.w(mVar.W());
            }
            if (w10 != null) {
                this.f25806d.f25802b = mVar;
                this.f25807e.i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rm.w
        public final um.x d(Object obj) {
            if (this.f25807e.r(Boolean.TRUE, null, R(obj)) == null) {
                return null;
            }
            return pm.k.f24356a;
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ReceiveHasNext@");
            a10.append(g0.j(this));
            return a10.toString();
        }

        @Override // rm.w
        public final void y(E e10) {
            this.f25806d.f25802b = e10;
            this.f25807e.i();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<R, E> extends u<E> implements q0 {

        /* renamed from: d */
        public final a<E> f25808d;

        /* renamed from: e */
        public final xm.c<R> f25809e;

        /* renamed from: f */
        public final fm.p<Object, xl.d<? super R>, Object> f25810f;

        /* renamed from: g */
        public final int f25811g;

        public e(int i10, fm.p pVar, a aVar, xm.c cVar) {
            this.f25808d = aVar;
            this.f25809e = cVar;
            this.f25810f = pVar;
            this.f25811g = i10;
        }

        @Override // rm.u
        public final fm.l<Throwable, tl.l> R(E e10) {
            fm.l<E, tl.l> lVar = this.f25808d.f25834a;
            if (lVar != null) {
                return new um.r(lVar, e10, this.f25809e.x().e());
            }
            return null;
        }

        @Override // rm.u
        public final void S(m<?> mVar) {
            if (!this.f25809e.p()) {
                return;
            }
            int i10 = this.f25811g;
            if (i10 != 0) {
                if (i10 == 1) {
                    fm.p<Object, xl.d<? super R>, Object> pVar = this.f25810f;
                    rm.j jVar = new rm.j(new j.a(mVar.f25856d));
                    xm.a x10 = this.f25809e.x();
                    try {
                        um.h.a(mf.a0.i(mf.a0.e(jVar, x10, pVar)), tl.l.f28297a, null);
                        return;
                    } catch (Throwable th2) {
                        x10.l(mf.a0.f(th2));
                        throw th2;
                    }
                }
                return;
            }
            this.f25809e.B(mVar.W());
        }

        @Override // pm.q0
        public final void c() {
            if (N()) {
                this.f25808d.getClass();
            }
        }

        @Override // rm.w
        public final um.x d(Object obj) {
            return (um.x) this.f25809e.n();
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("ReceiveSelect@");
            a10.append(g0.j(this));
            a10.append('[');
            a10.append(this.f25809e);
            a10.append(",receiveMode=");
            return a1.b.a(a10, this.f25811g, ']');
        }

        @Override // rm.w
        public final void y(E e10) {
            Object obj;
            fm.p<Object, xl.d<? super R>, Object> pVar = this.f25810f;
            if (this.f25811g == 1) {
                obj = new rm.j(e10);
            } else {
                obj = e10;
            }
            xm.a x10 = this.f25809e.x();
            try {
                um.h.a(mf.a0.i(mf.a0.e(obj, x10, pVar)), tl.l.f28297a, R(e10));
            } catch (Throwable th2) {
                x10.l(mf.a0.f(th2));
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class f extends pm.c {

        /* renamed from: a */
        public final u<?> f25812a;

        public f(u<?> uVar) {
            a.this = r1;
            this.f25812a = uVar;
        }

        @Override // pm.h
        public final void a(Throwable th2) {
            if (this.f25812a.N()) {
                a.this.getClass();
            }
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
            a(th2);
            return tl.l.f28297a;
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("RemoveReceiveOnCancel[");
            a10.append(this.f25812a);
            a10.append(']');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<E> extends k.d<y> {
        public g(um.j jVar) {
            super(jVar);
        }

        @Override // um.k.d, um.k.a
        public final Object c(um.k kVar) {
            if (kVar instanceof m) {
                return kVar;
            }
            if (kVar instanceof y) {
                return null;
            }
            return rm.b.f25824d;
        }

        @Override // um.k.a
        public final Object h(k.c cVar) {
            um.x U = ((y) cVar.f28919a).U(cVar);
            if (U == null) {
                return um.l.f28925a;
            }
            um.x xVar = um.c.f28893b;
            if (U == xVar) {
                return xVar;
            }
            return null;
        }

        @Override // um.k.a
        public final void i(um.k kVar) {
            ((y) kVar).V();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends k.b {

        /* renamed from: d */
        public final /* synthetic */ a f25814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(um.k kVar, a aVar) {
            super(kVar);
            this.f25814d = aVar;
        }

        @Override // um.d
        public final Object i(um.k kVar) {
            if (this.f25814d.v()) {
                return null;
            }
            return m6.a.f20386a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements xm.b<rm.j<? extends E>> {

        /* renamed from: a */
        public final /* synthetic */ a<E> f25815a;

        public i(a<E> aVar) {
            this.f25815a = aVar;
        }

        @Override // xm.b
        public final <R> void t(xm.c<? super R> cVar, fm.p<? super rm.j<? extends E>, ? super xl.d<? super R>, ? extends Object> pVar) {
            a.r(1, pVar, this.f25815a, cVar);
        }
    }

    @zl.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    /* loaded from: classes2.dex */
    public static final class j extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f25816d;

        /* renamed from: e */
        public final /* synthetic */ a<E> f25817e;

        /* renamed from: f */
        public int f25818f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(a<E> aVar, xl.d<? super j> dVar) {
            super(dVar);
            this.f25817e = aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f25816d = obj;
            this.f25818f |= Integer.MIN_VALUE;
            Object x10 = this.f25817e.x(this);
            return x10 == yl.a.COROUTINE_SUSPENDED ? x10 : new rm.j(x10);
        }
    }

    public a(fm.l<? super E, tl.l> lVar) {
        super(lVar);
    }

    public static final void r(int i10, fm.p pVar, a aVar, xm.c cVar) {
        boolean z10;
        aVar.getClass();
        while (!cVar.u()) {
            if (!(aVar.f25835b.J() instanceof y) && aVar.v()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e eVar = new e(i10, pVar, aVar, cVar);
                boolean s10 = aVar.s(eVar);
                if (s10) {
                    cVar.v(eVar);
                }
                if (s10) {
                    return;
                }
            } else {
                Object B = aVar.B(cVar);
                if (B == xm.d.f30642b) {
                    return;
                }
                if (B != rm.b.f25824d && B != um.c.f28893b) {
                    boolean z11 = B instanceof m;
                    if (z11) {
                        if (i10 != 0) {
                            if (i10 == 1 && cVar.p()) {
                                B = new rm.j(new j.a(((m) B).f25856d));
                            }
                        } else {
                            Throwable W = ((m) B).W();
                            int i11 = um.w.f28941a;
                            throw W;
                        }
                    } else if (i10 == 1) {
                        if (z11) {
                            B = new j.a(((m) B).f25856d);
                        }
                        B = new rm.j(B);
                    }
                    gm.f.c(B, cVar.x(), pVar);
                }
            }
        }
    }

    public Object A() {
        while (true) {
            y q10 = q();
            if (q10 == null) {
                return rm.b.f25824d;
            }
            if (q10.U(null) != null) {
                q10.R();
                return q10.S();
            }
            q10.V();
        }
    }

    public Object B(xm.c<?> cVar) {
        g gVar = new g(this.f25835b);
        Object C = cVar.C(gVar);
        if (C != null) {
            return C;
        }
        ((y) gVar.m()).R();
        return ((y) gVar.m()).S();
    }

    public final Object C(xl.d<? super E> dVar) {
        Object A = A();
        return (A == rm.b.f25824d || (A instanceof m)) ? E(0, (zl.c) dVar) : A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [rm.a$b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [rm.c, rm.a, rm.a<E>] */
    public final Object E(int i10, zl.c cVar) {
        c cVar2;
        Object obj;
        pm.j l10 = h7.a.l(mf.a0.i(cVar));
        if (this.f25834a == null) {
            cVar2 = new b(l10, i10);
        } else {
            cVar2 = new c(l10, i10, this.f25834a);
        }
        while (true) {
            if (s(cVar2)) {
                l10.z(new f(cVar2));
                break;
            }
            Object A = A();
            if (A instanceof m) {
                cVar2.S((m) A);
                break;
            } else if (A != rm.b.f25824d) {
                if (cVar2.f25804e == 1) {
                    obj = new rm.j(A);
                } else {
                    obj = A;
                }
                l10.C(obj, l10.f24369c, cVar2.R(A));
            }
        }
        return l10.t();
    }

    @Override // rm.v
    public final xm.b<rm.j<E>> c() {
        return new i(this);
    }

    @Override // rm.v
    public final void h(CancellationException cancellationException) {
        if (w()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
        }
        y(o(cancellationException));
    }

    @Override // rm.v
    public final rm.i<E> iterator() {
        return new C0465a(this);
    }

    @Override // rm.c
    public final w<E> l() {
        w<E> l10 = super.l();
        if (l10 != null) {
            boolean z10 = l10 instanceof m;
        }
        return l10;
    }

    @Override // rm.v
    public final Object m() {
        Object A = A();
        return A == rm.b.f25824d ? rm.j.f25849b : A instanceof m ? new j.a(((m) A).f25856d) : A;
    }

    public boolean s(u<? super E> uVar) {
        int Q;
        um.k K;
        if (t()) {
            um.j jVar = this.f25835b;
            do {
                K = jVar.K();
                if (!(!(K instanceof y))) {
                }
            } while (!K.D(uVar, jVar));
            return true;
        }
        um.k kVar = this.f25835b;
        h hVar = new h(uVar, this);
        do {
            um.k K2 = kVar.K();
            if (!(!(K2 instanceof y))) {
                break;
            }
            Q = K2.Q(uVar, kVar, hVar);
            if (Q == 1) {
                return true;
            }
        } while (Q != 2);
        return false;
    }

    public abstract boolean t();

    public abstract boolean v();

    public boolean w() {
        m mVar;
        um.k J = this.f25835b.J();
        m mVar2 = null;
        if (J instanceof m) {
            mVar = (m) J;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            rm.c.g(mVar);
            mVar2 = mVar;
        }
        if (mVar2 != null && v()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
    @Override // rm.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(xl.d<? super rm.j<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rm.a.j
            if (r0 == 0) goto L13
            r0 = r5
            rm.a$j r0 = (rm.a.j) r0
            int r1 = r0.f25818f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25818f = r1
            goto L18
        L13:
            rm.a$j r0 = new rm.a$j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25816d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f25818f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            mf.a0.k(r5)
            java.lang.Object r5 = r4.A()
            um.x r2 = rm.b.f25824d
            if (r5 == r2) goto L49
            boolean r0 = r5 instanceof rm.m
            if (r0 == 0) goto L48
            rm.m r5 = (rm.m) r5
            java.lang.Throwable r5 = r5.f25856d
            rm.j$a r0 = new rm.j$a
            r0.<init>(r5)
            r5 = r0
        L48:
            return r5
        L49:
            r0.f25818f = r3
            java.lang.Object r5 = r4.E(r3, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            rm.j r5 = (rm.j) r5
            java.lang.Object r5 = r5.f25850a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.a.x(xl.d):java.lang.Object");
    }

    public void y(boolean z10) {
        m<?> f10 = f();
        if (f10 != null) {
            Object obj = null;
            while (true) {
                um.k K = f10.K();
                if (K instanceof um.j) {
                    z(obj, f10);
                    return;
                } else if (!K.N()) {
                    ((um.t) K.I()).f28939a.L();
                } else {
                    obj = z0.k(obj, (y) K);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void z(Object obj, m<?> mVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((y) obj).T(mVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((y) arrayList.get(size)).T(mVar);
            }
        }
    }
}
