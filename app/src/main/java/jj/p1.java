package jj;

/* loaded from: classes2.dex */
public final class p1 extends gm.m implements fm.l<bj.b, Boolean> {

    /* renamed from: b */
    public static final p1 f17959b = new p1();

    public p1() {
        super(1);
    }

    @Override // fm.l
    public final Boolean k(bj.b bVar) {
        boolean z10;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null) {
            boolean z11 = true;
            if (bArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (bArr[0] != 0) {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }
        throw new yi.f(bVar2);
    }
}
