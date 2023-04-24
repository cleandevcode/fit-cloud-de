package g6;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import f6.f;
import gm.l;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final int f15008a;

    /* renamed from: b */
    public static final ScheduledExecutorService f15009b;

    /* renamed from: c */
    public static String f15010c;

    /* renamed from: d */
    public static final q5.a f15011d;

    static {
        new a();
        f15008a = Process.myUid();
        f15009b = Executors.newSingleThreadScheduledExecutor();
        f15010c = "";
        f15011d = new q5.a(2);
    }

    public static final void a(ActivityManager activityManager) {
        if (i6.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f15008a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        l.e(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        l.e(stackTrace, "stackTrace");
                        int length = stackTrace.length;
                        int i10 = 0;
                        while (i10 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i10];
                            i10++;
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!l.a(jSONArray2, f15010c) && f.c(thread)) {
                            f15010c = jSONArray2;
                            new f6.b(processErrorStateInfo.shortMsg, jSONArray2).c();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
        }
    }
}
