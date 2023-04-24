package en;

import gm.l;
import ln.h;
import zm.a0;

/* loaded from: classes2.dex */
public final class e {
    static {
        ln.h hVar = ln.h.f20100d;
        h.a.b("\"\\");
        h.a.b("\t ,=");
    }

    public static final boolean a(a0 a0Var) {
        if (l.a(a0Var.f32529a.f32752c, "HEAD")) {
            return false;
        }
        int i10 = a0Var.f32532d;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && an.c.i(a0Var) == -1 && !om.h.V("chunked", a0.a(a0Var, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0208, code lost:
        if (r3.f23635a.matcher(r0).matches() == false) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(zm.j r36, zm.q r37, zm.p r38) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: en.e.b(zm.j, zm.q, zm.p):void");
    }
}
