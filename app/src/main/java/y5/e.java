package y5;

import gm.l;
import y5.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final /* synthetic */ int f31162a = 0;

    static {
        new e();
    }

    public static final void a(a aVar, a aVar2) {
        if (i6.a.b(e.class)) {
            return;
        }
        try {
            l.f(aVar, "x");
            l.f(aVar2, "b");
            int[] iArr = aVar.f31131a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            float[] fArr = aVar.f31133c;
            float[] fArr2 = aVar2.f31133c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = (i15 * i12) + (i13 * i11 * i12) + i17;
                                    fArr[i19] = fArr[i19] + fArr2[i17];
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 < i10) {
                        i13 = i14;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
        }
    }

    public static final a b(a[] aVarArr) {
        int i10;
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            int i11 = aVarArr[0].f31131a[0];
            int length = aVarArr.length - 1;
            if (length >= 0) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    i10 += aVarArr[i12].f31131a[1];
                    if (i13 > length) {
                        break;
                    }
                    i12 = i13;
                }
            } else {
                i10 = 0;
            }
            a aVar = new a(new int[]{i11, i10});
            float[] fArr = aVar.f31133c;
            if (i11 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    int i16 = i14 * i10;
                    int length2 = aVarArr.length - 1;
                    if (length2 >= 0) {
                        int i17 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            a aVar2 = aVarArr[i17];
                            float[] fArr2 = aVar2.f31133c;
                            int i19 = aVar2.f31131a[1];
                            System.arraycopy(fArr2, i14 * i19, fArr, i16, i19);
                            i16 += i19;
                            if (i18 > length2) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i15 >= i11) {
                        break;
                    }
                    i14 = i15;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final a c(a aVar, a aVar2) {
        Class<e> cls;
        Class<e> cls2;
        a aVar3;
        Class<e> cls3 = e.class;
        if (i6.a.b(cls3)) {
            return null;
        }
        try {
            l.f(aVar, "x");
            l.f(aVar2, "w");
            try {
                int[] iArr = aVar.f31131a;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int[] iArr2 = aVar2.f31131a;
                int i13 = iArr2[0];
                int i14 = (i11 - i13) + 1;
                int i15 = iArr2[2];
                a aVar4 = new a(new int[]{i10, i14, i15});
                float[] fArr = aVar.f31133c;
                float[] fArr2 = aVar4.f31133c;
                float[] fArr3 = aVar2.f31133c;
                if (i10 > 0) {
                    int i16 = 0;
                    while (true) {
                        int i17 = i16 + 1;
                        if (i15 > 0) {
                            int i18 = 0;
                            while (true) {
                                int i19 = i18 + 1;
                                if (i14 > 0) {
                                    int i20 = 0;
                                    while (true) {
                                        int i21 = i20 + 1;
                                        float f10 = 0.0f;
                                        if (i13 > 0) {
                                            int i22 = 0;
                                            while (true) {
                                                cls2 = cls3;
                                                int i23 = i22 + 1;
                                                if (i12 > 0) {
                                                    int i24 = 0;
                                                    while (true) {
                                                        aVar3 = aVar4;
                                                        int i25 = i24 + 1;
                                                        try {
                                                            f10 = (fArr[((i22 + i20) * i12) + (i11 * i12 * i16) + i24] * fArr3[(((i22 * i12) + i24) * i15) + i18]) + f10;
                                                            if (i25 >= i12) {
                                                                break;
                                                            }
                                                            i24 = i25;
                                                            aVar4 = aVar3;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            cls = cls2;
                                                            i6.a.a(cls, th);
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    aVar3 = aVar4;
                                                }
                                                if (i23 >= i13) {
                                                    break;
                                                }
                                                i22 = i23;
                                                cls3 = cls2;
                                                aVar4 = aVar3;
                                            }
                                        } else {
                                            cls2 = cls3;
                                            aVar3 = aVar4;
                                        }
                                        fArr2[(i20 * i15) + (i14 * i15 * i16) + i18] = f10;
                                        if (i21 >= i14) {
                                            break;
                                        }
                                        i20 = i21;
                                        cls3 = cls2;
                                        aVar4 = aVar3;
                                    }
                                } else {
                                    cls2 = cls3;
                                    aVar3 = aVar4;
                                }
                                if (i19 >= i15) {
                                    break;
                                }
                                i18 = i19;
                                cls3 = cls2;
                                aVar4 = aVar3;
                            }
                        } else {
                            cls2 = cls3;
                            aVar3 = aVar4;
                        }
                        if (i17 < i10) {
                            i16 = i17;
                            cls3 = cls2;
                            aVar4 = aVar3;
                        } else {
                            return aVar3;
                        }
                    }
                } else {
                    return aVar4;
                }
            } catch (Throwable th3) {
                th = th3;
                cls2 = cls3;
            }
        } catch (Throwable th4) {
            th = th4;
            cls = cls3;
        }
    }

    public static final a d(a aVar, a aVar2, a aVar3) {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            l.f(aVar, "x");
            l.f(aVar2, "w");
            l.f(aVar3, "b");
            int i10 = aVar.f31131a[0];
            int i11 = aVar3.f31131a[0];
            a h10 = h(aVar, aVar2);
            float[] fArr = aVar3.f31133c;
            float[] fArr2 = h10.f31133c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            int i16 = (i12 * i11) + i14;
                            fArr2[i16] = fArr2[i16] + fArr[i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return h10;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final a e(String[] strArr, a aVar) {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            l.f(aVar, "w");
            int length = strArr.length;
            int i10 = aVar.f31131a[1];
            a aVar2 = new a(new int[]{length, 128, i10});
            float[] fArr = aVar2.f31133c;
            float[] fArr2 = aVar.f31133c;
            if (length > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    int[] c10 = f.f31163a.c(strArr[i11]);
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        System.arraycopy(fArr2, c10[i13] * i10, fArr, (i13 * i10) + (i10 * 128 * i11), i10);
                        if (i14 >= 128) {
                            break;
                        }
                        i13 = i14;
                    }
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final void f(a aVar) {
        int i10;
        if (i6.a.b(e.class)) {
            return;
        }
        try {
            l.f(aVar, "x");
            int[] iArr = aVar.f31131a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i11 = 1;
                i10 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    i10 *= aVar.f31131a[i11];
                    if (i12 >= length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                i10 = 1;
            }
            int[] iArr2 = {aVar.f31131a[0], i10};
            aVar.f31131a = iArr2;
            int a10 = a.C0574a.a(iArr2);
            float[] fArr = new float[a10];
            System.arraycopy(aVar.f31133c, 0, fArr, 0, Math.min(aVar.f31132b, a10));
            aVar.f31133c = fArr;
            aVar.f31132b = a10;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
        }
    }

    public static final a g(a aVar, int i10) {
        int i11;
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            l.f(aVar, "x");
            int[] iArr = aVar.f31131a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = (i13 - i10) + 1;
            a aVar2 = new a(new int[]{i12, i15, i14});
            float[] fArr = aVar.f31133c;
            float[] fArr2 = aVar2.f31133c;
            if (i12 > 0) {
                int i16 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    if (i14 > 0) {
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i15 > 0) {
                                int i20 = 0;
                                while (true) {
                                    int i21 = i20 + 1;
                                    int i22 = i20 * i14;
                                    int i23 = (i16 * i15 * i14) + i22 + i18;
                                    int i24 = (i16 * i13 * i14) + i22 + i18;
                                    fArr2[i23] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i25 = 0;
                                        while (true) {
                                            int i26 = i25 + 1;
                                            i11 = i13;
                                            fArr2[i23] = Math.max(fArr2[i23], fArr[(i25 * i14) + i24]);
                                            if (i26 >= i10) {
                                                break;
                                            }
                                            i25 = i26;
                                            i13 = i11;
                                        }
                                    } else {
                                        i11 = i13;
                                    }
                                    if (i21 >= i15) {
                                        break;
                                    }
                                    i20 = i21;
                                    i13 = i11;
                                }
                            } else {
                                i11 = i13;
                            }
                            if (i19 >= i14) {
                                break;
                            }
                            i18 = i19;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                    }
                    if (i17 >= i12) {
                        break;
                    }
                    i16 = i17;
                    i13 = i11;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final a h(a aVar, a aVar2) {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            l.f(aVar, "x");
            l.f(aVar2, "w");
            int i10 = aVar.f31131a[0];
            int[] iArr = aVar2.f31131a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            a aVar3 = new a(new int[]{i10, i12});
            float[] fArr = aVar.f31133c;
            float[] fArr2 = aVar2.f31133c;
            float[] fArr3 = aVar3.f31133c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i12 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            int i17 = (i13 * i12) + i15;
                            fArr3[i17] = 0.0f;
                            if (i11 > 0) {
                                int i18 = 0;
                                while (true) {
                                    int i19 = i18 + 1;
                                    fArr3[i17] = (fArr[(i13 * i11) + i18] * fArr2[(i18 * i12) + i15]) + fArr3[i17];
                                    if (i19 >= i11) {
                                        break;
                                    }
                                    i18 = i19;
                                }
                            }
                            if (i16 >= i12) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final void i(a aVar) {
        if (i6.a.b(e.class)) {
            return;
        }
        try {
            l.f(aVar, "x");
            float[] fArr = aVar.f31133c;
            int i10 = 0;
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                if (fArr[i10] < 0.0f) {
                    fArr[i10] = 0.0f;
                }
                if (i11 <= length) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
        }
    }

    public static final void j(a aVar) {
        if (i6.a.b(e.class)) {
            return;
        }
        try {
            l.f(aVar, "x");
            int[] iArr = aVar.f31131a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = aVar.f31133c;
            if (i11 <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                int i14 = i10 * i12;
                int i15 = i14 + i12;
                float f10 = Float.MIN_VALUE;
                float f11 = 0.0f;
                if (i14 < i15) {
                    int i16 = i14;
                    while (true) {
                        int i17 = i16 + 1;
                        float f12 = fArr[i16];
                        if (f12 > f10) {
                            f10 = f12;
                        }
                        if (i17 >= i15) {
                            break;
                        }
                        i16 = i17;
                    }
                }
                if (i14 < i15) {
                    int i18 = i14;
                    while (true) {
                        int i19 = i18 + 1;
                        float exp = (float) Math.exp(fArr[i18] - f10);
                        fArr[i18] = exp;
                        f11 += exp;
                        if (i19 >= i15) {
                            break;
                        }
                        i18 = i19;
                    }
                }
                if (i14 < i15) {
                    while (true) {
                        int i20 = i14 + 1;
                        fArr[i14] = fArr[i14] / f11;
                        if (i20 >= i15) {
                            break;
                        }
                        i14 = i20;
                    }
                }
                if (i13 < i11) {
                    i10 = i13;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
        }
    }

    public static final a k(a aVar) {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f31131a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            a aVar2 = new a(new int[]{i11, i10});
            float[] fArr = aVar.f31133c;
            float[] fArr2 = aVar2.f31133c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            fArr2[(i14 * i10) + i12] = fArr[(i12 * i11) + i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public static final a l(a aVar) {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f31131a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            a aVar2 = new a(new int[]{i12, i11, i10});
            float[] fArr = aVar.f31133c;
            float[] fArr2 = aVar2.f31133c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    fArr2[(i15 * i10) + (i17 * i10 * i11) + i13] = fArr[(i15 * i12) + (i13 * i11 * i12) + i17];
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }
}
