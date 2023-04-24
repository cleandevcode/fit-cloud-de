package t5;

import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final String f27778a;

    /* renamed from: b */
    public final int f27779b;

    /* renamed from: c */
    public final int f27780c;

    /* renamed from: d */
    public final String f27781d;

    /* renamed from: e */
    public final String f27782e;

    /* renamed from: f */
    public final String f27783f;

    /* renamed from: g */
    public final String f27784g;

    /* renamed from: h */
    public final int f27785h;

    public c(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        l.e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f27778a = string;
        this.f27779b = jSONObject.optInt("index", -1);
        this.f27780c = jSONObject.optInt("id");
        String optString = jSONObject.optString(InnerShareParams.TEXT);
        l.e(optString, "component.optString(PATH_TEXT_KEY)");
        this.f27781d = optString;
        String optString2 = jSONObject.optString("tag");
        l.e(optString2, "component.optString(PATH_TAG_KEY)");
        this.f27782e = optString2;
        String optString3 = jSONObject.optString("description");
        l.e(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f27783f = optString3;
        String optString4 = jSONObject.optString("hint");
        l.e(optString4, "component.optString(PATH_HINT_KEY)");
        this.f27784g = optString4;
        this.f27785h = jSONObject.optInt("match_bitmask");
    }
}
