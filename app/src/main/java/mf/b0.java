package mf;

import java.io.EOFException;
import java.math.BigDecimal;
import ln.h;
import mf.y;

/* loaded from: classes.dex */
public final class b0 extends y {

    /* renamed from: m */
    public static final ln.h f20501m;

    /* renamed from: n */
    public static final ln.h f20502n;

    /* renamed from: o */
    public static final ln.h f20503o;

    /* renamed from: p */
    public static final ln.h f20504p;

    /* renamed from: q */
    public static final ln.h f20505q;

    /* renamed from: g */
    public final ln.g f20506g;

    /* renamed from: h */
    public final ln.e f20507h;

    /* renamed from: i */
    public int f20508i = 0;

    /* renamed from: j */
    public long f20509j;

    /* renamed from: k */
    public int f20510k;

    /* renamed from: l */
    public String f20511l;

    static {
        ln.h hVar = ln.h.f20100d;
        f20501m = h.a.b("'\\");
        f20502n = h.a.b("\"\\");
        f20503o = h.a.b("{}[]:, \n\t\r\f/\\;#=");
        f20504p = h.a.b("\n\r");
        f20505q = h.a.b("*/");
    }

    public b0(ln.g gVar) {
        this.f20506g = gVar;
        this.f20507h = gVar.d();
        J(6);
    }

    @Override // mf.y
    public final long C() {
        ln.h hVar;
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 16) {
            this.f20508i = 0;
            int[] iArr = this.f20630d;
            int i11 = this.f20627a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f20509j;
        }
        if (i10 == 17) {
            this.f20511l = this.f20507h.P(this.f20510k);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                StringBuilder a10 = android.support.v4.media.d.a("Expected a long but was ");
                a10.append(z.a(F()));
                a10.append(" at path ");
                a10.append(k());
                throw new v(a10.toString());
            }
        } else {
            if (i10 == 9) {
                hVar = f20502n;
            } else {
                hVar = f20501m;
            }
            String p02 = p0(hVar);
            this.f20511l = p02;
            try {
                long parseLong = Long.parseLong(p02);
                this.f20508i = 0;
                int[] iArr2 = this.f20630d;
                int i12 = this.f20627a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f20508i = 11;
        try {
            long longValueExact = new BigDecimal(this.f20511l).longValueExact();
            this.f20511l = null;
            this.f20508i = 0;
            int[] iArr3 = this.f20630d;
            int i13 = this.f20627a - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder a11 = android.support.v4.media.d.a("Expected a long but was ");
            a11.append(this.f20511l);
            a11.append(" at path ");
            a11.append(k());
            throw new v(a11.toString());
        }
    }

    @Override // mf.y
    public final void D() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 7) {
            this.f20508i = 0;
            int[] iArr = this.f20630d;
            int i11 = this.f20627a - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected null but was ");
        a10.append(z.a(F()));
        a10.append(" at path ");
        a10.append(k());
        throw new v(a10.toString());
    }

    @Override // mf.y
    public final String E() {
        String P;
        ln.h hVar;
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 10) {
            P = q0();
        } else {
            if (i10 == 9) {
                hVar = f20502n;
            } else if (i10 == 8) {
                hVar = f20501m;
            } else if (i10 == 11) {
                P = this.f20511l;
                this.f20511l = null;
            } else if (i10 == 16) {
                P = Long.toString(this.f20509j);
            } else if (i10 == 17) {
                P = this.f20507h.P(this.f20510k);
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Expected a string but was ");
                a10.append(z.a(F()));
                a10.append(" at path ");
                a10.append(k());
                throw new v(a10.toString());
            }
            P = p0(hVar);
        }
        this.f20508i = 0;
        int[] iArr = this.f20630d;
        int i11 = this.f20627a - 1;
        iArr[i11] = iArr[i11] + 1;
        return P;
    }

    @Override // mf.y
    public final int F() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // mf.y
    public final void I() {
        if (q()) {
            this.f20511l = l0();
            this.f20508i = 11;
        }
    }

    @Override // mf.y
    public final int L(y.a aVar) {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return e0(this.f20511l, aVar);
        }
        int O = this.f20506g.O(aVar.f20634b);
        if (O != -1) {
            this.f20508i = 0;
            this.f20629c[this.f20627a - 1] = aVar.f20633a[O];
            return O;
        }
        String str = this.f20629c[this.f20627a - 1];
        String l02 = l0();
        int e02 = e0(l02, aVar);
        if (e02 == -1) {
            this.f20508i = 15;
            this.f20511l = l02;
            this.f20629c[this.f20627a - 1] = str;
        }
        return e02;
    }

    @Override // mf.y
    public final int P(y.a aVar) {
        int[] iArr;
        int i10;
        int i11 = this.f20508i;
        if (i11 == 0) {
            i11 = b0();
        }
        if (i11 < 8 || i11 > 11) {
            return -1;
        }
        if (i11 == 11) {
            return h0(this.f20511l, aVar);
        }
        int O = this.f20506g.O(aVar.f20634b);
        if (O != -1) {
            this.f20508i = 0;
            int[] iArr2 = this.f20630d;
            int i12 = this.f20627a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return O;
        }
        String E = E();
        int h02 = h0(E, aVar);
        if (h02 == -1) {
            this.f20508i = 11;
            this.f20511l = E;
            this.f20630d[this.f20627a - 1] = iArr[i10] - 1;
        }
        return h02;
    }

    @Override // mf.y
    public final void R() {
        ln.h hVar;
        if (!this.f20632f) {
            int i10 = this.f20508i;
            if (i10 == 0) {
                i10 = b0();
            }
            if (i10 == 14) {
                long x10 = this.f20506g.x(f20503o);
                ln.e eVar = this.f20507h;
                if (x10 == -1) {
                    x10 = eVar.f20098b;
                }
                eVar.skip(x10);
            } else {
                if (i10 == 13) {
                    hVar = f20502n;
                } else if (i10 == 12) {
                    hVar = f20501m;
                } else if (i10 != 15) {
                    StringBuilder a10 = android.support.v4.media.d.a("Expected a name but was ");
                    a10.append(z.a(F()));
                    a10.append(" at path ");
                    a10.append(k());
                    throw new v(a10.toString());
                }
                u0(hVar);
            }
            this.f20508i = 0;
            this.f20629c[this.f20627a - 1] = "null";
            return;
        }
        int F = F();
        l0();
        StringBuilder a11 = android.support.v4.media.d.a("Cannot skip unexpected ");
        a11.append(z.a(F));
        a11.append(" at ");
        a11.append(k());
        throw new v(a11.toString());
    }

    @Override // mf.y
    public final void W() {
        ln.h hVar;
        if (!this.f20632f) {
            int i10 = 0;
            do {
                int i11 = this.f20508i;
                if (i11 == 0) {
                    i11 = b0();
                }
                if (i11 == 3) {
                    J(1);
                } else if (i11 == 1) {
                    J(3);
                } else {
                    if (i11 == 4) {
                        i10--;
                        if (i10 < 0) {
                            StringBuilder a10 = android.support.v4.media.d.a("Expected a value but was ");
                            a10.append(z.a(F()));
                            a10.append(" at path ");
                            a10.append(k());
                            throw new v(a10.toString());
                        }
                    } else if (i11 == 2) {
                        i10--;
                        if (i10 < 0) {
                            StringBuilder a11 = android.support.v4.media.d.a("Expected a value but was ");
                            a11.append(z.a(F()));
                            a11.append(" at path ");
                            a11.append(k());
                            throw new v(a11.toString());
                        }
                    } else {
                        if (i11 != 14 && i11 != 10) {
                            if (i11 != 9 && i11 != 13) {
                                if (i11 != 8 && i11 != 12) {
                                    if (i11 == 17) {
                                        this.f20507h.skip(this.f20510k);
                                    } else if (i11 == 18) {
                                        StringBuilder a12 = android.support.v4.media.d.a("Expected a value but was ");
                                        a12.append(z.a(F()));
                                        a12.append(" at path ");
                                        a12.append(k());
                                        throw new v(a12.toString());
                                    }
                                } else {
                                    hVar = f20501m;
                                }
                            } else {
                                hVar = f20502n;
                            }
                            u0(hVar);
                        } else {
                            long x10 = this.f20506g.x(f20503o);
                            ln.e eVar = this.f20507h;
                            if (x10 == -1) {
                                x10 = eVar.f20098b;
                            }
                            eVar.skip(x10);
                        }
                        this.f20508i = 0;
                    }
                    this.f20627a--;
                    this.f20508i = 0;
                }
                i10++;
                this.f20508i = 0;
            } while (i10 != 0);
            int[] iArr = this.f20630d;
            int i12 = this.f20627a;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f20629c[i12 - 1] = "null";
            return;
        }
        StringBuilder a13 = android.support.v4.media.d.a("Cannot skip unexpected ");
        a13.append(z.a(F()));
        a13.append(" at ");
        a13.append(k());
        throw new v(a13.toString());
    }

    public final void Z() {
        if (this.f20631e) {
            return;
        }
        X("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // mf.y
    public final void a() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 3) {
            J(1);
            this.f20630d[this.f20627a - 1] = 0;
            this.f20508i = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected BEGIN_ARRAY but was ");
        a10.append(z.a(F()));
        a10.append(" at path ");
        a10.append(k());
        throw new v(a10.toString());
    }

    @Override // mf.y
    public final void b() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 1) {
            J(3);
            this.f20508i = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected BEGIN_OBJECT but was ");
        a10.append(z.a(F()));
        a10.append(" at path ");
        a10.append(k());
        throw new v(a10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x01c4, code lost:
        if (i0(r6) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01c7, code lost:
        if (r7 != 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01c9, code lost:
        if (r2 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01cf, code lost:
        if (r12 != Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x01d1, code lost:
        if (r3 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01d7, code lost:
        if (r12 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01d9, code lost:
        if (r3 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01db, code lost:
        if (r3 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01de, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01df, code lost:
        r16.f20509j = r12;
        r16.f20507h.skip(r1);
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01ed, code lost:
        if (r7 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01f0, code lost:
        if (r7 == 4) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01f3, code lost:
        if (r7 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01f5, code lost:
        r16.f20510k = r1;
        r14 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01fb, code lost:
        r16.f20508i = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0229, code lost:
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b0() {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.b0.b0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20508i = 0;
        this.f20628b[0] = 8;
        this.f20627a = 1;
        this.f20507h.a();
        this.f20506g.close();
    }

    public final int e0(String str, y.a aVar) {
        int length = aVar.f20633a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f20633a[i10])) {
                this.f20508i = 0;
                this.f20629c[this.f20627a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // mf.y
    public final void h() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 4) {
            int i11 = this.f20627a - 1;
            this.f20627a = i11;
            int[] iArr = this.f20630d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f20508i = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected END_ARRAY but was ");
        a10.append(z.a(F()));
        a10.append(" at path ");
        a10.append(k());
        throw new v(a10.toString());
    }

    public final int h0(String str, y.a aVar) {
        int length = aVar.f20633a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f20633a[i10])) {
                this.f20508i = 0;
                int[] iArr = this.f20630d;
                int i11 = this.f20627a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    public final boolean i0(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        Z();
        return false;
    }

    @Override // mf.y
    public final void j() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 2) {
            int i11 = this.f20627a - 1;
            this.f20627a = i11;
            this.f20629c[i11] = null;
            int[] iArr = this.f20630d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f20508i = 0;
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Expected END_OBJECT but was ");
        a10.append(z.a(F()));
        a10.append(" at path ");
        a10.append(k());
        throw new v(a10.toString());
    }

    public final String l0() {
        String str;
        ln.h hVar;
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 14) {
            str = q0();
        } else {
            if (i10 == 13) {
                hVar = f20502n;
            } else if (i10 == 12) {
                hVar = f20501m;
            } else if (i10 == 15) {
                str = this.f20511l;
                this.f20511l = null;
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Expected a name but was ");
                a10.append(z.a(F()));
                a10.append(" at path ");
                a10.append(k());
                throw new v(a10.toString());
            }
            str = p0(hVar);
        }
        this.f20508i = 0;
        this.f20629c[this.f20627a - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008f, code lost:
        if (r1 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0091, code lost:
        Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0094, code lost:
        w0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0099, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0026, code lost:
        r7.f20507h.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0030, code lost:
        if (r1 != 47) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003a, code lost:
        if (r7.f20506g.g(2) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x003c, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x003d, code lost:
        Z();
        r3 = r7.f20507h.y(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x004a, code lost:
        if (r3 == 42) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x004c, code lost:
        if (r3 == 47) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004e, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004f, code lost:
        r7.f20507h.readByte();
        r7.f20507h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x005a, code lost:
        r7.f20507h.readByte();
        r7.f20507h.readByte();
        r1 = r7.f20506g;
        r2 = mf.b0.f20505q;
        r3 = r1.N(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0070, code lost:
        if (r3 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0072, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0073, code lost:
        r1 = r7.f20507h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0075, code lost:
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0077, code lost:
        r3 = r3 + r2.f20103c.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007d, code lost:
        r3 = r1.f20098b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x007f, code lost:
        r1.skip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0082, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0086, code lost:
        X("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x008c, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n0(boolean r8) {
        /*
            r7 = this;
        L0:
            r0 = 0
            r1 = 0
        L2:
            ln.g r2 = r7.f20506g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.g(r4)
            if (r2 == 0) goto L9d
            ln.e r2 = r7.f20507h
            long r4 = (long) r1
            byte r1 = r2.y(r4)
            r2 = 10
            if (r1 == r2) goto L9a
            r2 = 32
            if (r1 == r2) goto L9a
            r2 = 13
            if (r1 == r2) goto L9a
            r2 = 9
            if (r1 != r2) goto L26
            goto L9a
        L26:
            ln.e r2 = r7.f20507h
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L8d
            ln.g r3 = r7.f20506g
            r4 = 2
            boolean r3 = r3.g(r4)
            if (r3 != 0) goto L3d
            return r1
        L3d:
            r7.Z()
            ln.e r3 = r7.f20507h
            r4 = 1
            byte r3 = r3.y(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r2) goto L4f
            return r1
        L4f:
            ln.e r0 = r7.f20507h
            r0.readByte()
            ln.e r0 = r7.f20507h
            r0.readByte()
            goto L94
        L5a:
            ln.e r1 = r7.f20507h
            r1.readByte()
            ln.e r1 = r7.f20507h
            r1.readByte()
            ln.g r1 = r7.f20506g
            ln.h r2 = mf.b0.f20505q
            long r3 = r1.N(r2)
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L73
            r0 = 1
        L73:
            ln.e r1 = r7.f20507h
            if (r0 == 0) goto L7d
            byte[] r2 = r2.f20103c
            int r2 = r2.length
            long r5 = (long) r2
            long r3 = r3 + r5
            goto L7f
        L7d:
            long r3 = r1.f20098b
        L7f:
            r1.skip(r3)
            if (r0 == 0) goto L86
            goto L0
        L86:
            java.lang.String r8 = "Unterminated comment"
            r7.X(r8)
            r8 = 0
            throw r8
        L8d:
            r0 = 35
            if (r1 != r0) goto L99
            r7.Z()
        L94:
            r7.w0()
            goto L0
        L99:
            return r1
        L9a:
            r1 = r3
            goto L2
        L9d:
            if (r8 != 0) goto La1
            r8 = -1
            return r8
        La1:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.b0.n0(boolean):int");
    }

    public final String p0(ln.h hVar) {
        StringBuilder sb2 = null;
        while (true) {
            long x10 = this.f20506g.x(hVar);
            if (x10 == -1) {
                X("Unterminated string");
                throw null;
            } else if (this.f20507h.y(x10) != 92) {
                String P = this.f20507h.P(x10);
                if (sb2 == null) {
                    this.f20507h.readByte();
                    return P;
                }
                sb2.append(P);
                this.f20507h.readByte();
                return sb2.toString();
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f20507h.P(x10));
                this.f20507h.readByte();
                sb2.append(t0());
            }
        }
    }

    @Override // mf.y
    public final boolean q() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    public final String q0() {
        long x10 = this.f20506g.x(f20503o);
        return x10 != -1 ? this.f20507h.P(x10) : this.f20507h.L();
    }

    @Override // mf.y
    public final boolean s() {
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 5) {
            this.f20508i = 0;
            int[] iArr = this.f20630d;
            int i11 = this.f20627a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f20508i = 0;
            int[] iArr2 = this.f20630d;
            int i12 = this.f20627a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("Expected a boolean but was ");
            a10.append(z.a(F()));
            a10.append(" at path ");
            a10.append(k());
            throw new v(a10.toString());
        }
    }

    public final char t0() {
        int i10;
        int i11;
        if (this.f20506g.g(1L)) {
            byte readByte = this.f20507h.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f20631e) {
                                        return (char) readByte;
                                    }
                                    StringBuilder a10 = android.support.v4.media.d.a("Invalid escape sequence: \\");
                                    a10.append((char) readByte);
                                    X(a10.toString());
                                    throw null;
                                } else if (this.f20506g.g(4L)) {
                                    char c10 = 0;
                                    for (int i12 = 0; i12 < 4; i12++) {
                                        byte y10 = this.f20507h.y(i12);
                                        char c11 = (char) (c10 << 4);
                                        if (y10 >= 48 && y10 <= 57) {
                                            i11 = y10 - 48;
                                        } else {
                                            if (y10 >= 97 && y10 <= 102) {
                                                i10 = y10 - 97;
                                            } else if (y10 < 65 || y10 > 70) {
                                                StringBuilder a11 = android.support.v4.media.d.a("\\u");
                                                a11.append(this.f20507h.P(4L));
                                                X(a11.toString());
                                                throw null;
                                            } else {
                                                i10 = y10 - 65;
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c10 = (char) (i11 + c11);
                                    }
                                    this.f20507h.skip(4L);
                                    return c10;
                                } else {
                                    StringBuilder a12 = android.support.v4.media.d.a("Unterminated escape sequence at path ");
                                    a12.append(k());
                                    throw new EOFException(a12.toString());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        X("Unterminated escape sequence");
        throw null;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("JsonReader(");
        a10.append(this.f20506g);
        a10.append(")");
        return a10.toString();
    }

    public final void u0(ln.h hVar) {
        while (true) {
            long x10 = this.f20506g.x(hVar);
            if (x10 == -1) {
                X("Unterminated string");
                throw null;
            } else if (this.f20507h.y(x10) != 92) {
                this.f20507h.skip(x10 + 1);
                return;
            } else {
                this.f20507h.skip(x10 + 1);
                t0();
            }
        }
    }

    @Override // mf.y
    public final double v() {
        String q02;
        ln.h hVar;
        double parseDouble;
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 16) {
            this.f20508i = 0;
            int[] iArr = this.f20630d;
            int i11 = this.f20627a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f20509j;
        }
        try {
            if (i10 == 17) {
                q02 = this.f20507h.P(this.f20510k);
            } else {
                if (i10 == 9) {
                    hVar = f20502n;
                } else if (i10 == 8) {
                    hVar = f20501m;
                } else if (i10 == 10) {
                    q02 = q0();
                } else {
                    if (i10 != 11) {
                        StringBuilder a10 = android.support.v4.media.d.a("Expected a double but was ");
                        a10.append(z.a(F()));
                        a10.append(" at path ");
                        a10.append(k());
                        throw new v(a10.toString());
                    }
                    this.f20508i = 11;
                    parseDouble = Double.parseDouble(this.f20511l);
                    if (this.f20631e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                        throw new w("JSON forbids NaN and infinities: " + parseDouble + " at path " + k());
                    }
                    this.f20511l = null;
                    this.f20508i = 0;
                    int[] iArr2 = this.f20630d;
                    int i12 = this.f20627a - 1;
                    iArr2[i12] = iArr2[i12] + 1;
                    return parseDouble;
                }
                q02 = p0(hVar);
            }
            parseDouble = Double.parseDouble(this.f20511l);
            if (this.f20631e) {
            }
            this.f20511l = null;
            this.f20508i = 0;
            int[] iArr22 = this.f20630d;
            int i122 = this.f20627a - 1;
            iArr22[i122] = iArr22[i122] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder a11 = android.support.v4.media.d.a("Expected a double but was ");
            a11.append(this.f20511l);
            a11.append(" at path ");
            a11.append(k());
            throw new v(a11.toString());
        }
        this.f20511l = q02;
        this.f20508i = 11;
    }

    public final void w0() {
        long j10;
        long x10 = this.f20506g.x(f20504p);
        ln.e eVar = this.f20507h;
        if (x10 != -1) {
            j10 = x10 + 1;
        } else {
            j10 = eVar.f20098b;
        }
        eVar.skip(j10);
    }

    @Override // mf.y
    public final int y() {
        ln.h hVar;
        int i10 = this.f20508i;
        if (i10 == 0) {
            i10 = b0();
        }
        if (i10 == 16) {
            long j10 = this.f20509j;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f20508i = 0;
                int[] iArr = this.f20630d;
                int i12 = this.f20627a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            StringBuilder a10 = android.support.v4.media.d.a("Expected an int but was ");
            a10.append(this.f20509j);
            a10.append(" at path ");
            a10.append(k());
            throw new v(a10.toString());
        }
        if (i10 == 17) {
            this.f20511l = this.f20507h.P(this.f20510k);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                StringBuilder a11 = android.support.v4.media.d.a("Expected an int but was ");
                a11.append(z.a(F()));
                a11.append(" at path ");
                a11.append(k());
                throw new v(a11.toString());
            }
        } else {
            if (i10 == 9) {
                hVar = f20502n;
            } else {
                hVar = f20501m;
            }
            String p02 = p0(hVar);
            this.f20511l = p02;
            try {
                int parseInt = Integer.parseInt(p02);
                this.f20508i = 0;
                int[] iArr2 = this.f20630d;
                int i13 = this.f20627a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f20508i = 11;
        try {
            double parseDouble = Double.parseDouble(this.f20511l);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f20511l = null;
                this.f20508i = 0;
                int[] iArr3 = this.f20630d;
                int i15 = this.f20627a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            StringBuilder a12 = android.support.v4.media.d.a("Expected an int but was ");
            a12.append(this.f20511l);
            a12.append(" at path ");
            a12.append(k());
            throw new v(a12.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder a13 = android.support.v4.media.d.a("Expected an int but was ");
            a13.append(this.f20511l);
            a13.append(" at path ");
            a13.append(k());
            throw new v(a13.toString());
        }
    }
}
