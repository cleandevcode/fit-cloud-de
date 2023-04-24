package d6;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public Object f12641a;

    /* renamed from: b */
    public Object f12642b;

    public b0() {
        this.f12641a = "_hms_config_tag";
        this.f12642b = new yb.c0();
        yb.r.a().getClass();
        yb.r.f31378b.put((String) this.f12641a, (yb.c0) this.f12642b);
    }

    public /* synthetic */ b0(final o5.t tVar) {
        this.f12642b = new CountDownLatch(1);
        o5.v.c().execute(new FutureTask(new Callable() { // from class: d6.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b0 b0Var = b0.this;
                Callable callable = tVar;
                gm.l.f(b0Var, "this$0");
                gm.l.f(callable, "$callable");
                try {
                    b0Var.f12641a = callable.call();
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) b0Var.f12642b;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            }
        }));
    }

    public /* synthetic */ b0(qc.f0 f0Var, tk.m mVar) {
        this.f12641a = f0Var;
        this.f12642b = mVar;
    }
}
