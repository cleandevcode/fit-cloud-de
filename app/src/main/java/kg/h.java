package kg;

import bi.r;
import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import fm.p;
import kg.f;
import mf.a0;
import mg.sa;
import pm.e0;
import sm.b1;
import sm.t0;

/* loaded from: classes2.dex */
public final class h extends f<pg.k> implements g {

    /* renamed from: b */
    public final e0 f18504b;

    /* renamed from: c */
    public final AppDatabase f18505c;

    /* renamed from: d */
    public final vg.d f18506d;

    /* renamed from: e */
    public final t0 f18507e;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UnitConfigRepositoryImpl$adjustTimeError$1", f = "UnitConfigRepository.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18508e;

        /* renamed from: g */
        public final /* synthetic */ long f18510g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, xl.d<? super a> dVar) {
            super(2, dVar);
            h.this = r1;
            this.f18510g = j10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f18510g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18508e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                sa t10 = h.this.f18505c.t();
                long j10 = this.f18510g;
                long currentTimeMillis = System.currentTimeMillis();
                this.f18508e = 1;
                if (t10.b(j10, currentTimeMillis, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UnitConfigRepositoryImpl", f = "UnitConfigRepository.kt", l = {83}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f18511d;

        /* renamed from: f */
        public int f18513f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            h.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18511d = obj;
            this.f18513f |= Integer.MIN_VALUE;
            return h.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UnitConfigRepositoryImpl$modify$1", f = "UnitConfigRepository.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18514e;

        /* renamed from: f */
        public final /* synthetic */ long f18515f;

        /* renamed from: g */
        public final /* synthetic */ uf.b f18516g;

        /* renamed from: h */
        public final /* synthetic */ h f18517h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, uf.b bVar, h hVar, xl.d<? super c> dVar) {
            super(2, dVar);
            this.f18515f = j10;
            this.f18516g = bVar;
            this.f18517h = hVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f18515f, this.f18516g, this.f18517h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18514e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                long j10 = this.f18515f;
                uf.b bVar = this.f18516g;
                pg.k kVar = new pg.k(j10, bVar.f28707a, bVar.f28708b, bVar.f28709c, System.currentTimeMillis());
                kVar.f24053b = 1;
                sa t10 = this.f18517h.f18505c.t();
                pg.k[] kVarArr = {kVar};
                this.f18514e = 1;
                if (t10.m(kVarArr, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e0 e0Var, yg.b bVar, AppDatabase appDatabase, vg.d dVar) {
        super(bVar);
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(appDatabase, "appDatabase");
        this.f18504b = e0Var;
        this.f18505c = appDatabase;
        this.f18506d = dVar;
        this.f18507e = r.M(new j(r.O(bVar.f31487f, new i(this, null))), e0Var, b1.a.f27123a, new uf.b(0, 0, 0));
    }

    @Override // kg.f
    public final Object K(long j10, zl.c cVar) {
        return this.f18505c.t().p(j10, cVar);
    }

    @Override // kg.f
    public final Object L(long j10, f.a aVar) {
        return vg.e.h(this.f18506d, j10, aVar);
    }

    @Override // kg.f
    public final Object M(pg.j jVar, pg.j jVar2, f.a aVar) {
        Object u10 = this.f18505c.t().u((pg.k) jVar, (pg.k) jVar2, aVar);
        return u10 == yl.a.COROUTINE_SUSPENDED ? u10 : tl.l.f28297a;
    }

    @Override // kg.f
    public final Object N(long j10, pg.j jVar, f.a aVar) {
        return vg.e.l(this.f18506d, j10, (pg.k) jVar, aVar);
    }

    @Override // kg.g
    public final t0 a() {
        return this.f18507e;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    @Override // kg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(long r5, xl.d<? super java.lang.Integer> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kg.h.b
            if (r0 == 0) goto L13
            r0 = r7
            kg.h$b r0 = (kg.h.b) r0
            int r1 = r0.f18513f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18513f = r1
            goto L18
        L13:
            kg.h$b r0 = new kg.h$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18511d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18513f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r7)
            r0.f18513f = r3
            java.lang.Object r7 = r4.K(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            pg.k r7 = (pg.k) r7
            if (r7 == 0) goto L44
            int r5 = r7.f24053b
            if (r5 == 0) goto L44
            goto L45
        L44:
            r3 = 0
        L45:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.h.h(long, xl.d):java.lang.Object");
    }

    @Override // kg.g
    public final void j(long j10, uf.b bVar) {
        a0.j(this.f18504b, new c(j10, bVar, this, null));
    }

    @Override // kg.g
    public final void l(long j10) {
        a0.j(this.f18504b, new a(j10, null));
    }
}
