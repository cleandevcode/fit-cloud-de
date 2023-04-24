package lg;

import com.topstep.fitcloud.pro.shared.data.entity.data.SportGoalCache;
import no.nordicsemi.android.dfu.DfuBaseService;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowGoal$1$1$1", f = "SportRepository.kt", l = {DfuBaseService.ERROR_REMOTE_TYPE_LEGACY}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19835e;

    /* renamed from: f */
    public final /* synthetic */ r0 f19836f;

    /* renamed from: g */
    public final /* synthetic */ Long f19837g;

    /* renamed from: h */
    public final /* synthetic */ SportGoalCache f19838h;

    /* renamed from: i */
    public final /* synthetic */ long f19839i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r0 r0Var, Long l10, SportGoalCache sportGoalCache, long j10, xl.d<? super m0> dVar) {
        super(2, dVar);
        this.f19836f = r0Var;
        this.f19837g = l10;
        this.f19838h = sportGoalCache;
        this.f19839i = j10;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((m0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new m0(this.f19836f, this.f19837g, this.f19838h, this.f19839i, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19835e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            r0 r0Var = this.f19836f;
            long longValue = this.f19837g.longValue();
            SportGoalCache sportGoalCache = this.f19838h;
            long j10 = this.f19839i;
            this.f19835e = 1;
            if (r0Var.h(longValue, sportGoalCache, j10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
