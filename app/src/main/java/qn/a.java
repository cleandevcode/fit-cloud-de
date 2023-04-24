package qn;

import android.app.AlarmManager;
import android.util.Log;
import bi.m0;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import on.a;
import pn.r;
import pn.s;
import pn.t;
import tn.u;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: p */
    public static final String f24995p;

    /* renamed from: q */
    public static final un.b f24996q;

    /* renamed from: r */
    public static /* synthetic */ Class f24997r;

    /* renamed from: a */
    public pn.b f24998a;

    /* renamed from: b */
    public int f24999b;

    /* renamed from: c */
    public l[] f25000c;

    /* renamed from: d */
    public d f25001d;

    /* renamed from: e */
    public e f25002e;

    /* renamed from: f */
    public c f25003f;

    /* renamed from: g */
    public qn.b f25004g;

    /* renamed from: h */
    public pn.l f25005h;

    /* renamed from: i */
    public pn.k f25006i;

    /* renamed from: j */
    public r f25007j;

    /* renamed from: k */
    public f f25008k;

    /* renamed from: l */
    public boolean f25009l = false;

    /* renamed from: n */
    public Object f25011n = new Object();

    /* renamed from: o */
    public boolean f25012o = false;

    /* renamed from: m */
    public byte f25010m = 3;

    /* renamed from: qn.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC0453a implements Runnable {

        /* renamed from: a */
        public a f25013a;

        /* renamed from: b */
        public Thread f25014b;

        /* renamed from: c */
        public t f25015c;

        /* renamed from: d */
        public tn.d f25016d;

        public RunnableC0453a(a aVar, t tVar, tn.d dVar) {
            a.this = r2;
            this.f25014b = null;
            this.f25013a = aVar;
            this.f25015c = tVar;
            this.f25016d = dVar;
            StringBuffer stringBuffer = new StringBuffer("MQTT Con: ");
            stringBuffer.append(r2.f24998a.a());
            this.f25014b = new Thread(this, stringBuffer.toString());
        }

        @Override // java.lang.Runnable
        public final void run() {
            pn.n nVar;
            a.f24996q.c(a.f24995p, "connectBG:run", "220");
            pn.n e10 = null;
            try {
                for (pn.m mVar : a.this.f25008k.b()) {
                    p pVar = mVar.f24452a;
                    synchronized (pVar.f25132d) {
                        pVar.f25135g = null;
                    }
                }
                a.this.f25008k.h(this.f25015c, this.f25016d);
                a aVar = a.this;
                l lVar = aVar.f25000c[aVar.f24999b];
                lVar.start();
                a aVar2 = a.this;
                a aVar3 = this.f25013a;
                a aVar4 = a.this;
                aVar2.f25001d = new d(aVar3, aVar4.f25004g, aVar4.f25008k, lVar.getInputStream());
                d dVar = a.this.f25001d;
                StringBuffer stringBuffer = new StringBuffer("MQTT Rec: ");
                stringBuffer.append(a.this.f24998a.a());
                dVar.a(stringBuffer.toString());
                a aVar5 = a.this;
                a aVar6 = this.f25013a;
                a aVar7 = a.this;
                aVar5.f25002e = new e(aVar6, aVar7.f25004g, aVar7.f25008k, lVar.b());
                e eVar = a.this.f25002e;
                StringBuffer stringBuffer2 = new StringBuffer("MQTT Snd: ");
                stringBuffer2.append(a.this.f24998a.a());
                eVar.b(stringBuffer2.toString());
                c cVar = a.this.f25003f;
                StringBuffer stringBuffer3 = new StringBuffer("MQTT Call: ");
                stringBuffer3.append(a.this.f24998a.a());
                cVar.g(stringBuffer3.toString());
                a.this.d(this.f25015c, this.f25016d);
            } catch (pn.n e11) {
                e10 = e11;
                a.f24996q.e(a.f24995p, "connectBG:run", "212", null, e10);
            } catch (Exception e12) {
                a.f24996q.e(a.f24995p, "connectBG:run", "209", null, e12);
                if (e12.getClass().getName().equals("java.security.GeneralSecurityException")) {
                    nVar = new s(e12);
                } else {
                    nVar = new pn.n(e12);
                }
                e10 = nVar;
            }
            if (e10 != null) {
                a.this.i(this.f25015c, e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public tn.e f25018a;

        /* renamed from: b */
        public long f25019b = 30000;

        /* renamed from: c */
        public t f25020c;

        public b(tn.e eVar, t tVar) {
            a.this = r1;
            this.f25018a = eVar;
            this.f25020c = tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int size;
            a.f24996q.c(a.f24995p, "disconnectBG:run", "221");
            qn.b bVar = a.this.f25004g;
            long j10 = this.f25019b;
            bVar.getClass();
            if (j10 > 0) {
                un.b bVar2 = qn.b.D;
                String str = qn.b.C;
                bVar2.g(str, "quiesce", "637", new Object[]{new Long(j10)});
                synchronized (bVar.f25035n) {
                    bVar.f25037p = true;
                }
                c cVar = bVar.f25028g;
                cVar.f25058h = true;
                synchronized (cVar.f25062l) {
                    c.f25049o.c(c.f25048n, "quiesce", "711");
                    cVar.f25062l.notifyAll();
                }
                bVar.o();
                synchronized (bVar.f25036o) {
                    try {
                        f fVar = bVar.f25026e;
                        synchronized (fVar.f25087a) {
                            size = fVar.f25087a.size();
                        }
                        if (size > 0 || bVar.f25025d.size() > 0 || !bVar.f25028g.e()) {
                            bVar2.g(str, "quiesce", "639", new Object[]{new Integer(bVar.f25033l), new Integer(bVar.f25025d.size()), new Integer(bVar.f25034m), new Integer(size)});
                            bVar.f25036o.wait(j10);
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (bVar.f25035n) {
                    bVar.f25024c.clear();
                    bVar.f25025d.clear();
                    bVar.f25037p = false;
                    bVar.f25033l = 0;
                }
                qn.b.D.c(qn.b.C, "quiesce", "640");
            }
            try {
                a.this.d(this.f25020c, this.f25018a);
                this.f25020c.f24452a.c();
            } catch (pn.n unused2) {
            } catch (Throwable th2) {
                this.f25020c.f24452a.a(null, null);
                a.this.i(this.f25020c, null);
                throw th2;
            }
            this.f25020c.f24452a.a(null, null);
            a.this.i(this.f25020c, null);
        }
    }

    static {
        Class<a> cls = f24997r;
        if (cls == null) {
            cls = a.class;
            f24997r = cls;
        }
        String name = cls.getName();
        f24995p = name;
        f24996q = un.c.a(name);
    }

    public a(pn.b bVar, pn.k kVar, on.a aVar) {
        this.f24998a = bVar;
        this.f25006i = kVar;
        this.f25007j = aVar;
        aVar.f23643a = this;
        aVar.f23645c = new a.C0421a();
        this.f25008k = new f(this.f24998a.a());
        this.f25003f = new c(this);
        qn.b bVar2 = new qn.b(kVar, this.f25008k, this.f25003f, this, aVar);
        this.f25004g = bVar2;
        this.f25003f.f25063m = bVar2;
        f24996q.d(this.f24998a.a());
    }

    public final void a() {
        boolean z10;
        synchronized (this.f25011n) {
            if (!e()) {
                synchronized (this.f25011n) {
                    if (this.f25010m == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    f24996q.c(f24995p, "close", "224");
                    if (!g()) {
                        if (!f()) {
                            if (h()) {
                                this.f25012o = true;
                                return;
                            }
                        } else {
                            throw m0.h(32100);
                        }
                    } else {
                        throw new pn.n(32110);
                    }
                }
                this.f25010m = (byte) 4;
                this.f25004g.d();
                this.f25004g = null;
                this.f25003f = null;
                this.f25006i = null;
                this.f25002e = null;
                this.f25007j = null;
                this.f25001d = null;
                this.f25000c = null;
                this.f25005h = null;
                this.f25008k = null;
            }
        }
    }

    public final void b(pn.l lVar, t tVar) {
        byte b10;
        boolean z10;
        synchronized (this.f25011n) {
            synchronized (this.f25011n) {
                b10 = this.f25010m;
                if (b10 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10 && !this.f25012o) {
                f24996q.c(f24995p, "connect", "214");
                this.f25010m = (byte) 1;
                this.f25005h = lVar;
                String a10 = this.f24998a.a();
                pn.l lVar2 = this.f25005h;
                int i10 = lVar2.f24442e;
                int i11 = lVar2.f24438a;
                String str = lVar2.f24440c;
                char[] cArr = lVar2.f24441d;
                lVar2.getClass();
                tn.d dVar = new tn.d(a10, i10, i11, str, cArr);
                qn.b bVar = this.f25004g;
                pn.l lVar3 = this.f25005h;
                bVar.f25029h = lVar3.f24438a * 1000;
                bVar.f25030i = true;
                bVar.f25032k = lVar3.f24439b;
                bVar.f25024c = new Vector(bVar.f25032k);
                f fVar = this.f25008k;
                synchronized (fVar.f25087a) {
                    f.f25085e.c(f.f25084d, "open", "310");
                    fVar.f25089c = null;
                }
                new RunnableC0453a(this, tVar, dVar).f25014b.start();
            } else {
                f24996q.g(f24995p, "connect", "207", new Object[]{new Byte(b10)});
                if (!e() && !this.f25012o) {
                    if (!g()) {
                        if (h()) {
                            throw new pn.n(32102);
                        }
                        throw m0.h(32100);
                    }
                    throw new pn.n(32110);
                }
                throw new pn.n(32111);
            }
        }
    }

    public final void c(tn.e eVar, t tVar) {
        boolean z10;
        synchronized (this.f25011n) {
            if (!e()) {
                synchronized (this.f25011n) {
                    if (this.f25010m == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    if (!h()) {
                        if (Thread.currentThread() != this.f25003f.f25060j) {
                            f24996q.c(f24995p, "disconnect", "218");
                            this.f25010m = (byte) 2;
                            b bVar = new b(eVar, tVar);
                            StringBuffer stringBuffer = new StringBuffer("MQTT Disc: ");
                            stringBuffer.append(this.f24998a.a());
                            new Thread(bVar, stringBuffer.toString()).start();
                        } else {
                            f24996q.c(f24995p, "disconnect", "210");
                            throw m0.h(32107);
                        }
                    } else {
                        f24996q.c(f24995p, "disconnect", "219");
                        throw m0.h(32102);
                    }
                } else {
                    f24996q.c(f24995p, "disconnect", "211");
                    throw m0.h(32101);
                }
            } else {
                f24996q.c(f24995p, "disconnect", "223");
                throw m0.h(32111);
            }
        }
    }

    public final void d(t tVar, u uVar) {
        Hashtable hashtable;
        Integer num;
        un.b bVar = f24996q;
        String str = f24995p;
        bVar.g(str, "internalSend", "200", new Object[]{uVar.m(), uVar, tVar});
        p pVar = tVar.f24452a;
        if (pVar.f25138j == null) {
            pVar.f25138j = this.f24998a;
            try {
                this.f25004g.A(tVar, uVar);
                return;
            } catch (pn.n e10) {
                if (uVar instanceof tn.o) {
                    qn.b bVar2 = this.f25004g;
                    tn.o oVar = (tn.o) uVar;
                    synchronized (bVar2.f25035n) {
                        qn.b.D.g(qn.b.C, "undo", "618", new Object[]{new Integer(oVar.f28412b), new Integer(oVar.f28402e.f24448c)});
                        if (oVar.f28402e.f24448c == 1) {
                            hashtable = bVar2.f25046y;
                            num = new Integer(oVar.f28412b);
                        } else {
                            hashtable = bVar2.f25045x;
                            num = new Integer(oVar.f28412b);
                        }
                        hashtable.remove(num);
                        bVar2.f25024c.removeElement(oVar);
                        bVar2.f25031j.remove(qn.b.l(oVar));
                        bVar2.f25026e.e(oVar);
                        bVar2.b();
                    }
                }
                throw e10;
            }
        }
        bVar.g(str, "internalSend", "213", new Object[]{uVar.m(), uVar, tVar});
        throw new pn.n(32201);
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f25011n) {
            z10 = this.f25010m == 4;
        }
        return z10;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f25011n) {
            z10 = this.f25010m == 0;
        }
        return z10;
    }

    public final boolean g() {
        boolean z10;
        synchronized (this.f25011n) {
            z10 = true;
            if (this.f25010m != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f25011n) {
            z10 = this.f25010m == 2;
        }
        return z10;
    }

    public final void i(t tVar, pn.n nVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        l lVar;
        synchronized (this.f25011n) {
            if (!this.f25009l && !this.f25012o && !e()) {
                this.f25009l = true;
                f24996q.c(f24995p, "shutdownConnection", "216");
                if (!f() && !h()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f25010m = (byte) 2;
                if (tVar != null && !tVar.f24452a.f25129a) {
                    p pVar = tVar.f24452a;
                    synchronized (pVar.f25132d) {
                        pVar.f25135g = nVar;
                    }
                }
                c cVar2 = this.f25003f;
                if (cVar2 != null) {
                    cVar2.h();
                }
                try {
                    l[] lVarArr = this.f25000c;
                    if (lVarArr != null && (lVar = lVarArr[this.f24999b]) != null) {
                        lVar.stop();
                    }
                } catch (Exception unused) {
                }
                d dVar = this.f25001d;
                if (dVar != null) {
                    dVar.b();
                }
                f fVar = this.f25008k;
                pn.n nVar2 = new pn.n(32102);
                synchronized (fVar.f25087a) {
                    f.f25085e.g(f.f25084d, "quiesce", "309", new Object[]{nVar2});
                    fVar.f25089c = nVar2;
                }
                f24996q.c(f24995p, "handleOldTokens", "222");
                t tVar2 = null;
                if (tVar != null) {
                    try {
                        if (((t) this.f25008k.f25087a.get(tVar.f24452a.f25137i)) == null) {
                            this.f25008k.g(tVar, tVar.f24452a.f25137i);
                        }
                    } catch (Exception unused2) {
                    }
                }
                Enumeration elements = this.f25004g.x(nVar).elements();
                while (elements.hasMoreElements()) {
                    t tVar3 = (t) elements.nextElement();
                    if (!tVar3.f24452a.f25137i.equals("Disc") && !tVar3.f24452a.f25137i.equals("Con")) {
                        this.f25003f.a(tVar3);
                    }
                    tVar2 = tVar3;
                }
                try {
                    this.f25004g.g(nVar);
                    if (this.f25004g.f25030i) {
                        this.f25003f.f25053c.clear();
                    }
                } catch (Exception unused3) {
                }
                e eVar = this.f25002e;
                if (eVar != null) {
                    eVar.c();
                }
                r rVar = this.f25007j;
                if (rVar != null) {
                    on.a aVar = (on.a) rVar;
                    StringBuilder a10 = android.support.v4.media.d.a("Unregister alarmreceiver to MqttService");
                    a10.append(aVar.f23643a.f24998a.a());
                    Log.d("AlarmPingSender", a10.toString());
                    if (aVar.f23648f) {
                        if (aVar.f23647e != null) {
                            ((AlarmManager) aVar.f23644b.getSystemService("alarm")).cancel(aVar.f23647e);
                        }
                        aVar.f23648f = false;
                        try {
                            aVar.f23644b.unregisterReceiver(aVar.f23645c);
                        } catch (IllegalArgumentException unused4) {
                        }
                    }
                }
                try {
                    pn.k kVar = this.f25006i;
                    if (kVar != null) {
                        kVar.close();
                    }
                } catch (Exception unused5) {
                }
                synchronized (this.f25011n) {
                    f24996q.c(f24995p, "shutdownConnection", "217");
                    this.f25010m = (byte) 3;
                    this.f25009l = false;
                }
                if (tVar2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c cVar3 = this.f25003f;
                if (cVar3 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 & z12) {
                    cVar3.a(tVar2);
                }
                if (z10 && (cVar = this.f25003f) != null) {
                    try {
                        if (cVar.f25051a != null && nVar != null) {
                            c.f25049o.g(c.f25048n, "connectionLost", "708", new Object[]{nVar});
                            cVar.f25051a.b(nVar);
                        }
                        pn.j jVar = cVar.f25052b;
                        if (jVar != null && nVar != null) {
                            jVar.b(nVar);
                        }
                    } catch (Throwable th2) {
                        c.f25049o.g(c.f25048n, "connectionLost", "720", new Object[]{th2});
                    }
                }
                synchronized (this.f25011n) {
                    if (this.f25012o) {
                        try {
                            a();
                        } catch (Exception unused6) {
                        }
                    }
                }
            }
        }
    }
}
