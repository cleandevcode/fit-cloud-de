package qi;

import androidx.fragment.app.x;
import d7.a;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class p {
    public static final <T> void a(u6.a<? extends T> aVar, d7.e eVar) {
        gm.l.f(aVar, "<this>");
        gm.l.f(eVar, "progress");
        if (aVar instanceof u6.l) {
            d7.e.g(eVar);
        } else {
            eVar.a();
        }
    }

    public static final <T> void b(y3.b<? extends T> bVar, d7.e eVar) {
        gm.l.f(bVar, "<this>");
        gm.l.f(eVar, "progress");
        if (bVar instanceof y3.p) {
            d7.e.g(eVar);
        } else {
            eVar.a();
        }
    }

    public static tl.d c(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "<this>");
        return fb.e.a(new m(rVar, null));
    }

    public static tl.d d(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "<this>");
        return fb.e.a(new n(rVar, null));
    }

    public static tl.d e(x xVar) {
        gm.l.f(xVar, "<this>");
        return fb.e.a(new o(xVar, null));
    }

    public static void f(d7.e eVar, Throwable th2) {
        a.b bVar = d7.a.f12825a;
        gm.l.f(eVar, "<this>");
        gm.l.f(th2, "throwable");
        gm.l.f(bVar, "autoCancel");
        p000do.a.f13275a.q(th2);
        if (!(th2 instanceof CancellationException)) {
            eVar.c(g(eVar.f12859a, th2), false, false, bVar, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x008f, code lost:
        if (r1 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b1, code lost:
        if (r1 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b3, code lost:
        r1 = com.topstep.fitcloudpro.R.string.err_network_inaccessible;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b7, code lost:
        r1 = com.topstep.fitcloudpro.R.string.err_network_unavailable;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String g(android.content.Context r6, java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.p.g(android.content.Context, java.lang.Throwable):java.lang.String");
    }
}
