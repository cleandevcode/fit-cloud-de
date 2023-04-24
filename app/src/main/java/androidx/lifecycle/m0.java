package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import java.util.Arrays;
import java.util.List;
import q2.a;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public static final b f2748a = new b();

    /* renamed from: b */
    public static final c f2749b = new c();

    /* renamed from: c */
    public static final a f2750c = new a();

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* loaded from: classes.dex */
    public static final class d extends gm.m implements fm.l<d2.a, o0> {

        /* renamed from: b */
        public static final d f2751b = new d();

        public d() {
            super(1);
        }

        @Override // fm.l
        public final o0 k(d2.a aVar) {
            gm.l.f(aVar, "$this$initializer");
            return new o0();
        }
    }

    public static final l0 a(d2.c cVar) {
        n0 n0Var;
        Bundle bundle;
        q2.c cVar2 = (q2.c) cVar.f12611a.get(f2748a);
        if (cVar2 != null) {
            y0 y0Var = (y0) cVar.f12611a.get(f2749b);
            if (y0Var != null) {
                Bundle bundle2 = (Bundle) cVar.f12611a.get(f2750c);
                String str = (String) cVar.f12611a.get(w0.f2805a);
                if (str != null) {
                    a.b b10 = cVar2.C().b();
                    if (b10 instanceof n0) {
                        n0Var = (n0) b10;
                    } else {
                        n0Var = null;
                    }
                    if (n0Var != null) {
                        o0 c10 = c(y0Var);
                        l0 l0Var = (l0) c10.f2763d.get(str);
                        if (l0Var == null) {
                            Class<? extends Object>[] clsArr = l0.f2738f;
                            boolean z10 = true;
                            if (!n0Var.f2756b) {
                                n0Var.f2757c = n0Var.f2755a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                n0Var.f2756b = true;
                                o0 o0Var = (o0) n0Var.f2758d.getValue();
                            }
                            Bundle bundle3 = n0Var.f2757c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = n0Var.f2757c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = n0Var.f2757c;
                            if ((bundle5 == null || !bundle5.isEmpty()) ? false : false) {
                                n0Var.f2757c = null;
                            }
                            l0 a10 = l0.a.a(bundle, bundle2);
                            c10.f2763d.put(str, a10);
                            return a10;
                        }
                        return l0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends q2.c & y0> void b(T t10) {
        boolean z10;
        gm.l.f(t10, "<this>");
        k.c cVar = t10.a0().f2790c;
        gm.l.e(cVar, "lifecycle.currentState");
        if (cVar != k.c.INITIALIZED && cVar != k.c.CREATED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (t10.C().b() == null) {
                n0 n0Var = new n0(t10.C(), t10);
                t10.C().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
                t10.a0().a(new SavedStateHandleAttacher(n0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final o0 c(y0 y0Var) {
        gm.l.f(y0Var, "<this>");
        w.d dVar = new w.d(1);
        ((List) dVar.f29489a).add(new d2.d(bi.m0.p(gm.b0.a(o0.class))));
        Object[] array = ((List) dVar.f29489a).toArray(new d2.d[0]);
        if (array != null) {
            d2.d[] dVarArr = (d2.d[]) array;
            return (o0) new v0(y0Var, new d2.b((d2.d[]) Arrays.copyOf(dVarArr, dVarArr.length))).b("androidx.lifecycle.internal.SavedStateHandlesVM", o0.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
