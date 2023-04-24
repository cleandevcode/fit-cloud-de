package x4;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import x4.n;

/* loaded from: classes.dex */
public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f30194a;

    /* renamed from: b */
    public final InterfaceC0549a<Data> f30195b;

    /* renamed from: x4.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0549a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, AssetFileDescriptor>, InterfaceC0549a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f30196a;

        public b(AssetManager assetManager) {
            this.f30196a = assetManager;
        }

        @Override // x4.a.InterfaceC0549a
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // x4.o
        public final n<Uri, AssetFileDescriptor> b(r rVar) {
            return new a(this.f30196a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0549a<InputStream> {

        /* renamed from: a */
        public final AssetManager f30197a;

        public c(AssetManager assetManager) {
            this.f30197a = assetManager;
        }

        @Override // x4.a.InterfaceC0549a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // x4.o
        public final n<Uri, InputStream> b(r rVar) {
            return new a(this.f30197a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0549a<Data> interfaceC0549a) {
        this.f30194a = assetManager;
        this.f30195b = interfaceC0549a;
    }

    @Override // x4.n
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // x4.n
    public final n.a b(Uri uri, int i10, int i11, r4.h hVar) {
        Uri uri2 = uri;
        return new n.a(new l5.b(uri2), this.f30195b.a(this.f30194a, uri2.toString().substring(22)));
    }
}
