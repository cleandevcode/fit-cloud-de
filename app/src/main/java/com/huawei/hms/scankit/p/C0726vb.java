package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.scankit.p.vb */
/* loaded from: classes.dex */
public final class C0726vb extends Fb {

    /* renamed from: g */
    private static final Pattern f8090g = Pattern.compile("(?:MEBKM:)([\\s\\S]+)", 2);

    /* renamed from: h */
    private static final Pattern f8091h = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    private static String a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return Fb.b(str2.substring(str.length()));
            }
        }
        return "";
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        Matcher matcher;
        String a10 = Fb.a(xVar);
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        Matcher matcher2 = f8090g.matcher(a10);
        if (matcher2.matches()) {
            String[] split = matcher2.group(1).split("(?<=(?<!\\\\)(?:\\\\\\\\){0,100});");
            String a11 = a(split, "TITLE:");
            String a12 = Fb.a(a(split, "URL:"));
            if (a12.length() == 0) {
                return null;
            }
            if (f8091h.matcher(a12).matches()) {
                a12 = a12.substring(0, 4) + "://" + matcher.group(1);
            }
            String str = a12;
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), str, HmsScan.URL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.LinkUrl(a11, str)));
        }
        return null;
    }
}
