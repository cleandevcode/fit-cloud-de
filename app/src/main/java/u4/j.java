package u4;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: j */
    public static final Bitmap.Config f28493j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final k f28494a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f28495b;

    /* renamed from: c */
    public final a f28496c;

    /* renamed from: d */
    public long f28497d;

    /* renamed from: e */
    public long f28498e;

    /* renamed from: f */
    public int f28499f;

    /* renamed from: g */
    public int f28500g;

    /* renamed from: h */
    public int f28501h;

    /* renamed from: i */
    public int f28502i;

    /* loaded from: classes.dex */
    public static final class a {
    }

    public j(long j10) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f28497d = j10;
        this.f28494a = mVar;
        this.f28495b = unmodifiableSet;
        this.f28496c = new a();
    }

    @Override // u4.d
    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && (Build.VERSION.SDK_INT < 23 || i10 < 20)) {
            if (i10 >= 20 || i10 == 15) {
                h(this.f28497d / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // u4.d
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // u4.d
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 == null) {
            if (config == null) {
                config = f28493j;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return g10;
    }

    @Override // u4.d
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((m) this.f28494a).getClass();
                        if (m5.l.c(bitmap) <= this.f28497d && this.f28495b.contains(bitmap.getConfig())) {
                            ((m) this.f28494a).getClass();
                            int c10 = m5.l.c(bitmap);
                            ((m) this.f28494a).f(bitmap);
                            this.f28496c.getClass();
                            this.f28501h++;
                            this.f28498e += c10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f28494a).e(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                f();
                            }
                            h(this.f28497d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f28494a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f28495b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // u4.d
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            g10.eraseColor(0);
            return g10;
        }
        if (config == null) {
            config = f28493j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final void f() {
        StringBuilder a10 = android.support.v4.media.d.a("Hits=");
        a10.append(this.f28499f);
        a10.append(", misses=");
        a10.append(this.f28500g);
        a10.append(", puts=");
        a10.append(this.f28501h);
        a10.append(", evictions=");
        a10.append(this.f28502i);
        a10.append(", currentSize=");
        a10.append(this.f28498e);
        a10.append(", maxSize=");
        a10.append(this.f28497d);
        a10.append("\nStrategy=");
        a10.append(this.f28494a);
        Log.v("LruBitmapPool", a10.toString());
    }

    public final synchronized Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            k kVar = this.f28494a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f28493j;
            }
            b10 = ((m) kVar).b(i10, i11, config2);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing bitmap=");
                    ((m) this.f28494a).getClass();
                    sb2.append(m.c(m5.l.d(config) * i10 * i11, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f28500g++;
            } else {
                this.f28499f++;
                long j10 = this.f28498e;
                ((m) this.f28494a).getClass();
                this.f28498e = j10 - m5.l.c(b10);
                this.f28496c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Get bitmap=");
                ((m) this.f28494a).getClass();
                sb3.append(m.c(m5.l.d(config) * i10 * i11, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b10;
    }

    public final synchronized void h(long j10) {
        while (this.f28498e > j10) {
            m mVar = (m) this.f28494a;
            Bitmap c10 = mVar.f28509b.c();
            if (c10 != null) {
                mVar.a(Integer.valueOf(m5.l.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f28498e = 0L;
                return;
            }
            this.f28496c.getClass();
            long j11 = this.f28498e;
            ((m) this.f28494a).getClass();
            this.f28498e = j11 - m5.l.c(c10);
            this.f28502i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f28494a).e(c10));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c10.recycle();
        }
    }
}
