package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.va */
/* loaded from: classes.dex */
public final class C0725va implements com.huawei.hms.scankit.aiscan.common.t {

    /* renamed from: a */
    private static final com.huawei.hms.scankit.aiscan.common.x[] f8089a = new com.huawei.hms.scankit.aiscan.common.x[0];

    private static int a(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        if (zVar == null || zVar2 == null) {
            return 0;
        }
        return (int) Math.abs(zVar.b() - zVar2.b());
    }

    private static int a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        return Math.max(Math.max(a(zVarArr[0], zVarArr[4]), (a(zVarArr[6], zVarArr[2]) * 17) / 18), Math.max(a(zVarArr[1], zVarArr[5]), (a(zVarArr[7], zVarArr[3]) * 17) / 18));
    }

    private static com.huawei.hms.scankit.aiscan.common.x[] a(C0728w c0728w, Map<EnumC0631d, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        C0721ua a10 = C0698oa.a(c0728w, map, z10);
        for (com.huawei.hms.scankit.aiscan.common.z[] zVarArr : a10.b()) {
            C0632e a11 = C0733xa.a(a10.a(), zVarArr[4], zVarArr[5], zVarArr[6], zVarArr[7], b(zVarArr), a(zVarArr), map);
            if (C0698oa.a()) {
                for (int i10 = 0; i10 < zVarArr.length; i10++) {
                    if (zVarArr[i10] != null) {
                        zVarArr[i10] = new com.huawei.hms.scankit.aiscan.common.z((c0728w.e() - 1) - zVarArr[i10].b(), (c0728w.c() - 1) - zVarArr[i10].c());
                    }
                }
            }
            if (zVarArr.length != 8) {
                throw C0628a.a("pdf417 points size incorrect!");
            }
            com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
            if (zVar == null && zVarArr[1] == null && zVarArr[4] == null && zVarArr[5] == null) {
                zVarArr[0] = zVarArr[6];
                zVarArr[1] = zVarArr[7];
                zVarArr[4] = zVarArr[2];
                zVarArr[5] = zVarArr[3];
            } else if (zVarArr[2] == null && zVarArr[3] == null && zVarArr[6] == null && zVarArr[7] == null) {
                zVarArr[2] = zVarArr[4];
                zVarArr[3] = zVarArr[5];
                zVarArr[6] = zVar;
                zVarArr[7] = zVarArr[1];
            }
            arrayList.add(new com.huawei.hms.scankit.aiscan.common.x(a11.d(), a11.c(), zVarArr, BarcodeFormat.PDF_417));
        }
        return (com.huawei.hms.scankit.aiscan.common.x[]) arrayList.toArray(f8089a);
    }

    private static int b(com.huawei.hms.scankit.aiscan.common.z zVar, com.huawei.hms.scankit.aiscan.common.z zVar2) {
        if (zVar == null || zVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(zVar.b() - zVar2.b());
    }

    private static int b(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        return Math.min(Math.min(b(zVarArr[0], zVarArr[4]), (b(zVarArr[6], zVarArr[2]) * 17) / 18), Math.min(b(zVarArr[1], zVarArr[5]), (b(zVarArr[7], zVarArr[3]) * 17) / 18));
    }

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C0728w c0728w, Map<EnumC0631d, ?> map) {
        com.huawei.hms.scankit.aiscan.common.x xVar;
        com.huawei.hms.scankit.aiscan.common.x[] a10 = a(c0728w, map, false);
        if (a10.length == 0 || (xVar = a10[0]) == null) {
            throw C0628a.a();
        }
        return xVar;
    }
}
