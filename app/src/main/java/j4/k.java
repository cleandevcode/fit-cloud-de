package j4;

/* loaded from: classes.dex */
public abstract class k implements b1 {

    /* renamed from: a */
    public static final ThreadLocal<i0> f17423a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<Character> f17424b = new ThreadLocal<>();

    public final char e(i0 i0Var, Object obj, char c10) {
        ThreadLocal<i0> threadLocal = f17423a;
        threadLocal.set(i0Var);
        ThreadLocal<Character> threadLocal2 = f17424b;
        threadLocal2.set(Character.valueOf(c10));
        f();
        threadLocal.set(threadLocal.get());
        return threadLocal2.get().charValue();
    }

    public abstract void f();
}
