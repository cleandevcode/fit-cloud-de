package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public enum Va {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: l */
    private final int[] f7757l;

    /* renamed from: m */
    private final int f7758m;

    Va(int[] iArr, int i10) {
        this.f7757l = iArr;
        this.f7758m = i10;
    }

    public static Va a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 7) {
                                    if (i10 != 8) {
                                        if (i10 != 9) {
                                            if (i10 == 13) {
                                                return HANZI;
                                            }
                                            try {
                                                throw new IllegalArgumentException();
                                            } catch (Exception e10) {
                                                throw e10;
                                            }
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    public int a() {
        return this.f7758m;
    }

    public int a(Ya ya2) {
        int e10 = ya2.e();
        return this.f7757l[e10 <= 9 ? (char) 0 : e10 <= 26 ? (char) 1 : (char) 2];
    }
}
