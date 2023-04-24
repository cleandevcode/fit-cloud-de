package mi;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import java.util.UUID;

@zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel$requestDetail$1", f = "SportDetailActivity.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends zl.i implements fm.l<xl.d<? super SportRecord>, Object> {

    /* renamed from: e */
    public int f21857e;

    /* renamed from: f */
    public final /* synthetic */ SportDetailViewModel f21858f;

    /* renamed from: g */
    public final /* synthetic */ String f21859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SportDetailViewModel sportDetailViewModel, String str, xl.d<? super q> dVar) {
        super(1, dVar);
        this.f21858f = sportDetailViewModel;
        this.f21859g = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super SportRecord> dVar) {
        return new q(this.f21858f, this.f21859g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f21857e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            lg.j0 j0Var = this.f21858f.f12131j;
            UUID fromString = UUID.fromString(this.f21859g);
            gm.l.e(fromString, "fromString(sportId)");
            this.f21857e = 1;
            obj = j0Var.c(fromString, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
