package x4;

import com.bumptech.glide.load.data.d;
import x4.n;

/* loaded from: classes.dex */
public final class u<Model> implements n<Model, Model> {

    /* renamed from: a */
    public static final u<?> f30267a = new u<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a */
        public static final a<?> f30268a = new a<>();

        @Override // x4.o
        public final n<Model, Model> b(r rVar) {
            return u.f30267a;
        }
    }

    /* loaded from: classes.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: a */
        public final Model f30269a;

        public b(Model model) {
            this.f30269a = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Model> a() {
            return (Class<Model>) this.f30269a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final r4.a d() {
            return r4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Model> aVar) {
            aVar.f((Model) this.f30269a);
        }
    }

    @Override // x4.n
    public final boolean a(Model model) {
        return true;
    }

    @Override // x4.n
    public final n.a<Model> b(Model model, int i10, int i11, r4.h hVar) {
        return new n.a<>(new l5.b(model), new b(model));
    }
}
