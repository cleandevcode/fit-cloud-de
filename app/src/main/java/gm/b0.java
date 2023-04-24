package gm;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a */
    public static final c0 f15488a;

    /* renamed from: b */
    public static final mm.b[] f15489b;

    static {
        c0 c0Var = null;
        try {
            c0Var = (c0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0Var == null) {
            c0Var = new c0();
        }
        f15488a = c0Var;
        f15489b = new mm.b[0];
    }

    public static e a(Class cls) {
        f15488a.getClass();
        return new e(cls);
    }
}
