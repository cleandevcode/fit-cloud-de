package jj;

/* loaded from: classes2.dex */
public final class l1 extends gm.m implements fm.l<bj.b, int[]> {

    /* renamed from: b */
    public static final l1 f17940b = new l1();

    public l1() {
        super(1);
    }

    @Override // fm.l
    public final int[] k(bj.b bVar) {
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 2) {
            int i10 = 0;
            int i11 = bi.r.i(bArr, 0, 2);
            int[] iArr = new int[i11];
            if (i11 > 0) {
                if (bArr.length >= (i11 + 1) * 2) {
                    while (i10 < i11) {
                        int i12 = i10 + 1;
                        iArr[i10] = bi.r.i(bArr, i12 * 2, 2);
                        i10 = i12;
                    }
                } else {
                    throw new yi.f(bVar2);
                }
            }
            return iArr;
        }
        throw new yi.f(bVar2);
    }
}
