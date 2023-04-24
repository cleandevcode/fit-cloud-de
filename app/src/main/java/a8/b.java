package a8;

import a8.d;

/* loaded from: classes.dex */
public final class b extends d.a {

    /* renamed from: d */
    public static d<b> f366d;

    /* renamed from: b */
    public double f367b = 0.0d;

    /* renamed from: c */
    public double f368c = 0.0d;

    static {
        d<b> a10 = d.a(64, new b());
        f366d = a10;
        a10.f378f = 0.5f;
    }

    public static b b(double d10, double d11) {
        b b10 = f366d.b();
        b10.f367b = d10;
        b10.f368c = d11;
        return b10;
    }

    public static void c(b bVar) {
        f366d.c(bVar);
    }

    @Override // a8.d.a
    public final d.a a() {
        return new b();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MPPointD, x: ");
        a10.append(this.f367b);
        a10.append(", y: ");
        a10.append(this.f368c);
        return a10.toString();
    }
}
