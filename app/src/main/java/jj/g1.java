package jj;

/* loaded from: classes2.dex */
public final class g1 extends gm.m implements fm.l<bj.b, Integer> {

    /* renamed from: b */
    public static final g1 f17898b = new g1();

    public g1() {
        super(1);
    }

    @Override // fm.l
    public final Integer k(bj.b bVar) {
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 2) {
            byte b10 = 0;
            if (bArr[0] != 0) {
                b10 = bArr[1];
            }
            return Integer.valueOf(b10);
        }
        throw new yi.f(bVar2);
    }
}
