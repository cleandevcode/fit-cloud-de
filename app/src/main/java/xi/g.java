package xi;

import gm.l;
import p000do.a;
import tk.i;

/* loaded from: classes2.dex */
public final class g implements vi.d {

    /* renamed from: a */
    public final ql.b<Boolean> f30610a = new ql.b<>();

    /* renamed from: b */
    public volatile long f30611b;

    /* renamed from: c */
    public volatile boolean f30612c;

    @Override // vi.d
    public final boolean a() {
        return this.f30612c || System.currentTimeMillis() - this.f30611b < 180000;
    }

    @Override // vi.d
    public final i<Boolean> b() {
        i<Boolean> i10 = this.f30610a.i();
        l.e(i10, "isForegroundSubject.distinctUntilChanged()");
        return i10;
    }

    @Override // vi.d
    public final void c(boolean z10) {
        this.f30612c = z10;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#VisibilityImpl");
        bVar.h("isForeground:%b", Boolean.valueOf(z10));
        this.f30610a.b(Boolean.valueOf(z10));
        if (z10) {
            return;
        }
        this.f30611b = System.currentTimeMillis();
    }

    @Override // vi.d
    public final boolean d() {
        return this.f30612c;
    }
}
