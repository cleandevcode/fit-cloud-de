package y4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import r4.h;
import x4.n;
import x4.o;
import x4.r;

/* loaded from: classes.dex */
public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a */
    public final Context f31113a;

    /* renamed from: b */
    public final n<File, DataT> f31114b;

    /* renamed from: c */
    public final n<Uri, DataT> f31115c;

    /* renamed from: d */
    public final Class<DataT> f31116d;

    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a */
        public final Context f31117a;

        /* renamed from: b */
        public final Class<DataT> f31118b;

        public a(Context context, Class<DataT> cls) {
            this.f31117a = context;
            this.f31118b = cls;
        }

        @Override // x4.o
        public final n<Uri, DataT> b(r rVar) {
            return new d(this.f31117a, rVar.b(File.class, this.f31118b), rVar.b(Uri.class, this.f31118b), this.f31118b);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: y4.d$d */
    /* loaded from: classes.dex */
    public static final class C0573d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k */
        public static final String[] f31119k = {"_data"};

        /* renamed from: a */
        public final Context f31120a;

        /* renamed from: b */
        public final n<File, DataT> f31121b;

        /* renamed from: c */
        public final n<Uri, DataT> f31122c;

        /* renamed from: d */
        public final Uri f31123d;

        /* renamed from: e */
        public final int f31124e;

        /* renamed from: f */
        public final int f31125f;

        /* renamed from: g */
        public final h f31126g;

        /* renamed from: h */
        public final Class<DataT> f31127h;

        /* renamed from: i */
        public volatile boolean f31128i;

        /* renamed from: j */
        public volatile com.bumptech.glide.load.data.d<DataT> f31129j;

        public C0573d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f31120a = context.getApplicationContext();
            this.f31121b = nVar;
            this.f31122c = nVar2;
            this.f31123d = uri;
            this.f31124e = i10;
            this.f31125f = i11;
            this.f31126g = hVar;
            this.f31127h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f31127h;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f31129j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() {
            boolean isExternalStorageLegacy;
            int checkSelfPermission;
            boolean z10;
            Uri uri;
            n.a<DataT> b10;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            if (isExternalStorageLegacy) {
                n<File, DataT> nVar = this.f31121b;
                Uri uri2 = this.f31123d;
                try {
                    Cursor query = this.f31120a.getContentResolver().query(uri2, f31119k, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b10 = nVar.b(file, this.f31124e, this.f31125f, this.f31126g);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri2);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri2);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                checkSelfPermission = this.f31120a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                if (checkSelfPermission == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    uri = MediaStore.setRequireOriginal(this.f31123d);
                } else {
                    uri = this.f31123d;
                }
                b10 = this.f31122c.b(uri, this.f31124e, this.f31125f, this.f31126g);
            }
            if (b10 == null) {
                return null;
            }
            return b10.f30237c;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f31128i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f31129j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final r4.a d() {
            return r4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f31123d));
                    return;
                }
                this.f31129j = c10;
                if (this.f31128i) {
                    cancel();
                } else {
                    c10.e(jVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f31113a = context.getApplicationContext();
        this.f31114b = nVar;
        this.f31115c = nVar2;
        this.f31116d = cls;
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && p.b.t(uri);
    }

    @Override // x4.n
    public final n.a b(Uri uri, int i10, int i11, h hVar) {
        Uri uri2 = uri;
        return new n.a(new l5.b(uri2), new C0573d(this.f31113a, this.f31114b, this.f31115c, uri2, i10, i11, hVar, this.f31116d));
    }
}
