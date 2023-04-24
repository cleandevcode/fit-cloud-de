package i6;

import f6.b;
import gm.l;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o5.q0;
import o5.v;
import o8.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Set<Object> f16565a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public static boolean f16566b;

    public static final void a(Object obj, Throwable th2) {
        l.f(obj, "o");
        if (!f16566b) {
            return;
        }
        f16565a.add(obj);
        v vVar = v.f22837a;
        if (q0.b()) {
            b.l(th2);
            new f6.b(th2, b.a.CrashShield).c();
        }
    }

    public static final boolean b(Object obj) {
        l.f(obj, "o");
        return f16565a.contains(obj);
    }
}
