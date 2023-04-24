package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public final class Wa {

    /* renamed from: a */
    private final boolean f7763a;

    public Wa(boolean z10) {
        this.f7763a = z10;
    }

    public void a(com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        if (!this.f7763a || zVarArr == null || zVarArr.length < 3) {
            return;
        }
        com.huawei.hms.scankit.aiscan.common.z zVar = zVarArr[0];
        zVarArr[0] = zVarArr[2];
        zVarArr[2] = zVar;
    }
}
