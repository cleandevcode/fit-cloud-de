package androidx.lifecycle;

import android.app.Application;
import d2.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final x0 f2799a;

    /* renamed from: b */
    public final b f2800b;

    /* renamed from: c */
    public final d2.a f2801c;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: c */
        public static a f2802c;

        /* renamed from: b */
        public final Application f2803b;

        public a(Application application) {
            this.f2803b = application;
        }

        @Override // androidx.lifecycle.v0.c, androidx.lifecycle.v0.b
        public final s0 a(Class cls, d2.c cVar) {
            if (this.f2803b != null) {
                return b(cls);
            }
            Application application = (Application) cVar.f12611a.get(u0.f2788a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @Override // androidx.lifecycle.v0.c, androidx.lifecycle.v0.b
        public final <T extends s0> T b(Class<T> cls) {
            Application application = this.f2803b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final <T extends s0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    gm.l.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.b(cls);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        s0 a(Class cls, d2.c cVar);

        <T extends s0> T b(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a */
        public static c f2804a;

        @Override // androidx.lifecycle.v0.b
        public s0 a(Class cls, d2.c cVar) {
            return b(cls);
        }

        @Override // androidx.lifecycle.v0.b
        public <T extends s0> T b(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                gm.l.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public void c(s0 s0Var) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, b bVar) {
        this(x0Var, bVar, 0);
        gm.l.f(x0Var, "store");
    }

    public /* synthetic */ v0(x0 x0Var, b bVar, int i10) {
        this(x0Var, bVar, a.C0214a.f12612b);
    }

    public v0(x0 x0Var, b bVar, d2.a aVar) {
        gm.l.f(x0Var, "store");
        gm.l.f(bVar, "factory");
        gm.l.f(aVar, "defaultCreationExtras");
        this.f2799a = x0Var;
        this.f2800b = bVar;
        this.f2801c = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v0(androidx.lifecycle.y0 r3, androidx.lifecycle.v0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            gm.l.f(r3, r0)
            androidx.lifecycle.x0 r0 = r3.z()
            java.lang.String r1 = "owner.viewModelStore"
            gm.l.e(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.i
            if (r1 == 0) goto L1e
            androidx.lifecycle.i r3 = (androidx.lifecycle.i) r3
            d2.c r3 = r3.s()
            java.lang.String r1 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            gm.l.e(r3, r1)
            goto L20
        L1e:
            d2.a$a r3 = d2.a.C0214a.f12612b
        L20:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v0.<init>(androidx.lifecycle.y0, androidx.lifecycle.v0$b):void");
    }

    public final <T extends s0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <T extends s0> T b(String str, Class<T> cls) {
        T t10;
        d dVar;
        gm.l.f(str, "key");
        T t11 = (T) this.f2799a.f2807a.get(str);
        if (cls.isInstance(t11)) {
            b bVar = this.f2800b;
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                gm.l.e(t11, "viewModel");
                dVar.c(t11);
            }
            if (t11 != null) {
                return t11;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        d2.c cVar = new d2.c(this.f2801c);
        cVar.f12611a.put(w0.f2805a, str);
        try {
            t10 = (T) this.f2800b.a(cls, cVar);
        } catch (AbstractMethodError unused) {
            t10 = (T) this.f2800b.b(cls);
        }
        s0 put = this.f2799a.f2807a.put(str, t10);
        if (put != null) {
            put.c();
        }
        return t10;
    }
}
