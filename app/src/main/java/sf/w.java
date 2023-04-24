package sf;

import com.topstep.fitcloud.pro.function.SportService;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.function.SportService$saveSportRecord$1", f = "SportService.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26973e;

    /* renamed from: f */
    public final /* synthetic */ SportService f26974f;

    /* renamed from: g */
    public final /* synthetic */ y6.d f26975g;

    /* renamed from: h */
    public final /* synthetic */ SportRecord f26976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SportService sportService, y6.d dVar, SportRecord sportRecord, xl.d<? super w> dVar2) {
        super(2, dVar2);
        this.f26974f = sportService;
        this.f26975g = dVar;
        this.f26976h = sportRecord;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((w) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new w(this.f26974f, this.f26975g, this.f26976h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26973e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            lg.a aVar2 = this.f26974f.f9568s;
            if (aVar2 != null) {
                long j10 = this.f26975g.f31168b;
                SportRecord sportRecord = this.f26976h;
                this.f26973e = 1;
                if (aVar2.a(j10, sportRecord, this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("appSportSaver");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
