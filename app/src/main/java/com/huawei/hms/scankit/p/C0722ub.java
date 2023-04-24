package com.huawei.hms.scankit.p;

import android.text.TextUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.scankit.p.ub */
/* loaded from: classes.dex */
public final class C0722ub extends Fb {

    /* renamed from: g */
    private static final Pattern f8086g = Pattern.compile("(?:BIZCARD:)([\\s\\S]+)", 2);

    private static HmsScan.PeopleName a(String str, String str2, String str3) {
        HmsScan.PeopleName peopleName = new HmsScan.PeopleName("", "", "", "", "", "", "");
        peopleName.givenName = str;
        peopleName.familyName = str2;
        peopleName.fullName = str3;
        return peopleName;
    }

    private static String a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.startsWith(str)) {
                return Fb.b(str2.substring(str.length()));
            }
        }
        return "";
    }

    private static HmsScan.TelPhoneNumber[] b(String str, String str2, String str3) {
        HmsScan.TelPhoneNumber[] telPhoneNumberArr = new HmsScan.TelPhoneNumber[0];
        ArrayList arrayList = new ArrayList(3);
        if (str != null && !str.isEmpty()) {
            arrayList.add(new HmsScan.TelPhoneNumber(HmsScan.TelPhoneNumber.OFFICE_USE_TYPE, str));
        }
        if (str2 != null && !str2.isEmpty()) {
            arrayList.add(new HmsScan.TelPhoneNumber(HmsScan.TelPhoneNumber.FAX_USE_TYPE, str2));
        }
        if (str3 != null && !str3.isEmpty()) {
            arrayList.add(new HmsScan.TelPhoneNumber(HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE, str3));
        }
        return (HmsScan.TelPhoneNumber[]) arrayList.toArray(telPhoneNumberArr);
    }

    private static HmsScan.AddressInfo[] c(String str) {
        return (str == null || str.isEmpty()) ? new HmsScan.AddressInfo[0] : new HmsScan.AddressInfo[]{new HmsScan.AddressInfo(new String[]{str}, HmsScan.AddressInfo.OTHER_USE_TYPE)};
    }

    private static HmsScan.EmailContent[] d(String str) {
        return (str == null || str.isEmpty()) ? new HmsScan.EmailContent[0] : new HmsScan.EmailContent[]{new HmsScan.EmailContent(str, "", "", HmsScan.EmailContent.OTHER_USE_TYPE)};
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String a10 = Fb.a(xVar);
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        Matcher matcher = f8086g.matcher(a10);
        if (matcher.matches()) {
            String[] split = matcher.group(1).split("(?<=(?<!\\\\)(?:\\\\\\\\){0,100});");
            String a11 = a(split, "N:");
            String a12 = a(split, "X:");
            String trim = (a11 + " " + a12).trim();
            String a13 = a(split, "T:");
            String a14 = a(split, "C:");
            String a15 = a(split, "A:");
            String a16 = a(split, "B:");
            String a17 = a(split, "M:");
            return new HmsScan(xVar.i(), Fb.a(xVar.b()), trim, HmsScan.CONTACT_DETAIL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.ContactDetail(a(a11, a12, trim), a13, a14, b(a16, a(split, "F:"), a17), d(a(split, "E:")), c(a15), new String[0], null)));
        }
        return null;
    }
}
