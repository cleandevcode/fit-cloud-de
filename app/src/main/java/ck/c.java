package ck;

import android.util.Log;
import gm.j;
import java.util.Iterator;
import jh.v;
import m2.l;
import pn.e;
import pn.n;
import qa.h;
import t3.f;

/* loaded from: classes2.dex */
public final class c implements pn.a {

    /* renamed from: a */
    public final /* synthetic */ a f4923a;

    public c(a aVar) {
        this.f4923a = aVar;
    }

    @Override // pn.a
    public final void a(e eVar) {
        Log.i("AiotMqtt", "connect succeed");
        d dVar = this.f4923a.f4914j;
        if (dVar != null) {
            f.a aVar = (f.a) dVar;
            j.e("AliLpImpl", "onIotConnected...");
            f fVar = f.this;
            fVar.f27557f = true;
            Iterator it = fVar.f27554c.iterator();
            while (it.hasNext()) {
                ((c4.b) it.next()).c();
            }
            if (f.this.f27558g == null) {
                j.e("AliLpImpl", "准备乘车码链路...");
                f fVar2 = f.this;
                fVar2.f27558g = new nk.a(fVar2.f27553b);
                nk.a aVar2 = f.this.f27558g;
            }
            if (f.this.f27559h == null) {
                j.e("AliLpImpl", "准备ID2链路...");
                f fVar3 = f.this;
                fVar3.f27559h = new l(fVar3.f27553b);
                f fVar4 = f.this;
                fVar4.f27560i = new w.j(4, fVar4.f27559h);
            }
            j.e("AliLpImpl", "deviceVersion is ==> " + f.this.f27552a.getSharedPreferences("deviceAuthInfo", 0).getString("deviceVersion", null));
            nk.a aVar3 = f.this.f27558g;
            aVar3.getClass();
            try {
                v vVar = new v();
                j.e("ThingCommunicate", "reply sdk version code...3.3.9");
                String f10 = new h().f(vVar);
                j.e("ThingCommunicate", "sdk reply ===> " + f10);
                aVar3.f22452a.a(aVar3.f22453b + "/event/property/post", f10.getBytes(), new h7.a(0));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // pn.a
    public final void b(e eVar, Exception exc) {
        Log.i("AiotMqtt", "connect failed");
        d dVar = this.f4923a.f4914j;
        if (dVar != null) {
            f.a aVar = (f.a) dVar;
            j.e("AliLpImpl", "onIotConnectFailure..." + exc);
            f.this.f27557f = false;
            if (exc instanceof n) {
                n nVar = (n) exc;
                int i10 = nVar.f24444a;
                String message = nVar.getMessage();
                Iterator it = f.this.f27554c.iterator();
                while (it.hasNext()) {
                    ((c4.b) it.next()).a(i10, message);
                }
            }
        }
        exc.printStackTrace();
    }
}
