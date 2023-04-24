package sf;

import com.topstep.fitcloud.pro.shared.data.work.WeatherWorker;
import mf.a0;
import pm.e0;
import sm.f1;

@zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$3", f = "CoreMonitor.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26914e;

    /* renamed from: f */
    public final /* synthetic */ i f26915f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ i f26916a;

        public a(i iVar) {
            this.f26916a = iVar;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            if (((wf.b) obj) == wf.b.CONNECTED) {
                i iVar = this.f26916a;
                if (iVar.f26938h) {
                    WeatherWorker.a.a(iVar.f26931a);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f26915f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        return yl.a.COROUTINE_SUSPENDED;
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f26915f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26914e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
        } else {
            a0.k(obj);
            f1<wf.b> J = this.f26915f.f26933c.J();
            a aVar2 = new a(this.f26915f);
            this.f26914e = 1;
            if (J.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        throw new u2.b();
    }
}
