package ji;

import com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel;
import gl.p;
import jj.s0;
import jj.t0;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistViewModel$requestAssistInfo$1", f = "AssistFragment.kt", l = {201}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements fm.l<xl.d<? super qj.a>, Object> {

    /* renamed from: e */
    public int f17846e;

    /* renamed from: f */
    public final /* synthetic */ AssistViewModel f17847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AssistViewModel assistViewModel, xl.d<? super c> dVar) {
        super(1, dVar);
        this.f17847f = assistViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super qj.a> dVar) {
        return new c(this.f17847f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17846e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            p pVar = new p(h7.a.w(((t0) this.f17847f.f11975j.t()).f17977a, new bj.b((byte) 2, (byte) 96, null), new bj.b((byte) 2, (byte) 97, null)), new wi.h(5, s0.f17975b));
            this.f17846e = 1;
            obj = a.f.d(pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
