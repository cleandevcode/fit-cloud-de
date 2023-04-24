package com.mob.commons.cc;

import com.mob.commons.cc.y;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a */
    private static final HashMap<String, Class<?>> f8310a;

    /* renamed from: b */
    private final HashMap<String, HashMap<String, String[][]>> f8311b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Class<?>, s<?>> f8312c = new HashMap<>();

    static {
        HashMap<String, Class<?>> hashMap = new HashMap<>();
        f8310a = hashMap;
        hashMap.put("int", Integer.TYPE);
        hashMap.put("double", Double.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("float", Float.TYPE);
        hashMap.put("boolean", Boolean.TYPE);
        hashMap.put("short", Short.TYPE);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("void", Void.TYPE);
    }

    public t() {
        a(y.a.class, y.a.class);
    }

    private Class<?> a(String str) {
        Class<?> cls = f8310a.get(str);
        if (cls == null) {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return null;
            }
        }
        return cls;
    }

    private boolean b(Class<?> cls, Class<?> cls2) {
        return (cls == Byte.TYPE && cls2 == Byte.class) || (cls == Short.TYPE && (cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Character.TYPE && (cls2 == Character.class || cls2 == Short.class || cls2 == Byte.class)) || ((cls == Integer.TYPE && (cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Long.TYPE && (cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Float.TYPE && (cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || ((cls == Double.TYPE && (cls2 == Double.class || cls2 == Float.class || cls2 == Long.class || cls2 == Integer.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Character.class)) || (cls == Boolean.TYPE && cls2 == Boolean.class))))));
    }

    public Constructor a(Class<?> cls, Object[] objArr, boolean[][] zArr) {
        String[][] strArr;
        boolean z10;
        boolean[] zArr2;
        boolean[] a10;
        HashMap<String, String[][]> hashMap = this.f8311b.get(cls.getName());
        if (hashMap == null || (strArr = hashMap.get("<init>")) == null) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2.length - 1 == objArr.length) {
                int length = objArr.length;
                Class<?>[] clsArr = new Class[length];
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    int i11 = i10 + 1;
                    Class<?> a11 = a(strArr2[i11]);
                    clsArr[i10] = a11;
                    if (a11 == null) {
                        z10 = true;
                        break;
                    }
                    i10 = i11;
                }
                if (!z10 && (a10 = a(clsArr, objArr, (zArr2 = new boolean[1]))) != null) {
                    zArr[0] = a10;
                    zArr[1] = zArr2;
                    return cls.getDeclaredConstructor(clsArr);
                }
            }
        }
        return null;
    }

    public Method a(Class<?> cls, String str, boolean z10, Object[] objArr, boolean[][] zArr) {
        String[][] strArr;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean[] zArr2;
        boolean[] a10;
        HashMap<String, String[][]> hashMap = this.f8311b.get(cls.getName());
        if (hashMap == null || (strArr = hashMap.get(str)) == null) {
            return null;
        }
        for (String[] strArr2 : strArr) {
            if (strArr2[0] != null) {
                z11 = z10;
                z12 = true;
            } else {
                z11 = z10;
                z12 = false;
            }
            if ((z11 == z12) && strArr2.length - 1 == objArr.length) {
                int length = objArr.length;
                Class<?>[] clsArr = new Class[length];
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z13 = false;
                        break;
                    }
                    int i11 = i10 + 1;
                    Class<?> a11 = a(strArr2[i11]);
                    clsArr[i10] = a11;
                    if (a11 == null) {
                        z13 = true;
                        break;
                    }
                    i10 = i11;
                }
                if (!z13 && (a10 = a(clsArr, objArr, (zArr2 = new boolean[1]))) != null) {
                    zArr[0] = a10;
                    zArr[1] = zArr2;
                    return cls.getDeclaredMethod(str, clsArr);
                }
            }
        }
        return null;
    }

    public void a(Class<?> cls, Class<? extends s<?>> cls2) {
        try {
            s<?> newInstance = cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (this.f8312c.get(cls) == null) {
                this.f8312c.put(cls, newInstance);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), "utf-8"));
        try {
            try {
                HashMap<String, String[][]> hashMap = null;
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    String substring = readLine.substring(0, 2);
                    String substring2 = readLine.substring(2);
                    if (":P".equals(substring)) {
                        arrayList.addAll(Arrays.asList(substring2.split("#")));
                    } else if (":C".equals(substring)) {
                        String str = (String) arrayList.get(Integer.parseInt(substring2));
                        hashMap = this.f8311b.get(str);
                        if (hashMap == null) {
                            hashMap = new HashMap<>();
                            this.f8311b.put(str, hashMap);
                        }
                    } else {
                        String[] split = substring2.split("#");
                        String str2 = (String) arrayList.get(Integer.parseInt(split[0]));
                        String[][] strArr = new String[Integer.parseInt(split[1])];
                        for (int i10 = 2; i10 < split.length; i10++) {
                            String str3 = split[i10].startsWith("+") ? "+" : null;
                            if (split[i10].length() > 1) {
                                String[] split2 = split[i10].substring(1).split(",");
                                String[] strArr2 = new String[split2.length + 1];
                                strArr2[0] = str3;
                                int i11 = 0;
                                while (i11 < split2.length) {
                                    int i12 = i11 + 1;
                                    strArr2[i12] = (String) arrayList.get(Integer.parseInt(split2[i11]));
                                    i11 = i12;
                                }
                                strArr[i10 - 2] = strArr2;
                            } else {
                                String[] strArr3 = new String[1];
                                strArr3[0] = str3;
                                strArr[i10 - 2] = strArr3;
                            }
                        }
                        hashMap.put(str2, strArr);
                    }
                }
            } catch (Throwable unused) {
                this.f8311b.clear();
            }
        } finally {
            bufferedReader.close();
        }
    }

    public boolean a(Object obj, Class<?> cls, String str, Object[] objArr, r rVar) {
        s<?> sVar = null;
        for (Class<?> cls2 = cls; sVar == null && cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            sVar = this.f8312c.get(cls2);
        }
        if (sVar != null) {
            boolean[] zArr = new boolean[1];
            Object[] objArr2 = new Object[1];
            Throwable[] thArr = new Throwable[1];
            boolean a10 = sVar.a(obj, cls, str, objArr, zArr, objArr2, thArr);
            if (a10) {
                Throwable th2 = thArr[0];
                if (th2 != null) {
                    throw th2;
                }
                if (!zArr[0]) {
                    rVar.a(objArr2[0]);
                }
            }
            return a10;
        }
        return false;
    }

    public Object[] a(r rVar, Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        Object[] objArr2 = new Object[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                if (zArr[i10]) {
                    objArr2[i10] = rVar.a(obj, true, clsArr[i10]);
                } else {
                    objArr2[i10] = obj;
                }
            }
        }
        return objArr2;
    }

    public boolean[] a(Class<?>[] clsArr, Object[] objArr, boolean[] zArr) {
        zArr[0] = true;
        if (clsArr.length == objArr.length) {
            boolean[] zArr2 = new boolean[clsArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                if (obj != null) {
                    Class<?> cls = clsArr[i10];
                    if (cls.isInterface() && (obj instanceof y)) {
                        zArr2[i10] = true;
                        zArr[0] = false;
                    } else {
                        Class<?> cls2 = obj.getClass();
                        if (!b(cls, cls2) && !cls.isAssignableFrom(cls2)) {
                            return null;
                        }
                        zArr2[i10] = false;
                    }
                }
            }
            return zArr2;
        }
        return null;
    }
}
