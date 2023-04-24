package y4;

import java.io.InputStream;
import java.net.URL;
import r4.h;
import x4.n;
import x4.o;
import x4.r;

/* loaded from: classes.dex */
public final class g implements n<URL, InputStream> {

    /* renamed from: a */
    public final n<x4.f, InputStream> f31130a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // x4.o
        public final n<URL, InputStream> b(r rVar) {
            return new g(rVar.b(x4.f.class, InputStream.class));
        }
    }

    public g(n<x4.f, InputStream> nVar) {
        this.f31130a = nVar;
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // x4.n
    public final n.a<InputStream> b(URL url, int i10, int i11, h hVar) {
        return this.f31130a.b(new x4.f(url), i10, i11, hVar);
    }
}
