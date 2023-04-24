package a8;

import a8.d;

/* loaded from: classes.dex */
public final class c extends d.a {

    /* renamed from: d */
    public static d<c> f369d;

    /* renamed from: b */
    public float f370b;

    /* renamed from: c */
    public float f371c;

    static {
        d<c> a10 = d.a(32, new c(0.0f, 0.0f));
        f369d = a10;
        a10.f378f = 0.5f;
    }

    public c() {
    }

    public c(float f10, float f11) {
        this.f370b = f10;
        this.f371c = f11;
    }

    public static c b(float f10, float f11) {
        c b10 = f369d.b();
        b10.f370b = f10;
        b10.f371c = f11;
        return b10;
    }

    public static c c(c cVar) {
        c b10 = f369d.b();
        b10.f370b = cVar.f370b;
        b10.f371c = cVar.f371c;
        return b10;
    }

    public static void d(c cVar) {
        f369d.c(cVar);
    }

    @Override // a8.d.a
    public final d.a a() {
        return new c(0.0f, 0.0f);
    }
}
