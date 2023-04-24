package sc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;
import java.util.concurrent.atomic.AtomicLong;
import qc.y;
import tk.j;
import tk.n;
import tk.o;

/* loaded from: classes.dex */
public final class h<T> implements Comparable<h> {

    /* renamed from: d */
    public static final AtomicLong f26888d = new AtomicLong(0);

    /* renamed from: a */
    public final long f26889a = f26888d.getAndIncrement();

    /* renamed from: b */
    public final y<T> f26890b;

    /* renamed from: c */
    public final j<T> f26891c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ w.d f26892a;

        /* renamed from: b */
        public final /* synthetic */ o f26893b;

        /* renamed from: sc.h$a$a */
        /* loaded from: classes.dex */
        public class C0479a implements n<T> {
            public C0479a() {
                a.this = r1;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                g.a aVar = (g.a) h.this.f26891c;
                aVar.getClass();
                xk.b.g(aVar, cVar);
            }

            @Override // tk.n
            public final void b(T t10) {
                ((g.a) h.this.f26891c).d(t10);
            }

            @Override // tk.n
            public final void onComplete() {
                ((g.a) h.this.f26891c).b();
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                ((g.a) h.this.f26891c).f(th2);
            }
        }

        public a(w.d dVar, o oVar) {
            h.this = r1;
            this.f26892a = dVar;
            this.f26893b = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.f26890b.y(this.f26892a).F(this.f26893b).d(new C0479a());
        }
    }

    public h(y yVar, g.a aVar) {
        this.f26890b = yVar;
        this.f26891c = aVar;
    }

    public final void a(w.d dVar, o oVar) {
        if (((g.a) this.f26891c).a()) {
            y<T> yVar = this.f26890b;
            char[] cArr = pc.b.f24007a;
            if (RxBleLog.isAtLeast(2)) {
                RxBleLog.v("SKIPPED  %s(%d) just before running — is disposed", yVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(yVar)));
            }
            dVar.e();
            return;
        }
        oVar.c(new a(dVar, oVar));
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        int compareTo = this.f26890b.compareTo(hVar2.f26890b);
        return (compareTo != 0 || hVar2.f26890b == this.f26890b) ? compareTo : this.f26889a < hVar2.f26889a ? -1 : 1;
    }
}
