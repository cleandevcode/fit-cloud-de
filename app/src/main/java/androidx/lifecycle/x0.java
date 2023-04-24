package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final HashMap<String, s0> f2807a = new HashMap<>();

    public final void a() {
        for (s0 s0Var : this.f2807a.values()) {
            s0Var.f2782c = true;
            HashMap hashMap = s0Var.f2780a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : s0Var.f2780a.values()) {
                        s0.b(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = s0Var.f2781b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : s0Var.f2781b) {
                        s0.b(closeable);
                    }
                }
            }
            s0Var.c();
        }
        this.f2807a.clear();
    }
}
