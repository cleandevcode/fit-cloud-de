package pm;

/* loaded from: classes2.dex */
public final class e2<U, T extends U> extends um.v<T> implements Runnable {

    /* renamed from: d */
    public final long f24337d;

    public e2(long j10, xl.d<? super U> dVar) {
        super(dVar, dVar.e());
        this.f24337d = j10;
    }

    @Override // pm.a, pm.l1
    public final String n0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.n0());
        sb2.append("(timeMillis=");
        return d4.b.a(sb2, this.f24337d, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.f24337d;
        B(new d2("Timed out waiting for " + j10 + " ms", this));
    }
}
