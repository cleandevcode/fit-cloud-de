package w1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    public static final q f29678a = new q();

    /* renamed from: b */
    public static final p<?> f29679b;

    static {
        p<?> pVar;
        try {
            pVar = (p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pVar = null;
        }
        f29679b = pVar;
    }
}
