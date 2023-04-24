package d6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes.dex */
public final class f0 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ g0 f12678a;

    public f0(g0 g0Var) {
        this.f12678a = g0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            gm.l.f(message, CrashHianalyticsData.MESSAGE);
            g0 g0Var = this.f12678a;
            g0Var.getClass();
            if (message.what == g0Var.f12686g) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    data = null;
                }
                g0Var.a(data);
                try {
                    g0Var.f12680a.unbindService(g0Var);
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
