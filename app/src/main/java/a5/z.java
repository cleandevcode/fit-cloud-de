package a5;

import a5.n;
import a5.t;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class z implements r4.j<InputStream, Bitmap> {

    /* renamed from: a */
    public final n f347a;

    /* renamed from: b */
    public final u4.b f348b;

    /* loaded from: classes.dex */
    public static class a implements n.b {

        /* renamed from: a */
        public final x f349a;

        /* renamed from: b */
        public final m5.d f350b;

        public a(x xVar, m5.d dVar) {
            this.f349a = xVar;
            this.f350b = dVar;
        }

        @Override // a5.n.b
        public final void a(Bitmap bitmap, u4.d dVar) {
            IOException iOException = this.f350b.f20366b;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // a5.n.b
        public final void b() {
            x xVar = this.f349a;
            synchronized (xVar) {
                xVar.f341c = xVar.f339a.length;
            }
        }
    }

    public z(n nVar, u4.b bVar) {
        this.f347a = nVar;
        this.f348b = bVar;
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(InputStream inputStream, int i10, int i11, r4.h hVar) {
        x xVar;
        boolean z10;
        m5.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof x) {
            xVar = (x) inputStream2;
            z10 = false;
        } else {
            xVar = new x(inputStream2, this.f348b);
            z10 = true;
        }
        ArrayDeque arrayDeque = m5.d.f20364c;
        synchronized (arrayDeque) {
            dVar = (m5.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new m5.d();
        }
        dVar.f20365a = xVar;
        m5.j jVar = new m5.j(dVar);
        a aVar = new a(xVar, dVar);
        try {
            n nVar = this.f347a;
            e a10 = nVar.a(new t.b(nVar.f308c, jVar, nVar.f309d), i10, i11, hVar, aVar);
            dVar.f20366b = null;
            dVar.f20365a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar);
            }
            if (z10) {
                xVar.b();
            }
            return a10;
        } catch (Throwable th2) {
            dVar.f20366b = null;
            dVar.f20365a = null;
            ArrayDeque arrayDeque2 = m5.d.f20364c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar);
                if (z10) {
                    xVar.b();
                }
                throw th2;
            }
        }
    }

    @Override // r4.j
    public final boolean b(InputStream inputStream, r4.h hVar) {
        this.f347a.getClass();
        return true;
    }
}
