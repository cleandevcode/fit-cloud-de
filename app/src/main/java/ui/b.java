package ui;

import android.content.Context;
import android.util.Log;
import fl.d0;
import fl.t;
import fm.l;
import gm.j;
import gm.m;
import java.util.ArrayList;
import jj.a1;
import jj.k1;
import jj.r0;
import org.json.JSONException;
import org.json.JSONStringer;
import p000do.a;
import ph.n;
import ph.o;
import rh.b0;
import rh.z;
import wi.k;
import yb.y;
import yk.a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final hj.a f28824a;

    /* renamed from: b */
    public final t3.a f28825b;

    /* renamed from: c */
    public c4.a f28826c;

    /* loaded from: classes2.dex */
    public static final class a extends y {

        /* renamed from: ui.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C0519a extends m implements l<Throwable, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ c4.g f28828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0519a(c4.g gVar) {
                super(1);
                this.f28828b = gVar;
            }

            @Override // fm.l
            public final tl.l k(Throwable th2) {
                this.f28828b.b(0, "");
                return tl.l.f28297a;
            }
        }

        public a() {
            b.this = r1;
        }

        @Override // b4.a
        public final void a(c4.a aVar) {
            gm.l.f(aVar, "iBtDataUploadCallback");
            b.this.f28826c = aVar;
        }

        @Override // b4.a
        public final void b(byte[] bArr, c4.g gVar) {
            tk.c d0Var;
            int i10;
            gm.l.f(bArr, "bytes");
            gm.l.f(gVar, "iSend2BtCallback");
            a.b bVar = p000do.a.f13275a;
            bVar.t("AliAgent");
            bVar.h("Receive Ali data:%s", new String(bArr, om.a.f23623a));
            k1 l10 = b.this.f28824a.l();
            l10.getClass();
            if (h7.a.m(((jj.l) l10.f17918b).f17930d, 299)) {
                d0Var = h7.a.e();
            } else {
                int ceil = (int) Math.ceil(bArr.length / 381);
                ArrayList arrayList = new ArrayList(ceil);
                for (int i11 = 0; i11 < ceil; i11++) {
                    if (i11 == ceil - 1) {
                        i10 = bArr.length - (i11 * 381);
                    } else {
                        i10 = 381;
                    }
                    byte[] bArr2 = new byte[i10 + 6];
                    bArr2[0] = (byte) ceil;
                    bArr2[1] = (byte) i11;
                    bArr2[2] = (byte) ((bArr.length >> 8) & 255);
                    bArr2[3] = (byte) (bArr.length & 255);
                    bArr2[4] = (byte) ((i10 >> 8) & 255);
                    bArr2[5] = (byte) (i10 & 255);
                    System.arraycopy(bArr, i11 * 381, bArr2, 6, i10);
                    arrayList.add(new bj.b((byte) 2, (byte) -99, bArr2));
                }
                d0Var = new d0(((k) l10.f17917a).i(new ti.d(arrayList)));
            }
            d0Var.a(new al.f(new uh.d0(1, gVar), new ph.k(5, new C0519a(gVar))));
        }
    }

    /* renamed from: ui.b$b */
    /* loaded from: classes2.dex */
    public static final class C0520b implements c4.b {
        @Override // c4.b
        public final void a(int i10, String str) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("AliAgent");
            bVar.h("connectLp fail " + str + "->" + i10, new Object[0]);
        }

        @Override // c4.b
        public final void b() {
            a.b bVar = p000do.a.f13275a;
            bVar.t("AliAgent");
            bVar.h("connectLp Disconnected", new Object[0]);
        }

        @Override // c4.b
        public final void c() {
            a.b bVar = p000do.a.f13275a;
            bVar.t("AliAgent");
            bVar.h("connectLp Connected", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements l<byte[], tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            b.this = r1;
        }

        @Override // fm.l
        public final tl.l k(byte[] bArr) {
            c4.a aVar;
            byte[] bArr2 = bArr;
            a.b bVar = p000do.a.f13275a;
            bVar.t("AliAgent");
            gm.l.e(bArr2, "it");
            bVar.h("Upload Ali data:%s", new String(bArr2, om.a.f23623a));
            try {
                aVar = b.this.f28826c;
            } catch (Exception e10) {
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("AliAgent");
                bVar2.q(e10);
            }
            if (aVar != null) {
                ((t3.a) aVar).e(bArr2);
                return tl.l.f28297a;
            }
            gm.l.l("dataUploadCallback");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements l<Throwable, tl.l> {

        /* renamed from: b */
        public static final d f28830b = new d();

        public d() {
            super(1);
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements l<wi.d, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            b.this = r1;
        }

        @Override // fm.l
        public final tl.l k(wi.d dVar) {
            if (dVar == wi.d.DISCONNECTED) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("AliAgent");
                bVar.h("disconnectLp start", new Object[0]);
                ck.a aVar = b.this.f28825b.f27525a.f27553b;
                aVar.getClass();
                Log.i("AiotMqtt", "已发起手动断开");
                if (aVar.f4913i.d()) {
                    on.e eVar = aVar.f4913i;
                    if (eVar.f23666d != null && eVar.f23676n) {
                        synchronized (eVar) {
                            g2.a.a(eVar.f23666d).d(eVar);
                            eVar.f23676n = false;
                        }
                        if (eVar.f23677o) {
                            try {
                                eVar.f23666d.unbindService(eVar.f23663a);
                                eVar.f23677o = false;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    aVar.f4905a.postDelayed(new s.m(11, aVar), 300L);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements l<Throwable, tl.l> {

        /* renamed from: b */
        public static final f f28832b = new f();

        public f() {
            super(1);
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements l<pj.a, Boolean> {

        /* renamed from: b */
        public static final g f28833b = new g();

        public g() {
            super(1);
        }

        @Override // fm.l
        public final Boolean k(pj.a aVar) {
            boolean z10;
            if (aVar.f24277a == 71) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements l<pj.a, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(1);
            b.this = r1;
        }

        @Override // fm.l
        public final tl.l k(pj.a aVar) {
            b bVar = b.this;
            bVar.getClass();
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("AliAgent");
            bVar2.h("checkFgsState start", new Object[0]);
            t3.a aVar2 = bVar.f28825b;
            aVar2.f27528d = new ui.c(bVar);
            try {
                byte[] c10 = x3.b.c("FGS", new JSONStringer().object().key("msg_type").value("FGS_MSG_TYPE_START_FGS_REQ").key("sidver").value(1L).endObject().toString());
                j.e("AliAgentImpl", "checkFgsState mAliBt ==> " + aVar2.f27526b);
                b4.a aVar3 = aVar2.f27526b;
                if (aVar3 != null) {
                    aVar3.b(c10, new t3.b(aVar2));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements l<Throwable, tl.l> {

        /* renamed from: b */
        public static final i f28835b = new i();

        public i() {
            super(1);
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
            return tl.l.f28297a;
        }
    }

    public b(Context context, hj.b bVar) {
        gm.l.f(context, "context");
        hj.a a10 = bVar.a();
        this.f28824a = a10;
        if (a4.a.f254c == null) {
            synchronized (a4.a.class) {
                if (a4.a.f254c == null) {
                    a4.a.f254c = new a4.a();
                }
            }
        }
        a4.a aVar = a4.a.f254c;
        t3.a aVar2 = aVar.f256b;
        if (aVar2 == null) {
            aVar.f255a = context;
        }
        j.f15503a = false;
        if (aVar2 == null) {
            aVar.f256b = new t3.a(aVar.f255a);
        }
        t3.a aVar3 = aVar.f256b;
        gm.l.e(aVar3, "aliAgentSdk.agent");
        this.f28825b = aVar3;
        a aVar4 = new a();
        aVar3.f27526b = aVar4;
        j.e("AliAgentImpl", "customBtImpl aliBt ====> " + aVar4);
        if (aVar3.f27526b != null) {
            j.e("AliAgentImpl", "dev er custom customBtImpl setBtDataUploadCallback");
            aVar3.f27526b.a(aVar3);
        }
        aVar3.f27529e = new C0520b();
        t tVar = new t(a10.k().a(), new ui.a(0, g.f28833b));
        ph.k kVar = new ph.k(4, new h());
        rh.y yVar = new rh.y(2, i.f28835b);
        a.c cVar = yk.a.f31788c;
        tVar.y(kVar, yVar, cVar);
        a10.h().y(new z(1, new e()), new n(1, f.f28832b), cVar);
        k kVar2 = (k) a10.l().f17917a;
        new r0(new t(kVar2.f29911s.w(((vi.a) kVar2.f29893a.f30589e.getValue()).c()), new jj.i(2, a1.f17876b))).y(new o(3, new c()), new b0(2, d.f28830b), cVar);
    }
}
