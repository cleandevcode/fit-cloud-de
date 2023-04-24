package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class X extends Y {

    /* renamed from: a */
    private final AbstractC0654da[] f7770a;

    /* JADX WARN: Removed duplicated region for block: B:43:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X(java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC0631d, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            com.huawei.hms.scankit.aiscan.common.d r0 = com.huawei.hms.scankit.aiscan.common.EnumC0631d.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            com.huawei.hms.scankit.p.T r1 = new com.huawei.hms.scankit.p.T
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            com.huawei.hms.scankit.p.Z r1 = new com.huawei.hms.scankit.p.Z
            r1.<init>()
            goto L23
        L35:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            com.huawei.hms.scankit.p.U r1 = new com.huawei.hms.scankit.p.U
            r1.<init>()
            r0.add(r1)
        L45:
            com.huawei.hms.scankit.aiscan.common.BarcodeFormat r1 = com.huawei.hms.scankit.aiscan.common.BarcodeFormat.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            com.huawei.hms.scankit.p.ea r3 = new com.huawei.hms.scankit.p.ea
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            com.huawei.hms.scankit.p.T r3 = new com.huawei.hms.scankit.p.T
            r3.<init>()
            r0.add(r3)
            com.huawei.hms.scankit.p.U r3 = new com.huawei.hms.scankit.p.U
            r3.<init>()
            r0.add(r3)
            com.huawei.hms.scankit.p.ea r3 = new com.huawei.hms.scankit.p.ea
            r3.<init>()
            r0.add(r3)
        L73:
            int r3 = r0.size()
            com.huawei.hms.scankit.p.da[] r3 = new com.huawei.hms.scankit.p.AbstractC0654da[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            com.huawei.hms.scankit.p.da[] r3 = (com.huawei.hms.scankit.p.AbstractC0654da[]) r3
            r2.f7770a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.X.<init>(java.util.Map):void");
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        boolean z10;
        Iterator<int[]> it = AbstractC0654da.b(c0732x).iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            for (AbstractC0654da abstractC0654da : this.f7770a) {
                try {
                    com.huawei.hms.scankit.aiscan.common.x a10 = abstractC0654da.a(i10, c0732x, next, map);
                    boolean z11 = a10.b() == BarcodeFormat.EAN_13 && a10.i().charAt(0) == '0';
                    Collection collection = map == null ? null : (Collection) map.get(EnumC0631d.POSSIBLE_FORMATS);
                    if (collection != null && !collection.contains(BarcodeFormat.UPC_A)) {
                        z10 = false;
                        return (z11 || !z10) ? a10 : new com.huawei.hms.scankit.aiscan.common.x(a10.i().substring(1), a10.g(), a10.h(), BarcodeFormat.UPC_A);
                    }
                    z10 = true;
                    if (z11) {
                    }
                } catch (C0628a unused) {
                }
            }
        }
        throw C0628a.a();
    }
}
