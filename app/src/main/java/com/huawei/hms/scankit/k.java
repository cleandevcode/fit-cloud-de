package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.p.L;
import com.huawei.hms.scankit.p.Za;
import com.huawei.hms.scankit.p._a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private static boolean f7424a = true;

    /* renamed from: b */
    private static boolean f7425b = false;

    /* renamed from: c */
    private static boolean f7426c = false;

    /* renamed from: d */
    private static int f7427d;

    /* renamed from: e */
    private static LinkedList<L> f7428e = new LinkedList<>();

    /* renamed from: f */
    private static LinkedList<com.huawei.hms.scankit.aiscan.common.p> f7429f = new LinkedList<>();

    /* renamed from: g */
    private static LinkedList<com.huawei.hms.scankit.aiscan.common.p> f7430g = new LinkedList<>();

    static {
        if (DynamicModuleInitializer.getContext() == null) {
            Log.e("ScankitDecode", "static initializer: context null");
            return;
        }
        Log.i("ScankitDecode", "static initializer: InitModuleBegin");
        z.b(DynamicModuleInitializer.getContext(), "detect.ms");
        z.c(DynamicModuleInitializer.getContext(), "anchors.bin");
        z.a(DynamicModuleInitializer.getContext(), "angle.ms");
        Log.i("ScankitDecode", "static initializer: InitModuleEnd");
    }

    private static com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.aiscan.common.m mVar, E e10, LinkedList<com.huawei.hms.scankit.aiscan.common.x> linkedList, boolean z10, boolean z11, int i10) {
        l lVar = new l(mVar);
        List<List<BarcodeFormat>> a10 = Za.a(e10.f7095c);
        LinkedList<L> linkedList2 = f7428e;
        if (!z10) {
            for (com.huawei.hms.scankit.aiscan.common.x xVar : a(linkedList2, lVar, a10)) {
                linkedList.offer(xVar);
            }
            return null;
        }
        com.huawei.hms.scankit.aiscan.common.x b10 = b(linkedList2, lVar, a10);
        if (b10 == null || b10.i() == null) {
            return null;
        }
        return b10;
    }

    private static com.huawei.hms.scankit.aiscan.common.x a(l lVar, List<BarcodeFormat> list, List<BarcodeFormat> list2, List<BarcodeFormat> list3, List<BarcodeFormat> list4) {
        com.huawei.hms.scankit.aiscan.common.x e10 = list.size() > 0 ? lVar.e(list, null) : null;
        if ((e10 == null || e10.i() == null) && list3.size() > 0) {
            e10 = lVar.c(list3, null);
        }
        if ((e10 == null || e10.i() == null) && list2.size() > 0 && (!_a.f7790a || _a.f7792c)) {
            e10 = lVar.a(list2, (L) null);
        }
        return ((e10 == null || e10.i() == null) && list4.size() > 0) ? lVar.b(list4, null) : e10;
    }

    public static com.huawei.hms.scankit.aiscan.common.x a(List<BarcodeFormat> list, l lVar) {
        if (list.size() > 0) {
            return lVar.d(list, null);
        }
        return null;
    }

    public static List<com.huawei.hms.scankit.aiscan.common.x> a(List<L> list, l lVar, List<List<BarcodeFormat>> list2) {
        com.huawei.hms.scankit.aiscan.common.x f10;
        List<BarcodeFormat> list3 = list2.get(0);
        List<BarcodeFormat> list4 = list2.get(1);
        List<BarcodeFormat> list5 = list2.get(2);
        List<BarcodeFormat> list6 = list2.get(3);
        List<BarcodeFormat> list7 = list2.get(4);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            com.huawei.hms.scankit.aiscan.common.x xVar = null;
            if (i10 >= list.size()) {
                break;
            }
            lVar.f7439i.a();
            L l10 = list.get(i10);
            boolean z10 = l10.g() == 5.0f;
            boolean z11 = l10.g() == 1.0f;
            boolean z12 = l10.g() == 3.0f;
            boolean z13 = l10.g() == 2.0f;
            boolean z14 = l10.g() == 4.0f;
            if (_a.f7791b) {
                z10 = l10.g() == 1.0f;
                z11 = l10.g() == 2.0f;
                z12 = l10.g() == 2.0f;
                z14 = l10.g() == 1.0f;
                z13 = l10.g() == 2.0f;
            }
            lVar.a(l10);
            if (list3.size() > 0 && z11) {
                xVar = lVar.d(list3, l10);
            }
            if ((xVar == null || xVar.i() == null) && list6.size() > 0 && z12) {
                xVar = lVar.b(list6, l10);
            }
            if ((xVar == null || xVar.i() == null) && list5.size() > 0 && z14) {
                xVar = lVar.c(list5, l10);
            }
            if ((xVar == null || xVar.i() == null) && list7.size() > 0 && z13) {
                xVar = lVar.b(list7, l10);
            }
            if ((xVar == null || xVar.i() == null) && list4.size() > 0 && z10) {
                xVar = lVar.a(list4, l10);
            }
            if (xVar != null && xVar.i() != null) {
                arrayList.add(xVar);
            }
            i10++;
        }
        if (arrayList.size() == 0 && list3.size() > 0 && (f10 = lVar.f(list3, null)) != null && f10.i() != null) {
            arrayList.add(f10);
        }
        return arrayList;
    }

    private static void a() {
        f7426c = false;
        f7428e = new LinkedList<>();
        f7429f = new LinkedList<>();
        f7430g = new LinkedList<>();
    }

    private static void a(com.huawei.hms.scankit.aiscan.common.m mVar, int i10, int i11, E e10) {
        _a.a(e10);
        byte[] b10 = mVar.a(i10, i11, e10.f7093a, e10.f7094b).b();
        int i12 = e10.f7093a;
        int i13 = e10.f7094b;
        List<L> a10 = new l(new com.huawei.hms.scankit.aiscan.common.r(b10, i12, i13, 0, 0, i12, i13, false)).a(0, _a.f7801l);
        if (!e10.f7102j) {
            a(a10, e10);
        }
        for (L l10 : a10) {
            l10.a(e10.f7100h, e10.f7101i);
            f7428e.offer(l10);
        }
    }

    private static void a(List<L> list, E e10) {
        for (L l10 : list) {
            if (l10.d() < e10.f7093a * 0.1f) {
                f7429f.offer(new com.huawei.hms.scankit.aiscan.common.p(l10, e10.f7100h));
            } else {
                float f10 = l10.f() + l10.d();
                int i10 = e10.f7093a;
                if (f10 > i10 * 0.9f) {
                    f7429f.offer(new com.huawei.hms.scankit.aiscan.common.p(l10, e10.f7100h + i10));
                }
            }
            if (l10.e() < e10.f7094b * 0.1f) {
                f7430g.offer(new com.huawei.hms.scankit.aiscan.common.p(l10, e10.f7101i));
            } else {
                float c10 = l10.c() + l10.e();
                int i11 = e10.f7094b;
                if (c10 > i11 * 0.9f) {
                    f7430g.offer(new com.huawei.hms.scankit.aiscan.common.p(l10, e10.f7101i + i11));
                }
            }
        }
    }

    public static void a(boolean z10) {
        _a.f7790a = z10;
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] a(Bitmap bitmap, E e10) {
        String str;
        byte[] bArr;
        try {
            e10.f7093a = bitmap.getWidth();
            int height = bitmap.getHeight();
            e10.f7094b = height;
            int i10 = e10.f7093a;
            int[] iArr = new int[i10 * height];
            bitmap.getPixels(iArr, 0, i10, 0, 0, i10, height);
            bArr = new com.huawei.hms.scankit.aiscan.common.s(e10.f7093a, e10.f7094b, iArr).b();
        } catch (IllegalArgumentException unused) {
            str = "IllegalArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return a(bArr, e10);
        } catch (Exception unused2) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return a(bArr, e10);
        } catch (OutOfMemoryError unused3) {
            str = "OutOfMemoryError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return a(bArr, e10);
        } catch (UnsatisfiedLinkError unused4) {
            str = "UnsatisfiedLinkError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return a(bArr, e10);
        } catch (UnsupportedOperationException unused5) {
            str = "UnsupportedArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return a(bArr, e10);
        }
        return a(bArr, e10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
        if (com.huawei.hms.scankit.p._a.f7790a == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.huawei.hms.scankit.aiscan.common.x[] a(com.huawei.hms.scankit.aiscan.common.m r8, com.huawei.hms.scankit.E r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.huawei.hms.scankit.p._a.a(r9)
            r1 = 1
            com.huawei.hms.scankit.p._a.a(r1)
            int r2 = r9.f7093a
            r3 = 30
            if (r2 < r3) goto L7c
            int r2 = r9.f7094b
            if (r2 < r3) goto L7c
            if (r8 == 0) goto L7c
            int r9 = r9.f7095c
            java.util.List r9 = com.huawei.hms.scankit.p.Za.a(r9)
            r2 = 0
            java.lang.Object r3 = r9.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r9.get(r1)
            java.util.List r4 = (java.util.List) r4
            r5 = 2
            java.lang.Object r5 = r9.get(r5)
            java.util.List r5 = (java.util.List) r5
            r6 = 3
            java.lang.Object r6 = r9.get(r6)
            java.util.List r6 = (java.util.List) r6
            com.huawei.hms.scankit.l r7 = new com.huawei.hms.scankit.l
            r7.<init>(r8)
            boolean r8 = com.huawei.hms.scankit.p._a.f7801l
            java.util.List r8 = r7.a(r1, r8)
            int r1 = r8.size()
            if (r1 <= 0) goto L4f
            java.util.List r0 = a(r8, r7, r9)
            goto L66
        L4f:
            boolean r8 = com.huawei.hms.scankit.p._a.f7792c
            if (r8 != 0) goto L57
            boolean r8 = com.huawei.hms.scankit.p._a.f7790a
            if (r8 != 0) goto L66
        L57:
            com.huawei.hms.scankit.aiscan.common.x r8 = a(r7, r3, r4, r5, r6)
            if (r8 == 0) goto L66
            java.lang.String r9 = r8.i()
            if (r9 == 0) goto L66
            r0.add(r8)
        L66:
            java.util.List r8 = com.huawei.hms.scankit.aiscan.common.E.a(r0)
            int r9 = r8.size()
            if (r9 <= 0) goto L79
            com.huawei.hms.scankit.aiscan.common.x[] r9 = new com.huawei.hms.scankit.aiscan.common.x[r2]
            java.lang.Object[] r8 = r8.toArray(r9)
            com.huawei.hms.scankit.aiscan.common.x[] r8 = (com.huawei.hms.scankit.aiscan.common.x[]) r8
            return r8
        L79:
            com.huawei.hms.scankit.aiscan.common.x[] r8 = new com.huawei.hms.scankit.aiscan.common.x[r2]
            return r8
        L7c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "width or Height is Illeagle"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.k.a(com.huawei.hms.scankit.aiscan.common.m, com.huawei.hms.scankit.E):com.huawei.hms.scankit.aiscan.common.x[]");
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] a(ByteBuffer byteBuffer, E e10) {
        return a(byteBuffer.array(), e10);
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] a(byte[] bArr, E e10) {
        String str;
        com.huawei.hms.scankit.aiscan.common.x[] xVarArr = new com.huawei.hms.scankit.aiscan.common.x[0];
        try {
            com.huawei.hms.scankit.aiscan.common.x[] a10 = a(bArr, e10, false);
            int length = a10.length;
            int[] iArr = new int[length];
            int i10 = 0;
            int i11 = 0;
            while (i10 < a10.length) {
                int i12 = i10 + 1;
                for (int i13 = i12; i13 < a10.length; i13++) {
                    if (com.huawei.hms.scankit.aiscan.common.E.a(a10[i10].h(), a10[i13].h()) > 0.7d) {
                        iArr[i13] = 1;
                        i11++;
                    }
                }
                i10 = i12;
            }
            int length2 = a10.length - i11;
            xVarArr = new com.huawei.hms.scankit.aiscan.common.x[length2];
            for (int i14 = 0; i14 < length2; i14++) {
                int i15 = i14;
                while (i15 < length) {
                    if (iArr[i15] != 1) {
                        break;
                    }
                    i15++;
                }
                xVarArr[i14] = a10[i15];
            }
        } catch (IllegalArgumentException unused) {
            str = "IllegalArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (Exception unused2) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (OutOfMemoryError unused3) {
            str = "OutOfMemoryError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (UnsatisfiedLinkError unused4) {
            str = "UnsatisfiedLinkError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (UnsupportedOperationException unused5) {
            str = "UnsupportedArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        }
        return xVarArr;
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] a(byte[] bArr, E e10, boolean z10) {
        int i10;
        int i11;
        LinkedList linkedList = new LinkedList();
        a();
        int min = Math.min(e10.f7093a, e10.f7094b);
        float f10 = min;
        float max = Math.max(e10.f7093a, e10.f7094b) / f10;
        int i12 = (int) (f10 * 1.78f);
        com.huawei.hms.scankit.aiscan.common.m c10 = c(bArr, e10);
        E e11 = new E(e10);
        if (min > 500 && e10.f7093a >= e10.f7094b && e10.f7097e && max > 3.0f) {
            f7426c = true;
            e11.f7093a = i12;
            int i13 = e10.f7093a - 1;
            while (i13 >= 0) {
                i13 -= i12;
                int i14 = i13 >= 0 ? i13 : 0;
                e11.f7100h = i14;
                e11.f7101i = 0;
                a(c10, i14, 0, e11);
            }
            Collections.sort(f7428e);
            com.huawei.hms.scankit.aiscan.common.x a10 = a(c10, e11, linkedList, z10, true, i12);
            if (a10 != null) {
                return new com.huawei.hms.scankit.aiscan.common.x[]{a10};
            }
            f7428e = new LinkedList<>();
            Collections.sort(f7429f);
            HashSet hashSet = new HashSet();
            Iterator<com.huawei.hms.scankit.aiscan.common.p> it = f7429f.iterator();
            while (it.hasNext()) {
                com.huawei.hms.scankit.aiscan.common.p next = it.next();
                if (hashSet.add(Integer.valueOf(next.f7277b)) && (i11 = next.f7277b) >= i12 && i11 <= (e10.f7093a - 1) - i12) {
                    e11.f7093a = i12;
                    e11.f7102j = true;
                    int i15 = i11 - (i12 / 2);
                    e11.f7100h = i15;
                    e11.f7101i = 0;
                    a(c10, i15, 0, e11);
                }
            }
            Collections.sort(f7428e);
            com.huawei.hms.scankit.aiscan.common.x a11 = a(c10, e11, linkedList, z10, true, i12);
            if (a11 != null) {
                return new com.huawei.hms.scankit.aiscan.common.x[]{a11};
            }
        } else if (min <= 500 || !e10.f7097e || max <= 3.0f) {
            f7426c = false;
            return z10 ? b(c10, e10) : a(c10, e10);
        } else {
            f7426c = true;
            e11.f7094b = i12;
            int i16 = e10.f7094b - 1;
            while (i16 >= 0) {
                i16 -= i12;
                int i17 = i16 >= 0 ? i16 : 0;
                e11.f7100h = 0;
                e11.f7101i = i17;
                a(c10, 0, i17, e11);
            }
            Collections.sort(f7428e);
            com.huawei.hms.scankit.aiscan.common.x a12 = a(c10, e10, linkedList, z10, false, i12);
            if (a12 != null) {
                return new com.huawei.hms.scankit.aiscan.common.x[]{a12};
            }
            f7428e = new LinkedList<>();
            Collections.sort(f7430g);
            HashSet hashSet2 = new HashSet();
            Iterator<com.huawei.hms.scankit.aiscan.common.p> it2 = f7430g.iterator();
            while (it2.hasNext()) {
                com.huawei.hms.scankit.aiscan.common.p next2 = it2.next();
                if (hashSet2.add(Integer.valueOf(next2.f7277b)) && (i10 = next2.f7277b) >= i12 && i10 <= (e10.f7094b - 1) - i12) {
                    int i18 = i10 - (i12 / 2);
                    e11.f7094b = i12;
                    e11.f7102j = true;
                    e11.f7100h = 0;
                    e11.f7101i = i18;
                    a(c10, 0, i18, e11);
                }
            }
            Collections.sort(f7428e);
            com.huawei.hms.scankit.aiscan.common.x a13 = a(c10, e10, linkedList, z10, false, i12);
            if (a13 != null) {
                return new com.huawei.hms.scankit.aiscan.common.x[]{a13};
            }
        }
        com.huawei.hms.scankit.aiscan.common.x[] xVarArr = new com.huawei.hms.scankit.aiscan.common.x[linkedList.size()];
        linkedList.toArray(xVarArr);
        return xVarArr;
    }

    public static com.huawei.hms.scankit.aiscan.common.x b(List<L> list, l lVar, List<List<BarcodeFormat>> list2) {
        List<BarcodeFormat> list3 = list2.get(0);
        List<BarcodeFormat> list4 = list2.get(1);
        List<BarcodeFormat> list5 = list2.get(2);
        List<BarcodeFormat> list6 = list2.get(3);
        List<BarcodeFormat> list7 = list2.get(4);
        com.huawei.hms.scankit.aiscan.common.x xVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                lVar.f7439i.a();
            }
            L l10 = list.get(i10);
            boolean z10 = l10.g() == 5.0f;
            boolean z11 = l10.g() == 1.0f;
            boolean z12 = l10.g() == 2.0f;
            boolean z13 = l10.g() == 3.0f;
            boolean z14 = l10.g() == 4.0f;
            if (_a.f7791b) {
                z10 = l10.g() == 1.0f;
                z11 = l10.g() == 2.0f;
                z12 = l10.g() == 2.0f;
                z13 = l10.g() == 2.0f;
                z14 = l10.g() == 1.0f;
            }
            lVar.a(l10);
            if ((xVar == null || xVar.i() == null) && list3.size() > 0 && z11) {
                f7425b = true;
                xVar = lVar.d(list3, l10);
            }
            if ((xVar == null || xVar.i() == null) && list6.size() > 0 && z13) {
                xVar = lVar.b(list6, l10);
            }
            if ((xVar == null || xVar.i() == null) && list7.size() > 0 && z12) {
                xVar = lVar.b(list7, l10);
            }
            if ((xVar == null || xVar.i() == null) && list5.size() > 0 && z14) {
                xVar = lVar.c(list5, l10);
            }
            if ((xVar == null || xVar.i() == null) && list4.size() > 0 && z10) {
                xVar = lVar.a(list4, l10);
            }
            if (xVar != null && xVar.i() != null) {
                break;
            }
        }
        return xVar;
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] b(Bitmap bitmap, E e10) {
        String str;
        byte[] bArr;
        try {
            e10.f7093a = bitmap.getWidth();
            int height = bitmap.getHeight();
            e10.f7094b = height;
            int i10 = e10.f7093a;
            int[] iArr = new int[i10 * height];
            bitmap.getPixels(iArr, 0, i10, 0, 0, i10, height);
            bArr = new com.huawei.hms.scankit.aiscan.common.s(e10.f7093a, e10.f7094b, iArr).b();
        } catch (IllegalArgumentException unused) {
            str = "IllegalArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return b(bArr, e10);
        } catch (Exception unused2) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return b(bArr, e10);
        } catch (OutOfMemoryError unused3) {
            str = "OutOfMemoryError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return b(bArr, e10);
        } catch (UnsatisfiedLinkError unused4) {
            str = "UnsatisfiedLinkError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return b(bArr, e10);
        } catch (UnsupportedOperationException unused5) {
            str = "UnsupportedArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            bArr = null;
            return b(bArr, e10);
        }
        return b(bArr, e10);
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] b(com.huawei.hms.scankit.aiscan.common.m mVar, E e10) {
        com.huawei.hms.scankit.aiscan.common.x xVar;
        boolean z10;
        com.huawei.hms.scankit.util.a.c("ScankitDecode", "scankit mode:FULLSDK1");
        _a.a(e10);
        List<L> arrayList = new ArrayList<>();
        if (e10.f7093a < 30 || e10.f7094b < 30 || mVar == null) {
            throw new IllegalArgumentException("widthOrHeight is Illeagle");
        }
        List<List<BarcodeFormat>> a10 = Za.a(e10.f7095c);
        List<BarcodeFormat> list = a10.get(0);
        List<BarcodeFormat> list2 = a10.get(1);
        List<BarcodeFormat> list3 = a10.get(2);
        List<BarcodeFormat> list4 = a10.get(3);
        List<BarcodeFormat> list5 = a10.get(4);
        l lVar = new l(mVar);
        com.huawei.hms.scankit.aiscan.common.x xVar2 = null;
        com.huawei.hms.scankit.aiscan.common.x a11 = (!f7424a || f7426c) ? null : a(list, lVar);
        if (a11 == null || a11.i() == null) {
            arrayList = lVar.a(0, _a.f7801l);
        }
        if (arrayList.size() > 0) {
            a11 = b(arrayList, lVar, a10);
        } else if (_a.f7792c || !_a.f7790a || _a.f7791b) {
            if ((a11 == null || a11.i() == null) && list3.size() > 0) {
                a11 = lVar.c(list3, null);
            }
            if ((a11 == null || a11.i() == null) && list2.size() > 0 && (!_a.f7790a || _a.f7792c)) {
                a11 = lVar.a(list2, (L) null);
            }
            if ((a11 == null || a11.i() == null) && list5.size() > 0) {
                a11 = lVar.b(list5, null);
            }
            if ((a11 == null || a11.i() == null) && list4.size() > 0) {
                a11 = lVar.b(list4, null);
            }
        }
        if (e10.f7097e && ((a11 == null || a11.i() == null) && !f7424a && f7425b && !f7426c)) {
            a11 = a(list, lVar);
            f7425b = false;
        }
        float f10 = 1.0f;
        if (_a.f7792c) {
            xVar = null;
            z10 = false;
        } else {
            z10 = lVar.a();
            int i10 = _a.f7796g - 1;
            if (i10 <= 0) {
                i10 = 0;
            }
            _a.f7796g = i10;
            if (arrayList.size() > 0) {
                z10 = z10 || lVar.a(arrayList);
            }
            f10 = Math.max(1.0f, lVar.d() > 0.0f ? lVar.d() : Math.max(lVar.b(), lVar.c()));
            com.huawei.hms.scankit.aiscan.common.x a12 = l.a(arrayList, lVar);
            xVar2 = l.a(lVar);
            xVar = a12;
        }
        if (xVar2 == null || xVar2.f() != -2) {
            f7427d = 0;
        } else {
            f7427d++;
        }
        if (a11 != null && a11.i() != null) {
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "ScanCode successful");
            f7427d = 0;
            return new com.huawei.hms.scankit.aiscan.common.x[]{a11};
        } else if (z10) {
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "ScanCode need zoom");
            com.huawei.hms.scankit.aiscan.common.x xVar3 = new com.huawei.hms.scankit.aiscan.common.x(f10);
            xVar3.b(true);
            f7427d = 0;
            return new com.huawei.hms.scankit.aiscan.common.x[]{xVar3};
        } else if (arrayList.size() > 0 && xVar != null) {
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "ScanCode need exposure");
            f7427d = 0;
            return new com.huawei.hms.scankit.aiscan.common.x[]{xVar};
        } else if (xVar2 == null || f7427d != 3) {
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "ScanCode null");
            return new com.huawei.hms.scankit.aiscan.common.x[0];
        } else {
            xVar2.a(true);
            xVar2.a(-1);
            com.huawei.hms.scankit.util.a.c("ScankitDecode", "ScanCode need globalexposure");
            f7427d = 0;
            return new com.huawei.hms.scankit.aiscan.common.x[]{xVar2};
        }
    }

    public static com.huawei.hms.scankit.aiscan.common.x[] b(byte[] bArr, E e10) {
        String str;
        com.huawei.hms.scankit.aiscan.common.x[] xVarArr = new com.huawei.hms.scankit.aiscan.common.x[0];
        try {
            return a(bArr, e10, true);
        } catch (IllegalArgumentException unused) {
            str = "IllegalArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (Exception unused2) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (OutOfMemoryError unused3) {
            str = "OutOfMemoryError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (UnsatisfiedLinkError unused4) {
            str = "UnsatisfiedLinkError";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        } catch (UnsupportedOperationException unused5) {
            str = "UnsupportedArgumentException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return xVarArr;
        }
    }

    private static com.huawei.hms.scankit.aiscan.common.m c(byte[] bArr, E e10) {
        int i10 = e10.f7093a;
        int i11 = e10.f7094b;
        if (e10.f7096d) {
            byte[] bArr2 = new byte[i10 * i11];
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i10; i13++) {
                    bArr2[(((i13 * i11) + i11) - i12) - 1] = bArr[(i12 * i10) + i13];
                }
            }
            e10.f7093a = i11;
            e10.f7094b = i10;
            return new com.huawei.hms.scankit.aiscan.common.r(bArr2, i11, i10, 0, 0, i11, i10, false);
        }
        return new com.huawei.hms.scankit.aiscan.common.r(bArr, i10, i11, 0, 0, i10, i11, false);
    }
}
