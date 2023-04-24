package pb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sb.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final GrsBaseInfo f23969a;

    /* renamed from: b */
    public qb.a f23970b;

    /* renamed from: c */
    public h f23971c;

    /* renamed from: d */
    public qb.c f23972d;

    /* renamed from: pb.a$a */
    /* loaded from: classes.dex */
    public static class C0434a implements pb.b {

        /* renamed from: a */
        public String f23973a;

        /* renamed from: b */
        public Map<String, String> f23974b;

        /* renamed from: c */
        public IQueryUrlsCallBack f23975c;

        /* renamed from: d */
        public Context f23976d;

        /* renamed from: e */
        public GrsBaseInfo f23977e;

        /* renamed from: f */
        public qb.a f23978f;

        public C0434a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, qb.a aVar) {
            this.f23973a = str;
            this.f23974b = map;
            this.f23975c = iQueryUrlsCallBack;
            this.f23976d = context;
            this.f23977e = grsBaseInfo;
            this.f23978f = aVar;
        }

        @Override // pb.b
        public final void a() {
            Map<String, String> map = this.f23974b;
            if (map != null && !map.isEmpty()) {
                Logger.i("a", "get expired cache localUrls");
                this.f23975c.onCallBackSuccess(this.f23974b);
            } else if (this.f23974b != null) {
                this.f23975c.onCallBackFail(-3);
            } else {
                Logger.i("a", "access local config for return a domain.");
                this.f23975c.onCallBackSuccess(rb.b.c(this.f23976d.getPackageName(), this.f23977e).b(this.f23976d, this.f23977e, this.f23978f, this.f23973a, true));
            }
        }

        @Override // pb.b
        public final void a(sb.d dVar) {
            HashMap hashMap;
            HashMap a10 = a.a(dVar.f26837g, this.f23973a);
            if (a10.isEmpty()) {
                Map<String, String> map = this.f23974b;
                if (map != null && !map.isEmpty()) {
                    Logger.i("a", "get expired cache localUrls");
                    this.f23975c.onCallBackSuccess(this.f23974b);
                    return;
                } else if (this.f23974b != null) {
                    this.f23975c.onCallBackFail(-5);
                    return;
                } else {
                    Logger.i("a", "access local config for return a domain.");
                    hashMap = rb.b.c(this.f23976d.getPackageName(), this.f23977e).b(this.f23976d, this.f23977e, this.f23978f, this.f23973a, true);
                }
            } else {
                Logger.i("a", "get url is from remote server");
                hashMap = a10;
            }
            this.f23975c.onCallBackSuccess(hashMap);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements pb.b {

        /* renamed from: a */
        public String f23979a;

        /* renamed from: b */
        public String f23980b;

        /* renamed from: c */
        public IQueryUrlCallBack f23981c;

        /* renamed from: d */
        public String f23982d;

        /* renamed from: e */
        public Context f23983e;

        /* renamed from: f */
        public GrsBaseInfo f23984f;

        /* renamed from: g */
        public qb.a f23985g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, qb.a aVar) {
            this.f23979a = str;
            this.f23980b = str2;
            this.f23981c = iQueryUrlCallBack;
            this.f23982d = str3;
            this.f23983e = context;
            this.f23984f = grsBaseInfo;
            this.f23985g = aVar;
        }

        @Override // pb.b
        public final void a() {
            if (!TextUtils.isEmpty(this.f23982d)) {
                Logger.i("a", "get expired cache localUrl");
                this.f23981c.onCallBackSuccess(this.f23982d);
            } else if (!TextUtils.isEmpty(this.f23982d)) {
                this.f23981c.onCallBackFail(-3);
            } else {
                Logger.i("a", "access local config for return a domain.");
                this.f23981c.onCallBackSuccess(rb.b.c(this.f23983e.getPackageName(), this.f23984f).a(this.f23983e, this.f23985g, this.f23984f, this.f23979a, this.f23980b));
            }
        }

        @Override // pb.b
        public final void a(sb.d dVar) {
            String a10;
            IQueryUrlCallBack iQueryUrlCallBack;
            HashMap a11 = a.a(dVar.f26837g, this.f23979a);
            if (a11.containsKey(this.f23980b)) {
                Logger.i("a", "get url is from remote server");
                iQueryUrlCallBack = this.f23981c;
                a10 = (String) a11.get(this.f23980b);
            } else if (!TextUtils.isEmpty(this.f23982d)) {
                Logger.i("a", "get expired cache localUrl");
                this.f23981c.onCallBackSuccess(this.f23982d);
                return;
            } else if (!TextUtils.isEmpty(this.f23982d)) {
                this.f23981c.onCallBackFail(-5);
                return;
            } else {
                Logger.i("a", "access local config for return a domain.");
                a10 = rb.b.c(this.f23983e.getPackageName(), this.f23984f).a(this.f23983e, this.f23985g, this.f23984f, this.f23979a, this.f23980b);
                iQueryUrlCallBack = this.f23981c;
            }
            iQueryUrlCallBack.onCallBackSuccess(a10);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, qb.a aVar, h hVar, qb.c cVar) {
        this.f23969a = grsBaseInfo;
        this.f23970b = aVar;
        this.f23971c = hVar;
        this.f23972d = cVar;
    }

    public static HashMap a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w("a", "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w("a", "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e10) {
            Logger.w("a", "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return hashMap;
        }
    }

    public static ConcurrentHashMap c(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v("a", "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, d(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w("a", "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    public static ConcurrentHashMap d(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w("a", "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    public final Map<String, String> b(String str, qb.b bVar, Context context) {
        Map<String, String> hashMap;
        qb.a aVar = this.f23970b;
        GrsBaseInfo grsBaseInfo = this.f23969a;
        aVar.getClass();
        Map map = (Map) aVar.f24670a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (map != null && !map.isEmpty()) {
            Long l10 = (Long) aVar.f24671b.get(grsBaseInfo.getGrsParasKey(true, true, context));
            if (o8.b.c(l10)) {
                bVar.f24676b = 2;
            } else {
                if (o8.b.e(l10)) {
                    aVar.f24674e.b(new ub.c(context, grsBaseInfo), null, str, aVar.f24673d);
                }
                bVar.f24676b = 1;
            }
            hashMap = (Map) map.get(str);
        } else {
            hashMap = new HashMap<>();
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            rb.b.f(context, this.f23969a);
            return hashMap;
        }
        Map<String, String> b10 = rb.b.c(context.getPackageName(), this.f23969a).b(context, this.f23969a, this.f23970b, str, false);
        if (b10 == null) {
            return new HashMap();
        }
        return b10;
    }

    public final String e(Context context, String str) {
        sb.d a10 = this.f23971c.a(new ub.c(context, this.f23969a), str, this.f23972d);
        if (a10 == null) {
            return "";
        }
        if (a10.c()) {
            return this.f23970b.f24672c.a(this.f23969a.getGrsParasKey(true, true, context), "");
        }
        return a10.f26837g;
    }
}
