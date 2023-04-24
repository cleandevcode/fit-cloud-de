package ji;

import com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel;
import gl.p;
import jj.k1;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel$requestUiInfo$1", f = "AssistFragment.kt", l = {185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements fm.l<xl.d<? super rj.e>, Object> {

    /* renamed from: e */
    public int f17852e;

    /* renamed from: f */
    public final /* synthetic */ AssistViewModel f17853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AssistViewModel assistViewModel, xl.d<? super g> dVar) {
        super(1, dVar);
        this.f17853f = assistViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super rj.e> dVar) {
        return new g(this.f17853f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17852e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            p d10 = ((k1) this.f17853f.f11975j.s()).d();
            this.f17852e = 1;
            obj = a.f.d(d10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
