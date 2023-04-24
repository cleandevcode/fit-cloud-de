package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Uc implements Sc {

    /* renamed from: a */
    private List<Sc> f7739a = new ArrayList();

    @Override // com.huawei.hms.scankit.p.Sc
    public void a(Pc pc2, long j10) {
        for (Sc sc2 : this.f7739a) {
            sc2.a(pc2, j10);
        }
    }

    public void a(Sc sc2) {
        if (this.f7739a == null) {
            this.f7739a = new ArrayList();
        }
        this.f7739a.add(sc2);
    }
}
