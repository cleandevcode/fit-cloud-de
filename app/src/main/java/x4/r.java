package x4;

import com.bumptech.glide.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n5.a;
import x4.n;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e */
    public static final c f30251e = new c();

    /* renamed from: f */
    public static final a f30252f = new a();

    /* renamed from: a */
    public final ArrayList f30253a;

    /* renamed from: b */
    public final c f30254b;

    /* renamed from: c */
    public final HashSet f30255c;

    /* renamed from: d */
    public final j1.d<List<Throwable>> f30256d;

    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // x4.n
        public final boolean a(Object obj) {
            return false;
        }

        @Override // x4.n
        public final n.a<Object> b(Object obj, int i10, int i11, r4.h hVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f30257a;

        /* renamed from: b */
        public final Class<Data> f30258b;

        /* renamed from: c */
        public final o<? extends Model, ? extends Data> f30259c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f30257a = cls;
            this.f30258b = cls2;
            this.f30259c = oVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f30251e;
        this.f30253a = new ArrayList();
        this.f30255c = new HashSet();
        this.f30256d = cVar;
        this.f30254b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f30253a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f30255c.contains(bVar) && bVar.f30257a.isAssignableFrom(cls)) {
                    this.f30255c.add(bVar);
                    n b10 = bVar.f30259c.b(this);
                    b0.c.i(b10);
                    arrayList.add(b10);
                    this.f30255c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f30255c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        boolean z10;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f30253a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (this.f30255c.contains(bVar)) {
                    z11 = true;
                } else {
                    if (bVar.f30257a.isAssignableFrom(cls) && bVar.f30258b.isAssignableFrom(cls2)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f30255c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f30255c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f30254b;
                j1.d<List<Throwable>> dVar = this.f30256d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z11) {
                return f30252f;
            } else {
                throw new k.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f30255c.clear();
            throw th2;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.f30259c.b(this);
        b0.c.i(nVar);
        return nVar;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f30253a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f30258b) && bVar.f30257a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f30258b);
            }
        }
        return arrayList;
    }
}
