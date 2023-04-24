package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class Ub {

    /* renamed from: a */
    public static final String[] f7734a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: b */
    public static final int[][] f7735b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: c */
    private static final int[][] f7736c;

    /* renamed from: d */
    public static final int[][] f7737d;

    /* renamed from: e */
    private final byte[] f7738e;

    /* loaded from: classes.dex */
    public static class a<State> implements Comparator<Wb> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Wb wb2, Wb wb3) {
            return wb2.b() - wb3.b();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 5, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY);
        f7736c = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f7736c[0][i10] = (i10 - 65) + 2;
        }
        f7736c[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f7736c[1][i11] = (i11 - 97) + 2;
        }
        f7736c[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f7736c[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f7736c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f7736c[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f7736c[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, 6, 6);
        f7737d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        try {
            int[][] iArr7 = f7737d;
            if (com.huawei.hms.scankit.util.b.a(iArr7, 0) && com.huawei.hms.scankit.util.b.a(iArr7[0], 4)) {
                iArr7[0][4] = 0;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr7, 1) && com.huawei.hms.scankit.util.b.a(iArr7[1], 4)) {
                iArr7[1][4] = 0;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr7, 1) && com.huawei.hms.scankit.util.b.a(iArr7[1], 0)) {
                iArr7[1][0] = 28;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr7, 3) && com.huawei.hms.scankit.util.b.a(iArr7[3], 4)) {
                iArr7[3][4] = 0;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr7, 2) && com.huawei.hms.scankit.util.b.a(iArr7[2], 4)) {
                iArr7[2][4] = 0;
            }
            if (com.huawei.hms.scankit.util.b.a(iArr7, 2) && com.huawei.hms.scankit.util.b.a(iArr7[2], 0)) {
                iArr7[2][0] = 15;
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    public Ub(byte[] bArr) {
        this.f7738e = bArr;
    }

    private static Collection<Wb> a(Iterable<Wb> iterable) {
        LinkedList linkedList = new LinkedList();
        for (Wb wb2 : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Wb wb3 = (Wb) it.next();
                if (wb3.a(wb2)) {
                    z10 = false;
                    break;
                } else if (wb2.a(wb3)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(wb2);
            }
        }
        return linkedList;
    }

    private Collection<Wb> a(Iterable<Wb> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        for (Wb wb2 : iterable) {
            a(wb2, i10, linkedList);
        }
        return a(linkedList);
    }

    private static Collection<Wb> a(Iterable<Wb> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        for (Wb wb2 : iterable) {
            a(wb2, i10, i11, linkedList);
        }
        return a(linkedList);
    }

    private static void a(Wb wb2, int i10, int i11, Collection<Wb> collection) {
        Wb b10 = wb2.b(i10);
        collection.add(b10.a(4, i11));
        if (wb2.c() != 4) {
            collection.add(b10.b(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(b10.a(2, 16 - i11).a(2, 1));
        }
        if (wb2.a() > 0) {
            collection.add(wb2.a(i10).a(i10 + 1));
        }
    }

    private void a(Wb wb2, int i10, Collection<Wb> collection) {
        if (com.huawei.hms.scankit.util.b.a(this.f7738e, i10)) {
            char c10 = (char) (this.f7738e[i10] & 255);
            int[][] iArr = f7736c;
            boolean z10 = com.huawei.hms.scankit.util.b.a(iArr, wb2.c()) && com.huawei.hms.scankit.util.b.a(iArr[wb2.c()], (int) c10) && iArr[wb2.c()][c10] > 0;
            Wb wb3 = null;
            for (int i11 = 0; i11 <= 4; i11++) {
                int[][] iArr2 = f7736c;
                int i12 = (com.huawei.hms.scankit.util.b.a(iArr2, i11) && com.huawei.hms.scankit.util.b.a(iArr2[i11], (int) c10)) ? iArr2[i11][c10] : 0;
                if (i12 > 0) {
                    if (wb3 == null) {
                        wb3 = wb2.b(i10);
                    }
                    if (!z10 || i11 == wb2.c() || i11 == 2) {
                        collection.add(wb3.a(i11, i12));
                    }
                    if (!z10 && f7737d[wb2.c()][i11] >= 0) {
                        collection.add(wb3.b(i11, i12));
                    }
                }
            }
            int[][] iArr3 = f7736c;
            if (com.huawei.hms.scankit.util.b.a(iArr3, wb2.c()) && com.huawei.hms.scankit.util.b.a(iArr3[wb2.c()], (int) c10)) {
                if (wb2.a() > 0 || iArr3[wb2.c()][c10] == 0) {
                    collection.add(wb2.a(i10));
                }
            }
        }
    }

    public C0732x a() {
        int i10;
        Collection<Wb> singletonList = Collections.singletonList(Wb.f7764a);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f7738e;
            if (i11 >= bArr.length) {
                return ((Wb) Collections.min(singletonList, new a())).a(this.f7738e);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 == 13) {
                if (b10 == 10) {
                    i10 = 2;
                }
                i10 = 0;
            } else if (b11 == 44) {
                if (b10 == 32) {
                    i10 = 4;
                }
                i10 = 0;
            } else if (b11 != 46) {
                if (b11 == 58 && b10 == 32) {
                    i10 = 5;
                }
                i10 = 0;
            } else {
                if (b10 == 32) {
                    i10 = 3;
                }
                i10 = 0;
            }
            if (i10 > 0) {
                singletonList = a(singletonList, i11, i10);
                i11 = i12;
            } else {
                singletonList = a(singletonList, i11);
            }
            i11++;
        }
    }
}
