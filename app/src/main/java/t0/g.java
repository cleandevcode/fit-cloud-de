package t0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d */
    public q f27487d;

    /* renamed from: f */
    public int f27489f;

    /* renamed from: g */
    public int f27490g;

    /* renamed from: a */
    public q f27484a = null;

    /* renamed from: b */
    public boolean f27485b = false;

    /* renamed from: c */
    public boolean f27486c = false;

    /* renamed from: e */
    public int f27488e = 1;

    /* renamed from: h */
    public int f27491h = 1;

    /* renamed from: i */
    public h f27492i = null;

    /* renamed from: j */
    public boolean f27493j = false;

    /* renamed from: k */
    public ArrayList f27494k = new ArrayList();

    /* renamed from: l */
    public ArrayList f27495l = new ArrayList();

    public g(q qVar) {
        this.f27487d = qVar;
    }

    @Override // t0.d
    public final void a(d dVar) {
        Iterator it = this.f27495l.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).f27493j) {
                return;
            }
        }
        this.f27486c = true;
        q qVar = this.f27484a;
        if (qVar != null) {
            qVar.a(this);
        }
        if (this.f27485b) {
            this.f27487d.a(this);
            return;
        }
        g gVar = null;
        int i10 = 0;
        Iterator it2 = this.f27495l.iterator();
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (!(gVar2 instanceof h)) {
                i10++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i10 == 1 && gVar.f27493j) {
            h hVar = this.f27492i;
            if (hVar != null) {
                if (!hVar.f27493j) {
                    return;
                }
                this.f27489f = this.f27491h * hVar.f27490g;
            }
            d(gVar.f27490g + this.f27489f);
        }
        q qVar2 = this.f27484a;
        if (qVar2 != null) {
            qVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f27494k.add(dVar);
        if (this.f27493j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f27495l.clear();
        this.f27494k.clear();
        this.f27493j = false;
        this.f27490g = 0;
        this.f27486c = false;
        this.f27485b = false;
    }

    public void d(int i10) {
        if (this.f27493j) {
            return;
        }
        this.f27493j = true;
        this.f27490g = i10;
        Iterator it = this.f27494k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27487d.f27510b.f26333k0);
        sb2.append(":");
        sb2.append(g4.g.b(this.f27488e));
        sb2.append("(");
        if (this.f27493j) {
            obj = Integer.valueOf(this.f27490g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f27495l.size());
        sb2.append(":d=");
        sb2.append(this.f27494k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
