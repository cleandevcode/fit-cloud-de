package qb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.ConcurrentHashMap;
import sb.d;
import sb.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final ConcurrentHashMap f24670a = new ConcurrentHashMap(16);

    /* renamed from: b */
    public final ConcurrentHashMap f24671b = new ConcurrentHashMap(16);

    /* renamed from: c */
    public final c f24672c;

    /* renamed from: d */
    public final c f24673d;

    /* renamed from: e */
    public final h f24674e;

    public a(c cVar, c cVar2, h hVar) {
        this.f24673d = cVar2;
        this.f24672c = cVar;
        this.f24674e = hVar;
        hVar.f26851d = this;
    }

    public final void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, ub.c cVar) {
        if (dVar.f26838h == 2) {
            Logger.w("a", "update cache from server failed");
        } else if (cVar.f28650c.size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.c()) {
                this.f24670a.put(grsParasKey, pb.a.c(this.f24672c.a(grsParasKey, "")));
            } else {
                this.f24672c.c(grsParasKey, dVar.f26837g);
                this.f24670a.put(grsParasKey, pb.a.c(dVar.f26837g));
            }
            if (!TextUtils.isEmpty(dVar.f26842l)) {
                this.f24672c.c(a.b.b(grsParasKey, "ETag"), dVar.f26842l);
            }
            this.f24672c.c(a.b.b(grsParasKey, CrashHianalyticsData.TIME), dVar.f26840j);
            this.f24671b.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.f26840j)));
        } else {
            this.f24672c.c("geoipCountryCode", dVar.f26837g);
            this.f24672c.c("geoipCountryCodetime", dVar.f26840j);
        }
    }
}
