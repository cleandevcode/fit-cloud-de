package gm;

import bi.z0;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import pm.n1;
import rm.j;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public static final Object[] f15500a = new Object[0];

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00dc, code lost:
        if (r7 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00df, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00e1, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00e2, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f5, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gm.f.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final int b(ln.v vVar, int i10) {
        int i11;
        l.f(vVar, "$this$segment");
        int[] iArr = vVar.f20142f;
        int i12 = i10 + 1;
        int i13 = 0;
        int length = vVar.f20141e.length;
        l.f(iArr, "$this$binarySearch");
        int i14 = length - 1;
        while (true) {
            if (i13 <= i14) {
                i11 = (i13 + i14) >>> 1;
                int i15 = iArr[i11];
                if (i15 < i12) {
                    i13 = i11 + 1;
                } else if (i15 <= i12) {
                    break;
                } else {
                    i14 = i11 - 1;
                }
            } else {
                i11 = (-i13) - 1;
                break;
            }
        }
        if (i11 < 0) {
            return ~i11;
        }
        return i11;
    }

    public static final void c(Object obj, xl.d dVar, fm.p pVar) {
        Object f10;
        l.f(dVar, "completion");
        try {
            e0.c(2, pVar);
            f10 = pVar.A(obj, dVar);
            if (f10 == yl.a.COROUTINE_SUSPENDED) {
                return;
            }
        } catch (Throwable th2) {
            f10 = mf.a0.f(th2);
        }
        dVar.l(f10);
    }

    public static final Object d(um.v vVar, um.v vVar2, fm.p pVar) {
        Object uVar;
        Object m02;
        try {
            e0.c(2, pVar);
            uVar = pVar.A(vVar2, vVar);
        } catch (Throwable th2) {
            uVar = new pm.u(th2, false);
        }
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (uVar != aVar && (m02 = vVar.m0(uVar)) != n1.f24374b) {
            if (!(m02 instanceof pm.u)) {
                return n1.a(m02);
            }
            throw ((pm.u) m02).f24396a;
        }
        return aVar;
    }

    public static final Object[] e(Collection collection) {
        l.f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i12 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        l.e(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        l.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f15500a;
    }

    public static final Object[] f(Collection collection, Object[] objArr) {
        Object[] objArr2;
        l.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
                l.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                l.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    public static final String g(String str) {
        boolean z10;
        InetAddress a10;
        l.f(str, "$this$toCanonicalHost");
        int i10 = 0;
        int i11 = -1;
        if (om.l.c0(str, ":", false)) {
            if (om.h.a0(str, "[", false) && om.h.U(str, "]", false)) {
                a10 = a(1, str.length() - 1, str);
            } else {
                a10 = a(0, str.length(), str);
            }
            if (a10 == null) {
                return null;
            }
            byte[] address = a10.getAddress();
            if (address.length == 16) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                ln.e eVar = new ln.e();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        eVar.b0(58);
                        i10 += i13;
                        if (i10 == 16) {
                            eVar.b0(58);
                        }
                    } else {
                        if (i10 > 0) {
                            eVar.b0(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = an.c.f635a;
                        eVar.h0(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                        i10 += 2;
                    }
                }
                return eVar.L();
            } else if (address.length == 4) {
                return a10.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        }
        try {
            String ascii = IDN.toASCII(str);
            l.e(ascii, "IDN.toASCII(host)");
            Locale locale = Locale.US;
            l.e(locale, "Locale.US");
            String lowerCase = ascii.toLowerCase(locale);
            l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int length = lowerCase.length();
            for (int i16 = 0; i16 < length; i16++) {
                char charAt = lowerCase.charAt(i16);
                if (l.h(charAt, 31) > 0 && l.h(charAt, 127) < 0 && om.l.g0(" #%/:?@[\\]", charAt, 0, false, 6) == -1) {
                }
                i10 = 1;
                break;
            }
            if (i10 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final void h(rm.t tVar, Object obj) {
        Object p10 = tVar.p(obj);
        if (!(p10 instanceof j.b)) {
            tl.l lVar = (tl.l) p10;
            tl.l lVar2 = tl.l.f28297a;
            return;
        }
        Object obj2 = ((rm.j) z0.n(new rm.k(tVar, obj, null))).f25850a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0115, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gm.f.i(java.lang.String, boolean):void");
    }
}
