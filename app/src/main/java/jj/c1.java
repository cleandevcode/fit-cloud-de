package jj;

/* loaded from: classes2.dex */
public final class c1 extends gm.m implements fm.l<bj.b, rj.b> {

    /* renamed from: b */
    public static final c1 f17880b = new c1();

    public c1() {
        super(1);
    }

    @Override // fm.l
    public final rj.b k(bj.b bVar) {
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 3) {
            boolean z10 = false;
            if (bArr[0] == 1) {
                z10 = true;
            }
            return new rj.b(bArr[1], bArr[2], z10);
        }
        throw new yi.f(bVar2);
    }
}
