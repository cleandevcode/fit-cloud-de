package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import pb.a;
import pb.c;
import pb.d;
import qb.b;
import sb.h;

/* loaded from: classes.dex */
public class GrsClient {
    private static final String EMPTY_STRING = "";
    private final c grsClientGlobal;

    public GrsClient(Context context, GrsBaseInfo grsBaseInfo) {
        c cVar;
        String str;
        boolean compare;
        if (context != null && grsBaseInfo != null) {
            synchronized (d.f24000b) {
                int uniqueCode = grsBaseInfo.uniqueCode();
                ConcurrentHashMap concurrentHashMap = d.f23999a;
                cVar = (c) concurrentHashMap.get(context.getPackageName() + uniqueCode);
                if (cVar != null) {
                    c cVar2 = new c(grsBaseInfo);
                    if (cVar == cVar2) {
                        compare = true;
                    } else {
                        compare = cVar.f23988a.compare(cVar2.f23988a);
                    }
                    if (!compare) {
                        cVar = new c(context, grsBaseInfo);
                        str = context.getPackageName() + uniqueCode;
                    }
                } else {
                    cVar = new c(context, grsBaseInfo);
                    str = context.getPackageName() + uniqueCode;
                }
                concurrentHashMap.put(str, cVar);
            }
            this.grsClientGlobal = cVar;
            return;
        }
        throw new NullPointerException("invalid init params for context is null or GrsBaseInfo instance is null Object.");
    }

    public void ayncGetGrsUrl(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        int i10;
        boolean z10;
        c cVar = this.grsClientGlobal;
        if (cVar == null) {
            iQueryUrlCallBack.onCallBackFail(-8);
        } else if (iQueryUrlCallBack == null) {
            Logger.w("c", "IQueryUrlCallBack is must not null for process continue.");
        } else {
            if (cVar.f23988a != null && str != null && str2 != null) {
                if (cVar.a()) {
                    a aVar = cVar.f23994g;
                    Context context = cVar.f23989b;
                    aVar.getClass();
                    b bVar = new b();
                    String str3 = aVar.b(str, bVar, context).get(str2);
                    if (bVar.f24676b == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Logger.i("a", "get unexpired cache localUrl");
                        if (TextUtils.isEmpty(str3)) {
                            iQueryUrlCallBack.onCallBackFail(-5);
                            return;
                        }
                        rb.b.f(context, aVar.f23969a);
                        Logger.i("a", "ayncGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
                        iQueryUrlCallBack.onCallBackSuccess(str3);
                        return;
                    }
                    aVar.f23971c.b(new ub.c(context, aVar.f23969a), new a.b(str, str2, iQueryUrlCallBack, str3, context, aVar.f23969a, aVar.f23970b), str, aVar.f23972d);
                    return;
                }
                Logger.i("c", "grs init task has not completed.");
                i10 = -7;
            } else {
                i10 = -6;
            }
            iQueryUrlCallBack.onCallBackFail(i10);
        }
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        int i10;
        boolean z10;
        c cVar = this.grsClientGlobal;
        if (cVar == null) {
            iQueryUrlsCallBack.onCallBackFail(-8);
        } else if (iQueryUrlsCallBack == null) {
            Logger.w("c", "IQueryUrlsCallBack is must not null for process continue.");
        } else {
            if (cVar.f23988a != null && str != null) {
                if (cVar.a()) {
                    a aVar = cVar.f23994g;
                    Context context = cVar.f23989b;
                    aVar.getClass();
                    b bVar = new b();
                    Map<String, String> b10 = aVar.b(str, bVar, context);
                    if (bVar.f24676b == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Logger.i("a", "get unexpired cache localUrls");
                        if (b10.isEmpty()) {
                            iQueryUrlsCallBack.onCallBackFail(-5);
                            return;
                        }
                        rb.b.f(context, aVar.f23969a);
                        Logger.i("a", "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(b10).toString()));
                        iQueryUrlsCallBack.onCallBackSuccess(b10);
                        return;
                    }
                    aVar.f23971c.b(new ub.c(context, aVar.f23969a), new a.C0434a(str, b10, iQueryUrlsCallBack, context, aVar.f23969a, aVar.f23970b), str, aVar.f23972d);
                    return;
                }
                Logger.i("c", "grs init task has not completed.");
                i10 = -7;
            } else {
                i10 = -6;
            }
            iQueryUrlsCallBack.onCallBackFail(i10);
        }
    }

    public void clearSp() {
        c cVar = this.grsClientGlobal;
        if (cVar != null && cVar.a()) {
            String grsParasKey = cVar.f23988a.getGrsParasKey(true, true, cVar.f23989b);
            cVar.f23992e.b(grsParasKey);
            qb.c cVar2 = cVar.f23992e;
            cVar2.b(grsParasKey + CrashHianalyticsData.TIME);
            qb.c cVar3 = cVar.f23992e;
            cVar3.b(grsParasKey + "ETag");
            h hVar = cVar.f23990c;
            synchronized (hVar.f26850c) {
                hVar.f26849b.remove(grsParasKey);
            }
        }
    }

    public boolean forceExpire() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        c cVar = this.grsClientGlobal;
        boolean z10 = false;
        if (cVar == null) {
            return false;
        }
        if (cVar.a() && (grsBaseInfo = cVar.f23988a) != null && (context = cVar.f23989b) != null) {
            qb.a aVar = cVar.f23991d;
            aVar.getClass();
            z10 = true;
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            qb.c cVar2 = aVar.f24672c;
            cVar2.c(grsParasKey + CrashHianalyticsData.TIME, "0");
            ConcurrentHashMap concurrentHashMap = aVar.f24671b;
            concurrentHashMap.remove(grsParasKey + CrashHianalyticsData.TIME);
            aVar.f24670a.remove(grsParasKey);
            h hVar = aVar.f24674e;
            synchronized (hVar.f26850c) {
                hVar.f26849b.remove(grsParasKey);
            }
        }
        return z10;
    }

    public String synGetGrsUrl(String str, String str2) {
        boolean z10;
        c cVar = this.grsClientGlobal;
        if (cVar == null) {
            return "";
        }
        if (cVar.f23988a != null && str != null && str2 != null) {
            if (!cVar.a()) {
                return null;
            }
            a aVar = cVar.f23994g;
            Context context = cVar.f23989b;
            aVar.getClass();
            b bVar = new b();
            String str3 = aVar.b(str, bVar, context).get(str2);
            if (bVar.f24676b == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !TextUtils.isEmpty(str3)) {
                Logger.i("a", "get unexpired cache localUrl: %s", StringUtils.anonymizeMessage(str3));
                rb.b.f(context, aVar.f23969a);
                return str3;
            }
            String str4 = (String) a.a(aVar.e(context, str), str).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                Logger.i("a", "get url is from remote server");
                rb.b.f(context, aVar.f23969a);
                return str4;
            }
            if (TextUtils.isEmpty(str3)) {
                Logger.i("a", "access local config for return a domain.");
                str3 = rb.b.c(context.getPackageName(), aVar.f23969a).a(context, aVar.f23970b, aVar.f23969a, str, str2);
            } else {
                Logger.i("a", "get expired cache localUrl");
            }
            Logger.i("a", "synGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
            return str3;
        }
        Logger.w("c", "invalid para!");
        return null;
    }

    public Map<String, String> synGetGrsUrls(String str) {
        boolean z10;
        String str2;
        c cVar = this.grsClientGlobal;
        if (cVar == null) {
            return new HashMap();
        }
        if (cVar.f23988a != null && str != null) {
            if (cVar.a()) {
                a aVar = cVar.f23994g;
                Context context = cVar.f23989b;
                aVar.getClass();
                b bVar = new b();
                Map b10 = aVar.b(str, bVar, context);
                if (bVar.f24676b == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !b10.isEmpty()) {
                    Logger.i("a", "get unexpired cache localUrls: %s", StringUtils.anonymizeMessage(new JSONObject(b10).toString()));
                    rb.b.f(context, aVar.f23969a);
                    return b10;
                }
                HashMap a10 = a.a(aVar.e(context, str), str);
                if (!a10.isEmpty()) {
                    Logger.i("a", "get url is from remote server");
                    rb.b.f(context, aVar.f23969a);
                    return a10;
                }
                if (b10.isEmpty()) {
                    Logger.i("a", "access local config for return a domain.");
                    b10 = rb.b.c(context.getPackageName(), aVar.f23969a).b(context, aVar.f23969a, aVar.f23970b, str, true);
                } else {
                    Logger.i("a", "get expired cache localUrls");
                }
                Object[] objArr = new Object[1];
                if (b10 != null) {
                    str2 = new JSONObject(b10).toString();
                } else {
                    str2 = "";
                }
                objArr[0] = StringUtils.anonymizeMessage(str2);
                Logger.i("a", "synGetGrsUrls: %s", objArr);
                return b10;
            }
            return new HashMap();
        }
        Logger.w("c", "invalid para!");
        return new HashMap();
    }
}
