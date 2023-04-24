package com.mob.tools.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashSet;

/* loaded from: classes.dex */
public class ActivityTracker implements PublicMemberKeeper {

    /* renamed from: a */
    private static ActivityTracker f9162a;

    /* renamed from: b */
    private HashSet<Tracker> f9163b = new HashSet<>();

    /* loaded from: classes.dex */
    public interface EachTracker extends PublicMemberKeeper {
        void each(Tracker tracker);
    }

    /* loaded from: classes.dex */
    public interface Tracker extends PublicMemberKeeper {
        void onCreated(Activity activity, Bundle bundle);

        void onDestroyed(Activity activity);

        void onPaused(Activity activity);

        void onResumed(Activity activity);

        void onSaveInstanceState(Activity activity, Bundle bundle);

        void onStarted(Activity activity);

        void onStopped(Activity activity);
    }

    private ActivityTracker(Context context) {
        a(context);
    }

    public void a(final Activity activity) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.3
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onStarted(activity);
            }
        });
    }

    public void a(final Activity activity, final Bundle bundle) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.2
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onCreated(activity, bundle);
            }
        });
    }

    private void a(Context context) {
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.mob.tools.utils.ActivityTracker.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    ActivityTracker.this.a(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    ActivityTracker.this.e(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    ActivityTracker.this.c(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    ActivityTracker.this.b(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    ActivityTracker.this.b(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    ActivityTracker.this.a(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    ActivityTracker.this.d(activity);
                }
            });
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    private void a(EachTracker eachTracker) {
        Tracker[] trackerArr;
        try {
            synchronized (this.f9163b) {
                HashSet<Tracker> hashSet = this.f9163b;
                trackerArr = (Tracker[]) hashSet.toArray(new Tracker[hashSet.size()]);
            }
            for (Tracker tracker : trackerArr) {
                if (tracker != null) {
                    eachTracker.each(tracker);
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public void b(final Activity activity) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.4
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onResumed(activity);
            }
        });
    }

    public void b(final Activity activity, final Bundle bundle) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.8
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onSaveInstanceState(activity, bundle);
            }
        });
    }

    public void c(final Activity activity) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.5
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onPaused(activity);
            }
        });
    }

    public void d(final Activity activity) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.6
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onStopped(activity);
            }
        });
    }

    public void e(final Activity activity) {
        a(new EachTracker() { // from class: com.mob.tools.utils.ActivityTracker.7
            @Override // com.mob.tools.utils.ActivityTracker.EachTracker
            public void each(Tracker tracker) {
                tracker.onDestroyed(activity);
            }
        });
    }

    public static synchronized ActivityTracker getInstance(Context context) {
        ActivityTracker activityTracker;
        synchronized (ActivityTracker.class) {
            if (f9162a == null) {
                f9162a = new ActivityTracker(context);
            }
            activityTracker = f9162a;
        }
        return activityTracker;
    }

    public void addTracker(Tracker tracker) {
        synchronized (this.f9163b) {
            this.f9163b.add(tracker);
        }
    }

    public void removeTracker(Tracker tracker) {
        synchronized (this.f9163b) {
            this.f9163b.remove(tracker);
        }
    }
}
