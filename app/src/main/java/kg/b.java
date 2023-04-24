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
public final class b extends f<pg.f> implements kg.a {

    /* renamed from: b */
    public final e0 f18476b;

    /* renamed from: c */
    public final AppDatabase f18477c;

    /* renamed from: d */
    public final vg.d f18478d;

    /* renamed from: e */
    public final t0 f18479e;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.ExerciseGoalRepositoryImpl", f = "ExerciseGoalRepository.kt", l = {82}, m = "getNewDataCount")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f18480d;

        /* renamed from: f */
        public int f18482f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            b.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18480d = obj;
            this.f18482f |= Integer.MIN_VALUE;
            return b.this.h(0L, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.ExerciseGoalRepositoryImpl$modify$1", f = "ExerciseGoalRepository.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: kg.b$b */
    /* loaded from: classes2.dex */
    public static final class C0317b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18483e;

        /* renamed from: f */
        public final /* synthetic */ long f18484f;

        /* renamed from: g */
        public final /* synthetic */ uf.a f18485g;

        /* renamed from: h */
        public final /* synthetic */ b f18486h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0317b(long j10, uf.a aVar, b bVar, xl.d<? super C0317b> dVar) {
            super(2, dVar);
            this.f18484f = j10;
            this.f18485g = aVar;
            this.f18486h = bVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0317b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new C0317b(this.f18484f, this.f18485g, this.f18486h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18483e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                long j10 = this.f18484f;
                uf.a aVar2 = this.f18485g;
                pg.f fVar = new pg.f(j10, aVar2.f28704a, aVar2.f28705b, aVar2.f28706c, System.currentTimeMillis());
                fVar.f24053b = 1;
                sa t10 = this.f18486h.f18477c.t();
                pg.f[] fVarArr = {fVar};
                this.f18483e = 1;
                if (t10.l(fVarArr, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e0 e0Var, yg.b bVar, AppDatabase appDatabase, vg.d dVar) {
        super(bVar);
        gm.l.f(e0Var, "applicationScope");
        gm.l.f(appDatabase, "appDatabase");
        this.f18476b = e0Var;
        this.f18477c = appDatabase;
        this.f18478d = dVar;
        this.f18479e = r.M(new d(r.O(bVar.f31487f, new c(this, null))), e0Var, b1.a.f27123a, new uf.a(0));
    }

    @Override // kg.a
    public final void C(long j10, uf.a aVar) {
        a0.j(this.f18476b, new C0317b(j10, aVar, this, null));
    }

    @Override // kg.f
    public final Object K(long j10, zl.c cVar) {
        return this.f18477c.t().o(j10, cVar);
    }

    @Override // kg.f
    public final Object L(long j10, f.a aVar) {
        return vg.e.f(this.f18478d, j10, aVar);
    }

    @Override // kg.f
    public final Object M(pg.j jVar, pg.j jVar2, f.a aVar) {
        Object s10 = this.f18477c.t().s((pg.f) jVar, (pg.f) jVar2, aVar);
        return s10 == yl.a.COROUTINE_SUSPENDED ? s10 : tl.l.f28297a;
    }

    @Override // kg.f
    public final Object N(long j10, pg.j jVar, f.a aVar) {
        return vg.e.j(this.f18478d, j10, (pg.f) jVar, aVar);
    }

    @Override // kg.a
    public final t0 a() {
        return this.f18479e;
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
            boolean r0 = r7 instanceof kg.b.a
            if (r0 == 0) goto L13
            r0 = r7
            kg.b$a r0 = (kg.b.a) r0
            int r1 = r0.f18482f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18482f = r1
            goto L18
        L13:
            kg.b$a r0 = new kg.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18480d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18482f
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
            r0.f18482f = r3
            java.lang.Object r7 = r4.K(r5, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            pg.f r7 = (pg.f) r7
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
        throw new UnsupportedOperationException("Method not decompiled: kg.b.h(long, xl.d):java.lang.Object");
    }
}
