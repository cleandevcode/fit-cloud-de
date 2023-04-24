package ji;

import com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel;
import fl.t0;
import java.util.List;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel$requestSleepRaw$1", f = "AssistFragment.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.l<xl.d<? super List<? extends qj.b>>, Object> {

    /* renamed from: e */
    public int f17849e;

    /* renamed from: f */
    public final /* synthetic */ AssistViewModel f17850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AssistViewModel assistViewModel, xl.d<? super e> dVar) {
        super(1, dVar);
        this.f17850f = assistViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super List<? extends qj.b>> dVar) {
        return new e(this.f17850f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17849e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            t0 t0Var = new t0(((wi.k) ((jj.t0) this.f17850f.f11975j.t()).f17977a).i(new wj.o()));
            this.f17849e = 1;
            obj = a.f.d(t0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
