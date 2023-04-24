package w1;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a */
    public static final b f29660a;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (!c(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !c(b12) && !c(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw z.a();
        }

        public static void b(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (c(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || c(b12)))) {
                throw z.a();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean c(byte b10) {
            return b10 > -65;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract int c(int i10, int i11, byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static final class c extends b {
        @Override // w1.o1.b
        public final String a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = bArr[i10];
                    if (b10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 >= i12) {
                                break;
                            }
                            byte b12 = bArr[i10];
                            if (b12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b12;
                        }
                    } else {
                        if (b11 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i15 < i12) {
                                int i17 = i15 + 1;
                                byte b13 = bArr[i15];
                                int i18 = i14 + 1;
                                if (b11 >= -62 && !a.c(b13)) {
                                    cArr[i14] = (char) (((b11 & 31) << 6) | (b13 & 63));
                                    i10 = i17;
                                    i14 = i18;
                                } else {
                                    throw z.a();
                                }
                            } else {
                                throw z.a();
                            }
                        } else {
                            if (b11 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i15 < i12 - 1) {
                                    int i19 = i15 + 1;
                                    a.b(b11, bArr[i15], bArr[i19], cArr, i14);
                                    i10 = i19 + 1;
                                    i14++;
                                } else {
                                    throw z.a();
                                }
                            } else if (i15 < i12 - 2) {
                                int i20 = i15 + 1;
                                byte b14 = bArr[i15];
                                int i21 = i20 + 1;
                                a.a(b11, b14, bArr[i20], bArr[i21], cArr, i14);
                                i14 = i14 + 1 + 1;
                                i10 = i21 + 1;
                            } else {
                                throw z.a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x001d, code lost:
            return r10 + r0;
         */
        @Override // w1.o1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.o1.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // w1.o1.b
        public final int c(int i10, int i11, byte[] bArr) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 < i11) {
                while (i10 < i11) {
                    int i12 = i10 + 1;
                    int i13 = bArr[i10];
                    if (i13 < 0) {
                        if (i13 < -32) {
                            if (i12 >= i11) {
                                return i13;
                            }
                            if (i13 < -62) {
                                return -1;
                            }
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                                return -1;
                            }
                        } else {
                            if (i13 < -16) {
                                if (i12 < i11 - 1) {
                                    int i14 = i12 + 1;
                                    byte b10 = bArr[i12];
                                    if (b10 > -65) {
                                        return -1;
                                    }
                                    if (i13 == -32 && b10 < -96) {
                                        return -1;
                                    }
                                    if (i13 == -19 && b10 >= -96) {
                                        return -1;
                                    }
                                    i10 = i14 + 1;
                                    if (bArr[i14] > -65) {
                                        return -1;
                                    }
                                }
                            } else if (i12 < i11 - 2) {
                                int i15 = i12 + 1;
                                byte b11 = bArr[i12];
                                if (b11 > -65) {
                                    return -1;
                                }
                                if ((((b11 + 112) + (i13 << 28)) >> 30) != 0) {
                                    return -1;
                                }
                                int i16 = i15 + 1;
                                if (bArr[i15] > -65) {
                                    return -1;
                                }
                                i12 = i16 + 1;
                                if (bArr[i16] > -65) {
                                    return -1;
                                }
                            }
                            i13 = bArr[i12 - 1];
                            int i17 = i11 - i12;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    if (i17 == 2) {
                                        i13 = o1.c(i13, bArr[i12], bArr[i12 + 1]);
                                    } else {
                                        throw new AssertionError();
                                    }
                                } else {
                                    i13 = o1.b(i13, bArr[i12]);
                                }
                            } else if (i13 > -12) {
                                return -1;
                            }
                            return i13;
                        }
                    }
                    i10 = i12;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super(s.p1.a("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {
        public static int d(long j10, byte[] bArr, int i10, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return o1.c(i10, n1.g(j10, bArr), n1.g(j10 + 1, bArr));
                    }
                    throw new AssertionError();
                }
                return o1.b(i10, n1.g(j10, bArr));
            }
            b bVar = o1.f29660a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }

        @Override // w1.o1.b
        public final String a(byte[] bArr, int i10, int i11) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte g10 = n1.g(i10, bArr);
                    if (g10 >= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) g10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte g11 = n1.g(i10, bArr);
                    if (g11 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) g11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 >= i12) {
                                break;
                            }
                            byte g12 = n1.g(i10, bArr);
                            if (g12 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) g12;
                        }
                    } else {
                        if (g11 < -32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (i15 < i12) {
                                int i17 = i15 + 1;
                                byte g13 = n1.g(i15, bArr);
                                int i18 = i14 + 1;
                                if (g11 >= -62 && !a.c(g13)) {
                                    cArr[i14] = (char) (((g11 & 31) << 6) | (g13 & 63));
                                    i10 = i17;
                                    i14 = i18;
                                } else {
                                    throw z.a();
                                }
                            } else {
                                throw z.a();
                            }
                        } else {
                            if (g11 < -16) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i15 < i12 - 1) {
                                    int i19 = i15 + 1;
                                    a.b(g11, n1.g(i15, bArr), n1.g(i19, bArr), cArr, i14);
                                    i10 = i19 + 1;
                                    i14++;
                                } else {
                                    throw z.a();
                                }
                            } else if (i15 < i12 - 2) {
                                int i20 = i15 + 1;
                                int i21 = i20 + 1;
                                a.a(g11, n1.g(i15, bArr), n1.g(i20, bArr), n1.g(i21, bArr), cArr, i14);
                                i14 = i14 + 1 + 1;
                                i10 = i21 + 1;
                            } else {
                                throw z.a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // w1.o1.b
        public final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            long j10;
            char c10;
            long j11;
            int i12;
            char charAt;
            long j12 = i10;
            long j13 = i11 + j12;
            int length = charSequence.length();
            if (length <= i11 && bArr.length - i11 >= i10) {
                int i13 = 0;
                while (true) {
                    j10 = 1;
                    c10 = 128;
                    if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                        break;
                    }
                    n1.p(bArr, j12, (byte) charAt);
                    i13++;
                    j12 = 1 + j12;
                }
                if (i13 == length) {
                    return (int) j12;
                }
                while (i13 < length) {
                    char charAt2 = charSequence.charAt(i13);
                    if (charAt2 < c10 && j12 < j13) {
                        j11 = j10 + j12;
                        n1.p(bArr, j12, (byte) charAt2);
                    } else {
                        if (charAt2 < 2048 && j12 <= j13 - 2) {
                            long j14 = j12 + j10;
                            n1.p(bArr, j12, (byte) ((charAt2 >>> 6) | 960));
                            n1.p(bArr, j14, (byte) ((charAt2 & '?') | 128));
                            j12 = j14 + j10;
                        } else if ((charAt2 < 55296 || 57343 < charAt2) && j12 <= j13 - 3) {
                            long j15 = j12 + j10;
                            n1.p(bArr, j12, (byte) ((charAt2 >>> '\f') | 480));
                            long j16 = j10 + j15;
                            n1.p(bArr, j15, (byte) (((charAt2 >>> 6) & 63) | 128));
                            n1.p(bArr, j16, (byte) ((charAt2 & '?') | 128));
                            j11 = 1 + j16;
                        } else if (j12 <= j13 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j17 = j12 + 1;
                                    n1.p(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                    long j18 = 1 + j17;
                                    n1.p(bArr, j17, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j19 = 1 + j18;
                                    n1.p(bArr, j18, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 = 1;
                                    n1.p(bArr, j19, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                    j12 = j19 + 1;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                            throw new d(i13, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j12);
                        }
                        i13++;
                        c10 = 128;
                    }
                    j12 = j11;
                    j10 = 1;
                    i13++;
                    c10 = 128;
                }
                return (int) j12;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Failed writing ");
            a10.append(charSequence.charAt(length - 1));
            a10.append(" at index ");
            a10.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(a10.toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
            return d(r7, r22, r0, r1);
         */
        @Override // w1.o1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(int r20, int r21, byte[] r22) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.o1.e.c(int, int, byte[]):int");
        }
    }

    static {
        boolean z10;
        b cVar;
        if (n1.f29651f && n1.f29650e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !w1.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f29660a = cVar;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new d(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder a10 = android.support.v4.media.d.a("UTF-8 length does not fit in int: ");
        a10.append(i12 + 4294967296L);
        throw new IllegalArgumentException(a10.toString());
    }

    public static int b(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
