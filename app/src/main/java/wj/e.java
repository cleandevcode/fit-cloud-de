package wj;

import cn.sharesdk.framework.Platform;
import fl.g;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e extends ti.f<int[]> {

    /* loaded from: classes2.dex */
    public final class a extends ti.g<byte[], int[]> {

        /* renamed from: d */
        public final cj.a f29973d;

        /* renamed from: e */
        public byte[] f29974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g.a aVar, ej.a aVar2, cj.a aVar3) {
            super(aVar, aVar2);
            gm.l.f(aVar3, "fcProtocolQueue");
            this.f29973d = aVar3;
        }

        @Override // tk.n
        public final void b(Object obj) {
            byte[] bArr = (byte[]) obj;
            gm.l.f(bArr, "data");
            try {
                c(bArr);
            } catch (Exception e10) {
                h7.a.y(e10);
                onError(e10);
            }
        }

        public final void c(byte[] bArr) {
            boolean z10;
            byte[] bArr2 = this.f29974e;
            boolean z11 = true;
            if (bArr2 != null) {
                if (bArr.length == 15 && bArr[0] == 5 && bArr[1] == 0 && bArr[2] == 65 && bArr[3] == 0 && bArr[4] == 10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (bArr[5] != 1) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f29974e = null;
                        return;
                    }
                    int i10 = ((bArr2[6] << 8) | (bArr2[7] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                    ((cj.h) this.f29973d).f4898l = false;
                    new bl.g(((cj.h) this.f29973d).f(i10)).f();
                    onComplete();
                    return;
                }
            }
            if (bArr2 != null) {
                int length = bArr2.length / 2;
                int[] iArr = new int[length];
                for (int i11 = 0; i11 < length; i11++) {
                    iArr[i11] = bi.r.i(bArr2, i11 * 2, 2);
                }
                ((g.a) this.f28258a).d(iArr);
                this.f29974e = null;
            }
            if ((bArr.length == 8 && bArr[0] == -85 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 15) ? false : false) {
                this.f29974e = bArr;
                return;
            }
            int length2 = bArr.length / 2;
            int[] iArr2 = new int[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                iArr2[i12] = bi.r.i(bArr, i12 * 2, 2);
            }
            ((g.a) this.f28258a).d(iArr2);
        }
    }

    @Override // ti.f
    public final void c(g.a aVar, final ej.a aVar2, final cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(aVar, aVar2, aVar3);
        cj.h hVar = (cj.h) aVar3;
        new el.e(new fl.q(new fl.t(hVar.d(), new ti.a(1, f.f29975b)).C(10L, TimeUnit.SECONDS)), new og.u(9, new g(aVar4, aVar3))).l(new wk.a() { // from class: wj.c
            @Override // wk.a
            public final void run() {
                cj.a aVar5 = cj.a.this;
                ej.a aVar6 = aVar2;
                gm.l.f(aVar5, "$fcProtocolQueue");
                gm.l.f(aVar6, "$releaseSemaphore");
                cj.h hVar2 = (cj.h) aVar5;
                hVar2.f4898l = false;
                hVar2.g(xj.a.a(16, 0, false), aVar6);
            }
        }).j(new wk.a() { // from class: wj.d
            @Override // wk.a
            public final void run() {
                cj.a aVar5 = cj.a.this;
                ej.a aVar6 = aVar2;
                gm.l.f(aVar5, "$fcProtocolQueue");
                gm.l.f(aVar6, "$releaseSemaphore");
                cj.h hVar2 = (cj.h) aVar5;
                hVar2.f4898l = false;
                hVar2.g(xj.a.a(16, 0, false), aVar6);
            }
        }).d(aVar4);
        try {
            hVar.g(xj.a.a(16, 0, true), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
