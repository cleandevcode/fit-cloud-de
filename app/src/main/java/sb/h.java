package sb;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vb.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final ExecutorService f26848a = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: b */
    public final ConcurrentHashMap f26849b = new ConcurrentHashMap(16);

    /* renamed from: c */
    public final Object f26850c = new Object();

    /* renamed from: d */
    public qb.a f26851d;

    /* loaded from: classes.dex */
    public class a implements Callable<d> {

        /* renamed from: a */
        public final /* synthetic */ ub.c f26852a;

        /* renamed from: b */
        public final /* synthetic */ String f26853b;

        /* renamed from: c */
        public final /* synthetic */ qb.c f26854c;

        public a(ub.c cVar, String str, qb.c cVar2) {
            h.this = r1;
            this.f26852a = cVar;
            this.f26853b = str;
            this.f26854c = cVar2;
        }

        @Override // java.util.concurrent.Callable
        public final d call() {
            String str;
            int i10;
            c cVar = new c(this.f26852a, h.this.f26851d);
            ExecutorService executorService = h.this.f26848a;
            String str2 = this.f26853b;
            qb.c cVar2 = this.f26854c;
            if (!cVar.f26825h.isEmpty() || !cVar.f26826i.isEmpty()) {
                try {
                    ub.d dVar = cVar.f26828k;
                    if (dVar != null) {
                        i10 = dVar.f28654d;
                    } else {
                        i10 = 10;
                    }
                    return (d) executorService.submit(new sb.b(cVar, executorService, str2, cVar2)).get(i10, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    e = e10;
                    str = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
                    Logger.w("c", str, e);
                    return null;
                } catch (CancellationException unused) {
                    Logger.i("c", "{submitExcutorTaskWithTimeout} the computation was cancelled");
                } catch (ExecutionException e11) {
                    e = e11;
                    str = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
                    Logger.w("c", str, e);
                    return null;
                } catch (TimeoutException unused2) {
                    Logger.w("c", "{submitExcutorTaskWithTimeout} the wait timed out");
                } catch (Exception e12) {
                    e = e12;
                    str = "{submitExcutorTaskWithTimeout} catch Exception";
                    Logger.w("c", str, e);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ub.c f26856a;

        /* renamed from: b */
        public final /* synthetic */ String f26857b;

        /* renamed from: c */
        public final /* synthetic */ qb.c f26858c;

        /* renamed from: d */
        public final /* synthetic */ pb.b f26859d;

        public b(ub.c cVar, String str, qb.c cVar2, pb.b bVar) {
            h.this = r1;
            this.f26856a = cVar;
            this.f26857b = str;
            this.f26858c = cVar2;
            this.f26859d = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d a10 = h.this.a(this.f26856a, this.f26857b, this.f26858c);
            pb.b bVar = this.f26859d;
            if (bVar != null) {
                if (a10 == null) {
                    Logger.v("RequestController", "GrsResponse is null");
                    bVar.a();
                    return;
                }
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(a10);
            }
        }
    }

    public final d a(ub.c cVar, String str, qb.c cVar2) {
        Future<d> submit;
        String str2;
        String str3;
        boolean z10;
        Logger.d("RequestController", "request to server with service name is: " + str);
        boolean z11 = true;
        String grsParasKey = cVar.f28648a.getGrsParasKey(true, true, cVar.f28649b);
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (this.f26850c) {
            if (!NetworkUtil.isNetworkAvailable(cVar.f28649b)) {
                return null;
            }
            b.a a10 = vb.b.a(grsParasKey);
            ub.b bVar = (ub.b) this.f26849b.get(grsParasKey);
            try {
                if (bVar != null) {
                    if (SystemClock.elapsedRealtime() - bVar.f28647b <= 300000) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        submit = bVar.f28646a;
                        return submit.get();
                    }
                }
                return submit.get();
            } catch (InterruptedException e10) {
                e = e10;
                str2 = "RequestController";
                str3 = "when check result, find InterruptedException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (CancellationException e11) {
                e = e11;
                str2 = "RequestController";
                str3 = "when check result, find CancellationException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (ExecutionException e12) {
                e = e12;
                str2 = "RequestController";
                str3 = "when check result, find ExecutionException, check others";
                Logger.w(str2, str3, e);
                return null;
            }
            if (a10 != null) {
                if (SystemClock.elapsedRealtime() - a10.f29193b > a10.f29192a) {
                    z11 = false;
                }
                if (z11) {
                    return null;
                }
            }
            Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
            submit = this.f26848a.submit(new a(cVar, str, cVar2));
            this.f26849b.put(grsParasKey, new ub.b(submit));
        }
    }

    public final void b(ub.c cVar, pb.b bVar, String str, qb.c cVar2) {
        this.f26848a.execute(new b(cVar, str, cVar2, bVar));
    }
}
