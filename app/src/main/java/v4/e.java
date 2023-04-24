package v4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p4.b;
import v4.c;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: b */
    public final File f29046b;

    /* renamed from: c */
    public final long f29047c;

    /* renamed from: e */
    public p4.b f29049e;

    /* renamed from: d */
    public final c f29048d = new c();

    /* renamed from: a */
    public final k f29045a = new k();

    @Deprecated
    public e(File file, long j10) {
        this.f29046b = file;
        this.f29047c = j10;
    }

    @Override // v4.a
    public final File a(r4.f fVar) {
        p4.b bVar;
        String a10 = this.f29045a.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + fVar);
        }
        File file = null;
        try {
            synchronized (this) {
                if (this.f29049e == null) {
                    this.f29049e = p4.b.v(this.f29046b, this.f29047c);
                }
                bVar = this.f29049e;
            }
            b.e q10 = bVar.q(a10);
            if (q10 == null) {
                return null;
            }
            file = q10.f23877a[0];
            return file;
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
                return file;
            }
            return file;
        }
    }

    @Override // v4.a
    public final void b(r4.f fVar, t4.g gVar) {
        c.a aVar;
        p4.b bVar;
        boolean z10;
        String a10 = this.f29045a.a(fVar);
        c cVar = this.f29048d;
        synchronized (cVar) {
            aVar = (c.a) cVar.f29038a.get(a10);
            if (aVar == null) {
                c.b bVar2 = cVar.f29039b;
                synchronized (bVar2.f29042a) {
                    aVar = (c.a) bVar2.f29042a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.f29038a.put(a10, aVar);
            }
            aVar.f29041b++;
        }
        aVar.f29040a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a10 + " for for Key: " + fVar);
            }
            try {
                synchronized (this) {
                    if (this.f29049e == null) {
                        this.f29049e = p4.b.v(this.f29046b, this.f29047c);
                    }
                    bVar = this.f29049e;
                }
                if (bVar.q(a10) == null) {
                    b.c j10 = bVar.j(a10);
                    if (j10 != null) {
                        try {
                            if (gVar.f27596a.e(gVar.f27597b, j10.b(), gVar.f27598c)) {
                                p4.b.a(p4.b.this, j10, true);
                                j10.f23868c = true;
                            }
                            if (!z10) {
                                try {
                                    j10.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!j10.f23868c) {
                                try {
                                    j10.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a10);
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f29048d.a(a10);
        }
    }
}
