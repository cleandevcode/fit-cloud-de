package lg;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import l2.l2;
import mg.d7;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportHistoryPagingSource$initialLoad$2", f = "SportHistoryPagingSource.kt", l = {46, 48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends zl.i implements fm.l<xl.d<? super l2.b<Integer, SportRecord>>, Object> {

    /* renamed from: e */
    public int f19745e;

    /* renamed from: f */
    public final /* synthetic */ h0 f19746f;

    /* renamed from: g */
    public final /* synthetic */ l2.a<Integer> f19747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, l2.a<Integer> aVar, xl.d<? super e0> dVar) {
        super(1, dVar);
        this.f19746f = h0Var;
        this.f19747g = aVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super l2.b<Integer, SportRecord>> dVar) {
        return new e0(this.f19746f, this.f19747g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19745e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mf.a0.k(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            d7 C = this.f19746f.f19771c.C();
            long j10 = this.f19746f.f19770b;
            this.f19745e = 1;
            obj = C.p(j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        int intValue = ((Number) obj).intValue();
        this.f19746f.f19772d.set(intValue);
        h0 h0Var = this.f19746f;
        l2.a<Integer> aVar2 = this.f19747g;
        this.f19745e = 2;
        obj = h0Var.e(aVar2, intValue, this);
        if (obj == aVar) {
            return aVar;
        }
        return obj;
    }
}
