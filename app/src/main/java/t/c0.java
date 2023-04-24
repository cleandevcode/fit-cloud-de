package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.g;
import t.u;
import y.u0;

/* loaded from: classes.dex */
public class c0 implements u.a {

    /* renamed from: a */
    public final CameraDevice f27401a;

    /* renamed from: b */
    public final Object f27402b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final Handler f27403a;

        public a(Handler handler) {
            this.f27403a = handler;
        }
    }

    public c0(CameraDevice cameraDevice, a aVar) {
        cameraDevice.getClass();
        this.f27401a = cameraDevice;
        this.f27402b = aVar;
    }

    public static void b(CameraDevice cameraDevice, u.i iVar) {
        cameraDevice.getClass();
        iVar.getClass();
        iVar.f28436a.b().getClass();
        List<u.b> g10 = iVar.f28436a.g();
        if (g10 != null) {
            if (iVar.f28436a.d() != null) {
                String id2 = cameraDevice.getId();
                for (u.b bVar : g10) {
                    String c10 = bVar.f28423a.c();
                    if (c10 != null && !c10.isEmpty()) {
                        u0.h("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + c10 + ". Ignoring.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u.b) it.next()).f28423a.getSurface());
        }
        return arrayList;
    }

    @Override // t.u.a
    public void a(u.i iVar) {
        b(this.f27401a, iVar);
        if (iVar.f28436a.a() == null) {
            if (iVar.f28436a.f() != 1) {
                g.c cVar = new g.c(iVar.f28436a.d(), iVar.f28436a.b());
                try {
                    this.f27401a.createCaptureSession(c(iVar.f28436a.g()), cVar, ((a) this.f27402b).f27403a);
                    return;
                } catch (CameraAccessException e10) {
                    throw new f(e10);
                }
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }
}
