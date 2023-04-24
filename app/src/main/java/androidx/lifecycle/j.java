package androidx.lifecycle;

import androidx.lifecycle.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q2.a;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0442a {
        @Override // q2.a.InterfaceC0442a
        public final void a(q2.c cVar) {
            if (cVar instanceof y0) {
                x0 z10 = ((y0) cVar).z();
                q2.a C = cVar.C();
                z10.getClass();
                Iterator it = new HashSet(z10.f2807a.keySet()).iterator();
                while (it.hasNext()) {
                    j.a(z10.f2807a.get((String) it.next()), C, cVar.a0());
                }
                if (!new HashSet(z10.f2807a.keySet()).isEmpty()) {
                    C.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    public static void a(s0 s0Var, q2.a aVar, k kVar) {
        Object obj;
        boolean z10;
        HashMap hashMap = s0Var.f2780a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = s0Var.f2780a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !(z10 = savedStateHandleController.f2688b)) {
            if (!z10) {
                savedStateHandleController.f2688b = true;
                kVar.a(savedStateHandleController);
                aVar.c(savedStateHandleController.f2687a, savedStateHandleController.f2689c.f2743e);
                b(kVar, aVar);
                return;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
    }

    public static void b(final k kVar, final q2.a aVar) {
        k.c b10 = kVar.b();
        if (b10 == k.c.INITIALIZED || b10.a(k.c.STARTED)) {
            aVar.d();
        } else {
            kVar.a(new s() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // androidx.lifecycle.s
                public final void d(u uVar, k.b bVar) {
                    if (bVar == k.b.ON_START) {
                        k.this.c(this);
                        aVar.d();
                    }
                }
            });
        }
    }
}
