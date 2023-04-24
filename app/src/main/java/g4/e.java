package g4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public int f14971a;

    /* renamed from: b */
    public int f14972b;

    /* renamed from: c */
    public int f14973c;

    /* renamed from: d */
    public int[] f14974d;

    public final void a(int i10, int i11, int i12) {
        if (this.f14974d == null) {
            this.f14974d = new int[6];
        }
        int i13 = this.f14973c;
        int[] iArr = this.f14974d;
        if (i13 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f14974d = iArr2;
        }
        int[] iArr3 = this.f14974d;
        int i14 = this.f14973c;
        int i15 = i14 + 1;
        iArr3[i14] = i10;
        this.f14973c = i15 + 1;
        iArr3[i15] = i11 | i12;
    }
}
