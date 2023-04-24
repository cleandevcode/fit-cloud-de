package m2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class l implements x8.o {

    /* renamed from: a */
    public Object f20215a;

    /* renamed from: b */
    public Object f20216b;

    public l(int i10) {
        if (i10 != 2) {
            this.f20215a = new HashMap();
            this.f20216b = new HashMap();
            return;
        }
        this.f20215a = new AtomicReference();
        this.f20216b = new o0.b();
    }

    public /* synthetic */ l(cb.a aVar) {
        this.f20215a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f20216b = arrayList;
        arrayList.add(new cb.b(aVar, new int[]{1}));
    }

    public /* synthetic */ l(h8.h hVar, g9.h hVar2) {
        this.f20215a = hVar;
        this.f20216b = hVar2;
    }

    public /* synthetic */ l(jc.x xVar, jc.c cVar) {
        gm.l.f(xVar, "pb");
        gm.l.f(cVar, "chainTask");
        this.f20215a = xVar;
        this.f20216b = cVar;
    }

    public final void a(int i10, int[] iArr) {
        cb.b bVar;
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                char c10 = 0;
                int i11 = 1;
                if (i10 >= ((List) this.f20216b).size()) {
                    List list = (List) this.f20216b;
                    cb.b bVar2 = (cb.b) list.get(list.size() - 1);
                    int size = ((List) this.f20216b).size();
                    while (size <= i10) {
                        cb.a aVar = (cb.a) this.f20215a;
                        int[] iArr2 = new int[2];
                        iArr2[c10] = i11;
                        iArr2[i11] = aVar.f4601a[(size - 1) + aVar.f4606f];
                        cb.b bVar3 = new cb.b(aVar, iArr2);
                        if (bVar2.f4607a.equals(aVar)) {
                            if (!bVar2.b() && !bVar3.b()) {
                                int[] iArr3 = bVar2.f4608b;
                                int length2 = iArr3.length;
                                int[] iArr4 = bVar3.f4608b;
                                int length3 = iArr4.length;
                                int[] iArr5 = new int[(length2 + length3) - 1];
                                for (int i12 = 0; i12 < length2; i12++) {
                                    int i13 = iArr3[i12];
                                    int i14 = 0;
                                    while (i14 < length3) {
                                        int i15 = i12 + i14;
                                        iArr5[i15] = bVar2.f4607a.a(i13, iArr4[i14]) ^ iArr5[i15];
                                        i14++;
                                        iArr3 = iArr3;
                                    }
                                }
                                bVar2 = new cb.b(bVar2.f4607a, iArr5);
                            } else {
                                bVar2 = bVar2.f4607a.f4603c;
                            }
                            ((List) this.f20216b).add(bVar2);
                            size++;
                            c10 = 0;
                            i11 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                cb.b bVar4 = (cb.b) ((List) this.f20216b).get(i10);
                int[] iArr6 = new int[length];
                System.arraycopy(iArr, 0, iArr6, 0, length);
                cb.b c11 = new cb.b((cb.a) this.f20215a, iArr6).c(i10, 1);
                if (c11.f4607a.equals(bVar4.f4607a)) {
                    if (!bVar4.b()) {
                        cb.a aVar2 = c11.f4607a;
                        cb.b bVar5 = aVar2.f4603c;
                        int[] iArr7 = bVar4.f4608b;
                        int i16 = iArr7[(iArr7.length - 1) - (iArr7.length - 1)];
                        if (i16 != 0) {
                            int i17 = aVar2.f4601a[(aVar2.f4604d - aVar2.f4602b[i16]) - 1];
                            cb.b bVar6 = c11;
                            while (bVar6.f4608b.length - 1 >= bVar4.f4608b.length - 1 && !bVar6.b()) {
                                int[] iArr8 = bVar6.f4608b;
                                int length4 = (iArr8.length - 1) - (bVar4.f4608b.length - 1);
                                int a10 = c11.f4607a.a(iArr8[(iArr8.length - 1) - (iArr8.length - 1)], i17);
                                cb.b c12 = bVar4.c(length4, a10);
                                cb.a aVar3 = c11.f4607a;
                                aVar3.getClass();
                                if (length4 >= 0) {
                                    if (a10 == 0) {
                                        bVar = aVar3.f4603c;
                                    } else {
                                        int[] iArr9 = new int[length4 + 1];
                                        iArr9[0] = a10;
                                        bVar = new cb.b(aVar3, iArr9);
                                    }
                                    bVar5 = bVar5.a(bVar);
                                    bVar6 = bVar6.a(c12);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            int[] iArr10 = bVar6.f4608b;
                            int length5 = i10 - iArr10.length;
                            for (int i18 = 0; i18 < length5; i18++) {
                                iArr[length + i18] = 0;
                            }
                            System.arraycopy(iArr10, 0, iArr, length + length5, iArr10.length);
                            return;
                        }
                        aVar2.getClass();
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    @Override // x8.o
    public final void b(h8.h hVar) {
        throw new IllegalStateException();
    }

    @Override // x8.o
    public final h8.h c() {
        return (h8.h) this.f20215a;
    }

    @Override // x8.o
    public final void p() {
        g9.t tVar = ((g9.h) this.f20216b).f15034a;
        synchronized (tVar.f15057a) {
            if (!tVar.f15059c) {
                tVar.f15059c = true;
                tVar.f15061e = null;
                tVar.f15058b.b(tVar);
            }
        }
    }

    public l(ck.a aVar) {
        this.f20215a = aVar;
        this.f20216b = aVar.f4919o;
    }
}
