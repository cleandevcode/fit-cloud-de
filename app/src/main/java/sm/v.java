package sm;

/* loaded from: classes2.dex */
public final class v implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27311a;

    /* renamed from: b */
    public final /* synthetic */ fm.p f27312b;

    public v(fm.p pVar, f fVar) {
        this.f27311a = fVar;
        this.f27312b = pVar;
    }

    @Override // sm.f
    public final Object a(g<? super Object> gVar, xl.d<? super tl.l> dVar) {
        Object a10 = this.f27311a.a(new w(new gm.x(), gVar, this.f27312b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
