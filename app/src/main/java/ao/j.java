package ao;

import zm.d;

/* loaded from: classes2.dex */
public abstract class j<ResponseT, ReturnT> extends e0<ReturnT> {

    /* renamed from: a */
    public final a0 f3825a;

    /* renamed from: b */
    public final d.a f3826b;

    /* renamed from: c */
    public final f<zm.c0, ResponseT> f3827c;

    /* loaded from: classes2.dex */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* renamed from: d */
        public final ao.c<ResponseT, ReturnT> f3828d;

        public a(a0 a0Var, d.a aVar, f<zm.c0, ResponseT> fVar, ao.c<ResponseT, ReturnT> cVar) {
            super(a0Var, aVar, fVar);
            this.f3828d = cVar;
        }

        @Override // ao.j
        public final Object c(s sVar, Object[] objArr) {
            return this.f3828d.b(sVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d */
        public final ao.c<ResponseT, ao.b<ResponseT>> f3829d;

        /* renamed from: e */
        public final boolean f3830e;

        public b(a0 a0Var, d.a aVar, f fVar, ao.c cVar) {
            super(a0Var, aVar, fVar);
            this.f3829d = cVar;
            this.f3830e = false;
        }

        @Override // ao.j
        public final Object c(s sVar, Object[] objArr) {
            ao.b bVar = (ao.b) this.f3829d.b(sVar);
            xl.d dVar = (xl.d) objArr[objArr.length - 1];
            try {
                if (this.f3830e) {
                    pm.j jVar = new pm.j(1, mf.a0.i(dVar));
                    jVar.z(new m(bVar));
                    bVar.q(new o(jVar));
                    return jVar.t();
                }
                pm.j jVar2 = new pm.j(1, mf.a0.i(dVar));
                jVar2.z(new l(bVar));
                bVar.q(new n(jVar2));
                return jVar2.t();
            } catch (Exception e10) {
                return r.a(e10, dVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* renamed from: d */
        public final ao.c<ResponseT, ao.b<ResponseT>> f3831d;

        public c(a0 a0Var, d.a aVar, f<zm.c0, ResponseT> fVar, ao.c<ResponseT, ao.b<ResponseT>> cVar) {
            super(a0Var, aVar, fVar);
            this.f3831d = cVar;
        }

        @Override // ao.j
        public final Object c(s sVar, Object[] objArr) {
            ao.b bVar = (ao.b) this.f3831d.b(sVar);
            xl.d dVar = (xl.d) objArr[objArr.length - 1];
            try {
                pm.j jVar = new pm.j(1, mf.a0.i(dVar));
                jVar.z(new p(bVar));
                bVar.q(new q(jVar));
                return jVar.t();
            } catch (Exception e10) {
                return r.a(e10, dVar);
            }
        }
    }

    public j(a0 a0Var, d.a aVar, f<zm.c0, ResponseT> fVar) {
        this.f3825a = a0Var;
        this.f3826b = aVar;
        this.f3827c = fVar;
    }

    @Override // ao.e0
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new s(this.f3825a, objArr, this.f3826b, this.f3827c), objArr);
    }

    public abstract Object c(s sVar, Object[] objArr);
}
