package s;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a */
    public final b f26122a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Executor f26123a;

        /* renamed from: b */
        public final ScheduledExecutorService f26124b;

        /* renamed from: c */
        public final Handler f26125c;

        /* renamed from: d */
        public final r1 f26126d;

        /* renamed from: e */
        public final a0.r1 f26127e;

        /* renamed from: f */
        public final a0.r1 f26128f;

        /* renamed from: g */
        public final boolean f26129g;

        public a(Handler handler, r1 r1Var, a0.r1 r1Var2, a0.r1 r1Var3, c0.g gVar, c0.b bVar) {
            boolean z10;
            boolean z11;
            this.f26123a = gVar;
            this.f26124b = bVar;
            this.f26125c = handler;
            this.f26126d = r1Var;
            this.f26127e = r1Var2;
            this.f26128f = r1Var3;
            boolean b10 = r1Var3.b(v.b0.class);
            boolean b11 = r1Var2.b(v.x.class);
            boolean b12 = r1Var2.b(v.i.class);
            boolean z12 = true;
            if (!b10 && !b11 && !b12) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !new w.s(r1Var2).f29511a) {
                if (((v.g) r1Var3.c(v.g.class)) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            this.f26129g = z12;
        }

        public final p2 a() {
            l2 l2Var;
            if (this.f26129g) {
                a0.r1 r1Var = this.f26127e;
                a0.r1 r1Var2 = this.f26128f;
                l2Var = new o2(this.f26125c, this.f26126d, r1Var, r1Var2, this.f26123a, this.f26124b);
            } else {
                l2Var = new l2(this.f26126d, this.f26123a, this.f26124b, this.f26125c);
            }
            return new p2(l2Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        na.a a(ArrayList arrayList);

        na.a<Void> e(CameraDevice cameraDevice, u.i iVar, List<a0.m0> list);

        boolean stop();
    }

    public p2(l2 l2Var) {
        this.f26122a = l2Var;
    }
}
