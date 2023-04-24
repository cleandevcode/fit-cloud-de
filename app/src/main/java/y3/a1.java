package y3;

import java.util.Map;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a */
    public static final Map<? extends Class<? extends Object>, Class<? extends Object>> f30928a;

    static {
        Class cls = Boolean.TYPE;
        f30928a = ul.z.D(new tl.f(cls, cls), new tl.f(Byte.TYPE, Byte.class), new tl.f(Character.TYPE, Character.class), new tl.f(Double.TYPE, Double.class), new tl.f(Float.TYPE, Float.class), new tl.f(Integer.TYPE, Integer.class), new tl.f(Long.TYPE, Long.class), new tl.f(Short.TYPE, Short.class));
    }

    public static final boolean a(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return gm.l.a(f30928a.get(cls2), cls);
        }
        throw new IllegalArgumentException("First argument has to be primitive type".toString());
    }
}
