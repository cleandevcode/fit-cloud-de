package w1;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import no.nordicsemi.android.dfu.DfuBaseService;
import sun.misc.Unsafe;
import w1.g;
import w1.i0;
import w1.k;
import w1.y;

/* loaded from: classes.dex */
public final class s0<T> implements d1<T> {

    /* renamed from: r */
    public static final int[] f29684r = new int[0];

    /* renamed from: s */
    public static final Unsafe f29685s = n1.o();

    /* renamed from: a */
    public final int[] f29686a;

    /* renamed from: b */
    public final Object[] f29687b;

    /* renamed from: c */
    public final int f29688c;

    /* renamed from: d */
    public final int f29689d;

    /* renamed from: e */
    public final p0 f29690e;

    /* renamed from: f */
    public final boolean f29691f;

    /* renamed from: g */
    public final boolean f29692g;

    /* renamed from: h */
    public final boolean f29693h;

    /* renamed from: i */
    public final boolean f29694i;

    /* renamed from: j */
    public final int[] f29695j;

    /* renamed from: k */
    public final int f29696k;

    /* renamed from: l */
    public final int f29697l;

    /* renamed from: m */
    public final u0 f29698m;

    /* renamed from: n */
    public final f0 f29699n;

    /* renamed from: o */
    public final j1<?, ?> f29700o;

    /* renamed from: p */
    public final p<?> f29701p;

    /* renamed from: q */
    public final k0 f29702q;

    public s0(int[] iArr, Object[] objArr, int i10, int i11, p0 p0Var, boolean z10, int[] iArr2, int i12, int i13, u0 u0Var, f0 f0Var, j1 j1Var, p pVar, k0 k0Var) {
        this.f29686a = iArr;
        this.f29687b = objArr;
        this.f29688c = i10;
        this.f29689d = i11;
        this.f29692g = p0Var instanceof w;
        this.f29693h = z10;
        this.f29691f = pVar != null && pVar.e(p0Var);
        this.f29694i = false;
        this.f29695j = iArr2;
        this.f29696k = i12;
        this.f29697l = i13;
        this.f29698m = u0Var;
        this.f29699n = f0Var;
        this.f29700o = j1Var;
        this.f29701p = pVar;
        this.f29690e = p0Var;
        this.f29702q = k0Var;
    }

    public static Field C(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder a10 = androidx.activity.result.d.a("Field ", str, " for ");
            a10.append(cls.getName());
            a10.append(" not found. Known fields are ");
            a10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(a10.toString());
        }
    }

    public static void I(int i10, Object obj, l lVar) {
        if (obj instanceof String) {
            lVar.f29637a.y0(i10, (String) obj);
            return;
        }
        lVar.b(i10, (g) obj);
    }

    public static List s(long j10, Object obj) {
        return (List) n1.n(j10, obj);
    }

    public static <T> s0<T> u(b1 b1Var, u0 u0Var, f0 f0Var, j1<?, ?> j1Var, p<?> pVar, k0 k0Var) {
        int i10;
        int charAt;
        int charAt2;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char charAt3;
        int i17;
        char charAt4;
        int i18;
        char charAt5;
        int i19;
        char charAt6;
        int i20;
        char charAt7;
        int i21;
        char charAt8;
        int i22;
        char charAt9;
        int i23;
        char charAt10;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z10;
        int i28;
        int i29;
        int i30;
        String str;
        int i31;
        Class<?> cls;
        int i32;
        int i33;
        int i34;
        int i35;
        Field C;
        int i36;
        char charAt11;
        int i37;
        int i38;
        Field C2;
        Field C3;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        int i42;
        char charAt15;
        char charAt16;
        int i43 = 0;
        boolean z11 = b1Var.c() == 2;
        String e10 = b1Var.e();
        int length = e10.length();
        int charAt17 = e10.charAt(0);
        if (charAt17 >= 55296) {
            int i44 = charAt17 & 8191;
            int i45 = 1;
            int i46 = 13;
            while (true) {
                i10 = i45 + 1;
                charAt16 = e10.charAt(i45);
                if (charAt16 < 55296) {
                    break;
                }
                i44 |= (charAt16 & 8191) << i46;
                i46 += 13;
                i45 = i10;
            }
            charAt17 = i44 | (charAt16 << i46);
        } else {
            i10 = 1;
        }
        int i47 = i10 + 1;
        int charAt18 = e10.charAt(i10);
        if (charAt18 >= 55296) {
            int i48 = charAt18 & 8191;
            int i49 = 13;
            while (true) {
                i42 = i47 + 1;
                charAt15 = e10.charAt(i47);
                if (charAt15 < 55296) {
                    break;
                }
                i48 |= (charAt15 & 8191) << i49;
                i49 += 13;
                i47 = i42;
            }
            charAt18 = i48 | (charAt15 << i49);
            i47 = i42;
        }
        if (charAt18 == 0) {
            iArr = f29684r;
            i15 = 0;
            i13 = 0;
            charAt = 0;
            i14 = 0;
            charAt2 = 0;
            i12 = 0;
        } else {
            int i50 = i47 + 1;
            int charAt19 = e10.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i23 = i50 + 1;
                    charAt10 = e10.charAt(i50);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i51 |= (charAt10 & 8191) << i52;
                    i52 += 13;
                    i50 = i23;
                }
                charAt19 = i51 | (charAt10 << i52);
                i50 = i23;
            }
            int i53 = i50 + 1;
            int charAt20 = e10.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i22 = i53 + 1;
                    charAt9 = e10.charAt(i53);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i54 |= (charAt9 & 8191) << i55;
                    i55 += 13;
                    i53 = i22;
                }
                charAt20 = i54 | (charAt9 << i55);
                i53 = i22;
            }
            int i56 = i53 + 1;
            int charAt21 = e10.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i21 = i56 + 1;
                    charAt8 = e10.charAt(i56);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i57 |= (charAt8 & 8191) << i58;
                    i58 += 13;
                    i56 = i21;
                }
                charAt21 = i57 | (charAt8 << i58);
                i56 = i21;
            }
            int i59 = i56 + 1;
            charAt = e10.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i20 = i59 + 1;
                    charAt7 = e10.charAt(i59);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i60 |= (charAt7 & 8191) << i61;
                    i61 += 13;
                    i59 = i20;
                }
                charAt = i60 | (charAt7 << i61);
                i59 = i20;
            }
            int i62 = i59 + 1;
            int charAt22 = e10.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i19 = i62 + 1;
                    charAt6 = e10.charAt(i62);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i63 |= (charAt6 & 8191) << i64;
                    i64 += 13;
                    i62 = i19;
                }
                charAt22 = i63 | (charAt6 << i64);
                i62 = i19;
            }
            int i65 = i62 + 1;
            charAt2 = e10.charAt(i62);
            if (charAt2 >= 55296) {
                int i66 = charAt2 & 8191;
                int i67 = 13;
                while (true) {
                    i18 = i65 + 1;
                    charAt5 = e10.charAt(i65);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i66 |= (charAt5 & 8191) << i67;
                    i67 += 13;
                    i65 = i18;
                }
                charAt2 = i66 | (charAt5 << i67);
                i65 = i18;
            }
            int i68 = i65 + 1;
            int charAt23 = e10.charAt(i65);
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i17 = i70 + 1;
                    charAt4 = e10.charAt(i70);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i69 |= (charAt4 & 8191) << i71;
                    i71 += 13;
                    i70 = i17;
                }
                charAt23 = i69 | (charAt4 << i71);
                i11 = i17;
            } else {
                i11 = i68;
            }
            int i72 = i11 + 1;
            int charAt24 = e10.charAt(i11);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i16 = i74 + 1;
                    charAt3 = e10.charAt(i74);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i73 |= (charAt3 & 8191) << i75;
                    i75 += 13;
                    i74 = i16;
                }
                charAt24 = i73 | (charAt3 << i75);
                i72 = i16;
            }
            i12 = (charAt19 * 2) + charAt20;
            i13 = charAt22;
            i14 = charAt24;
            i43 = charAt19;
            i47 = i72;
            int i76 = charAt21;
            iArr = new int[charAt24 + charAt2 + charAt23];
            i15 = i76;
        }
        Unsafe unsafe = f29685s;
        Object[] d10 = b1Var.d();
        Class<?> cls2 = b1Var.b().getClass();
        int i77 = i47;
        int[] iArr2 = new int[i13 * 3];
        Object[] objArr = new Object[i13 * 2];
        int i78 = charAt2 + i14;
        int i79 = i14;
        int i80 = i78;
        int i81 = 0;
        int i82 = 0;
        int i83 = i12;
        int i84 = i77;
        while (i84 < length) {
            int i85 = i84 + 1;
            int charAt25 = e10.charAt(i84);
            if (charAt25 >= 55296) {
                int i86 = charAt25 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i41 = i87 + 1;
                    charAt14 = e10.charAt(i87);
                    i24 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i86 |= (charAt14 & 8191) << i88;
                    i88 += 13;
                    i87 = i41;
                    length = i24;
                }
                charAt25 = i86 | (charAt14 << i88);
                i25 = i41;
            } else {
                i24 = length;
                i25 = i85;
            }
            int i89 = i25 + 1;
            int charAt26 = e10.charAt(i25);
            if (charAt26 >= 55296) {
                int i90 = charAt26 & 8191;
                int i91 = i89;
                int i92 = 13;
                while (true) {
                    i40 = i91 + 1;
                    charAt13 = e10.charAt(i91);
                    i26 = i78;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i90 |= (charAt13 & 8191) << i92;
                    i92 += 13;
                    i91 = i40;
                    i78 = i26;
                }
                charAt26 = i90 | (charAt13 << i92);
                i27 = i40;
            } else {
                i26 = i78;
                i27 = i89;
            }
            int i93 = charAt26 & 255;
            int i94 = i14;
            if ((charAt26 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                iArr[i82] = i81;
                i82++;
            }
            if (i93 >= 51) {
                int i95 = i27 + 1;
                int charAt27 = e10.charAt(i27);
                if (charAt27 >= 55296) {
                    int i96 = charAt27 & 8191;
                    int i97 = i95;
                    int i98 = 13;
                    while (true) {
                        i39 = i97 + 1;
                        charAt12 = e10.charAt(i97);
                        z10 = z11;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i96 |= (charAt12 & 8191) << i98;
                        i98 += 13;
                        i97 = i39;
                        z11 = z10;
                    }
                    charAt27 = i96 | (charAt12 << i98);
                    i38 = i39;
                } else {
                    z10 = z11;
                    i38 = i95;
                }
                int i99 = i93 - 51;
                int i100 = i38;
                if (i99 == 9 || i99 == 17) {
                    objArr[((i81 / 3) * 2) + 1] = d10[i83];
                    i83++;
                } else if (i99 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i81 / 3) * 2) + 1] = d10[i83];
                    i83++;
                }
                int i101 = charAt27 * 2;
                Object obj = d10[i101];
                if (obj instanceof Field) {
                    C2 = (Field) obj;
                } else {
                    C2 = C((String) obj, cls2);
                    d10[i101] = C2;
                }
                i28 = charAt;
                i35 = (int) unsafe.objectFieldOffset(C2);
                int i102 = i101 + 1;
                Object obj2 = d10[i102];
                if (obj2 instanceof Field) {
                    C3 = (Field) obj2;
                } else {
                    C3 = C((String) obj2, cls2);
                    d10[i102] = C3;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(C3);
                str = e10;
                i31 = charAt17;
                cls = cls2;
                i32 = i100;
                i34 = objectFieldOffset;
                i29 = i15;
                i33 = 0;
            } else {
                z10 = z11;
                i28 = charAt;
                int i103 = i83 + 1;
                Field C4 = C((String) d10[i83], cls2);
                if (i93 == 9 || i93 == 17) {
                    i29 = i15;
                    i30 = 1;
                    objArr[((i81 / 3) * 2) + 1] = C4.getType();
                } else {
                    if (i93 == 27 || i93 == 49) {
                        i29 = i15;
                        i30 = 1;
                        i37 = i103 + 1;
                        objArr[((i81 / 3) * 2) + 1] = d10[i103];
                    } else if (i93 == 12 || i93 == 30 || i93 == 44) {
                        i29 = i15;
                        i30 = 1;
                        if ((charAt17 & 1) == 1) {
                            i37 = i103 + 1;
                            objArr[((i81 / 3) * 2) + 1] = d10[i103];
                        }
                    } else {
                        if (i93 == 50) {
                            int i104 = i79 + 1;
                            iArr[i79] = i81;
                            int i105 = (i81 / 3) * 2;
                            int i106 = i103 + 1;
                            objArr[i105] = d10[i103];
                            if ((charAt26 & 2048) != 0) {
                                i103 = i106 + 1;
                                objArr[i105 + 1] = d10[i106];
                                i29 = i15;
                                i79 = i104;
                                i30 = 1;
                            } else {
                                i79 = i104;
                                i103 = i106;
                            }
                        }
                        i29 = i15;
                        i30 = 1;
                    }
                    i103 = i37;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(C4);
                if ((charAt17 & 1) != i30 || i93 > 17) {
                    str = e10;
                    i31 = charAt17;
                    cls = cls2;
                    i32 = i27;
                    i33 = 0;
                    i34 = 0;
                } else {
                    i32 = i27 + 1;
                    int charAt28 = e10.charAt(i27);
                    if (charAt28 >= 55296) {
                        int i107 = charAt28 & 8191;
                        int i108 = 13;
                        while (true) {
                            i36 = i32 + 1;
                            charAt11 = e10.charAt(i32);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i107 |= (charAt11 & 8191) << i108;
                            i108 += 13;
                            i32 = i36;
                        }
                        charAt28 = i107 | (charAt11 << i108);
                        i32 = i36;
                    }
                    int i109 = (charAt28 / 32) + (i43 * 2);
                    Object obj3 = d10[i109];
                    str = e10;
                    if (obj3 instanceof Field) {
                        C = (Field) obj3;
                    } else {
                        C = C((String) obj3, cls2);
                        d10[i109] = C;
                    }
                    i31 = charAt17;
                    cls = cls2;
                    i34 = (int) unsafe.objectFieldOffset(C);
                    i33 = charAt28 % 32;
                }
                if (i93 >= 18 && i93 <= 49) {
                    iArr[i80] = objectFieldOffset2;
                    i80++;
                }
                i83 = i103;
                i35 = objectFieldOffset2;
            }
            int i110 = i81 + 1;
            iArr2[i81] = charAt25;
            int i111 = i110 + 1;
            iArr2[i110] = ((charAt26 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? 268435456 : 0) | ((charAt26 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? 536870912 : 0) | (i93 << 20) | i35;
            i81 = i111 + 1;
            iArr2[i111] = (i33 << 20) | i34;
            charAt17 = i31;
            i84 = i32;
            i14 = i94;
            i15 = i29;
            length = i24;
            i78 = i26;
            cls2 = cls;
            e10 = str;
            charAt = i28;
            z11 = z10;
        }
        return new s0<>(iArr2, objArr, i15, charAt, b1Var.b(), z11, iArr, i14, i78, u0Var, f0Var, j1Var, pVar, k0Var);
    }

    public static int v(long j10, Object obj) {
        return ((Integer) n1.n(j10, obj)).intValue();
    }

    public static long w(long j10, Object obj) {
        return ((Long) n1.n(j10, obj)).longValue();
    }

    public final void A(Object obj, int i10, c1 c1Var) {
        long j10;
        Object E;
        if ((536870912 & i10) != 0) {
            j10 = i10 & 1048575;
            E = c1Var.M();
        } else {
            int i11 = i10 & 1048575;
            if (this.f29692g) {
                j10 = i11;
                E = c1Var.A();
            } else {
                j10 = i11;
                E = c1Var.E();
            }
        }
        n1.u(j10, obj, E);
    }

    public final void B(Object obj, int i10, c1 c1Var) {
        if ((536870912 & i10) != 0) {
            c1Var.D(this.f29699n.c(i10 & 1048575, obj));
        } else {
            c1Var.C(this.f29699n.c(i10 & 1048575, obj));
        }
    }

    public final void D(int i10, Object obj) {
        if (this.f29693h) {
            return;
        }
        int i11 = this.f29686a[i10 + 2];
        long j10 = i11 & 1048575;
        n1.s(obj, n1.l(j10, obj) | (1 << (i11 >>> 20)), j10);
    }

    public final void E(int i10, int i11, Object obj) {
        n1.s(obj, i10, this.f29686a[i11 + 2] & 1048575);
    }

    public final int F(int i10) {
        return this.f29686a[i10 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x04a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.Object r19, w1.l r20) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.G(java.lang.Object, w1.l):void");
    }

    public final void H(l lVar, int i10, Object obj, int i11) {
        if (obj != null) {
            i0.a<?, ?> d10 = this.f29702q.d(m(i11));
            j0 h10 = this.f29702q.h(obj);
            lVar.f29637a.getClass();
            for (Map.Entry entry : h10.entrySet()) {
                lVar.f29637a.A0(i10, 2);
                lVar.f29637a.C0(i0.a(d10, entry.getKey(), entry.getValue()));
                i0.b(lVar.f29637a, d10, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // w1.d1
    public final void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f29686a.length; i10 += 3) {
            int F = F(i10);
            long j10 = F & 1048575;
            int i11 = this.f29686a[i10];
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (q(i10, t11)) {
                        n1.f29649d.m(t10, j10, n1.j(j10, t11));
                        D(i10, t10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i10, t11)) {
                        n1.f29649d.n(t10, j10, n1.k(j10, t11));
                        D(i10, t10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.t(t10, j10, n1.m(j10, t11));
                    D(i10, t10);
                    break;
                case 3:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.t(t10, j10, n1.m(j10, t11));
                    D(i10, t10);
                    break;
                case 4:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 5:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.t(t10, j10, n1.m(j10, t11));
                    D(i10, t10);
                    break;
                case 6:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 7:
                    if (q(i10, t11)) {
                        n1.f29649d.k(t10, j10, n1.f(j10, t11));
                        D(i10, t10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.u(j10, t10, n1.n(j10, t11));
                    D(i10, t10);
                    break;
                case 9:
                case 17:
                    long F2 = F(i10) & 1048575;
                    if (q(i10, t11)) {
                        Object n10 = n1.n(F2, t10);
                        Object n11 = n1.n(F2, t11);
                        if (n10 != null && n11 != null) {
                            n11 = y.c(n10, n11);
                        } else if (n11 == null) {
                            break;
                        }
                        n1.u(F2, t10, n11);
                        D(i10, t10);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.u(j10, t10, n1.n(j10, t11));
                    D(i10, t10);
                    break;
                case 11:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 12:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 13:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 14:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.t(t10, j10, n1.m(j10, t11));
                    D(i10, t10);
                    break;
                case 15:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.s(t10, n1.l(j10, t11), j10);
                    D(i10, t10);
                    break;
                case 16:
                    if (!q(i10, t11)) {
                        break;
                    }
                    n1.t(t10, j10, n1.m(j10, t11));
                    D(i10, t10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f29699n.b(j10, t10, t11);
                    break;
                case 50:
                    k0 k0Var = this.f29702q;
                    Class<?> cls = e1.f29553a;
                    n1.u(j10, t10, k0Var.a(n1.n(j10, t10), n1.n(j10, t11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!r(i11, i10, t11)) {
                        break;
                    }
                    n1.u(j10, t10, n1.n(j10, t11));
                    E(i11, i10, t10);
                    break;
                case 60:
                case 68:
                    int F3 = F(i10);
                    int i12 = this.f29686a[i10];
                    long j11 = F3 & 1048575;
                    if (r(i12, i10, t11)) {
                        Object n12 = n1.n(j11, t10);
                        Object n13 = n1.n(j11, t11);
                        if (n12 != null && n13 != null) {
                            n13 = y.c(n12, n13);
                        } else if (n13 == null) {
                            break;
                        }
                        n1.u(j11, t10, n13);
                        E(i12, i10, t10);
                        break;
                    } else {
                        break;
                    }
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!r(i11, i10, t11)) {
                        break;
                    }
                    n1.u(j10, t10, n1.n(j10, t11));
                    E(i11, i10, t10);
                    break;
            }
        }
        if (!this.f29693h) {
            j1<?, ?> j1Var = this.f29700o;
            Class<?> cls2 = e1.f29553a;
            j1Var.o(t10, j1Var.k(j1Var.g(t10), j1Var.g(t11)));
            if (this.f29691f) {
                e1.A(this.f29701p, t10, t11);
            }
        }
    }

    @Override // w1.d1
    public final T b() {
        return (T) this.f29698m.a(this.f29690e);
    }

    @Override // w1.d1
    public final void c(T t10) {
        int i10;
        int i11 = this.f29696k;
        while (true) {
            i10 = this.f29697l;
            if (i11 >= i10) {
                break;
            }
            long F = F(this.f29695j[i11]) & 1048575;
            Object n10 = n1.n(F, t10);
            if (n10 != null) {
                n1.u(F, t10, this.f29702q.c(n10));
            }
            i11++;
        }
        int length = this.f29695j.length;
        while (i10 < length) {
            this.f29699n.a(this.f29695j[i10], t10);
            i10++;
        }
        this.f29700o.j(t10);
        if (this.f29691f) {
            this.f29701p.f(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [w1.d1] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3, types: [w1.d1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [w1.d1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [w1.d1] */
    @Override // w1.d1
    public final boolean d(T t10) {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 < this.f29696k) {
                int i14 = this.f29695j[i12];
                int i15 = this.f29686a[i14];
                int F = F(i14);
                if (!this.f29693h) {
                    int i16 = this.f29686a[i14 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i11) {
                        i13 = f29685s.getInt(t10, i17);
                        i11 = i17;
                    }
                } else {
                    i10 = 0;
                }
                if ((268435456 & F) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (this.f29693h) {
                        z11 = q(i14, t10);
                    } else if ((i13 & i10) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i18 = (267386880 & F) >>> 20;
                if (i18 != 9 && i18 != 17) {
                    if (i18 != 27) {
                        if (i18 != 60 && i18 != 68) {
                            if (i18 != 49) {
                                if (i18 != 50) {
                                    continue;
                                } else {
                                    j0 h10 = this.f29702q.h(n1.n(F & 1048575, t10));
                                    if (!h10.isEmpty()) {
                                        if (this.f29702q.d(m(i14)).f29613c.f29665a == q1.f29675j) {
                                            d1<T> d1Var = 0;
                                            Iterator it = h10.values().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                Object next = it.next();
                                                if (d1Var == null) {
                                                    d1Var = z0.f29732c.a(next.getClass());
                                                }
                                                boolean d10 = d1Var.d(next);
                                                d1Var = d1Var;
                                                if (!d10) {
                                                    z12 = false;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (!z12) {
                                        return false;
                                    }
                                }
                            }
                        } else if (r(i15, i14, t10) && !n(i14).d(n1.n(F & 1048575, t10))) {
                            return false;
                        }
                    }
                    List list = (List) n1.n(F & 1048575, t10);
                    if (!list.isEmpty()) {
                        ?? n10 = n(i14);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!n10.d(list.get(i19))) {
                                z12 = false;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                } else {
                    if (this.f29693h) {
                        z12 = q(i14, t10);
                    } else if ((i13 & i10) == 0) {
                        z12 = false;
                    }
                    if (z12 && !n(i14).d(n1.n(F & 1048575, t10))) {
                        return false;
                    }
                }
                i12++;
            } else if (this.f29691f && !this.f29701p.c(t10).j()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:583:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0237 A[SYNTHETIC] */
    @Override // w1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(T r20, w1.c1 r21, w1.o r22) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.e(java.lang.Object, w1.c1, w1.o):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:302:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x04bc A[SYNTHETIC] */
    @Override // w1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r13, w1.l r14) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.f(java.lang.Object, w1.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x003f, code lost:
        if (w1.e1.B(w1.n1.n(r6, r10), w1.n1.n(r6, r11)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0063, code lost:
        if (w1.e1.B(w1.n1.n(r6, r10), w1.n1.n(r6, r11)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0077, code lost:
        if (w1.n1.m(r6, r10) == w1.n1.m(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0089, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x009d, code lost:
        if (w1.n1.m(r6, r10) == w1.n1.m(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00af, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00c1, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00d3, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00e9, code lost:
        if (w1.e1.B(w1.n1.n(r6, r10), w1.n1.n(r6, r11)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00ff, code lost:
        if (w1.e1.B(w1.n1.n(r6, r10), w1.n1.n(r6, r11)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0115, code lost:
        if (w1.e1.B(w1.n1.n(r6, r10), w1.n1.n(r6, r11)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0127, code lost:
        if (w1.n1.f(r6, r10) == w1.n1.f(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0139, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x014d, code lost:
        if (w1.n1.m(r6, r10) == w1.n1.m(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x015f, code lost:
        if (w1.n1.l(r6, r10) == w1.n1.l(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0172, code lost:
        if (w1.n1.m(r6, r10) == w1.n1.m(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0185, code lost:
        if (w1.n1.m(r6, r10) == w1.n1.m(r6, r11)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x019e, code lost:
        if (java.lang.Float.floatToIntBits(w1.n1.k(r6, r10)) == java.lang.Float.floatToIntBits(w1.n1.k(r6, r11))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01b9, code lost:
        if (java.lang.Double.doubleToLongBits(w1.n1.j(r6, r10)) == java.lang.Double.doubleToLongBits(w1.n1.j(r6, r11))) goto L87;
     */
    @Override // w1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.g(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // w1.d1
    public final int h(T t10) {
        return this.f29693h ? p(t10) : o(t10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00e1, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00f3, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00f5, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00f9, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // w1.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(T r9) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.i(java.lang.Object):int");
    }

    public final boolean j(T t10, T t11, int i10) {
        return q(i10, t10) == q(i10, t11);
    }

    public final <UT, UB> UB k(Object obj, int i10, UB ub2, j1<UT, UB> j1Var) {
        int i11 = this.f29686a[i10];
        Object n10 = n1.n(F(i10) & 1048575, obj);
        if (n10 == null) {
            return ub2;
        }
        y.b l10 = l(i10);
        if (l10 == null) {
            return ub2;
        }
        j0 f10 = this.f29702q.f(n10);
        i0.a<?, ?> d10 = this.f29702q.d(m(i10));
        Iterator it = f10.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!l10.a()) {
                if (ub2 == null) {
                    ub2 = (UB) j1Var.m();
                }
                int a10 = i0.a(d10, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[a10];
                Logger logger = k.f29621b;
                k.b bVar = new k.b(bArr, a10);
                try {
                    i0.b(bVar, d10, entry.getKey(), entry.getValue());
                    if (bVar.f29628e - bVar.f29629f == 0) {
                        j1Var.d(ub2, i11, new g.e(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final y.b l(int i10) {
        return (y.b) this.f29687b[((i10 / 3) * 2) + 1];
    }

    public final Object m(int i10) {
        return this.f29687b[(i10 / 3) * 2];
    }

    public final d1 n(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f29687b;
        d1 d1Var = (d1) objArr[i11];
        if (d1Var != null) {
            return d1Var;
        }
        d1<T> a10 = z0.f29732c.a((Class) objArr[i11 + 1]);
        this.f29687b[i11] = a10;
        return a10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x00c2, code lost:
        if ((r3 instanceof w1.g) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0140, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0152, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0164, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0176, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0188, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x019a, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01ac, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01be, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01cf, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01e0, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x01f1, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0202, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0213, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0224, code lost:
        if (r16.f29694i != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0226, code lost:
        r2.putInt(r17, r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x022a, code lost:
        r6 = ((w1.k.f0(r3) + w1.k.d0(r10)) + r3) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0364, code lost:
        if ((r3 instanceof w1.g) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0366, code lost:
        r3 = w1.k.I(r10, (w1.g) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x036d, code lost:
        r3 = w1.k.b0(r10, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0373, code lost:
        r6 = r3 + r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(T r17) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.o(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x009e, code lost:
        if ((r4 instanceof w1.g) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x011a, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x012c, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x013e, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0150, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0162, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0174, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0186, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0198, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x01a9, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01ba, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01cb, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01dc, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01ed, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01fe, code lost:
        if (r11.f29694i != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0200, code lost:
        r0.putInt(r12, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0204, code lost:
        r3 = r3 + ((w1.k.f0(r5) + w1.k.d0(r6)) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0337, code lost:
        if ((r4 instanceof w1.g) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0339, code lost:
        r4 = w1.k.I(r6, (w1.g) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0340, code lost:
        r4 = w1.k.b0(r6, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0346, code lost:
        r3 = r3 + r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(T r12) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.s0.p(java.lang.Object):int");
    }

    public final boolean q(int i10, Object obj) {
        int i11;
        boolean equals;
        if (this.f29693h) {
            int F = F(i10);
            long j10 = F & 1048575;
            switch ((F & 267386880) >>> 20) {
                case 0:
                    if (n1.j(j10, obj) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (n1.k(j10, obj) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (n1.m(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (n1.m(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (n1.m(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return n1.f(j10, obj);
                case 8:
                    Object n10 = n1.n(j10, obj);
                    if (n10 instanceof String) {
                        equals = ((String) n10).isEmpty();
                        break;
                    } else if (n10 instanceof g) {
                        equals = g.f29563b.equals(n10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (n1.n(j10, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = g.f29563b.equals(n1.n(j10, obj));
                    break;
                case 11:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (n1.m(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (n1.l(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (n1.m(j10, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (n1.n(j10, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((n1.l(i11 & 1048575, obj) & (1 << (this.f29686a[i10 + 2] >>> 20))) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int i10, int i11, Object obj) {
        if (n1.l(this.f29686a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    public final <K, V> void t(Object obj, int i10, Object obj2, o oVar, c1 c1Var) {
        long F = F(i10) & 1048575;
        Object n10 = n1.n(F, obj);
        if (n10 == null) {
            n10 = this.f29702q.e();
            n1.u(F, obj, n10);
        } else if (this.f29702q.g(n10)) {
            j0 e10 = this.f29702q.e();
            this.f29702q.a(e10, n10);
            n1.u(F, obj, e10);
            n10 = e10;
        }
        c1Var.o(this.f29702q.f(n10), this.f29702q.d(obj2), oVar);
    }

    public final int x(int i10) {
        if (i10 < this.f29688c || i10 > this.f29689d) {
            return -1;
        }
        int i11 = 0;
        int length = (this.f29686a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f29686a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final <E> void y(Object obj, long j10, c1 c1Var, d1<E> d1Var, o oVar) {
        c1Var.i(this.f29699n.c(j10, obj), d1Var, oVar);
    }

    public final <E> void z(Object obj, int i10, c1 c1Var, d1<E> d1Var, o oVar) {
        c1Var.c(this.f29699n.c(i10 & 1048575, obj), d1Var, oVar);
    }
}
