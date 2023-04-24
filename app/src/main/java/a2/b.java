package a2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import gm.l;
import java.util.LinkedHashMap;
import java.util.Set;
import ul.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static c f241a = c.f249c;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_SET_USER_VISIBLE_HINT,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: a2.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0000b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        public static final c f249c = new c();

        /* renamed from: a */
        public final Set<a> f250a = u.f28881a;

        /* renamed from: b */
        public final LinkedHashMap f251b = new LinkedHashMap();
    }

    public static c a(r rVar) {
        while (rVar != null) {
            if (rVar.t0()) {
                rVar.m0();
            }
            rVar = rVar.f2537v;
        }
        return f241a;
    }

    public static void b(c cVar, g gVar) {
        r rVar = gVar.f253a;
        String name = rVar.getClass().getName();
        if (cVar.f250a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        cVar.getClass();
        if (cVar.f250a.contains(a.PENALTY_DEATH)) {
            e(rVar, new s.g(name, gVar, 7));
        }
    }

    public static void c(g gVar) {
        if (j0.J(3)) {
            StringBuilder a10 = android.support.v4.media.d.a("StrictMode violation in ");
            a10.append(gVar.f253a.getClass().getName());
            Log.d("FragmentManager", a10.toString(), gVar);
        }
    }

    public static final void d(r rVar, String str) {
        l.f(rVar, "fragment");
        l.f(str, "previousFragmentId");
        a2.a aVar = new a2.a(rVar, str);
        c(aVar);
        c a10 = a(rVar);
        if (a10.f250a.contains(a.DETECT_FRAGMENT_REUSE) && f(a10, rVar.getClass(), a2.a.class)) {
            b(a10, aVar);
        }
    }

    public static void e(r rVar, Runnable runnable) {
        if (rVar.t0()) {
            Handler handler = rVar.m0().f2413u.f2341c;
            l.e(handler, "fragment.parentFragmentManager.host.handler");
            if (!l.a(handler.getLooper(), Looper.myLooper())) {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public static boolean f(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f251b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!l.a(cls2.getSuperclass(), g.class) && set.contains(cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
