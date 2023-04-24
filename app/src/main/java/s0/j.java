package s0;

/* loaded from: classes.dex */
public final class j implements c4.g {

    /* renamed from: a */
    public static boolean[] f26393a = new boolean[3];

    public static void c(e eVar, q0.c cVar, d dVar) {
        dVar.f26342p = -1;
        dVar.f26344q = -1;
        if (eVar.V[0] != 2 && dVar.V[0] == 4) {
            int i10 = dVar.K.f26300g;
            int r10 = eVar.r() - dVar.M.f26300g;
            c cVar2 = dVar.K;
            cVar2.f26302i = cVar.l(cVar2);
            c cVar3 = dVar.M;
            cVar3.f26302i = cVar.l(cVar3);
            cVar.d(dVar.K.f26302i, i10);
            cVar.d(dVar.M.f26302i, r10);
            dVar.f26342p = 2;
            dVar.f26315b0 = i10;
            int i11 = r10 - i10;
            dVar.X = i11;
            int i12 = dVar.f26321e0;
            if (i11 < i12) {
                dVar.X = i12;
            }
        }
        if (eVar.V[1] != 2 && dVar.V[1] == 4) {
            int i13 = dVar.L.f26300g;
            int l10 = eVar.l() - dVar.N.f26300g;
            c cVar4 = dVar.L;
            cVar4.f26302i = cVar.l(cVar4);
            c cVar5 = dVar.N;
            cVar5.f26302i = cVar.l(cVar5);
            cVar.d(dVar.L.f26302i, i13);
            cVar.d(dVar.N.f26302i, l10);
            if (dVar.f26319d0 > 0 || dVar.f26331j0 == 8) {
                c cVar6 = dVar.O;
                cVar6.f26302i = cVar.l(cVar6);
                cVar.d(dVar.O.f26302i, dVar.f26319d0 + i13);
            }
            dVar.f26344q = 2;
            dVar.f26317c0 = i13;
            int i14 = l10 - i13;
            dVar.Y = i14;
            int i15 = dVar.f26323f0;
            if (i14 < i15) {
                dVar.Y = i15;
            }
        }
    }

    public static final boolean d(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    @Override // c4.g
    public void a() {
        gm.j.e("AliAgentImpl", "发送飞鸟盾成功.");
    }

    @Override // c4.g
    public void b(int i10, String str) {
        gm.j.e("AliAgentImpl", "发送飞鸟盾失败.  msg ==> " + str + " errorCode ==> " + i10);
    }
}
