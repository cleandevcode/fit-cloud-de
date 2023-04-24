package sb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.sina.weibo.BuildConfig;
import h8.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vb.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final GrsBaseInfo f26818a;

    /* renamed from: b */
    public final Context f26819b;

    /* renamed from: c */
    public final qb.a f26820c;

    /* renamed from: d */
    public d f26821d;

    /* renamed from: j */
    public final ub.c f26827j;

    /* renamed from: k */
    public ub.d f26828k;

    /* renamed from: l */
    public String f26829l;

    /* renamed from: e */
    public final ConcurrentHashMap f26822e = new ConcurrentHashMap(16);

    /* renamed from: f */
    public final CopyOnWriteArrayList f26823f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final JSONArray f26824g = new JSONArray();

    /* renamed from: h */
    public final CopyOnWriteArrayList f26825h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public final CopyOnWriteArrayList f26826i = new CopyOnWriteArrayList();

    /* renamed from: m */
    public long f26830m = 1;

    public c(ub.c cVar, qb.a aVar) {
        ub.d dVar;
        String c10;
        this.f26829l = "";
        this.f26827j = cVar;
        this.f26818a = cVar.f28648a;
        Context context = cVar.f28649b;
        this.f26819b = context;
        this.f26820c = aVar;
        synchronized (tb.a.class) {
            ub.d dVar2 = tb.a.f27957a;
            if (dVar2 == null) {
                String a10 = p.b.a(context, GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json");
                ArrayList arrayList = null;
                dVar = null;
                arrayList = null;
                if (!TextUtils.isEmpty(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject(a10).getJSONObject("grs_server");
                        JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                        if (jSONArray != null && jSONArray.length() > 0) {
                            arrayList = new ArrayList();
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                arrayList.add(jSONArray.get(i10).toString());
                            }
                        }
                        ub.d dVar3 = new ub.d();
                        tb.a.f27957a = dVar3;
                        dVar3.f28651a = arrayList;
                        tb.a.f27957a.f28652b = jSONObject.getString("grs_query_endpoint_1.0");
                        tb.a.f27957a.f28653c = jSONObject.getString("grs_query_endpoint_2.0");
                        tb.a.f27957a.f28654d = jSONObject.getInt("grs_query_timeout");
                    } catch (JSONException e10) {
                        Logger.w("a", "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
                    }
                    dVar2 = tb.a.f27957a;
                }
            }
            dVar = dVar2;
        }
        if (dVar == null) {
            Logger.w("c", "g*s***_se****er_conf*** maybe has a big error");
        } else {
            this.f26828k = dVar;
            List<String> list = dVar.f28651a;
            if (list != null && list.size() > 0) {
                if (list.size() <= 10) {
                    String str = dVar.f28652b;
                    String str2 = dVar.f28653c;
                    if (list.size() > 0) {
                        for (String str3 : list) {
                            if (!str3.startsWith("https://")) {
                                Logger.w("c", "grs server just support https scheme url,please check.");
                            } else {
                                if (!TextUtils.isEmpty(this.f26818a.getAppName()) || !TextUtils.isEmpty(c())) {
                                    StringBuilder a11 = android.support.v4.media.d.a(str3);
                                    Locale locale = Locale.ROOT;
                                    Object[] objArr = new Object[1];
                                    if (TextUtils.isEmpty(c())) {
                                        c10 = this.f26818a.getAppName();
                                    } else {
                                        c10 = c();
                                    }
                                    objArr[0] = c10;
                                    a11.append(String.format(locale, str, objArr));
                                    String grsReqParamJoint = this.f26818a.getGrsReqParamJoint(false, false, BuildConfig.VERSION_NAME, this.f26819b);
                                    if (!TextUtils.isEmpty(grsReqParamJoint)) {
                                        a11.append("?");
                                        a11.append(grsReqParamJoint);
                                    }
                                    this.f26825h.add(a11.toString());
                                }
                                StringBuilder a12 = p.a.a(str3, str2);
                                String grsReqParamJoint2 = this.f26818a.getGrsReqParamJoint(false, false, c(), this.f26819b);
                                if (!TextUtils.isEmpty(grsReqParamJoint2)) {
                                    a12.append("?");
                                    a12.append(grsReqParamJoint2);
                                }
                                this.f26826i.add(a12.toString());
                            }
                        }
                    }
                    Logger.v("c", "request to GRS server url is{%s} and {%s}", this.f26825h, this.f26826i);
                } else {
                    throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
                }
            } else {
                Logger.v("c", "maybe grs_base_url config with [],please check.");
            }
        }
        String grsParasKey = this.f26818a.getGrsParasKey(true, true, this.f26819b);
        qb.c cVar2 = this.f26820c.f24672c;
        this.f26829l = cVar2.a(grsParasKey + "ETag", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00d8 A[LOOP:0: B:92:0x0006->B:132:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sb.d a(java.util.concurrent.ExecutorService r20, java.util.concurrent.CopyOnWriteArrayList r21, java.lang.String r22, qb.c r23) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.c.a(java.util.concurrent.ExecutorService, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, qb.c):sb.d");
    }

    public final synchronized void b(d dVar) {
        boolean z10;
        this.f26823f.add(dVar);
        d dVar2 = this.f26821d;
        if (dVar2 != null && (dVar2.d() || this.f26821d.c())) {
            Logger.v("c", "grsResponseResult is ok");
            return;
        }
        if (dVar.f26833c == 503) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Logger.i("c", "GRS server open 503 limiting strategy.");
            vb.b.b(this.f26818a.getGrsParasKey(true, true, this.f26819b), new b.a(dVar.f26841k, SystemClock.elapsedRealtime()));
            return;
        }
        if (dVar.c()) {
            Logger.i("c", "GRS server open 304 Not Modified.");
        }
        if (!dVar.d() && !dVar.c()) {
            Logger.v("c", "grsResponseResult has exception so need return");
            return;
        }
        this.f26821d = dVar;
        this.f26820c.a(this.f26818a, dVar, this.f26819b, this.f26827j);
        for (Map.Entry entry : this.f26822e.entrySet()) {
            if (!((String) entry.getKey()).equals(dVar.f26844n) && !((Future) entry.getValue()).isCancelled()) {
                Logger.i("c", "future cancel");
                ((Future) entry.getValue()).cancel(true);
            }
        }
    }

    public final String c() {
        r rVar;
        rb.b c10 = rb.b.c(this.f26819b.getPackageName(), this.f26818a);
        if (c10 != null) {
            rVar = c10.f25460a.f25451a;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            String b10 = rVar.b();
            Logger.v("c", "get appName from local assets is{%s}", b10);
            return b10;
        }
        return "";
    }
}
