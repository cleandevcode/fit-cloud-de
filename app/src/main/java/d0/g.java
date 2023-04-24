package d0;

import d0.f;
import p0.c;

/* loaded from: classes.dex */
public final class g implements c<Object> {

    /* renamed from: a */
    public final /* synthetic */ c.a f12583a;

    /* renamed from: b */
    public final /* synthetic */ o.a f12584b;

    public g(c.a aVar) {
        f.a aVar2 = f.f12580a;
        this.f12583a = aVar;
        this.f12584b = aVar2;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        this.f12583a.b(th2);
    }

    @Override // d0.c
    public final void onSuccess(Object obj) {
        try {
            this.f12583a.a(this.f12584b.apply(obj));
        } catch (Throwable th2) {
            this.f12583a.b(th2);
        }
    }
}
