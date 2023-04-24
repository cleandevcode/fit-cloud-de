package wj;

import fl.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class o extends ti.f<List<? extends qj.b>> {

    /* loaded from: classes2.dex */
    public final class a extends ti.g<bj.b, List<? extends qj.b>> {

        /* renamed from: d */
        public final ArrayList<byte[]> f29996d;

        /* renamed from: e */
        public byte f29997e;

        public a(g.a aVar, ej.a aVar2) {
            super(aVar, aVar2);
            this.f29996d = new ArrayList<>(7);
        }

        @Override // tk.n
        public final void b(Object obj) {
            bj.b bVar = (bj.b) obj;
            gm.l.f(bVar, "packet");
            try {
                c(bVar);
            } catch (Exception e10) {
                h7.a.y(e10);
                onError(e10);
            }
        }

        public final void c(bj.b bVar) {
            byte b10 = bVar.f4398b;
            byte b11 = this.f29997e;
            if ((b11 == 0 && b10 == 81) || b10 - b11 == 1) {
                byte[] bArr = bVar.f4399c;
                if (bArr != null) {
                    this.f29996d.add(bArr);
                }
                this.f29997e = b10;
                if (b10 == 87) {
                    List a10 = yj.b.a(new oj.o(2, this.f29996d, new nj.c(null)), new zj.d(1));
                    if (a10 != null) {
                        ((g.a) this.f28258a).d(a10);
                    }
                    onComplete();
                    return;
                }
                return;
            }
            onError(new yi.i());
        }
    }

    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(aVar, aVar2);
        cj.h hVar = (cj.h) aVar3;
        new fl.t(hVar.d(), new n(0, p.f29998b)).C(10L, TimeUnit.SECONDS).d(aVar4);
        try {
            hVar.g(new bj.b((byte) 5, (byte) 80, null), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
