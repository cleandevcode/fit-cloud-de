package wj;

import cn.sharesdk.framework.Platform;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import fl.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jj.d0;
import jj.g0;
import l2.o0;

/* loaded from: classes2.dex */
public final class r extends ti.f<List<? extends byte[]>> {

    /* renamed from: a */
    public final d0.a f29999a;

    /* renamed from: b */
    public final int f30000b;

    /* renamed from: c */
    public boolean f30001c;

    /* renamed from: d */
    public ArrayList<byte[]> f30002d;

    /* loaded from: classes2.dex */
    public final class a extends ti.g<byte[], List<? extends byte[]>> {

        /* renamed from: d */
        public final ej.a f30003d;

        /* renamed from: e */
        public final cj.a f30004e;

        /* renamed from: f */
        public byte[] f30005f;

        /* renamed from: g */
        public final /* synthetic */ r f30006g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, g.a aVar, ej.a aVar2, cj.a aVar3) {
            super(aVar, aVar2);
            gm.l.f(aVar3, "fcProtocolQueue");
            this.f30006g = rVar;
            this.f30003d = aVar2;
            this.f30004e = aVar3;
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
            boolean z11;
            r rVar = this.f30006g;
            if (!rVar.f30001c) {
                int i10 = this.f30006g.f30000b;
                onError(new yi.i());
                return;
            }
            byte[] bArr2 = this.f30005f;
            boolean z12 = true;
            if (bArr2 != null) {
                if (bArr.length == 9 && bArr[0] == 5 && bArr[1] == 0 && bArr[2] == 8 && bArr[3] == 0 && bArr[4] == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i11 = ((bArr2[6] << 8) | (bArr2[7] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                    int i12 = bi.r.i(bArr, 5, 4);
                    ArrayList<byte[]> arrayList = this.f30006g.f30002d;
                    if (arrayList != null) {
                        Iterator<byte[]> it = arrayList.iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            i13 += it.next().length;
                        }
                        if (i12 == i13) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ((cj.h) this.f30004e).f4898l = false;
                        new bl.g(((cj.h) this.f30004e).f(i11)).f();
                        cj.a aVar = this.f30004e;
                        byte[] bArr3 = new byte[1];
                        if (z11) {
                            bArr3[0] = 0;
                        } else {
                            bArr3[0] = 1;
                        }
                        ((cj.h) aVar).g(new bj.b((byte) 5, (byte) 32, bArr3), this.f30003d);
                        if (z11) {
                            Object obj = this.f28258a;
                            ArrayList<byte[]> arrayList2 = this.f30006g.f30002d;
                            if (arrayList2 != null) {
                                ((g.a) obj).d(arrayList2);
                                onComplete();
                                return;
                            }
                            gm.l.l(WiseOpenHianalyticsData.UNION_RESULT);
                            throw null;
                        }
                        int i14 = this.f30006g.f30000b;
                        onError(new yi.i());
                        return;
                    }
                    gm.l.l(WiseOpenHianalyticsData.UNION_RESULT);
                    throw null;
                }
            }
            if (bArr2 != null) {
                ArrayList<byte[]> arrayList3 = rVar.f30002d;
                if (arrayList3 != null) {
                    arrayList3.add(bArr2);
                    ((g0) this.f30006g.f29999a).a(bArr.length);
                    this.f30005f = null;
                } else {
                    gm.l.l(WiseOpenHianalyticsData.UNION_RESULT);
                    throw null;
                }
            }
            if ((bArr.length == 8 && bArr[0] == -85 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 9) ? false : false) {
                this.f30005f = bArr;
                return;
            }
            ArrayList<byte[]> arrayList4 = this.f30006g.f30002d;
            if (arrayList4 != null) {
                arrayList4.add(bArr);
                ((g0) this.f30006g.f29999a).a(bArr.length);
                return;
            }
            gm.l.l(WiseOpenHianalyticsData.UNION_RESULT);
            throw null;
        }
    }

    public r(g0 g0Var) {
        gm.l.f(g0Var, "listener");
        this.f29999a = g0Var;
        this.f30000b = 7;
    }

    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(this, aVar, aVar2, aVar3);
        cj.h hVar = (cj.h) aVar3;
        new el.e(new fl.q(new fl.t(hVar.d(), new o0()).C(10L, TimeUnit.SECONDS)), new wi.i(6, new s(this, aVar3))).l(new oc.n(2, aVar3)).j(new uh.d0(3, aVar3)).d(aVar4);
        try {
            hVar.g(new bj.b((byte) 5, (byte) 1, new byte[]{(byte) this.f30000b}), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
