package sb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b implements Callable<d> {

    /* renamed from: a */
    public final /* synthetic */ ExecutorService f26814a;

    /* renamed from: b */
    public final /* synthetic */ String f26815b;

    /* renamed from: c */
    public final /* synthetic */ qb.c f26816c;

    /* renamed from: d */
    public final /* synthetic */ c f26817d;

    public b(c cVar, ExecutorService executorService, String str, qb.c cVar2) {
        this.f26817d = cVar;
        this.f26814a = executorService;
        this.f26815b = str;
        this.f26816c = cVar2;
    }

    @Override // java.util.concurrent.Callable
    public final d call() {
        int i10;
        c cVar = this.f26817d;
        ExecutorService executorService = this.f26814a;
        String str = this.f26815b;
        qb.c cVar2 = this.f26816c;
        cVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a10 = cVar.a(executorService, cVar.f26826i, str, cVar2);
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.f26833c;
        }
        Logger.v("c", "use 2.0 interface return http's code is：{%s}", Integer.valueOf(i10));
        if (i10 == 404 || i10 == 401) {
            if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.f26818a.getAppName())) {
                Logger.i("c", "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            cVar.f26822e.clear();
            Logger.i("c", "this env has not deploy new interface,so use old interface.");
            a10 = cVar.a(executorService, cVar.f26825h, str, cVar2);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        ArrayList arrayList = new ArrayList(cVar.f26823f);
        JSONArray jSONArray = cVar.f26824g;
        Context context = cVar.f26819b;
        if (context != null && arrayList.size() > 0 && HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new e(elapsedRealtime2, arrayList, jSONArray));
        }
        cVar.f26823f.clear();
        return a10;
    }
}
