package com.mob.tools.utils;

import android.content.BroadcastReceiver;
import com.mob.commons.n;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ReflectHelper implements PublicMemberKeeper {

    /* renamed from: a */
    private static HashSet<String> f9338a;

    /* renamed from: b */
    private static HashMap<String, Class<?>> f9339b;

    /* renamed from: c */
    private static HashMap<Class<?>, String> f9340c;

    /* renamed from: d */
    private static LinkedHashMap<String, Method> f9341d;

    /* renamed from: e */
    private static LinkedHashMap<String, Constructor<?>> f9342e;

    /* loaded from: classes.dex */
    public interface a<ArgType, RetType> {
        RetType a(ArgType argtype);
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f9338a = hashSet;
        hashSet.add(n.b("009%gece_iMcedkdccecjee"));
        f9338a.add(n.b("007^gece(i!cedkcddb"));
        f9338a.add(n.b("008$geceBi8cedkcjcddb"));
        f9338a.add("java.net");
        f9338a.add(n.b("009Ngece8i9cedkcb^cNcddc"));
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f9339b = hashMap;
        hashMap.put(n.b("006gNdbcbebdcZh"), Double.TYPE);
        f9339b.put(n.b("005Begdcdbce2c"), Float.TYPE);
        f9339b.put("long", Long.TYPE);
        f9339b.put(n.b("003(cdcjQc"), Integer.TYPE);
        f9339b.put("short", Short.TYPE);
        f9339b.put("byte", Byte.TYPE);
        f9339b.put(n.b("004%cf^b?cecg"), Character.TYPE);
        f9339b.put("boolean", Boolean.TYPE);
        f9339b.put("Object", Object.class);
        f9339b.put("String", String.class);
        f9339b.put("Thread", Thread.class);
        f9339b.put(n.b("008Yfdcbcjcjceebdc.h"), Runnable.class);
        f9339b.put(n.b("006Pdgchef[chk"), System.class);
        f9339b.put(n.b("006g;dbcbebdc;h"), Double.class);
        f9339b.put("Float", Float.class);
        f9339b.put("Long", Long.class);
        f9339b.put("Integer", Integer.class);
        f9339b.put(n.b("005<dg!bNdbcgUc"), Short.class);
        f9339b.put("Byte", Byte.class);
        f9339b.put(n.b("009MffVbEcecgcecfNchUcg"), Character.class);
        f9339b.put("Boolean", Boolean.class);
        f9340c = new HashMap<>();
        for (Map.Entry<String, Class<?>> entry : f9339b.entrySet()) {
            f9340c.put(entry.getValue(), entry.getKey());
        }
        f9341d = new LinkedHashMap<String, Method>() { // from class: com.mob.tools.utils.ReflectHelper.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Method> entry2) {
                return size() > 10;
            }
        };
        f9342e = new LinkedHashMap<String, Constructor<?>>() { // from class: com.mob.tools.utils.ReflectHelper.2
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Constructor<?>> entry2) {
                return size() > 10;
            }
        };
    }

    private static synchronized Class<?> a(String str) {
        Class<?> cls;
        synchronized (ReflectHelper.class) {
            cls = f9339b.get(str);
            if (cls == null) {
                Iterator<String> it = f9338a.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        importClass(next + "." + str);
                    } catch (Throwable unused) {
                    }
                    cls = f9339b.get(str);
                    if (cls != null) {
                        break;
                    }
                }
            }
        }
        return cls;
    }

    private static <T> T a(Object obj, String str) {
        if ((obj instanceof List) || obj.getClass().isArray()) {
            return (T) b(obj, str);
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            arrayList.add(cls);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = null;
            try {
                field = ((Class) it.next()).getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (field != null && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                return (T) field.get(obj);
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("className: ");
        a10.append(obj.getClass());
        a10.append(", fieldName: ");
        a10.append(str);
        throw new NoSuchFieldException(a10.toString());
    }

    private static <T> T a(String str, String str2) {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a10 = a(str); a10 != null; a10 = a10.getSuperclass()) {
            arrayList.add(a10);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                field = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                return (T) field.get(null);
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2);
    }

    private static void a(String str, String str2, Object obj) {
        Field field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> a10 = a(str); a10 != null; a10 = a10.getSuperclass()) {
            arrayList.add(a10);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                field = ((Class) it.next()).getDeclaredField(str2);
            } catch (Throwable unused) {
                field = null;
            }
            if (field != null && Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                field.set(null, obj);
                return;
            }
        }
        throw new NoSuchFieldException("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj));
    }

    private static boolean a(Class<?> cls, Class<?> cls2) {
        return (cls == Byte.TYPE && cls2 == Byte.class) || (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) || ((cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || (cls == Boolean.TYPE && cls2 == Boolean.class))))));
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i10 = 0; i10 < clsArr2.length; i10++) {
                Class<?> cls = clsArr2[i10];
                if (cls != null && !a(clsArr[i10], cls) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static Class<?>[] a(Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj instanceof BroadcastReceiver) {
                clsArr[i10] = BroadcastReceiver.class;
            } else {
                clsArr[i10] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }

    private static Object b(Object obj, String str) {
        int i10;
        int i11;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i11 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i11 = -1;
                }
                if (i11 != -1) {
                    return ((List) obj).get(i11);
                }
            }
        } else if (n.b("006<dc1hScjee cb").equals(str)) {
            return Integer.valueOf(Array.getLength(obj));
        } else {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i10 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused2) {
                    i10 = -1;
                }
                if (i10 != -1) {
                    return Array.get(obj, i10);
                }
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("className: ");
        a10.append(obj.getClass());
        a10.append(", fieldName: ");
        a10.append(str);
        throw new NoSuchFieldException(a10.toString());
    }

    private static boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z10;
        if (clsArr.length - clsArr2.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= clsArr2.length) {
                    z10 = true;
                    break;
                }
                Class<?> cls = clsArr2[i10];
                if (cls != null && !a(clsArr[i10], cls) && !clsArr[i10].isAssignableFrom(clsArr2[i10])) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            return z10 && clsArr[clsArr.length - 1].isArray();
        }
        return false;
    }

    public static Object createProxy(HashMap<String, a<Object, Object[]>> hashMap, Class<?>... clsArr) {
        HashMap hashMap2 = new HashMap();
        for (final Map.Entry<String, a<Object, Object[]>> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), new a<Object[], Object>() { // from class: com.mob.tools.utils.ReflectHelper.3
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Object a(Object[] objArr) {
                    return ((Object[]) ((a) entry.getValue()).a(objArr))[0];
                }
            });
        }
        return createProxy((Map<String, a<Object[], Object>>) hashMap2, clsArr);
    }

    public static Object createProxy(final Map<String, a<Object[], Object>> map, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            return null;
        }
        return Proxy.newProxyInstance(clsArr[0].getClassLoader(), clsArr, new InvocationHandler() { // from class: com.mob.tools.utils.ReflectHelper.4
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                a aVar = (a) map.get(method.getName());
                if (aVar != null) {
                    return aVar.a(objArr);
                }
                throw new NoSuchMethodException();
            }
        });
    }

    public static Class<?> getClass(String str) {
        Class<?> a10 = a(str);
        if (a10 == null) {
            try {
                a10 = Class.forName(str);
                f9339b.put(str, a10);
                return a10;
            } catch (Throwable unused) {
                return a10;
            }
        }
        return a10;
    }

    public static <T> T getInstanceField(Object obj, String str) {
        try {
            return (T) a(obj, str);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            StringBuilder a10 = android.support.v4.media.d.a("className: ");
            a10.append(obj.getClass());
            a10.append(", fieldName: ");
            a10.append(str);
            throw new Throwable(a10.toString(), th2);
        }
    }

    public static String getName(Class<?> cls) {
        String str = f9340c.get(cls);
        if (str == null) {
            str = cls.getSimpleName();
            if (f9339b.containsKey(str)) {
                f9340c.remove(f9339b.get(str));
            }
            f9339b.put(str, cls);
            f9340c.put(cls, str);
        }
        return str;
    }

    public static <T> T getStaticField(String str, String str2) {
        try {
            return (T) a(str, str2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2, th2);
        }
    }

    public static String importClass(String str) {
        return importClass(null, str);
    }

    public static synchronized String importClass(String str, String str2) {
        synchronized (ReflectHelper.class) {
            if (str2.endsWith(".*")) {
                f9338a.add(str2.substring(0, str2.length() - 2));
                return "*";
            }
            Class<?> cls = Class.forName(str2);
            if (str == null) {
                str = cls.getSimpleName();
            }
            if (f9339b.containsKey(str)) {
                f9340c.remove(f9339b.get(str));
            }
            f9339b.put(str, cls);
            f9340c.put(cls, str);
            return str;
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object... objArr) {
        try {
            return (T) a(null, obj, str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            StringBuilder a10 = android.support.v4.media.d.a("className: ");
            a10.append(obj.getClass());
            a10.append(", methodName: ");
            a10.append(str);
            throw new Throwable(a10.toString(), th2);
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        return (T) a(null, obj, str, objArr, clsArr);
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object... objArr) {
        try {
            return (T) a(str, null, str2, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", methodName: " + str2, th2);
        }
    }

    public static <T> T invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) {
        return (T) a(str, null, str2, objArr, clsArr);
    }

    public static Object newInstance(String str, Object... objArr) {
        try {
            return a(str, objArr);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchMethodException) {
                throw th2;
            }
            throw new Throwable(android.support.v4.media.a.a("className: ", str, ", methodName: <init>"), th2);
        }
    }

    public static void setInstanceField(Object obj, String str, Object obj2) {
        try {
            a(obj, str, obj2);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            StringBuilder a10 = android.support.v4.media.d.a("className: ");
            a10.append(obj.getClass());
            a10.append(", fieldName: ");
            a10.append(str);
            a10.append(", value: ");
            a10.append(String.valueOf(obj2));
            throw new Throwable(a10.toString(), th2);
        }
    }

    public static void setStaticField(String str, String str2, Object obj) {
        try {
            a(str, str2, obj);
        } catch (Throwable th2) {
            if (th2 instanceof NoSuchFieldException) {
                throw th2;
            }
            throw new Throwable("className: " + str + ", fieldName: " + str2 + ", value: " + String.valueOf(obj), th2);
        }
    }

    private static <T> T a(String str, Object obj, String str2, Object... objArr) {
        Class<?>[] a10;
        Class<?> a11 = obj == null ? a(str) : obj.getClass();
        boolean z10 = false;
        if (str2.equals(n.b("009GeeIhc>fh[hcbOdb6g")) && objArr != null && objArr.length == 2) {
            a10 = new Class[]{String.class, Class[].class};
            if (objArr[1] == String.class) {
                Class[] clsArr = new Class[1];
                clsArr[0] = String.class;
                objArr[1] = clsArr;
            }
        } else {
            a10 = (str2.equals(n.b("011!ee*hc.ehPhi0cdcf>hPdfZg")) && objArr != null && objArr.length == 1) ? new Class[]{Integer.TYPE} : (str2.equals(n.b("0064cdcj i^dbci8h")) && objArr != null && objArr.length == 2) ? new Class[]{Object.class, Object[].class} : (str2.equals(n.b("013ZefDhc:dicfcf3hDefefcdebdc1h")) && objArr != null && objArr.length == 1) ? new Class[]{Boolean.TYPE} : a(objArr);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class<?> cls = a10[i10];
            stringBuffer.append(cls == null ? "" : cls.getName());
        }
        String str3 = a11.getName() + "#" + str2 + "#" + objArr.length + stringBuffer.toString();
        Method method = f9341d.get(str3);
        if (method != null) {
            boolean isStatic = Modifier.isStatic(method.getModifiers());
            if (obj == null) {
                z10 = isStatic;
            } else if (!isStatic) {
                z10 = true;
            }
            if (z10 && a(method.getParameterTypes(), a10)) {
                method.setAccessible(true);
                try {
                    if (method.getReturnType() == Void.TYPE) {
                        method.invoke(obj, objArr);
                        return null;
                    }
                    return (T) method.invoke(obj, objArr);
                } catch (InvocationTargetException e10) {
                    throw e10;
                }
            }
        }
        while (a11 != null) {
            try {
                Method declaredMethod = a11.getDeclaredMethod(str2, a10);
                f9341d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == Void.TYPE) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                a11 = a11.getSuperclass();
            }
        }
        StringBuilder a12 = android.support.v4.media.d.a("className: ");
        Class<?> cls2 = str;
        if (obj != null) {
            cls2 = obj.getClass();
        }
        a12.append((Object) cls2);
        a12.append(", methodName: ");
        a12.append(str2);
        throw new NoSuchMethodException(a12.toString());
    }

    private static Object b(String str, Object... objArr) {
        int i10 = 0;
        String str2 = str;
        while (str2.startsWith("[")) {
            i10++;
            str2 = str2.substring(1);
        }
        int[] iArr = null;
        if (i10 == objArr.length) {
            int[] iArr2 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    iArr2[i11] = Integer.parseInt(String.valueOf(objArr[i11]));
                } catch (Throwable unused) {
                }
            }
            iArr = iArr2;
        }
        if (iArr != null) {
            Class<?> a10 = "B".equals(str2) ? Byte.TYPE : "S".equals(str2) ? Short.TYPE : "I".equals(str2) ? Integer.TYPE : "J".equals(str2) ? Long.TYPE : "F".equals(str2) ? Float.TYPE : "D".equals(str2) ? Double.TYPE : "Z".equals(str2) ? Boolean.TYPE : "C".equals(str2) ? Character.TYPE : a(str2);
            if (a10 != null) {
                return Array.newInstance(a10, iArr);
            }
        }
        throw new NoSuchMethodException(android.support.v4.media.a.a("className: [", str, ", methodName: <init>"));
    }

    private static <T> T a(String str, Object obj, String str2, Object[] objArr, Class<?>[] clsArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        Class<?> a10 = obj == null ? a(str) : obj.getClass();
        String str3 = a10.getName() + "#" + str2 + "#" + objArr.length;
        Method method = f9341d.get(str3);
        if (method != null) {
            method.setAccessible(true);
            try {
                if (method.getReturnType() == Void.TYPE) {
                    method.invoke(obj, objArr);
                    return null;
                }
                return (T) method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                throw e10;
            }
        }
        while (a10 != null) {
            try {
                Method declaredMethod = a10.getDeclaredMethod(str2, clsArr);
                f9341d.put(str3, declaredMethod);
                declaredMethod.setAccessible(true);
                if (declaredMethod.getReturnType() == Void.TYPE) {
                    declaredMethod.invoke(obj, objArr);
                    return null;
                }
                return (T) declaredMethod.invoke(obj, objArr);
            } catch (InvocationTargetException e11) {
                throw e11;
            } catch (Throwable unused) {
                a10 = a10.getSuperclass();
            }
        }
        StringBuilder a11 = android.support.v4.media.d.a("className: ");
        Class<?> cls = str;
        if (obj != null) {
            cls = obj.getClass();
        }
        a11.append((Object) cls);
        a11.append(", methodName: ");
        a11.append(str2);
        throw new NoSuchMethodException(a11.toString());
    }

    private static void b(Object obj, String str, Object obj2) {
        int i10;
        int byteValue;
        double d10;
        int byteValue2;
        float f10;
        int byteValue3;
        short byteValue4;
        int i11;
        if (obj instanceof List) {
            if (str.startsWith("[") && str.endsWith("]")) {
                try {
                    i11 = Integer.parseInt(str.substring(1, str.length() - 1));
                } catch (Throwable unused) {
                    i11 = -1;
                }
                if (i11 != -1) {
                    ((List) obj).set(i11, obj2);
                    return;
                }
            }
        } else if (str.startsWith("[") && str.endsWith("]")) {
            try {
                i10 = Integer.parseInt(str.substring(1, str.length() - 1));
            } catch (Throwable unused2) {
                i10 = -1;
            }
            if (i10 != -1) {
                String name = obj.getClass().getName();
                while (name.startsWith("[")) {
                    name = name.substring(1);
                }
                Class<?> cls = obj2.getClass();
                if (!"B".equals(name)) {
                    Object obj3 = null;
                    if ("S".equals(name)) {
                        if (cls == Short.class) {
                            obj3 = obj2;
                        } else if (cls == Byte.class) {
                            obj3 = Short.valueOf(((Byte) obj2).byteValue());
                        }
                        if (obj3 != null) {
                            Array.set(obj, i10, obj3);
                            return;
                        }
                    } else if ("I".equals(name)) {
                        if (cls == Integer.class) {
                            obj3 = obj2;
                        } else {
                            if (cls == Short.class) {
                                byteValue4 = ((Short) obj2).shortValue();
                            } else if (cls == Byte.class) {
                                byteValue4 = ((Byte) obj2).byteValue();
                            }
                            obj3 = Integer.valueOf(byteValue4);
                        }
                        if (obj3 != null) {
                            Array.set(obj, i10, obj3);
                            return;
                        }
                    } else if ("J".equals(name)) {
                        if (cls == Long.class) {
                            obj3 = obj2;
                        } else {
                            if (cls == Integer.class) {
                                byteValue3 = ((Integer) obj2).intValue();
                            } else if (cls == Short.class) {
                                byteValue3 = ((Short) obj2).shortValue();
                            } else if (cls == Byte.class) {
                                byteValue3 = ((Byte) obj2).byteValue();
                            }
                            obj3 = Long.valueOf(byteValue3);
                        }
                        if (obj3 != null) {
                            Array.set(obj, i10, obj3);
                            return;
                        }
                    } else if ("F".equals(name)) {
                        if (cls == Float.class) {
                            obj3 = obj2;
                        } else {
                            if (cls == Long.class) {
                                f10 = (float) ((Long) obj2).longValue();
                            } else {
                                if (cls == Integer.class) {
                                    byteValue2 = ((Integer) obj2).intValue();
                                } else if (cls == Short.class) {
                                    byteValue2 = ((Short) obj2).shortValue();
                                } else if (cls == Byte.class) {
                                    byteValue2 = ((Byte) obj2).byteValue();
                                }
                                f10 = byteValue2;
                            }
                            obj3 = Float.valueOf(f10);
                        }
                        if (obj3 != null) {
                            Array.set(obj, i10, obj3);
                            return;
                        }
                    } else if ("D".equals(name)) {
                        if (cls == Double.class) {
                            obj3 = obj2;
                        } else {
                            if (cls == Float.class) {
                                d10 = ((Float) obj2).floatValue();
                            } else if (cls == Long.class) {
                                d10 = ((Long) obj2).longValue();
                            } else {
                                if (cls == Integer.class) {
                                    byteValue = ((Integer) obj2).intValue();
                                } else if (cls == Short.class) {
                                    byteValue = ((Short) obj2).shortValue();
                                } else if (cls == Byte.class) {
                                    byteValue = ((Byte) obj2).byteValue();
                                }
                                d10 = byteValue;
                            }
                            obj3 = Double.valueOf(d10);
                        }
                        if (obj3 != null) {
                            Array.set(obj, i10, obj3);
                            return;
                        }
                    } else if ("Z".equals(name)) {
                        if (cls == Boolean.class) {
                            Array.set(obj, i10, obj2);
                            return;
                        }
                    } else if ("C".equals(name)) {
                        if (cls == Character.class) {
                            Array.set(obj, i10, obj2);
                            return;
                        }
                    } else if (name.equals(cls.getName())) {
                        Array.set(obj, i10, obj2);
                        return;
                    }
                } else if (cls == Byte.class) {
                    Array.set(obj, i10, obj2);
                    return;
                }
            }
        }
        StringBuilder a10 = android.support.v4.media.d.a("className: ");
        a10.append(obj.getClass());
        a10.append(", fieldName: ");
        a10.append(str);
        a10.append(", value: ");
        a10.append(String.valueOf(obj2));
        throw new NoSuchFieldException(a10.toString());
    }

    private static Object a(String str, Object... objArr) {
        boolean z10;
        if (str.startsWith("[")) {
            return b(str, objArr);
        }
        Class<?> a10 = a(str);
        String str2 = a10.getName() + "#" + objArr.length;
        Constructor<?> constructor = f9342e.get(str2);
        Class<?>[] a11 = a(objArr);
        if (constructor != null && a(constructor.getParameterTypes(), a11)) {
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        }
        Constructor<?>[] declaredConstructors = a10.getDeclaredConstructors();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Constructor<?> constructor2 : declaredConstructors) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if (a(parameterTypes, a11)) {
                f9342e.put(str2, constructor2);
                constructor2.setAccessible(true);
                return constructor2.newInstance(objArr);
            }
            if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].isArray() && a11.length >= parameterTypes.length - 1) {
                arrayList.add(constructor2);
                arrayList2.add(parameterTypes);
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Class[] clsArr = (Class[]) arrayList2.get(i10);
            Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
            if (b(clsArr, a11)) {
                Object[] objArr2 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                objArr2[objArr.length] = Array.newInstance(componentType, 0);
                Constructor constructor3 = (Constructor) arrayList.get(i10);
                constructor3.setAccessible(true);
                return constructor3.newInstance(objArr);
            }
            int length = clsArr.length - 1;
            while (true) {
                if (length >= a11.length) {
                    z10 = true;
                    break;
                } else if (!a11[length].equals(componentType)) {
                    z10 = false;
                    break;
                } else {
                    length++;
                }
            }
            if (z10) {
                int length2 = (a11.length - clsArr.length) + 1;
                Object newInstance = Array.newInstance(componentType, length2);
                for (int i11 = 0; i11 < length2; i11++) {
                    Array.set(newInstance, i11, objArr[(clsArr.length - 1) + i11]);
                }
                Object[] objArr3 = new Object[objArr.length + 1];
                System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
                objArr3[objArr.length] = newInstance;
                Constructor constructor4 = (Constructor) arrayList.get(i10);
                constructor4.setAccessible(true);
                return constructor4.newInstance(objArr);
            }
        }
        throw new NoSuchMethodException(android.support.v4.media.a.a("className: ", str, ", methodName: <init>"));
    }

    private static void a(Object obj, String str, Object obj2) {
        if ((obj instanceof List) || obj.getClass().isArray()) {
            b(obj, str, obj2);
        } else if (!(obj instanceof Map)) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                arrayList.add(cls);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = null;
                try {
                    field = ((Class) it.next()).getDeclaredField(str);
                } catch (Throwable unused) {
                }
                if (field != null && !Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    field.set(obj, obj2);
                    return;
                }
            }
            StringBuilder a10 = android.support.v4.media.d.a("className: ");
            a10.append(obj.getClass());
            a10.append(", fieldName: ");
            a10.append(str);
            a10.append(", value: ");
            a10.append(String.valueOf(obj2));
            throw new NoSuchFieldException(a10.toString());
        } else {
            ((Map) obj).put(str, obj2);
        }
    }
}
