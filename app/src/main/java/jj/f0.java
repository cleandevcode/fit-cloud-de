package jj;

/* loaded from: classes2.dex */
public final class f0 extends gm.m implements fm.l<bj.b, Integer> {

    /* renamed from: b */
    public static final f0 f17894b = new f0();

    public f0() {
        super(1);
    }

    @Override // fm.l
    public final Integer k(bj.b bVar) {
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 4) {
            return Integer.valueOf(bi.r.i(bArr, 0, 4));
        }
        throw new yi.f(bVar2);
    }
}
