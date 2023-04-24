package dg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final ThreadLocal<SimpleDateFormat> f13029a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<SimpleDateFormat> f13030b = new ThreadLocal<>();

    /* renamed from: c */
    public static final Date f13031c;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, 0, 1);
        f13031c = calendar.getTime();
    }

    public static String a(Date date) {
        l.f(date, "date");
        ThreadLocal<SimpleDateFormat> threadLocal = f13029a;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            threadLocal.set(simpleDateFormat);
        }
        String format = simpleDateFormat.format(date);
        l.e(format, "dateFormatter().format(date)");
        return format;
    }

    public static String b(Date date) {
        l.f(date, CrashHianalyticsData.TIME);
        ThreadLocal<SimpleDateFormat> threadLocal = f13030b;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            threadLocal.set(simpleDateFormat);
        }
        String format = simpleDateFormat.format(date);
        l.e(format, "timeFormatter().format(time)");
        return format;
    }

    public static Date c(String str) {
        Date date;
        l.f(str, "str");
        try {
            ThreadLocal<SimpleDateFormat> threadLocal = f13029a;
            SimpleDateFormat simpleDateFormat = threadLocal.get();
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                threadLocal.set(simpleDateFormat);
            }
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            p000do.a.f13275a.q(e10);
            date = null;
        }
        if (date == null) {
            Date date2 = f13031c;
            l.e(date2, "DEFAULT_DATE");
            return date2;
        }
        return date;
    }

    public static Date d(String str) {
        Date date;
        l.f(str, "str");
        try {
            ThreadLocal<SimpleDateFormat> threadLocal = f13030b;
            SimpleDateFormat simpleDateFormat = threadLocal.get();
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                threadLocal.set(simpleDateFormat);
            }
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            p000do.a.f13275a.q(e10);
            date = null;
        }
        if (date == null) {
            Date date2 = f13031c;
            l.e(date2, "DEFAULT_DATE");
            return date2;
        }
        return date;
    }
}
