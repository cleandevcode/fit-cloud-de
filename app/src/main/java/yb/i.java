package yb;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class i {

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static Object a(Class cls, Class[] clsArr, Object[] objArr) {
        String str;
        if (clsArr.length == objArr.length) {
            try {
                try {
                    return cls.getMethod("get", clsArr).invoke(null, objArr);
                } catch (IllegalAccessException unused) {
                    str = "invokeStaticFun(): method invoke Exception!";
                    m2.f.h("hmsSdk", str);
                    return null;
                } catch (IllegalArgumentException unused2) {
                    str = "invokeStaticFun(): Illegal Argument!";
                    m2.f.h("hmsSdk", str);
                    return null;
                } catch (InvocationTargetException unused3) {
                    str = "invokeStaticFun(): Invocation Target Exception!";
                    m2.f.h("hmsSdk", str);
                    return null;
                }
            } catch (NoSuchMethodException unused4) {
                m2.f.h("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
            }
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("paramsType len:");
            a10.append(clsArr.length);
            a10.append(" should equal params.len:");
            a10.append(objArr.length);
            throw new a(a10.toString());
        }
    }

    public static String b() {
        if (TextUtils.isEmpty("ro.build.version.emui")) {
            return "";
        }
        String c10 = c("android.os.SystemProperties", "ro.build.version.emui");
        return TextUtils.isEmpty(c10) ? c("com.huawei.android.os.SystemPropertiesEx", "ro.build.version.emui") : c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            r2[r3] = r0
            r4 = 1
            r2[r4] = r0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r6
            java.lang.String r6 = ""
            r0[r4] = r6
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: yb.i.a -> L1c java.lang.ClassNotFoundException -> L1f
            java.lang.Object r5 = a(r5, r2, r0)     // Catch: yb.i.a -> L1c java.lang.ClassNotFoundException -> L1f
            goto L27
        L1c:
            java.lang.String r5 = "invokeStaticFun(): Static function call Exception "
            goto L21
        L1f:
            java.lang.String r5 = "invokeStaticFun() Not found class!"
        L21:
            java.lang.String r0 = "hmsSdk"
            m2.f.h(r0, r5)
            r5 = 0
        L27:
            if (r5 == 0) goto L2c
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L2c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.i.c(java.lang.String, java.lang.String):java.lang.String");
    }
}
