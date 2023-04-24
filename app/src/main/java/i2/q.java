package i2;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q extends s0 implements e0 {

    /* renamed from: e */
    public static final a f16376e = new a();

    /* renamed from: d */
    public final LinkedHashMap f16377d = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements v0.b {
        @Override // androidx.lifecycle.v0.b
        public final s0 a(Class cls, d2.c cVar) {
            return b(cls);
        }

        @Override // androidx.lifecycle.v0.b
        public final <T extends s0> T b(Class<T> cls) {
            return new q();
        }
    }

    @Override // i2.e0
    public final x0 a(String str) {
        gm.l.f(str, "backStackEntryId");
        x0 x0Var = (x0) this.f16377d.get(str);
        if (x0Var == null) {
            x0 x0Var2 = new x0();
            this.f16377d.put(str, x0Var2);
            return x0Var2;
        }
        return x0Var;
    }

    @Override // androidx.lifecycle.s0
    public final void c() {
        for (x0 x0Var : this.f16377d.values()) {
            x0Var.a();
        }
        this.f16377d.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f16377d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        gm.l.e(sb3, "sb.toString()");
        return sb3;
    }
}
