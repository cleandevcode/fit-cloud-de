package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Ab extends Fb {

    /* renamed from: g */
    private static final Pattern f7462g = Pattern.compile("(?:http:|http//|https://)([\\s\\S]+)", 2);

    /* renamed from: h */
    private static final Pattern f7463h = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        Matcher matcher;
        String a10 = Fb.a(xVar);
        if (f7462g.matcher(a10).matches()) {
            if (f7463h.matcher(a10).matches()) {
                a10 = a10.substring(0, 4) + "://" + matcher.group(1);
            }
            String a11 = Fb.a(a10);
            if (a11.length() == 7) {
                return null;
            }
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), a11, HmsScan.URL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.LinkUrl("", a11)));
        }
        return null;
    }
}
