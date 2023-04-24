package w;

import a0.r1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p0.c;
import s.i2;
import w.s;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public final boolean f29511a;

    /* renamed from: c */
    public final na.a<Void> f29513c;

    /* renamed from: d */
    public c.a<Void> f29514d;

    /* renamed from: e */
    public boolean f29515e;

    /* renamed from: b */
    public final Object f29512b = new Object();

    /* renamed from: f */
    public final a f29516f = new a();

    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
            s.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            c.a<Void> aVar = s.this.f29514d;
            if (aVar != null) {
                boolean z10 = true;
                aVar.f23756d = true;
                c.d<Void> dVar = aVar.f23754b;
                if ((dVar == null || !dVar.f23758b.cancel(true)) ? false : false) {
                    aVar.f23753a = null;
                    aVar.f23754b = null;
                    aVar.f23755c = null;
                }
                s.this.f29514d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            c.a<Void> aVar = s.this.f29514d;
            if (aVar != null) {
                aVar.a(null);
                s.this.f29514d = null;
            }
        }
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface b {
    }

    public s(r1 r1Var) {
        boolean b10 = r1Var.b(v.h.class);
        this.f29511a = b10;
        this.f29513c = b10 ? p0.c.a(new s.i(2, this)) : d0.f.e(null);
    }

    public static d0.d a(final CameraDevice cameraDevice, final u.i iVar, final s.i iVar2, final List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i2) it.next()).i());
        }
        return d0.d.b(new d0.m(new ArrayList(arrayList2), false, o8.b.i())).d(new d0.a() { // from class: w.r
            @Override // d0.a
            public final na.a apply(Object obj) {
                na.a e10;
                s.b bVar = iVar2;
                List list2 = (List) obj;
                e10 = super/*s.l2*/.e(cameraDevice, iVar, list);
                return e10;
            }
        }, o8.b.i());
    }
}
