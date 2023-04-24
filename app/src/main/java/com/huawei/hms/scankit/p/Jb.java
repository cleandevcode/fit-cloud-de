package com.huawei.hms.scankit.p;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.ml.scan.HmsScan;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Jb extends Fb {

    /* renamed from: g */
    private static final Pattern f7540g = Pattern.compile("\r?\n[ \t]");

    /* renamed from: h */
    private static final Pattern f7541h = Pattern.compile(ContainerUtils.KEY_VALUE_DELIMITER);

    /* renamed from: i */
    private static final Pattern f7542i = Pattern.compile(";");

    /* renamed from: j */
    private static final Pattern f7543j = Pattern.compile("(?<!\\\\);+");

    private static HmsScan.PeopleName a(String str, String str2) {
        HmsScan.PeopleName peopleName = new HmsScan.PeopleName("", "", "", "", "", "", "");
        if (str != null) {
            String[] split = str.split(";");
            if (split.length > 0) {
                peopleName.familyName = split[0];
            }
            if (split.length > 1) {
                peopleName.givenName = split[1];
            }
            if (split.length > 2) {
                peopleName.middleName = split[2];
            }
            if (split.length > 3) {
                peopleName.namePrefix = split[3];
            }
            if (split.length > 4) {
                peopleName.nameSuffix = split[4];
            }
        }
        if (str2 != null) {
            peopleName.fullName = str2;
        }
        return peopleName;
    }

    private static String a(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    a(byteArrayOutputStream, str, sb2);
                    sb2.append(charAt2);
                } else if (i10 < length - 2 && (charAt = charSequence.charAt(i10 + 1)) != '\r' && charAt != '\n') {
                    i10 += 2;
                    char charAt3 = charSequence.charAt(i10);
                    int a10 = Fb.a(charAt);
                    int a11 = Fb.a(charAt3);
                    if (a10 >= 0 && a11 >= 0) {
                        byteArrayOutputStream.write((a10 << 4) + a11);
                    }
                }
            }
            i10++;
        }
        a(byteArrayOutputStream, str, sb2);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00d3, code lost:
        r4 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.util.List<java.lang.String>> a(java.lang.CharSequence r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Jb.a(java.lang.CharSequence, java.lang.String, boolean, boolean):java.util.List");
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    private static void a(String[] strArr, int i10, StringBuilder sb2) {
        String str = strArr[i10];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(' ');
        }
        sb2.append(strArr[i10]);
    }

    private static HmsScan.AddressInfo[] a(String[] strArr, String[] strArr2) {
        int i10;
        if (strArr.length != strArr2.length) {
            return new HmsScan.AddressInfo[0];
        }
        HmsScan.AddressInfo[] addressInfoArr = new HmsScan.AddressInfo[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            HmsScan.AddressInfo addressInfo = new HmsScan.AddressInfo(new String[]{strArr2[i11]}, HmsScan.AddressInfo.OTHER_USE_TYPE);
            String str = strArr[i11];
            if (str != null) {
                if (str.equals("WORK")) {
                    i10 = HmsScan.AddressInfo.OFFICE_TYPE;
                } else if (strArr[i11].equals("HOME")) {
                    i10 = HmsScan.AddressInfo.RESIDENTIAL_USE_TYPE;
                }
                addressInfo.addressType = i10;
            }
            addressInfoArr[i11] = addressInfo;
        }
        return addressInfoArr;
    }

    private static String[] a(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(Fb.f7507f);
    }

    private static String b(CharSequence charSequence, String str, boolean z10, boolean z11) {
        List<List<String>> a10 = a(charSequence, str, z10, z11);
        String str2 = "";
        if (a10 != null && !a10.isEmpty()) {
            for (List<String> list : a10) {
                if (list.get(0) != null && !list.get(0).isEmpty()) {
                    str2 = list.get(0);
                }
            }
        }
        return str2;
    }

    private static HmsScan.EmailContent[] b(String[] strArr, String[] strArr2) {
        int i10;
        if (strArr.length != strArr2.length) {
            return new HmsScan.EmailContent[0];
        }
        HmsScan.EmailContent[] emailContentArr = new HmsScan.EmailContent[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            HmsScan.EmailContent emailContent = new HmsScan.EmailContent(strArr2[i11], "", "", HmsScan.EmailContent.OTHER_USE_TYPE);
            String str = strArr[i11];
            if (str != null) {
                if (str.equals("WORK")) {
                    i10 = HmsScan.EmailContent.OFFICE_USE_TYPE;
                } else if (strArr[i11].equals("HOME")) {
                    i10 = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                }
                emailContent.addressType = i10;
            }
            emailContentArr[i11] = emailContent;
        }
        return emailContentArr;
    }

    private static String[] b(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                String str2 = null;
                int i10 = 1;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    String str3 = list.get(i10);
                    int indexOf = str3.indexOf(61);
                    if (indexOf < 0) {
                        str2 = str3;
                        break;
                    } else if ("TYPE".equals(str3.substring(0, indexOf))) {
                        str2 = str3.substring(indexOf + 1);
                        break;
                    } else {
                        i10++;
                    }
                }
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(Fb.f7507f);
    }

    private static String c(String str) {
        int indexOf;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArr = new String[5];
        int i10 = 0;
        int i11 = 0;
        while (i10 < 4 && (indexOf = str.indexOf(59, i11)) >= 0) {
            strArr[i10] = str.substring(i11, indexOf);
            i10++;
            i11 = indexOf + 1;
        }
        strArr[i10] = str.substring(i11);
        StringBuilder sb2 = new StringBuilder(100);
        a(strArr, 3, sb2);
        a(strArr, 1, sb2);
        a(strArr, 2, sb2);
        a(strArr, 0, sb2);
        a(strArr, 4, sb2);
        return sb2.toString().trim();
    }

    private static HmsScan.TelPhoneNumber[] c(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return new HmsScan.TelPhoneNumber[0];
        }
        HmsScan.TelPhoneNumber[] telPhoneNumberArr = new HmsScan.TelPhoneNumber[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int i11 = HmsScan.TelPhoneNumber.OTHER_USE_TYPE;
            HmsScan.TelPhoneNumber telPhoneNumber = new HmsScan.TelPhoneNumber(i11, strArr2[i10]);
            String str = strArr[i10];
            if (str != null) {
                if (str.equals("WORK")) {
                    i11 = HmsScan.TelPhoneNumber.OFFICE_USE_TYPE;
                } else if (strArr[i10].equals("HOME")) {
                    i11 = HmsScan.TelPhoneNumber.RESIDENTIAL_USE_TYPE;
                } else if (strArr[i10].equals("CELL")) {
                    i11 = HmsScan.TelPhoneNumber.CELLPHONE_NUMBER_USE_TYPE;
                } else if (strArr[i10].equals("FAX")) {
                    i11 = HmsScan.TelPhoneNumber.FAX_USE_TYPE;
                }
                telPhoneNumber.useType = i11;
            }
            telPhoneNumberArr[i10] = telPhoneNumber;
        }
        return telPhoneNumberArr;
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String b10;
        String b11;
        String a10 = Fb.a(xVar);
        if (!a10.startsWith("BEGIN:VCARD") || (b11 = b((CharSequence) "N", (b10 = a.b.b(a10, "\n")), true, false)) == null || b11.isEmpty() || b11.split(";").length == 0) {
            return null;
        }
        String b12 = b((CharSequence) "FN", b10, true, false);
        if (b12 == null || b12.isEmpty()) {
            b12 = c(b11);
        }
        String str = b12;
        List<List<String>> a11 = a((CharSequence) "TEL", b10, true, false);
        List<List<String>> a12 = a((CharSequence) "EMAIL", b10, true, false);
        List<List<String>> a13 = a((CharSequence) "ADR", b10, true, true);
        return new HmsScan(xVar.i(), Fb.a(xVar.b()), str, HmsScan.CONTACT_DETAIL_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.ContactDetail(a(b11, str), b((CharSequence) "TITLE", b10, true, false), b((CharSequence) "ORG", b10, true, true), c(b(a11), a(a11)), b(b(a12), a(a12)), a(b(a13), a(a13)), a(a((CharSequence) "URL", b10, true, false)), null)));
    }
}
