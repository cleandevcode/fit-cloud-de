package y3;

/* loaded from: classes.dex */
public final class y extends gm.m implements fm.l<b0, b0> {

    /* renamed from: b */
    public final /* synthetic */ fm.p<b0, b<Object>, b0> f31092b;

    /* renamed from: c */
    public final /* synthetic */ mm.f<b0, b<Object>> f31093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(fm.p<b0, ? super b<Object>, b0> pVar, mm.f<b0, ? extends b<Object>> fVar) {
        super(1);
        this.f31092b = pVar;
        this.f31093c = fVar;
    }

    @Override // fm.l
    public final b0 k(b0 b0Var) {
        b<Object> bVar;
        b0 b0Var2 = b0Var;
        gm.l.f(b0Var2, "$this$setState");
        fm.p<b0, b<Object>, b0> pVar = this.f31092b;
        mm.f<b0, b<Object>> fVar = this.f31093c;
        return pVar.A(b0Var2, new p((fVar == null || (bVar = fVar.get(b0Var2)) == null) ? null : bVar.a()));
    }
}
