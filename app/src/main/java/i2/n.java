package i2;

import i2.b0;
import i2.x;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends gm.m implements fm.l<c0, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ v f16365b;

    /* renamed from: c */
    public final /* synthetic */ m f16366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, m mVar) {
        super(1);
        this.f16365b = vVar;
        this.f16366c = mVar;
    }

    @Override // fm.l
    public final tl.l k(c0 c0Var) {
        boolean z10;
        x xVar;
        c0 c0Var2 = c0Var;
        gm.l.f(c0Var2, "$this$navOptions");
        c cVar = new c();
        tl.l lVar = tl.l.f28297a;
        b0.a aVar = c0Var2.f16253a;
        boolean z11 = false;
        aVar.f16247g = 0;
        aVar.f16248h = 0;
        aVar.f16249i = cVar.f16251a;
        aVar.f16250j = cVar.f16252b;
        v vVar = this.f16365b;
        if (vVar instanceof x) {
            int i10 = v.f16402j;
            gm.l.f(vVar, "<this>");
            nm.g H = nm.j.H(vVar, u.f16401b);
            m mVar = this.f16366c;
            Iterator it = H.iterator();
            while (true) {
                if (it.hasNext()) {
                    v vVar2 = (v) it.next();
                    v g10 = mVar.g();
                    if (g10 != null) {
                        xVar = g10.f16404b;
                    } else {
                        xVar = null;
                    }
                    if (gm.l.a(vVar2, xVar)) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            int i11 = x.f16417o;
            c0Var2.f16255c = x.a.a(this.f16366c.i()).f16410h;
            new l0();
            tl.l lVar2 = tl.l.f28297a;
            c0Var2.f16256d = true;
        }
        return tl.l.f28297a;
    }
}
