package qc;

import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e implements wk.f {
    public static LinkedHashMap a(sb.d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception exc = dVar.f26843m;
        if (exc != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(exc));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, exc.getClass().getSimpleName());
            linkedHashMapPack.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(exc.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.f26833c);
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.f26839i);
        }
        try {
            linkedHashMapPack.put("domain", new URL(dVar.f26844n).getHost());
        } catch (MalformedURLException e10) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e10);
        }
        linkedHashMapPack.put("req_start_time", dVar.f26835e);
        linkedHashMapPack.put("req_end_time", dVar.f26836f);
        linkedHashMapPack.put("req_total_time", dVar.f26834d);
        return linkedHashMapPack.getAll();
    }

    @Override // wk.f
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }
}
