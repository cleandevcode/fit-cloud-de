package lc;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public final class f extends g {
    @Deprecated
    public f() {
        this("", -1);
    }

    public f(String str, int i10) {
        super(a(i10, str));
    }

    public f(String str, Throwable th2) {
        super(a(-1, str), th2);
    }

    public static String a(int i10, String str) {
        String str2 = vc.a.f29194a.get(Integer.valueOf(i10));
        if (str2 == null) {
            str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        StringBuilder a10 = android.support.v4.media.d.a("Disconnected from ");
        a10.append(pc.b.c(str));
        a10.append(" with status ");
        a10.append(i10);
        a10.append(" (");
        a10.append(str2);
        a10.append(")");
        return a10.toString();
    }
}
