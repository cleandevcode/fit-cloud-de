package t4;

import f5.d;
import h5.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import t4.j;
import x4.n;

/* loaded from: classes.dex */
public final class i<Transcode> {

    /* renamed from: a */
    public final ArrayList f27599a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f27600b = new ArrayList();

    /* renamed from: c */
    public com.bumptech.glide.h f27601c;

    /* renamed from: d */
    public Object f27602d;

    /* renamed from: e */
    public int f27603e;

    /* renamed from: f */
    public int f27604f;

    /* renamed from: g */
    public Class<?> f27605g;

    /* renamed from: h */
    public j.d f27606h;

    /* renamed from: i */
    public r4.h f27607i;

    /* renamed from: j */
    public Map<Class<?>, r4.l<?>> f27608j;

    /* renamed from: k */
    public Class<Transcode> f27609k;

    /* renamed from: l */
    public boolean f27610l;

    /* renamed from: m */
    public boolean f27611m;

    /* renamed from: n */
    public r4.f f27612n;

    /* renamed from: o */
    public com.bumptech.glide.j f27613o;

    /* renamed from: p */
    public n f27614p;

    /* renamed from: q */
    public boolean f27615q;

    /* renamed from: r */
    public boolean f27616r;

    public final ArrayList a() {
        if (!this.f27611m) {
            this.f27611m = true;
            this.f27600b.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) b10.get(i10);
                if (!this.f27600b.contains(aVar.f30235a)) {
                    this.f27600b.add(aVar.f30235a);
                }
                for (int i11 = 0; i11 < aVar.f30236b.size(); i11++) {
                    if (!this.f27600b.contains(aVar.f30236b.get(i11))) {
                        this.f27600b.add(aVar.f30236b.get(i11));
                    }
                }
            }
        }
        return this.f27600b;
    }

    public final ArrayList b() {
        if (!this.f27610l) {
            this.f27610l = true;
            this.f27599a.clear();
            List e10 = this.f27601c.a().e(this.f27602d);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a b10 = ((x4.n) e10.get(i10)).b(this.f27602d, this.f27603e, this.f27604f, this.f27607i);
                if (b10 != null) {
                    this.f27599a.add(b10);
                }
            }
        }
        return this.f27599a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> v<Data, ?, Transcode> c(Class<Data> cls) {
        v<Data, ?, Transcode> vVar;
        v<Data, ?, Transcode> vVar2;
        Object obj;
        ArrayList arrayList;
        boolean z10;
        f5.c cVar;
        f5.c cVar2;
        boolean z11;
        com.bumptech.glide.k a10 = this.f27601c.a();
        Class<?> cls2 = this.f27605g;
        Class cls3 = (Class<Transcode>) this.f27609k;
        h5.b bVar = a10.f5693i;
        m5.k andSet = bVar.f15874b.getAndSet(null);
        if (andSet == null) {
            andSet = new m5.k();
        }
        andSet.f20379a = cls;
        andSet.f20380b = cls2;
        andSet.f20381c = cls3;
        synchronized (bVar.f15873a) {
            vVar = (v<Data, ?, Transcode>) bVar.f15873a.getOrDefault(andSet, null);
        }
        bVar.f15874b.set(andSet);
        a10.f5693i.getClass();
        if (h5.b.f15872c.equals(vVar)) {
            return null;
        }
        if (vVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = a10.f5687c.b(cls, cls2).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = a10.f5690f.a(cls4, cls3).iterator();
                while (it2.hasNext()) {
                    Class cls5 = (Class) it2.next();
                    h5.c cVar3 = a10.f5687c;
                    synchronized (cVar3) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar3.f15875a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar3.f15876b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.f15877a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f15878b)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        arrayList.add(aVar.f15879c);
                                    }
                                }
                            }
                        }
                    }
                    f5.d dVar = a10.f5690f;
                    synchronized (dVar) {
                        if (cls5.isAssignableFrom(cls4)) {
                            cVar = f5.e.f14129a;
                        } else {
                            Iterator it4 = dVar.f14125a.iterator();
                            while (it4.hasNext()) {
                                d.a aVar2 = (d.a) it4.next();
                                if (aVar2.f14126a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar2.f14127b)) {
                                    z10 = true;
                                    continue;
                                } else {
                                    z10 = false;
                                    continue;
                                }
                                if (z10) {
                                    cVar = aVar2.f14128c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                        cVar2 = cVar;
                    }
                    arrayList2.add(new m(cls, cls4, cls5, arrayList, cVar2, a10.f5694j));
                }
            }
            if (arrayList2.isEmpty()) {
                vVar2 = null;
            } else {
                vVar2 = new v<>(cls, cls2, cls3, arrayList2, a10.f5694j);
            }
            h5.b bVar2 = a10.f5693i;
            synchronized (bVar2.f15873a) {
                o0.h hVar = bVar2.f15873a;
                m5.k kVar = new m5.k(cls, cls2, cls3);
                if (vVar2 != null) {
                    obj = vVar2;
                } else {
                    obj = h5.b.f15872c;
                }
                hVar.put(kVar, obj);
            }
            return vVar2;
        }
        return vVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d10;
        com.bumptech.glide.k a10 = this.f27601c.a();
        Class<?> cls = this.f27602d.getClass();
        Class<?> cls2 = this.f27605g;
        Class cls3 = this.f27609k;
        m2.l lVar = a10.f5692h;
        m5.k kVar = (m5.k) ((AtomicReference) lVar.f20215a).getAndSet(null);
        if (kVar == null) {
            kVar = new m5.k(cls, cls2, cls3);
        } else {
            kVar.f20379a = cls;
            kVar.f20380b = cls2;
            kVar.f20381c = cls3;
        }
        synchronized (((o0.b) lVar.f20216b)) {
            list = (List) ((o0.b) lVar.f20216b).get(kVar);
        }
        ((AtomicReference) lVar.f20215a).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            x4.p pVar = a10.f5685a;
            synchronized (pVar) {
                d10 = pVar.f30238a.d(cls);
            }
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                Iterator it2 = a10.f5687c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!a10.f5690f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            m2.l lVar2 = a10.f5692h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((o0.b) lVar2.f20216b)) {
                ((o0.b) lVar2.f20216b).put(new m5.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
        r1 = (r4.d<X>) r3.f15871b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <X> r4.d<X> e(X r6) {
        /*
            r5 = this;
            com.bumptech.glide.h r0 = r5.f27601c
            com.bumptech.glide.k r0 = r0.a()
            h5.a r0 = r0.f5686b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f15869a     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L39
            h5.a$a r3 = (h5.a.C0283a) r3     // Catch: java.lang.Throwable -> L39
            java.lang.Class<T> r4 = r3.f15870a     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L13
            r4.d<T> r1 = r3.f15871b     // Catch: java.lang.Throwable -> L39
            goto L2b
        L2a:
            r1 = 0
        L2b:
            monitor-exit(r0)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            com.bumptech.glide.k$e r0 = new com.bumptech.glide.k$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L39:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.i.e(java.lang.Object):r4.d");
    }

    public final <Z> r4.l<Z> f(Class<Z> cls) {
        r4.l<Z> lVar = (r4.l<Z>) this.f27608j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, r4.l<?>>> it = this.f27608j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, r4.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (r4.l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.f27608j.isEmpty() && this.f27615q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return z4.b.f31959b;
        }
        return lVar;
    }
}
