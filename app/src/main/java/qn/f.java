package qn;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import pn.t;
import tn.u;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: d */
    public static final String f25084d;

    /* renamed from: e */
    public static final un.b f25085e;

    /* renamed from: f */
    public static /* synthetic */ Class f25086f;

    /* renamed from: a */
    public Hashtable f25087a;

    /* renamed from: b */
    public String f25088b;

    /* renamed from: c */
    public pn.n f25089c = null;

    static {
        Class<f> cls = f25086f;
        if (cls == null) {
            cls = f.class;
            f25086f = cls;
        }
        String name = cls.getName();
        f25084d = name;
        f25085e = un.c.a(name);
    }

    public f(String str) {
        un.b bVar = f25085e;
        bVar.d(str);
        this.f25087a = new Hashtable();
        this.f25088b = str;
        bVar.c(f25084d, "<Init>", "308");
    }

    public final void a() {
        f25085e.g(f25084d, "clear", "305", new Object[]{new Integer(this.f25087a.size())});
        synchronized (this.f25087a) {
            this.f25087a.clear();
        }
    }

    public final pn.m[] b() {
        pn.m[] mVarArr;
        synchronized (this.f25087a) {
            f25085e.c(f25084d, "getOutstandingDelTokens", "311");
            Vector vector = new Vector();
            Enumeration elements = this.f25087a.elements();
            while (elements.hasMoreElements()) {
                t tVar = (t) elements.nextElement();
                if (tVar != null && (tVar instanceof pn.m) && !tVar.f24452a.f25142n) {
                    vector.addElement(tVar);
                }
            }
            mVarArr = (pn.m[]) vector.toArray(new pn.m[vector.size()]);
        }
        return mVarArr;
    }

    public final t c(u uVar) {
        return (t) this.f25087a.get(uVar.m());
    }

    public final t d(String str) {
        f25085e.g(f25084d, "removeToken", "306", new Object[]{str});
        if (str != null) {
            return (t) this.f25087a.remove(str);
        }
        return null;
    }

    public final void e(u uVar) {
        if (uVar != null) {
            d(uVar.m());
        }
    }

    public final pn.m f(tn.o oVar) {
        pn.m mVar;
        synchronized (this.f25087a) {
            String num = new Integer(oVar.f28412b).toString();
            if (this.f25087a.containsKey(num)) {
                mVar = (pn.m) this.f25087a.get(num);
                f25085e.g(f25084d, "restoreToken", "302", new Object[]{num, oVar, mVar});
            } else {
                mVar = new pn.m(this.f25088b);
                mVar.f24452a.f25137i = num;
                this.f25087a.put(num, mVar);
                f25085e.g(f25084d, "restoreToken", "303", new Object[]{num, oVar, mVar});
            }
        }
        return mVar;
    }

    public final void g(t tVar, String str) {
        synchronized (this.f25087a) {
            f25085e.g(f25084d, "saveToken", "307", new Object[]{str, tVar.toString()});
            tVar.f24452a.f25137i = str;
            this.f25087a.put(str, tVar);
        }
    }

    public final void h(t tVar, u uVar) {
        synchronized (this.f25087a) {
            pn.n nVar = this.f25089c;
            if (nVar != null) {
                throw nVar;
            }
            String m10 = uVar.m();
            f25085e.g(f25084d, "saveToken", "300", new Object[]{m10, uVar});
            g(tVar, m10);
        }
    }

    public final String toString() {
        String stringBuffer;
        String property = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer2 = new StringBuffer();
        synchronized (this.f25087a) {
            Enumeration elements = this.f25087a.elements();
            while (elements.hasMoreElements()) {
                StringBuffer stringBuffer3 = new StringBuffer("{");
                stringBuffer3.append(((t) elements.nextElement()).f24452a);
                stringBuffer3.append("}");
                stringBuffer3.append(property);
                stringBuffer2.append(stringBuffer3.toString());
            }
            stringBuffer = stringBuffer2.toString();
        }
        return stringBuffer;
    }
}
