package h8;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public final class k1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f15980a;

    /* renamed from: b */
    public final /* synthetic */ String f15981b = "ConnectionlessLifecycleHelper";

    /* renamed from: c */
    public final /* synthetic */ l1 f15982c;

    public k1(l1 l1Var, LifecycleCallback lifecycleCallback) {
        this.f15982c = l1Var;
        this.f15980a = lifecycleCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        l1 l1Var = this.f15982c;
        if (l1Var.f15993m0 > 0) {
            LifecycleCallback lifecycleCallback = this.f15980a;
            Bundle bundle2 = l1Var.f15994n0;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(this.f15981b);
            } else {
                bundle = null;
            }
            lifecycleCallback.c(bundle);
        }
        if (this.f15982c.f15993m0 >= 2) {
            this.f15980a.f();
        }
        if (this.f15982c.f15993m0 >= 3) {
            this.f15980a.d();
        }
        if (this.f15982c.f15993m0 >= 4) {
            this.f15980a.g();
        }
        if (this.f15982c.f15993m0 >= 5) {
            this.f15980a.getClass();
        }
    }
}
