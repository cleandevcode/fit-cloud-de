package a0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    public static final Object f180a = new Object();

    /* renamed from: b */
    public static final HashMap f181b = new HashMap();

    public static v a(u0 u0Var) {
        v vVar;
        synchronized (f180a) {
            vVar = (v) f181b.get(u0Var);
        }
        return vVar == null ? v.f200a : vVar;
    }
}
