package x0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final Class<?> f30110a;

    /* renamed from: b */
    public static final Field f30111b;

    /* renamed from: c */
    public static final Field f30112c;

    /* renamed from: d */
    public static final Method f30113d;

    /* renamed from: e */
    public static final Method f30114e;

    /* renamed from: f */
    public static final Method f30115f;

    /* renamed from: g */
    public static final Handler f30116g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f30117a;

        /* renamed from: b */
        public Activity f30118b;

        /* renamed from: c */
        public final int f30119c;

        /* renamed from: d */
        public boolean f30120d = false;

        /* renamed from: e */
        public boolean f30121e = false;

        /* renamed from: f */
        public boolean f30122f = false;

        public a(Activity activity) {
            this.f30118b = activity;
            this.f30119c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f30118b == activity) {
                this.f30118b = null;
                this.f30121e = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x003d, code lost:
            r5.f30122f = true;
            r5.f30117a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0042, code lost:
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityPaused(android.app.Activity r6) {
            /*
                r5 = this;
                boolean r0 = r5.f30121e
                if (r0 == 0) goto L42
                boolean r0 = r5.f30122f
                if (r0 != 0) goto L42
                boolean r0 = r5.f30120d
                if (r0 != 0) goto L42
                java.lang.Object r0 = r5.f30117a
                int r1 = r5.f30119c
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = x0.h.f30112c     // Catch: java.lang.Throwable -> L33
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L33
                if (r4 != r0) goto L3b
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L21
                goto L3b
            L21:
                java.lang.reflect.Field r0 = x0.h.f30111b     // Catch: java.lang.Throwable -> L33
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
                android.os.Handler r0 = x0.h.f30116g     // Catch: java.lang.Throwable -> L33
                x0.g r1 = new x0.g     // Catch: java.lang.Throwable -> L33
                r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L33
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L33
                r2 = 1
                goto L3b
            L33:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3b:
                if (r2 == 0) goto L42
                r5.f30122f = r3
                r6 = 0
                r5.f30117a = r6
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.h.a.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f30118b == activity) {
                this.f30120d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0084 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            x0.h.f30116g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            x0.h.f30110a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            x0.h.f30111b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = r1
        L32:
            x0.h.f30112c = r0
            java.lang.Class<?> r0 = x0.h.f30110a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
            goto L55
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L54
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L54
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L54
            r7[r2] = r8     // Catch: java.lang.Throwable -> L54
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L54
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
        L55:
            r0 = r1
        L56:
            x0.h.f30113d = r0
            java.lang.Class<?> r0 = x0.h.f30110a
            if (r0 != 0) goto L5d
            goto L6f
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6f
            r7[r2] = r8     // Catch: java.lang.Throwable -> L6f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L6f
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6f
            goto L70
        L6f:
            r0 = r1
        L70:
            x0.h.f30114e = r0
            java.lang.Class<?> r0 = x0.h.f30110a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r4 == r7) goto L81
            r7 = 27
            if (r4 != r7) goto L7f
            goto L81
        L7f:
            r4 = 0
            goto L82
        L81:
            r4 = 1
        L82:
            if (r4 == 0) goto Lbb
            if (r0 != 0) goto L87
            goto Lbb
        L87:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lbb
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lbb
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lbb
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lbb
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lbb
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lbb
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lbb
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lbb
            r1 = r0
        Lbb:
            x0.h.f30115f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.h.<clinit>():void");
    }
}
