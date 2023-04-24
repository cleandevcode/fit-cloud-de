package rb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import h8.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public r f25451a;

    /* renamed from: b */
    public ArrayList f25452b;

    /* renamed from: c */
    public ConcurrentHashMap f25453c = new ConcurrentHashMap(16);

    /* renamed from: d */
    public boolean f25454d = false;

    /* renamed from: e */
    public boolean f25455e = false;

    /* renamed from: f */
    public boolean f25456f = false;

    /* renamed from: g */
    public HashSet f25457g = new HashSet(16);

    /* JADX WARN: Removed duplicated region for block: B:70:0x006c A[Catch: JSONException -> 0x0087, LOOP:1: B:68:0x0066->B:70:0x006c, LOOP_END, TryCatch #0 {JSONException -> 0x0087, blocks: (B:51:0x0011, B:52:0x0019, B:54:0x001f, B:56:0x0041, B:62:0x0057, B:64:0x005e, B:68:0x0066, B:70:0x006c, B:71:0x0078, B:72:0x0080, B:58:0x0047, B:60:0x004d, B:61:0x0052), top: B:80:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(org.json.JSONArray r12) {
        /*
            java.lang.String r0 = "countries"
            java.lang.String r1 = "countriesOrAreas"
            java.lang.String r2 = "AbstractLocalManager"
            if (r12 == 0) goto La0
            int r3 = r12.length()
            if (r3 != 0) goto L10
            goto La0
        L10:
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L87
            r5 = 16
            r4.<init>(r5)     // Catch: org.json.JSONException -> L87
            r6 = 0
        L19:
            int r7 = r12.length()     // Catch: org.json.JSONException -> L87
            if (r6 >= r7) goto L86
            org.json.JSONObject r7 = r12.getJSONObject(r6)     // Catch: org.json.JSONException -> L87
            xb.a r8 = new xb.a     // Catch: org.json.JSONException -> L87
            r8.<init>()     // Catch: org.json.JSONException -> L87
            java.lang.String r9 = "id"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L87
            r8.f30459a = r9     // Catch: org.json.JSONException -> L87
            java.lang.String r9 = "name"
            r7.getString(r9)     // Catch: org.json.JSONException -> L87
            java.lang.String r9 = "description"
            r7.getString(r9)     // Catch: org.json.JSONException -> L87
            r9 = 0
            boolean r10 = r7.has(r1)     // Catch: org.json.JSONException -> L87
            if (r10 == 0) goto L47
            org.json.JSONArray r7 = r7.getJSONArray(r1)     // Catch: org.json.JSONException -> L87
        L45:
            r9 = r7
            goto L57
        L47:
            boolean r10 = r7.has(r0)     // Catch: org.json.JSONException -> L87
            if (r10 == 0) goto L52
            org.json.JSONArray r7 = r7.getJSONArray(r0)     // Catch: org.json.JSONException -> L87
            goto L45
        L52:
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r2, r7)     // Catch: org.json.JSONException -> L87
        L57:
            java.util.HashSet r7 = new java.util.HashSet     // Catch: org.json.JSONException -> L87
            r7.<init>(r5)     // Catch: org.json.JSONException -> L87
            if (r9 == 0) goto L80
            int r10 = r9.length()     // Catch: org.json.JSONException -> L87
            if (r10 != 0) goto L65
            goto L80
        L65:
            r10 = 0
        L66:
            int r11 = r9.length()     // Catch: org.json.JSONException -> L87
            if (r10 >= r11) goto L78
            java.lang.Object r11 = r9.get(r10)     // Catch: org.json.JSONException -> L87
            java.lang.String r11 = (java.lang.String) r11     // Catch: org.json.JSONException -> L87
            r7.add(r11)     // Catch: org.json.JSONException -> L87
            int r10 = r10 + 1
            goto L66
        L78:
            r8.f30460b = r7     // Catch: org.json.JSONException -> L87
            r4.add(r8)     // Catch: org.json.JSONException -> L87
            int r6 = r6 + 1
            goto L19
        L80:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: org.json.JSONException -> L87
            r12.<init>()     // Catch: org.json.JSONException -> L87
            return r12
        L86:
            return r4
        L87:
            r12 = move-exception
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r12 = r12.getMessage()
            java.lang.String r12 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r12)
            r0[r3] = r12
            java.lang.String r12 = "parse countrygroup failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r2, r12, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            return r12
        La0:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a.d(org.json.JSONArray):java.util.ArrayList");
    }

    public final int a(Context context, String str) {
        int b10;
        char c10;
        String str2 = GrsApp.getInstance().getBrand("/") + str;
        String a10 = p.b.a(context, str2);
        if (TextUtils.isEmpty(a10)) {
            b10 = -1;
        } else if ((!this.f25455e || (b10 = f(a10)) == 0) && (b10 = b(a10)) == 0) {
            b10 = i(a10);
        }
        if (b10 == 0) {
            Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str2);
            c10 = 0;
        } else {
            c10 = 65535;
        }
        if (c10 != 0) {
            return -1;
        }
        return 0;
    }

    public abstract int b(String str);

    public final String c(Context context, qb.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2) {
        Map e10 = e(context, grsBaseInfo, aVar, str, true);
        if (e10 == null) {
            Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
            return null;
        }
        return (String) e10.get(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x020a, code lost:
        r0.append(r2);
        r0.append(r8);
        com.huawei.hms.framework.common.Logger.i(com.huawei.hms.scankit.C0637e.f7371a, r0.toString());
        r11 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e(android.content.Context r18, com.huawei.hms.framework.network.grs.GrsBaseInfo r19, qb.a r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a.e(android.content.Context, com.huawei.hms.framework.network.grs.GrsBaseInfo, qb.a, java.lang.String, boolean):java.util.Map");
    }

    public abstract int f(String str);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(org.json.JSONArray r15) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a.g(org.json.JSONArray):void");
    }

    public final int h(String str) {
        try {
            g(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e10) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    public abstract int i(String str);
}
