package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.k;

/* loaded from: classes.dex */
public final class g0 extends f {
    public final /* synthetic */ f0 this$0;

    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
            g0.this = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            g0.this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            f0 f0Var = g0.this.this$0;
            int i10 = f0Var.f2714a + 1;
            f0Var.f2714a = i10;
            if (i10 == 1 && f0Var.f2717d) {
                f0Var.f2719f.f(k.b.ON_START);
                f0Var.f2717d = false;
            }
        }
    }

    public g0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = i0.f2724b;
            ((i0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2725a = this.this$0.f2721h;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        f0 f0Var = this.this$0;
        int i10 = f0Var.f2715b - 1;
        f0Var.f2715b = i10;
        if (i10 == 0) {
            f0Var.f2718e.postDelayed(f0Var.f2720g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        f0.c.a(activity, new a());
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        f0 f0Var = this.this$0;
        int i10 = f0Var.f2714a - 1;
        f0Var.f2714a = i10;
        if (i10 == 0 && f0Var.f2716c) {
            f0Var.f2719f.f(k.b.ON_STOP);
            f0Var.f2717d = true;
        }
    }
}
