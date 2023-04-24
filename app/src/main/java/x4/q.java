package x4;

import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x4.n;

/* loaded from: classes.dex */
public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a */
    public final List<n<Model, Data>> f30242a;

    /* renamed from: b */
    public final j1.d<List<Throwable>> f30243b;

    /* loaded from: classes.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a */
        public final List<com.bumptech.glide.load.data.d<Data>> f30244a;

        /* renamed from: b */
        public final j1.d<List<Throwable>> f30245b;

        /* renamed from: c */
        public int f30246c;

        /* renamed from: d */
        public com.bumptech.glide.j f30247d;

        /* renamed from: e */
        public d.a<? super Data> f30248e;

        /* renamed from: f */
        public List<Throwable> f30249f;

        /* renamed from: g */
        public boolean f30250g;

        public a(ArrayList arrayList, j1.d dVar) {
            this.f30245b = dVar;
            if (!arrayList.isEmpty()) {
                this.f30244a = arrayList;
                this.f30246c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f30244a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f30249f;
            if (list != null) {
                this.f30245b.release(list);
            }
            this.f30249f = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f30244a) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f30249f;
            b0.c.i(list);
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f30250g = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f30244a) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final r4.a d() {
            return this.f30244a.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            this.f30247d = jVar;
            this.f30248e = aVar;
            this.f30249f = this.f30245b.acquire();
            this.f30244a.get(this.f30246c).e(jVar, this);
            if (this.f30250g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f30248e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f30250g) {
                return;
            }
            if (this.f30246c < this.f30244a.size() - 1) {
                this.f30246c++;
                e(this.f30247d, this.f30248e);
                return;
            }
            b0.c.i(this.f30249f);
            this.f30248e.c(new t4.t("Fetch failed", new ArrayList(this.f30249f)));
        }
    }

    public q(ArrayList arrayList, j1.d dVar) {
        this.f30242a = arrayList;
        this.f30243b = dVar;
    }

    @Override // x4.n
    public final boolean a(Model model) {
        for (n<Model, Data> nVar : this.f30242a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // x4.n
    public final n.a<Data> b(Model model, int i10, int i11, r4.h hVar) {
        n.a<Data> b10;
        int size = this.f30242a.size();
        ArrayList arrayList = new ArrayList(size);
        r4.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n<Model, Data> nVar = this.f30242a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, hVar)) != null) {
                fVar = b10.f30235a;
                arrayList.add(b10.f30237c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f30243b));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MultiModelLoader{modelLoaders=");
        a10.append(Arrays.toString(this.f30242a.toArray()));
        a10.append('}');
        return a10.toString();
    }
}
