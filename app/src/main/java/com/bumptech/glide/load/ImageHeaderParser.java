package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import u4.b;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(0),
        JPEG(1),
        RAW(2),
        PNG_A(3),
        PNG(4),
        WEBP_A(5),
        WEBP(6),
        ANIMATED_WEBP(7),
        AVIF(8),
        UNKNOWN(9);
        

        /* renamed from: a */
        public final boolean f5698a;

        ImageType(int i10) {
            this.f5698a = r1;
        }

        public boolean hasAlpha() {
            return this.f5698a;
        }

        public boolean isWebp() {
            int i10 = a.f5699a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5699a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f5699a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5699a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5699a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);

    int d(ByteBuffer byteBuffer, b bVar);
}
