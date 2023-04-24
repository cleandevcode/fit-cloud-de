package jh;

/* loaded from: classes2.dex */
public final class r extends Exception {

    /* renamed from: a */
    public final String f17819a;

    public r(String str) {
        gm.l.f(str, "platformName");
        this.f17819a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return androidx.activity.e.b(android.support.v4.media.d.a("Platform "), this.f17819a, " miss");
    }
}
