package wj;

import bi.m0;
import fl.g;
import fl.y0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j extends ti.f<oj.d> {

    /* renamed from: a */
    public final int f29984a;

    /* renamed from: b */
    public final int f29985b;

    /* renamed from: c */
    public final boolean f29986c;

    /* renamed from: d */
    public final boolean f29987d;

    /* renamed from: e */
    public final boolean f29988e;

    /* renamed from: f */
    public final boolean f29989f;

    /* loaded from: classes2.dex */
    public final class a extends ti.g<bj.b, oj.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g.a aVar, ej.a aVar2) {
            super(aVar, aVar2);
            j.this = r1;
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
            float f10;
            int i10;
            float f11;
            byte[] bArr = bVar.f4399c;
            if (bArr != null) {
                int i11 = 11;
                if (bArr.length >= 11) {
                    int i12 = bArr[6] & 255;
                    int i13 = bArr[7] & 255;
                    int i14 = bArr[8] & 255;
                    int i15 = bArr[9] & 255;
                    int i16 = bArr[10] & 255;
                    j jVar = j.this;
                    float f12 = 0.0f;
                    if (jVar.f29986c) {
                        if (bArr.length >= 16) {
                            if (jVar.f29988e) {
                                int i17 = bArr[11] & 255;
                                if (i17 <= 1) {
                                    float k10 = bi.r.k(bArr, 12) / 100.0f;
                                    f12 = bi.r.k(bArr, 14) / 100.0f;
                                    f11 = k10;
                                } else {
                                    throw new yi.j(i17);
                                }
                            } else {
                                f11 = 0.0f;
                            }
                            f10 = f12;
                            f12 = f11;
                            i11 = 16;
                        } else {
                            throw new yi.f(bVar);
                        }
                    } else {
                        f10 = 0.0f;
                    }
                    if (j.this.f29987d) {
                        if (bArr.length >= i11 + 1) {
                            i10 = bArr[i11] & 255;
                        } else {
                            throw new yi.f(bVar);
                        }
                    } else {
                        i10 = 0;
                    }
                    ((g.a) this.f28258a).d(new oj.d(i12, i13, i14, i15, i16, f12, f10, i10));
                    if (j.this.f29989f && i14 > 0 && i15 > 0) {
                        onComplete();
                        return;
                    }
                    return;
                }
            }
            throw new yi.f(bVar);
        }
    }

    public j(int i10, int i11, nj.c cVar) {
        gm.l.f(cVar, "deviceInfo");
        this.f29984a = i10;
        this.f29985b = i11;
        this.f29986c = cVar.g(10);
        this.f29987d = cVar.g(13);
        this.f29988e = m0.w(i10, 32);
        this.f29989f = i10 == 4 && cVar.g(21);
    }

    @Override // ti.f
    public final void c(g.a aVar, final ej.a aVar2, final cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(aVar, aVar2);
        cj.h hVar = (cj.h) aVar3;
        new y0(new fl.t(hVar.d(), new dj.c(2, k.f29991b)), tk.i.D(this.f29985b, TimeUnit.MINUTES)).l(new wk.a() { // from class: wj.h
            @Override // wk.a
            public final void run() {
                cj.a aVar5 = cj.a.this;
                j jVar = this;
                ej.a aVar6 = aVar2;
                gm.l.f(aVar5, "$fcProtocolQueue");
                gm.l.f(jVar, "this$0");
                gm.l.f(aVar6, "$releaseSemaphore");
                ((cj.h) aVar5).g(xj.a.a(jVar.f29984a, 0, false), aVar6);
            }
        }).j(new wk.a() { // from class: wj.i
            @Override // wk.a
            public final void run() {
                cj.a aVar5 = cj.a.this;
                j jVar = this;
                ej.a aVar6 = aVar2;
                gm.l.f(aVar5, "$fcProtocolQueue");
                gm.l.f(jVar, "this$0");
                gm.l.f(aVar6, "$releaseSemaphore");
                ((cj.h) aVar5).g(xj.a.a(jVar.f29984a, 0, false), aVar6);
            }
        }).d(aVar4);
        try {
            hVar.g(xj.a.a(this.f29984a, this.f29985b, true), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
