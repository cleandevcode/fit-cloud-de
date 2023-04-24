package x6;

import android.os.RemoteException;
import x6.l;

/* loaded from: classes.dex */
public final class e implements l.a {

    /* renamed from: a */
    public final /* synthetic */ c f30359a;

    public e(c cVar) {
        this.f30359a = cVar;
    }

    @Override // x6.l.a
    public final void b(int i10) {
        c cVar = this.f30359a;
        synchronized (cVar) {
            y6.d dVar = cVar.f30344h;
            if (cVar.f30345i && dVar != null) {
                dVar.f31177k += i10;
                if (dVar.f31167a == 2) {
                    float f10 = (dVar.f31169c * i10) / 1000;
                    float f11 = dVar.f31170d * 0.78f * f10;
                    dVar.f31175i += f10;
                    dVar.f31176j += f11;
                }
                cVar.f30348l = true;
                int beginBroadcast = cVar.f30337a.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        g broadcastItem = cVar.f30337a.getBroadcastItem(i11);
                        gm.l.e(broadcastItem, "callbacks.getBroadcastItem(i)");
                        broadcastItem.b(dVar.f31177k);
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                    }
                }
                cVar.f30337a.finishBroadcast();
                tl.l lVar = tl.l.f28297a;
            }
        }
    }
}
