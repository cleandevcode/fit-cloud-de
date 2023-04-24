package al;

import java.util.concurrent.atomic.AtomicReference;
import tk.n;
import yk.a;

/* loaded from: classes2.dex */
public final class j<T> extends AtomicReference<uk.c> implements n<T>, uk.c {

    /* renamed from: a */
    public final wk.d<? super T> f624a;

    /* renamed from: b */
    public final wk.d<? super Throwable> f625b;

    /* renamed from: c */
    public final wk.a f626c;

    /* renamed from: d */
    public final wk.d<? super uk.c> f627d;

    public j(wk.d dVar, wk.d dVar2, wk.a aVar) {
        a.d dVar3 = yk.a.f31789d;
        this.f624a = dVar;
        this.f625b = dVar2;
        this.f626c = aVar;
        this.f627d = dVar3;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (xk.b.h(this, cVar)) {
            try {
                this.f627d.accept(this);
            } catch (Throwable th2) {
                h7.a.y(th2);
                cVar.c();
                onError(th2);
            }
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        if (d()) {
            return;
        }
        try {
            this.f624a.accept(t10);
        } catch (Throwable th2) {
            h7.a.y(th2);
            get().c();
            onError(th2);
        }
    }

    @Override // uk.c
    public final void c() {
        xk.b.a(this);
    }

    public final boolean d() {
        return get() == xk.b.f30613a;
    }

    @Override // tk.n
    public final void onComplete() {
        if (d()) {
            return;
        }
        lazySet(xk.b.f30613a);
        try {
            this.f626c.run();
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (d()) {
            ol.a.a(th2);
            return;
        }
        lazySet(xk.b.f30613a);
        try {
            this.f625b.accept(th2);
        } catch (Throwable th3) {
            h7.a.y(th3);
            ol.a.a(new vk.a(th2, th3));
        }
    }
}
