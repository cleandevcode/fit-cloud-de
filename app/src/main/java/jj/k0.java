package jj;

/* loaded from: classes2.dex */
public final class k0 extends gm.m implements fm.l<Integer, tk.t<? extends oj.o>> {

    /* renamed from: b */
    public final /* synthetic */ d0 f17915b;

    /* renamed from: c */
    public final /* synthetic */ nj.c f17916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d0 d0Var, nj.c cVar) {
        super(1);
        this.f17915b = d0Var;
        this.f17916c = cVar;
    }

    @Override // fm.l
    public final tk.t<? extends oj.o> k(Integer num) {
        tk.i i10;
        tk.t t0Var;
        Integer num2 = num;
        if (num2 != null && num2.intValue() == 255) {
            t0Var = new gl.p(h7.a.w(this.f17915b.f17881a, new bj.b((byte) 5, (byte) 33, null), new bj.b((byte) 5, (byte) 34, null)), new wi.i(3, j0.f17910b));
        } else {
            if (num2 != null && num2.intValue() == 7) {
                d0 d0Var = this.f17915b;
                i10 = ((wi.k) d0Var.f17881a).i(new wj.r(d0Var.f17888h));
            } else {
                wi.a aVar = this.f17915b.f17881a;
                gm.l.e(num2, "type");
                i10 = ((wi.k) aVar).i(new wj.t(num2.intValue(), this.f17915b.f17888h));
            }
            t0Var = new fl.t0(i10);
        }
        return new gl.p(t0Var, new ph.p(10, new i0(num2, this.f17916c)));
    }
}
