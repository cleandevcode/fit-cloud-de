package r3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p3.j;

/* loaded from: classes.dex */
public final class b implements r3.a {

    /* renamed from: a */
    public final j f25195a;

    /* renamed from: b */
    public final Handler f25196b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final a f25197c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
            b.this = r1;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f25196b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f25195a = new j(executorService);
    }

    public final void a(Runnable runnable) {
        this.f25195a.execute(runnable);
    }
}
