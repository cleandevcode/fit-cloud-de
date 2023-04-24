package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.v0;

/* loaded from: classes.dex */
public abstract class a extends v0.d implements v0.b {

    /* renamed from: a */
    public q2.a f2691a;

    /* renamed from: b */
    public k f2692b;

    /* renamed from: c */
    public Bundle f2693c;

    public a() {
    }

    @SuppressLint({"LambdaLast"})
    public a(i2.j jVar) {
        this.f2691a = jVar.f16301i.f24512b;
        this.f2692b = jVar.f16300h;
        this.f2693c = null;
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        String str = (String) cVar.f12611a.get(w0.f2805a);
        if (str != null) {
            q2.a aVar = this.f2691a;
            if (aVar != null) {
                k kVar = this.f2692b;
                Bundle bundle = this.f2693c;
                Bundle a10 = aVar.a(str);
                Class<? extends Object>[] clsArr = l0.f2738f;
                l0 a11 = l0.a.a(a10, bundle);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a11);
                if (!savedStateHandleController.f2688b) {
                    savedStateHandleController.f2688b = true;
                    kVar.a(savedStateHandleController);
                    aVar.c(str, a11.f2743e);
                    j.b(kVar, aVar);
                    s0 d10 = d(str, cls, a11);
                    d10.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                    return d10;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
            return d(str, cls, m0.a(cVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            k kVar = this.f2692b;
            if (kVar != null) {
                q2.a aVar = this.f2691a;
                Bundle bundle = this.f2693c;
                Bundle a10 = aVar.a(canonicalName);
                Class<? extends Object>[] clsArr = l0.f2738f;
                l0 a11 = l0.a.a(a10, bundle);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(canonicalName, a11);
                if (!savedStateHandleController.f2688b) {
                    savedStateHandleController.f2688b = true;
                    kVar.a(savedStateHandleController);
                    aVar.c(canonicalName, a11.f2743e);
                    j.b(kVar, aVar);
                    T t10 = (T) d(canonicalName, cls, a11);
                    t10.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                    return t10;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0.d
    public final void c(s0 s0Var) {
        q2.a aVar = this.f2691a;
        if (aVar != null) {
            j.a(s0Var, aVar, this.f2692b);
        }
    }

    public abstract <T extends s0> T d(String str, Class<T> cls, l0 l0Var);
}
