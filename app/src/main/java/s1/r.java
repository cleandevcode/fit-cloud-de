package s1;

/* loaded from: classes.dex */
public final class r extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ q<Object> f26493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q<Object> qVar) {
        super(1);
        this.f26493b = qVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        Throwable th3 = th2;
        if (th3 != null) {
            this.f26493b.f26446h.setValue(new j(th3));
        }
        Object obj = q.f26438l;
        q<Object> qVar = this.f26493b;
        synchronized (obj) {
            q.f26437k.remove(qVar.c().getAbsolutePath());
        }
        return tl.l.f28297a;
    }
}
