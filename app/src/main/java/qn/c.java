package qn;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import pn.t;

/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: n */
    public static final String f25048n;

    /* renamed from: o */
    public static final un.b f25049o;

    /* renamed from: p */
    public static /* synthetic */ Class f25050p;

    /* renamed from: a */
    public pn.i f25051a;

    /* renamed from: b */
    public pn.j f25052b;

    /* renamed from: d */
    public a f25054d;

    /* renamed from: j */
    public Thread f25060j;

    /* renamed from: m */
    public b f25063m;

    /* renamed from: g */
    public boolean f25057g = false;

    /* renamed from: h */
    public boolean f25058h = false;

    /* renamed from: i */
    public Object f25059i = new Object();

    /* renamed from: k */
    public Object f25061k = new Object();

    /* renamed from: l */
    public Object f25062l = new Object();

    /* renamed from: e */
    public Vector f25055e = new Vector(10);

    /* renamed from: f */
    public Vector f25056f = new Vector(10);

    /* renamed from: c */
    public Hashtable f25053c = new Hashtable();

    static {
        Class<?> cls = f25050p;
        if (cls == null) {
            try {
                cls = Class.forName("qn.c");
                f25050p = cls;
            } catch (ClassNotFoundException e10) {
                throw new NoClassDefFoundError(e10.getMessage());
            }
        }
        String name = cls.getName();
        f25048n = name;
        f25049o = un.c.a(name);
    }

    public c(a aVar) {
        this.f25054d = aVar;
        f25049o.d(aVar.f24998a.a());
    }

    public static void b(t tVar) {
        p pVar;
        pn.a aVar;
        if (tVar != null && (aVar = (pVar = tVar.f24452a).f25139k) != null) {
            if (pVar.f25135g == null) {
                f25049o.g(f25048n, "fireActionEvent", "716", new Object[]{pVar.f25137i});
                aVar.a(tVar);
                return;
            }
            f25049o.g(f25048n, "fireActionEvent", "716", new Object[]{pVar.f25137i});
            aVar.b(tVar, tVar.f24452a.f25135g);
        }
    }

    public final void a(t tVar) {
        if (this.f25057g) {
            this.f25056f.addElement(tVar);
            synchronized (this.f25061k) {
                f25049o.g(f25048n, "asyncOperationComplete", "715", new Object[]{tVar.f24452a.f25137i});
                this.f25061k.notifyAll();
            }
            return;
        }
        try {
            c(tVar);
        } catch (Throwable th2) {
            f25049o.e(f25048n, "asyncOperationComplete", "719", null, th2);
            this.f25054d.i(null, new pn.n(th2));
        }
    }

    public final void c(t tVar) {
        synchronized (tVar) {
            f25049o.g(f25048n, "handleActionComplete", "705", new Object[]{tVar.f24452a.f25137i});
            if (tVar.f24452a.f25129a) {
                this.f25063m.n(tVar);
            }
            tVar.f24452a.b();
            p pVar = tVar.f24452a;
            if (!pVar.f25142n) {
                if (this.f25051a != null && (tVar instanceof pn.m) && pVar.f25129a) {
                    this.f25051a.c((pn.m) tVar);
                }
                b(tVar);
            }
            if (tVar.f24452a.f25129a && ((tVar instanceof pn.m) || (tVar.f24452a.f25139k instanceof pn.a))) {
                tVar.f24452a.f25142n = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void d(tn.o oVar) {
        boolean z10;
        String str = oVar.f28403f;
        int i10 = 2;
        ?? r82 = 0;
        int i11 = 1;
        f25049o.g(f25048n, "handleMessage", "713", new Object[]{new Integer(oVar.f28412b), str});
        int i12 = oVar.f28412b;
        pn.o oVar2 = oVar.f28402e;
        Enumeration keys = this.f25053c.keys();
        boolean z11 = false;
        while (keys.hasMoreElements()) {
            String str2 = (String) keys.nextElement();
            int length = str.length();
            int length2 = str2.length();
            gm.f.i(str2, i11);
            gm.f.i(str, r82);
            if (str2.equals(str)) {
                z10 = i11;
            } else {
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 && i14 < length && ((str.charAt(i14) != '/' || str2.charAt(i13) == '/') && (str2.charAt(i13) == '+' || str2.charAt(i13) == '#' || str2.charAt(i13) == str.charAt(i14)))) {
                    if (str2.charAt(i13) == '+') {
                        while (true) {
                            int i15 = i14 + 1;
                            if (i15 < length && str.charAt(i15) != '/') {
                                i14 = i15;
                            }
                        }
                    } else if (str2.charAt(i13) == '#') {
                        i14 = length - 1;
                    }
                    i13++;
                    i14++;
                }
                if (i14 == length && i13 == length2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                oVar2.f24451f = i12;
                ((pn.d) this.f25053c.get(str2)).a();
                i10 = 2;
                i11 = 1;
                r82 = 0;
                z11 = true;
            } else {
                i10 = 2;
                i11 = 1;
                r82 = 0;
            }
        }
        pn.i iVar = this.f25051a;
        if (iVar != null && !z11) {
            oVar2.f24451f = i12;
            iVar.a(str, oVar2);
        }
        int i16 = oVar.f28402e.f24448c;
        if (i16 == i11) {
            a aVar = this.f25054d;
            aVar.d(new t(aVar.f24998a.a()), new tn.k(oVar));
        } else if (i16 == i10) {
            b bVar = this.f25054d.f25004g;
            bVar.getClass();
            un.b bVar2 = b.D;
            String str3 = b.C;
            Object[] objArr = new Object[i11];
            objArr[r82] = new Integer(oVar.f28412b);
            bVar2.g(str3, "deliveryComplete", "641", objArr);
            bVar.f25031j.remove(b.j(oVar));
            bVar.A.remove(new Integer(oVar.f28412b));
            tn.l lVar = new tn.l(oVar);
            a aVar2 = this.f25054d;
            aVar2.d(new t(aVar2.f24998a.a()), lVar);
        }
    }

    public final boolean e() {
        return this.f25058h && this.f25056f.size() == 0 && this.f25055e.size() == 0;
    }

    public final void f(tn.o oVar) {
        if (this.f25051a != null || this.f25053c.size() > 0) {
            synchronized (this.f25062l) {
                while (this.f25057g && !this.f25058h && this.f25055e.size() >= 10) {
                    try {
                        f25049o.c(f25048n, "messageArrived", "709");
                        this.f25062l.wait(200L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (this.f25058h) {
                return;
            }
            this.f25055e.addElement(oVar);
            synchronized (this.f25061k) {
                f25049o.c(f25048n, "messageArrived", "710");
                this.f25061k.notifyAll();
            }
        }
    }

    public final void g(String str) {
        synchronized (this.f25059i) {
            if (!this.f25057g) {
                this.f25055e.clear();
                this.f25056f.clear();
                this.f25057g = true;
                this.f25058h = false;
                Thread thread = new Thread(this, str);
                this.f25060j = thread;
                thread.start();
            }
        }
    }

    public final void h() {
        synchronized (this.f25059i) {
            if (this.f25057g) {
                un.b bVar = f25049o;
                String str = f25048n;
                bVar.c(str, "stop", "700");
                this.f25057g = false;
                if (!Thread.currentThread().equals(this.f25060j)) {
                    try {
                        synchronized (this.f25061k) {
                            bVar.c(str, "stop", "701");
                            this.f25061k.notifyAll();
                        }
                        this.f25060j.join();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f25060j = null;
            f25049o.c(f25048n, "stop", "703");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        tn.o oVar;
        while (this.f25057g) {
            try {
                try {
                    synchronized (this.f25061k) {
                        if (this.f25057g && this.f25055e.isEmpty() && this.f25056f.isEmpty()) {
                            f25049o.c(f25048n, "run", "704");
                            this.f25061k.wait();
                        }
                    }
                } catch (InterruptedException unused) {
                }
                if (this.f25057g) {
                    synchronized (this.f25056f) {
                        if (this.f25056f.isEmpty()) {
                            tVar = null;
                        } else {
                            tVar = (t) this.f25056f.elementAt(0);
                            this.f25056f.removeElementAt(0);
                        }
                    }
                    if (tVar != null) {
                        c(tVar);
                    }
                    synchronized (this.f25055e) {
                        if (this.f25055e.isEmpty()) {
                            oVar = null;
                        } else {
                            oVar = (tn.o) this.f25055e.elementAt(0);
                            this.f25055e.removeElementAt(0);
                        }
                    }
                    if (oVar != null) {
                        d(oVar);
                    }
                }
                if (this.f25058h) {
                    this.f25063m.b();
                }
            } catch (Throwable th2) {
                try {
                    f25049o.e(f25048n, "run", "714", null, th2);
                    this.f25057g = false;
                    this.f25054d.i(null, new pn.n(th2));
                } catch (Throwable th3) {
                    synchronized (this.f25062l) {
                        f25049o.c(f25048n, "run", "706");
                        this.f25062l.notifyAll();
                        throw th3;
                    }
                }
            }
            synchronized (this.f25062l) {
                f25049o.c(f25048n, "run", "706");
                this.f25062l.notifyAll();
            }
        }
    }
}
