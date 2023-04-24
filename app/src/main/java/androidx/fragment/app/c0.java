package androidx.fragment.app;

import androidx.fragment.app.r;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a */
    public static final o0.h<ClassLoader, o0.h<String, Class<?>>> f2333a = new o0.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        o0.h<ClassLoader, o0.h<String, Class<?>>> hVar = f2333a;
        o0.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new o0.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = orDefault.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            orDefault.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends r> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new r.d(android.support.v4.media.a.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public r a(String str) {
        throw null;
    }
}
