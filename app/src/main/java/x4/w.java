package x4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x4.n;

/* loaded from: classes.dex */
public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f30275b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final n<f, Data> f30276a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // x4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f30276a = nVar;
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        return f30275b.contains(uri.getScheme());
    }

    @Override // x4.n
    public final n.a b(Uri uri, int i10, int i11, r4.h hVar) {
        return this.f30276a.b(new f(uri.toString()), i10, i11, hVar);
    }
}
