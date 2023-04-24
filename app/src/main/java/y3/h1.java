package y3;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes.dex */
public final class h1 extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(String str) {
        super(str);
        gm.l.f(str, CrashHianalyticsData.MESSAGE);
    }
}
