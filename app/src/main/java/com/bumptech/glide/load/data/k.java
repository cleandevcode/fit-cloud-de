package com.bumptech.glide.load.data;

import a5.x;
import com.bumptech.glide.load.data.e;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a */
    public final x f5721a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a */
        public final u4.b f5722a;

        public a(u4.b bVar) {
            this.f5722a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f5722a);
        }
    }

    public k(InputStream inputStream, u4.b bVar) {
        x xVar = new x(inputStream, bVar);
        this.f5721a = xVar;
        xVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final InputStream a() {
        this.f5721a.reset();
        return this.f5721a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f5721a.b();
    }
}
