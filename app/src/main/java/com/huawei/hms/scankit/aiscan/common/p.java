package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.L;

/* loaded from: classes.dex */
public class p implements Comparable<p> {

    /* renamed from: a */
    public L f7276a;

    /* renamed from: b */
    public int f7277b;

    public p(L l10, int i10) {
        this.f7276a = l10;
        this.f7277b = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(p pVar) {
        return Float.compare(pVar.f7276a.h() + (-pVar.f7276a.g()), this.f7276a.h() + (-this.f7276a.g()));
    }
}
