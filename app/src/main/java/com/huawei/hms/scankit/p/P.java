package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class P extends Y {

    /* renamed from: a */
    public static final int[][] f7633a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int a(C0732x c0732x, int[] iArr, int i10) {
        Y.a(c0732x, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f7633a;
            if (i12 >= iArr2.length) {
                break;
            }
            float b10 = i12 == iArr2.length + (-1) ? b(c0732x, iArr, i10) : Y.a(iArr, iArr2[i12], 0.7f);
            if (b10 < f10) {
                i11 = i12;
                f10 = b10;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C0628a.a();
    }

    private void a(StringBuilder sb2, int[] iArr, int[] iArr2, int i10, C0732x c0732x, List<Byte> list) {
        P p10 = this;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr3 = new int[6];
        int i13 = iArr2[6];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        int i18 = 0;
        int i19 = 0;
        boolean z10 = false;
        int i20 = 0;
        int i21 = i12;
        int i22 = i11;
        int i23 = i10;
        while (i14 == 0) {
            int a10 = a(c0732x, iArr3, i21);
            list.add(Byte.valueOf((byte) a10));
            if (a10 != 106) {
                i16++;
                i23 = (i16 * a10) + i23;
                i17 = 1;
            }
            int i24 = i21;
            for (int i25 = 0; i25 < 6; i25++) {
                i24 += iArr3[i25];
            }
            if (a10 == 105) {
                throw C0628a.a();
            }
            int[] iArr4 = {a10, i18, i19, i17, i13, 0, i14};
            if (i13 == 101) {
                iArr4 = p10.a(sb2, iArr4);
            } else if (i13 == 100) {
                iArr4 = p10.b(sb2, iArr4);
            } else if (i13 == 99) {
                iArr4 = p10.c(sb2, iArr4);
            }
            int i26 = iArr4[0];
            i18 = iArr4[1] == 1 ? 1 : 0;
            i19 = iArr4[2] == 1 ? 1 : 0;
            int i27 = iArr4[3] == 1 ? 1 : 0;
            boolean z11 = iArr4[5] == 1;
            int i28 = iArr4[6] == 1 ? 1 : 0;
            i13 = z10 ? iArr4[4] == 101 ? 100 : 101 : iArr4[4];
            z10 = z11;
            i15 = i20;
            i14 = i28;
            i20 = i26;
            p10 = this;
            i17 = i27;
            i22 = i21;
            i21 = i24;
        }
        iArr2[0] = i22;
        iArr2[1] = i21;
        iArr2[2] = i15;
        iArr2[3] = i23;
        iArr2[4] = i16;
        iArr2[5] = i17;
        iArr2[6] = i13;
    }

    private static boolean a(C0732x c0732x, int i10, int i11) {
        return c0732x.a(i10, i11, false, false);
    }

    private static int[] a(C0732x c0732x) {
        int d10 = c0732x.d();
        int b10 = c0732x.b(0);
        int[] iArr = new int[6];
        int i10 = b10;
        boolean z10 = false;
        int i11 = 0;
        while (b10 < d10) {
            if (c0732x.a(b10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == 5) {
                    float f10 = 0.25f;
                    int i12 = -1;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float a10 = Y.a(iArr, f7633a[i13], 0.7f);
                        if (a10 < f10) {
                            i12 = i13;
                            f10 = a10;
                        }
                    }
                    if (i12 >= 0) {
                        return new int[]{i10, b10, i12};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i14 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            b10++;
        }
        throw C0628a.a();
    }

    private int[] a(StringBuilder sb2, int[] iArr) {
        int i10;
        int i11 = iArr[0];
        int i12 = iArr[1] == 1 ? 1 : 0;
        int i13 = iArr[2] == 1 ? 1 : 0;
        int i14 = iArr[3] == 1 ? 1 : 0;
        int i15 = iArr[4];
        int i16 = iArr[5] == 1 ? 1 : 0;
        int i17 = iArr[6] == 1 ? 1 : 0;
        if (i11 < 64) {
            i10 = i12 == i13 ? i11 + 32 : i11 + 32 + 128;
        } else if (i11 >= 96) {
            if (i11 != 106) {
                i14 = 0;
            }
            if (i11 != 106) {
                switch (i11) {
                    case 96:
                    case 97:
                    case 102:
                        break;
                    case 98:
                        i15 = 100;
                        i16 = 1;
                        break;
                    case 99:
                        i15 = 99;
                        break;
                    case 100:
                        i15 = 100;
                        break;
                    case 101:
                        if (i13 == 0 && i12 != 0) {
                            i12 = 0;
                            i13 = 1;
                            break;
                        } else if (i13 != 0 && i12 != 0) {
                            i12 = 0;
                            i13 = 0;
                            break;
                        } else {
                            i12 = 1;
                            break;
                        }
                    default:
                        throw C0628a.a();
                }
            } else {
                i17 = 1;
            }
            return new int[]{i11, i12, i13, i14, i15, i16, i17};
        } else {
            i10 = i12 == i13 ? i11 - 64 : i11 + 64;
        }
        sb2.append((char) i10);
        i12 = 0;
        return new int[]{i11, i12, i13, i14, i15, i16, i17};
    }

    private static float b(C0732x c0732x, int[] iArr, int i10) {
        int[] iArr2 = new int[7];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i11 : iArr) {
            i10 += i11;
        }
        boolean z10 = true;
        int i12 = 0;
        while (z10 && i10 < c0732x.d()) {
            if (c0732x.a(i10)) {
                i12++;
                i10++;
            } else {
                iArr2[6] = i12;
                z10 = false;
            }
        }
        int[][] iArr3 = f7633a;
        return Y.a(iArr2, iArr3[iArr3.length - 1], 0.7f);
    }

    private int[] b(StringBuilder sb2, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1] == 1 ? 1 : 0;
        int i12 = iArr[2] == 1 ? 1 : 0;
        int i13 = iArr[3] == 1 ? 1 : 0;
        int i14 = iArr[4];
        int i15 = iArr[5] == 1 ? 1 : 0;
        int i16 = iArr[6] == 1 ? 1 : 0;
        if (i10 < 96) {
            sb2.append((char) (i11 == i12 ? i10 + 32 : i10 + 32 + 128));
            i11 = 0;
        } else {
            if (i10 != 106) {
                i13 = 0;
            }
            if (i10 != 106) {
                switch (i10) {
                    case 96:
                    case 97:
                    case 102:
                        break;
                    case 98:
                        i14 = 101;
                        i15 = 1;
                        break;
                    case 99:
                        i14 = 99;
                        break;
                    case 100:
                        if (i12 == 0 && i11 != 0) {
                            i11 = 0;
                            i12 = 1;
                            break;
                        } else if (i12 != 0 && i11 != 0) {
                            i11 = 0;
                            i12 = 0;
                            break;
                        } else {
                            i11 = 1;
                            break;
                        }
                    case 101:
                        i14 = 101;
                        break;
                    default:
                        throw C0628a.a();
                }
            } else {
                i16 = 1;
            }
        }
        return new int[]{i10, i11, i12, i13, i14, i15, i16};
    }

    private int[] c(StringBuilder sb2, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1] == 1 ? 1 : 0;
        int i12 = iArr[2] == 1 ? 1 : 0;
        int i13 = iArr[3] == 1 ? 1 : 0;
        int i14 = iArr[4];
        int i15 = iArr[5] == 1 ? 1 : 0;
        int i16 = iArr[6] == 1 ? 1 : 0;
        if (i10 < 100) {
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
        } else {
            if (i10 != 106) {
                i13 = 0;
            }
            if (i10 != 106) {
                switch (i10) {
                    case 100:
                        i14 = 100;
                        break;
                    case 101:
                        i14 = 101;
                        break;
                    case 102:
                        break;
                    default:
                        throw C0628a.a();
                }
            } else {
                i16 = 1;
            }
        }
        return new int[]{i10, i11, i12, i13, i14, i15, i16};
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        int[] a10 = a(c0732x);
        int i11 = a10[0];
        int i12 = i11 - (((a10[1] - i11) / 11) * 10);
        if (i12 > 0 && i12 < i11) {
            if (!a(c0732x, i12, i11)) {
                throw C0628a.a();
            }
        }
        int i13 = a10[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i13));
        int i14 = i13 == 103 ? 101 : i13 == 104 ? 100 : i13 == 105 ? 99 : 0;
        if (i14 != 0) {
            StringBuilder sb2 = new StringBuilder(20);
            int[] iArr = new int[7];
            iArr[6] = i14;
            a(sb2, a10, iArr, i13, c0732x, arrayList);
            int i15 = iArr[0];
            int i16 = iArr[1];
            int i17 = iArr[2];
            int i18 = iArr[3];
            int i19 = iArr[4];
            boolean z10 = iArr[5] == 1;
            int i20 = iArr[6];
            int i21 = i16 - i15;
            if ((i18 - (i19 * i17)) % 103 == i17) {
                int length = sb2.length();
                if (length != 0) {
                    if (length > 0 && z10) {
                        sb2.delete(i20 == 99 ? length - 2 : length - 1, length);
                    }
                    float f10 = a10[0];
                    float f11 = ((i21 * 13) / 11) + i15;
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i22 = 0; i22 < size; i22++) {
                        bArr[i22] = ((Byte) arrayList.get(i22)).byteValue();
                    }
                    float f12 = i10;
                    return new com.huawei.hms.scankit.aiscan.common.x(sb2.toString(), bArr, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(f10, f12), new com.huawei.hms.scankit.aiscan.common.z(f11, f12)}, BarcodeFormat.CODE_128);
                }
                throw C0628a.a();
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }
}
