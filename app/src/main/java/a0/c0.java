package a0;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public final Object f31a = new Object();

    /* renamed from: b */
    public final LinkedHashMap f32b = new LinkedHashMap();

    public c0() {
        new HashSet();
    }

    public final LinkedHashSet<b0> a() {
        LinkedHashSet<b0> linkedHashSet;
        synchronized (this.f31a) {
            linkedHashSet = new LinkedHashSet<>(this.f32b.values());
        }
        return linkedHashSet;
    }

    public final void b(z zVar) {
        synchronized (this.f31a) {
            try {
                for (String str : zVar.a()) {
                    y.u0.a("CameraRepository", "Added camera: " + str);
                    this.f32b.put(str, zVar.c(str));
                }
            } catch (y.r e10) {
                throw new y.t0(e10);
            }
        }
    }
}
