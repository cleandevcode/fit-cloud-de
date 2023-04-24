package ig;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import om.l;

/* loaded from: classes2.dex */
public final class c extends IOException {

    /* renamed from: a */
    public final int f16819a;

    /* renamed from: b */
    public final String f16820b;

    public c(int i10, String str) {
        this.f16819a = i10;
        this.f16820b = str;
    }

    public final boolean a() {
        String str;
        if (this.f16819a == -1 && (str = this.f16820b) != null && l.c0(str, CrashHianalyticsData.TIME, true) && l.c0(this.f16820b, "not", false) && l.c0(this.f16820b, "validate", false)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder a10 = android.support.v4.media.d.a("errorCode=");
        a10.append(this.f16819a);
        a10.append(",errorMsg=");
        a10.append(this.f16820b);
        return a10.toString();
    }
}
