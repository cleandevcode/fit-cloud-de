package n4;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public static boolean f22005a = false;

    static {
        try {
            Class.forName("java.sql.Time");
            f22005a = true;
        } catch (Throwable unused) {
            f22005a = false;
        }
    }

    public static <ARG, T> T a(d<ARG, T> dVar, ARG arg) {
        if (f22005a) {
            return dVar.apply(arg);
        }
        return null;
    }
}
