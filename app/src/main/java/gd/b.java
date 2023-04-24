package gd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f15232a;

    /* renamed from: b */
    public int f15233b;

    /* renamed from: c */
    public int f15234c;

    /* renamed from: d */
    public int f15235d;

    public b(int i10, int i11, int i12, int i13) {
        this.f15235d = i13;
        this.f15232a = i10;
        this.f15233b = i11;
        this.f15234c = i12;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\nscene=0x%02X, eqType=%d,eqMode=%d,eqIndex=%d", new Object[]{Integer.valueOf(this.f15235d), Integer.valueOf(this.f15232a), Integer.valueOf(this.f15233b), Integer.valueOf(this.f15234c)}, android.support.v4.media.d.a("EqEntryIndex {"), "\n}");
    }
}
