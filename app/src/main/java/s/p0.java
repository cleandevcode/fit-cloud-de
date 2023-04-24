package s;

import p0.c;

/* loaded from: classes.dex */
public final class p0 extends a0.j {

    /* renamed from: a */
    public final /* synthetic */ c.a f26121a;

    public p0(c.a aVar) {
        this.f26121a = aVar;
    }

    @Override // a0.j
    public final void a() {
        this.f26121a.b(new y.n0(3, "Capture request is cancelled because camera is closed", null));
    }

    @Override // a0.j
    public final void b(a0.s sVar) {
        this.f26121a.a(null);
    }

    @Override // a0.j
    public final void c(a0.m mVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Capture request failed with reason ");
        mVar.getClass();
        sb2.append(a0.l.a(1));
        this.f26121a.b(new y.n0(2, sb2.toString(), null));
    }
}
