package o5;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.f;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements y.b {

    /* renamed from: a */
    public final /* synthetic */ int f22687a;

    /* renamed from: b */
    public final /* synthetic */ Object f22688b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f22687a = i10;
        this.f22688b = obj;
    }

    @Override // o5.y.b
    public final void b(e0 e0Var) {
        Boolean bool = null;
        switch (this.f22687a) {
            case 0:
                f.d dVar = (f.d) this.f22688b;
                gm.l.f(dVar, "$refreshResult");
                JSONObject jSONObject = e0Var.f22705d;
                if (jSONObject != null) {
                    dVar.f22713a = jSONObject.optString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                    dVar.f22714b = jSONObject.optInt("expires_at");
                    dVar.f22715c = jSONObject.optInt(Oauth2AccessToken.KEY_EXPIRES_IN);
                    dVar.f22716d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    dVar.f22717e = jSONObject.optString("graph_domain", null);
                    return;
                }
                return;
            default:
                List<f6.b> list = (List) this.f22688b;
                AtomicBoolean atomicBoolean = g6.c.f15013a;
                if (!i6.a.b(g6.c.class)) {
                    try {
                        gm.l.f(list, "$validReports");
                        try {
                            if (e0Var.f22704c == null) {
                                JSONObject jSONObject2 = e0Var.f22705d;
                                if (jSONObject2 != null) {
                                    bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                                }
                                if (gm.l.a(bool, Boolean.TRUE)) {
                                    for (f6.b bVar : list) {
                                        f6.f.a(bVar.f14131a);
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        i6.a.a(g6.c.class, th2);
                        return;
                    }
                }
                return;
        }
    }
}
