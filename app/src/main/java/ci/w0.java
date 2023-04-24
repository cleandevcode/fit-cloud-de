package ci;

/* loaded from: classes2.dex */
public final class w0 extends RuntimeException {

    /* renamed from: a */
    public final int f4858a;

    public w0(int i10) {
        this.f4858a = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("error:");
        a10.append(this.f4858a);
        return a10.toString();
    }
}
