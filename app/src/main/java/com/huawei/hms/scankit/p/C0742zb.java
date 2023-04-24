package com.huawei.hms.scankit.p;

import com.huawei.hms.ml.scan.HmsScan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.huawei.hms.scankit.p.zb */
/* loaded from: classes.dex */
public final class C0742zb {

    /* renamed from: a */
    private static final Pattern f8136a = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})Z");

    /* renamed from: b */
    private static final Pattern f8137b = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})T(\\d{2})(\\d{2})(\\d{2})");

    /* renamed from: c */
    private static final Pattern f8138c = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");

    /* renamed from: d */
    private static final Pattern f8139d = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})\\d{6}Z");

    private static void a(HmsScan.EventTime eventTime, int i10, int i11, int i12) {
        eventTime.year = i10;
        eventTime.month = i11;
        eventTime.day = i12;
    }

    public static void a(String str, HmsScan.EventTime eventTime) {
        Matcher matcher = f8136a.matcher(str);
        Matcher matcher2 = f8137b.matcher(str);
        Matcher matcher3 = f8138c.matcher(str);
        Matcher matcher4 = f8139d.matcher(str);
        try {
            if (matcher.matches()) {
                a(eventTime, Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                b(eventTime, Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                eventTime.isUTCTime = true;
            } else if (matcher2.matches()) {
                a(eventTime, Integer.parseInt(matcher2.group(1)), Integer.parseInt(matcher2.group(2)), Integer.parseInt(matcher2.group(3)));
                b(eventTime, Integer.parseInt(matcher2.group(4)), Integer.parseInt(matcher2.group(5)), Integer.parseInt(matcher2.group(6)));
            } else if (!matcher3.matches()) {
                if (matcher4.matches()) {
                    a(eventTime, Integer.parseInt(matcher4.group(1)), Integer.parseInt(matcher4.group(2)), Integer.parseInt(matcher4.group(3)));
                    return;
                }
                return;
            } else {
                a(eventTime, Integer.parseInt(matcher3.group(1)), Integer.parseInt(matcher3.group(2)), Integer.parseInt(matcher3.group(3)));
            }
            eventTime.originalValue = str;
        } catch (NullPointerException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "NullPointerException");
        }
    }

    private static void b(HmsScan.EventTime eventTime, int i10, int i11, int i12) {
        eventTime.hours = i10;
        eventTime.minutes = i11;
        eventTime.seconds = i12;
    }
}
