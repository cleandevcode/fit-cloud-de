package com.huawei.hms.framework.common.grs;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.StringUtils;
import java.util.Locale;
import p.a;

/* loaded from: classes.dex */
public class GrsUtils {
    public static String fixResult(String[] strArr, String str) {
        StringBuilder a10;
        String str2;
        if (strArr.length > 2) {
            if (str.endsWith("/")) {
                a10 = d.a(str);
                str2 = strArr[2];
            } else {
                a10 = a.a(str, "/");
                str2 = strArr[2];
            }
            a10.append(str2);
            return a10.toString();
        }
        return str;
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith("grs://");
    }

    public static String[] parseGRSSchema(String str) {
        String[] split = StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf("grs://") + 6).split("/", 3);
        return split.length == 1 ? new String[]{split[0], "ROOT"} : split;
    }

    public static String[] parseParams(String str) {
        if (str.endsWith("/")) {
            str = StringUtils.substring(str, str.indexOf("grs://"), str.length() - 1);
        }
        return parseGRSSchema(str);
    }
}
