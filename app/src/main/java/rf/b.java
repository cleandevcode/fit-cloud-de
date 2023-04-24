package rf;

import a0.q;
import android.os.Process;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.tencent.mars.xlog.Xlog;
import gm.l;
import p000do.a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public static Xlog f25597a;

    /* loaded from: classes2.dex */
    public static final class a extends a.C0232a {
        @Override // p000do.a.c
        public final boolean j(int i10) {
            return i10 > 3;
        }

        @Override // p000do.a.C0232a, p000do.a.c
        public final void k(int i10, String str, String str2) {
            l.f(str2, CrashHianalyticsData.MESSAGE);
            Xlog.logWrite2(0, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }
}
