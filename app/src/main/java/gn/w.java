package gn;

import cn.sharesdk.framework.Platform;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a */
    public int f15678a;

    /* renamed from: b */
    public final int[] f15679b = new int[10];

    public final int a() {
        return (this.f15678a & 128) != 0 ? this.f15679b[7] : Platform.CUSTOMER_ACTION_MASK;
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f15679b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f15678a = (1 << i10) | this.f15678a;
            iArr[i10] = i11;
        }
    }
}
