package a5;

import android.util.Log;
import androidx.appcompat.widget.e2;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f287a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f288b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        public final ByteBuffer f289a;

        public a(ByteBuffer byteBuffer) {
            this.f289a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // a5.l.c
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // a5.l.c
        public final short b() {
            if (this.f289a.remaining() >= 1) {
                return (short) (this.f289a.get() & 255);
            }
            throw new c.a();
        }

        @Override // a5.l.c
        public final int c(int i10, byte[] bArr) {
            int min = Math.min(i10, this.f289a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f289a.get(bArr, 0, min);
            return min;
        }

        @Override // a5.l.c
        public final long skip(long j10) {
            int min = (int) Math.min(this.f289a.remaining(), j10);
            ByteBuffer byteBuffer = this.f289a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final ByteBuffer f290a;

        public b(byte[] bArr, int i10) {
            this.f290a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            boolean z10;
            if (this.f290a.remaining() - i10 >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this.f290a.getShort(i10);
            }
            return (short) -1;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* loaded from: classes.dex */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        short b();

        int c(int i10, byte[] bArr);

        long skip(long j10);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a */
        public final InputStream f291a;

        public d(InputStream inputStream) {
            this.f291a = inputStream;
        }

        @Override // a5.l.c
        public final int a() {
            return (b() << 8) | b();
        }

        @Override // a5.l.c
        public final short b() {
            int read = this.f291a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // a5.l.c
        public final int c(int i10, byte[] bArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f291a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // a5.l.c
        public final long skip(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f291a.skip(j11);
                if (skip <= 0) {
                    if (this.f291a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public static int e(c cVar, u4.b bVar) {
        try {
            int a10 = cVar.a();
            if (!((a10 & 65496) == 65496 || a10 == 19789 || a10 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
                return -1;
            }
            int g10 = g(cVar);
            if (g10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(g10, byte[].class);
            int h10 = h(cVar, bArr, g10);
            bVar.put(bArr);
            return h10;
        } catch (c.a unused) {
            return -1;
        }
    }

    public static ImageHeaderParser.ImageType f(c cVar) {
        try {
            int a10 = cVar.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b10 = (a10 << 8) | cVar.b();
            if (b10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b11 = (b10 << 8) | cVar.b();
            if (b11 == -1991225785) {
                cVar.skip(21L);
                try {
                    if (cVar.b() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (b11 != 1380533830) {
                boolean z10 = false;
                if (((cVar.a() << 16) | cVar.a()) == 1718909296) {
                    int a11 = (cVar.a() << 16) | cVar.a();
                    if (a11 != 1635150182 && a11 != 1635150195) {
                        cVar.skip(4L);
                        int i10 = b11 - 16;
                        if (i10 % 4 == 0) {
                            int i11 = 0;
                            while (i11 < 5 && i10 > 0) {
                                int a12 = (cVar.a() << 16) | cVar.a();
                                if (a12 != 1635150182 && a12 != 1635150195) {
                                    i11++;
                                    i10 -= 4;
                                }
                            }
                        }
                    }
                    z10 = true;
                    break;
                }
                if (z10) {
                    return ImageHeaderParser.ImageType.AVIF;
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.skip(4L);
                if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a13 = (cVar.a() << 16) | cVar.a();
                if ((a13 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i12 = a13 & 255;
                if (i12 == 88) {
                    cVar.skip(4L);
                    short b12 = cVar.b();
                    if ((b12 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((b12 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i12 == 76) {
                    cVar.skip(4L);
                    if ((cVar.b() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int g(c cVar) {
        short b10;
        short b11;
        int a10;
        long j10;
        long skip;
        do {
            if (cVar.b() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) b10));
                }
                return -1;
            }
            b11 = cVar.b();
            if (b11 == 218) {
                return -1;
            }
            if (b11 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (b11 != 225) {
                j10 = a10;
                skip = cVar.skip(j10);
            } else {
                return a10;
            }
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder a11 = w1.h.a("Unable to skip enough data, type: ", b11, ", wanted to skip: ", a10, ", but actually skipped: ");
            a11.append(skip);
            Log.d("DfltImageHeaderParser", a11.toString());
        }
        return -1;
    }

    public static int h(c cVar, byte[] bArr, int i10) {
        boolean z10;
        ByteOrder byteOrder;
        boolean z11;
        int i11;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        String sb4;
        boolean z12;
        int i12;
        int c10 = cVar.c(i10, bArr);
        if (c10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + c10);
            }
            return -1;
        }
        if (bArr != null && i10 > f287a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = 0;
            while (true) {
                byte[] bArr2 = f287a;
                if (i13 >= bArr2.length) {
                    break;
                } else if (bArr[i13] != bArr2[i13]) {
                    z10 = false;
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr, i10);
            short a10 = bVar.a(6);
            if (a10 != 18761) {
                if (a10 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a10));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            bVar.f290a.order(byteOrder);
            if (bVar.f290a.remaining() - 10 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = bVar.f290a.getInt(10);
            } else {
                i11 = -1;
            }
            int i14 = i11 + 6;
            short a11 = bVar.a(i14);
            for (int i15 = 0; i15 < a11; i15++) {
                int i16 = (i15 * 12) + i14 + 2;
                short a12 = bVar.a(i16);
                if (a12 == 274) {
                    short a13 = bVar.a(i16 + 2);
                    if (a13 >= 1 && a13 <= 12) {
                        int i17 = i16 + 4;
                        if (bVar.f290a.remaining() - i17 >= 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i12 = bVar.f290a.getInt(i17);
                        } else {
                            i12 = -1;
                        }
                        if (i12 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                sb4 = "Negative tiff component count";
                                Log.d("DfltImageHeaderParser", sb4);
                            }
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder a14 = w1.h.a("Got tagIndex=", i15, " tagType=", a12, " formatCode=");
                                a14.append((int) a13);
                                a14.append(" componentCount=");
                                a14.append(i12);
                                Log.d("DfltImageHeaderParser", a14.toString());
                            }
                            int i18 = i12 + f288b[a13];
                            if (i18 > 4) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb2 = new StringBuilder();
                                    str = "Got byte count > 4, not orientation, continuing, formatCode=";
                                    sb2.append(str);
                                    sb2.append((int) a13);
                                    sb3 = sb2;
                                }
                            } else {
                                int i19 = i16 + 8;
                                if (i19 >= 0 && i19 <= bVar.f290a.remaining()) {
                                    if (i18 >= 0 && i18 + i19 <= bVar.f290a.remaining()) {
                                        return bVar.a(i19);
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        sb3 = android.support.v4.media.d.a("Illegal number of bytes for TI tag data tagType=");
                                        sb3.append((int) a12);
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb3 = e2.a("Illegal tagValueOffset=", i19, " tagType=");
                                    sb3.append((int) a12);
                                }
                            }
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        sb2 = new StringBuilder();
                        str = "Got invalid format code = ";
                        sb2.append(str);
                        sb2.append((int) a13);
                        sb3 = sb2;
                    }
                    sb4 = sb3.toString();
                    Log.d("DfltImageHeaderParser", sb4);
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        b0.c.i(byteBuffer);
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(InputStream inputStream, u4.b bVar) {
        b0.c.i(inputStream);
        d dVar = new d(inputStream);
        b0.c.i(bVar);
        return e(dVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        b0.c.i(inputStream);
        return f(new d(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, u4.b bVar) {
        b0.c.i(byteBuffer);
        a aVar = new a(byteBuffer);
        b0.c.i(bVar);
        return e(aVar, bVar);
    }
}
