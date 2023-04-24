package tc;

import gl.b;

/* loaded from: classes.dex */
public final class w extends ml.b<Object> {

    /* renamed from: b */
    public final /* synthetic */ tk.q f28025b;

    public w(b.a aVar) {
        this.f28025b = aVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        ((b.a) this.f28025b).b(th2);
    }

    @Override // tk.r, tk.g
    public final void onSuccess(Object obj) {
        ((b.a) this.f28025b).a(obj);
    }
}
