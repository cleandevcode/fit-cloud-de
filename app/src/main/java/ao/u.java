package ao;

/* loaded from: classes2.dex */
public final class u extends w<Iterable<Object>> {

    /* renamed from: a */
    public final /* synthetic */ w f3862a;

    public u(w wVar) {
        this.f3862a = wVar;
    }

    @Override // ao.w
    public final void a(z zVar, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        for (Object obj : iterable2) {
            this.f3862a.a(zVar, obj);
        }
    }
}
