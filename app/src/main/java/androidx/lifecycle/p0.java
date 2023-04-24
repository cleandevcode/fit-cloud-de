package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 extends v0.d implements v0.b {

    /* renamed from: a */
    public Application f2764a;

    /* renamed from: b */
    public final v0.a f2765b;

    /* renamed from: c */
    public Bundle f2766c;

    /* renamed from: d */
    public k f2767d;

    /* renamed from: e */
    public q2.a f2768e;

    public p0() {
        this.f2765b = new v0.a(null);
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        List<Class<?>> list;
        String str = (String) cVar.f12611a.get(w0.f2805a);
        if (str != null) {
            if (cVar.f12611a.get(m0.f2748a) != null && cVar.f12611a.get(m0.f2749b) != null) {
                Application application = (Application) cVar.f12611a.get(u0.f2788a);
                boolean isAssignableFrom = b.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    list = q0.f2771a;
                } else {
                    list = q0.f2772b;
                }
                Constructor a10 = q0.a(cls, list);
                if (a10 == null) {
                    return this.f2765b.a(cls, cVar);
                }
                if (isAssignableFrom && application != null) {
                    return q0.b(cls, a10, application, m0.a(cVar));
                }
                return q0.b(cls, a10, m0.a(cVar));
            } else if (this.f2767d != null) {
                return d(str, cls);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0.d
    public final void c(s0 s0Var) {
        k kVar = this.f2767d;
        if (kVar != null) {
            j.a(s0Var, this.f2768e, kVar);
        }
    }

    public final <T extends s0> T d(String str, Class<T> cls) {
        List<Class<?>> list;
        T t10;
        Application application;
        if (this.f2767d != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.f2764a != null) {
                list = q0.f2771a;
            } else {
                list = q0.f2772b;
            }
            Constructor a10 = q0.a(cls, list);
            if (a10 == null) {
                if (this.f2764a != null) {
                    return (T) this.f2765b.b(cls);
                }
                if (v0.c.f2804a == null) {
                    v0.c.f2804a = new v0.c();
                }
                v0.c cVar = v0.c.f2804a;
                gm.l.c(cVar);
                return (T) cVar.b(cls);
            }
            q2.a aVar = this.f2768e;
            k kVar = this.f2767d;
            Bundle bundle = this.f2766c;
            Bundle a11 = aVar.a(str);
            Class<? extends Object>[] clsArr = l0.f2738f;
            l0 a12 = l0.a.a(a11, bundle);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a12);
            if (!savedStateHandleController.f2688b) {
                savedStateHandleController.f2688b = true;
                kVar.a(savedStateHandleController);
                aVar.c(str, a12.f2743e);
                j.b(kVar, aVar);
                if (isAssignableFrom && (application = this.f2764a) != null) {
                    t10 = (T) q0.b(cls, a10, application, a12);
                } else {
                    t10 = (T) q0.b(cls, a10, a12);
                }
                t10.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return t10;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @SuppressLint({"LambdaLast"})
    public p0(Application application, q2.c cVar, Bundle bundle) {
        v0.a aVar;
        gm.l.f(cVar, "owner");
        this.f2768e = cVar.C();
        this.f2767d = cVar.a0();
        this.f2766c = bundle;
        this.f2764a = application;
        if (application != null) {
            if (v0.a.f2802c == null) {
                v0.a.f2802c = new v0.a(application);
            }
            aVar = v0.a.f2802c;
            gm.l.c(aVar);
        } else {
            aVar = new v0.a(null);
        }
        this.f2765b = aVar;
    }
}
