package bj;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final byte f4402a;

    /* renamed from: b */
    public final List<e> f4403b;

    public d(byte b10, ArrayList arrayList) {
        this.f4402a = b10;
        this.f4403b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004b A[EDGE_INSN: B:49:0x004b->B:46:0x004b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bj.d a(byte[] r12) {
        /*
            int r0 = r12.length
            r1 = 0
            r2 = 2
            if (r0 >= r2) goto L6
            return r1
        L6:
            r0 = 0
            r3 = r12[r0]
            r4 = 1
            r5 = r12[r4]
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r12.length
            int r6 = r6 - r2
        L13:
            byte[] r7 = new byte[r6]
            int r8 = r12.length
            int r8 = r8 - r6
            java.lang.System.arraycopy(r12, r8, r7, r0, r6)
            r8 = 3
            if (r6 >= r8) goto L1e
            goto L2f
        L1e:
            r9 = r7[r0]
            r10 = r7[r4]
            int r10 = r10 << 8
            r10 = r10 & 256(0x100, float:3.59E-43)
            r11 = r7[r2]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r10 = r10 | r11
            int r11 = r10 + 3
            if (r6 >= r11) goto L31
        L2f:
            r7 = r1
            goto L3b
        L31:
            byte[] r11 = new byte[r10]
            java.lang.System.arraycopy(r7, r8, r11, r0, r10)
            bj.e r7 = new bj.e
            r7.<init>(r9, r11)
        L3b:
            if (r7 != 0) goto L3e
            goto L4b
        L3e:
            r5.add(r7)
            byte[] r7 = r7.f4405b
            if (r7 != 0) goto L46
            goto L48
        L46:
            int r7 = r7.length
            int r8 = r8 + r7
        L48:
            int r6 = r6 - r8
            if (r6 > 0) goto L13
        L4b:
            bj.d r12 = new bj.d
            r12.<init>(r3, r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.d.a(byte[]):bj.d");
    }
}
