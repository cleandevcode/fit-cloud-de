package jj;

/* loaded from: classes2.dex */
public final class e0 extends gm.m implements fm.l<bj.b, tk.c> {

    /* renamed from: b */
    public static final e0 f17891b = new e0();

    public e0() {
        super(1);
    }

    @Override // fm.l
    public final tk.c k(bj.b bVar) {
        yi.h hVar;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 4) {
            int i10 = bArr[0] & 255;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return new bl.c(new yi.h(0));
                    }
                    hVar = new yi.h(2);
                } else {
                    hVar = new yi.h(1);
                }
                return new bl.c(hVar);
            }
            return bl.b.f4448a;
        }
        throw new yi.f(bVar2);
    }
}
