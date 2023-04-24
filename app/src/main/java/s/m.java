package s;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import androidx.camera.core.h;
import androidx.camera.core.u;
import androidx.camera.view.c;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import d1.g;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.paho.android.service.MqttService;
import p0.c;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26076a;

    /* renamed from: b */
    public final /* synthetic */ Object f26077b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f26076a = i10;
        this.f26077b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.d dVar;
        switch (this.f26076a) {
            case 0:
                r rVar = (r) this.f26077b;
                rVar.d(rVar.f26148m.f30078h);
                return;
            case 1:
                l2 l2Var = (l2) this.f26077b;
                l2Var.q(l2Var);
                return;
            case 2:
                h.C0023h c0023h = androidx.camera.core.h.H;
                ((h.l) this.f26077b).b(new y.n0(0, "Request is canceled", null));
                return;
            case 3:
                y.b1 b1Var = (y.b1) this.f26077b;
                synchronized (b1Var.f30659m) {
                    if (!b1Var.f30660n) {
                        b1Var.f30661o.i();
                        b1Var.f30661o.close();
                        b1Var.f30662p.release();
                        b1Var.f30666t.a();
                        b1Var.f30660n = true;
                    }
                }
                return;
            case 4:
                u.c cVar = androidx.camera.core.u.f1812t;
                ((androidx.camera.core.u) this.f26077b).C();
                return;
            case 5:
                j0.d dVar2 = (j0.d) this.f26077b;
                j0.f fVar = dVar2.f17240t;
                if (fVar != null) {
                    new AtomicReference();
                    synchronized (fVar.f17244a) {
                    }
                    dVar2.f17240t = null;
                    return;
                }
                return;
            case 6:
                j0.a aVar = ((j0.j) this.f26077b).f17256b;
                if (aVar != null) {
                    for (j0.d dVar3 : aVar.f17225a) {
                        dVar3.a();
                    }
                    return;
                }
                return;
            case 7:
                androidx.camera.view.d dVar4 = (androidx.camera.view.d) this.f26077b;
                c.a aVar2 = dVar4.f1892g;
                if (aVar2 != null) {
                    ((j0.h) aVar2).b();
                    dVar4.f1892g = null;
                    return;
                }
                return;
            case 8:
                g.d dVar5 = (g.d) this.f26077b;
                dVar5.f12608f = null;
                dVar5.onLocationChanged((Location) null);
                return;
            case 9:
                m2.s sVar = (m2.s) this.f26077b;
                gm.l.f(sVar, "this$0");
                sVar.getClass();
                throw null;
            case 10:
                CameraFragment cameraFragment = (CameraFragment) this.f26077b;
                CameraFragment.a aVar3 = CameraFragment.F0;
                gm.l.f(cameraFragment, "this$0");
                cameraFragment.f10418x0 = cameraFragment.i1().viewFinder.getDisplay().getDisplayId();
                p.b.g(cameraFragment.i1().btnShutter, new oh.e(cameraFragment));
                cameraFragment.i1().imgFacing.setEnabled(false);
                p.b.g(cameraFragment.i1().imgFacing, new oh.f(cameraFragment));
                p.b.g(cameraFragment.i1().imgFlash, new oh.g(cameraFragment));
                p.b.g(cameraFragment.i1().imgFile, new oh.h(cameraFragment));
                cameraFragment.i1().countDownView.setCountDownFinishedListener(new m1(7, cameraFragment));
                Context V0 = cameraFragment.V0();
                androidx.camera.lifecycle.e eVar = androidx.camera.lifecycle.e.f1841f;
                synchronized (eVar.f1842a) {
                    dVar = eVar.f1843b;
                    if (dVar == null) {
                        dVar = p0.c.a(new androidx.camera.lifecycle.b(eVar, new y.u(V0)));
                        eVar.f1843b = dVar;
                    }
                }
                d0.b h10 = d0.f.h(dVar, new i(4, V0), o8.b.i());
                h10.a(new g(cameraFragment, h10, 11), y0.a.c(cameraFragment.V0()));
                return;
            default:
                ck.a aVar4 = (ck.a) this.f26077b;
                ck.a aVar5 = ck.a.f4904q;
                aVar4.getClass();
                try {
                    on.e eVar2 = aVar4.f4913i;
                    eVar2.getClass();
                    String h11 = eVar2.h(new on.k(eVar2, null));
                    MqttService mqttService = eVar2.f23664b;
                    String str = eVar2.f23665c;
                    mqttService.d(str).f(h11);
                    mqttService.f23720g.remove(str);
                    mqttService.stopSelf();
                    Log.i("AiotMqtt", "已断开");
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
