package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.scankit.p.ca */
/* loaded from: classes.dex */
public final class C0650ca {

    /* renamed from: a */
    private static final int[] f7835a = {1, 1, 2};

    /* renamed from: b */
    private final C0642aa f7836b = new C0642aa();

    /* renamed from: c */
    private final C0646ba f7837c = new C0646ba();

    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, int i11) {
        int[] a10 = AbstractC0654da.a(c0732x, i11, false, f7835a);
        try {
            return this.f7837c.a(i10, c0732x, a10);
        } catch (C0628a unused) {
            return this.f7836b.a(i10, c0732x, a10);
        }
    }
}
