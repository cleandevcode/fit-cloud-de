package um;

import java.util.Iterator;
import java.util.List;
import pm.p1;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a */
    public static final p1 f28935a;

    static {
        String str;
        Object next;
        p1 b10;
        int i10 = y.f28943a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List<? extends o> u10 = h7.a.u(nm.n.I(nm.j.G(p.a())));
        Iterator it = u10.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c10 = ((o) next).c();
                do {
                    Object next2 = it.next();
                    int c11 = ((o) next2).c();
                    if (c10 < c11) {
                        next = next2;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
        }
        o oVar = (o) next;
        if (oVar != null && (b10 = oVar.b(u10)) != null) {
            f28935a = b10;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
