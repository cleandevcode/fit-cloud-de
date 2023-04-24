package w1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final Class<?> f29548a;

    /* renamed from: b */
    public static final boolean f29549b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f29548a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f29549b = z10;
    }

    public static boolean a() {
        return (f29548a == null || f29549b) ? false : true;
    }
}
