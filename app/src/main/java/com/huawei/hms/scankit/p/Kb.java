package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.List;

/* loaded from: classes.dex */
public final class Kb extends Fb {
    private static String a(CharSequence charSequence, String str, boolean z10) {
        List<List<String>> a10 = Jb.a(charSequence, str, z10, false);
        return (a10 == null || a10.isEmpty()) ? "" : a10.get(a10.size() - 1).get(0);
    }

    private static void a(String[] strArr, HmsScan.EventTime eventTime) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            C0742zb.a(str, eventTime);
        }
    }

    private static String[] b(CharSequence charSequence, String str, boolean z10) {
        List<List<String>> a10 = Jb.a(charSequence, str, z10, false);
        if (a10 == null || a10.isEmpty()) {
            return new String[0];
        }
        int size = a10.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = a10.get(i10).get(0);
        }
        return strArr;
    }

    @Override // com.huawei.hms.scankit.p.Fb
    public HmsScan b(com.huawei.hms.scankit.aiscan.common.x xVar) {
        String a10 = Fb.a(xVar);
        if (!a10.startsWith("BEGIN:VEVENT")) {
            return null;
        }
        String b10 = a.b.b(a10, "\n");
        String a11 = a("SUMMARY", b10, true);
        String a12 = a("LOCATION", b10, true);
        String a13 = a("ORGANIZER", b10, true);
        String a14 = a("DESCRIPTION", b10, true);
        String a15 = a("STATUS", b10, true);
        String[] b11 = b("DTSTART", b10, true);
        String[] b12 = b("DTEND", b10, true);
        HmsScan.EventTime eventTime = new HmsScan.EventTime(-1, -1, -1, -1, -1, -1, false, "");
        HmsScan.EventTime eventTime2 = new HmsScan.EventTime(-1, -1, -1, -1, -1, -1, false, "");
        a(b11, eventTime);
        a(b12, eventTime2);
        return new HmsScan(xVar.i(), Fb.a(xVar.b()), a11, HmsScan.EVENT_INFO_FORM, xVar.g(), Fb.a(xVar.h()), null, new com.huawei.hms.scankit.F(new HmsScan.EventInfo(a11, eventTime, eventTime2, a12, a14, a13, a15)));
    }
}
