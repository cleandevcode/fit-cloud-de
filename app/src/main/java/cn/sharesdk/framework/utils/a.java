package cn.sharesdk.framework.utils;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static String f5289a;

    /* renamed from: b */
    private static String f5290b;

    public static boolean a() {
        return a("MIUI");
    }

    public static boolean a(String str) {
        String upperCase;
        String str2 = f5289a;
        if (str2 != null) {
            return str2.equals(str);
        }
        String b10 = b("ro.miui.ui.version.name");
        f5290b = b10;
        if (TextUtils.isEmpty(b10)) {
            String b11 = b("ro.build.version.emui");
            f5290b = b11;
            if (TextUtils.isEmpty(b11)) {
                String b12 = b("ro.build.version.opporom");
                f5290b = b12;
                if (TextUtils.isEmpty(b12)) {
                    String b13 = b("ro.vivo.os.version");
                    f5290b = b13;
                    if (TextUtils.isEmpty(b13)) {
                        String b14 = b("ro.smartisan.version");
                        f5290b = b14;
                        if (TextUtils.isEmpty(b14)) {
                            String str3 = Build.DISPLAY;
                            f5290b = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                f5289a = "FLYME";
                                return f5289a.equals(str);
                            }
                            f5290b = "unknown";
                            upperCase = Build.MANUFACTURER.toUpperCase();
                        } else {
                            upperCase = "SMARTISAN";
                        }
                    } else {
                        upperCase = "VIVO";
                    }
                } else {
                    upperCase = "OPPO";
                }
            } else {
                upperCase = "EMUI";
            }
        } else {
            upperCase = "MIUI";
        }
        f5289a = upperCase;
        return f5289a.equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r8) {
        /*
            java.lang.String r0 = "CheckRomAll getProp finally catch "
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r4.<init>()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r4.append(r8)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            java.lang.String r3 = r4.readLine()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L9a
            r4.close()     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L9a
            r4.close()     // Catch: java.io.IOException -> L38
            goto L51
        L38:
            r8 = move-exception
            cn.sharesdk.framework.utils.SSDKLog r1 = cn.sharesdk.framework.utils.SSDKLog.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.a(r8, r0)
        L51:
            return r3
        L52:
            r3 = move-exception
            goto L58
        L54:
            r8 = move-exception
            goto L9c
        L56:
            r3 = move-exception
            r4 = r1
        L58:
            cn.sharesdk.framework.utils.SSDKLog r5 = cn.sharesdk.framework.utils.SSDKLog.b()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r6.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = "CheckRomAll unable to read prop "
            r6.append(r7)     // Catch: java.lang.Throwable -> L9a
            r6.append(r8)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = " ex "
            r6.append(r8)     // Catch: java.lang.Throwable -> L9a
            r6.append(r3)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9a
            r5.a(r8, r3)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L99
            r4.close()     // Catch: java.io.IOException -> L80
            goto L99
        L80:
            r8 = move-exception
            cn.sharesdk.framework.utils.SSDKLog r3 = cn.sharesdk.framework.utils.SSDKLog.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3.a(r8, r0)
        L99:
            return r1
        L9a:
            r8 = move-exception
            r1 = r4
        L9c:
            if (r1 == 0) goto Lbb
            r1.close()     // Catch: java.io.IOException -> La2
            goto Lbb
        La2:
            r1 = move-exception
            cn.sharesdk.framework.utils.SSDKLog r3 = cn.sharesdk.framework.utils.SSDKLog.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3.a(r0, r1)
        Lbb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.sharesdk.framework.utils.a.b(java.lang.String):java.lang.String");
    }
}
