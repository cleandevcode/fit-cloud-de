package rb;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import h8.r;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends a {
    public c(Context context) {
        this.f25455e = true;
        if (a(context, "grs_sdk_global_route_config.json") == 0) {
            this.f25454d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0065 A[Catch: JSONException -> 0x007e, LOOP:1: B:56:0x005f->B:58:0x0065, LOOP_END, TryCatch #0 {JSONException -> 0x007e, blocks: (B:39:0x0007, B:40:0x0012, B:42:0x0018, B:44:0x003a, B:50:0x0050, B:52:0x0057, B:56:0x005f, B:58:0x0065, B:59:0x0071, B:60:0x0077, B:46:0x0040, B:48:0x0046, B:49:0x004b), top: B:66:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList j(org.json.JSONObject r12) {
        /*
            java.lang.String r0 = "countries"
            java.lang.String r1 = "countriesOrAreas"
            java.lang.String r2 = "LocalManagerV1"
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L7e
            r5 = 16
            r4.<init>(r5)     // Catch: org.json.JSONException -> L7e
            java.util.Iterator r6 = r12.keys()     // Catch: org.json.JSONException -> L7e
        L12:
            boolean r7 = r6.hasNext()     // Catch: org.json.JSONException -> L7e
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r6.next()     // Catch: org.json.JSONException -> L7e
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L7e
            xb.a r8 = new xb.a     // Catch: org.json.JSONException -> L7e
            r8.<init>()     // Catch: org.json.JSONException -> L7e
            r8.f30459a = r7     // Catch: org.json.JSONException -> L7e
            org.json.JSONObject r7 = r12.getJSONObject(r7)     // Catch: org.json.JSONException -> L7e
            java.lang.String r9 = "name"
            r7.getString(r9)     // Catch: org.json.JSONException -> L7e
            java.lang.String r9 = "description"
            r7.getString(r9)     // Catch: org.json.JSONException -> L7e
            r9 = 0
            boolean r10 = r7.has(r1)     // Catch: org.json.JSONException -> L7e
            if (r10 == 0) goto L40
            org.json.JSONArray r7 = r7.getJSONArray(r1)     // Catch: org.json.JSONException -> L7e
        L3e:
            r9 = r7
            goto L50
        L40:
            boolean r10 = r7.has(r0)     // Catch: org.json.JSONException -> L7e
            if (r10 == 0) goto L4b
            org.json.JSONArray r7 = r7.getJSONArray(r0)     // Catch: org.json.JSONException -> L7e
            goto L3e
        L4b:
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r2, r7)     // Catch: org.json.JSONException -> L7e
        L50:
            java.util.HashSet r7 = new java.util.HashSet     // Catch: org.json.JSONException -> L7e
            r7.<init>(r5)     // Catch: org.json.JSONException -> L7e
            if (r9 == 0) goto L77
            int r10 = r9.length()     // Catch: org.json.JSONException -> L7e
            if (r10 != 0) goto L5e
            goto L77
        L5e:
            r10 = 0
        L5f:
            int r11 = r9.length()     // Catch: org.json.JSONException -> L7e
            if (r10 >= r11) goto L71
            java.lang.Object r11 = r9.get(r10)     // Catch: org.json.JSONException -> L7e
            java.lang.String r11 = (java.lang.String) r11     // Catch: org.json.JSONException -> L7e
            r7.add(r11)     // Catch: org.json.JSONException -> L7e
            int r10 = r10 + 1
            goto L5f
        L71:
            r8.f30460b = r7     // Catch: org.json.JSONException -> L7e
            r4.add(r8)     // Catch: org.json.JSONException -> L7e
            goto L12
        L77:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: org.json.JSONException -> L7e
            r12.<init>()     // Catch: org.json.JSONException -> L7e
            return r12
        L7d:
            return r4
        L7e:
            r12 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r12 = r12.getMessage()
            java.lang.String r12 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r12)
            r0[r3] = r12
            java.lang.String r12 = "parse countryGroups failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r2, r12, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.c.j(org.json.JSONObject):java.util.ArrayList");
    }

    @Override // rb.a
    public final int b(String str) {
        this.f25451a = new r();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f25451a.f16015b = string;
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // rb.a
    public final int f(String str) {
        this.f25452b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = null;
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONObject2 = jSONObject.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONObject2 = jSONObject.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
            }
            if (jSONObject2 == null) {
                return -1;
            }
            if (jSONObject2.length() != 0) {
                this.f25452b.addAll(j(jSONObject2));
            }
            return 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009d A[Catch: JSONException -> 0x013b, TryCatch #0 {JSONException -> 0x013b, blocks: (B:79:0x000c, B:80:0x001d, B:82:0x0023, B:84:0x0036, B:86:0x003f, B:87:0x0052, B:89:0x0058, B:91:0x0069, B:98:0x0082, B:99:0x0097, B:101:0x009d, B:103:0x00b1, B:105:0x00b7, B:108:0x00c8, B:110:0x00d4, B:111:0x00d9, B:92:0x006e, B:94:0x0074, B:96:0x007b, B:112:0x00e1, B:114:0x00ec, B:119:0x00fd, B:122:0x0104, B:125:0x0114, B:127:0x011a, B:128:0x0121, B:130:0x012c, B:123:0x0109, B:115:0x00f1, B:117:0x00f7, B:124:0x010f), top: B:137:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d4 A[Catch: JSONException -> 0x013b, TryCatch #0 {JSONException -> 0x013b, blocks: (B:79:0x000c, B:80:0x001d, B:82:0x0023, B:84:0x0036, B:86:0x003f, B:87:0x0052, B:89:0x0058, B:91:0x0069, B:98:0x0082, B:99:0x0097, B:101:0x009d, B:103:0x00b1, B:105:0x00b7, B:108:0x00c8, B:110:0x00d4, B:111:0x00d9, B:92:0x006e, B:94:0x0074, B:96:0x007b, B:112:0x00e1, B:114:0x00ec, B:119:0x00fd, B:122:0x0104, B:125:0x0114, B:127:0x011a, B:128:0x0121, B:130:0x012c, B:123:0x0109, B:115:0x00f1, B:117:0x00f7, B:124:0x010f), top: B:137:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x011a A[Catch: JSONException -> 0x013b, TryCatch #0 {JSONException -> 0x013b, blocks: (B:79:0x000c, B:80:0x001d, B:82:0x0023, B:84:0x0036, B:86:0x003f, B:87:0x0052, B:89:0x0058, B:91:0x0069, B:98:0x0082, B:99:0x0097, B:101:0x009d, B:103:0x00b1, B:105:0x00b7, B:108:0x00c8, B:110:0x00d4, B:111:0x00d9, B:92:0x006e, B:94:0x0074, B:96:0x007b, B:112:0x00e1, B:114:0x00ec, B:119:0x00fd, B:122:0x0104, B:125:0x0114, B:127:0x011a, B:128:0x0121, B:130:0x012c, B:123:0x0109, B:115:0x00f1, B:117:0x00f7, B:124:0x010f), top: B:137:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012c A[Catch: JSONException -> 0x013b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x013b, blocks: (B:79:0x000c, B:80:0x001d, B:82:0x0023, B:84:0x0036, B:86:0x003f, B:87:0x0052, B:89:0x0058, B:91:0x0069, B:98:0x0082, B:99:0x0097, B:101:0x009d, B:103:0x00b1, B:105:0x00b7, B:108:0x00c8, B:110:0x00d4, B:111:0x00d9, B:92:0x006e, B:94:0x0074, B:96:0x007b, B:112:0x00e1, B:114:0x00ec, B:119:0x00fd, B:122:0x0104, B:125:0x0114, B:127:0x011a, B:128:0x0121, B:130:0x012c, B:123:0x0109, B:115:0x00f1, B:117:0x00f7, B:124:0x010f), top: B:137:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00d9 A[SYNTHETIC] */
    @Override // rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.c.i(java.lang.String):int");
    }
}
