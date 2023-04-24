package x4;

import java.util.HashMap;
import java.util.List;
import n5.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    public final r f30238a;

    /* renamed from: b */
    public final a f30239b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final HashMap f30240a = new HashMap();

        /* renamed from: x4.p$a$a */
        /* loaded from: classes.dex */
        public static class C0553a<Model> {

            /* renamed from: a */
            public final List<n<Model, ?>> f30241a;

            public C0553a(List<n<Model, ?>> list) {
                this.f30241a = list;
            }
        }

        public final <Model> void a(Class<Model> cls, List<n<Model, ?>> list) {
            if (((C0553a) this.f30240a.put(cls, new C0553a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(a.c cVar) {
        r rVar = new r(cVar);
        this.f30239b = new a();
        this.f30238a = rVar;
    }
}
