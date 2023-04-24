package sm;

/* loaded from: classes2.dex */
public final class t implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27300a;

    /* renamed from: b */
    public final /* synthetic */ int f27301b;

    public t(f fVar, int i10) {
        this.f27300a = fVar;
        this.f27301b = i10;
    }

    @Override // sm.f
    public final Object a(g<? super Object> gVar, xl.d<? super tl.l> dVar) {
        Object a10 = this.f27300a.a(new u(new gm.z(), this.f27301b, gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
