package qn;

import bi.m0;
import tn.u;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: o */
    public static final String f25126o;

    /* renamed from: p */
    public static final un.b f25127p;

    /* renamed from: q */
    public static /* synthetic */ Class f25128q;

    /* renamed from: i */
    public String f25137i;

    /* renamed from: a */
    public volatile boolean f25129a = false;

    /* renamed from: b */
    public boolean f25130b = false;

    /* renamed from: c */
    public boolean f25131c = false;

    /* renamed from: d */
    public Object f25132d = new Object();

    /* renamed from: e */
    public Object f25133e = new Object();

    /* renamed from: f */
    public u f25134f = null;

    /* renamed from: g */
    public pn.n f25135g = null;

    /* renamed from: h */
    public String[] f25136h = null;

    /* renamed from: j */
    public pn.b f25138j = null;

    /* renamed from: k */
    public pn.a f25139k = null;

    /* renamed from: l */
    public Object f25140l = null;

    /* renamed from: m */
    public int f25141m = 0;

    /* renamed from: n */
    public boolean f25142n = false;

    static {
        Class<p> cls = f25128q;
        if (cls == null) {
            cls = p.class;
            f25128q = cls;
        }
        String name = cls.getName();
        f25126o = name;
        f25127p = un.c.a(name);
    }

    public p(String str) {
        f25127p.d(str);
    }

    public final void a(u uVar, pn.n nVar) {
        f25127p.g(f25126o, "markComplete", "404", new Object[]{this.f25137i, uVar, nVar});
        synchronized (this.f25132d) {
            boolean z10 = uVar instanceof tn.b;
            this.f25130b = true;
            this.f25134f = uVar;
            this.f25135g = nVar;
        }
    }

    public final void b() {
        f25127p.g(f25126o, "notifyComplete", "404", new Object[]{this.f25137i, this.f25134f, this.f25135g});
        synchronized (this.f25132d) {
            if (this.f25135g == null && this.f25130b) {
                this.f25129a = true;
            }
            this.f25130b = false;
            this.f25132d.notifyAll();
        }
        synchronized (this.f25133e) {
            this.f25131c = true;
            this.f25133e.notifyAll();
        }
    }

    public final void c() {
        boolean z10;
        synchronized (this.f25133e) {
            synchronized (this.f25132d) {
                pn.n nVar = this.f25135g;
                if (nVar != null) {
                    throw nVar;
                }
            }
            while (true) {
                z10 = this.f25131c;
                if (z10) {
                    break;
                }
                try {
                    f25127p.g(f25126o, "waitUntilSent", "409", new Object[]{this.f25137i});
                    this.f25133e.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (!z10) {
                pn.n nVar2 = this.f25135g;
                if (nVar2 == null) {
                    throw m0.h(6);
                }
                throw nVar2;
            }
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(this.f25137i);
        stringBuffer.append(" ,topics=");
        if (this.f25136h != null) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.f25136h;
                if (i10 >= strArr.length) {
                    break;
                }
                stringBuffer.append(strArr[i10]);
                stringBuffer.append(", ");
                i10++;
            }
        }
        stringBuffer.append(" ,usercontext=");
        stringBuffer.append(this.f25140l);
        stringBuffer.append(" ,isComplete=");
        stringBuffer.append(this.f25129a);
        stringBuffer.append(" ,isNotified=");
        stringBuffer.append(this.f25142n);
        stringBuffer.append(" ,exception=");
        stringBuffer.append(this.f25135g);
        stringBuffer.append(" ,actioncallback=");
        stringBuffer.append(this.f25139k);
        return stringBuffer.toString();
    }
}
