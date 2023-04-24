package androidx.lifecycle;

import androidx.lifecycle.k;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements s {

    /* renamed from: a */
    public final String f2687a;

    /* renamed from: b */
    public boolean f2688b = false;

    /* renamed from: c */
    public final l0 f2689c;

    public SavedStateHandleController(String str, l0 l0Var) {
        this.f2687a = str;
        this.f2689c = l0Var;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        if (bVar == k.b.ON_DESTROY) {
            this.f2688b = false;
            uVar.a0().c(this);
        }
    }
}
