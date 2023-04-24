package pm;

/* loaded from: classes2.dex */
public final class v1 extends c {

    /* renamed from: a */
    public final um.k f24411a;

    public v1(um.k kVar) {
        this.f24411a = kVar;
    }

    @Override // pm.h
    public final void a(Throwable th2) {
        this.f24411a.N();
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        a(th2);
        return tl.l.f28297a;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("RemoveOnCancel[");
        a10.append(this.f24411a);
        a10.append(']');
        return a10.toString();
    }
}
