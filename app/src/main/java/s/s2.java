package s;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.nio.BufferUnderflowException;
import java.util.concurrent.Executor;
import p0.c;
import s.r;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a */
    public final r f26180a;

    /* renamed from: b */
    public final androidx.lifecycle.a0<Integer> f26181b;

    /* renamed from: c */
    public final boolean f26182c;

    /* renamed from: d */
    public final Executor f26183d;

    /* renamed from: e */
    public boolean f26184e;

    /* renamed from: f */
    public c.a<Void> f26185f;

    /* renamed from: g */
    public boolean f26186g;

    public s2(r rVar, t.t tVar, c0.g gVar) {
        boolean booleanValue;
        this.f26180a = rVar;
        this.f26183d = gVar;
        if (v.k.a(v.o.class) != null) {
            StringBuilder a10 = android.support.v4.media.d.a("Device has quirk ");
            a10.append(v.o.class.getSimpleName());
            a10.append(". Checking for flash availability safely...");
            y.u0.a("FlashAvailability", a10.toString());
            try {
                Boolean bool = (Boolean) tVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (bool == null) {
                    y.u0.h("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
                }
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                }
            } catch (BufferUnderflowException unused) {
            }
            booleanValue = false;
        } else {
            Boolean bool2 = (Boolean) tVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            if (bool2 == null) {
                y.u0.h("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
            }
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            booleanValue = false;
        }
        this.f26182c = booleanValue;
        this.f26181b = new androidx.lifecycle.a0<>(0);
        this.f26180a.d(new r.c() { // from class: s.r2
            @Override // s.r.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                s2 s2Var = s2.this;
                if (s2Var.f26185f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == s2Var.f26186g) {
                        s2Var.f26185f.a(null);
                        s2Var.f26185f = null;
                    }
                }
                return false;
            }
        });
    }

    public final void a(c.a<Void> aVar, boolean z10) {
        if (!this.f26182c) {
            if (aVar != null) {
                aVar.b(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f26184e) {
            androidx.lifecycle.a0<Integer> a0Var = this.f26181b;
            if (p.b.s()) {
                a0Var.j(0);
            } else {
                a0Var.k(0);
            }
            if (aVar != null) {
                aVar.b(new y.i("Camera is not active."));
            }
        } else {
            this.f26186g = z10;
            this.f26180a.h(z10);
            androidx.lifecycle.a0<Integer> a0Var2 = this.f26181b;
            Integer valueOf = Integer.valueOf(z10 ? 1 : 0);
            if (p.b.s()) {
                a0Var2.j(valueOf);
            } else {
                a0Var2.k(valueOf);
            }
            c.a<Void> aVar2 = this.f26185f;
            if (aVar2 != null) {
                aVar2.b(new y.i("There is a new enableTorch being set"));
            }
            this.f26185f = aVar;
        }
    }
}
