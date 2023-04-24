package v5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import o5.v;
import s.n;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.f(activity, InnerShareParams.ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
        try {
            v.c().execute(new n(1));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.f(activity, InnerShareParams.ACTIVITY);
        l.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
        try {
            if (l.a(c.f29070e, Boolean.TRUE) && l.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                v.c().execute(new p5.g(1));
            }
        } catch (Exception unused) {
        }
    }
}
