package h8;

/* loaded from: classes.dex */
public final class t extends h1 {

    /* renamed from: f */
    public final o0.d f16021f;

    /* renamed from: g */
    public final d f16022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g gVar, d dVar) {
        super(gVar);
        Object obj = f8.d.f14179c;
        this.f16021f = new o0.d();
        this.f16022g = dVar;
        gVar.t(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        if (this.f16021f.isEmpty()) {
            return;
        }
        this.f16022g.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        this.f15963b = true;
        if (!this.f16021f.isEmpty()) {
            this.f16022g.a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        this.f15963b = false;
        d dVar = this.f16022g;
        dVar.getClass();
        synchronized (d.f15923r) {
            if (dVar.f15935k == this) {
                dVar.f15935k = null;
                dVar.f15936l.clear();
            }
        }
    }
}
