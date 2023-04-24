package t;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.HashMap;
import s.a0;
import t.d0;
import t.u;

/* loaded from: classes.dex */
public class i0 implements d0.b {

    /* renamed from: a */
    public final CameraManager f27425a;

    /* renamed from: b */
    public final Object f27426b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final HashMap f27427a = new HashMap();

        /* renamed from: b */
        public final Handler f27428b;

        public a(Handler handler) {
            this.f27428b = handler;
        }
    }

    public i0(Context context, a aVar) {
        this.f27425a = (CameraManager) context.getSystemService("camera");
        this.f27426b = aVar;
    }

    @Override // t.d0.b
    public void a(c0.g gVar, a0.b bVar) {
        d0.a aVar;
        a aVar2 = (a) this.f27426b;
        synchronized (aVar2.f27427a) {
            aVar = (d0.a) aVar2.f27427a.get(bVar);
            if (aVar == null) {
                aVar = new d0.a(gVar, bVar);
                aVar2.f27427a.put(bVar, aVar);
            }
        }
        this.f27425a.registerAvailabilityCallback(aVar, aVar2.f27428b);
    }

    @Override // t.d0.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f27425a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw f.a(e10);
        }
    }

    @Override // t.d0.b
    public void c(String str, c0.g gVar, CameraDevice.StateCallback stateCallback) {
        gVar.getClass();
        stateCallback.getClass();
        try {
            this.f27425a.openCamera(str, new u.b(gVar, stateCallback), ((a) this.f27426b).f27428b);
        } catch (CameraAccessException e10) {
            throw new f(e10);
        }
    }

    @Override // t.d0.b
    public void d(a0.b bVar) {
        d0.a aVar;
        if (bVar != null) {
            a aVar2 = (a) this.f27426b;
            synchronized (aVar2.f27427a) {
                aVar = (d0.a) aVar2.f27427a.remove(bVar);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            synchronized (aVar.f27408c) {
                aVar.f27409d = true;
            }
        }
        this.f27425a.unregisterAvailabilityCallback(aVar);
    }
}
