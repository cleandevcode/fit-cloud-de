package t5;

import gm.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final String f27774a;

    /* renamed from: b */
    public final String f27775b;

    /* renamed from: c */
    public final ArrayList f27776c;

    /* renamed from: d */
    public final String f27777d;

    public b(JSONObject jSONObject) {
        String string = jSONObject.getString("name");
        l.e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f27774a = string;
        String optString = jSONObject.optString("value");
        l.e(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f27775b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        l.e(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f27777d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int i10 = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    l.e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new c(jSONObject2));
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        }
        this.f27776c = arrayList;
    }
}
