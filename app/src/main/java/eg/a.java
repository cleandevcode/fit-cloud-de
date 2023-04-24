package eg;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import gm.j;
import gm.l;
import nj.c;
import qa.p;

/* loaded from: classes2.dex */
public enum a {
    f13611c("PATCH", "P"),
    f13612d("FLASH", "F"),
    f13613e(GrsBaseInfo.CountryCodeSource.APP, "A");
    

    /* renamed from: a */
    public final String f13615a;

    /* renamed from: b */
    public final int f13616b;

    a(String str, String str2) {
        this.f13615a = str2;
        this.f13616b = r2;
    }

    public final String a(String str) {
        l.f(str, "hardwareInfo");
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return j.j(str);
                }
                throw new p();
            } else if (str.length() >= 76) {
                String substring = str.substring(40, 48);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            } else {
                return "";
            }
        }
        return j.l(str);
    }

    public final String c(c cVar) {
        l.f(cVar, "deviceInfo");
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return cVar.b(24, 4);
                }
                throw new p();
            }
            return cVar.b(20, 4);
        }
        return cVar.b(14, 6);
    }
}
