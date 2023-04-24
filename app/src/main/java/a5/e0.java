package a5;

import a0.q0;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r4.g;

/* loaded from: classes.dex */
public final class e0<T> implements r4.j<T, Bitmap> {

    /* renamed from: d */
    public static final r4.g<Long> f272d = new r4.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e */
    public static final r4.g<Integer> f273e = new r4.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f */
    public static final e f274f = new e();

    /* renamed from: g */
    public static final List<String> f275g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final f<T> f276a;

    /* renamed from: b */
    public final u4.d f277b;

    /* renamed from: c */
    public final e f278c;

    /* loaded from: classes.dex */
    public class a implements g.b<Long> {

        /* renamed from: a */
        public final ByteBuffer f279a = ByteBuffer.allocate(8);

        @Override // r4.g.b
        public final void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f279a) {
                this.f279a.position(0);
                messageDigest.update(this.f279a.putLong(l11.longValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f280a = ByteBuffer.allocate(4);

        @Override // r4.g.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f280a) {
                this.f280a.position(0);
                messageDigest.update(this.f280a.putInt(num2.intValue()).array());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // a5.e0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // a5.e0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new g0(byteBuffer));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // a5.e0.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends RuntimeException {
        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public e0(u4.d dVar, f<T> fVar) {
        e eVar = f274f;
        this.f277b = dVar;
        this.f276a = fVar;
        this.f278c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r12, long r13, int r15, int r16, int r17, a5.m r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.e0.c(android.media.MediaMetadataRetriever, long, int, int, int, a5.m):android.graphics.Bitmap");
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(T t10, int i10, int i11, r4.h hVar) {
        long longValue = ((Long) hVar.c(f272d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(q0.a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) hVar.c(f273e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.f297f);
        if (mVar == null) {
            mVar = m.f296e;
        }
        m mVar2 = mVar;
        this.f278c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f276a.a(mediaMetadataRetriever, t10);
            return a5.e.e(c(mediaMetadataRetriever, longValue, num.intValue(), i10, i11, mVar2), this.f277b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // r4.j
    public final boolean b(T t10, r4.h hVar) {
        return true;
    }
}
