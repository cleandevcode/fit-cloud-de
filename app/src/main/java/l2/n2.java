package l2;

/* loaded from: classes.dex */
public abstract class n2<Key, Value> {

    /* loaded from: classes.dex */
    public enum a {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a */
            public final Throwable f19129a;

            public a(Exception exc) {
                this.f19129a = exc;
            }
        }

        /* renamed from: l2.n2$b$b */
        /* loaded from: classes.dex */
        public static final class C0339b extends b {

            /* renamed from: a */
            public final boolean f19130a;

            public C0339b(boolean z10) {
                this.f19130a = z10;
            }
        }
    }

    public abstract Object a(xl.d<? super a> dVar);

    public abstract Object b(r0 r0Var, m2<Key, Value> m2Var, xl.d<? super b> dVar);
}
