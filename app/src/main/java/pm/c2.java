package pm;

/* loaded from: classes2.dex */
public final class c2 {

    /* renamed from: a */
    public static final ThreadLocal<u0> f24328a = new ThreadLocal<>();

    public static u0 a() {
        ThreadLocal<u0> threadLocal = f24328a;
        u0 u0Var = threadLocal.get();
        if (u0Var == null) {
            e eVar = new e(Thread.currentThread());
            threadLocal.set(eVar);
            return eVar;
        }
        return u0Var;
    }
}
