package x4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x4.n;

/* loaded from: classes.dex */
public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f30270b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final c<Data> f30271a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f30272a;

        public a(ContentResolver contentResolver) {
            this.f30272a = contentResolver;
        }

        @Override // x4.v.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f30272a, uri);
        }

        @Override // x4.o
        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f30273a;

        public b(ContentResolver contentResolver) {
            this.f30273a = contentResolver;
        }

        @Override // x4.v.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f30273a, uri);
        }

        @Override // x4.o
        public final n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new v(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f30274a;

        public d(ContentResolver contentResolver) {
            this.f30274a = contentResolver;
        }

        @Override // x4.v.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f30274a, uri);
        }

        @Override // x4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new v(this);
        }
    }

    public v(c<Data> cVar) {
        this.f30271a = cVar;
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        return f30270b.contains(uri.getScheme());
    }

    @Override // x4.n
    public final n.a b(Uri uri, int i10, int i11, r4.h hVar) {
        Uri uri2 = uri;
        return new n.a(new l5.b(uri2), this.f30271a.a(uri2));
    }
}
