package com.bumptech.glide.load;

import a5.x;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import u4.b;

/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int b10 = ((ImageHeaderParser) list.get(i10)).b(inputStream, bVar);
                if (b10 != -1) {
                    return b10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType a10 = list.get(i10).a(byteBuffer);
                m5.a.c(byteBuffer);
                if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return a10;
                }
            } catch (Throwable th2) {
                m5.a.c(byteBuffer);
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new x(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType c10 = ((ImageHeaderParser) list.get(i10)).c(inputStream);
                inputStream.reset();
                if (c10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c10;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
