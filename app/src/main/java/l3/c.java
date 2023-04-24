package l3;

import f3.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o3.p;

/* loaded from: classes.dex */
public abstract class c<T> implements k3.a<T> {

    /* renamed from: a */
    public final ArrayList f19385a = new ArrayList();

    /* renamed from: b */
    public T f19386b;

    /* renamed from: c */
    public m3.d<T> f19387c;

    /* renamed from: d */
    public a f19388d;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(m3.d<T> dVar) {
        this.f19387c = dVar;
    }

    @Override // k3.a
    public final void a(T t10) {
        this.f19386b = t10;
        e(this.f19388d, t10);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t10);

    public final void d(Collection collection) {
        this.f19385a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f19385a.add(pVar.f22625a);
            }
        }
        if (this.f19385a.isEmpty()) {
            m3.d<T> dVar = this.f19387c;
            synchronized (dVar.f20337c) {
                if (dVar.f20338d.remove(this) && dVar.f20338d.isEmpty()) {
                    dVar.d();
                }
            }
        } else {
            m3.d<T> dVar2 = this.f19387c;
            synchronized (dVar2.f20337c) {
                if (dVar2.f20338d.add(this)) {
                    if (dVar2.f20338d.size() == 1) {
                        dVar2.f20339e = dVar2.a();
                        m.c().a(m3.d.f20334f, String.format("%s: initial state = %s", dVar2.getClass().getSimpleName(), dVar2.f20339e), new Throwable[0]);
                        dVar2.c();
                    }
                    a(dVar2.f20339e);
                }
            }
        }
        e(this.f19388d, this.f19386b);
    }

    public final void e(a aVar, T t10) {
        if (!this.f19385a.isEmpty() && aVar != null) {
            if (t10 != null && !c(t10)) {
                ArrayList arrayList = this.f19385a;
                k3.d dVar = (k3.d) aVar;
                synchronized (dVar.f18195c) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (dVar.a(str)) {
                            m.c().a(k3.d.f18192d, String.format("Constraints met for %s", str), new Throwable[0]);
                            arrayList2.add(str);
                        }
                    }
                    k3.c cVar = dVar.f18193a;
                    if (cVar != null) {
                        cVar.f(arrayList2);
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.f19385a;
            k3.d dVar2 = (k3.d) aVar;
            synchronized (dVar2.f18195c) {
                k3.c cVar2 = dVar2.f18193a;
                if (cVar2 != null) {
                    cVar2.e(arrayList3);
                }
            }
        }
    }
}
