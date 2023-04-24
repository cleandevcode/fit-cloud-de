package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Db extends Fb {

    /* renamed from: g */
    private static final Pattern f7496g = Pattern.compile("market://[\\s\\S]*", 2);

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String a10 = Fb.a(xVar);
        if (!TextUtils.isEmpty(a10) && f7496g.matcher(a10).matches()) {
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), a10, HmsScan.URL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.LinkUrl("", "")));
        }
        return null;
    }
}
