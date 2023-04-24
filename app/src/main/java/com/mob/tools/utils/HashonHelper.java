package com.mob.tools.utils;

import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HashonHelper implements PublicMemberKeeper {

    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, java.util.Map] */
    private static <T> T a(Object obj, Class<T> cls, Type[] typeArr) {
        Field field;
        Type type;
        Type type2;
        Object obj2;
        Object obj3;
        Object obj4;
        int i10 = 0;
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls.equals(Character.class)) {
            return (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) ? (T) Boolean.valueOf(i.a("004fWfjfeWk").equals(String.valueOf(obj))) : (cls.equals(Character.TYPE) || cls.equals(Character.class)) ? (T) Character.valueOf(String.valueOf(obj).charAt(0)) : (cls.equals(Byte.TYPE) || cls.equals(Byte.class)) ? (T) Byte.valueOf(String.valueOf(obj)) : (cls.equals(Short.TYPE) || cls.equals(Short.class)) ? (T) Short.valueOf(String.valueOf(obj)) : (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) ? (T) Integer.valueOf(String.valueOf(obj)) : (cls.equals(Long.TYPE) || cls.equals(Long.class)) ? (T) Long.valueOf(String.valueOf(obj)) : (cls.equals(Float.TYPE) || cls.equals(Float.class)) ? (T) Float.valueOf(String.valueOf(obj)) : (T) Double.valueOf(String.valueOf(obj));
        } else if (a.class.isAssignableFrom(cls)) {
            try {
                return (T) ReflectHelper.invokeStaticMethod(ReflectHelper.importClass(cls.getName()), i.a("007lHfhgffe-k$hnhj"), obj);
            } catch (Throwable unused) {
                return null;
            }
        } else if (cls.equals(String.class) || cls.equals(Boolean.class)) {
            return obj;
        } else {
            if (cls.isEnum()) {
                return (T) Enum.valueOf(cls, String.valueOf(((HashMap) obj).get(i.a("004kBfmfe1n"))));
            }
            if (cls.isArray()) {
                ArrayList arrayList = (ArrayList) obj;
                Class<?> componentType = cls.getComponentType();
                T t10 = (T) Array.newInstance(componentType, arrayList.size());
                int size = arrayList.size();
                while (i10 < size) {
                    Array.set(t10, i10, a(arrayList.get(i10), componentType, null));
                    i10++;
                }
                return t10;
            } else if (Collection.class.isAssignableFrom(cls)) {
                ?? r92 = (T) ((Collection) cls.newInstance());
                Type type3 = (typeArr == null || typeArr.length <= 0) ? null : typeArr[0];
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    if (type3 != null && (type3 instanceof Class) && !type3.equals(Object.class)) {
                        obj4 = a(arrayList2.get(i10), (Class) type3, null);
                    } else if (type3 == null || !(type3 instanceof ParameterizedType)) {
                        obj4 = arrayList2.get(i10);
                    } else {
                        ParameterizedType parameterizedType = (ParameterizedType) type3;
                        obj4 = a(arrayList2.get(i10), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
                    }
                    r92.add(obj4);
                    i10++;
                }
                return r92;
            } else if (!Map.class.isAssignableFrom(cls)) {
                ArrayList arrayList3 = new ArrayList();
                for (Class<T> cls2 = cls; !cls2.equals(Object.class); cls2 = cls2.getSuperclass()) {
                    arrayList3.add(cls2);
                }
                HashMap hashMap = (HashMap) obj;
                HashMap hashMap2 = new HashMap();
                for (String str : hashMap.keySet()) {
                    if (hashMap.get(str) != null) {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    field = ((Class) it.next()).getDeclaredField(str);
                                    continue;
                                } catch (Throwable unused2) {
                                    field = null;
                                    continue;
                                }
                                if (field != null) {
                                    hashMap2.put(str, field);
                                    break;
                                }
                            }
                        }
                    }
                }
                T t11 = (T) ReflectHelper.newInstance(ReflectHelper.getName(cls), new Object[0]);
                for (String str2 : hashMap2.keySet()) {
                    Object obj5 = hashMap.get(str2);
                    Field field2 = (Field) hashMap2.get(str2);
                    Class<?> type4 = field2.getType();
                    Type genericType = field2.getGenericType();
                    Type[] actualTypeArguments = genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments() : null;
                    field2.setAccessible(true);
                    field2.set(t11, a(obj5, type4, actualTypeArguments));
                }
                return t11;
            } else {
                ?? r93 = (T) ((Map) cls.newInstance());
                if (typeArr == null || typeArr.length <= 1) {
                    type = null;
                    type2 = null;
                } else {
                    type2 = typeArr[0];
                    type = typeArr[1];
                }
                HashMap hashMap3 = (HashMap) obj;
                for (Object obj6 : hashMap3.keySet()) {
                    if (type2 != null && (type2 instanceof Class) && !type.equals(Object.class)) {
                        obj2 = a(obj6, (Class) type2, null);
                    } else if (type2 == null || !(type2 instanceof ParameterizedType)) {
                        obj2 = obj6;
                    } else {
                        ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                        obj2 = a(obj6, (Class) parameterizedType2.getRawType(), parameterizedType2.getActualTypeArguments());
                    }
                    if (type != null && (type instanceof Class) && !type.equals(Object.class)) {
                        obj3 = a(hashMap3.get(obj6), (Class) type, null);
                    } else if (type == null || !(type instanceof ParameterizedType)) {
                        obj3 = hashMap3.get(obj6);
                    } else {
                        ParameterizedType parameterizedType3 = (ParameterizedType) type;
                        obj3 = a(hashMap3.get(obj6), (Class) parameterizedType3.getRawType(), parameterizedType3.getActualTypeArguments());
                    }
                    r93.put(obj2, obj3);
                }
                return r93;
            }
        }
    }

    private static String a(String str, ArrayList<Object> arrayList) {
        String a10;
        StringBuilder a11 = android.support.v4.media.d.a("[\n");
        String b10 = a.b.b(str, "\t");
        Iterator<Object> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 > 0) {
                a11.append(",\n");
            }
            a11.append(b10);
            if (next instanceof HashMap) {
                a10 = a(b10, (HashMap) next);
            } else if (next instanceof ArrayList) {
                a10 = a(b10, (ArrayList) next);
            } else {
                if (next instanceof String) {
                    a11.append('\"');
                    a11.append(next);
                    a11.append('\"');
                } else {
                    a11.append(next);
                }
                i10++;
            }
            a11.append(a10);
            i10++;
        }
        a11.append('\n');
        a11.append(str);
        a11.append(']');
        return a11.toString();
    }

    private static ArrayList<Object> a(JSONArray jSONArray) {
        ArrayList<Object> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object opt = jSONArray.opt(i10);
            if (opt instanceof JSONObject) {
                opt = a((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = a((JSONArray) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> HashMap<String, T> a(JSONObject jSONObject) {
        HashMap<String, T> hashMap = (HashMap<String, T>) new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (JSONObject.NULL.equals(opt)) {
                opt = null;
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    opt = a((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = a((JSONArray) opt);
                }
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    private static JSONArray a(ArrayList<Object> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof HashMap) {
                next = a((HashMap) next);
            } else if (next instanceof ArrayList) {
                next = a((ArrayList<Object>) next);
            }
            jSONArray.put(next);
        }
        return jSONArray;
    }

    private static <T> JSONObject a(HashMap<String, T> hashMap) {
        ArrayList<?> b10;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, T> entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                value = a((HashMap) value);
            } else {
                if (value instanceof ArrayList) {
                    b10 = (ArrayList) value;
                } else if (a(value)) {
                    b10 = b(value);
                }
                value = a((ArrayList<Object>) b10);
            }
            jSONObject.put(entry.getKey(), value);
        }
        return jSONObject;
    }

    private static boolean a(Object obj) {
        return (obj instanceof byte[]) || (obj instanceof short[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[]) || (obj instanceof char[]) || (obj instanceof boolean[]) || (obj instanceof String[]);
    }

    private static ArrayList<?> b(Object obj) {
        int i10 = 0;
        if (obj instanceof byte[]) {
            ArrayList<?> arrayList = new ArrayList<>();
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            while (i10 < length) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        } else if (obj instanceof short[]) {
            ArrayList<?> arrayList2 = new ArrayList<>();
            short[] sArr = (short[]) obj;
            int length2 = sArr.length;
            while (i10 < length2) {
                arrayList2.add(Short.valueOf(sArr[i10]));
                i10++;
            }
            return arrayList2;
        } else if (obj instanceof int[]) {
            ArrayList<?> arrayList3 = new ArrayList<>();
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i10 < length3) {
                arrayList3.add(Integer.valueOf(iArr[i10]));
                i10++;
            }
            return arrayList3;
        } else if (obj instanceof long[]) {
            ArrayList<?> arrayList4 = new ArrayList<>();
            long[] jArr = (long[]) obj;
            int length4 = jArr.length;
            while (i10 < length4) {
                arrayList4.add(Long.valueOf(jArr[i10]));
                i10++;
            }
            return arrayList4;
        } else if (obj instanceof float[]) {
            ArrayList<?> arrayList5 = new ArrayList<>();
            float[] fArr = (float[]) obj;
            int length5 = fArr.length;
            while (i10 < length5) {
                arrayList5.add(Float.valueOf(fArr[i10]));
                i10++;
            }
            return arrayList5;
        } else if (obj instanceof double[]) {
            ArrayList<?> arrayList6 = new ArrayList<>();
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i10 < length6) {
                arrayList6.add(Double.valueOf(dArr[i10]));
                i10++;
            }
            return arrayList6;
        } else if (obj instanceof char[]) {
            ArrayList<?> arrayList7 = new ArrayList<>();
            char[] cArr = (char[]) obj;
            int length7 = cArr.length;
            while (i10 < length7) {
                arrayList7.add(Character.valueOf(cArr[i10]));
                i10++;
            }
            return arrayList7;
        } else if (!(obj instanceof boolean[])) {
            if (obj instanceof String[]) {
                return new ArrayList<>(Arrays.asList((String[]) obj));
            }
            return null;
        } else {
            ArrayList<?> arrayList8 = new ArrayList<>();
            boolean[] zArr = (boolean[]) obj;
            int length8 = zArr.length;
            while (i10 < length8) {
                arrayList8.add(Boolean.valueOf(zArr[i10]));
                i10++;
            }
            return arrayList8;
        }
    }

    private static Object c(Object obj) {
        Field[] declaredFields;
        if (obj == null || obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof a) {
            return c(((a) obj).a());
        }
        if (obj instanceof Enum) {
            HashMap hashMap = new HashMap();
            hashMap.put(i.a("004k%fmfe9n"), ((Enum) obj).name());
            return hashMap;
        }
        if (obj.getClass().isArray()) {
            ArrayList arrayList = new ArrayList();
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(c(Array.get(obj, i10)));
            }
            return arrayList;
        } else if (obj instanceof Collection) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Collection) obj) {
                arrayList2.add(c(obj2));
            }
            return arrayList2;
        } else if (obj instanceof Map) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    hashMap2.put((String) key, c(entry.getValue()));
                }
            }
            return hashMap2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Class<?> cls = obj.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
                arrayList3.add(0, cls);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                for (Field field : ((Class) it.next()).getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getName().contains("$")) {
                        arrayList4.add(field);
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                Field field2 = (Field) it2.next();
                field2.setAccessible(true);
                hashMap3.put(field2.getName(), c(field2.get(obj)));
            }
            return hashMap3;
        }
    }

    public static String format(String str) {
        try {
            return a("", fromJson(str));
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    public static <T> String fromHashMap(HashMap<String, T> hashMap) {
        try {
            JSONObject a10 = a((HashMap) hashMap);
            return a10 == null ? "" : a10.toString();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return "";
        }
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        HashMap fromJson = fromJson(str);
        Object obj = fromJson;
        if (str.startsWith("[")) {
            obj = fromJson;
            if (str.endsWith("]")) {
                obj = fromJson.get(i.a("008Ghjfhfl,k)gffghiSf"));
            }
        }
        try {
            Type genericSuperclass = cls.getGenericSuperclass();
            return (T) a(obj, cls, genericSuperclass instanceof ParameterizedType ? ((ParameterizedType) genericSuperclass).getActualTypeArguments() : null);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static <T> HashMap<String, T> fromJson(String str) {
        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }
        try {
            if (str.startsWith("[") && str.endsWith("]")) {
                str = "{\"fakelist\":" + str + "}";
            }
            return a(new JSONObject(str));
        } catch (Throwable th2) {
            MobLog.getInstance().w(str);
            MobLog.getInstance().w(th2);
            return new HashMap<>();
        }
    }

    public static String fromObject(Object obj) {
        Object obj2;
        try {
            obj2 = c(obj);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            obj2 = null;
        }
        if (obj2 == null) {
            return "";
        }
        if (obj2 instanceof ArrayList) {
            HashMap hashMap = new HashMap();
            hashMap.put(i.a("004YgffghiZf"), obj2);
            String fromHashMap = fromHashMap(hashMap);
            return fromHashMap.substring(8, fromHashMap.length() - 1).trim();
        }
        return fromHashMap((HashMap) obj2);
    }

    private static String a(String str, HashMap<String, Object> hashMap) {
        String a10;
        StringBuilder a11 = android.support.v4.media.d.a("{\n");
        String b10 = a.b.b(str, "\t");
        int i10 = 0;
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (i10 > 0) {
                a11.append(",\n");
            }
            a11.append(b10);
            a11.append('\"');
            a11.append(entry.getKey());
            a11.append("\":");
            Object value = entry.getValue();
            if (value instanceof HashMap) {
                a10 = a(b10, (HashMap) value);
            } else if (value instanceof ArrayList) {
                a10 = a(b10, (ArrayList) value);
            } else {
                if (value instanceof String) {
                    a11.append('\"');
                    a11.append(value);
                    a11.append('\"');
                } else {
                    a11.append(value);
                }
                i10++;
            }
            a11.append(a10);
            i10++;
        }
        a11.append('\n');
        a11.append(str);
        a11.append('}');
        return a11.toString();
    }
}
