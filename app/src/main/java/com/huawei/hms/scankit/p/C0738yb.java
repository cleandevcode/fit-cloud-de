package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.scankit.p.yb */
/* loaded from: classes.dex */
public final class C0738yb extends Fb {

    /* renamed from: g */
    private static final Pattern f8116g = Pattern.compile("(?:MATMSG:TO:|mailto:|SMTP:)([\\s\\S]+)", 2);

    /* renamed from: h */
    private static final Pattern f8117h = Pattern.compile("mailto:([\\s\\S]+)\\?subject=([\\s\\S]+)&body=([\\s\\S]+)", 2);

    /* renamed from: i */
    private static final Pattern f8118i = Pattern.compile("MATMSG:TO:([\\s\\S]+);SUB:([\\s\\S]+);BODY:([\\s\\S]+)", 2);

    /* renamed from: j */
    private static final Pattern f8119j = Pattern.compile("SMTP:([\\s\\S]+):([\\s\\S]+):([\\s\\S]+)", 2);

    public static String c(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        String group;
        String str;
        String group2;
        String a10 = Fb.a(xVar);
        if (!TextUtils.isEmpty(a10) && f8116g.matcher(a10).matches()) {
            try {
                matcher = f8117h.matcher(a10);
                matcher2 = f8118i.matcher(a10);
                matcher3 = f8119j.matcher(a10);
            } catch (RuntimeException | Exception unused) {
            }
            if (matcher.matches()) {
                String group3 = matcher.group(1);
                group = matcher.group(2);
                group2 = matcher.group(3);
                str = group3;
            } else if (!matcher2.matches()) {
                if (matcher3.matches()) {
                    String group4 = matcher3.group(1);
                    group = matcher3.group(2);
                    str = group4;
                    group2 = matcher3.group(3);
                }
                return null;
            } else {
                String group5 = matcher2.group(1);
                String group6 = matcher2.group(2);
                String group7 = matcher2.group(3);
                str = group5;
                group = group6;
                group2 = group7;
            }
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), str, HmsScan.EMAIL_CONTENT_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.EmailContent(str, c(group), c(group2), HmsScan.EmailContent.OTHER_USE_TYPE)));
        }
        return null;
    }
}
