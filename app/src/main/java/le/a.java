package le;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public String f19450a;

    /* renamed from: b */
    public long f19451b;

    /* renamed from: c */
    public int f19452c;

    /* renamed from: d */
    public int f19453d;

    public a(int i10, String str, int i11, int i12) {
        this.f19450a = str;
        this.f19451b = i10;
        this.f19452c = i11;
        this.f19453d = i12;
    }

    public final String toString() {
        return String.format(Locale.US, "skipOffset=%d, length=0x%02X, budRole=0x%02X", Long.valueOf(this.f19451b), Integer.valueOf(this.f19452c), Integer.valueOf(this.f19453d));
    }
}
