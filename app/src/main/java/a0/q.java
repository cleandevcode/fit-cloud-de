package a0;

import android.os.Looper;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public static long a() {
        return Looper.getMainLooper().getThread().getId();
    }

    public static String b(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static /* synthetic */ String c(int i10) {
        return i10 == 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : i10 == 2 ? "NONE" : i10 == 3 ? "READY" : i10 == 4 ? "FIRED" : "null";
    }
}
