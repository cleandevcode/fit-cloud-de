package com.huawei.hms.ml.common.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v4.media.d;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();
    private WeakReference<Activity> activity;

    private ActivityMgr() {
    }

    private static String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.activity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void init(Application application) {
        if (application == null) {
            SmartLog.w("ActivityMgr", "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        StringBuilder a10 = d.a("onCreated:");
        a10.append(toString(activity));
        SmartLog.d("ActivityMgr", a10.toString());
        this.activity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        StringBuilder a10 = d.a("onResumed:");
        a10.append(toString(activity));
        SmartLog.d("ActivityMgr", a10.toString());
        this.activity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        StringBuilder a10 = d.a("onStarted:");
        a10.append(toString(activity));
        SmartLog.d("ActivityMgr", a10.toString());
        this.activity = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
