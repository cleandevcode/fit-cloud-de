package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class InitReport {

    /* renamed from: a */
    public static boolean f7059a = false;

    /* renamed from: b */
    public static CopyOnWriteArrayList f7060b = new CopyOnWriteArrayList();

    public static void access$000() {
        String str;
        try {
            Iterator it = f7060b.iterator();
            while (it.hasNext()) {
                HianalyticsHelper.getInstance().getReportExecutor().submit((Runnable) it.next());
            }
            f7060b.clear();
        } catch (NullPointerException unused) {
            str = "event is null occured";
            Logger.e("HaReport", str);
        } catch (RejectedExecutionException unused2) {
            str = "submit failed of rejected execution exception";
            Logger.e("HaReport", str);
        } catch (Exception unused3) {
            str = "submit failed because of some exception";
            Logger.e("HaReport", str);
        }
    }

    public static void enableConnectNet() {
        String str;
        f7059a = true;
        try {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.InitReport.1
                @Override // java.lang.Runnable
                public void run() {
                    InitReport.access$000();
                }
            });
        } catch (RejectedExecutionException unused) {
            str = "the thread submit has rejectedExecutionException!";
            Logger.e("HaReport", str);
        } catch (Throwable unused2) {
            str = "the thread submit has fatal error!";
            Logger.e("HaReport", str);
        }
    }

    public static void reportWhenInit(Runnable runnable) {
        String str;
        if (!f7059a) {
            if (f7060b.size() > 10) {
                Logger.e("TAG", "the event to be report when init exceed the limit!");
                return;
            } else {
                f7060b.add(runnable);
                return;
            }
        }
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
        } catch (RejectedExecutionException unused) {
            str = "the thread submit has rejectedExecutionException!";
            Logger.e("HaReport", str);
        } catch (Throwable unused2) {
            str = "the thread submit has fatal error!";
            Logger.e("HaReport", str);
        }
    }
}
