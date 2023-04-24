package ie;

/* loaded from: classes.dex */
public class a extends Exception {

    /* renamed from: a */
    public int f16769a;

    /* renamed from: b */
    public int f16770b;

    public a(int i10) {
        this(null, i10, 0);
    }

    public a(String str, int i10) {
        this(str, i10, 0);
    }

    public a(String str, int i10, int i11) {
        super(str);
        this.f16769a = 65536;
        this.f16770b = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return String.format("[0x%02X : 0x%04X] %s", Integer.valueOf(this.f16769a), Integer.valueOf(this.f16770b), super.getMessage());
    }
}
