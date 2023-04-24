package f7;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import gm.l;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = "context"
            gm.l.f(r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L11
            java.lang.String r0 = p3.h.a()
            goto L12
        L11:
            r0 = r2
        L12:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L19
            return r0
        L19:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L44
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "currentProcessName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "forName(\"android.app.Act…hod(\"currentProcessName\")"
            gm.l.e(r0, r1)     // Catch: java.lang.Exception -> L44
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L44
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L44
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L4f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L44
            goto L50
        L44:
            r0 = move-exception
            do.a$b r1 = p000do.a.f13275a
            java.lang.String r3 = "SystemUtil"
            r1.t(r3)
            r1.q(r0)
        L4f:
            r0 = r2
        L50:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L57
            return r0
        L57:
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r5.getSystemService(r0)
            if (r5 == 0) goto L83
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            if (r5 != 0) goto L68
            goto L82
        L68:
            int r0 = android.os.Process.myPid()
            java.util.Iterator r5 = r5.iterator()
        L70:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r3 = r1.pid
            if (r3 != r0) goto L70
            java.lang.String r2 = r1.processName
        L82:
            return r2
        L83:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.e.a(android.content.Context):java.lang.String");
    }

    public static Locale b(Context context) {
        Locale locale;
        String str;
        l.f(context, "context");
        int i10 = Build.VERSION.SDK_INT;
        Configuration configuration = context.getResources().getConfiguration();
        if (i10 >= 24) {
            locale = configuration.getLocales().get(0);
            str = "{\n            context.re…tion.locales[0]\n        }";
        } else {
            locale = configuration.locale;
            str = "{\n            @Suppress(…guration.locale\n        }";
        }
        l.e(locale, str);
        return locale;
    }
}
