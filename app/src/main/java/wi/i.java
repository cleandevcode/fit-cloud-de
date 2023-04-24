package wi;

import fl.i0;
import java.util.List;
import java.util.UUID;
import oc.x0;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements wk.e {

    /* renamed from: a */
    public final /* synthetic */ int f29889a;

    /* renamed from: b */
    public final /* synthetic */ Object f29890b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f29889a = i10;
        this.f29890b = obj;
    }

    @Override // wk.e
    public final Object apply(Object obj) {
        switch (this.f29889a) {
            case 0:
                fm.l lVar = (fm.l) this.f29890b;
                gm.l.f(lVar, "$tmp0");
                return (tk.t) lVar.k(obj);
            case 1:
                fm.l lVar2 = (fm.l) this.f29890b;
                gm.l.f(lVar2, "$tmp0");
                return (Integer) lVar2.k(obj);
            case 2:
                fm.l lVar3 = (fm.l) this.f29890b;
                gm.l.f(lVar3, "$tmp0");
                return (tk.l) lVar3.k(obj);
            case 3:
                fm.l lVar4 = (fm.l) this.f29890b;
                gm.l.f(lVar4, "$tmp0");
                return (List) lVar4.k(obj);
            case 4:
                fm.l lVar5 = (fm.l) this.f29890b;
                gm.l.f(lVar5, "$tmp0");
                return (rj.b) lVar5.k(obj);
            case 5:
                fm.l lVar6 = (fm.l) this.f29890b;
                gm.l.f(lVar6, "$tmp0");
                return (sj.b) lVar6.k(obj);
            case 6:
                fm.l lVar7 = (fm.l) this.f29890b;
                gm.l.f(lVar7, "$tmp0");
                return (tk.l) lVar7.k(obj);
            default:
                tk.a aVar = (tk.a) this.f29890b;
                tk.i iVar = (tk.i) obj;
                UUID uuid = x0.f23059h;
                aVar.getClass();
                bl.g gVar = new bl.g(aVar);
                iVar.getClass();
                return new i0(iVar, gVar);
        }
    }
}
