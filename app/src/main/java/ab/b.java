package ab;

import android.os.Bundle;
import androidx.fragment.app.b1;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import cn.sharesdk.framework.InnerShareParams;
import d6.m0;
import gm.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import sa.p;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a */
    public static final int[] f438a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static final y0 b(tl.d dVar) {
        return (y0) dVar.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.os.Bundle c(java.util.UUID r9, r6.d r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.c(java.util.UUID, r6.d, boolean):android.os.Bundle");
    }

    public static Bundle d(r6.d dVar, boolean z10) {
        boolean z11;
        String str;
        Bundle bundle = new Bundle();
        m0 m0Var = m0.f12709a;
        m0.J(bundle, "LINK", dVar.f25353a);
        m0.I(bundle, "PLACE", dVar.f25355c);
        m0.I(bundle, "PAGE", dVar.f25356d);
        m0.I(bundle, "REF", dVar.f25357e);
        m0.I(bundle, "REF", dVar.f25357e);
        bundle.putBoolean("DATA_FAILURES_FATAL", z10);
        List<String> list = dVar.f25354b;
        if (list != null && !list.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        r6.e eVar = dVar.f25358f;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f25365a;
        }
        m0.I(bundle, InnerShareParams.HASHTAG, str);
        return bundle;
    }

    public static final /* synthetic */ t0 e(r rVar, gm.e eVar, fm.a aVar, fm.a aVar2) {
        l.f(rVar, "<this>");
        return f(rVar, eVar, aVar, new b1(rVar), aVar2);
    }

    public static final t0 f(r rVar, gm.e eVar, fm.a aVar, fm.a aVar2, fm.a aVar3) {
        l.f(rVar, "<this>");
        return new t0(eVar, aVar, aVar3, aVar2);
    }

    public static void g(bb.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.b(i14, i13);
                    bVar.b(i14, i15);
                    bVar.b(i13, i14);
                    bVar.b(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.b(i16, i16);
        int i17 = i16 + 1;
        bVar.b(i17, i16);
        bVar.b(i16, i17);
        int i18 = i10 + i11;
        bVar.b(i18, i16);
        bVar.b(i18, i17);
        bVar.b(i18, i18 - 1);
    }

    public static bb.a h(bb.a aVar, int i10, int i11) {
        cb.a aVar2;
        int i12;
        int i13 = aVar.f4127b / i11;
        if (i11 != 4) {
            if (i11 != 6) {
                if (i11 != 8) {
                    if (i11 != 10) {
                        if (i11 == 12) {
                            aVar2 = cb.a.f4595g;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
                        }
                    } else {
                        aVar2 = cb.a.f4596h;
                    }
                } else {
                    aVar2 = cb.a.f4600l;
                }
            } else {
                aVar2 = cb.a.f4597i;
            }
        } else {
            aVar2 = cb.a.f4598j;
        }
        m2.l lVar = new m2.l(aVar2);
        int i14 = i10 / i11;
        int[] iArr = new int[i14];
        int i15 = aVar.f4127b / i11;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                if (aVar.d((i16 * i11) + i18)) {
                    i12 = 1 << ((i11 - i18) - 1);
                } else {
                    i12 = 0;
                }
                i17 |= i12;
            }
            iArr[i16] = i17;
        }
        lVar.a(i14 - i13, iArr);
        bb.a aVar3 = new bb.a();
        aVar3.b(0, i10 % i11);
        for (int i19 = 0; i19 < i14; i19++) {
            aVar3.b(iArr[i19], i11);
        }
        return aVar3;
    }

    public static bb.a i(int i10, bb.a aVar) {
        bb.a aVar2 = new bb.a();
        int i11 = aVar.f4127b;
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.d(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 != i12) {
                if (i17 == 0) {
                    i17 = i14 | 1;
                } else {
                    aVar2.b(i14, i10);
                    i13 += i10;
                }
            }
            aVar2.b(i17, i10);
            i13--;
            i13 += i10;
        }
        return aVar2;
    }

    @Override // sa.p
    public Object a() {
        return new LinkedHashSet();
    }
}
