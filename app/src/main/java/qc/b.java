package qc;

import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements tk.n<tc.e<UUID>> {

    /* renamed from: a */
    public final /* synthetic */ tc.k0 f24687a;

    /* renamed from: b */
    public final /* synthetic */ l f24688b;

    public b(l lVar, tc.k0 k0Var) {
        this.f24688b = lVar;
        this.f24687a = k0Var;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
    }

    @Override // tk.n
    public final /* bridge */ /* synthetic */ void b(tc.e<UUID> eVar) {
    }

    @Override // tk.n
    public final void onComplete() {
        this.f24687a.b(this.f24688b.f24740i);
        this.f24687a.onComplete();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        this.f24687a.onError(th2);
    }
}
