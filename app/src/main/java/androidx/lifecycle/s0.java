package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a */
    public final HashMap f2780a;

    /* renamed from: b */
    public final LinkedHashSet f2781b;

    /* renamed from: c */
    public volatile boolean f2782c;

    public s0() {
        this.f2780a = new HashMap();
        this.f2781b = new LinkedHashSet();
        this.f2782c = false;
    }

    public s0(Closeable... closeableArr) {
        this.f2780a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f2781b = linkedHashSet;
        this.f2782c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void c() {
    }

    public final Object d(Object obj, String str) {
        Object obj2;
        synchronized (this.f2780a) {
            obj2 = this.f2780a.get(str);
            if (obj2 == null) {
                this.f2780a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f2782c) {
            b(obj);
        }
        return obj;
    }
}
