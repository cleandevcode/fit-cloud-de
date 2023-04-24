package hh;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public final class c implements s1.b {
    public static Date b(Calendar calendar, Date date, int i10) {
        l.f(calendar, "calendar");
        l.f(date, "date");
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) + i10);
        Date time = calendar.getTime();
        l.e(time, "calendar.time");
        return time;
    }

    public static Date c(Calendar calendar, Date date) {
        l.f(date, CrashHianalyticsData.TIME);
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        Date time = calendar.getTime();
        l.e(time, "calendar.time");
        return time;
    }

    public static Date d(Calendar calendar, Date date, int i10) {
        l.f(date, CrashHianalyticsData.TIME);
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i10 != 0) {
            calendar.set(5, calendar.get(5) + i10);
        }
        Date time = calendar.getTime();
        l.e(time, "calendar.time");
        return time;
    }

    public static int e(Calendar calendar, Date date, Date date2) {
        l.f(calendar, "calendar");
        l.f(date, "date1");
        l.f(date2, "date2");
        if (!date.before(date2)) {
            date2 = date;
            date = date2;
        }
        calendar.setTime(date);
        int i10 = calendar.get(6);
        int i11 = calendar.get(1);
        calendar.setTime(date2);
        int i12 = calendar.get(6);
        int i13 = calendar.get(1);
        if (i11 != i13) {
            int i14 = 0;
            while (i11 < i13) {
                i14 += ((i11 % 4 != 0 || i11 % 100 == 0) && i11 % 400 != 0) ? 365 : 366;
                i11++;
            }
            return (i12 - i10) + i14;
        }
        return i12 - i10;
    }

    public static Uri f(Context context) {
        StringBuilder a10 = android.support.v4.media.d.a("package:");
        a10.append(context.getPackageName());
        Uri parse = Uri.parse(a10.toString());
        l.e(parse, "parse(\"package:\" + context.packageName)");
        return parse;
    }

    public static boolean g(Calendar calendar, Date date, Date date2) {
        l.f(date, "date1");
        calendar.setTime(date);
        int i10 = calendar.get(1);
        int i11 = calendar.get(6);
        calendar.setTime(date2);
        int i12 = calendar.get(1);
        int i13 = calendar.get(6);
        if (i10 < i12) {
            return true;
        }
        return i10 == i12 && i11 < i13;
    }

    @Override // s1.b
    public Object a(s1.a aVar) {
        throw aVar;
    }
}
