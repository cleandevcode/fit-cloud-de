package t4;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import t4.h;
import t4.o;
import x4.n;

/* loaded from: classes.dex */
public final class c0 implements h, h.a {

    /* renamed from: a */
    public final i<?> f27578a;

    /* renamed from: b */
    public final h.a f27579b;

    /* renamed from: c */
    public volatile int f27580c;

    /* renamed from: d */
    public volatile e f27581d;

    /* renamed from: e */
    public volatile Object f27582e;

    /* renamed from: f */
    public volatile n.a<?> f27583f;

    /* renamed from: g */
    public volatile f f27584g;

    public c0(i<?> iVar, h.a aVar) {
        this.f27578a = iVar;
        this.f27579b = aVar;
    }

    @Override // t4.h.a
    public final void a(r4.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, r4.a aVar, r4.f fVar2) {
        this.f27579b.a(fVar, obj, dVar, this.f27583f.f30237c.d(), fVar);
    }

    @Override // t4.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        if (this.f27582e != null) {
            Object obj = this.f27582e;
            this.f27582e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f27581d != null && this.f27581d.b()) {
            return true;
        }
        this.f27581d = null;
        this.f27583f = null;
        boolean z12 = false;
        while (!z12) {
            if (this.f27580c < this.f27578a.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b10 = this.f27578a.b();
            int i10 = this.f27580c;
            this.f27580c = i10 + 1;
            this.f27583f = (n.a) b10.get(i10);
            if (this.f27583f != null) {
                if (!this.f27578a.f27614p.c(this.f27583f.f30237c.d())) {
                    if (this.f27578a.c(this.f27583f.f30237c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                this.f27583f.f30237c.e(this.f27578a.f27613o, new b0(this, this.f27583f));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // t4.h.a
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // t4.h
    public final void cancel() {
        n.a<?> aVar = this.f27583f;
        if (aVar != null) {
            aVar.f30237c.cancel();
        }
    }

    @Override // t4.h.a
    public final void d(r4.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, r4.a aVar) {
        this.f27579b.d(fVar, exc, dVar, this.f27583f.f30237c.d());
    }

    public final boolean e(Object obj) {
        int i10 = m5.h.f20372b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e f10 = this.f27578a.f27601c.a().f(obj);
            Object a10 = f10.a();
            r4.d<X> e10 = this.f27578a.e(a10);
            g gVar = new g(e10, a10, this.f27578a.f27607i);
            r4.f fVar = this.f27583f.f30235a;
            i<?> iVar = this.f27578a;
            f fVar2 = new f(fVar, iVar.f27612n);
            v4.a a11 = ((o.c) iVar.f27606h).a();
            a11.b(fVar2, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar2 + ", data: " + obj + ", encoder: " + e10 + ", duration: " + m5.h.a(elapsedRealtimeNanos));
            }
            if (a11.a(fVar2) != null) {
                this.f27584g = fVar2;
                this.f27581d = new e(Collections.singletonList(this.f27583f.f30235a), this.f27578a, this);
                this.f27583f.f30237c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f27584g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f27579b.a(this.f27583f.f30235a, f10.a(), this.f27583f.f30237c, this.f27583f.f30237c.d(), this.f27583f.f30235a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f27583f.f30237c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
