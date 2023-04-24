package lg;

import com.topstep.fitcloud.pro.model.data.SportTotal;
import com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache;
import mg.d9;
import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowTotalCache$1", f = "SportRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q0 extends zl.i implements fm.p<SportTotalCache, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f19878e;

    /* renamed from: f */
    public final /* synthetic */ long f19879f;

    /* renamed from: g */
    public final /* synthetic */ r0 f19880g;

    /* renamed from: h */
    public final /* synthetic */ long f19881h;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowTotalCache$1$1", f = "SportRepository.kt", l = {90, 91}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19882e;

        /* renamed from: f */
        public final /* synthetic */ r0 f19883f;

        /* renamed from: g */
        public final /* synthetic */ long f19884g;

        /* renamed from: h */
        public final /* synthetic */ long f19885h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, long j11, r0 r0Var, xl.d dVar) {
            super(2, dVar);
            this.f19883f = r0Var;
            this.f19884g = j10;
            this.f19885h = j11;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f19884g, this.f19885h, this.f19883f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19882e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        mf.a0.k(obj);
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                vg.d dVar = this.f19883f.f19896e;
                long j10 = this.f19884g;
                this.f19882e = 1;
                obj = dVar.K(j10, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            SportTotal sportTotal = (SportTotal) ((vg.k) obj).f29381c;
            d9 E = this.f19883f.f19893b.E();
            long j11 = this.f19884g;
            SportTotalCache sportTotalCache = new SportTotalCache(sportTotal.f9647b, sportTotal.f9646a, 0, this.f19885h);
            this.f19882e = 2;
            if (E.q(j11, sportTotalCache, this) == aVar) {
                return aVar;
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(long j10, long j11, r0 r0Var, xl.d dVar) {
        super(2, dVar);
        this.f19879f = j10;
        this.f19880g = r0Var;
        this.f19881h = j11;
    }

    @Override // fm.p
    public final Object A(SportTotalCache sportTotalCache, xl.d<? super tl.l> dVar) {
        return ((q0) p(sportTotalCache, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        q0 q0Var = new q0(this.f19879f, this.f19881h, this.f19880g, dVar);
        q0Var.f19878e = obj;
        return q0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        SportTotalCache sportTotalCache = (SportTotalCache) this.f19878e;
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportRepository");
        bVar.h("total cache:%s", sportTotalCache.toString());
        long j10 = sportTotalCache.f10082d;
        long j11 = this.f19879f;
        if (j10 != j11 || sportTotalCache.f10081c != 0) {
            r0 r0Var = this.f19880g;
            mf.a0.j(r0Var.f19894c, new a(this.f19881h, j11, r0Var, null));
        }
        return tl.l.f28297a;
    }
}
