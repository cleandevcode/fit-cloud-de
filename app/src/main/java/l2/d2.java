package l2;

import androidx.recyclerview.widget.RecyclerView;
import l2.n0;

/* loaded from: classes.dex */
public final class d2 implements fm.l<u, tl.l> {

    /* renamed from: a */
    public boolean f18821a = true;

    /* renamed from: b */
    public final /* synthetic */ f2<Object, RecyclerView.b0> f18822b;

    public d2(mi.w wVar) {
        this.f18822b = wVar;
    }

    @Override // fm.l
    public final tl.l k(u uVar) {
        u uVar2 = uVar;
        gm.l.f(uVar2, "loadStates");
        if (this.f18821a) {
            this.f18821a = false;
        } else if (uVar2.f19272d.f19200a instanceof n0.c) {
            f2.y(this.f18822b);
            f2<Object, RecyclerView.b0> f2Var = this.f18822b;
            f2Var.getClass();
            g<Object> gVar = f2Var.f18885e;
            gVar.getClass();
            e eVar = gVar.f18892f;
            eVar.getClass();
            v0 v0Var = eVar.f19023e;
            v0Var.getClass();
            v0Var.f19317b.remove(this);
        }
        return tl.l.f28297a;
    }
}
