package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public class ReflectionUtils {
    public static boolean checkCompatible(String str) {
        try {
            ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
            if (classLoader != null) {
                classLoader.loadClass(str);
                return true;
            }
            throw new ClassNotFoundException("not found classloader");
        } catch (Exception unused) {
            Logger.w("ReflectionUtils", str + "ClassNotFoundException");
            return false;
        }
    }

    public static boolean checkCompatible(String str, String str2, Class<?>... clsArr) {
        String str3;
        try {
            if (str == null || str2 == null) {
                Logger.w("ReflectionUtils", "targetClass is  null or name is null:");
                return false;
            }
            Class.forName(str).getDeclaredMethod(str2, clsArr);
            Logger.v("ReflectionUtils", "has method : " + str2);
            return true;
        } catch (RuntimeException unused) {
            str3 = str + " RuntimeException";
            Logger.w("ReflectionUtils", str3);
            return false;
        } catch (Exception unused2) {
            str3 = str2 + " NoSuchMethodException";
            Logger.w("ReflectionUtils", str3);
            return false;
        }
    }

    public static Field getField(Object obj, String str) {
        String str2;
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField;
            } catch (IllegalArgumentException e10) {
                e = e10;
                str2 = "Exception in getField :: IllegalArgumentException:";
                Logger.e("ReflectionUtils", str2, e);
                return null;
            } catch (NoSuchFieldException e11) {
                e = e11;
                str2 = "Exception in getField :: NoSuchFieldException:";
                Logger.e("ReflectionUtils", str2, e);
                return null;
            } catch (SecurityException e12) {
                e = e12;
                str2 = "not security int method getField,SecurityException:";
                Logger.e("ReflectionUtils", str2, e);
                return null;
            }
        }
        return null;
    }

    public static Object getFieldObj(Object obj, String str) {
        String str2;
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Field declaredField = obj.getClass().getDeclaredField(str);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(obj);
        } catch (IllegalAccessException e10) {
            e = e10;
            str2 = "Exception in getFieldObj :: IllegalAccessException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            str2 = "Exception in getFieldObj :: IllegalArgumentException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        } catch (NoSuchFieldException e12) {
            e = e12;
            str2 = "Exception in getFieldObj :: NoSuchFieldException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        } catch (SecurityException e13) {
            e = e13;
            str2 = "not security int method getFieldObj,SecurityException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        }
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        String str2;
        if (cls == null || str == null) {
            Logger.w("ReflectionUtils", "targetClass is  null pr name is null:");
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            e = e10;
            str2 = "NoSuchMethodException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        } catch (SecurityException e11) {
            e = e11;
            str2 = "SecurityException:";
            Logger.e("ReflectionUtils", str2, e);
            return null;
        }
    }

    public static Object getStaticFieldObj(String str, String str2) {
        Class<?> cls;
        String str3;
        if (str == null) {
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            final Field declaredField = cls.getDeclaredField(str2);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.3
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(cls);
        } catch (IllegalAccessException e10) {
            e = e10;
            str3 = "Exception in getFieldObj :: IllegalAccessException:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            str3 = "Exception in getFieldObj :: IllegalArgumentException:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        } catch (NoSuchFieldException e12) {
            e = e12;
            str3 = "Exception in getFieldObj :: NoSuchFieldException:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        } catch (SecurityException e13) {
            e = e13;
            str3 = "not security int method getStaticFieldObj,SecurityException:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object invokeStaticMethod(java.lang.String r1, java.lang.String r2, java.lang.Class<?>[] r3, java.lang.Object... r4) {
        /*
            r0 = 0
            if (r1 != 0) goto L5
        L3:
            r1 = r0
            goto L9
        L5:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L3
        L9:
            java.lang.reflect.Method r1 = getMethod(r1, r2, r3)
            if (r1 != 0) goto L10
            return r0
        L10:
            java.lang.Object r0 = r1.invoke(r0, r4)     // Catch: java.lang.Exception -> L15 java.lang.RuntimeException -> L19
            goto L21
        L15:
            r1 = move-exception
            java.lang.String r2 = "Exception in invoke:"
            goto L1c
        L19:
            r1 = move-exception
            java.lang.String r2 = "RuntimeException in invoke:"
        L1c:
            java.lang.String r3 = "ReflectionUtils"
            com.huawei.hms.framework.common.Logger.e(r3, r2, r1)
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.ReflectionUtils.invokeStaticMethod(java.lang.String, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        Class<?> cls;
        String str3;
        if (str == null) {
            return null;
        }
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = objArr[i10];
                if (obj instanceof Integer) {
                    clsArr[i10] = Integer.TYPE;
                } else if (obj instanceof Long) {
                    clsArr[i10] = Long.TYPE;
                } else if (obj instanceof Double) {
                    clsArr[i10] = Double.TYPE;
                } else if (obj instanceof Float) {
                    clsArr[i10] = Float.TYPE;
                } else if (obj instanceof Boolean) {
                    clsArr[i10] = Boolean.TYPE;
                } else if (obj instanceof Character) {
                    clsArr[i10] = Character.TYPE;
                } else if (obj instanceof Byte) {
                    clsArr[i10] = Byte.TYPE;
                } else if (obj instanceof Void) {
                    clsArr[i10] = Void.TYPE;
                } else if (obj instanceof Short) {
                    clsArr[i10] = Short.TYPE;
                } else {
                    clsArr[i10] = obj.getClass();
                }
            }
        } else {
            clsArr = null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        Method method = getMethod(cls, str2, clsArr);
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, objArr);
        } catch (RuntimeException e10) {
            e = e10;
            str3 = "RuntimeException in invoke:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        } catch (Exception e11) {
            e = e11;
            str3 = "Exception in invoke:";
            Logger.e("ReflectionUtils", str3, e);
            return null;
        }
    }
}
