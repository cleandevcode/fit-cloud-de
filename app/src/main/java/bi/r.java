package bi;

import androidx.fragment.app.i1;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import jm.c;
import pm.g1;
import sm.k1;
import tm.o;

/* loaded from: classes2.dex */
public class r implements m7.f {

    /* renamed from: a */
    public static Thread f4340a;

    /* renamed from: b */
    public static final int[][] f4341b = {new int[]{536870912, 0}, new int[]{671088640, 0}, new int[]{838860800, 0}, new int[]{1048576000, 0}, new int[]{655360000, 0}, new int[]{819200000, 0}, new int[]{1024000000, 0}, new int[]{640000000, 0}, new int[]{800000000, 0}, new int[]{1000000000, 0}, new int[]{625000000, 0}, new int[]{781250000, 0}, new int[]{976562500, 0}, new int[]{610351562, 1073741824}, new int[]{762939453, 268435456}, new int[]{953674316, 872415232}, new int[]{596046447, 1619001344}, new int[]{745058059, 1486880768}, new int[]{931322574, 1321730048}, new int[]{582076609, 289210368}, new int[]{727595761, 898383872}, new int[]{909494701, 1659850752}, new int[]{568434188, 1305842176}, new int[]{710542735, 1632302720}, new int[]{888178419, 1503507488}, new int[]{555111512, 671256724}, new int[]{693889390, 839070905}, new int[]{867361737, 2122580455}, new int[]{542101086, 521306416}, new int[]{677626357, 1725374844}, new int[]{847032947, 546105819}, new int[]{1058791184, 145761362}, new int[]{661744490, 91100851}, new int[]{827180612, 1187617888}, new int[]{1033975765, 1484522360}, new int[]{646234853, 1196261931}, new int[]{807793566, 2032198326}, new int[]{1009741958, 1466506084}, new int[]{631088724, 379695390}, new int[]{788860905, 474619238}, new int[]{986076131, 1130144959}, new int[]{616297582, 437905143}, new int[]{770371977, 1621123253}, new int[]{962964972, 415791331}, new int[]{601853107, 1333611405}, new int[]{752316384, 1130143345}, new int[]{940395480, 1412679181}};

    /* renamed from: c */
    public static final int[][] f4342c = {new int[]{268435456, 1}, new int[]{214748364, 1717986919}, new int[]{171798691, 1803886265}, new int[]{137438953, 1013612282}, new int[]{219902325, 1192282922}, new int[]{175921860, 953826338}, new int[]{140737488, 763061070}, new int[]{225179981, 791400982}, new int[]{180143985, 203624056}, new int[]{144115188, 162899245}, new int[]{230584300, 1978625710}, new int[]{184467440, 1582900568}, new int[]{147573952, 1266320455}, new int[]{236118324, 308125809}, new int[]{188894659, 675997377}, new int[]{151115727, 970294631}, new int[]{241785163, 1981968139}, new int[]{193428131, 297084323}, new int[]{154742504, 1955654377}, new int[]{247588007, 1840556814}, new int[]{198070406, 613451992}, new int[]{158456325, 61264864}, new int[]{253530120, 98023782}, new int[]{202824096, 78419026}, new int[]{162259276, 1780722139}, new int[]{259614842, 1990161963}, new int[]{207691874, 733136111}, new int[]{166153499, 1016005619}, new int[]{265845599, 337118801}, new int[]{212676479, 699191770}, new int[]{170141183, 988850146}};

    /* renamed from: d */
    public static final um.x f4343d = new um.x("NONE");

    /* renamed from: e */
    public static final um.x f4344e = new um.x("PENDING");

    public static final int A(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        } else if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static byte[] B(int i10) {
        return new byte[]{(byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static String C(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                hexString = a.b.b("0", hexString);
            }
            sb2.append(hexString);
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static final boolean D(pm.e0 e0Var) {
        xl.f E = e0Var.E();
        int i10 = pm.g1.K;
        pm.g1 g1Var = (pm.g1) E.b(g1.b.f24341a);
        if (g1Var != null) {
            return g1Var.a();
        }
        return true;
    }

    public static final int E(c.a aVar, lm.j jVar) {
        if (!jVar.isEmpty()) {
            int i10 = jVar.f20072b;
            if (i10 < Integer.MAX_VALUE) {
                return aVar.d(jVar.f20071a, i10 + 1);
            }
            int i11 = jVar.f20071a;
            if (i11 > Integer.MIN_VALUE) {
                return aVar.d(i11 - 1, i10) + 1;
            }
            return aVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + jVar);
    }

    public static void F(tk.n nVar, AtomicInteger atomicInteger, kl.b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            bVar.f(nVar);
        }
    }

    public static void G(tk.n nVar, Throwable th2, AtomicInteger atomicInteger, kl.b bVar) {
        if (bVar.c(th2) && atomicInteger.getAndIncrement() == 0) {
            bVar.f(nVar);
        }
    }

    public static void H(tk.n nVar, Object obj, AtomicInteger atomicInteger, kl.b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            nVar.b(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                bVar.f(nVar);
            }
        }
    }

    public static final um.f I(pm.e0 e0Var, xl.f fVar) {
        return new um.f(e0Var.E().s(fVar));
    }

    public static final sm.c J(rm.a aVar) {
        return new sm.c(aVar, false);
    }

    public static final sm.s0 K(sm.f fVar, pm.e0 e0Var, sm.b1 b1Var) {
        sm.a1 a10 = ie.b.a(fVar);
        sm.w0 c10 = qi.h.c(1, a10.f27114b, a10.f27115c);
        return new sm.s0(c10, ie.b.e(e0Var, a10.f27116d, a10.f27113a, c10, b1Var, qi.h.f24862a));
    }

    public static final Object L(sm.k0 k0Var, pm.e0 e0Var, xl.d dVar) {
        sm.a1 a10 = ie.b.a(k0Var);
        pm.r a11 = m0.a();
        z0.g(e0Var, a10.f27116d, 0, new sm.i0(a10.f27113a, a11, null), 2);
        return a11.x0(dVar);
    }

    public static final sm.t0 M(sm.f fVar, pm.e0 e0Var, sm.b1 b1Var, Object obj) {
        sm.a1 a10 = ie.b.a(fVar);
        sm.g1 c10 = c(obj);
        return new sm.t0(c10, ie.b.e(e0Var, a10.f27116d, a10.f27113a, c10, b1Var, obj));
    }

    public static int N(float f10, char[] cArr, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        if (Float.isNaN(f10)) {
            int i27 = i10 + 1;
            cArr[i10] = 'N';
            int i28 = i27 + 1;
            cArr[i27] = 'a';
            i26 = i28 + 1;
            cArr[i28] = 'N';
        } else if (f10 == Float.POSITIVE_INFINITY) {
            int i29 = i10 + 1;
            cArr[i10] = 'I';
            int i30 = i29 + 1;
            cArr[i29] = 'n';
            int i31 = i30 + 1;
            cArr[i30] = 'f';
            int i32 = i31 + 1;
            cArr[i31] = 'i';
            int i33 = i32 + 1;
            cArr[i32] = 'n';
            int i34 = i33 + 1;
            cArr[i33] = 'i';
            int i35 = i34 + 1;
            cArr[i34] = 't';
            cArr[i35] = 'y';
            return (i35 + 1) - i10;
        } else if (f10 == Float.NEGATIVE_INFINITY) {
            int i36 = i10 + 1;
            cArr[i10] = '-';
            int i37 = i36 + 1;
            cArr[i36] = 'I';
            int i38 = i37 + 1;
            cArr[i37] = 'n';
            int i39 = i38 + 1;
            cArr[i38] = 'f';
            int i40 = i39 + 1;
            cArr[i39] = 'i';
            int i41 = i40 + 1;
            cArr[i40] = 'n';
            int i42 = i41 + 1;
            cArr[i41] = 'i';
            int i43 = i42 + 1;
            cArr[i42] = 't';
            i26 = i43 + 1;
            cArr[i43] = 'y';
        } else {
            int floatToIntBits = Float.floatToIntBits(f10);
            if (floatToIntBits != 0) {
                if (floatToIntBits == Integer.MIN_VALUE) {
                    int i44 = i10 + 1;
                    cArr[i10] = '-';
                    int i45 = i44 + 1;
                    cArr[i44] = '0';
                    int i46 = i45 + 1;
                    cArr[i45] = '.';
                    cArr[i46] = '0';
                    return (i46 + 1) - i10;
                }
                int i47 = (floatToIntBits >> 23) & 255;
                int i48 = 8388607 & floatToIntBits;
                if (i47 == 0) {
                    i11 = -149;
                } else {
                    i11 = (i47 - 127) - 23;
                    i48 |= 8388608;
                }
                boolean z14 = floatToIntBits < 0;
                boolean z15 = (i48 & 1) == 0;
                int i49 = i48 * 4;
                int i50 = i49 + 2;
                int i51 = i49 - ((((long) i48) != 8388608 || i47 <= 1) ? 2 : 1);
                int i52 = i11 - 2;
                if (i52 >= 0) {
                    i18 = (int) ((i52 * 3010299) / 10000000);
                    if (i18 == 0) {
                        i23 = i52;
                        i24 = 1;
                    } else {
                        i23 = i52;
                        i24 = (int) ((((i18 * 23219280) + 10000000) - 1) / 10000000);
                    }
                    int i53 = (-i23) + i18;
                    int[][] iArr = f4342c;
                    int[] iArr2 = iArr[i18];
                    long j10 = iArr2[0];
                    long j11 = iArr2[1];
                    long j12 = i49;
                    int i54 = (((i24 + 59) - 1) + i53) - 31;
                    z10 = z15;
                    long j13 = i50;
                    i15 = (int) (((j13 * j10) + ((j13 * j11) >> 31)) >> i54);
                    i12 = (int) (((j12 * j10) + ((j12 * j11) >> 31)) >> i54);
                    int i55 = i50;
                    long j14 = i51;
                    int i56 = (int) (((j10 * j14) + ((j14 * j11) >> 31)) >> i54);
                    if (i18 == 0 || (i15 - 1) / 10 > i56 / 10) {
                        i25 = i56;
                        i19 = 0;
                    } else {
                        int i57 = i18 - 1;
                        int i58 = (i53 - 1) + (((i57 == 0 ? 1 : (int) ((((i57 * 23219280) + 10000000) - 1) / 10000000)) + 59) - 1);
                        int[] iArr3 = iArr[i57];
                        i25 = i56;
                        i19 = (int) ((((iArr3[0] * j12) + ((iArr3[1] * j12) >> 31)) >> (i58 - 31)) % 10);
                    }
                    int i59 = 0;
                    while (i55 > 0 && i55 % 5 == 0) {
                        i55 /= 5;
                        i59++;
                    }
                    int i60 = 0;
                    int i61 = i49;
                    while (i61 > 0 && i61 % 5 == 0) {
                        i61 /= 5;
                        i60++;
                    }
                    int i62 = 0;
                    while (i51 > 0 && i51 % 5 == 0) {
                        i51 /= 5;
                        i62++;
                    }
                    z12 = i59 >= i18;
                    z13 = i60 >= i18;
                    z11 = i62 >= i18;
                    i17 = i25;
                    i16 = 0;
                } else {
                    z10 = z15;
                    int i63 = -i52;
                    int i64 = (int) ((i63 * 6989700) / 10000000);
                    int i65 = i63 - i64;
                    int i66 = i65 == 0 ? 1 : (int) ((((i65 * 23219280) + 10000000) - 1) / 10000000);
                    int[][] iArr4 = f4341b;
                    int[] iArr5 = iArr4[i65];
                    long j15 = iArr5[0];
                    long j16 = iArr5[1];
                    int i67 = (i64 - (i66 - 61)) - 31;
                    long j17 = i49;
                    i12 = (int) (((j17 * j15) + ((j17 * j16) >> 31)) >> i67);
                    long j18 = i50;
                    int i68 = (int) (((j18 * j15) + ((j18 * j16) >> 31)) >> i67);
                    long j19 = i51;
                    int i69 = (int) (((j15 * j19) + ((j19 * j16) >> 31)) >> i67);
                    if (i64 == 0 || (i68 - 1) / 10 > i69 / 10) {
                        i13 = 0;
                        i14 = 0;
                    } else {
                        int i70 = i65 + 1;
                        int i71 = (i64 - 1) - ((i70 == 0 ? 1 : (int) ((((i70 * 23219280) + 10000000) - 1) / 10000000)) - 61);
                        int[] iArr6 = iArr4[i70];
                        i14 = 0;
                        i13 = (int) ((((iArr6[0] * j17) + ((iArr6[1] * j17) >> 31)) >> (i71 - 31)) % 10);
                    }
                    int i72 = i52 + i64;
                    boolean z16 = 1 >= i64;
                    boolean z17 = i64 < 23 && (i49 & ((1 << (i64 + (-1))) - 1)) == 0;
                    z11 = (i51 % 2 == 1 ? 0 : 1) >= i64;
                    z12 = z16;
                    int i73 = i13;
                    i15 = i68;
                    z13 = z17;
                    i16 = i14;
                    i17 = i69;
                    i18 = i72;
                    i19 = i73;
                }
                int i74 = 1000000000;
                int i75 = 10;
                while (i75 > 0 && i15 < i74) {
                    i74 /= 10;
                    i75--;
                }
                int i76 = (i18 + i75) - 1;
                boolean z18 = i76 < -3 || i76 >= 7;
                if (z12 && !z10) {
                    i15--;
                }
                int i77 = 0;
                while (true) {
                    int i78 = i15 / 10;
                    int i79 = i17 / 10;
                    if (i78 <= i79 || (i15 < 100 && z18)) {
                        break;
                    }
                    z11 &= i17 % 10 == 0;
                    i19 = i12 % 10;
                    i12 /= 10;
                    i77++;
                    i15 = i78;
                    i17 = i79;
                }
                if (z11 && z10) {
                    while (i17 % 10 == 0 && (i15 >= 100 || !z18)) {
                        i15 /= 10;
                        i19 = i12 % 10;
                        i12 /= 10;
                        i17 /= 10;
                        i77++;
                    }
                }
                int i80 = i12;
                if (z13 && i19 == 5 && i80 % 2 == 0) {
                    i19 = 4;
                }
                int i81 = i80 + (((i80 != i17 || (z11 && z10)) && i19 < 5) ? 0 : 1);
                int i82 = i75 - i77;
                if (z14) {
                    i20 = i10 + 1;
                    cArr[i10] = '-';
                } else {
                    i20 = i10;
                }
                if (z18) {
                    while (i16 < i82 - 1) {
                        int i83 = i81 % 10;
                        i81 /= 10;
                        cArr[(i20 + i82) - i16] = (char) (i83 + 48);
                        i16++;
                    }
                    cArr[i20] = (char) ((i81 % 10) + 48);
                    cArr[i20 + 1] = '.';
                    int i84 = i82 + 1 + i20;
                    if (i82 == 1) {
                        cArr[i84] = '0';
                        i84++;
                    }
                    int i85 = i84 + 1;
                    cArr[i84] = 'E';
                    if (i76 < 0) {
                        cArr[i85] = '-';
                        i76 = -i76;
                        i85++;
                    }
                    if (i76 >= 10) {
                        i22 = 48;
                        cArr[i85] = (char) ((i76 / 10) + 48);
                        i85++;
                    } else {
                        i22 = 48;
                    }
                    i21 = i85 + 1;
                    cArr[i85] = (char) ((i76 % 10) + i22);
                } else if (i76 < 0) {
                    int i86 = i20 + 1;
                    cArr[i20] = '0';
                    int i87 = i86 + 1;
                    cArr[i86] = '.';
                    int i88 = -1;
                    while (i88 > i76) {
                        cArr[i87] = '0';
                        i88--;
                        i87++;
                    }
                    i21 = i87;
                    while (i16 < i82) {
                        cArr[((i87 + i82) - i16) - 1] = (char) ((i81 % 10) + 48);
                        i81 /= 10;
                        i21++;
                        i16++;
                    }
                } else {
                    int i89 = i76 + 1;
                    if (i89 >= i82) {
                        while (i16 < i82) {
                            cArr[((i20 + i82) - i16) - 1] = (char) ((i81 % 10) + 48);
                            i81 /= 10;
                            i16++;
                        }
                        int i90 = i20 + i82;
                        while (i82 < i89) {
                            cArr[i90] = '0';
                            i82++;
                            i90++;
                        }
                        int i91 = i90 + 1;
                        cArr[i90] = '.';
                        cArr[i91] = '0';
                        i21 = i91 + 1;
                    } else {
                        int i92 = i20 + 1;
                        while (i16 < i82) {
                            if ((i82 - i16) - 1 == i76) {
                                cArr[((i92 + i82) - i16) - 1] = '.';
                                i92--;
                            }
                            cArr[((i92 + i82) - i16) - 1] = (char) ((i81 % 10) + 48);
                            i81 /= 10;
                            i16++;
                        }
                        i21 = i82 + 1 + i20;
                    }
                }
                return i21 - i10;
            }
            int i93 = i10 + 1;
            cArr[i10] = '0';
            int i94 = i93 + 1;
            cArr[i93] = '.';
            i26 = i94 + 1;
            cArr[i94] = '0';
        }
        return i26 - i10;
    }

    public static final tm.j O(sm.f fVar, fm.q qVar) {
        int i10 = sm.a0.f27112a;
        return new tm.j(qVar, fVar, xl.g.f30632a, -2, rm.f.SUSPEND);
    }

    public static final Object P(xl.f fVar, Object obj, Object obj2, fm.p pVar, xl.d dVar) {
        Object c10 = um.z.c(fVar, obj2);
        try {
            tm.v vVar = new tm.v(dVar, fVar);
            gm.e0.c(2, pVar);
            Object A = pVar.A(obj, vVar);
            um.z.a(fVar, c10);
            if (A == yl.a.COROUTINE_SUSPENDED) {
                gm.l.f(dVar, "frame");
            }
            return A;
        } catch (Throwable th2) {
            um.z.a(fVar, c10);
            throw th2;
        }
    }

    public static final um.f b(xl.f fVar) {
        if (fVar.b(g1.b.f24341a) == null) {
            fVar = fVar.s(m0.b());
        }
        return new um.f(fVar);
    }

    public static final sm.g1 c(Object obj) {
        if (obj == null) {
            obj = h7.a.f15889a;
        }
        return new sm.g1(obj);
    }

    public static final void d(cn.a aVar, cn.c cVar, String str) {
        cn.d.f4969j.getClass();
        Logger logger = cn.d.f4968i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f4966f);
        sb2.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        gm.l.e(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.f4958c);
        logger.fine(sb2.toString());
    }

    public static final void e(StringBuilder sb2, Object obj, fm.l lVar) {
        CharSequence valueOf;
        if (lVar != null) {
            obj = lVar.k(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                    return;
                }
                valueOf = String.valueOf(obj);
                sb2.append(valueOf);
            }
        }
        valueOf = (CharSequence) obj;
        sb2.append(valueOf);
    }

    public static final sm.t0 f(sm.g1 g1Var) {
        return new sm.t0(g1Var, null);
    }

    public static sm.f g(sm.f fVar, int i10) {
        boolean z10;
        int i11;
        rm.f fVar2;
        rm.f fVar3 = rm.f.SUSPEND;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 == -1) {
                fVar2 = rm.f.DROP_OLDEST;
                i11 = 0;
            } else {
                i11 = i10;
                fVar2 = fVar3;
            }
            if (fVar instanceof tm.o) {
                return o.a.a((tm.o) fVar, null, i11, fVar2, 1);
            }
            return new tm.i(fVar, null, i11, fVar2, 2);
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10).toString());
    }

    public static String h(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                hexString = a.b.b("0", hexString);
            }
            sb2.append(hexString);
            sb2.append(" ");
        }
        return sb2.toString().toUpperCase().trim();
    }

    public static int i(byte[] bArr, int i10, int i11) {
        if (i11 < 0 || i11 > 4) {
            throw new IllegalArgumentException();
        }
        int i12 = (i10 + i11) - 1;
        int i13 = bArr[i12] & 255;
        for (int i14 = 1; i14 < i11; i14++) {
            i13 |= (bArr[i12 - i14] & 255) << (i14 * 8);
        }
        return i13;
    }

    public static long j(byte[] bArr, int i10, int i11) {
        if (i11 < 0 || i11 > 8) {
            throw new IllegalArgumentException();
        }
        int i12 = (i10 + i11) - 1;
        long j10 = bArr[i12] & 255;
        for (int i13 = 1; i13 < i11; i13++) {
            j10 |= (bArr[i12 - i13] & 255) << (i13 * 8);
        }
        return j10;
    }

    public static short k(byte[] bArr, int i10) {
        int i11 = (i10 + 2) - 1;
        short s10 = (short) (bArr[i11] & 255);
        for (int i12 = 1; i12 < 2; i12++) {
            s10 = (short) (s10 | ((bArr[i11 - i12] & 255) << (i12 * 8)));
        }
        return s10;
    }

    public static final sm.b l(fm.p pVar) {
        return new sm.b(pVar, xl.g.f30632a, -2, rm.f.SUSPEND);
    }

    public static void m(pm.e0 e0Var) {
        pm.g1 g1Var = (pm.g1) e0Var.E().b(g1.b.f24341a);
        if (g1Var != null) {
            g1Var.h(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e0Var).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable n(xl.d r4, sm.f r5, sm.g r6) {
        /*
            boolean r0 = r4 instanceof sm.r
            if (r0 == 0) goto L13
            r0 = r4
            sm.r r0 = (sm.r) r0
            int r1 = r0.f27291f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27291f = r1
            goto L18
        L13:
            sm.r r0 = new sm.r
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f27290e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27291f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            gm.a0 r5 = r0.f27289d
            mf.a0.k(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            mf.a0.k(r4)
            gm.a0 r4 = new gm.a0
            r4.<init>()
            sm.s r2 = new sm.s     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f27289d = r4     // Catch: java.lang.Throwable -> L4e
            r0.f27291f = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.a(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L8c
        L4c:
            r1 = 0
            goto L8c
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            T r4 = r5.f15485a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L60
            boolean r6 = gm.l.a(r4, r1)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            if (r6 != 0) goto L99
            xl.f r6 = r0.f32509b
            gm.l.c(r6)
            pm.g1$b r0 = pm.g1.b.f24341a
            xl.f$b r6 = r6.b(r0)
            pm.g1 r6 = (pm.g1) r6
            if (r6 == 0) goto L88
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L79
            goto L88
        L79:
            java.util.concurrent.CancellationException r6 = r6.v()
            if (r6 == 0) goto L86
            boolean r6 = gm.l.a(r6, r1)
            if (r6 == 0) goto L86
            goto L87
        L86:
            r3 = 0
        L87:
            r5 = r3
        L88:
            if (r5 != 0) goto L99
            if (r4 != 0) goto L8d
        L8c:
            return r1
        L8d:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L95
            ih.v.b(r4, r1)
            throw r4
        L95:
            ih.v.b(r1, r4)
            throw r1
        L99:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.r.n(xl.d, sm.f, sm.g):java.io.Serializable");
    }

    public static final Object o(sm.f fVar, fm.p pVar, xl.d dVar) {
        int i10 = sm.a0.f27112a;
        Object a10 = g(O(fVar, new sm.z(pVar, null)), 0).a(tm.q.f28361a, dVar);
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (a10 != aVar) {
            a10 = tl.l.f28297a;
        }
        if (a10 != aVar) {
            return tl.l.f28297a;
        }
        return a10;
    }

    public static final sm.m0 p(sm.f fVar, sm.f fVar2, sm.f fVar3, fm.r rVar) {
        return new sm.m0(new sm.f[]{fVar, fVar2, fVar3}, rVar);
    }

    public static final int q(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final sm.c r(rm.g gVar) {
        return new sm.c(gVar, true);
    }

    public static final Object s(fm.p pVar, xl.d dVar) {
        um.v vVar = new um.v(dVar, dVar.e());
        return gm.f.d(vVar, vVar, pVar);
    }

    public static final sm.f t(sm.f fVar) {
        if (!(fVar instanceof sm.f1)) {
            sm.k kVar = sm.k.f27233b;
            Object obj = sm.l.f27244b;
            if (fVar instanceof sm.e) {
                sm.e eVar = (sm.e) fVar;
                if (eVar.f27149b == obj && eVar.f27150c == kVar) {
                    return fVar;
                }
            }
            return new sm.e(fVar, kVar);
        }
        return fVar;
    }

    public static final sm.t u(sm.f fVar, int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new sm.t(fVar, i10);
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Drop count should be non-negative, but had ", i10).toString());
    }

    public static final Object v(xl.d dVar, sm.f fVar, sm.g gVar) {
        if (!(gVar instanceof k1)) {
            Object a10 = fVar.a(gVar, dVar);
            if (a10 != yl.a.COROUTINE_SUSPENDED) {
                return tl.l.f28297a;
            }
            return a10;
        }
        throw ((k1) gVar).f27243a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006c  */
    /* JADX WARN: Type inference failed for: r2v1, types: [um.x, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(sm.f r4, xl.d r5) {
        /*
            boolean r0 = r5 instanceof sm.d0
            if (r0 == 0) goto L13
            r0 = r5
            sm.d0 r0 = (sm.d0) r0
            int r1 = r0.f27139g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27139g = r1
            goto L18
        L13:
            sm.d0 r0 = new sm.d0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27138f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27139g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            sm.b0 r4 = r0.f27137e
            gm.a0 r0 = r0.f27136d
            mf.a0.k(r5)     // Catch: tm.a -> L2b
            goto L5d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            mf.a0.k(r5)
            gm.a0 r5 = new gm.a0
            r5.<init>()
            um.x r2 = h7.a.f15889a
            r5.f15485a = r2
            sm.b0 r2 = new sm.b0
            r2.<init>(r5)
            r0.f27136d = r5     // Catch: tm.a -> L55
            r0.f27137e = r2     // Catch: tm.a -> L55
            r0.f27139g = r3     // Catch: tm.a -> L55
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: tm.a -> L55
            if (r4 != r1) goto L53
            goto L63
        L53:
            r0 = r5
            goto L5d
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            sm.g<?> r1 = r5.f28300a
            if (r1 != r4) goto L6c
        L5d:
            T r1 = r0.f15485a
            um.x r4 = h7.a.f15889a
            if (r1 == r4) goto L64
        L63:
            return r1
        L64:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.r.w(sm.f, xl.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0058, code lost:
        if (r5.a(r2, r0) == r1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082  */
    /* JADX WARN: Type inference failed for: r0v7, types: [fm.p] */
    /* JADX WARN: Type inference failed for: r2v1, types: [um.x, T] */
    /* JADX WARN: Type inference failed for: r5v0, types: [sm.f, sm.f1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(sm.f1 r5, sm.h0.a r6, xl.d r7) {
        /*
            boolean r0 = r7 instanceof sm.e0
            if (r0 == 0) goto L13
            r0 = r7
            sm.e0 r0 = (sm.e0) r0
            int r1 = r0.f27161h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27161h = r1
            goto L18
        L13:
            sm.e0 r0 = new sm.e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27160g
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27161h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            sm.c0 r5 = r0.f27159f
            gm.a0 r6 = r0.f27158e
            fm.p r0 = r0.f27157d
            mf.a0.k(r7)     // Catch: tm.a -> L2d
            goto L64
        L2d:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L5e
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            mf.a0.k(r7)
            gm.a0 r7 = new gm.a0
            r7.<init>()
            um.x r2 = h7.a.f15889a
            r7.f15485a = r2
            sm.c0 r2 = new sm.c0
            r2.<init>(r6, r7)
            r0.f27157d = r6     // Catch: tm.a -> L5b
            r0.f27158e = r7     // Catch: tm.a -> L5b
            r0.f27159f = r2     // Catch: tm.a -> L5b
            r0.f27161h = r3     // Catch: tm.a -> L5b
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: tm.a -> L5b
            if (r5 != r1) goto L62
            goto L6a
        L5b:
            r5 = move-exception
            r0 = r5
            r5 = r2
        L5e:
            sm.g<?> r1 = r0.f28300a
            if (r1 != r5) goto L82
        L62:
            r0 = r6
            r6 = r7
        L64:
            T r1 = r6.f15485a
            um.x r5 = h7.a.f15889a
            if (r1 == r5) goto L6b
        L6a:
            return r1
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.r.x(sm.f1, sm.h0$a, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(sm.f r4, xl.d r5) {
        /*
            boolean r0 = r5 instanceof sm.g0
            if (r0 == 0) goto L13
            r0 = r5
            sm.g0 r0 = (sm.g0) r0
            int r1 = r0.f27173g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27173g = r1
            goto L18
        L13:
            sm.g0 r0 = new sm.g0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27172f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27173g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            sm.f0 r4 = r0.f27171e
            gm.a0 r0 = r0.f27170d
            mf.a0.k(r5)     // Catch: tm.a -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            mf.a0.k(r5)
            gm.a0 r5 = new gm.a0
            r5.<init>()
            sm.f0 r2 = new sm.f0
            r2.<init>(r5)
            r0.f27170d = r5     // Catch: tm.a -> L51
            r0.f27171e = r2     // Catch: tm.a -> L51
            r0.f27173g = r3     // Catch: tm.a -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: tm.a -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r0 = r5
            goto L59
        L51:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L55:
            sm.g<?> r1 = r5.f28300a
            if (r1 != r4) goto L5c
        L59:
            T r1 = r0.f15485a
        L5b:
            return r1
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.r.y(sm.f, xl.d):java.lang.Object");
    }

    public static final String z(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 <= -999500000) {
            sb2 = new StringBuilder();
            j11 = j10 - 500000000;
        } else {
            if (j10 <= -999500) {
                sb2 = new StringBuilder();
                j12 = j10 - 500000;
            } else {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - 500;
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + 500;
                } else {
                    int i10 = (j10 > 999500000 ? 1 : (j10 == 999500000 ? 0 : -1));
                    sb2 = new StringBuilder();
                    if (i10 < 0) {
                        j12 = j10 + 500000;
                    } else {
                        j11 = j10 + 500000000;
                    }
                }
                sb2.append(j13 / 1000);
                sb2.append(" µs");
                return i1.d(new Object[]{sb2.toString()}, 1, "%6s", "java.lang.String.format(format, *args)");
            }
            sb2.append(j12 / 1000000);
            sb2.append(" ms");
            return i1.d(new Object[]{sb2.toString()}, 1, "%6s", "java.lang.String.format(format, *args)");
        }
        sb2.append(j11 / 1000000000);
        sb2.append(" s ");
        return i1.d(new Object[]{sb2.toString()}, 1, "%6s", "java.lang.String.format(format, *args)");
    }

    @Override // m7.f
    public String a(int i10, int i11) {
        Locale locale = m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i11)}, 1, locale, "%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }
}
