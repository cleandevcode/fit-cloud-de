package wj;

import fl.g;
import fl.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jj.d0;
import jj.g0;

/* loaded from: classes2.dex */
public final class t extends ti.f<List<? extends byte[]>> {

    /* renamed from: a */
    public final int f30009a;

    /* renamed from: b */
    public final d0.a f30010b;

    /* renamed from: c */
    public boolean f30011c;

    /* renamed from: d */
    public final ArrayList<byte[]> f30012d;

    /* loaded from: classes2.dex */
    public final class a extends ti.g<bj.b, List<? extends byte[]>> {

        /* renamed from: d */
        public final ej.a f30013d;

        /* renamed from: e */
        public final cj.a f30014e;

        /* renamed from: f */
        public final /* synthetic */ t f30015f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, g.a aVar, ej.a aVar2, cj.a aVar3) {
            super(aVar, aVar2);
            gm.l.f(aVar3, "fcProtocolQueue");
            this.f30015f = tVar;
            this.f30013d = aVar2;
            this.f30014e = aVar3;
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
            int i10;
            boolean z10;
            byte b10 = bVar.f4398b;
            if (b10 == 7) {
                this.f30015f.f30011c = true;
                return;
            }
            t tVar = this.f30015f;
            if (!tVar.f30011c) {
                int i11 = this.f30015f.f30009a;
                onError(new yi.i());
            } else if (b10 == 48) {
                byte[] bArr = bVar.f4399c;
                if (bArr != null) {
                    tVar.f30012d.add(bArr);
                    ((g0) tVar.f30010b).a(bArr.length);
                }
            } else if (b10 == 8) {
                byte[] bArr2 = bVar.f4399c;
                if (bArr2 != null && bArr2.length == 4) {
                    i10 = bi.r.i(bArr2, 0, 4);
                } else {
                    i10 = 0;
                }
                Iterator<byte[]> it = this.f30015f.f30012d.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    i12 += it.next().length;
                }
                if (i10 == i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((cj.h) this.f30014e).g(new bj.b((byte) 5, (byte) 32, z10 ? new byte[]{0} : new byte[]{1}), this.f30013d);
                if (z10) {
                    ((g.a) this.f28258a).d(this.f30015f.f30012d);
                    onComplete();
                    return;
                }
                int i13 = this.f30015f.f30009a;
                onError(new yi.i());
            }
        }
    }

    public t(int i10, g0 g0Var) {
        gm.l.f(g0Var, "listener");
        this.f30009a = i10;
        this.f30010b = g0Var;
        this.f30012d = new ArrayList<>(128);
    }

    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(this, aVar, aVar2, aVar3);
        cj.h hVar = (cj.h) aVar3;
        new z0(new fl.t(hVar.d(), new ti.a(3, u.f30016b)).C(10L, TimeUnit.SECONDS), new n(1, v.f30017b)).d(aVar4);
        try {
            hVar.g(new bj.b((byte) 5, (byte) 1, new byte[]{(byte) this.f30009a}), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
