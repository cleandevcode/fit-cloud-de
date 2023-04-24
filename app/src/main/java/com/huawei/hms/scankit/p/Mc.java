package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
final class Mc {
    public static int a(Ic ic2) {
        return a(ic2, true) + a(ic2, false);
    }

    private static int a(Ic ic2, boolean z10) {
        int b10 = z10 ? ic2.b() : ic2.c();
        int c10 = z10 ? ic2.c() : ic2.b();
        byte[][] a10 = ic2.a();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            byte b11 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < c10; i13++) {
                byte b12 = z10 ? a10[i11][i13] : a10[i13][i11];
                if (b12 == b11) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += (i12 - 5) + 3;
                    }
                    b11 = b12;
                    i12 = 1;
                }
            }
            if (i12 >= 5) {
                i10 = (i12 - 5) + 3 + i10;
            }
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(int i10, int i11, int i12) {
        int i13;
        switch (i10) {
            case 0:
                i12 += i11;
                i13 = i12 & 1;
                break;
            case 1:
                i13 = i12 & 1;
                break;
            case 2:
                i13 = i11 % 3;
                break;
            case 3:
                i13 = (i12 + i11) % 3;
                break;
            case 4:
                i13 = ((i11 / 3) + (i12 / 2)) & 1;
                break;
            case 5:
                int i14 = i12 * i11;
                i13 = (i14 & 1) + (i14 % 3);
                break;
            case 6:
                int i15 = i12 * i11;
                i12 = (i15 % 3) + (i15 & 1);
                i13 = i12 & 1;
                break;
            case 7:
                i13 = (((i12 * i11) % 3) + ((i12 + i11) & 1)) & 1;
                break;
            default:
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid mask pattern: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                } catch (Exception e10) {
                    throw e10;
                }
        }
        return i13 == 0;
    }

    private static boolean a(byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, bArr.length);
        for (int max = Math.max(i10, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i10, int i11, int i12) {
        int min = Math.min(i12, bArr.length);
        for (int max = Math.max(i11, 0); max < min; max++) {
            if (max < bArr.length && i10 < bArr[0].length && bArr[max][i10] == 1) {
                return false;
            }
        }
        return true;
    }

    public static int b(Ic ic2) {
        byte[][] a10 = ic2.a();
        int c10 = ic2.c();
        int b10 = ic2.b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10 - 1; i11++) {
            byte[] bArr = a10[i11];
            int i12 = 0;
            while (i12 < c10 - 1) {
                byte b11 = bArr[i12];
                int i13 = i12 + 1;
                if (b11 == bArr[i13]) {
                    byte[] bArr2 = a10[i11 + 1];
                    if (b11 == bArr2[i12] && b11 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    public static int c(Ic ic2) {
        byte[][] a10 = ic2.a();
        int c10 = ic2.c();
        int b10 = ic2.b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            for (int i12 = 0; i12 < c10; i12++) {
                byte[] bArr = a10[i11];
                int i13 = i12 + 6;
                if (i13 < c10 && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (a(bArr, i12 - 4, i12) || a(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < b10 && a10[i11][i12] == 1 && a10[i11 + 1][i12] == 0 && a10[i11 + 2][i12] == 1 && a10[i11 + 3][i12] == 1 && a10[i11 + 4][i12] == 1 && a10[i11 + 5][i12] == 0 && a10[i14][i12] == 1 && (a(a10, i12, i11 - 4, i11) || a(a10, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    public static int d(Ic ic2) {
        byte[][] a10 = ic2.a();
        int c10 = ic2.c();
        int b10 = ic2.b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            byte[] bArr = a10[i11];
            for (int i12 = 0; i12 < c10; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int c11 = ic2.c() * ic2.b();
        return ((Math.abs((i10 * 2) - c11) * 10) / c11) * 10;
    }
}
