package b7;

import b7.b;
import gm.l;
import p000do.a;
import y6.f;

/* loaded from: classes.dex */
public final class c extends b.a {

    /* renamed from: b */
    public final /* synthetic */ b f4032b;

    public c(b bVar) {
        this.f4032b = bVar;
    }

    @Override // b7.b.a
    public final void a0() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onServiceDisconnected", new Object[0]);
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.a0();
        }
    }

    @Override // b7.b.a, x6.g
    public final void b(int i10) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onStepUpdate %d", Integer.valueOf(i10));
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    @Override // b7.b.a, x6.g
    public final void g(int i10) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onLocationCoordTypeUpdate %d", Integer.valueOf(i10));
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.g(i10);
        }
    }

    @Override // b7.b.a
    public final void k() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onServiceConnected", new Object[0]);
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // b7.b.a, x6.g
    public final void o0(f fVar) {
        l.f(fVar, "latLng");
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onLocationTrackUpdate lat:%f lng:%f", Double.valueOf(fVar.f31164a), Double.valueOf(fVar.f31165b));
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.o0(fVar);
        }
    }

    @Override // b7.b.a, x6.g
    public final void s0(int i10) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onDurationUpdate %d", Integer.valueOf(i10));
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.s0(i10);
        }
    }

    @Override // b7.b.a, x6.g
    public final void y(double d10, double d11) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("SportServiceProxy");
        bVar.b("onLocationCameraUpdate lat:%f lng:%f", Double.valueOf(d10), Double.valueOf(d11));
        b.a aVar = this.f4032b.f4027b.get();
        if (aVar != null) {
            aVar.y(d10, d11);
        }
    }
}
