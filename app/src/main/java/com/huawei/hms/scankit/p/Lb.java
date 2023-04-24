package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Lb extends Fb {

    /* renamed from: g */
    private static final Pattern f7604g = Pattern.compile("WIFI:[^:]", 2);

    private static int c(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equalsIgnoreCase("WEP")) {
            return 2;
        }
        if ((str.equalsIgnoreCase("WPA") | str.equalsIgnoreCase("WPA2") | str.equalsIgnoreCase("WPA/WPA2")) || str.equalsIgnoreCase("WPA2/WPA")) {
            return 1;
        }
        return str.equalsIgnoreCase("SAE") ? 3 : 0;
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String str;
        String a10 = Fb.a(xVar);
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        Matcher matcher = f7604g.matcher(a10);
        if (matcher.find() && matcher.start() == 0) {
            String substring = a10.substring(5);
            if (!substring.endsWith(";")) {
                substring = a.b.b(substring, ";");
            }
            String b10 = Fb.b("S:", substring, ';', false);
            if (b10 != null && !b10.isEmpty()) {
                String b11 = Fb.b("P:", substring, ';', false);
                String b12 = Fb.b("T:", substring, ';', false);
                StringBuilder a11 = android.support.v4.media.d.a(b10);
                if (b11 != null && !b11.isEmpty()) {
                    str = a.b.b(" ", b11);
                } else {
                    str = "";
                }
                a11.append(str);
                return new HmsScan(xVar.i(), Fb.a(xVar.b()), a11.toString(), HmsScan.WIFI_CONNECT_INFO_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.WiFiConnectionInfo(b10, b11, c(b12))));
            }
        }
        return null;
    }
}
