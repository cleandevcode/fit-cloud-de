package p5;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    public static final /* synthetic */ int f23919a = 0;

    static {
        new j();
    }

    public static final synchronized void a(a aVar, t tVar) {
        synchronized (j.class) {
            if (i6.a.b(j.class)) {
                return;
            }
            int i10 = x5.e.f30297a;
            s a10 = f.a();
            a10.a(aVar, tVar.c());
            f.b(a10);
        }
    }

    public static final synchronized void b(e eVar) {
        t tVar;
        synchronized (j.class) {
            if (i6.a.b(j.class)) {
                return;
            }
            gm.l.f(eVar, "eventsToPersist");
            int i10 = x5.e.f30297a;
            s a10 = f.a();
            for (a aVar : eVar.p()) {
                synchronized (eVar) {
                    gm.l.f(aVar, "accessTokenAppIdPair");
                    tVar = (t) ((HashMap) eVar.f23905a).get(aVar);
                }
                if (tVar != null) {
                    a10.a(aVar, tVar.c());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            f.b(a10);
        }
    }
}
