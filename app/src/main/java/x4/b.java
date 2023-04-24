package x4;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import x4.n;

/* loaded from: classes.dex */
public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a */
    public final InterfaceC0551b<Data> f30198a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: x4.b$a$a */
        /* loaded from: classes.dex */
        public class C0550a implements InterfaceC0551b<ByteBuffer> {
            @Override // x4.b.InterfaceC0551b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // x4.b.InterfaceC0551b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // x4.o
        public final n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0550a());
        }
    }

    /* renamed from: x4.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0551b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a */
        public final byte[] f30199a;

        /* renamed from: b */
        public final InterfaceC0551b<Data> f30200b;

        public c(byte[] bArr, InterfaceC0551b<Data> interfaceC0551b) {
            this.f30199a = bArr;
            this.f30200b = interfaceC0551b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f30200b.a();
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
        public final void e(com.bumptech.glide.j jVar, d.a<? super Data> aVar) {
            aVar.f((Data) this.f30200b.b(this.f30199a));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        public class a implements InterfaceC0551b<InputStream> {
            @Override // x4.b.InterfaceC0551b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // x4.b.InterfaceC0551b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // x4.o
        public final n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0551b<Data> interfaceC0551b) {
        this.f30198a = interfaceC0551b;
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // x4.n
    public final n.a b(byte[] bArr, int i10, int i11, r4.h hVar) {
        byte[] bArr2 = bArr;
        return new n.a(new l5.b(bArr2), new c(bArr2, this.f30198a));
    }
}
