package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public enum Ca extends Ka {
    public Ca(String str, int i10) {
        super(str, i10, null);
    }

    @Override // com.huawei.hms.scankit.p.Ka
    public boolean a(int i10, int i11) {
        return ((i10 + i11) & 1) == 0;
    }
}
