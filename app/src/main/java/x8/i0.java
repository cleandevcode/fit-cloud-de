package x8;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i0 implements Executor {

    /* renamed from: a */
    public static final i0 f30419a;

    /* renamed from: b */
    public static final /* synthetic */ i0[] f30420b;

    static {
        i0 i0Var = new i0();
        f30419a = i0Var;
        f30420b = new i0[]{i0Var};
    }

    public static i0[] values() {
        return (i0[]) f30420b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
