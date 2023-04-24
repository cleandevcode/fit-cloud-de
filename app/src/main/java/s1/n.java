package s1;

/* loaded from: classes.dex */
public final class n extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ fm.l<Throwable, tl.l> f26427b;

    /* renamed from: c */
    public final /* synthetic */ p<Object> f26428c;

    /* renamed from: d */
    public final /* synthetic */ fm.p<Object, Throwable, tl.l> f26429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, p pVar) {
        super(1);
        s sVar = s.f26494b;
        this.f26427b = rVar;
        this.f26428c = pVar;
        this.f26429d = sVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        tl.l lVar;
        Throwable th3 = th2;
        this.f26427b.k(th3);
        this.f26428c.f26435c.o(th3);
        do {
            Object a10 = rm.j.a(this.f26428c.f26435c.m());
            if (a10 == null) {
                lVar = null;
                continue;
            } else {
                this.f26429d.A(a10, th3);
                lVar = tl.l.f28297a;
                continue;
            }
        } while (lVar != null);
        return tl.l.f28297a;
    }
}
