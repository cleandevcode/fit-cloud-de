package ph;

import java.util.Date;
import java.util.List;
import ph.c;

/* loaded from: classes2.dex */
public final class i extends gm.m implements fm.p<c.C0438c<vf.i>, u6.a<? extends List<vf.i>>, c.C0438c<vf.i>> {

    /* renamed from: b */
    public final /* synthetic */ c<vf.i> f24159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c<vf.i> cVar) {
        super(2);
        this.f24159b = cVar;
    }

    @Override // fm.p
    public final c.C0438c<vf.i> A(c.C0438c<vf.i> c0438c, u6.a<? extends List<vf.i>> aVar) {
        boolean z10;
        Date c10;
        c.C0438c<vf.i> c0438c2 = c0438c;
        u6.a<? extends List<vf.i>> aVar2 = aVar;
        gm.l.f(c0438c2, "$this$execute");
        gm.l.f(aVar2, "it");
        if (aVar2 instanceof u6.a0) {
            c<vf.i> cVar = this.f24159b;
            List<vf.i> a10 = aVar2.a();
            String str = (String) this.f24159b.f24115j.f2739a.get("defaultDate");
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                c10 = null;
            } else {
                gm.l.f(str, "str");
                c10 = dg.a.c(str);
            }
            c.j(cVar, a10, c10);
        }
        return c.C0438c.copy$default(c0438c2, aVar2, null, 2, null);
    }
}
