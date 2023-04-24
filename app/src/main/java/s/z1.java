package s;

import a0.h0;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import java.util.Collections;
import java.util.concurrent.Executor;
import p0.c;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: j */
    public static final MeteringRectangle[] f26263j = new MeteringRectangle[0];

    /* renamed from: a */
    public final r f26264a;

    /* renamed from: b */
    public final Executor f26265b;

    /* renamed from: c */
    public volatile boolean f26266c = false;

    /* renamed from: d */
    public int f26267d = 1;

    /* renamed from: e */
    public w1 f26268e = null;

    /* renamed from: f */
    public MeteringRectangle[] f26269f;

    /* renamed from: g */
    public MeteringRectangle[] f26270g;

    /* renamed from: h */
    public MeteringRectangle[] f26271h;

    /* renamed from: i */
    public c.a<Void> f26272i;

    public z1(r rVar, c0.g gVar) {
        MeteringRectangle[] meteringRectangleArr = f26263j;
        this.f26269f = meteringRectangleArr;
        this.f26270g = meteringRectangleArr;
        this.f26271h = meteringRectangleArr;
        this.f26272i = null;
        this.f26264a = rVar;
        this.f26265b = gVar;
    }

    public final void a(boolean z10, boolean z11) {
        if (!this.f26266c) {
            return;
        }
        h0.a aVar = new h0.a();
        aVar.f93e = true;
        aVar.f91c = this.f26267d;
        a0.j1 B = a0.j1.B();
        if (z10) {
            B.E(r.a.A(CaptureRequest.CONTROL_AF_TRIGGER), 2);
        }
        if (Build.VERSION.SDK_INT >= 23 && z11) {
            B.E(r.a.A(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
        }
        aVar.c(new r.a(a0.n1.A(B)));
        this.f26264a.q(Collections.singletonList(aVar.d()));
    }
}
