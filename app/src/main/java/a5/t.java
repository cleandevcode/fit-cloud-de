package a5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.List;
import m5.a;

/* loaded from: classes.dex */
public interface t {

    /* loaded from: classes.dex */
    public static final class a implements t {

        /* renamed from: a */
        public final ByteBuffer f326a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f327b;

        /* renamed from: c */
        public final u4.b f328c;

        public a(u4.b bVar, ByteBuffer byteBuffer, List list) {
            this.f326a = byteBuffer;
            this.f327b = list;
            this.f328c = bVar;
        }

        @Override // a5.t
        public final int a() {
            List<ImageHeaderParser> list = this.f327b;
            ByteBuffer c10 = m5.a.c(this.f326a);
            u4.b bVar = this.f328c;
            if (c10 == null) {
                return -1;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int d10 = list.get(i10).d(c10, bVar);
                    if (d10 != -1) {
                        return d10;
                    }
                } finally {
                    m5.a.c(c10);
                }
            }
            return -1;
        }

        @Override // a5.t
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0370a(m5.a.c(this.f326a)), null, options);
        }

        @Override // a5.t
        public final void c() {
        }

        @Override // a5.t
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.b(this.f327b, m5.a.c(this.f326a));
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements t {

        /* renamed from: a */
        public final com.bumptech.glide.load.data.k f329a;

        /* renamed from: b */
        public final u4.b f330b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f331c;

        public b(u4.b bVar, m5.j jVar, List list) {
            b0.c.i(bVar);
            this.f330b = bVar;
            b0.c.i(list);
            this.f331c = list;
            this.f329a = new com.bumptech.glide.load.data.k(jVar, bVar);
        }

        @Override // a5.t
        public final int a() {
            List<ImageHeaderParser> list = this.f331c;
            com.bumptech.glide.load.data.k kVar = this.f329a;
            kVar.f5721a.reset();
            return com.bumptech.glide.load.a.a(this.f330b, kVar.f5721a, list);
        }

        @Override // a5.t
        public final Bitmap b(BitmapFactory.Options options) {
            com.bumptech.glide.load.data.k kVar = this.f329a;
            kVar.f5721a.reset();
            return BitmapFactory.decodeStream(kVar.f5721a, null, options);
        }

        @Override // a5.t
        public final void c() {
            x xVar = this.f329a.f5721a;
            synchronized (xVar) {
                xVar.f341c = xVar.f339a.length;
            }
        }

        @Override // a5.t
        public final ImageHeaderParser.ImageType d() {
            List<ImageHeaderParser> list = this.f331c;
            com.bumptech.glide.load.data.k kVar = this.f329a;
            kVar.f5721a.reset();
            return com.bumptech.glide.load.a.c(this.f330b, kVar.f5721a, list);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements t {

        /* renamed from: a */
        public final u4.b f332a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f333b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f334c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, u4.b bVar) {
            b0.c.i(bVar);
            this.f332a = bVar;
            b0.c.i(list);
            this.f333b = list;
            this.f334c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // a5.t
        public final int a() {
            x xVar;
            List<ImageHeaderParser> list = this.f333b;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f334c;
            u4.b bVar = this.f332a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    xVar = new x(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th2) {
                    th = th2;
                    xVar = null;
                }
                try {
                    int b10 = imageHeaderParser.b(xVar, bVar);
                    xVar.b();
                    parcelFileDescriptorRewinder.a();
                    if (b10 != -1) {
                        return b10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (xVar != null) {
                        xVar.b();
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return -1;
        }

        @Override // a5.t
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f334c.a().getFileDescriptor(), null, options);
        }

        @Override // a5.t
        public final void c() {
        }

        @Override // a5.t
        public final ImageHeaderParser.ImageType d() {
            x xVar;
            List<ImageHeaderParser> list = this.f333b;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f334c;
            u4.b bVar = this.f332a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ImageHeaderParser imageHeaderParser = list.get(i10);
                try {
                    xVar = new x(new FileInputStream(parcelFileDescriptorRewinder.a().getFileDescriptor()), bVar);
                } catch (Throwable th2) {
                    th = th2;
                    xVar = null;
                }
                try {
                    ImageHeaderParser.ImageType c10 = imageHeaderParser.c(xVar);
                    xVar.b();
                    parcelFileDescriptorRewinder.a();
                    if (c10 != ImageHeaderParser.ImageType.UNKNOWN) {
                        return c10;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (xVar != null) {
                        xVar.b();
                    }
                    parcelFileDescriptorRewinder.a();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
