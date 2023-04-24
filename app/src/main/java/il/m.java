package il;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a */
    public static final boolean f17182a;

    static {
        boolean z10 = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z10 = "true".equals(property);
            }
        } catch (Throwable th2) {
            h7.a.y(th2);
        }
        f17182a = z10;
    }
}
