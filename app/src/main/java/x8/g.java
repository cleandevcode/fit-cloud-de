package x8;

import g8.a;
import h8.h;

/* loaded from: classes.dex */
public final class g implements h8.m, o {

    /* renamed from: a */
    public h8.h f30412a;

    /* renamed from: b */
    public boolean f30413b = true;

    /* renamed from: c */
    public final /* synthetic */ h f30414c;

    public g(h hVar, h8.h hVar2) {
        this.f30414c = hVar;
        this.f30412a = hVar2;
    }

    @Override // h8.m
    public final void a(a.e eVar, Object obj) {
        h.a aVar;
        boolean z10;
        u uVar = (u) eVar;
        g9.h hVar = (g9.h) obj;
        synchronized (this) {
            aVar = this.f30412a.f15958c;
            z10 = this.f30413b;
            h8.h hVar2 = this.f30412a;
            hVar2.f15957b = null;
            hVar2.f15958c = null;
        }
        if (aVar == null) {
            hVar.a(Boolean.FALSE);
        } else {
            uVar.C(aVar, z10, hVar);
        }
    }

    @Override // x8.o
    public final synchronized void b(h8.h hVar) {
        h8.h hVar2 = this.f30412a;
        if (hVar2 != hVar) {
            hVar2.f15957b = null;
            hVar2.f15958c = null;
            this.f30412a = hVar;
        }
    }

    @Override // x8.o
    public final synchronized h8.h c() {
        return this.f30412a;
    }

    @Override // x8.o
    public final void p() {
        h.a<?> aVar;
        synchronized (this) {
            this.f30413b = false;
            aVar = this.f30412a.f15958c;
        }
        if (aVar != null) {
            this.f30414c.b(aVar, 2441);
        }
    }
}
