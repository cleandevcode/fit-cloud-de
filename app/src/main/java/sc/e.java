package sc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import f.s;
import fl.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import oc.l;
import oc.x;
import qc.y;
import tk.k;
import tk.o;

/* loaded from: classes.dex */
public final class e implements d, l {

    /* renamed from: a */
    public final String f26868a;

    /* renamed from: b */
    public final x f26869b;

    /* renamed from: c */
    public c f26870c;

    /* renamed from: e */
    public final Future<?> f26872e;

    /* renamed from: d */
    public final s f26871d = new s(4);

    /* renamed from: f */
    public volatile boolean f26873f = true;

    /* renamed from: g */
    public lc.g f26874g = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ o f26875a;

        /* renamed from: b */
        public final /* synthetic */ String f26876b;

        public a(o oVar, String str) {
            e.this = r1;
            this.f26875a = oVar;
            this.f26876b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (e.this.f26873f) {
                try {
                    h hVar = (h) ((PriorityBlockingQueue) e.this.f26871d.f13974a).take();
                    y<T> yVar = hVar.f26890b;
                    long currentTimeMillis = System.currentTimeMillis();
                    pc.b.l(yVar);
                    RxBleLog.i("RUNNING  %s", yVar);
                    w.d dVar = new w.d(6);
                    hVar.a(dVar, this.f26875a);
                    dVar.b();
                    pc.b.i(yVar, currentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    synchronized (e.this) {
                        if (!e.this.f26873f) {
                            break;
                        }
                        RxBleLog.e(e10, "Error while processing connection operation queue", new Object[0]);
                    }
                }
            }
            e eVar = e.this;
            synchronized (eVar) {
                while (!((PriorityBlockingQueue) eVar.f26871d.f13974a).isEmpty()) {
                    ((g.a) ((h) ((PriorityBlockingQueue) eVar.f26871d.f13974a).poll()).f26891c).f(eVar.f26874g);
                }
            }
            RxBleLog.v("Terminated (%s)", pc.b.c(this.f26876b));
        }
    }

    /* loaded from: classes.dex */
    public class b<T> implements k<T> {

        /* renamed from: a */
        public final /* synthetic */ y f26878a;

        public b(y yVar) {
            e.this = r1;
            this.f26878a = yVar;
        }

        @Override // tk.k
        public final void a(g.a aVar) {
            h hVar = new h(this.f26878a, aVar);
            aVar.e(new f(this, hVar));
            pc.b.j(this.f26878a);
            ((PriorityBlockingQueue) e.this.f26871d.f13974a).add(hVar);
        }
    }

    /* loaded from: classes.dex */
    public class c extends ml.a<lc.g> {
        public c() {
            e.this = r1;
        }

        @Override // tk.n
        public final void b(Object obj) {
            e.this.d((lc.g) obj);
        }

        @Override // tk.n
        public final void onComplete() {
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
        }
    }

    public e(String str, x xVar, ExecutorService executorService, o oVar) {
        this.f26868a = str;
        this.f26869b = xVar;
        this.f26872e = executorService.submit(new a(oVar, str));
    }

    @Override // sc.a
    public final synchronized <T> tk.i<T> a(y<T> yVar) {
        if (!this.f26873f) {
            return tk.i.m(this.f26874g);
        }
        return new fl.g(new b(yVar));
    }

    @Override // oc.l
    public final void b() {
        this.f26870c.c();
        this.f26870c = null;
        d(new lc.f(this.f26868a, -1));
    }

    @Override // oc.l
    public final void c() {
        tk.i<lc.g> a10 = this.f26869b.a();
        c cVar = new c();
        a10.d(cVar);
        this.f26870c = cVar;
    }

    public final synchronized void d(lc.g gVar) {
        if (this.f26874g != null) {
            return;
        }
        RxBleLog.d(gVar, "Connection operations queue to be terminated (%s)", pc.b.c(this.f26868a));
        this.f26873f = false;
        this.f26874g = gVar;
        this.f26872e.cancel(true);
    }
}
