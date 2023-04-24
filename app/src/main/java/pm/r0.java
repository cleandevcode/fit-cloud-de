package pm;

/* loaded from: classes2.dex */
public final class r0 extends g {

    /* renamed from: a */
    public final q0 f24385a;

    public r0(q0 q0Var) {
        this.f24385a = q0Var;
    }

    @Override // pm.h
    public final void a(Throwable th2) {
        this.f24385a.c();
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        a(th2);
        return tl.l.f28297a;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DisposeOnCancel[");
        a10.append(this.f24385a);
        a10.append(']');
        return a10.toString();
    }
}
