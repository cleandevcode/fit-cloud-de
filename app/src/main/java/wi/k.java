package wi;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import fl.d0;
import fl.r0;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jj.q0;
import kc.o0;
import kc.v0;
import kc.w0;
import p000do.a;
import rh.b0;
import wi.a;
import yk.a;

/* loaded from: classes2.dex */
public final class k implements wi.a {
    public static final AtomicInteger E;
    public wi.b A;
    public uk.c B;
    public volatile boolean C;
    public volatile boolean D;

    /* renamed from: a */
    public final xi.a f29893a;

    /* renamed from: b */
    public final o0 f29894b;

    /* renamed from: c */
    public final vi.d f29895c;

    /* renamed from: d */
    public final vi.b f29896d;

    /* renamed from: e */
    public final vi.a f29897e;

    /* renamed from: f */
    public final UUID f29898f;

    /* renamed from: g */
    public final UUID f29899g;

    /* renamed from: h */
    public final UUID f29900h;

    /* renamed from: i */
    public final int f29901i;

    /* renamed from: j */
    public final boolean f29902j;

    /* renamed from: k */
    public final String f29903k;

    /* renamed from: l */
    public final al.j f29904l;

    /* renamed from: m */
    public final al.j f29905m;

    /* renamed from: n */
    public final d f29906n;

    /* renamed from: o */
    public final ArrayList<b> f29907o;

    /* renamed from: p */
    public final ql.d<wi.d> f29908p;

    /* renamed from: q */
    public final ql.d<wi.c> f29909q;

    /* renamed from: r */
    public final ql.b<Object> f29910r;

    /* renamed from: s */
    public final ql.b<bj.b> f29911s;

    /* renamed from: t */
    public final al.j f29912t;

    /* renamed from: u */
    public final AtomicInteger f29913u;

    /* renamed from: v */
    public final AtomicLong f29914v;

    /* renamed from: w */
    public wi.d f29915w;

    /* renamed from: x */
    public volatile wi.e f29916x;

    /* renamed from: y */
    public w0 f29917y;

    /* renamed from: z */
    public int f29918z;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final lc.f a(w0 w0Var, Throwable th2) {
            AtomicInteger atomicInteger = k.E;
            if (w0Var == null) {
                return new lc.f();
            }
            if (th2 instanceof lc.f) {
                return (lc.f) th2;
            }
            return new lc.f(w0Var.c(), -1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final zi.b<? extends Object> f29919a;

        /* renamed from: b */
        public final fj.e f29920b;

        public b(ti.c cVar, en.f fVar) {
            this.f29919a = cVar;
            this.f29920b = fVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Boolean, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            k.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Boolean bool) {
            Boolean bool2 = bool;
            gm.l.e(bool2, "enabled");
            if (bool2.booleanValue()) {
                k kVar = k.this;
                synchronized (kVar) {
                    w0 w0Var = kVar.f29917y;
                    if (w0Var != null) {
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.h("_disconnectReason:%s", kVar.f29916x);
                        if (kVar.f29916x != wi.e.DISCONNECT_DFU) {
                            bVar.t("Fc#BaseConnectorImpl");
                            bVar.h("adapterEnabled rxBleDevice{%s}", w0Var.c());
                            kVar.C = true;
                            kVar.f(w0Var);
                        } else {
                            bVar.t("Fc#BaseConnectorImpl");
                            bVar.h("adapterEnabled skip:dfu", new Object[0]);
                        }
                        tl.l lVar = tl.l.f28297a;
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends BroadcastReceiver {
        public d() {
            k.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (!gm.l.a(str, "android.intent.action.SCREEN_ON")) {
                return;
            }
            k kVar = k.this;
            synchronized (this) {
                w0 w0Var = kVar.f29917y;
                if (w0Var != null) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t("Fc#BaseConnectorImpl");
                    bVar.h("_disconnectReason:%s", kVar.f29916x);
                    if (kVar.f29916x != wi.e.DISCONNECT_DFU) {
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.h("screenOn rxBleDevice{%s}", w0Var.c());
                        kVar.C = false;
                        kVar.f(w0Var);
                    } else {
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.h("screenOn skip:dfu", new Object[0]);
                    }
                    tl.l lVar = tl.l.f28297a;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<Boolean, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            k.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Boolean bool) {
            Boolean bool2 = bool;
            gm.l.e(bool2, "isForeground");
            if (bool2.booleanValue()) {
                k kVar = k.this;
                synchronized (kVar) {
                    w0 w0Var = kVar.f29917y;
                    if (w0Var != null) {
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.h("_disconnectReason:%s", kVar.f29916x);
                        if (kVar.f29916x != wi.e.DISCONNECT_DFU) {
                            bVar.t("Fc#BaseConnectorImpl");
                            bVar.h("isForeground rxBleDevice{%s}", w0Var.c());
                            kVar.C = false;
                            kVar.f(w0Var);
                        } else {
                            bVar.t("Fc#BaseConnectorImpl");
                            bVar.h("isForeground skip:dfu", new Object[0]);
                        }
                        tl.l lVar = tl.l.f28297a;
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.l<bj.b, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ bj.a<?> f29924b;

        /* renamed from: c */
        public final /* synthetic */ k f29925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(bj.a<?> aVar, k kVar) {
            super(1);
            this.f29924b = aVar;
            this.f29925c = kVar;
        }

        @Override // fm.l
        public final tl.l k(bj.b bVar) {
            byte[] bArr;
            pj.a aVar;
            byte[] bArr2;
            boolean z10;
            String str;
            boolean z11;
            bj.b bVar2 = bVar;
            bj.a<?> aVar2 = this.f29924b;
            gm.l.e(bVar2, "packet");
            q0 q0Var = (q0) aVar2;
            q0Var.getClass();
            byte b10 = bVar2.f4397a;
            byte b11 = bVar2.f4398b;
            boolean z12 = true;
            pj.a aVar3 = null;
            if (b10 == 2) {
                if (b11 == 60) {
                    aVar = new pj.a(1, null);
                } else if (b11 == 81) {
                    aVar = new pj.a(41, null);
                } else if (b11 == 109) {
                    aVar = new pj.a(42, null);
                } else if (b11 == 110) {
                    aVar = new pj.a(43, null);
                } else if (b11 == 120) {
                    aVar = new pj.a(36, null);
                } else if (b11 == 124) {
                    aVar = new pj.a(2, null);
                } else if (b11 == -121) {
                    aVar = new pj.a(61, null);
                } else if (b11 == -110) {
                    byte[] bArr3 = bVar2.f4399c;
                    if (bArr3 != null) {
                        if (bArr3.length == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            int i10 = bArr3[0] & 255;
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    aVar = new pj.a(52, null);
                                }
                            } else {
                                aVar = new pj.a(51, null);
                            }
                        }
                    }
                } else if (b11 == -107) {
                    byte[] bArr4 = bVar2.f4399c;
                    if (bArr4 != null) {
                        if (bArr4.length == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                str = new String(bArr4, 1, bArr4[0] & 255, om.a.f23623a);
                            } catch (Exception e10) {
                                p000do.a.f13275a.q(e10);
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                z12 = false;
                            }
                            if (!z12) {
                                aVar3 = new pj.a(12, str);
                            }
                        }
                    }
                } else if (b11 == -124) {
                    byte[] bArr5 = bVar2.f4399c;
                    if (bArr5 != null && bArr5.length == 6) {
                        String h10 = bi.r.h(bArr5);
                        gm.l.e(h10, "bytes2HexStr(keyData)");
                        String Y = om.h.Y(h10, " ", ":");
                        if (BluetoothAdapter.checkBluetoothAddress(Y)) {
                            aVar3 = new pj.a(10001, Y);
                        }
                    }
                } else if (b11 == -100) {
                    aVar = new pj.a(71, null);
                }
                aVar3 = aVar;
            } else if (b10 == 4) {
                if (b11 == 32) {
                    aVar = new pj.a(11, null);
                    aVar3 = aVar;
                }
            } else if (b10 == 7) {
                if (b11 == 1) {
                    aVar = new pj.a(21, null);
                } else if (b11 == 4) {
                    aVar = new pj.a(22, null);
                } else if (b11 == 5) {
                    aVar = new pj.a(23, null);
                } else if (b11 == 3) {
                    byte[] bArr6 = bVar2.f4399c;
                    if (bArr6 != null) {
                        if (bArr6.length != 0) {
                            z12 = false;
                        }
                        if (!z12) {
                            switch (bArr6[0] & 255) {
                                case 0:
                                case 1:
                                case 2:
                                    aVar = new pj.a(31, null);
                                    break;
                                case 3:
                                    aVar = new pj.a(32, null);
                                    break;
                                case 4:
                                    aVar = new pj.a(33, null);
                                    break;
                                case 5:
                                    aVar = new pj.a(34, null);
                                    break;
                                case 6:
                                    aVar = new pj.a(35, null);
                                    break;
                            }
                        }
                    }
                } else if (b11 == 8 && (bArr2 = bVar2.f4399c) != null && bArr2.length >= 2 && bArr2[0] == 1) {
                    aVar3 = new pj.a(10002, new vj.a(bArr2[1] & 255));
                }
                aVar3 = aVar;
            } else if (b10 == 5) {
                if (b11 == 68) {
                    byte[] bArr7 = bVar2.f4399c;
                    if (bArr7 != null && bArr7.length >= 11) {
                        aVar = new pj.a(10003, new oj.m((int) (xj.a.e(bArr7, 3, (GregorianCalendar) q0Var.f17961a.getValue()) / 1000), bArr7[2] & 255));
                        aVar3 = aVar;
                    }
                } else if (b11 == 70 && (bArr = bVar2.f4399c) != null && bArr.length >= 13) {
                    aVar3 = new pj.a(10004, new oj.l((int) (xj.a.e(bArr, 0, (GregorianCalendar) q0Var.f17961a.getValue()) / 1000), bi.r.i(bArr, 4, 4), bArr[12] & 255));
                }
            }
            if (aVar3 != null) {
                this.f29925c.f29910r.b(aVar3);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public static final g f29926b = new g();

        public g() {
            super(1);
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.l<w0, tk.l<? extends wi.b>> {

        /* renamed from: c */
        public final /* synthetic */ int f29928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10) {
            super(1);
            k.this = r1;
            this.f29928c = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // fm.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tk.l<? extends wi.b> k(kc.w0 r19) {
            /*
                Method dump skipped, instructions count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wi.k.h.k(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.l<wi.b, tk.l<? extends wi.b>> {

        /* renamed from: c */
        public final /* synthetic */ int f29930c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10) {
            super(1);
            k.this = r1;
            this.f29930c = i10;
        }

        @Override // fm.l
        public final tk.l<? extends wi.b> k(wi.b bVar) {
            tk.c d0Var;
            wi.b bVar2 = bVar;
            a.b bVar3 = p000do.a.f13275a;
            bVar3.t("Fc#BaseConnectorImpl");
            bVar3.h("connectSuccess (Thread:%s)", Thread.currentThread().getName());
            k kVar = k.this;
            int i10 = this.f29930c;
            synchronized (kVar) {
                if (i10 == kVar.f29918z) {
                    kVar.a(wi.d.PRE_CONNECTED);
                } else {
                    bVar3.t("Fc#BaseConnectorImpl");
                    bVar3.p("connectSuccess connectId except:%d , but:%d", Integer.valueOf(i10), Integer.valueOf(kVar.f29918z));
                }
                tl.l lVar = tl.l.f28297a;
            }
            tk.a aVar = bl.b.f4448a;
            Iterator<b> it = k.this.f29907o.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.f29920b == null) {
                    tk.i b10 = bVar2.b(next.f29919a);
                    b10.getClass();
                    d0Var = new bl.g(new d0(b10));
                } else {
                    tk.i b11 = bVar2.b(next.f29919a);
                    ((en.f) next.f29920b).getClass();
                    fj.d dVar = new fj.d(3000L, new hj.o());
                    b11.getClass();
                    d0Var = new d0(new r0(b11, dVar));
                }
                aVar.getClass();
                aVar = new bl.a(aVar, d0Var);
            }
            return aVar.c(tk.i.t(bVar2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.l<tk.i<Throwable>, tk.l<?>> {

        /* renamed from: b */
        public final /* synthetic */ k f29931b;

        /* renamed from: c */
        public final /* synthetic */ int f29932c;

        /* renamed from: d */
        public final /* synthetic */ w0 f29933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, w0 w0Var, k kVar) {
            super(1);
            this.f29931b = kVar;
            this.f29932c = i10;
            this.f29933d = w0Var;
        }

        @Override // fm.l
        public final tk.l<?> k(tk.i<Throwable> iVar) {
            return iVar.o(new og.u(3, new wi.l(this.f29932c, this.f29933d, this.f29931b)));
        }
    }

    /* renamed from: wi.k$k */
    /* loaded from: classes2.dex */
    public static final class C0546k extends gm.m implements fm.l<wi.b, tl.l> {

        /* renamed from: c */
        public final /* synthetic */ int f29935c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0546k(int i10) {
            super(1);
            k.this = r1;
            this.f29935c = i10;
        }

        @Override // fm.l
        public final tl.l k(wi.b bVar) {
            wi.b bVar2 = bVar;
            a.b bVar3 = p000do.a.f13275a;
            bVar3.t("Fc#BaseConnectorImpl");
            bVar3.h("connectPrepared (Thread:%s)", Thread.currentThread().getName());
            k kVar = k.this;
            int i10 = this.f29935c;
            synchronized (kVar) {
                if (i10 == kVar.f29918z) {
                    kVar.A = bVar2;
                    kVar.a(wi.d.CONNECTED);
                    kVar.f29913u.set(0);
                    kVar.f29914v.set(0L);
                    kVar.D = false;
                    kVar.getClass();
                } else {
                    bVar3.t("Fc#BaseConnectorImpl");
                    bVar3.p("connectPrepared connectId except:%d , but:%d", Integer.valueOf(i10), Integer.valueOf(kVar.f29918z));
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: c */
        public final /* synthetic */ int f29937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i10) {
            super(1);
            k.this = r1;
            this.f29937c = i10;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            if (th2 instanceof yi.b) {
                k kVar = k.this;
                int i10 = this.f29937c;
                synchronized (kVar) {
                    if (i10 == kVar.f29918z) {
                        kVar.f(null);
                    } else {
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.p("connectError connectId except:%d , but:%d", Integer.valueOf(i10), Integer.valueOf(kVar.f29918z));
                    }
                    tl.l lVar = tl.l.f28297a;
                }
            }
            return tl.l.f28297a;
        }
    }

    static {
        new a();
        E = new AtomicInteger();
    }

    public k(a.C0545a c0545a) {
        al.j jVar;
        xi.a aVar = c0545a.f29853a;
        this.f29893a = aVar;
        this.f29894b = aVar.f30586b;
        vi.d dVar = (vi.d) aVar.f30587c.getValue();
        this.f29895c = dVar;
        vi.b a10 = aVar.a();
        this.f29896d = a10;
        this.f29897e = (vi.a) aVar.f30589e.getValue();
        this.f29898f = c0545a.f29854b;
        this.f29899g = c0545a.f29855c;
        this.f29900h = c0545a.f29856d;
        this.f29901i = c0545a.f29857e;
        this.f29902j = c0545a.f29858f;
        this.f29903k = c0545a.f29859g;
        tk.i<Boolean> d10 = a10.d();
        ph.n nVar = new ph.n(2, new c());
        a.h hVar = yk.a.f31790e;
        a.c cVar = yk.a.f31788c;
        this.f29904l = d10.y(nVar, hVar, cVar);
        this.f29905m = dVar.b().y(new ph.o(4, new e()), hVar, cVar);
        d dVar2 = new d();
        this.f29906n = dVar2;
        aVar.f30585a.registerReceiver(dVar2, new IntentFilter("android.intent.action.SCREEN_ON"));
        this.f29907o = new ArrayList<>();
        this.f29908p = new ql.b().G();
        this.f29909q = new ql.b().G();
        this.f29910r = new ql.b<>();
        ql.b<bj.b> bVar = new ql.b<>();
        this.f29911s = bVar;
        bj.a<?> aVar2 = c0545a.f29860h;
        if (aVar2 != null) {
            jVar = bVar.w(((vi.a) aVar.f30589e.getValue()).c()).y(new b0(3, new f(aVar2, this)), new ph.q(2, g.f29926b), cVar);
        } else {
            jVar = null;
        }
        this.f29912t = jVar;
        this.f29913u = new AtomicInteger(0);
        this.f29914v = new AtomicLong(0L);
        this.f29915w = wi.d.DISCONNECTED;
        this.f29916x = wi.e.INIT_STATE;
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#BaseConnectorImpl");
        bVar2.h("create %d", Integer.valueOf(hashCode()));
    }

    public static final tk.i c(k kVar, w0 w0Var) {
        tk.i o10;
        String str;
        kVar.getClass();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxDirectConnect (Thread:%s)", Thread.currentThread().getName());
        if (!kVar.f29896d.i()) {
            o10 = tk.i.m(new lc.f(w0Var.c(), new lc.a()));
            str = "error(BleDisconnectedExc…(rxBleDevice.macAddress))";
        } else {
            tk.i<v0> a10 = w0Var.a(kVar.D);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a10.getClass();
            o10 = a10.h(500L, timeUnit, pl.a.f24280b).o(new ph.p(1, new m(kVar, w0Var)));
            str = "private fun rxDirectConn…ress)\n            }\n    }";
        }
        gm.l.e(o10, str);
        return o10;
    }

    public final synchronized void a(wi.d dVar) {
        if (this.f29915w != dVar) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#BaseConnectorImpl");
            bVar.h("notifyStateChange:%s", dVar.toString());
            this.f29915w = dVar;
            this.f29908p.b(dVar);
        }
    }

    public final synchronized void b(boolean z10) {
        w0 w0Var = this.f29917y;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        Object[] objArr = new Object[3];
        objArr[0] = w0Var != null ? w0Var.c() : null;
        objArr[1] = Boolean.valueOf(z10);
        objArr[2] = Thread.currentThread().getName();
        bVar.h("performClose %s,%b (Thread:%s)", objArr);
        if (w0Var == null) {
            if (this.f29902j) {
                throw new IllegalStateException("performClose but device is null");
            }
            bVar.t("Fc#BaseConnectorImpl");
            bVar.p("performClose but device is null", new Object[0]);
        } else if (!this.f29896d.b(w0Var)) {
            if (this.f29902j) {
                throw new IllegalStateException("the device is not hold");
            }
            bVar.t("Fc#BaseConnectorImpl");
            bVar.p("the device is not hold", new Object[0]);
        }
        uk.c cVar = this.B;
        if (cVar != null) {
            cVar.c();
        }
        this.B = null;
        wi.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.a(a.a(w0Var, null));
        }
        this.A = null;
        this.f29918z = 0;
        this.f29917y = null;
        if (!z10) {
            a(wi.d.DISCONNECTED);
        }
    }

    public final synchronized void d(w0 w0Var) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("performConnect %s (Thread:%s)", w0Var.c(), Thread.currentThread().getName());
        if (this.f29917y != null) {
            if (!this.f29902j) {
                bVar.t("Fc#BaseConnectorImpl");
                bVar.p("performConnect but device not null", new Object[0]);
            } else {
                throw new IllegalStateException("performConnect but device not null");
            }
        }
        if (!this.f29896d.a(w0Var)) {
            if (!this.f29902j) {
                bVar.t("Fc#BaseConnectorImpl");
                bVar.p("the device is already hold", new Object[0]);
            } else {
                throw new IllegalStateException("the device is already hold");
            }
        }
        this.f29913u.set(0);
        this.f29914v.set(0L);
        this.D = false;
        int incrementAndGet = E.incrementAndGet();
        this.f29918z = incrementAndGet;
        this.f29917y = w0Var;
        tk.i o10 = tk.i.t(w0Var).o(new wi.f(0, new h(incrementAndGet))).o(new og.u(1, new i(incrementAndGet)));
        wi.g gVar = new wi.g(0, new j(incrementAndGet, w0Var, this));
        o10.getClass();
        this.B = new r0(o10, gVar).y(new ph.n(3, new C0546k(incrementAndGet)), new ph.o(5, new l(incrementAndGet)), yk.a.f31788c);
    }

    public final void e() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("close", new Object[0]);
        this.f29916x = wi.e.ACTIVE_CLOSE;
        f(null);
    }

    public final synchronized void f(w0 w0Var) {
        w0 w0Var2 = this.f29917y;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        Object[] objArr = new Object[2];
        objArr[0] = w0Var2 != null ? w0Var2.c() : null;
        objArr[1] = w0Var != null ? w0Var.c() : null;
        bVar.h("setDevice old=%s new=%s", objArr);
        if (w0Var != null) {
            if (w0Var2 != null) {
                boolean a10 = gm.l.a(w0Var2.c(), w0Var.c());
                if (a10) {
                    if (this.f29915w.compareTo(wi.d.PRE_CONNECTED) >= 0) {
                        bVar.t("Fc#BaseConnectorImpl");
                        bVar.h("device %s is %s", w0Var.c(), this.f29915w.toString());
                        return;
                    } else if (!this.D) {
                        wi.d dVar = this.f29915w;
                        if (dVar == wi.d.CONNECTING) {
                            bVar.t("Fc#BaseConnectorImpl");
                            bVar.h("device %s is %s", w0Var.c(), this.f29915w.toString());
                            return;
                        } else if (dVar == wi.d.PRE_CONNECTING) {
                            long currentTimeMillis = this.f29914v.get() - System.currentTimeMillis();
                            if (1 <= currentTimeMillis && currentTimeMillis < 5001) {
                                bVar.t("Fc#BaseConnectorImpl");
                                bVar.h("device %s is trying soon", w0Var.c());
                                return;
                            }
                        }
                    }
                }
                b(a10);
            }
            d(w0Var);
        } else if (w0Var2 == null) {
        } else {
            b(false);
        }
    }

    public final void finalize() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("finalize %d", Integer.valueOf(hashCode()));
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("release", new Object[0]);
        e();
        al.j jVar = this.f29904l;
        jVar.getClass();
        xk.b.a(jVar);
        al.j jVar2 = this.f29905m;
        jVar2.getClass();
        xk.b.a(jVar2);
        this.f29893a.f30585a.unregisterReceiver(this.f29906n);
        this.f29907o.clear();
        al.j jVar3 = this.f29912t;
        if (jVar3 != null) {
            xk.b.a(jVar3);
        }
    }

    public final synchronized void g(wi.e eVar) {
        w0 w0Var = this.f29917y;
        if (w0Var == null) {
            return;
        }
        this.f29916x = eVar;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("disconnect %s,%s (Thread:%s)", w0Var.c(), eVar, Thread.currentThread().getName());
        uk.c cVar = this.B;
        if (cVar != null) {
            cVar.c();
        }
        this.B = null;
        wi.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.a(a.a(w0Var, null));
        }
        this.A = null;
        this.f29918z = 0;
        a(wi.d.DISCONNECTED);
    }

    public final synchronized BluetoothDevice h() {
        w0 w0Var;
        w0Var = this.f29917y;
        return w0Var != null ? w0Var.b() : null;
    }

    public final synchronized tk.i i(ti.f fVar) {
        tk.i m10;
        gm.l.f(fVar, "operation");
        wi.b bVar = this.A;
        if (bVar == null || (m10 = bVar.b(fVar)) == null) {
            m10 = tk.i.m(a.a(this.f29917y, null));
        }
        return m10;
    }

    public final void j(ti.c cVar, en.f fVar) {
        this.f29907o.add(new b(cVar, fVar));
    }
}
