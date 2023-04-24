package n8;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final Method f22201a;

    /* renamed from: b */
    public static final Method f22202b;

    /* renamed from: c */
    public static final Method f22203c;

    /* renamed from: d */
    public static final Method f22204d;

    static {
        Method method;
        Method method2;
        Method method3;
        boolean z10;
        boolean z11;
        boolean z12;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f22201a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f22202b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f22203c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        }
        f22204d = method4;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.os.WorkSource r4) {
        /*
            java.lang.reflect.Method r0 = n8.b.f22204d
            r1 = 0
            java.lang.String r2 = "WorkSourceUtil"
            if (r0 == 0) goto L1d
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L17
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L17
            i8.p.f(r0)     // Catch: java.lang.Exception -> L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L17
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Exception -> L17
            return r4
        L17:
            r0 = move-exception
            java.lang.String r3 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r2, r3, r0)
        L1d:
            java.lang.reflect.Method r0 = n8.b.f22203c
            if (r0 == 0) goto L37
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L31
            java.lang.Object r4 = r0.invoke(r4, r3)     // Catch: java.lang.Exception -> L31
            i8.p.f(r4)     // Catch: java.lang.Exception -> L31
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L31
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L31
            goto L38
        L31:
            r4 = move-exception
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r2, r0, r4)
        L37:
            r4 = 0
        L38:
            if (r4 != 0) goto L3c
            r4 = 1
            return r4
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.b.a(android.os.WorkSource):boolean");
    }
}
