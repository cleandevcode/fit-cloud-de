package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class W extends Y {

    /* renamed from: a */
    private static final Y[] f7761a = new Y[0];

    /* renamed from: b */
    private final Y[] f7762b;

    public W(Map<EnumC0631d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC0631d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new X(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new Q(false));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new S());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new P());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new V());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new O());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new X(map));
            arrayList.add(new Q());
            arrayList.add(new O());
            arrayList.add(new S());
            arrayList.add(new P());
            arrayList.add(new V());
        }
        this.f7762b = (Y[]) arrayList.toArray(f7761a);
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        for (Y y10 : this.f7762b) {
            try {
                return y10.a(i10, c0732x, map);
            } catch (C0628a unused) {
            }
        }
        throw C0628a.a();
    }
}
