package ln;

import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class p extends ul.c<h> implements RandomAccess {

    /* renamed from: c */
    public static final a f20119c = new a();

    /* renamed from: a */
    public final h[] f20120a;

    /* renamed from: b */
    public final int[] f20121b;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(long j10, e eVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
            int i13;
            int i14;
            e eVar2;
            int i15;
            int i16;
            e eVar3;
            long j11;
            int i17 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(((h) arrayList.get(i18)).d() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            h hVar = (h) arrayList.get(i11);
            h hVar2 = (h) arrayList.get(i12 - 1);
            if (i17 == hVar.d()) {
                int intValue = ((Number) arrayList2.get(i11)).intValue();
                int i19 = i11 + 1;
                h hVar3 = (h) arrayList.get(i19);
                i13 = i19;
                i14 = intValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.g(i17) != hVar2.g(i17)) {
                int i20 = 1;
                for (int i21 = i13 + 1; i21 < i12; i21++) {
                    if (((h) arrayList.get(i21 - 1)).g(i17) != ((h) arrayList.get(i21)).g(i17)) {
                        i20++;
                    }
                }
                long j12 = 4;
                long j13 = (i20 * 2) + (eVar.f20098b / j12) + j10 + 2;
                eVar.i0(i20);
                eVar.i0(i14);
                for (int i22 = i13; i22 < i12; i22++) {
                    int g10 = ((h) arrayList.get(i22)).g(i17);
                    if (i22 == i13 || g10 != ((h) arrayList.get(i22 - 1)).g(i17)) {
                        eVar.i0(g10 & 255);
                    }
                }
                e eVar4 = new e();
                while (i13 < i12) {
                    byte g11 = ((h) arrayList.get(i13)).g(i17);
                    int i23 = i13 + 1;
                    int i24 = i23;
                    while (true) {
                        if (i24 >= i12) {
                            i15 = i12;
                            break;
                        } else if (g11 != ((h) arrayList.get(i24)).g(i17)) {
                            i15 = i24;
                            break;
                        } else {
                            i24++;
                        }
                    }
                    if (i23 == i15 && i17 + 1 == ((h) arrayList.get(i13)).d()) {
                        eVar.i0(((Number) arrayList2.get(i13)).intValue());
                        i16 = i15;
                        eVar3 = eVar4;
                        j11 = j12;
                    } else {
                        eVar.i0(((int) ((eVar4.f20098b / j12) + j13)) * (-1));
                        i16 = i15;
                        eVar3 = eVar4;
                        j11 = j12;
                        a(j13, eVar4, i17 + 1, arrayList, i13, i16, arrayList2);
                    }
                    eVar4 = eVar3;
                    i13 = i16;
                    j12 = j11;
                }
                eVar2 = eVar4;
            } else {
                int min = Math.min(hVar.d(), hVar2.d());
                int i25 = 0;
                for (int i26 = i17; i26 < min && hVar.g(i26) == hVar2.g(i26); i26++) {
                    i25++;
                }
                long j14 = 4;
                long j15 = (eVar.f20098b / j14) + j10 + 2 + i25 + 1;
                eVar.i0(-i25);
                eVar.i0(i14);
                int i27 = i17 + i25;
                while (i17 < i27) {
                    eVar.i0(hVar.g(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (!(i27 == ((h) arrayList.get(i13)).d())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    eVar.i0(((Number) arrayList2.get(i13)).intValue());
                    return;
                }
                eVar2 = new e();
                eVar.i0(((int) ((eVar2.f20098b / j14) + j15)) * (-1));
                a(j15, eVar2, i27, arrayList, i13, i12, arrayList2);
            }
            eVar.B(eVar2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:179:0x0166, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static ln.p b(ln.h... r13) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ln.p.a.b(ln.h[]):ln.p");
        }
    }

    public p(h[] hVarArr, int[] iArr) {
        this.f20120a = hVarArr;
        this.f20121b = iArr;
    }

    @Override // ul.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // ul.a
    public final int e() {
        return this.f20120a.length;
    }

    @Override // ul.c, java.util.List
    public final Object get(int i10) {
        return this.f20120a[i10];
    }

    @Override // ul.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // ul.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
