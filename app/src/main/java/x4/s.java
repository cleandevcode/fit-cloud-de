package x4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import x4.n;

/* loaded from: classes.dex */
public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a */
    public final n<Uri, Data> f30260a;

    /* renamed from: b */
    public final Resources f30261b;

    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f30262a;

        public a(Resources resources) {
            this.f30262a = resources;
        }

        @Override // x4.o
        public final n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f30262a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f30263a;

        public b(Resources resources) {
            this.f30263a = resources;
        }

        @Override // x4.o
        public final n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f30263a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f30264a;

        public c(Resources resources) {
            this.f30264a = resources;
        }

        @Override // x4.o
        public final n<Integer, InputStream> b(r rVar) {
            return new s(this.f30264a, rVar.b(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f30265a;

        public d(Resources resources) {
            this.f30265a = resources;
        }

        @Override // x4.o
        public final n<Integer, Uri> b(r rVar) {
            return new s(this.f30265a, u.f30267a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f30261b = resources;
        this.f30260a = nVar;
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // x4.n
    public final n.a b(Integer num, int i10, int i11, r4.h hVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f30261b.getResourcePackageName(num2.intValue()) + '/' + this.f30261b.getResourceTypeName(num2.intValue()) + '/' + this.f30261b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f30260a.b(uri, i10, i11, hVar);
    }
}
