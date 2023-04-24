package com.huawei.hms.ml.common.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.support.v4.media.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ImageConvertUtils {
    public static final int INDEX_PLANE_U = 1;
    public static final int INDEX_PLANE_V = 2;
    public static final int INDEX_PLANE_Y = 0;
    private static final ImageConvertUtils INSTANCE = new ImageConvertUtils();
    public static final int YUV_FORMAT_I420 = 1;
    public static final int YUV_FORMAT_NV21 = 2;

    private ImageConvertUtils() {
    }

    private static byte[] argbToNv21(int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = (i12 * 3) / 2;
        byte[] bArr = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = 0;
            while (i17 < i10) {
                int i18 = iArr[i15];
                int i19 = (16711680 & i18) >> 16;
                int i20 = (65280 & i18) >> 8;
                int i21 = 255;
                int i22 = i18 & 255;
                int i23 = ((((i22 * 25) + ((i20 * 129) + (i19 * 66))) + 128) >> 8) + 16;
                int i24 = ((((i22 * 112) + ((i19 * (-38)) - (i20 * 74))) + 128) >> 8) + 128;
                int i25 = (((((i19 * 112) - (i20 * 94)) - (i22 * 18)) + 128) >> 8) + 128;
                int i26 = i14 + 1;
                if (i23 < 0) {
                    i23 = 0;
                } else if (i23 > 255) {
                    i23 = 255;
                }
                bArr[i14] = (byte) i23;
                if (i16 % 2 == 0 && i15 % 2 == 0 && i12 < i13 - 2) {
                    int i27 = i12 + 1;
                    if (i25 < 0) {
                        i25 = 0;
                    } else if (i25 > 255) {
                        i25 = 255;
                    }
                    bArr[i12] = (byte) i25;
                    i12 = i27 + 1;
                    if (i24 < 0) {
                        i21 = 0;
                    } else if (i24 <= 255) {
                        i21 = i24;
                    }
                    bArr[i27] = (byte) i21;
                }
                i15++;
                i17++;
                i14 = i26;
            }
        }
        return bArr;
    }

    public static byte[] bitmap2Jpeg(Bitmap bitmap, int i10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static byte[] bitmapToNv21(Bitmap bitmap, int i10, int i11) {
        if (bitmap == null || bitmap.getWidth() < i10 || bitmap.getHeight() < i11) {
            return new byte[0];
        }
        int[] iArr = new int[i10 * i11];
        bitmap.getPixels(iArr, 0, i10, 0, 0, i10, i11);
        return argbToNv21(iArr, i10, i11);
    }

    public static byte[] buffer2Byte(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    public static byte[] byteToNv21(byte[] bArr) {
        int length = bArr.length;
        int i10 = (length * 2) / 3;
        int i11 = length - i10;
        int i12 = length / 6;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 % 2 == 0) {
                bArr2[i10 + i13] = bArr[(i13 / 2) + i10];
            } else {
                bArr2[i10 + i13] = bArr[(i13 / 2) + i10 + i12];
            }
        }
        return bArr2;
    }

    private static void checkFormat(Image image, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("only support YUV_FORMAT_I420 and YUV_FORMAT_NV21");
        }
        if (isImageFormatSupported(image)) {
            return;
        }
        StringBuilder a10 = d.a("can't convert Image to byte array, format ");
        a10.append(image.getFormat());
        throw new RuntimeException(a10.toString());
    }

    private static int getChannelOffset(int i10, int i11, int i12) {
        if (i10 != 0) {
            return i10 != 1 ? i11 == 1 ? (int) (i12 * 1.25d) : i12 : i11 == 1 ? i12 : i12 + 1;
        }
        return 0;
    }

    @TargetApi(21)
    public static byte[] getDataFromImage(Image image, int i10) {
        Rect rect;
        int i11;
        int i12 = i10;
        checkFormat(image, i10);
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i13 = width * height;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i13) / 8];
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i14 = 0;
        while (i14 < planes.length) {
            ByteBuffer buffer = planes[i14].getBuffer();
            int rowStride = planes[i14].getRowStride();
            int pixelStride = planes[i14].getPixelStride();
            int channelOffset = getChannelOffset(i14, i12, i13);
            int outputStride = getOutputStride(i14, i12);
            int i15 = i14 == 0 ? 0 : 1;
            int i16 = width >> i15;
            int i17 = height >> i15;
            int i18 = width;
            buffer.position(((cropRect.left >> i15) * pixelStride) + ((cropRect.top >> i15) * rowStride));
            int i19 = 0;
            while (i19 < i17) {
                if (pixelStride == 1 && outputStride == 1) {
                    buffer.get(bArr, channelOffset, i16);
                    channelOffset += i16;
                    rect = cropRect;
                    i11 = i16;
                } else {
                    rect = cropRect;
                    i11 = ((i16 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i11);
                    for (int i20 = 0; i20 < i16; i20++) {
                        bArr[channelOffset] = bArr2[i20 * pixelStride];
                        channelOffset += outputStride;
                    }
                }
                if (i19 < i17 - 1) {
                    buffer.position((buffer.position() + rowStride) - i11);
                }
                i19++;
                cropRect = rect;
            }
            i14++;
            i12 = i10;
            width = i18;
        }
        return bArr;
    }

    public static ImageConvertUtils getInstance() {
        return INSTANCE;
    }

    private static int getOutputStride(int i10, int i11) {
        return (i10 == 0 || i11 == 1) ? 1 : 2;
    }

    private static boolean isImageFormatSupported(Image image) {
        int format = image.getFormat();
        return format == 35 || format == 17 || format == 842094169;
    }

    public static byte[] nv21ToGray(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 2;
        byte[] bArr2 = new byte[i13];
        Arrays.fill(bArr2, Byte.MIN_VALUE);
        System.arraycopy(bArr2, 0, bArr, i12, i13);
        return bArr;
    }

    public static byte[] nv21ToJpeg(byte[] bArr, int i10, int i11) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new YuvImage(bArr, 17, i10, i11, null).compressToJpeg(new Rect(0, 0, i10, i11), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static byte[] yuv2Buffer(Image image) {
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        int remaining = buffer.remaining();
        int remaining2 = buffer2.remaining();
        int remaining3 = buffer3.remaining();
        int i10 = remaining + remaining2 + remaining3;
        byte[] bArr = new byte[i10];
        buffer.get(bArr, 0, remaining);
        buffer3.get(bArr, remaining, remaining3);
        buffer2.get(bArr, i10 - remaining2, remaining2);
        return bArr;
    }
}
