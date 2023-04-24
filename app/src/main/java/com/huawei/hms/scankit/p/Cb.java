package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Cb extends Fb {

    /* renamed from: g */
    private static final Pattern f7484g = Pattern.compile("geo:([\\s\\-0-9.]+),([\\s\\-0-9.]+)(?:[,?].*)?", 2);

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String a10 = Fb.a(xVar);
        Matcher matcher = f7484g.matcher(a10);
        if (matcher.matches()) {
            try {
                return new HmsScan(xVar.i(), Fb.a(xVar.b()), a10, HmsScan.LOCATION_COORDINATE_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.LocationCoordinate(Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)))));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }
}
