package v6;

import fm.l;
import fm.p;
import gm.m;
import u6.o;

/* loaded from: classes.dex */
public final class c extends m implements l<o, o> {

    /* renamed from: b */
    public final /* synthetic */ p<o, u6.a<Object>, o> f29136b;

    /* renamed from: c */
    public final /* synthetic */ mm.f<o, u6.a<Object>> f29137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p<o, ? super u6.a<Object>, o> pVar, mm.f<o, ? extends u6.a<Object>> fVar) {
        super(1);
        this.f29136b = pVar;
        this.f29137c = fVar;
    }

    @Override // fm.l
    public final o k(o oVar) {
        u6.a<Object> aVar;
        o oVar2 = oVar;
        gm.l.f(oVar2, "$this$setState");
        p<o, u6.a<Object>, o> pVar = this.f29136b;
        mm.f<o, u6.a<Object>> fVar = this.f29137c;
        return pVar.A(oVar2, new u6.l((fVar == null || (aVar = fVar.get(oVar2)) == null) ? null : aVar.a()));
    }
}
