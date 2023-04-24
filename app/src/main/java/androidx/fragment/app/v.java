package androidx.fragment.app;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements j1.a {

    /* renamed from: a */
    public final /* synthetic */ int f2597a;

    /* renamed from: b */
    public final /* synthetic */ Object f2598b;

    public /* synthetic */ v(int i10, Object obj) {
        this.f2597a = i10;
        this.f2598b = obj;
    }

    @Override // j1.a
    public final void accept(Object obj) {
        switch (this.f2597a) {
            case 0:
                Intent intent = (Intent) obj;
                ((x) this.f2598b).f2610o.a();
                return;
            default:
                j0 j0Var = (j0) this.f2598b;
                x0.g0 g0Var = (x0.g0) obj;
                if (j0Var.L()) {
                    j0Var.s(g0Var.f30109a, false);
                    return;
                }
                return;
        }
    }
}
