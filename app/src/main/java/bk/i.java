package bk;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes2.dex */
public final class i implements zm.l {

    /* renamed from: b */
    public static final i f4439b = new i();

    /* JADX WARN: Code restructure failed: missing block: B:205:0x008e, code lost:
        if ((r12 + 0) > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x00f8, code lost:
        if ((r12 - 30) > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x00fa, code lost:
        r12 = r11;
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0147 A[LOOP:0: B:197:0x007b->B:292:0x0147, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x014b A[EDGE_INSN: B:296:0x014b->B:293:0x014b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.app.Notification r15, int r16, int[] r17, boolean r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.i.b(android.app.Notification, int, int[], boolean, java.lang.String):java.lang.String");
    }

    @Override // zm.l
    public List a(String str) {
        gm.l.f(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            gm.l.e(allByName, "InetAddress.getAllByName(hostname)");
            return ul.i.G(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(a.b.b("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }
}
