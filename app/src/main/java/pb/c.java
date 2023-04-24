package pb;

import android.content.Context;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import sb.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i */
    public static final ExecutorService f23986i = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: j */
    public static AtomicInteger f23987j = new AtomicInteger(0);

    /* renamed from: a */
    public GrsBaseInfo f23988a;

    /* renamed from: b */
    public Context f23989b;

    /* renamed from: c */
    public h f23990c;

    /* renamed from: d */
    public qb.a f23991d;

    /* renamed from: e */
    public qb.c f23992e;

    /* renamed from: f */
    public qb.c f23993f;

    /* renamed from: g */
    public pb.a f23994g;

    /* renamed from: h */
    public FutureTask<Boolean> f23995h;

    /* loaded from: classes.dex */
    public class a implements Callable<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ Context f23996a;

        /* renamed from: b */
        public final /* synthetic */ GrsBaseInfo f23997b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            c.this = r1;
            this.f23996a = context;
            this.f23997b = grsBaseInfo;
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01bd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x0175 A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean call() {
            /*
                Method dump skipped, instructions count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pb.c.a.call():java.lang.Object");
        }
    }

    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f23995h = null;
        this.f23989b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        try {
            this.f23988a = grsBaseInfo.m2clone();
        } catch (CloneNotSupportedException e10) {
            Logger.w("c", "GrsClient catch CloneNotSupportedException", e10);
            this.f23988a = grsBaseInfo.copy();
        }
        GrsBaseInfo grsBaseInfo2 = this.f23988a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f23989b, grsBaseInfo2));
        this.f23995h = futureTask;
        f23986i.execute(futureTask);
        Logger.i("c", "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s", "5.0.10.302", grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry());
    }

    public final boolean a() {
        String str;
        FutureTask<Boolean> futureTask = this.f23995h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e10) {
            e = e10;
            str = "init compute task interrupted.";
            Logger.w("c", str, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i("c", "init compute task canceled.");
            return false;
        } catch (ExecutionException e11) {
            e = e11;
            str = "init compute task failed.";
            Logger.w("c", str, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w("c", "init compute task timed out");
            return false;
        } catch (Exception e12) {
            e = e12;
            str = "init compute task occur unknown Exception";
            Logger.w("c", str, e);
            return false;
        }
    }

    public c(GrsBaseInfo grsBaseInfo) {
        this.f23995h = null;
        try {
            this.f23988a = grsBaseInfo.m2clone();
        } catch (CloneNotSupportedException e10) {
            Logger.w("c", "GrsClient catch CloneNotSupportedException", e10);
            this.f23988a = grsBaseInfo.copy();
        }
    }
}
