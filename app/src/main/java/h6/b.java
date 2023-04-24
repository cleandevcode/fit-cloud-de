package h6;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import f6.f;
import gm.l;
import java.util.List;
import n6.h;
import n6.p;
import o5.e0;
import o5.s;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements y.b {

    /* renamed from: a */
    public final /* synthetic */ int f15883a;

    /* renamed from: b */
    public final /* synthetic */ Object f15884b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f15883a = i10;
        this.f15884b = obj;
    }

    @Override // o5.y.b
    public final void b(e0 e0Var) {
        Boolean valueOf;
        switch (this.f15883a) {
            case 0:
                List<f6.b> list = (List) this.f15884b;
                l.f(list, "$validReports");
                try {
                    if (e0Var.f22704c == null) {
                        JSONObject jSONObject = e0Var.f22705d;
                        if (jSONObject == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                        }
                        if (l.a(valueOf, Boolean.TRUE)) {
                            for (f6.b bVar : list) {
                                f.a(bVar.f14131a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            default:
                h hVar = (h) this.f15884b;
                int i10 = h.M0;
                l.f(hVar, "this$0");
                if (!hVar.F0.get()) {
                    s sVar = e0Var.f22704c;
                    if (sVar != null) {
                        int i11 = sVar.f22824c;
                        boolean z10 = true;
                        if (i11 != 1349174 && i11 != 1349172) {
                            z10 = false;
                        }
                        if (z10) {
                            hVar.p1();
                            return;
                        }
                        if (i11 == 1349152) {
                            h.c cVar = hVar.I0;
                            if (cVar != null) {
                                c6.a aVar = c6.a.f4540a;
                                c6.a.a(cVar.f22087b);
                            }
                            p.d dVar = hVar.L0;
                            if (dVar != null) {
                                hVar.r1(dVar);
                                return;
                            }
                        } else if (i11 != 1349173) {
                            o5.p pVar = sVar.f22830i;
                            if (pVar == null) {
                                pVar = new o5.p();
                            }
                            hVar.m1(pVar);
                            return;
                        }
                        hVar.l1();
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = e0Var.f22703b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        String string = jSONObject2.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                        l.e(string, "resultObject.getString(\"access_token\")");
                        hVar.n1(string, jSONObject2.getLong(Oauth2AccessToken.KEY_EXPIRES_IN), Long.valueOf(jSONObject2.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e10) {
                        hVar.m1(new o5.p(e10));
                        return;
                    }
                }
                return;
        }
    }
}
