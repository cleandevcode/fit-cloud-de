package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Ib extends Fb {

    /* renamed from: g */
    private static final Pattern f7535g = Pattern.compile("(?:uri|url):([\\s\\S]*)", 2);

    /* renamed from: h */
    private static final Pattern f7536h = Pattern.compile("(?:http:/?(?!/)|http//)([\\s\\S]+)", 2);

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        Matcher matcher;
        String a10 = Fb.a(xVar);
        if (!TextUtils.isEmpty(a10) && f7535g.matcher(a10).matches()) {
            String substring = a10.substring(4);
            if (f7536h.matcher(substring).matches()) {
                substring = substring.substring(0, 4) + "://" + matcher.group(1);
            }
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), Fb.a(substring), HmsScan.URL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.LinkUrl("", "")));
        }
        return null;
    }
}
