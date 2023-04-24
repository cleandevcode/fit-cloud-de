package y3;

import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;
import y3.b0;
import y3.k0;

/* loaded from: classes.dex */
public final class r<VM extends k0<S>, S extends b0> implements v0.b {

    /* renamed from: a */
    public final Class<? extends VM> f31018a;

    /* renamed from: b */
    public final Class<? extends S> f31019b;

    /* renamed from: c */
    public final f1 f31020c;

    /* renamed from: d */
    public final String f31021d;

    /* renamed from: e */
    public final b1<VM, S> f31022e;

    /* renamed from: f */
    public final boolean f31023f;

    /* renamed from: g */
    public final c0<VM, S> f31024g;

    public r(Class<? extends VM> cls, Class<? extends S> cls2, f1 f1Var, String str, b1<VM, S> b1Var, boolean z10, c0<VM, S> c0Var) {
        this.f31018a = cls;
        this.f31019b = cls2;
        this.f31020c = f1Var;
        this.f31021d = str;
        this.f31022e = b1Var;
        this.f31023f = z10;
        this.f31024g = c0Var;
    }

    @Override // androidx.lifecycle.v0.b
    public final androidx.lifecycle.s0 a(Class cls, d2.c cVar) {
        return b(cls);
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends androidx.lifecycle.s0> T b(Class<T> cls) {
        k0 k0Var;
        Class<?>[] parameterTypes;
        boolean z10;
        Class<? extends S> cls2;
        Class<? extends VM> cls3;
        b1<VM, S> b1Var = this.f31022e;
        if (b1Var == null && this.f31023f) {
            Class<? extends VM> cls4 = this.f31018a;
            f1 f1Var = this.f31020c;
            String str = this.f31021d;
            gm.l.f(cls4, "viewModelClass");
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(str, "key");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewModel of type ");
            sb2.append(cls4.getName());
            sb2.append(" for ");
            sb2.append(f1Var.c());
            sb2.append('[');
            throw new h1(androidx.activity.e.b(sb2, str, "] does not exist yet!"));
        }
        Class<? extends VM> cls5 = this.f31018a;
        Class<? extends S> cls6 = this.f31019b;
        f1 f1Var2 = this.f31020c;
        S a10 = this.f31024g.a(cls5, cls6, f1Var2, b1Var);
        if (b1Var != null && (cls3 = b1Var.f30931b) != null) {
            cls5 = cls3;
        }
        if (b1Var != null && (cls2 = b1Var.f30932c) != null) {
            cls6 = cls2;
        }
        Class l10 = b0.c.l(cls5);
        k0 k0Var2 = null;
        boolean z11 = false;
        if (l10 != null) {
            try {
                k0Var = (k0) l10.getMethod("create", f1.class, b0.class).invoke(b0.c.o(l10), f1Var2, a10);
            } catch (NoSuchMethodException unused) {
                k0Var = (k0) cls5.getMethod("create", f1.class, b0.class).invoke(null, f1Var2, a10);
            }
        } else {
            k0Var = null;
        }
        if (k0Var == null) {
            if (cls5.getConstructors().length == 1) {
                Constructor<?> constructor = cls5.getConstructors()[0];
                if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0].isAssignableFrom(a10.getClass())) {
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException e10) {
                            throw new IllegalStateException("ViewModel class is not public and Mavericks could not make the primary constructor accessible.", e10);
                        }
                    }
                    Object newInstance = constructor.newInstance(a10);
                    if (newInstance instanceof k0) {
                        k0Var2 = (k0) newInstance;
                    }
                }
            }
            k0Var = k0Var2;
        }
        if (k0Var == null) {
            Constructor<?>[] constructors = cls5.getConstructors();
            gm.l.e(constructors, "viewModelClass.constructors");
            Constructor constructor2 = (Constructor) ul.i.B(constructors);
            if (constructor2 != null && (parameterTypes = constructor2.getParameterTypes()) != null) {
                if (parameterTypes.length > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            if (z11) {
                sb3.append(cls5.getSimpleName());
                sb3.append(" takes dependencies other than initialState. It must have companion object implementing ");
                sb3.append(r0.class.getSimpleName());
                sb3.append(" with a create method returning a non-null ViewModel.");
            } else {
                sb3.append(cls5.getClass().getSimpleName());
                sb3.append(" must have primary constructor with a single non-optional parameter that takes initial state of ");
                sb3.append(cls6.getSimpleName());
                sb3.append('.');
            }
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        return new v0(k0Var);
    }
}
