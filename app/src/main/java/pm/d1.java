package pm;

/* loaded from: classes2.dex */
public final class d1 extends g {

    /* renamed from: a */
    public final fm.l<Throwable, tl.l> f24332a;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(fm.l<? super Throwable, tl.l> lVar) {
        this.f24332a = lVar;
    }

    @Override // pm.h
    public final void a(Throwable th2) {
        this.f24332a.k(th2);
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        a(th2);
        return tl.l.f28297a;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("InvokeOnCancel[");
        a10.append(this.f24332a.getClass().getSimpleName());
        a10.append('@');
        a10.append(g0.j(this));
        a10.append(']');
        return a10.toString();
    }
}
