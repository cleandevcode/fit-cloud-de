package x4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import x4.n;

/* loaded from: classes.dex */
public final class e<Data> implements n<File, Data> {

    /* renamed from: a */
    public final d<Data> f30207a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a */
        public final d<Data> f30208a;

        public a(d<Data> dVar) {
            this.f30208a = dVar;
        }

        @Override // x4.o
        public final n<File, Data> b(r rVar) {
            return new e(this.f30208a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // x4.e.d
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // x4.e.d
            public final ParcelFileDescriptor b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // x4.e.d
            public final void c(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a */
        public final File f30209a;

        /* renamed from: b */
        public final d<Data> f30210b;

        /* renamed from: c */
        public Data f30211c;

        public c(File file, d<Data> dVar) {
            this.f30209a = file;
            this.f30210b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f30210b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f30211c;
            if (data != null) {
                try {
                    this.f30210b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final r4.a d() {
            return r4.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f30210b.b(this.f30209a);
                this.f30211c = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: x4.e$e */
    /* loaded from: classes.dex */
    public static class C0552e extends a<InputStream> {

        /* renamed from: x4.e$e$a */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // x4.e.d
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // x4.e.d
            public final InputStream b(File file) {
                return new FileInputStream(file);
            }

            @Override // x4.e.d
            public final void c(InputStream inputStream) {
                inputStream.close();
            }
        }

        public C0552e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f30207a = dVar;
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // x4.n
    public final n.a b(File file, int i10, int i11, r4.h hVar) {
        File file2 = file;
        return new n.a(new l5.b(file2), new c(file2, this.f30207a));
    }
}
