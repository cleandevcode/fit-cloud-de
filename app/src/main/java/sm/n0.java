package sm;

/* loaded from: classes2.dex */
public final class n0 implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27266a;

    /* renamed from: b */
    public final /* synthetic */ f f27267b;

    /* renamed from: c */
    public final /* synthetic */ fm.q f27268c;

    public n0(f fVar, f fVar2, fm.q qVar) {
        this.f27266a = fVar;
        this.f27267b = fVar2;
        this.f27268c = qVar;
    }

    @Override // sm.f
    public final Object a(g<? super Object> gVar, xl.d<? super tl.l> dVar) {
        Object c10 = p001if.d.c(dVar, new o0(this.f27268c, null), gVar, new f[]{this.f27266a, this.f27267b});
        return c10 == yl.a.COROUTINE_SUSPENDED ? c10 : tl.l.f28297a;
    }
}
