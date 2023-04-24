package x4;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import x4.n;

/* loaded from: classes.dex */
public final class c implements n<File, ByteBuffer> {

    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a */
        public final File f30201a;

        public a(File file) {
            this.f30201a = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public final void e(com.bumptech.glide.j jVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(m5.a.a(this.f30201a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // x4.o
        public final n<File, ByteBuffer> b(r rVar) {
            return new c();
        }
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // x4.n
    public final n.a<ByteBuffer> b(File file, int i10, int i11, r4.h hVar) {
        File file2 = file;
        return new n.a<>(new l5.b(file2), new a(file2));
    }
}
