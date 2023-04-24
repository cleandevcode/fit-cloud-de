package i8;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b */
    public static q f16701b;

    /* renamed from: c */
    public static final r f16702c = new r(0, 0, 0, false, false);

    /* renamed from: a */
    public r f16703a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            if (f16701b == null) {
                f16701b = new q();
            }
            qVar = f16701b;
        }
        return qVar;
    }
}
