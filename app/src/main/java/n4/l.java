package n4;

import androidx.appcompat.widget.u0;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public static final int[][] f22009a;

    /* renamed from: b */
    public static final int[][] f22010b;

    static {
        Class cls = Integer.TYPE;
        f22009a = (int[][]) Array.newInstance(cls, 326, 4);
        f22010b = (int[][]) Array.newInstance(cls, 291, 4);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = bigInteger.shiftLeft(31).subtract(bigInteger);
        BigInteger subtract2 = bigInteger.shiftLeft(31).subtract(bigInteger);
        int i10 = 0;
        while (i10 < 326) {
            BigInteger pow = BigInteger.valueOf(5L).pow(i10);
            int bitLength = pow.bitLength();
            int i11 = i10 == 0 ? 1 : (int) ((((i10 * 23219280) + 10000000) - 1) / 10000000);
            if (i11 != bitLength) {
                throw new IllegalStateException(bitLength + " != " + i11);
            }
            if (i10 < f22009a.length) {
                for (int i12 = 0; i12 < 4; i12++) {
                    f22009a[i10][i12] = pow.shiftRight(((3 - i12) * 31) + (bitLength - 121)).and(subtract).intValue();
                }
            }
            if (i10 < f22010b.length) {
                BigInteger bigInteger2 = BigInteger.ONE;
                BigInteger add = bigInteger2.shiftLeft(bitLength + 121).divide(pow).add(bigInteger2);
                for (int i13 = 0; i13 < 4; i13++) {
                    int[][] iArr = f22010b;
                    if (i13 == 0) {
                        iArr[i10][i13] = add.shiftRight((3 - i13) * 31).intValue();
                    } else {
                        iArr[i10][i13] = add.shiftRight((3 - i13) * 31).and(subtract2).intValue();
                    }
                }
            }
            i10++;
        }
    }

    public static int a(double d10, char[] cArr, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        long j10;
        long j11;
        long j12;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        int i16;
        boolean z17;
        int i17;
        long j13;
        int i18;
        boolean z18;
        boolean z19;
        boolean z20;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z21;
        int i25;
        int i26;
        int i27;
        int i28;
        if (Double.isNaN(d10)) {
            int i29 = i10 + 1;
            cArr[i10] = 'N';
            int i30 = i29 + 1;
            cArr[i29] = 'a';
            i28 = i30 + 1;
            cArr[i30] = 'N';
        } else {
            if (d10 == Double.POSITIVE_INFINITY) {
                int i31 = i10 + 1;
                cArr[i10] = 'I';
                int i32 = i31 + 1;
                cArr[i31] = 'n';
                int i33 = i32 + 1;
                cArr[i32] = 'f';
                int i34 = i33 + 1;
                cArr[i33] = 'i';
                int i35 = i34 + 1;
                cArr[i34] = 'n';
                int i36 = i35 + 1;
                cArr[i35] = 'i';
                int i37 = i36 + 1;
                cArr[i36] = 't';
                i22 = i37 + 1;
                cArr[i37] = 'y';
            } else if (d10 == Double.NEGATIVE_INFINITY) {
                int i38 = i10 + 1;
                cArr[i10] = '-';
                int i39 = i38 + 1;
                cArr[i38] = 'I';
                int i40 = i39 + 1;
                cArr[i39] = 'n';
                int i41 = i40 + 1;
                cArr[i40] = 'f';
                int i42 = i41 + 1;
                cArr[i41] = 'i';
                int i43 = i42 + 1;
                cArr[i42] = 'n';
                int i44 = i43 + 1;
                cArr[i43] = 'i';
                int i45 = i44 + 1;
                cArr[i44] = 't';
                i28 = i45 + 1;
                cArr[i45] = 'y';
            } else {
                long doubleToLongBits = Double.doubleToLongBits(d10);
                int i46 = (doubleToLongBits > 0L ? 1 : (doubleToLongBits == 0L ? 0 : -1));
                if (i46 == 0) {
                    int i47 = i10 + 1;
                    cArr[i10] = '0';
                    int i48 = i47 + 1;
                    cArr[i47] = '.';
                    i28 = i48 + 1;
                    cArr[i48] = '0';
                } else if (doubleToLongBits == Long.MIN_VALUE) {
                    int i49 = i10 + 1;
                    cArr[i10] = '-';
                    int i50 = i49 + 1;
                    cArr[i49] = '0';
                    int i51 = i50 + 1;
                    cArr[i50] = '.';
                    i22 = i51 + 1;
                    cArr[i51] = '0';
                } else {
                    int i52 = (int) ((doubleToLongBits >>> 52) & 2047);
                    long j14 = doubleToLongBits & 4503599627370495L;
                    if (i52 == 0) {
                        i11 = -1074;
                    } else {
                        i11 = (i52 - 1023) - 52;
                        j14 |= 4503599627370496L;
                    }
                    if (i46 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((j14 & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    long j15 = 4 * j14;
                    long j16 = 2 + j15;
                    if (j14 == 4503599627370496L && i52 > 1) {
                        i12 = 0;
                    } else {
                        i12 = 1;
                    }
                    long j17 = (j15 - 1) - i12;
                    int i53 = i11 - 2;
                    if (i53 >= 0) {
                        int max = Math.max(0, ((int) ((i53 * 3010299) / 10000000)) - 1);
                        if (max == 0) {
                            i24 = 1;
                        } else {
                            i24 = (int) ((((max * 23219280) + 10000000) - 1) / 10000000);
                        }
                        int i54 = ((((-i53) + max) + ((i24 + 122) - 1)) - 93) - 21;
                        if (i54 >= 0) {
                            int[] iArr = f22010b[max];
                            long j18 = j15 >>> 31;
                            long j19 = j15 & 2147483647L;
                            int i55 = iArr[0];
                            long j20 = i55 * j18;
                            int i56 = iArr[1];
                            z13 = z10;
                            int i57 = iArr[2];
                            int i58 = iArr[3];
                            z12 = z11;
                            long j21 = ((((((((((((j19 * i58) >>> 31) + (i57 * j19)) + (j18 * i58)) >>> 31) + (i56 * j19)) + (i57 * j18)) >>> 31) + (i55 * j19)) + (i56 * j18)) >>> 21) + (j20 << 10)) >>> i54;
                            long j22 = j16 >>> 31;
                            long j23 = j16 & 2147483647L;
                            long j24 = i55 * j22;
                            j10 = j21;
                            long j25 = ((((((((((((j23 * i58) >>> 31) + (i57 * j23)) + (j22 * i58)) >>> 31) + (i56 * j23)) + (i57 * j22)) >>> 31) + (i55 * j23)) + (i56 * j22)) >>> 21) + (j24 << 10)) >>> i54;
                            long j26 = j17 >>> 31;
                            long j27 = 2147483647L & j17;
                            long j28 = i55 * j26;
                            j11 = j25;
                            j12 = ((((((((((((j27 * i58) >>> 31) + (i57 * j27)) + (j26 * i58)) >>> 31) + (i56 * j27)) + (i57 * j26)) >>> 31) + (i55 * j27)) + (i56 * j26)) >>> 21) + (j28 << 10)) >>> i54;
                            if (max <= 21) {
                                int i59 = ((j15 % 5) > 0L ? 1 : ((j15 % 5) == 0L ? 0 : -1));
                                if (i59 == 0) {
                                    if (i59 != 0) {
                                        i27 = 0;
                                    } else if (j15 % 25 != 0) {
                                        i27 = 1;
                                    } else if (j15 % 125 != 0) {
                                        i27 = 2;
                                    } else if (j15 % 625 != 0) {
                                        i27 = 3;
                                    } else {
                                        long j29 = j15 / 625;
                                        i27 = 4;
                                        for (long j30 = 0; j29 > j30 && j29 % 5 == j30; j30 = 0) {
                                            j29 /= 5;
                                            i27++;
                                        }
                                    }
                                    if (i27 >= max) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    z14 = false;
                                    z15 = z21;
                                    i15 = max;
                                } else if (z12) {
                                    if (j17 % 5 != 0) {
                                        i26 = 0;
                                    } else if (j17 % 25 != 0) {
                                        i26 = 1;
                                    } else if (j17 % 125 != 0) {
                                        i26 = 2;
                                    } else if (j17 % 625 != 0) {
                                        i26 = 3;
                                    } else {
                                        long j31 = j17 / 625;
                                        i26 = 4;
                                        for (long j32 = 0; j31 > j32 && j31 % 5 == j32; j32 = 0) {
                                            j31 /= 5;
                                            i26++;
                                        }
                                    }
                                    if (i26 >= max) {
                                        z14 = true;
                                        z21 = false;
                                        z15 = z21;
                                        i15 = max;
                                    }
                                } else {
                                    if (j16 % 5 != 0) {
                                        i25 = 0;
                                    } else if (j16 % 25 != 0) {
                                        i25 = 1;
                                    } else if (j16 % 125 != 0) {
                                        i25 = 2;
                                    } else if (j16 % 625 != 0) {
                                        i25 = 3;
                                    } else {
                                        long j33 = j16 / 625;
                                        i25 = 4;
                                        for (long j34 = 0; j33 > j34 && j33 % 5 == j34; j34 = 0) {
                                            j33 /= 5;
                                            i25++;
                                        }
                                    }
                                    if (i25 >= max) {
                                        j11--;
                                    }
                                }
                            }
                            z14 = false;
                            z21 = false;
                            z15 = z21;
                            i15 = max;
                        } else {
                            throw new IllegalArgumentException(u0.a("", i54));
                        }
                    } else {
                        z12 = z11;
                        z13 = z10;
                        int max2 = Math.max(0, ((int) ((i13 * 6989700) / 10000000)) - 1);
                        int i60 = (-i53) - max2;
                        if (i60 == 0) {
                            i14 = 1;
                        } else {
                            i14 = (int) ((((i60 * 23219280) + 10000000) - 1) / 10000000);
                        }
                        int i61 = ((max2 - (i14 - 121)) - 93) - 21;
                        if (i61 >= 0) {
                            int[] iArr2 = f22009a[i60];
                            long j35 = j15 >>> 31;
                            long j36 = j15 & 2147483647L;
                            int i62 = iArr2[0];
                            long j37 = i62 * j35;
                            int i63 = iArr2[1];
                            int i64 = i12;
                            int i65 = iArr2[2];
                            int i66 = iArr2[3];
                            long j38 = j16 >>> 31;
                            long j39 = j16 & 2147483647L;
                            long j40 = i62 * j38;
                            long j41 = i63 * j38;
                            j10 = ((((((((((((j36 * i66) >>> 31) + (i65 * j36)) + (j35 * i66)) >>> 31) + (i63 * j36)) + (i65 * j35)) >>> 31) + (i62 * j36)) + (i63 * j35)) >>> 21) + (j37 << 10)) >>> i61;
                            long j42 = i65 * j38;
                            long j43 = j38 * i66;
                            long j44 = j17 >>> 31;
                            long j45 = j17 & 2147483647L;
                            long j46 = i63 * j44;
                            j11 = ((((((((((((j39 * i66) >>> 31) + (i65 * j39)) + j43) >>> 31) + (i63 * j39)) + j42) >>> 31) + (i62 * j39)) + j41) >>> 21) + (j40 << 10)) >>> i61;
                            long j47 = i65 * j44;
                            j12 = ((((((((((((j45 * i66) >>> 31) + (i65 * j45)) + (j44 * i66)) >>> 31) + (i63 * j45)) + j47) >>> 31) + (i62 * j45)) + j46) >>> 21) + ((i62 * j44) << 10)) >>> i61;
                            i15 = max2 + i53;
                            if (max2 <= 1) {
                                if (z12) {
                                    if (i64 == 1) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    z14 = z16;
                                } else {
                                    j11--;
                                    z14 = false;
                                }
                                z15 = true;
                            } else if (max2 < 63) {
                                if ((j15 & ((1 << (max2 - 1)) - 1)) == 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z14 = false;
                            } else {
                                z14 = false;
                                z15 = false;
                            }
                        } else {
                            throw new IllegalArgumentException(u0.a("", i61));
                        }
                    }
                    if (j11 >= 1000000000000000000L) {
                        i16 = 19;
                    } else if (j11 >= 100000000000000000L) {
                        i16 = 18;
                    } else if (j11 >= 10000000000000000L) {
                        i16 = 17;
                    } else if (j11 >= 1000000000000000L) {
                        i16 = 16;
                    } else if (j11 >= 100000000000000L) {
                        i16 = 15;
                    } else if (j11 >= 10000000000000L) {
                        i16 = 14;
                    } else if (j11 >= 1000000000000L) {
                        i16 = 13;
                    } else if (j11 >= 100000000000L) {
                        i16 = 12;
                    } else if (j11 >= 10000000000L) {
                        i16 = 11;
                    } else if (j11 >= 1000000000) {
                        i16 = 10;
                    } else if (j11 >= 100000000) {
                        i16 = 9;
                    } else if (j11 >= 10000000) {
                        i16 = 8;
                    } else if (j11 >= 1000000) {
                        i16 = 7;
                    } else if (j11 >= 100000) {
                        i16 = 6;
                    } else if (j11 >= 10000) {
                        i16 = 5;
                    } else if (j11 >= 1000) {
                        i16 = 4;
                    } else if (j11 >= 100) {
                        i16 = 3;
                    } else if (j11 >= 10) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    int i67 = (i15 + i16) - 1;
                    if (i67 >= -3 && i67 < 7) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (!z14 && !z15) {
                        i18 = 0;
                        int i68 = 0;
                        while (true) {
                            long j48 = j11 / 10;
                            long j49 = j12 / 10;
                            if (j48 <= j49 || (j11 < 100 && z17)) {
                                break;
                            }
                            i68 = (int) (j10 % 10);
                            j10 /= 10;
                            i18++;
                            j11 = j48;
                            j12 = j49;
                        }
                        if (j10 != j12 && i68 < 5) {
                            i23 = 0;
                        } else {
                            i23 = 1;
                        }
                        j13 = j10 + i23;
                    } else {
                        int i69 = 0;
                        int i70 = 0;
                        while (true) {
                            long j50 = j11 / 10;
                            long j51 = j12 / 10;
                            if (j50 <= j51 || (j11 < 100 && z17)) {
                                break;
                            }
                            if (j12 % 10 == 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z14 &= z19;
                            if (i69 == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            z15 &= z20;
                            i69 = (int) (j10 % 10);
                            j10 /= 10;
                            i70++;
                            j11 = j50;
                            j12 = j51;
                        }
                        if (z14 && z12) {
                            while (j12 % 10 == 0 && (j11 >= 100 || !z17)) {
                                if (i69 == 0) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z15 &= z18;
                                i69 = (int) (j10 % 10);
                                j11 /= 10;
                                j10 /= 10;
                                j12 /= 10;
                                i70++;
                            }
                        }
                        if (z15 && i69 == 5 && j10 % 2 == 0) {
                            i69 = 4;
                        }
                        if ((j10 == j12 && (!z14 || !z12)) || i69 >= 5) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        j13 = j10 + i17;
                        i18 = i70;
                    }
                    int i71 = i16 - i18;
                    if (z13) {
                        i19 = i10 + 1;
                        cArr[i10] = '-';
                    } else {
                        i19 = i10;
                    }
                    if (z17) {
                        for (int i72 = 0; i72 < i71 - 1; i72++) {
                            int i73 = (int) (j13 % 10);
                            j13 /= 10;
                            cArr[(i19 + i71) - i72] = (char) (i73 + 48);
                        }
                        cArr[i19] = (char) ((j13 % 10) + 48);
                        cArr[i19 + 1] = '.';
                        int i74 = i71 + 1 + i19;
                        if (i71 == 1) {
                            cArr[i74] = '0';
                            i74++;
                        }
                        int i75 = i74 + 1;
                        cArr[i74] = 'E';
                        if (i67 < 0) {
                            cArr[i75] = '-';
                            i67 = -i67;
                            i75++;
                        }
                        if (i67 >= 100) {
                            int i76 = i75 + 1;
                            i21 = 48;
                            cArr[i75] = (char) ((i67 / 100) + 48);
                            i67 %= 100;
                            i75 = i76 + 1;
                            cArr[i76] = (char) ((i67 / 10) + 48);
                        } else {
                            i21 = 48;
                            if (i67 >= 10) {
                                cArr[i75] = (char) ((i67 / 10) + 48);
                                i75++;
                            }
                        }
                        i22 = i75 + 1;
                        cArr[i75] = (char) ((i67 % 10) + i21);
                    } else {
                        char c10 = '0';
                        if (i67 < 0) {
                            int i77 = i19 + 1;
                            cArr[i19] = '0';
                            int i78 = i77 + 1;
                            cArr[i77] = '.';
                            int i79 = -1;
                            while (i79 > i67) {
                                cArr[i78] = c10;
                                i79--;
                                c10 = '0';
                                i78++;
                            }
                            i20 = i78;
                            for (int i80 = 0; i80 < i71; i80++) {
                                cArr[((i78 + i71) - i80) - 1] = (char) ((j13 % 10) + 48);
                                j13 /= 10;
                                i20++;
                            }
                        } else {
                            int i81 = i67 + 1;
                            if (i81 >= i71) {
                                for (int i82 = 0; i82 < i71; i82++) {
                                    cArr[((i19 + i71) - i82) - 1] = (char) ((j13 % 10) + 48);
                                    j13 /= 10;
                                }
                                int i83 = i19 + i71;
                                while (i71 < i81) {
                                    cArr[i83] = '0';
                                    i71++;
                                    i83++;
                                }
                                int i84 = i83 + 1;
                                cArr[i83] = '.';
                                cArr[i84] = '0';
                                i20 = i84 + 1;
                            } else {
                                int i85 = i19 + 1;
                                for (int i86 = 0; i86 < i71; i86++) {
                                    if ((i71 - i86) - 1 == i67) {
                                        cArr[((i85 + i71) - i86) - 1] = '.';
                                        i85--;
                                    }
                                    cArr[((i85 + i71) - i86) - 1] = (char) ((j13 % 10) + 48);
                                    j13 /= 10;
                                }
                                i20 = i71 + 1 + i19;
                            }
                        }
                        return i20 - i10;
                    }
                }
            }
            return i22 - i10;
        }
        return i28 - i10;
    }
}
