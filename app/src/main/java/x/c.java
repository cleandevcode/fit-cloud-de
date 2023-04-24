package x;

import a0.n1;
import androidx.activity.h;
import c0.g;
import java.util.concurrent.Executor;
import p0.c;
import r.a;
import s.r;
import y.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    public final r f30073c;

    /* renamed from: d */
    public final Executor f30074d;

    /* renamed from: g */
    public c.a<Void> f30077g;

    /* renamed from: a */
    public boolean f30071a = false;

    /* renamed from: b */
    public boolean f30072b = false;

    /* renamed from: e */
    public final Object f30075e = new Object();

    /* renamed from: f */
    public a.C0454a f30076f = new a.C0454a();

    /* renamed from: h */
    public final b f30078h = new r.c() { // from class: x.b
        @Override // s.r.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(android.hardware.camera2.TotalCaptureResult r4) {
            /*
                r3 = this;
                x.c r0 = x.c.this
                p0.c$a<java.lang.Void> r1 = r0.f30077g
                r2 = 0
                if (r1 == 0) goto L34
                android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
                java.lang.Object r4 = r4.getTag()
                boolean r1 = r4 instanceof a0.d2
                if (r1 == 0) goto L34
                a0.d2 r4 = (a0.d2) r4
                java.lang.String r1 = "Camera2CameraControl"
                java.lang.Object r4 = r4.a(r1)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L34
                p0.c$a<java.lang.Void> r1 = r0.f30077g
                int r1 = r1.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r4 = r4.equals(r1)
                if (r4 == 0) goto L34
                p0.c$a<java.lang.Void> r4 = r0.f30077g
                r0.f30077g = r2
                goto L35
            L34:
                r4 = r2
            L35:
                if (r4 == 0) goto L3a
                r4.a(r2)
            L3a:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x.b.a(android.hardware.camera2.TotalCaptureResult):boolean");
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [x.b] */
    public c(r rVar, g gVar) {
        this.f30073c = rVar;
        this.f30074d = gVar;
    }

    public final r.a a() {
        r.a aVar;
        synchronized (this.f30075e) {
            c.a<Void> aVar2 = this.f30077g;
            if (aVar2 != null) {
                this.f30076f.f25144a.E(r.a.F, Integer.valueOf(aVar2.hashCode()));
            }
            a.C0454a c0454a = this.f30076f;
            c0454a.getClass();
            aVar = new r.a(n1.A(c0454a.f25144a));
        }
        return aVar;
    }

    public final void b(c.a<Void> aVar) {
        this.f30072b = true;
        c.a<Void> aVar2 = this.f30077g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f30077g = aVar;
        if (this.f30071a) {
            r rVar = this.f30073c;
            rVar.f26138c.execute(new h(1, rVar));
            this.f30072b = false;
        }
        if (aVar2 != null) {
            aVar2.b(new i("Camera2CameraControl was updated with new options."));
        }
    }
}
