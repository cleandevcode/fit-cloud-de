package wj;

import fl.g;
import fl.y0;
import java.util.concurrent.TimeUnit;
import wj.e;

/* loaded from: classes2.dex */
public final class g extends gm.m implements fm.l<bj.b, tk.l<? extends byte[]>> {

    /* renamed from: b */
    public final /* synthetic */ e.a f29976b;

    /* renamed from: c */
    public final /* synthetic */ cj.a f29977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e.a aVar, cj.a aVar2) {
        super(1);
        this.f29976b = aVar;
        this.f29977c = aVar2;
    }

    @Override // fm.l
    public final tk.l<? extends byte[]> k(bj.b bVar) {
        boolean z10;
        bj.b bVar2 = bVar;
        byte[] bArr = bVar2.f4399c;
        if (bArr != null && bArr.length >= 2) {
            if (bArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                byte b10 = bArr[1];
                if (b10 > 0) {
                    ((g.a) this.f29976b.f28258a).d(new int[]{1000 / b10});
                } else {
                    ((g.a) this.f29976b.f28258a).d(new int[]{100});
                }
                ((cj.h) this.f29977c).f4898l = true;
                return new y0(((cj.h) this.f29977c).e(), tk.i.D(33L, TimeUnit.SECONDS));
            }
            throw new yi.d();
        }
        throw new yi.f(bVar2);
    }
}
