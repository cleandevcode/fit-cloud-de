package jj;

/* loaded from: classes2.dex */
public final class i1 extends gm.m implements fm.l<bj.b, sj.d> {

    /* renamed from: b */
    public static final i1 f17908b = new i1();

    public i1() {
        super(1);
    }

    @Override // fm.l
    public final sj.d k(bj.b bVar) {
        sj.e eVar;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 7) {
            int i10 = bArr[0] & 255;
            int i11 = bArr[1] & 255;
            int i12 = bi.r.i(bArr, 2, 2);
            int i13 = bi.r.i(bArr, 4, 2);
            int i14 = bArr[6] & 255;
            if (i11 == 0) {
                eVar = new sj.e(0, i12, i13, i14);
            } else {
                eVar = new sj.e(1, i12, i12, 0);
            }
            return new sj.d(i10, eVar);
        }
        throw new yi.f(bVar2);
    }
}
