package a0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a */
    public final ArrayList f211a = new ArrayList();

    public static void b(ArrayList arrayList, int i10, int[] iArr, int i11) {
        boolean z10;
        if (i11 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    z10 = false;
                    break;
                } else if (i12 == iArr[i13]) {
                    z10 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (!z10) {
                iArr[i11] = i12;
                b(arrayList, i10, iArr, i11 + 1);
            }
        }
    }

    public final void a(h hVar) {
        this.f211a.add(hVar);
    }
}
