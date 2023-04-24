package t5;

import gm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f27768a;

    /* renamed from: b */
    public final List<t5.c> f27769b;

    /* renamed from: c */
    public final List<t5.b> f27770c;

    /* renamed from: d */
    public final String f27771d;

    /* renamed from: t5.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0495a {
        /* JADX INFO: Fake field, exist only in values array */
        CLICK,
        /* JADX INFO: Fake field, exist only in values array */
        SELECTED,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT_CHANGED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0495a[] valuesCustom() {
            return (EnumC0495a[]) Arrays.copyOf(values(), 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static a a(JSONObject jSONObject) {
            int length;
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            l.e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            l.e(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            l.e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c valueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            l.e(string3, "mapping.getString(\"event_type\")");
            String upperCase2 = string3.toUpperCase(locale);
            l.e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            EnumC0495a valueOf2 = EnumC0495a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    l.e(jSONObject2, "jsonPath");
                    arrayList.add(new t5.c(jSONObject2));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i10);
                    l.e(jSONObject3, "jsonParameter");
                    arrayList2.add(new t5.b(jSONObject3));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            l.e(string, "eventName");
            l.e(string4, "appVersion");
            l.e(optString2, "componentId");
            l.e(optString, "pathType");
            l.e(optString3, "activityName");
            return new a(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        MANUAL,
        /* JADX INFO: Fake field, exist only in values array */
        INFERENCE;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            return (c[]) Arrays.copyOf(values(), 2);
        }
    }

    public a(String str, c cVar, EnumC0495a enumC0495a, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        l.f(cVar, "method");
        l.f(enumC0495a, "type");
        this.f27768a = str;
        this.f27769b = arrayList;
        this.f27770c = arrayList2;
        this.f27771d = str5;
    }
}
