package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.v0;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.s0 {

    /* renamed from: j */
    public static final a f2459j = new a();

    /* renamed from: g */
    public final boolean f2463g;

    /* renamed from: d */
    public final HashMap<String, r> f2460d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, m0> f2461e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, androidx.lifecycle.x0> f2462f = new HashMap<>();

    /* renamed from: h */
    public boolean f2464h = false;

    /* renamed from: i */
    public boolean f2465i = false;

    /* loaded from: classes.dex */
    public class a implements v0.b {
        @Override // androidx.lifecycle.v0.b
        public final androidx.lifecycle.s0 a(Class cls, d2.c cVar) {
            return b(cls);
        }

        @Override // androidx.lifecycle.v0.b
        public final <T extends androidx.lifecycle.s0> T b(Class<T> cls) {
            return new m0(true);
        }
    }

    public m0(boolean z10) {
        this.f2463g = z10;
    }

    @Override // androidx.lifecycle.s0
    public final void c() {
        if (j0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2464h = true;
    }

    public final void e(r rVar) {
        if (this.f2465i) {
            if (j0.J(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2460d.containsKey(rVar.f2514e)) {
        } else {
            this.f2460d.put(rVar.f2514e, rVar);
            if (j0.J(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + rVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f2460d.equals(m0Var.f2460d) && this.f2461e.equals(m0Var.f2461e) && this.f2462f.equals(m0Var.f2462f);
    }

    public final void f(r rVar) {
        if (j0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + rVar);
        }
        g(rVar.f2514e);
    }

    public final void g(String str) {
        m0 m0Var = this.f2461e.get(str);
        if (m0Var != null) {
            m0Var.c();
            this.f2461e.remove(str);
        }
        androidx.lifecycle.x0 x0Var = this.f2462f.get(str);
        if (x0Var != null) {
            x0Var.a();
            this.f2462f.remove(str);
        }
    }

    public final void h(r rVar) {
        if (this.f2465i) {
            if (j0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f2460d.remove(rVar.f2514e) != null) && j0.J(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + rVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f2461e.hashCode();
        return this.f2462f.hashCode() + ((hashCode + (this.f2460d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<r> it = this.f2460d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2461e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2462f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
