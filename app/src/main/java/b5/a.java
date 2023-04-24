package b5;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f3997a;

    /* renamed from: b5.a$a */
    /* loaded from: classes.dex */
    public static class C0050a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f3997a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final ByteBuffer a() {
        this.f3997a.position(0);
        return this.f3997a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}
