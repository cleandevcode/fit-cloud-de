package y;

import android.util.Log;
import androidx.camera.core.h;
import b6.f;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import y5.d;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30709a;

    /* renamed from: b */
    public final /* synthetic */ Object f30710b;

    /* renamed from: c */
    public final /* synthetic */ Object f30711c;

    /* renamed from: d */
    public final /* synthetic */ Object f30712d;

    /* renamed from: e */
    public final /* synthetic */ Object f30713e;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f30709a = i10;
        this.f30710b = obj;
        this.f30711c = obj2;
        this.f30712d = obj3;
        this.f30713e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30709a) {
            case 0:
                ((androidx.camera.core.h) this.f30710b).K((h.n) this.f30711c, (Executor) this.f30712d, (h.m) this.f30713e);
                return;
            case 1:
                JSONObject jSONObject = (JSONObject) this.f30710b;
                String str = (String) this.f30711c;
                b6.f fVar = (b6.f) this.f30712d;
                String str2 = (String) this.f30713e;
                HashSet hashSet = b6.f.f4019e;
                if (!i6.a.b(b6.f.class)) {
                    try {
                        gm.l.f(jSONObject, "$viewData");
                        gm.l.f(str, "$buttonText");
                        gm.l.f(fVar, "this$0");
                        gm.l.f(str2, "$pathID");
                        try {
                            d6.m0 m0Var = d6.m0.f12709a;
                            String m10 = d6.m0.m(o5.v.a());
                            if (m10 != null) {
                                String lowerCase = m10.toLowerCase();
                                gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                                float[] a10 = b6.a.a(lowerCase, jSONObject);
                                String c10 = b6.a.c(str, fVar.f4023d, lowerCase);
                                if (a10 != null) {
                                    y5.d dVar = y5.d.f31147a;
                                    String[] f10 = y5.d.f(d.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10});
                                    if (f10 != null) {
                                        String str3 = f10[0];
                                        b6.b.a(str2, str3);
                                        if (!gm.l.a(str3, "other")) {
                                            HashSet hashSet2 = b6.f.f4019e;
                                            f.a.c(str3, str, a10);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        i6.a.a(b6.f.class, th2);
                        return;
                    }
                }
                return;
            default:
                ck.a aVar = (ck.a) this.f30710b;
                byte[] bArr = (byte[]) this.f30711c;
                String str4 = (String) this.f30712d;
                pk.a aVar2 = (pk.a) this.f30713e;
                ck.a aVar3 = ck.a.f4904q;
                aVar.getClass();
                try {
                    if (!aVar.f4913i.d()) {
                        gm.j.e("AiotMqtt", "mqttAndroidClient.isConnected() ==> " + aVar.f4913i.d());
                        on.e eVar = aVar.f4913i;
                        eVar.getClass();
                        eVar.c(new pn.l(), null, null);
                    }
                    pn.o oVar = new pn.o();
                    if (oVar.f24446a) {
                        bArr.getClass();
                        oVar.f24447b = bArr;
                        oVar.a(aVar.f4918n);
                        aVar.f4913i.e(str4, oVar, new ck.b(aVar2));
                        return;
                    }
                    throw new IllegalStateException();
                } catch (pn.n e10) {
                    Log.e("AiotMqtt", e10.toString());
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
