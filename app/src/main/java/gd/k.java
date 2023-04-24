package gd;

import java.util.Locale;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public int f15300a;

    /* renamed from: b */
    public int f15301b;

    /* renamed from: c */
    public int f15302c;

    /* renamed from: d */
    public int f15303d;

    public k(int i10, int i11, int i12, int i13) {
        this.f15300a = i10;
        this.f15301b = i11;
        this.f15302c = i12;
        this.f15303d = i13;
    }

    public final b a() {
        return new b(this.f15300a, this.f15301b, this.f15302c, this.f15303d);
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\teqType=0x%02X, eqMode=0x%02X, eqIndex=%d, scene=%d", new Object[]{Integer.valueOf(this.f15300a), Integer.valueOf(this.f15301b), Integer.valueOf(this.f15302c), Integer.valueOf(this.f15303d)}, android.support.v4.media.d.a("EqIndexEvent {"), "\n}");
    }
}
