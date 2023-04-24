package jj;

/* loaded from: classes2.dex */
public final class f1 extends gm.m implements fm.l<bj.b, tk.t<? extends sj.b>> {

    /* renamed from: b */
    public final /* synthetic */ k1 f17895b;

    /* renamed from: c */
    public final /* synthetic */ nj.c f17896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k1 k1Var, nj.c cVar) {
        super(1);
        this.f17895b = k1Var;
        this.f17896c = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [jj.d1] */
    @Override // fm.l
    public final tk.t<? extends sj.b> k(bj.b bVar) {
        tk.t pVar;
        final bj.b bVar2 = bVar;
        k1 k1Var = this.f17895b;
        if (h7.a.m(((l) k1Var.f17918b).f17930d, 290)) {
            pVar = tk.p.d(new yi.k());
        } else {
            pVar = new gl.p(h7.a.w(k1Var.f17917a, new bj.b((byte) 2, (byte) 125, null), new bj.b((byte) 2, (byte) 126, null)), new ph.p(12, i1.f17908b));
        }
        gl.p pVar2 = new gl.p(pVar, new wi.i(5, new e1(bVar2, this.f17896c)));
        final nj.c cVar = this.f17896c;
        return new gl.r(pVar2, new wk.e() { // from class: jj.d1
            @Override // wk.e
            public final Object apply(Object obj) {
                bj.b bVar3 = bj.b.this;
                nj.c cVar2 = cVar;
                Throwable th2 = (Throwable) obj;
                gm.l.f(cVar2, "$deviceInfo");
                return xj.a.b(bVar3, null, cVar2);
            }
        }, null);
    }
}
