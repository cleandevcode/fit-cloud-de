package x4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import x4.n;

/* loaded from: classes.dex */
public final class j implements n<Uri, File> {

    /* renamed from: a */
    public final Context f30225a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a */
        public final Context f30226a;

        public a(Context context) {
            this.f30226a = context;
        }

        @Override // x4.o
        public final n<Uri, File> b(r rVar) {
            return new j(this.f30226a);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c */
        public static final String[] f30227c = {"_data"};

        /* renamed from: a */
        public final Context f30228a;

        /* renamed from: b */
        public final Uri f30229b;

        public b(Context context, Uri uri) {
            this.f30228a = context;
            this.f30229b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
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
        public final void e(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f30228a.getContentResolver().query(this.f30229b, f30227c, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder a10 = android.support.v4.media.d.a("Failed to find file path for: ");
                a10.append(this.f30229b);
                aVar.c(new FileNotFoundException(a10.toString()));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public j(Context context) {
        this.f30225a = context;
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        return p.b.t(uri);
    }

    @Override // x4.n
    public final n.a<File> b(Uri uri, int i10, int i11, r4.h hVar) {
        Uri uri2 = uri;
        return new n.a<>(new l5.b(uri2), new b(this.f30225a, uri2));
    }
}
