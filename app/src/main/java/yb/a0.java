package yb;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 implements d0 {

    /* renamed from: a */
    public String f31273a;

    /* renamed from: b */
    public String f31274b;

    public a0(String str, String str2) {
        this.f31273a = str;
        this.f31274b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        b bVar;
        String str2;
        w r10 = y.r(this.f31273a, this.f31274b);
        if (r10 == null) {
            str = "";
        } else {
            str = r10.f31400d;
        }
        String replace = "{url}/getPublicKey?keytype=2".replace("{url}", str);
        String o10 = y.o();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", o10);
        try {
            bVar = a.b(replace, new byte[0], hashMap);
        } catch (Exception e10) {
            StringBuilder a10 = android.support.v4.media.d.a("get pubKey response Exception :");
            a10.append(e10.getMessage());
            m2.f.e("GetPublicKey", a10.toString());
            bVar = null;
        }
        if (bVar != null) {
            if (bVar.f31275a == 200) {
                if (!TextUtils.isEmpty((String) bVar.f31276b)) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) bVar.f31276b);
                        String optString = jSONObject.optString("publicKey");
                        String optString2 = jSONObject.optString("publicKeyOM");
                        String optString3 = jSONObject.optString("pubkey_version");
                        String str3 = System.currentTimeMillis() + "";
                        String optString4 = jSONObject.optString("timeInterval");
                        l.e(y.s(), "Privacy_MY", "public_key_oper", bc.a.d("HiAnalytics_Sdk_Public_Sp_Key", optString));
                        l.e(y.s(), "Privacy_MY", "public_key_maint", bc.a.d("HiAnalytics_Sdk_Public_Sp_Key", optString2));
                        l.e(y.s(), "Privacy_MY", "public_key_time_interval", optString4);
                        l.e(y.s(), "Privacy_MY", "public_key_version", optString3);
                        l.e(y.s(), "Privacy_MY", "public_key_time_last", str3);
                        r.a().f31380a.f31430k = optString;
                        r.a().f31380a.f31431l = optString2;
                        r.a().f31380a.f31434o = optString3;
                        r.a().f31380a.f31433n = str3;
                        r.a().f31380a.f31432m = optString4;
                        return;
                    } catch (JSONException e11) {
                        StringBuilder a11 = android.support.v4.media.d.a("get pubKey parse json JSONException :");
                        a11.append(e11.getMessage());
                        m2.f.e("GetPublicKey", a11.toString());
                        return;
                    }
                }
                return;
            }
            StringBuilder a12 = android.support.v4.media.d.a("get pubKey fail HttpCode :");
            a12.append(bVar.f31275a);
            str2 = a12.toString();
        } else {
            str2 = "get pubKey response is null";
        }
        m2.f.e("GetPublicKey", str2);
    }
}
