package f3;

import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import mf.a0;
import pm.e0;

@zl.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f14079e;

    /* renamed from: f */
    public final /* synthetic */ CoroutineWorker f14080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CoroutineWorker coroutineWorker, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f14080f = coroutineWorker;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f14080f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f14079e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                CoroutineWorker coroutineWorker = this.f14080f;
                this.f14079e = 1;
                obj = coroutineWorker.h(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.f14080f.f3611g.i((ListenableWorker.a) obj);
        } catch (Throwable th2) {
            this.f14080f.f3611g.j(th2);
        }
        return tl.l.f28297a;
    }
}
