package z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final int[] f31854a;

    /* renamed from: b */
    public final float[] f31855b;

    public e(int i10, int i11) {
        this.f31854a = new int[]{i10, i11};
        this.f31855b = new float[]{0.0f, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f31854a = new int[]{i10, i11, i12};
        this.f31855b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f31854a = new int[size];
        this.f31855b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f31854a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f31855b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }
}
