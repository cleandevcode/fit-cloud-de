package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public final ArrayList<r> f2558a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, q0> f2559b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, p0> f2560c = new HashMap<>();

    /* renamed from: d */
    public m0 f2561d;

    public final void a(r rVar) {
        if (this.f2558a.contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (this.f2558a) {
            this.f2558a.add(rVar);
        }
        rVar.f2526k = true;
    }

    public final r b(String str) {
        q0 q0Var = this.f2559b.get(str);
        if (q0Var != null) {
            return q0Var.f2503c;
        }
        return null;
    }

    public final r c(String str) {
        for (q0 q0Var : this.f2559b.values()) {
            if (q0Var != null) {
                r rVar = q0Var.f2503c;
                if (!str.equals(rVar.f2514e)) {
                    rVar = rVar.f2536u.f2395c.c(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f2559b.values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        r rVar;
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : this.f2559b.values()) {
            if (q0Var != null) {
                rVar = q0Var.f2503c;
            } else {
                rVar = null;
            }
            arrayList.add(rVar);
        }
        return arrayList;
    }

    public final List<r> f() {
        ArrayList arrayList;
        if (this.f2558a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2558a) {
            arrayList = new ArrayList(this.f2558a);
        }
        return arrayList;
    }

    public final void g(q0 q0Var) {
        boolean z10;
        r rVar = q0Var.f2503c;
        if (this.f2559b.get(rVar.f2514e) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        this.f2559b.put(rVar.f2514e, q0Var);
        if (rVar.C) {
            if (rVar.B) {
                this.f2561d.e(rVar);
            } else {
                this.f2561d.h(rVar);
            }
            rVar.C = false;
        }
        if (j0.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public final void h(q0 q0Var) {
        r rVar = q0Var.f2503c;
        if (rVar.B) {
            this.f2561d.h(rVar);
        }
        if (this.f2559b.put(rVar.f2514e, null) != null && j0.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    public final p0 i(String str, p0 p0Var) {
        return p0Var != null ? this.f2560c.put(str, p0Var) : this.f2560c.remove(str);
    }
}
