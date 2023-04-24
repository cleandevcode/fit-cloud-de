package sc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import f.s;
import fl.g;
import java.util.concurrent.PriorityBlockingQueue;
import qc.y;
import tk.k;
import tk.o;

/* loaded from: classes.dex */
public final class b implements sc.a {

    /* renamed from: a */
    public final s f26861a = new s(4);

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ o f26862a;

        public a(o oVar) {
            b.this = r1;
            this.f26862a = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    h hVar = (h) ((PriorityBlockingQueue) b.this.f26861a.f13974a).take();
                    y<T> yVar = hVar.f26890b;
                    long currentTimeMillis = System.currentTimeMillis();
                    pc.b.l(yVar);
                    RxBleLog.i("RUNNING  %s", yVar);
                    w.d dVar = new w.d(6);
                    hVar.a(dVar, this.f26862a);
                    dVar.b();
                    pc.b.i(yVar, currentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e10) {
                    RxBleLog.e(e10, "Error while processing client operation queue", new Object[0]);
                }
            }
        }
    }

    /* renamed from: sc.b$b */
    /* loaded from: classes.dex */
    public class C0478b<T> implements k<T> {

        /* renamed from: a */
        public final /* synthetic */ y f26864a;

        public C0478b(y yVar) {
            b.this = r1;
            this.f26864a = yVar;
        }

        @Override // tk.k
        public final void a(g.a aVar) {
            h hVar = new h(this.f26864a, aVar);
            xk.b.g(aVar, new uk.a(new c(this, hVar)));
            pc.b.j(this.f26864a);
            ((PriorityBlockingQueue) b.this.f26861a.f13974a).add(hVar);
        }
    }

    public b(o oVar) {
        new Thread(new a(oVar)).start();
    }

    @Override // sc.a
    public final <T> tk.i<T> a(y<T> yVar) {
        return tk.i.e(new C0478b(yVar));
    }
}
