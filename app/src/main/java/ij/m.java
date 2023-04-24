package ij;

import fl.d0;
import ij.c;
import yk.a;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.l<c.C0298c, tk.c> {

    /* renamed from: b */
    public final /* synthetic */ c f17064b;

    /* renamed from: c */
    public final /* synthetic */ int f17065c;

    /* renamed from: d */
    public final /* synthetic */ boolean f17066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, int i10, boolean z10) {
        super(1);
        this.f17064b = cVar;
        this.f17065c = i10;
        this.f17066d = z10;
    }

    @Override // fm.l
    public final tk.c k(c.C0298c c0298c) {
        c.C0298c c0298c2 = c0298c;
        this.f17064b.f17042i.b(new c.a(5, -1));
        tk.i<gj.g<Boolean>> a10 = this.f17064b.a(this.f17065c).a(c0298c2.f17048a, c0298c2.f17049b, this.f17066d);
        ui.a aVar = new ui.a(2, new j(this.f17064b));
        a10.getClass();
        fl.t tVar = new fl.t(a10, aVar);
        ph.k kVar = new ph.k(6, new k(this.f17064b));
        a.c cVar = yk.a.f31788c;
        fl.n nVar = new fl.n(tVar, kVar, cVar);
        rh.y yVar = new rh.y(3, new l(this.f17064b));
        a.d dVar = yk.a.f31789d;
        return new d0(nVar.k(dVar, yVar, cVar, cVar).j(new a(this.f17064b, 1)).k(dVar, dVar, new rh.a0(1, this.f17064b), cVar));
    }
}
