package aj;

import com.huawei.hms.scankit.C0637e;
import fl.g;
import gm.l;
import java.util.concurrent.atomic.AtomicLong;
import p000do.a;
import s.k;
import tk.j;
import tk.n;
import tk.o;

/* loaded from: classes2.dex */
public final class a<T> implements Comparable<a<?>> {

    /* renamed from: d */
    public static final AtomicLong f589d = new AtomicLong(0);

    /* renamed from: a */
    public final zi.b<T> f590a;

    /* renamed from: b */
    public final j<T> f591b;

    /* renamed from: c */
    public final long f592c = f589d.getAndIncrement();

    /* renamed from: aj.a$a */
    /* loaded from: classes2.dex */
    public static final class C0012a implements n<T> {

        /* renamed from: a */
        public final /* synthetic */ a<T> f593a;

        public C0012a(a<T> aVar) {
            this.f593a = aVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            l.f(cVar, "disposable");
            g.a aVar = (g.a) this.f593a.f591b;
            aVar.getClass();
            xk.b.g(aVar, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            l.f(t10, "item");
            ((g.a) this.f593a.f591b).d(t10);
        }

        @Override // tk.n
        public final void onComplete() {
            ((g.a) this.f593a.f591b).b();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            l.f(th2, C0637e.f7371a);
            ((g.a) this.f593a.f591b).f(th2);
        }
    }

    public a(zi.b bVar, g.a aVar) {
        this.f590a = bVar;
        this.f591b = aVar;
    }

    public final void a(ej.b bVar, o oVar) {
        l.f(oVar, "subscribeScheduler");
        if (((g.a) this.f591b).a()) {
            zi.b<T> bVar2 = this.f590a;
            l.f(bVar2, "operation");
            a.b bVar3 = p000do.a.f13275a;
            bVar3.t("Fc#Operation");
            bVar3.b("SKIPPED  %s(%d) just before running — is disposed", bVar2.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(bVar2)));
            bVar.b();
            return;
        }
        oVar.c(new k(this, bVar, oVar, 6));
    }

    @Override // java.lang.Comparable
    public final int compareTo(a<?> aVar) {
        a<?> aVar2 = aVar;
        l.f(aVar2, "other");
        int compareTo = this.f590a.compareTo(aVar2.f590a);
        return (compareTo != 0 || aVar2.f590a == this.f590a) ? compareTo : this.f592c < aVar2.f592c ? -1 : 1;
    }
}
