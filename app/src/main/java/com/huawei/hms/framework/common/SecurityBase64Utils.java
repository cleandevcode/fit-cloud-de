package com.huawei.hms.framework.common;

import android.util.Base64;
import com.huawei.secure.android.common.util.SafeBase64;

/* loaded from: classes.dex */
public class SecurityBase64Utils {

    /* renamed from: a */
    public static volatile boolean f7046a = false;

    /* JADX WARN: Removed duplicated region for block: B:54:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] decode(java.lang.String r4, int r5) {
        /*
            boolean r0 = com.huawei.hms.framework.common.SecurityBase64Utils.f7046a
            if (r0 != 0) goto L28
            java.lang.String r0 = "com.huawei.secure.android.common.util.SafeBase64"
            java.lang.Class<com.huawei.hms.framework.common.SecurityBase64Utils> r1 = com.huawei.hms.framework.common.SecurityBase64Utils.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            r3 = 0
            if (r2 != 0) goto L11
        Lf:
            r0 = 0
            goto L1d
        L11:
            r2.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> Lf
            monitor-enter(r1)     // Catch: java.lang.ClassNotFoundException -> Lf
            r0 = 1
            com.huawei.hms.framework.common.SecurityBase64Utils.f7046a = r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.ClassNotFoundException -> Lf
        L1d:
            if (r0 == 0) goto L20
            goto L28
        L20:
            byte[] r4 = android.util.Base64.decode(r4, r5)     // Catch: java.lang.Exception -> L25
            return r4
        L25:
            byte[] r4 = new byte[r3]
            return r4
        L28:
            byte[] r4 = com.huawei.secure.android.common.util.SafeBase64.decode(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.SecurityBase64Utils.decode(java.lang.String, int):byte[]");
    }

    public static String encodeToString(byte[] bArr, int i10) {
        if (!f7046a) {
            ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
            boolean z10 = false;
            if (classLoader != null) {
                try {
                    classLoader.loadClass("com.huawei.secure.android.common.util.SafeBase64");
                    synchronized (SecurityBase64Utils.class) {
                        f7046a = true;
                    }
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
            }
            if (!z10) {
                try {
                    return Base64.encodeToString(bArr, i10);
                } catch (Exception unused2) {
                    return null;
                }
            }
        }
        return SafeBase64.encodeToString(bArr, i10);
    }
}
