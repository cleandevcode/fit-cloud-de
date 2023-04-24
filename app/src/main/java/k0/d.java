package k0;

import a0.a0;
import java.util.ArrayList;
import java.util.List;
import y.n;

/* loaded from: classes.dex */
public final class d implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ List f18069a;

    /* renamed from: b */
    public final /* synthetic */ n f18070b;

    /* renamed from: c */
    public final /* synthetic */ androidx.camera.view.a f18071c;

    public d(a0 a0Var, androidx.camera.view.a aVar, ArrayList arrayList) {
        this.f18071c = aVar;
        this.f18069a = arrayList;
        this.f18070b = a0Var;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        this.f18071c.f1878e = null;
        if (this.f18069a.isEmpty()) {
            return;
        }
        for (a0.j jVar : this.f18069a) {
            ((a0) this.f18070b).f(jVar);
        }
        this.f18069a.clear();
    }

    @Override // d0.c
    public final void onSuccess(Void r22) {
        this.f18071c.f1878e = null;
    }
}
