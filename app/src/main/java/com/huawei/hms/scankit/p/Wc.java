package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Wc implements Vc {

    /* renamed from: a */
    private List<Vc> f7769a = new ArrayList();

    @Override // com.huawei.hms.scankit.p.Vc
    public void a(Pc pc2) {
        for (Vc vc2 : this.f7769a) {
            vc2.a(pc2);
        }
    }

    public void a(Vc vc2) {
        if (this.f7769a == null) {
            this.f7769a = new ArrayList();
        }
        this.f7769a.add(vc2);
    }
}
