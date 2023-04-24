package za;

/* loaded from: classes.dex */
public abstract class e extends Exception {

    /* renamed from: a */
    public static final boolean f32198a;

    /* renamed from: b */
    public static final StackTraceElement[] f32199b;

    static {
        f32198a = System.getProperty("surefire.test.class.path") != null;
        f32199b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
