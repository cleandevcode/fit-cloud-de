package a5;

import a5.m;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f */
    public static final r4.g<r4.b> f299f = r4.g.a(r4.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final r4.g<r4.i> f300g = new r4.g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, r4.g.f25213e);

    /* renamed from: h */
    public static final r4.g<Boolean> f301h;

    /* renamed from: i */
    public static final r4.g<Boolean> f302i;

    /* renamed from: j */
    public static final Set<String> f303j;

    /* renamed from: k */
    public static final a f304k;

    /* renamed from: l */
    public static final ArrayDeque f305l;

    /* renamed from: a */
    public final u4.d f306a;

    /* renamed from: b */
    public final DisplayMetrics f307b;

    /* renamed from: c */
    public final u4.b f308c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f309d;

    /* renamed from: e */
    public final s f310e;

    /* loaded from: classes.dex */
    public class a implements b {
        @Override // a5.n.b
        public final void a(Bitmap bitmap, u4.d dVar) {
        }

        @Override // a5.n.b
        public final void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap, u4.d dVar);

        void b();
    }

    static {
        m.e eVar = m.f292a;
        Boolean bool = Boolean.FALSE;
        f301h = r4.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f302i = r4.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f303j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f304k = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = m5.l.f20382a;
        f305l = new ArrayDeque(0);
    }

    public n(ArrayList arrayList, DisplayMetrics displayMetrics, u4.d dVar, u4.b bVar) {
        if (s.f318j == null) {
            synchronized (s.class) {
                if (s.f318j == null) {
                    s.f318j = new s();
                }
            }
        }
        this.f310e = s.f318j;
        this.f309d = arrayList;
        b0.c.i(displayMetrics);
        this.f307b = displayMetrics;
        b0.c.i(dVar);
        this.f306a = dVar;
        b0.c.i(bVar);
        this.f308c = bVar;
    }

    public static Bitmap c(t tVar, BitmapFactory.Options options, b bVar, u4.d dVar) {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            tVar.c();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = a0.f262d;
        lock.lock();
        try {
            try {
                Bitmap b10 = tVar.b(options);
                lock.unlock();
                return b10;
            } catch (IllegalArgumentException e10) {
                IOException e11 = e(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", e11);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        dVar.d(bitmap);
                        options.inBitmap = null;
                        Bitmap c10 = c(tVar, options, bVar, dVar);
                        a0.f262d.unlock();
                        return c10;
                    } catch (IOException unused) {
                        throw e11;
                    }
                }
                throw e11;
            }
        } catch (Throwable th2) {
            a0.f262d.unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder a10 = android.support.v4.media.d.a(" (");
        a10.append(bitmap.getAllocationByteCount());
        a10.append(")");
        String sb2 = a10.toString();
        StringBuilder a11 = android.support.v4.media.d.a("[");
        a11.append(bitmap.getWidth());
        a11.append("x");
        a11.append(bitmap.getHeight());
        a11.append("] ");
        a11.append(bitmap.getConfig());
        a11.append(sb2);
        return a11.toString();
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder a10 = w1.h.a("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        a10.append(str);
        a10.append(", inBitmap: ");
        a10.append(d(options.inBitmap));
        return new IOException(a10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(t tVar, int i10, int i11, r4.h hVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.f308c.c(65536, byte[].class);
        synchronized (n.class) {
            arrayDeque = f305l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        r4.b bVar2 = (r4.b) hVar.c(f299f);
        r4.i iVar = (r4.i) hVar.c(f300g);
        m mVar = (m) hVar.c(m.f297f);
        boolean booleanValue = ((Boolean) hVar.c(f301h)).booleanValue();
        r4.g<Boolean> gVar = f302i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            e e10 = e.e(b(tVar, options2, mVar, bVar2, iVar, z10, i10, i11, booleanValue, bVar), this.f306a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f308c.put(bArr);
            return e10;
        } catch (Throwable th2) {
            f(options2);
            ArrayDeque arrayDeque2 = f305l;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f308c.put(bArr);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x042a, code lost:
        if (r8 >= 26) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0560 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(a5.t r36, android.graphics.BitmapFactory.Options r37, a5.m r38, r4.b r39, r4.i r40, boolean r41, int r42, int r43, boolean r44, a5.n.b r45) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.n.b(a5.t, android.graphics.BitmapFactory$Options, a5.m, r4.b, r4.i, boolean, int, int, boolean, a5.n$b):android.graphics.Bitmap");
    }
}
