package sb;

import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f26845a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f26846b;

    /* renamed from: c */
    public final /* synthetic */ JSONArray f26847c;

    public e(long j10, ArrayList arrayList, JSONArray jSONArray) {
        this.f26845a = j10;
        this.f26846b = arrayList;
        this.f26847c = jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            ub.a r0 = new ub.a
            r0.<init>()
            long r1 = r6.f26845a
            java.lang.String r3 = "total_time"
            r0.put(r3, r1)
            java.util.ArrayList r1 = r6.f26846b
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            sb.d r2 = (sb.d) r2
            boolean r5 = r2.d()
            if (r5 != 0) goto L2c
            boolean r5 = r2.c()
            if (r5 == 0) goto L12
        L2c:
            java.util.LinkedHashMap r2 = qc.e.a(r2)
            r0.put(r2)
            r1.remove()
            r1 = 1
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 != 0) goto L5c
            java.util.ArrayList r1 = r6.f26846b
            int r1 = r1.size()
            if (r1 <= 0) goto L5c
            java.util.ArrayList r1 = r6.f26846b
            int r2 = r1.size()
            int r2 = r2 - r4
            java.lang.Object r1 = r1.get(r2)
            sb.d r1 = (sb.d) r1
            java.util.LinkedHashMap r2 = qc.e.a(r1)
            r0.put(r2)
            java.util.ArrayList r2 = r6.f26846b
            r2.remove(r1)
        L5c:
            java.util.ArrayList r1 = r6.f26846b
            int r1 = r1.size()
            if (r1 <= 0) goto L85
            java.util.ArrayList r1 = r6.f26846b
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r1.next()
            sb.d r2 = (sb.d) r2
            org.json.JSONObject r5 = new org.json.JSONObject
            java.util.LinkedHashMap r2 = qc.e.a(r2)
            r5.<init>(r2)
            org.json.JSONArray r2 = r6.f26847c
            r2.put(r5)
            goto L6a
        L85:
            org.json.JSONArray r1 = r6.f26847c
            int r1 = r1.length()
            if (r1 <= 0) goto L98
            org.json.JSONArray r1 = r6.f26847c
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "failed_info"
            r0.put(r2, r1)
        L98:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            org.json.JSONObject r2 = new org.json.JSONObject
            java.util.LinkedHashMap r4 = r0.get()
            r2.<init>(r4)
            r1[r3] = r2
            java.lang.String r2 = "HaReportHelper"
            java.lang.String r3 = "grssdk report data to aiops is: %s"
            com.huawei.hms.framework.common.Logger.d(r2, r3, r1)
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
            java.util.LinkedHashMap r0 = r0.get()
            java.lang.String r2 = "grs_request"
            r1.onEvent(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.e.run():void");
    }
}
