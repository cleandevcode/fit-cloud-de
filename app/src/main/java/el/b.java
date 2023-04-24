package el;

import el.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nl.f;
import nl.h;
import tk.n;

/* loaded from: classes2.dex */
public abstract class b<T> extends AtomicInteger implements n<T>, uk.c {

    /* renamed from: a */
    public final kl.b f13823a = new kl.b();

    /* renamed from: b */
    public final int f13824b;

    /* renamed from: c */
    public final int f13825c;

    /* renamed from: d */
    public f<T> f13826d;

    /* renamed from: e */
    public uk.c f13827e;

    /* renamed from: f */
    public volatile boolean f13828f;

    /* renamed from: g */
    public volatile boolean f13829g;

    public b(int i10, int i11) {
        this.f13825c = i11;
        this.f13824b = i10;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (xk.b.i(this.f13827e, cVar)) {
            this.f13827e = cVar;
            if (cVar instanceof nl.b) {
                nl.b bVar = (nl.b) cVar;
                int d10 = bVar.d(7);
                if (d10 == 1) {
                    this.f13826d = bVar;
                    this.f13828f = true;
                    d.a aVar = (d.a) this;
                    aVar.f13838h.a(aVar);
                    d();
                    return;
                } else if (d10 == 2) {
                    this.f13826d = bVar;
                    d.a aVar2 = (d.a) this;
                    aVar2.f13838h.a(aVar2);
                    return;
                }
            }
            this.f13826d = new h(this.f13824b);
            d.a aVar3 = (d.a) this;
            aVar3.f13838h.a(aVar3);
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        if (t10 != null) {
            this.f13826d.offer(t10);
        }
        d();
    }

    @Override // uk.c
    public final void c() {
        this.f13829g = true;
        this.f13827e.c();
        d.a aVar = (d.a) this;
        AtomicReference atomicReference = aVar.f13840j;
        atomicReference.getClass();
        xk.b.a(atomicReference);
        this.f13823a.d();
        if (getAndIncrement() == 0) {
            this.f13826d.clear();
            aVar.f13841k = null;
        }
    }

    public abstract void d();

    @Override // tk.n
    public final void onComplete() {
        this.f13828f = true;
        d();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (this.f13823a.c(th2)) {
            if (this.f13825c == 1) {
                AtomicReference atomicReference = ((d.a) this).f13840j;
                atomicReference.getClass();
                xk.b.a(atomicReference);
            }
            this.f13828f = true;
            d();
        }
    }
}
