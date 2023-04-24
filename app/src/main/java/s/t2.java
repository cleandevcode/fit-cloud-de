package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import java.util.concurrent.Executor;
import r.a;
import s.r;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a */
    public final r f26200a;

    /* renamed from: b */
    public final Executor f26201b;

    /* renamed from: c */
    public final u2 f26202c;

    /* renamed from: d */
    public final androidx.lifecycle.a0<Object> f26203d;

    /* renamed from: e */
    public final b f26204e;

    /* renamed from: f */
    public boolean f26205f = false;

    /* renamed from: g */
    public a f26206g = new a();

    /* loaded from: classes.dex */
    public class a implements r.c {
        public a() {
            t2.this = r1;
        }

        @Override // s.r.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            t2.this.f26204e.a(totalCaptureResult);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(a.C0454a c0454a);

        float c();

        float d();

        void e();
    }

    public t2(r rVar, t.t tVar, c0.g gVar) {
        Range range;
        b s1Var;
        boolean z10 = false;
        this.f26200a = rVar;
        this.f26201b = gVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) tVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e10) {
                y.u0.i("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
                range = null;
            }
            if (range != null) {
                z10 = true;
            }
        }
        if (z10) {
            s1Var = new s.a(tVar);
        } else {
            s1Var = new s1(tVar);
        }
        this.f26204e = s1Var;
        float c10 = s1Var.c();
        float d10 = s1Var.d();
        u2 u2Var = new u2(c10, d10);
        this.f26202c = u2Var;
        u2Var.a();
        this.f26203d = new androidx.lifecycle.a0<>(new e0.a(u2Var.f26214a, c10, d10, u2Var.f26217d));
        rVar.d(this.f26206g);
    }
}
