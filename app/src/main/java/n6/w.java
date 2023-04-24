package n6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.m0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import n6.p;
import o5.e0;
import o5.f0;
import o5.q0;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w implements Parcelable {

    /* renamed from: a */
    public HashMap f22181a;

    /* renamed from: b */
    public p f22182b;

    /* loaded from: classes.dex */
    public static final class a {
        public static o5.a a(Bundle bundle, String str) {
            String string;
            o5.g gVar = o5.g.f22722c;
            gm.l.f(bundle, "bundle");
            gm.l.f(str, "applicationId");
            m0 m0Var = m0.f12709a;
            Date n10 = m0.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date n11 = m0.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                if ((string2.length() == 0) || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null) {
                    return null;
                }
                if (string.length() == 0) {
                    return null;
                }
                return new o5.a(string2, str, string, stringArrayList, null, null, gVar, n10, new Date(), n11, bundle.getString("graph_domain"));
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0079  */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static o5.a b(java.util.Set r16, android.os.Bundle r17, o5.g r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n6.w.a.b(java.util.Set, android.os.Bundle, o5.g, java.lang.String):o5.a");
        }

        public static o5.h c(Bundle bundle, String str) {
            gm.l.f(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                if (!(string.length() == 0) && str != null) {
                    if (!(str.length() == 0)) {
                        try {
                            return new o5.h(string, str);
                        } catch (Exception e10) {
                            throw new o5.p(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }
    }

    public w(Parcel parcel) {
        HashMap hashMap;
        gm.l.f(parcel, "source");
        m0 m0Var = m0.f12709a;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            int i10 = 0;
            if (readInt > 0) {
                do {
                    i10++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i10 < readInt);
            }
        }
        this.f22181a = hashMap != null ? ul.z.H(hashMap) : null;
    }

    public final void a(String str, String str2) {
        if (this.f22181a == null) {
            this.f22181a = new HashMap();
        }
        HashMap hashMap = this.f22181a;
        if (hashMap == null) {
            return;
        }
        String str3 = (String) hashMap.put(str2, str == null ? null : str.toString());
    }

    public void b() {
    }

    public final String d(String str) {
        gm.l.f(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", f());
            k(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", gm.l.k(e10.getMessage(), "Error creating client state json: "));
        }
        String jSONObject2 = jSONObject.toString();
        gm.l.e(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final p e() {
        p pVar = this.f22182b;
        if (pVar != null) {
            return pVar;
        }
        gm.l.l("loginClient");
        throw null;
    }

    public abstract String f();

    public String g() {
        StringBuilder a10 = android.support.v4.media.d.a("fb");
        a10.append(o5.v.b());
        a10.append("://authorize/");
        return a10.toString();
    }

    public final void h(String str) {
        String str2;
        p.d dVar = e().f22117g;
        if (dVar == null) {
            str2 = null;
        } else {
            str2 = dVar.f22126d;
        }
        if (str2 == null) {
            str2 = o5.v.b();
        }
        p5.m mVar = new p5.m(e().f(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        o5.v vVar = o5.v.f22837a;
        if (q0.b()) {
            mVar.f("fb_dialogs_web_login_dialog_complete", bundle);
        }
    }

    public boolean i(int i10, int i11, Intent intent) {
        return false;
    }

    public final void j(Bundle bundle, p.d dVar) {
        o5.y g10;
        String string = bundle.getString("code");
        if (!m0.A(string)) {
            String str = null;
            if (string == null) {
                g10 = null;
            } else {
                String g11 = g();
                String str2 = dVar.f22138p;
                if (str2 == null) {
                    str2 = "";
                }
                gm.l.f(g11, "redirectUri");
                Bundle bundle2 = new Bundle();
                bundle2.putString("code", string);
                bundle2.putString("client_id", o5.v.b());
                bundle2.putString("redirect_uri", g11);
                bundle2.putString("code_verifier", str2);
                String str3 = o5.y.f22858j;
                g10 = y.c.g(null, "oauth/access_token", null);
                g10.k(f0.GET);
                g10.f22864d = bundle2;
            }
            if (g10 != null) {
                e0 c10 = g10.c();
                o5.s sVar = c10.f22704c;
                if (sVar == null) {
                    try {
                        JSONObject jSONObject = c10.f22703b;
                        if (jSONObject != null) {
                            str = jSONObject.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                        }
                        if (jSONObject != null && !m0.A(str)) {
                            bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, str);
                            if (jSONObject.has("id_token")) {
                                bundle.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                        throw new o5.p("No access token found from result");
                    } catch (JSONException e10) {
                        throw new o5.p(gm.l.k(e10.getMessage(), "Fail to process code exchange response: "));
                    }
                }
                throw new o5.x(sVar, sVar.a());
            }
            throw new o5.p("Failed to create code exchange request");
        }
        throw new o5.p("No code param found from the request");
    }

    public void k(JSONObject jSONObject) {
    }

    public abstract int o(p.d dVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        m0 m0Var = m0.f12709a;
        HashMap hashMap = this.f22181a;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public w(p pVar) {
        this.f22182b = pVar;
    }
}
