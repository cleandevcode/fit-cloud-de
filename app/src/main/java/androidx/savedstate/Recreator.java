package androidx.savedstate;

import a.b;
import android.os.Bundle;
import android.support.v4.media.d;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import gm.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import q2.a;
import q2.c;

@Metadata
/* loaded from: classes.dex */
public final class Recreator implements s {

    /* renamed from: a */
    public final c f3349a;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a */
        public final LinkedHashSet f3350a;

        public a(q2.a aVar) {
            l.f(aVar, "registry");
            this.f3350a = new LinkedHashSet();
            aVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // q2.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3350a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        l.f(cVar, "owner");
        this.f3349a = cVar;
    }

    @Override // androidx.lifecycle.s
    public final void d(u uVar, k.b bVar) {
        if (bVar == k.b.ON_CREATE) {
            uVar.a0().c(this);
            Bundle a10 = this.f3349a.C().a("androidx.savedstate.Restarter");
            if (a10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0442a.class);
                        l.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                l.e(newInstance, "{\n                constr…wInstance()\n            }");
                                ((a.InterfaceC0442a) newInstance).a(this.f3349a);
                            } catch (Exception e10) {
                                throw new RuntimeException(b.b("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            StringBuilder a11 = d.a("Class ");
                            a11.append(asSubclass.getSimpleName());
                            a11.append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(a11.toString(), e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(android.support.v4.media.a.a("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
