package m5;

/* loaded from: classes.dex */
public final class f implements g<Object> {

    /* renamed from: a */
    public volatile Object f20369a;

    /* renamed from: b */
    public final /* synthetic */ g f20370b;

    public f(g gVar) {
        this.f20370b = gVar;
    }

    @Override // m5.g
    public final Object get() {
        if (this.f20369a == null) {
            synchronized (this) {
                if (this.f20369a == null) {
                    Object obj = this.f20370b.get();
                    b0.c.i(obj);
                    this.f20369a = obj;
                }
            }
        }
        return this.f20369a;
    }
}
