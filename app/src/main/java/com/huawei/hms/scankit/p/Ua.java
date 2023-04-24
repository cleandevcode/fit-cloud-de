package com.huawei.hms.scankit.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Ua {

    /* renamed from: a */
    private static final int[][] f7731a = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: b */
    private final Pa f7732b;

    /* renamed from: c */
    private final byte f7733c;

    private Ua(int i10) {
        this.f7732b = Pa.a((i10 >> 3) & 3);
        this.f7733c = (byte) (i10 & 7);
    }

    public static Ua a(int i10, int i11) {
        Ua c10 = c(i10, i11);
        return c10 != null ? c10 : c(i10 ^ 21522, i11 ^ 21522);
    }

    public static int b(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    private static Ua c(int i10, int i11) {
        int[][] iArr;
        int b10;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int[] iArr2 : f7731a) {
            int i14 = iArr2[0];
            if (i14 == i10 || i14 == i11) {
                return new Ua(iArr2[1]);
            }
            int b11 = b(i10, i14);
            if (b11 < i12) {
                i13 = iArr2[1];
                i12 = b11;
            }
            if (i10 != i11 && (b10 = b(i11, i14)) < i12) {
                i13 = iArr2[1];
                i12 = b10;
            }
        }
        if (i12 <= 3) {
            return new Ua(i13);
        }
        return null;
    }

    public byte a() {
        return this.f7733c;
    }

    public Pa b() {
        return this.f7732b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Ua) {
            Ua ua2 = (Ua) obj;
            return this.f7732b == ua2.f7732b && this.f7733c == ua2.f7733c;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7732b.ordinal() << 3) | this.f7733c;
    }
}
