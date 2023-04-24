package j6;

import f6.f;
import gm.l;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public String f17507a;

    /* renamed from: b */
    public String f17508b;

    /* renamed from: c */
    public Long f17509c;

    public a(File file) {
        l.f(file, "file");
        String name = file.getName();
        l.e(name, "file.name");
        this.f17507a = name;
        JSONObject d10 = f.d(name);
        if (d10 != null) {
            this.f17509c = Long.valueOf(d10.optLong("timestamp", 0L));
            this.f17508b = d10.optString("error_message", null);
        }
    }

    public a(String str) {
        this.f17509c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f17508b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f17509c;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l.e(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f17507a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f17509c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f17508b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
