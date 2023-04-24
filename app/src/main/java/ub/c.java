package ub;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final GrsBaseInfo f28648a;

    /* renamed from: b */
    public final Context f28649b;

    /* renamed from: c */
    public final HashSet f28650c = new HashSet();

    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f28648a = grsBaseInfo;
        this.f28649b = context;
    }

    public final String a() {
        if (this.f28650c.size() == 0) {
            HashSet<String> hashSet = rb.b.c(this.f28649b.getPackageName(), this.f28648a).f25460a.f25457g;
            if (hashSet.isEmpty()) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : hashSet) {
                jSONArray.put(str);
            }
            try {
                jSONObject.put("services", jSONArray);
                Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = this.f28650c.iterator();
        while (it.hasNext()) {
            jSONArray2.put((String) it.next());
        }
        try {
            jSONObject2.put("services", jSONArray2);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject2.toString());
            return jSONObject2.toString();
        } catch (JSONException unused2) {
            return "";
        }
    }
}
