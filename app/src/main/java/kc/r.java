package kc;

import android.content.Context;

/* loaded from: classes.dex */
public final class r implements v3.c<Boolean> {

    /* renamed from: a */
    public final w3.a<Context> f18376a;

    public r(w3.a<Context> aVar) {
        this.f18376a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
        if ((r0.requestedPermissionsFlags[r2] & 65536) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
        r1 = true;
     */
    @Override // w3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get() {
        /*
            r5 = this;
            w3.a<android.content.Context> r0 = r5.f18376a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.pm.PackageManager r2 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r2 = 0
        L18:
            java.lang.String[] r3 = r0.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            int r4 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            if (r2 >= r4) goto L3d
            java.lang.String r4 = "android.permission.BLUETOOTH_SCAN"
            r3 = r3[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            boolean r3 = r4.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            if (r3 != 0) goto L2a
            int r2 = r2 + 1
            goto L18
        L2a:
            int[] r0 = r0.requestedPermissionsFlags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r0 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r2 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r2
            if (r0 == 0) goto L3d
            r1 = 1
            goto L3d
        L35:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Could not find application PackageInfo"
            com.polidea.rxandroidble3.internal.RxBleLog.e(r0, r3, r2)
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.r.get():java.lang.Object");
    }
}
