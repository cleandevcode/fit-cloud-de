package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GifInfoHandle {

    /* renamed from: b */
    public static final /* synthetic */ int f24290b = 0;

    /* renamed from: a */
    public volatile long f24291a;

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (yn.e.f31823a == null) {
                try {
                    yn.e.f31823a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
                }
            }
            new zn.f().b(yn.e.f31823a);
        }
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int extractNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                extractNativeFileDescriptor = createTempNativeFileDescriptor();
                Os.dup2(fileDescriptor, extractNativeFileDescriptor);
            } else {
                extractNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f24291a = openNativeFileDescriptor(extractNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    public GifInfoHandle(String str) {
        this.f24291a = openFile(str);
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10);

    private static native void free(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native int getWidth(long j10);

    private static native boolean isOpaque(long j10);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i10, long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    public final synchronized int a() {
        return getCurrentFrameIndex(this.f24291a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f24291a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f24291a);
    }

    public final synchronized int d() {
        return getDuration(this.f24291a);
    }

    public final synchronized int e() {
        return getHeight(this.f24291a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f24291a);
    }

    public final void finalize() {
        try {
            l();
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f24291a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f24291a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f24291a);
    }

    public final synchronized int j() {
        return getWidth(this.f24291a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f24291a);
    }

    public final synchronized void l() {
        free(this.f24291a);
        this.f24291a = 0L;
    }

    public final synchronized long m(Bitmap bitmap) {
        return renderFrame(this.f24291a, bitmap);
    }

    public final synchronized boolean n() {
        return reset(this.f24291a);
    }

    public final synchronized long o() {
        return restoreRemainder(this.f24291a);
    }

    public final synchronized int p(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f24291a, jArr, bitmap);
    }

    public final synchronized void q() {
        saveRemainder(this.f24291a);
    }

    public final synchronized void r(Bitmap bitmap, int i10) {
        seekToTime(this.f24291a, i10, bitmap);
    }

    public final void s(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f24291a, (char) i10);
        }
    }
}
