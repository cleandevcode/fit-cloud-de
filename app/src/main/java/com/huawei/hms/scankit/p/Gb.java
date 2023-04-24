package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Gb extends Fb {

    /* renamed from: g */
    private static final Pattern f7527g = Pattern.compile("(?:mmsto|smsto):([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String str;
        String str2;
        String a10;
        String a11 = Fb.a(xVar);
        if (TextUtils.isEmpty(a11) || !f7527g.matcher(a11).matches()) {
            return null;
        }
        String substring = a11.substring(6);
        int indexOf = substring.indexOf(58);
        if (indexOf >= 0) {
            str = substring.substring(0, indexOf);
            str2 = substring.substring(indexOf + 1);
        } else {
            str = substring;
            str2 = "";
        }
        if (str2.isEmpty()) {
            a10 = str;
        } else {
            a10 = android.support.v4.media.a.a(str, "\n", str2);
        }
        return new HmsScan(xVar.i(), Fb.a(xVar.b()), a10, HmsScan.SMS_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.SmsContent(str2, str)));
    }
}
