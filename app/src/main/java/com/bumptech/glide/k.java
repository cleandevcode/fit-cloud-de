package com.bumptech.glide;

import a0.r1;
import com.bumptech.glide.load.data.e;
import f5.d;
import h5.c;
import h5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n5.a;
import x4.p;
import x4.r;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final x4.p f5685a;

    /* renamed from: b */
    public final h5.a f5686b;

    /* renamed from: c */
    public final h5.c f5687c;

    /* renamed from: d */
    public final h5.d f5688d;

    /* renamed from: e */
    public final com.bumptech.glide.load.data.f f5689e;

    /* renamed from: f */
    public final f5.d f5690f;

    /* renamed from: g */
    public final r1 f5691g;

    /* renamed from: h */
    public final m2.l f5692h = new m2.l(2);

    /* renamed from: i */
    public final h5.b f5693i = new h5.b();

    /* renamed from: j */
    public final a.c f5694j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.c.<init>(java.lang.Object):void");
        }

        public c(List list, Object obj) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public k() {
        a.c cVar = new a.c(new j1.f(20), new n5.b(), new n5.c());
        this.f5694j = cVar;
        this.f5685a = new x4.p(cVar);
        this.f5686b = new h5.a();
        this.f5687c = new h5.c();
        this.f5688d = new h5.d();
        this.f5689e = new com.bumptech.glide.load.data.f();
        this.f5690f = new f5.d();
        this.f5691g = new r1();
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        h5.c cVar2 = this.f5687c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f15875a);
            cVar2.f15875a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f15875a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    cVar2.f15875a.add(str2);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, x4.o oVar) {
        x4.p pVar = this.f5685a;
        synchronized (pVar) {
            r rVar = pVar.f30238a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f30253a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f30239b.f30240a.clear();
        }
    }

    public final void b(Class cls, r4.k kVar) {
        h5.d dVar = this.f5688d;
        synchronized (dVar) {
            dVar.f15880a.add(new d.a(cls, kVar));
        }
    }

    public final void c(r4.j jVar, Class cls, Class cls2, String str) {
        h5.c cVar = this.f5687c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, jVar));
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        r1 r1Var = this.f5691g;
        synchronized (r1Var) {
            arrayList = r1Var.f176a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new b();
    }

    public final <Model> List<x4.n<Model, ?>> e(Model model) {
        List<x4.n<Model, ?>> list;
        x4.p pVar = this.f5685a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0553a c0553a = (p.a.C0553a) pVar.f30239b.f30240a.get(cls);
            if (c0553a == null) {
                list = null;
            } else {
                list = c0553a.f30241a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f30238a.a(cls));
                pVar.f30239b.a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<x4.n<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                x4.n<Model, ?> nVar = list.get(i10);
                if (nVar.a(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(list, model);
        }
        throw new c(model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> f(X x10) {
        com.bumptech.glide.load.data.e<X> b10;
        com.bumptech.glide.load.data.f fVar = this.f5689e;
        synchronized (fVar) {
            b0.c.i(x10);
            e.a aVar = (e.a) fVar.f5710a.get(x10.getClass());
            if (aVar == null) {
                Iterator it = fVar.f5710a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(x10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = com.bumptech.glide.load.data.f.f5709b;
            }
            b10 = aVar.b(x10);
        }
        return b10;
    }

    public final void g(e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f5689e;
        synchronized (fVar) {
            fVar.f5710a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, f5.c cVar) {
        f5.d dVar = this.f5690f;
        synchronized (dVar) {
            dVar.f14125a.add(new d.a(cls, cls2, cVar));
        }
    }
}
