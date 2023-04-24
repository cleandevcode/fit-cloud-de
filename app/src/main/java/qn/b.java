package qn;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import bi.m0;
import cn.sharesdk.framework.Platform;
import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import on.a;
import pn.r;
import pn.t;
import tn.u;
import tn.v;

/* loaded from: classes2.dex */
public class b {
    public static final String C;
    public static final un.b D;
    public static /* synthetic */ Class E;
    public Hashtable A;
    public r B;

    /* renamed from: a */
    public int f25022a;

    /* renamed from: b */
    public Hashtable f25023b;

    /* renamed from: c */
    public volatile Vector f25024c;

    /* renamed from: d */
    public volatile Vector f25025d;

    /* renamed from: e */
    public f f25026e;

    /* renamed from: f */
    public a f25027f;

    /* renamed from: g */
    public c f25028g;

    /* renamed from: h */
    public long f25029h;

    /* renamed from: i */
    public boolean f25030i;

    /* renamed from: j */
    public pn.k f25031j;

    /* renamed from: l */
    public int f25033l;

    /* renamed from: m */
    public int f25034m;

    /* renamed from: t */
    public u f25041t;

    /* renamed from: x */
    public Hashtable f25045x;

    /* renamed from: y */
    public Hashtable f25046y;

    /* renamed from: z */
    public Hashtable f25047z;

    /* renamed from: k */
    public int f25032k = 0;

    /* renamed from: n */
    public Object f25035n = new Object();

    /* renamed from: o */
    public Object f25036o = new Object();

    /* renamed from: p */
    public boolean f25037p = false;

    /* renamed from: q */
    public long f25038q = 0;

    /* renamed from: r */
    public long f25039r = 0;

    /* renamed from: s */
    public long f25040s = 0;

    /* renamed from: u */
    public Object f25042u = new Object();

    /* renamed from: v */
    public int f25043v = 0;

    /* renamed from: w */
    public boolean f25044w = false;

    static {
        Class<b> cls = E;
        if (cls == null) {
            cls = b.class;
            E = cls;
        }
        String name = cls.getName();
        C = name;
        D = un.c.a(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Integer] */
    public b(pn.k kVar, f fVar, c cVar, a aVar, on.a aVar2) {
        Hashtable hashtable;
        Integer num;
        u uVar;
        Hashtable hashtable2;
        Integer num2;
        Hashtable hashtable3;
        Integer num3;
        this.f25022a = 0;
        this.f25027f = null;
        this.f25028g = null;
        this.f25033l = 0;
        this.f25034m = 0;
        this.f25045x = null;
        this.f25046y = null;
        this.f25047z = null;
        this.A = null;
        this.B = null;
        un.b bVar = D;
        bVar.d(aVar.f24998a.a());
        String str = C;
        bVar.a();
        this.f25023b = new Hashtable();
        this.f25025d = new Vector();
        this.f25045x = new Hashtable();
        this.f25046y = new Hashtable();
        this.f25047z = new Hashtable();
        this.A = new Hashtable();
        this.f25041t = new tn.i();
        this.f25034m = 0;
        this.f25033l = 0;
        this.f25031j = kVar;
        this.f25028g = cVar;
        this.f25026e = fVar;
        this.f25027f = aVar;
        this.B = aVar2;
        Enumeration b10 = kVar.b();
        int i10 = this.f25022a;
        Vector vector = new Vector();
        bVar.c(str, "restoreState", "600");
        while (b10.hasMoreElements()) {
            String str2 = (String) b10.nextElement();
            u z10 = z(str2, this.f25031j.a(str2));
            if (z10 != null) {
                if (str2.startsWith("r-")) {
                    D.g(C, "restoreState", "604", new Object[]{str2, z10});
                    hashtable = this.A;
                    num = new Integer(z10.f28412b);
                    uVar = z10;
                } else if (str2.startsWith("s-")) {
                    tn.o oVar = (tn.o) z10;
                    i10 = Math.max(oVar.f28412b, i10);
                    if (this.f25031j.f(k(oVar))) {
                        tn.n nVar = (tn.n) z(str2, this.f25031j.a(k(oVar)));
                        if (nVar != null) {
                            D.g(C, "restoreState", "605", new Object[]{str2, z10});
                            this.f25045x.put(new Integer(nVar.f28412b), nVar);
                        } else {
                            D.g(C, "restoreState", "606", new Object[]{str2, z10});
                        }
                    } else {
                        oVar.f28413c = true;
                        if (oVar.f28402e.f24448c == 2) {
                            D.g(C, "restoreState", "607", new Object[]{str2, z10});
                            hashtable2 = this.f25045x;
                            num2 = new Integer(oVar.f28412b);
                        } else {
                            D.g(C, "restoreState", "608", new Object[]{str2, z10});
                            hashtable2 = this.f25046y;
                            num2 = new Integer(oVar.f28412b);
                        }
                        hashtable2.put(num2, oVar);
                    }
                    this.f25026e.f(oVar).f24452a.f25138j = this.f25027f.f24998a;
                    hashtable = this.f25023b;
                    num = new Integer(oVar.f28412b);
                    uVar = new Integer(oVar.f28412b);
                } else if (str2.startsWith("sb-")) {
                    tn.o oVar2 = (tn.o) z10;
                    i10 = Math.max(oVar2.f28412b, i10);
                    int i11 = oVar2.f28402e.f24448c;
                    if (i11 == 2) {
                        D.g(C, "restoreState", "607", new Object[]{str2, z10});
                        hashtable3 = this.f25045x;
                        num3 = new Integer(oVar2.f28412b);
                    } else if (i11 == 1) {
                        D.g(C, "restoreState", "608", new Object[]{str2, z10});
                        hashtable3 = this.f25046y;
                        num3 = new Integer(oVar2.f28412b);
                    } else {
                        D.g(C, "restoreState", "511", new Object[]{str2, z10});
                        this.f25047z.put(new Integer(oVar2.f28412b), oVar2);
                        this.f25031j.remove(str2);
                        this.f25026e.f(oVar2).f24452a.f25138j = this.f25027f.f24998a;
                        hashtable = this.f25023b;
                        num = new Integer(oVar2.f28412b);
                        uVar = new Integer(oVar2.f28412b);
                    }
                    hashtable3.put(num3, oVar2);
                    this.f25026e.f(oVar2).f24452a.f25138j = this.f25027f.f24998a;
                    hashtable = this.f25023b;
                    num = new Integer(oVar2.f28412b);
                    uVar = new Integer(oVar2.f28412b);
                } else if (str2.startsWith("sc-") && !this.f25031j.f(l((tn.n) z10))) {
                    vector.addElement(str2);
                }
                hashtable.put(num, uVar);
            }
        }
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            String str3 = (String) elements.nextElement();
            D.g(C, "restoreState", "609", new Object[]{str3});
            this.f25031j.remove(str3);
        }
        this.f25022a = i10;
    }

    public static String j(u uVar) {
        StringBuffer stringBuffer = new StringBuffer("r-");
        stringBuffer.append(uVar.f28412b);
        return stringBuffer.toString();
    }

    public static String k(u uVar) {
        StringBuffer stringBuffer = new StringBuffer("sc-");
        stringBuffer.append(uVar.f28412b);
        return stringBuffer.toString();
    }

    public static String l(u uVar) {
        StringBuffer stringBuffer = new StringBuffer("s-");
        stringBuffer.append(uVar.f28412b);
        return stringBuffer.toString();
    }

    public static void m(Vector vector, tn.h hVar) {
        int i10 = hVar.f28412b;
        for (int i11 = 0; i11 < vector.size(); i11++) {
            if (((u) vector.elementAt(i11)).f28412b > i10) {
                vector.insertElementAt(hVar, i11);
                return;
            }
        }
        vector.addElement(hVar);
    }

    public static Vector v(Vector vector) {
        int i10;
        Vector vector2 = new Vector();
        if (vector.size() == 0) {
            return vector2;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < vector.size()) {
            int i15 = ((u) vector.elementAt(i11)).f28412b;
            int i16 = i15 - i12;
            if (i16 > i13) {
                i14 = i11;
                i13 = i16;
            }
            i11++;
            i12 = i15;
        }
        if ((Platform.CUSTOMER_ACTION_MASK - i12) + ((u) vector.elementAt(0)).f28412b > i13) {
            i10 = 0;
        } else {
            i10 = i14;
        }
        for (int i17 = i10; i17 < vector.size(); i17++) {
            vector2.addElement(vector.elementAt(i17));
        }
        for (int i18 = 0; i18 < i10; i18++) {
            vector2.addElement(vector.elementAt(i18));
        }
        return vector2;
    }

    public final void A(t tVar, u uVar) {
        pn.k kVar;
        String l10;
        if (uVar.q() && uVar.f28412b == 0) {
            uVar.r(i());
        }
        if (tVar != null) {
            try {
                tVar.f24452a.f25141m = uVar.f28412b;
            } catch (Exception unused) {
            }
        }
        if (uVar instanceof tn.o) {
            synchronized (this.f25035n) {
                int i10 = this.f25033l;
                if (i10 < this.f25032k) {
                    pn.o oVar = ((tn.o) uVar).f28402e;
                    D.g(C, "send", "628", new Object[]{new Integer(uVar.f28412b), new Integer(oVar.f24448c), uVar});
                    int i11 = oVar.f24448c;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            this.f25045x.put(new Integer(uVar.f28412b), uVar);
                            kVar = this.f25031j;
                            l10 = l(uVar);
                        } else {
                            this.f25026e.h(tVar, uVar);
                            this.f25024c.addElement(uVar);
                            this.f25035n.notifyAll();
                        }
                    } else {
                        this.f25046y.put(new Integer(uVar.f28412b), uVar);
                        kVar = this.f25031j;
                        l10 = l(uVar);
                    }
                    kVar.e(l10, (tn.o) uVar);
                    this.f25026e.h(tVar, uVar);
                    this.f25024c.addElement(uVar);
                    this.f25035n.notifyAll();
                } else {
                    D.g(C, "send", "613", new Object[]{new Integer(i10)});
                    throw new pn.n(32202);
                }
            }
            return;
        }
        D.g(C, "send", "615", new Object[]{new Integer(uVar.f28412b), uVar});
        if (uVar instanceof tn.d) {
            synchronized (this.f25035n) {
                this.f25026e.h(tVar, uVar);
                this.f25025d.insertElementAt(uVar, 0);
                this.f25035n.notifyAll();
            }
            return;
        }
        if (uVar instanceof tn.i) {
            this.f25041t = uVar;
        } else if (uVar instanceof tn.n) {
            this.f25045x.put(new Integer(uVar.f28412b), uVar);
            this.f25031j.e(k(uVar), (tn.n) uVar);
        } else if (uVar instanceof tn.l) {
            this.f25031j.remove(j(uVar));
        }
        synchronized (this.f25035n) {
            if (!(uVar instanceof tn.b)) {
                this.f25026e.h(tVar, uVar);
            }
            this.f25025d.addElement(uVar);
            this.f25035n.notifyAll();
        }
    }

    public final t a(a.C0421a.C0422a c0422a) {
        long max;
        t tVar;
        un.b bVar = D;
        String str = C;
        bVar.g(str, "checkForActivity", "616", new Object[0]);
        synchronized (this.f25036o) {
            if (this.f25037p) {
                return null;
            }
            if (!this.f25044w || this.f25029h <= 0) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.f25042u) {
                int i10 = this.f25043v;
                if (i10 > 0) {
                    long j10 = this.f25029h;
                    if (currentTimeMillis - this.f25039r >= 100 + j10) {
                        bVar.b("619", new Object[]{new Long(j10), new Long(this.f25038q), new Long(this.f25039r), new Long(currentTimeMillis), new Long(this.f25040s)});
                        throw m0.h(32000);
                    }
                }
                if (i10 == 0) {
                    long j11 = this.f25029h;
                    if (currentTimeMillis - this.f25038q >= 2 * j11) {
                        bVar.b("642", new Object[]{new Long(j11), new Long(this.f25038q), new Long(this.f25039r), new Long(currentTimeMillis), new Long(this.f25040s)});
                        throw m0.h(32002);
                    }
                }
                if ((i10 == 0 && currentTimeMillis - this.f25039r >= this.f25029h - 100) || currentTimeMillis - this.f25038q >= this.f25029h - 100) {
                    bVar.g(str, "checkForActivity", "620", new Object[]{new Long(this.f25029h), new Long(this.f25038q), new Long(this.f25039r)});
                    t tVar2 = new t(this.f25027f.f24998a.a());
                    tVar2.f24452a.f25139k = c0422a;
                    this.f25026e.h(tVar2, this.f25041t);
                    this.f25025d.insertElementAt(this.f25041t, 0);
                    max = this.f25029h;
                    o();
                    tVar = tVar2;
                } else {
                    bVar.g(str, "checkForActivity", "634", null);
                    max = Math.max(1L, this.f25029h - (currentTimeMillis - this.f25038q));
                    tVar = null;
                }
            }
            bVar.g(str, "checkForActivity", "624", new Object[]{new Long(max)});
            ((on.a) this.B).a(max);
            return tVar;
        }
    }

    public final boolean b() {
        int size;
        f fVar = this.f25026e;
        synchronized (fVar.f25087a) {
            size = fVar.f25087a.size();
        }
        if (!this.f25037p || size != 0 || this.f25025d.size() != 0 || !this.f25028g.e()) {
            return false;
        }
        D.g(C, "checkQuiesceLock", "626", new Object[]{new Boolean(this.f25037p), new Integer(this.f25033l), new Integer(this.f25025d.size()), new Integer(this.f25034m), Boolean.valueOf(this.f25028g.e()), new Integer(size)});
        synchronized (this.f25036o) {
            this.f25036o.notifyAll();
        }
        return true;
    }

    public final void c() {
        D.c(C, "clearState", ">");
        this.f25031j.clear();
        this.f25023b.clear();
        this.f25024c.clear();
        this.f25025d.clear();
        this.f25045x.clear();
        this.f25046y.clear();
        this.f25047z.clear();
        this.A.clear();
        this.f25026e.a();
    }

    public final void d() {
        this.f25023b.clear();
        this.f25024c.clear();
        this.f25025d.clear();
        this.f25045x.clear();
        this.f25046y.clear();
        this.f25047z.clear();
        this.A.clear();
        this.f25026e.a();
        this.f25023b = null;
        this.f25024c = null;
        this.f25025d = null;
        this.f25045x = null;
        this.f25046y = null;
        this.f25047z = null;
        this.A = null;
        this.f25026e = null;
        this.f25028g = null;
        this.f25027f = null;
        this.f25031j = null;
        this.f25041t = null;
    }

    public final void e() {
        D.c(C, "connected", "631");
        this.f25044w = true;
        on.a aVar = (on.a) this.B;
        aVar.getClass();
        String str = "MqttService.pingSender." + aVar.f23643a.f24998a.a();
        Log.d("AlarmPingSender", "Register alarmreceiver to MqttService" + str);
        aVar.f23644b.registerReceiver(aVar.f23645c, new IntentFilter(str));
        aVar.f23647e = PendingIntent.getBroadcast(aVar.f23644b, 0, new Intent(str), 134217728);
        aVar.a(aVar.f23643a.f25004g.f25029h);
        aVar.f23648f = true;
    }

    public final void f() {
        synchronized (this.f25035n) {
            int i10 = this.f25033l - 1;
            this.f25033l = i10;
            D.g(C, "decrementInFlight", "646", new Object[]{new Integer(i10)});
            if (!b()) {
                this.f25035n.notifyAll();
            }
        }
    }

    public final void g(pn.n nVar) {
        D.g(C, "disconnected", "633", new Object[]{nVar});
        this.f25044w = false;
        try {
            if (this.f25030i) {
                c();
            }
            this.f25024c.clear();
            this.f25025d.clear();
            synchronized (this.f25042u) {
                this.f25043v = 0;
            }
        } catch (pn.n unused) {
        }
    }

    public final u h() {
        synchronized (this.f25035n) {
            u uVar = null;
            while (uVar == null) {
                if ((this.f25024c.isEmpty() && this.f25025d.isEmpty()) || (this.f25025d.isEmpty() && this.f25033l >= this.f25032k)) {
                    try {
                        un.b bVar = D;
                        String str = C;
                        bVar.c(str, "get", "644");
                        this.f25035n.wait();
                        bVar.c(str, "get", "647");
                    } catch (InterruptedException unused) {
                    }
                }
                if (!this.f25044w && (this.f25025d.isEmpty() || !(((u) this.f25025d.elementAt(0)) instanceof tn.d))) {
                    D.c(C, "get", "621");
                    return null;
                } else if (!this.f25025d.isEmpty()) {
                    uVar = (u) this.f25025d.remove(0);
                    if (uVar instanceof tn.n) {
                        int i10 = this.f25034m + 1;
                        this.f25034m = i10;
                        D.g(C, "get", "617", new Object[]{new Integer(i10)});
                    }
                    b();
                } else if (!this.f25024c.isEmpty()) {
                    if (this.f25033l < this.f25032k) {
                        uVar = (u) this.f25024c.elementAt(0);
                        this.f25024c.removeElementAt(0);
                        int i11 = this.f25033l + 1;
                        this.f25033l = i11;
                        D.g(C, "get", "623", new Object[]{new Integer(i11)});
                    } else {
                        D.c(C, "get", "622");
                    }
                }
            }
            return uVar;
        }
    }

    public final synchronized int i() {
        int i10;
        int i11 = this.f25022a;
        int i12 = 0;
        do {
            int i13 = this.f25022a + 1;
            this.f25022a = i13;
            if (i13 > 65535) {
                this.f25022a = 1;
            }
            i10 = this.f25022a;
            if (i10 == i11 && (i12 = i12 + 1) == 2) {
                throw m0.h(32001);
            }
        } while (this.f25023b.containsKey(new Integer(i10)));
        Integer num = new Integer(this.f25022a);
        this.f25023b.put(num, num);
        return this.f25022a;
    }

    public final void n(t tVar) {
        u uVar = tVar.f24452a.f25134f;
        if (uVar != null && (uVar instanceof tn.b)) {
            un.b bVar = D;
            String str = C;
            bVar.g(str, "notifyComplete", "629", new Object[]{new Integer(uVar.f28412b), tVar, uVar});
            tn.b bVar2 = (tn.b) uVar;
            if (bVar2 instanceof tn.k) {
                this.f25031j.remove(l(uVar));
                this.f25046y.remove(new Integer(bVar2.f28412b));
                f();
                w(uVar.f28412b);
                this.f25026e.e(uVar);
                bVar.g(str, "notifyComplete", "650", new Object[]{new Integer(bVar2.f28412b)});
            } else if (bVar2 instanceof tn.l) {
                this.f25031j.remove(l(uVar));
                this.f25031j.remove(k(uVar));
                this.f25045x.remove(new Integer(bVar2.f28412b));
                this.f25034m--;
                f();
                w(uVar.f28412b);
                this.f25026e.e(uVar);
                bVar.g(str, "notifyComplete", "645", new Object[]{new Integer(bVar2.f28412b), new Integer(this.f25034m)});
            }
            b();
        }
    }

    public final void o() {
        synchronized (this.f25035n) {
            D.c(C, "notifyQueueLock", "638");
            this.f25035n.notifyAll();
        }
    }

    public final void p(tn.b bVar) {
        this.f25039r = System.currentTimeMillis();
        un.b bVar2 = D;
        String str = C;
        bVar2.g(str, "notifyReceivedAck", "627", new Object[]{new Integer(bVar.f28412b), bVar});
        t c10 = this.f25026e.c(bVar);
        if (c10 == null) {
            bVar2.g(str, "notifyReceivedAck", "662", new Object[]{new Integer(bVar.f28412b)});
        } else if (bVar instanceof tn.m) {
            A(c10, new tn.n((tn.m) bVar));
        } else if (!(bVar instanceof tn.k) && !(bVar instanceof tn.l)) {
            if (bVar instanceof tn.j) {
                synchronized (this.f25042u) {
                    this.f25043v = Math.max(0, this.f25043v - 1);
                    s(bVar, c10);
                    if (this.f25043v == 0) {
                        this.f25026e.e(bVar);
                    }
                }
                bVar2.g(str, "notifyReceivedAck", "636", new Object[]{new Integer(this.f25043v)});
            } else if (bVar instanceof tn.c) {
                tn.c cVar = (tn.c) bVar;
                int i10 = cVar.f28382e;
                if (i10 == 0) {
                    synchronized (this.f25035n) {
                        if (this.f25030i) {
                            c();
                            this.f25026e.h(c10, bVar);
                        }
                        this.f25034m = 0;
                        this.f25033l = 0;
                        y();
                        e();
                    }
                    a aVar = this.f25027f;
                    aVar.getClass();
                    int i11 = cVar.f28382e;
                    synchronized (aVar.f25011n) {
                        if (i11 == 0) {
                            a.f24996q.c(a.f24995p, "connectComplete", "215");
                            aVar.f25010m = (byte) 0;
                            s(bVar, c10);
                            this.f25026e.e(bVar);
                            synchronized (this.f25035n) {
                                this.f25035n.notifyAll();
                            }
                        } else {
                            a.f24996q.g(a.f24995p, "connectComplete", "204", new Object[]{new Integer(i11)});
                            throw null;
                        }
                    }
                } else {
                    throw m0.h(i10);
                }
            } else {
                s(bVar, c10);
                w(bVar.f28412b);
                this.f25026e.e(bVar);
            }
        } else {
            s(bVar, c10);
        }
        b();
    }

    public final void q(int i10) {
        if (i10 > 0) {
            this.f25039r = System.currentTimeMillis();
        }
        D.g(C, "notifyReceivedBytes", "630", new Object[]{new Integer(i10)});
    }

    public final void r(u uVar) {
        tn.o oVar;
        c cVar;
        this.f25039r = System.currentTimeMillis();
        D.g(C, "notifyReceivedMsg", "651", new Object[]{new Integer(uVar.f28412b), uVar});
        if (!this.f25037p) {
            if (uVar instanceof tn.o) {
                oVar = (tn.o) uVar;
                int i10 = oVar.f28402e.f24448c;
                if (i10 != 0 && i10 != 1) {
                    if (i10 == 2) {
                        this.f25031j.e(j(uVar), oVar);
                        this.A.put(new Integer(oVar.f28412b), oVar);
                        A(null, new tn.m(oVar));
                        return;
                    }
                    return;
                }
                cVar = this.f25028g;
                if (cVar == null) {
                    return;
                }
            } else if (uVar instanceof tn.n) {
                oVar = (tn.o) this.A.get(new Integer(uVar.f28412b));
                if (oVar != null) {
                    cVar = this.f25028g;
                    if (cVar == null) {
                        return;
                    }
                } else {
                    A(null, new tn.l(uVar.f28412b));
                    return;
                }
            } else {
                return;
            }
            cVar.f(oVar);
        }
    }

    public final void s(u uVar, t tVar) {
        tVar.f24452a.a(uVar, null);
        tVar.f24452a.b();
        if ((uVar instanceof tn.b) && !(uVar instanceof tn.m)) {
            D.g(C, "notifyResult", "648", new Object[]{tVar.f24452a.f25137i, uVar, null});
            this.f25028g.a(tVar);
        }
    }

    public final void t(u uVar) {
        int i10;
        this.f25038q = System.currentTimeMillis();
        un.b bVar = D;
        String str = C;
        bVar.g(str, "notifySent", "625", new Object[]{uVar.m()});
        t c10 = this.f25026e.c(uVar);
        p pVar = c10.f24452a;
        p.f25127p.g(p.f25126o, "notifySent", "403", new Object[]{pVar.f25137i});
        synchronized (pVar.f25132d) {
            pVar.f25134f = null;
            pVar.f25129a = false;
        }
        synchronized (pVar.f25133e) {
            pVar.f25131c = true;
            pVar.f25133e.notifyAll();
        }
        if (uVar instanceof tn.i) {
            synchronized (this.f25042u) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.f25042u) {
                    this.f25040s = currentTimeMillis;
                    i10 = this.f25043v + 1;
                    this.f25043v = i10;
                }
                bVar.g(str, "notifySent", "635", new Object[]{new Integer(i10)});
            }
        } else if ((uVar instanceof tn.o) && ((tn.o) uVar).f28402e.f24448c == 0) {
            c10.f24452a.a(null, null);
            this.f25028g.a(c10);
            f();
            w(uVar.f28412b);
            this.f25026e.e(uVar);
            b();
        }
    }

    public final void u(int i10) {
        if (i10 > 0) {
            this.f25038q = System.currentTimeMillis();
        }
        D.g(C, "notifySentBytes", "643", new Object[]{new Integer(i10)});
    }

    public final synchronized void w(int i10) {
        this.f25023b.remove(new Integer(i10));
    }

    public final Vector x(pn.n nVar) {
        Vector vector;
        D.g(C, "resolveOldTokens", "632", new Object[]{nVar});
        if (nVar == null) {
            nVar = new pn.n(32102);
        }
        f fVar = this.f25026e;
        synchronized (fVar.f25087a) {
            f.f25085e.c(f.f25084d, "getOutstandingTokens", "312");
            vector = new Vector();
            Enumeration elements = fVar.f25087a.elements();
            while (elements.hasMoreElements()) {
                t tVar = (t) elements.nextElement();
                if (tVar != null) {
                    vector.addElement(tVar);
                }
            }
        }
        Enumeration elements2 = vector.elements();
        while (elements2.hasMoreElements()) {
            t tVar2 = (t) elements2.nextElement();
            synchronized (tVar2) {
                try {
                    if (!tVar2.f24452a.f25129a) {
                        p pVar = tVar2.f24452a;
                        if (!pVar.f25130b && pVar.f25135g == null) {
                            synchronized (pVar.f25132d) {
                                pVar.f25135g = nVar;
                            }
                        }
                    }
                } finally {
                }
            }
            if (!(tVar2 instanceof pn.m)) {
                this.f25026e.d(tVar2.f24452a.f25137i);
            }
        }
        return vector;
    }

    public final void y() {
        Vector vector;
        tn.h hVar;
        this.f25024c = new Vector(this.f25032k);
        this.f25025d = new Vector();
        Enumeration keys = this.f25045x.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            u uVar = (u) this.f25045x.get(nextElement);
            if (uVar instanceof tn.o) {
                D.g(C, "restoreInflightMessages", "610", new Object[]{nextElement});
                uVar.f28413c = true;
                vector = this.f25024c;
                hVar = (tn.o) uVar;
            } else if (uVar instanceof tn.n) {
                D.g(C, "restoreInflightMessages", "611", new Object[]{nextElement});
                vector = this.f25025d;
                hVar = (tn.n) uVar;
            }
            m(vector, hVar);
        }
        Enumeration keys2 = this.f25046y.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            tn.o oVar = (tn.o) this.f25046y.get(nextElement2);
            oVar.f28413c = true;
            D.g(C, "restoreInflightMessages", "612", new Object[]{nextElement2});
            m(this.f25024c, oVar);
        }
        Enumeration keys3 = this.f25047z.keys();
        while (keys3.hasMoreElements()) {
            Object nextElement3 = keys3.nextElement();
            D.g(C, "restoreInflightMessages", "512", new Object[]{nextElement3});
            m(this.f25024c, (tn.o) this.f25047z.get(nextElement3));
        }
        this.f25025d = v(this.f25025d);
        this.f25024c = v(this.f25024c);
    }

    public final u z(String str, pn.p pVar) {
        u uVar;
        try {
            byte[] d10 = pVar.d();
            if (d10 == null) {
                d10 = new byte[0];
            }
            uVar = u.g(new v(pVar.b(), pVar.c(), pVar.f(), d10, pVar.e(), pVar.a()));
        } catch (pn.n e10) {
            D.e(C, "restoreMessage", "602", new Object[]{str}, e10);
            if (e10.f24445b instanceof EOFException) {
                if (str != null) {
                    this.f25031j.remove(str);
                }
                uVar = null;
            } else {
                throw e10;
            }
        }
        D.g(C, "restoreMessage", "601", new Object[]{str, uVar});
        return uVar;
    }
}
