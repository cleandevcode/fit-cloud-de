package y3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.k;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public static final HashSet<Integer> f30963a = new HashSet<>();

    /* renamed from: b */
    public static final Handler f30964b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: y3.i0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            gm.l.f(message, CrashHianalyticsData.MESSAGE);
            Object obj = message.obj;
            gm.l.d(obj, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksView");
            g0 g0Var = (g0) obj;
            j0.f30963a.remove(Integer.valueOf(System.identityHashCode(g0Var)));
            if (g0Var.a0().f2790c.a(k.c.STARTED)) {
                g0Var.invalidate();
                return true;
            }
            return true;
        }
    });
}
