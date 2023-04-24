package o5;

import android.os.Handler;
import o5.y;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public final Handler f22798a;

    /* renamed from: b */
    public final y f22799b;

    /* renamed from: c */
    public final long f22800c;

    /* renamed from: d */
    public long f22801d;

    /* renamed from: e */
    public long f22802e;

    /* renamed from: f */
    public long f22803f;

    public o0(Handler handler, y yVar) {
        this.f22798a = handler;
        this.f22799b = yVar;
        v vVar = v.f22837a;
        d6.n0.g();
        this.f22800c = v.f22844h.get();
    }

    public final void a() {
        Boolean valueOf;
        long j10 = this.f22801d;
        if (j10 > this.f22802e) {
            y.b bVar = this.f22799b.f22867g;
            long j11 = this.f22803f;
            if (j11 > 0 && (bVar instanceof y.f)) {
                Handler handler = this.f22798a;
                if (handler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(handler.post(new Runnable(j10, j11) { // from class: o5.n0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((y.f) y.b.this).a();
                        }
                    }));
                }
                if (valueOf == null) {
                    ((y.f) bVar).a();
                }
                this.f22802e = this.f22801d;
            }
        }
    }
}
