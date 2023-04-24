package x4;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a */
        public final r4.f f30235a;

        /* renamed from: b */
        public final List<r4.f> f30236b;

        /* renamed from: c */
        public final com.bumptech.glide.load.data.d<Data> f30237c;

        public a() {
            throw null;
        }

        public a(r4.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            List<r4.f> emptyList = Collections.emptyList();
            b0.c.i(fVar);
            this.f30235a = fVar;
            b0.c.i(emptyList);
            this.f30236b = emptyList;
            b0.c.i(dVar);
            this.f30237c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, r4.h hVar);
}
