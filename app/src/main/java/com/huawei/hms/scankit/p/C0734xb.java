package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.List;

/* renamed from: com.huawei.hms.scankit.p.xb */
/* loaded from: classes.dex */
public class C0734xb extends Fb {

    /* renamed from: g */
    private static final List<String> f8109g = new C0730wb();

    /* renamed from: h */
    private String f8110h = "";

    public HmsScan.DriverInfo a(String[] strArr, String str) {
        String[] strArr2 = {"", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        strArr2[0] = str;
        boolean z10 = false;
        for (String str2 : strArr) {
            if (str2.length() <= 3) {
                return null;
            }
            int indexOf = f8109g.indexOf(str2.substring(0, 3));
            if (indexOf != -1) {
                strArr2[indexOf] = str2.substring(3).trim();
                z10 = true;
            }
        }
        if (z10) {
            this.f8110h = strArr2[0] + " " + strArr2[3] + " " + strArr2[1];
            return new HmsScan.DriverInfo(strArr2[0], strArr2[1], strArr2[2], strArr2[3], strArr2[4], strArr2[5], strArr2[6], strArr2[7], strArr2[8], strArr2[9], strArr2[10], strArr2[11], strArr2[12], strArr2[13], null, null, null, null);
        }
        return null;
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String a10 = Fb.a(xVar);
        if (!TextUtils.isEmpty(a10) && a10.startsWith("@") && a10.length() > 34 && a10.substring(4, 8).equals("ANSI")) {
            String valueOf = String.valueOf(a10.charAt(1));
            String valueOf2 = String.valueOf(a10.charAt(3));
            String substring = a10.substring(21, 23);
            HmsScan.DriverInfo a11 = a(a10.substring(a10.indexOf(substring, 23) + 2).split(valueOf2)[0].split(valueOf), substring);
            if (a11 != null) {
                return new HmsScan(xVar.i(), Fb.a(xVar.b()), this.f8110h, HmsScan.DRIVER_INFO_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(a11));
            }
        }
        return null;
    }
}
