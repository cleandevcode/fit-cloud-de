package p3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g */
    public static final String f23824g = f3.m.e("WorkForegroundRunnable");

    /* renamed from: a */
    public final q3.c<Void> f23825a = new q3.c<>();

    /* renamed from: b */
    public final Context f23826b;

    /* renamed from: c */
    public final o3.p f23827c;

    /* renamed from: d */
    public final ListenableWorker f23828d;

    /* renamed from: e */
    public final f3.h f23829e;

    /* renamed from: f */
    public final r3.a f23830f;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ q3.c f23831a;

        public a(q3.c cVar) {
            n.this = r1;
            this.f23831a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f23831a.k(n.this.f23828d.a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ q3.c f23833a;

        public b(q3.c cVar) {
            n.this = r1;
            this.f23833a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                f3.g gVar = (f3.g) this.f23833a.get();
                if (gVar != null) {
                    f3.m.c().a(n.f23824g, String.format("Updating notification for %s", n.this.f23827c.f22627c), new Throwable[0]);
                    n nVar = n.this;
                    ListenableWorker listenableWorker = nVar.f23828d;
                    listenableWorker.f3622e = true;
                    q3.c<Void> cVar = nVar.f23825a;
                    f3.h hVar = nVar.f23829e;
                    Context context = nVar.f23826b;
                    UUID uuid = listenableWorker.f3619b.f3627a;
                    p pVar = (p) hVar;
                    pVar.getClass();
                    q3.c cVar2 = new q3.c();
                    ((r3.b) pVar.f23840a).a(new o(pVar, cVar2, uuid, gVar, context));
                    cVar.k(cVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", n.this.f23827c.f22627c));
            } catch (Throwable th2) {
                n.this.f23825a.j(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public n(Context context, o3.p pVar, ListenableWorker listenableWorker, f3.h hVar, r3.a aVar) {
        this.f23826b = context;
        this.f23827c = pVar;
        this.f23828d = listenableWorker;
        this.f23829e = hVar;
        this.f23830f = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.f23827c.f22641q && !f1.a.a()) {
            q3.c cVar = new q3.c();
            ((r3.b) this.f23830f).f25197c.execute(new a(cVar));
            cVar.a(new b(cVar), ((r3.b) this.f23830f).f25197c);
            return;
        }
        this.f23825a.i(null);
    }
}
