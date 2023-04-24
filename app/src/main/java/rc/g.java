package rc;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final r[] f25477a;

    /* renamed from: b */
    public final boolean f25478b;

    public g(r... rVarArr) {
        this.f25477a = rVarArr;
        boolean z10 = false;
        if (rVarArr != null && rVarArr.length != 0) {
            for (r rVar : rVarArr) {
                if (!((uc.c) rVar).equals(uc.c.f28655m)) {
                    break;
                }
            }
        }
        z10 = true;
        this.f25478b = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x004b, code lost:
        if (r5.f28656a.equals(r6.d()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x005b, code lost:
        if (r5.f28663h == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0095, code lost:
        if (r7 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00ce, code lost:
        if (r7 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00e1, code lost:
        if (uc.c.d(r5.f28663h, r5.f28664i, r6.f(r7)) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00f4, code lost:
        if (uc.c.d(r5.f28666k, r5.f28667l, r6.a(r7)) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00fc A[LOOP:0: B:100:0x000d->B:175:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(rc.q r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.g.a(rc.q):boolean");
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("emulatedFilters=");
        a10.append(Arrays.toString(this.f25477a));
        return a10.toString();
    }
}
