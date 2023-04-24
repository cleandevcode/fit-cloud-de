package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.ga */
/* loaded from: classes.dex */
final class C0666ga {

    /* renamed from: a */
    private final Map<Integer, Integer> f7902a = new HashMap();

    public void a(int i10) {
        Integer num = this.f7902a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f7902a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }

    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f7902a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return C0717ta.a(arrayList);
    }
}
