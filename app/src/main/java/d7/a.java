package d7;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public static final b f12825a = new b(3000);

    /* renamed from: d7.a$a */
    /* loaded from: classes.dex */
    public static final class C0218a extends a {

        /* renamed from: b */
        public final long f12826b;

        public C0218a(long j10) {
            this.f12826b = j10;
            if (j10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("delay should > 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: b */
        public final long f12827b;

        public b(long j10) {
            this.f12827b = j10;
            if (j10 >= 0) {
                return;
            }
            throw new IllegalArgumentException("delay should > 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: b */
        public static final c f12828b = new c();
    }
}
