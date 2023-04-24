package c5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m5.l;
import r4.h;
import r4.j;
import t4.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final List<ImageHeaderParser> f4531a;

    /* renamed from: b */
    public final u4.b f4532b;

    /* renamed from: c5.a$a */
    /* loaded from: classes.dex */
    public static final class C0067a implements x<Drawable> {

        /* renamed from: a */
        public final AnimatedImageDrawable f4533a;

        public C0067a(AnimatedImageDrawable animatedImageDrawable) {
            this.f4533a = animatedImageDrawable;
        }

        @Override // t4.x
        public final int b() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f4533a.getIntrinsicHeight() * this.f4533a.getIntrinsicWidth() * 2;
        }

        @Override // t4.x
        public final void c() {
            this.f4533a.stop();
            this.f4533a.clearAnimationCallbacks();
        }

        @Override // t4.x
        public final Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // t4.x
        public final Drawable get() {
            return this.f4533a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements j<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final a f4534a;

        public b(a aVar) {
            this.f4534a = aVar;
        }

        @Override // r4.j
        public final x<Drawable> a(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource(byteBuffer);
            this.f4534a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }

        @Override // r4.j
        public final boolean b(ByteBuffer byteBuffer, h hVar) {
            if (com.bumptech.glide.load.a.b(this.f4534a.f4531a, byteBuffer) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements j<InputStream, Drawable> {

        /* renamed from: a */
        public final a f4535a;

        public c(a aVar) {
            this.f4535a = aVar;
        }

        @Override // r4.j
        public final x<Drawable> a(InputStream inputStream, int i10, int i11, h hVar) {
            ImageDecoder.Source createSource = ImageDecoder.createSource(m5.a.b(inputStream));
            this.f4535a.getClass();
            return a.a(createSource, i10, i11, hVar);
        }

        @Override // r4.j
        public final boolean b(InputStream inputStream, h hVar) {
            a aVar = this.f4535a;
            List<ImageHeaderParser> list = aVar.f4531a;
            if (com.bumptech.glide.load.a.c(aVar.f4532b, inputStream, list) == ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return true;
            }
            return false;
        }
    }

    public a(ArrayList arrayList, u4.b bVar) {
        this.f4531a = arrayList;
        this.f4532b = bVar;
    }

    public static C0067a a(ImageDecoder.Source source, int i10, int i11, h hVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new z4.a(i10, i11, hVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0067a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
