package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public enum Pa {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: e */
    private static final Pa[] f7638e;

    /* renamed from: g */
    private final int f7640g;

    static {
        Pa pa2 = L;
        Pa pa3 = M;
        Pa pa4 = Q;
        f7638e = new Pa[]{pa3, pa2, H, pa4};
    }

    Pa(int i10) {
        this.f7640g = i10;
    }

    public static Pa a(int i10) {
        if (i10 >= 0) {
            Pa[] paArr = f7638e;
            if (i10 < paArr.length) {
                return paArr[i10];
            }
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int a() {
        return this.f7640g;
    }
}
