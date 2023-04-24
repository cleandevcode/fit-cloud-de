package yb;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a */
    public String f31310a;

    /* renamed from: b */
    public String f31311b;

    /* renamed from: c */
    public String f31312c;

    /* renamed from: d */
    public String f31313d;

    /* renamed from: e */
    public String f31314e;

    /* renamed from: f */
    public String f31315f;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f31310a);
        jSONObject.put("eventtime", this.f31313d);
        jSONObject.put("event", this.f31311b);
        jSONObject.put("event_session_name", this.f31314e);
        jSONObject.put("first_session_event", this.f31315f);
        if (TextUtils.isEmpty(this.f31312c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f31312c));
        return jSONObject;
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f31311b = jSONObject.optString("event");
        this.f31312c = jSONObject.optString("properties");
        this.f31312c = e.a(this.f31312c, c.e().a());
        this.f31310a = jSONObject.optString("type");
        this.f31313d = jSONObject.optString("eventtime");
        this.f31314e = jSONObject.optString("event_session_name");
        this.f31315f = jSONObject.optString("first_session_event");
    }

    public final JSONObject c() {
        JSONObject a10 = a();
        a10.put("properties", p.b.d(zb.a.a(this.f31312c.getBytes(e.f31288a), p.b.r(c.e().a()))));
        return a10;
    }
}
