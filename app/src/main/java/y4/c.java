package y4;

import a5.e0;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import r4.h;
import s4.a;
import x4.n;
import x4.o;
import x4.r;

/* loaded from: classes.dex */
public final class c implements n<Uri, InputStream> {

    /* renamed from: a */
    public final Context f31111a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {

        /* renamed from: a */
        public final Context f31112a;

        public a(Context context) {
            this.f31112a = context;
        }

        @Override // x4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new c(this.f31112a);
        }
    }

    public c(Context context) {
        this.f31111a = context.getApplicationContext();
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (p.b.t(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // x4.n
    public final n.a<InputStream> b(Uri uri, int i10, int i11, h hVar) {
        boolean z10;
        Uri uri2 = uri;
        boolean z11 = true;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Long l10 = (Long) hVar.c(e0.f272d);
            if ((l10 == null || l10.longValue() != -1) ? false : false) {
                l5.b bVar = new l5.b(uri2);
                Context context = this.f31111a;
                return new n.a<>(bVar, s4.a.c(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
