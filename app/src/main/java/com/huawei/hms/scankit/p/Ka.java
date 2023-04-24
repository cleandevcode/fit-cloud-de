package com.huawei.hms.scankit.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class Ka {

    /* renamed from: a */
    public static final Ka f7571a;

    /* renamed from: b */
    public static final Ka f7572b;

    /* renamed from: c */
    public static final Ka f7573c;

    /* renamed from: d */
    public static final Ka f7574d;

    /* renamed from: e */
    public static final Ka f7575e;

    /* renamed from: f */
    public static final Ka f7576f;

    /* renamed from: g */
    public static final Ka f7577g;

    /* renamed from: h */
    public static final Ka f7578h;

    /* renamed from: i */
    private static final /* synthetic */ Ka[] f7579i;

    static {
        Ca ca2 = new Ca("DATA_MASK_000", 0);
        f7571a = ca2;
        Ka ka2 = new Ka("DATA_MASK_001", 1) { // from class: com.huawei.hms.scankit.p.Da
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f7572b = ka2;
        Ka ka3 = new Ka("DATA_MASK_010", 2) { // from class: com.huawei.hms.scankit.p.Ea
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f7573c = ka3;
        Ka ka4 = new Ka("DATA_MASK_011", 3) { // from class: com.huawei.hms.scankit.p.Fa
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f7574d = ka4;
        Ka ka5 = new Ka("DATA_MASK_100", 4) { // from class: com.huawei.hms.scankit.p.Ga
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return (((i11 / 3) + (i10 / 2)) & 1) == 0;
            }
        };
        f7575e = ka5;
        Ka ka6 = new Ka("DATA_MASK_101", 5) { // from class: com.huawei.hms.scankit.p.Ha
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f7576f = ka6;
        Ka ka7 = new Ka("DATA_MASK_110", 6) { // from class: com.huawei.hms.scankit.p.Ia
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f7577g = ka7;
        Ka ka8 = new Ka("DATA_MASK_111", 7) { // from class: com.huawei.hms.scankit.p.Ja
            @Override // com.huawei.hms.scankit.p.Ka
            public boolean a(int i10, int i11) {
                return ((((i10 * i11) % 3) + (i10 + i11)) & 1) == 0;
            }
        };
        f7578h = ka8;
        f7579i = new Ka[]{ca2, ka2, ka3, ka4, ka5, ka6, ka7, ka8};
    }

    private Ka(String str, int i10) {
        super(str, i10);
    }

    public /* synthetic */ Ka(String str, int i10, Ca ca2) {
        this(str, i10);
    }

    public static Ka valueOf(String str) {
        return (Ka) Enum.valueOf(Ka.class, str);
    }

    public static Ka[] values() {
        return (Ka[]) f7579i.clone();
    }

    public final void a(C0736y c0736y, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (a(i11, i12)) {
                    c0736y.a(i12, i11);
                }
            }
        }
    }

    public abstract boolean a(int i10, int i11);
}
