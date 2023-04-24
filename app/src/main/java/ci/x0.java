package ci;

/* loaded from: classes2.dex */
public final class x0 extends RuntimeException {

    /* renamed from: a */
    public final int f4866a;

    public x0(int i10) {
        this.f4866a = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("error:");
        a10.append(this.f4866a);
        return a10.toString();
    }
}
