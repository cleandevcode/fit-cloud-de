package qc;

import com.polidea.rxandroidble3.internal.RxBleLog;

/* loaded from: classes.dex */
public final class e0 implements wk.c {

    /* renamed from: a */
    public final /* synthetic */ Object f24705a;

    /* renamed from: b */
    public final /* synthetic */ f0 f24706b;

    public e0(f0 f0Var, Object obj) {
        this.f24706b = f0Var;
        this.f24705a = obj;
    }

    @Override // wk.c
    public final void cancel() {
        RxBleLog.i("Scan operation is requested to stop.", new Object[0]);
        f0 f0Var = this.f24706b;
        f0Var.f(f0Var.f24708a, this.f24705a);
    }
}
