package jj;

/* loaded from: classes2.dex */
public final class m1 extends gm.m implements fm.l<bj.b, rj.e> {

    /* renamed from: b */
    public static final m1 f17946b = new m1();

    public m1() {
        super(1);
    }

    @Override // fm.l
    public final rj.e k(bj.b bVar) {
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 6) {
            return new rj.e(bi.r.i(bArr, 0, 2), bi.r.i(bArr, 2, 2), bi.r.i(bArr, 4, 2));
        }
        throw new yi.f(bVar2);
    }
}
