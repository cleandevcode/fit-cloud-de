package androidx.lifecycle;

import androidx.lifecycle.k;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements s {

    /* renamed from: a */
    public final n0 f2686a;

    public SavedStateHandleAttacher(n0 n0Var) {
        this.f2686a = n0Var;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        boolean z10;
        if (bVar == k.b.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            uVar.a0().c(this);
            n0 n0Var = this.f2686a;
            if (!n0Var.f2756b) {
                n0Var.f2757c = n0Var.f2755a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                n0Var.f2756b = true;
                o0 o0Var = (o0) n0Var.f2758d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
