package d0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p0.c;

/* loaded from: classes.dex */
public final class m<V> implements na.a<List<V>> {

    /* renamed from: a */
    public List<? extends na.a<? extends V>> f12594a;

    /* renamed from: b */
    public ArrayList f12595b;

    /* renamed from: c */
    public final boolean f12596c;

    /* renamed from: d */
    public final AtomicInteger f12597d;

    /* renamed from: e */
    public final na.a<List<V>> f12598e = p0.c.a(new j(this));

    /* renamed from: f */
    public c.a<List<V>> f12599f;

    public m(ArrayList arrayList, boolean z10, c0.a aVar) {
        this.f12594a = arrayList;
        this.f12595b = new ArrayList(arrayList.size());
        this.f12596c = z10;
        this.f12597d = new AtomicInteger(arrayList.size());
        a(new k(this), o8.b.i());
        if (this.f12594a.isEmpty()) {
            this.f12599f.a(new ArrayList(this.f12595b));
            return;
        }
        for (int i10 = 0; i10 < this.f12594a.size(); i10++) {
            this.f12595b.add(null);
        }
        List<? extends na.a<? extends V>> list = this.f12594a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            na.a<? extends V> aVar2 = list.get(i11);
            aVar2.a(new l(this, i11, aVar2), aVar);
        }
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        this.f12598e.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        List<? extends na.a<? extends V>> list = this.f12594a;
        if (list != null) {
            for (na.a<? extends V> aVar : list) {
                aVar.cancel(z10);
            }
        }
        return this.f12598e.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        List<? extends na.a<? extends V>> list = this.f12594a;
        if (list != null && !isDone()) {
            loop0: for (na.a<? extends V> aVar : list) {
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e10) {
                        throw e10;
                    } catch (InterruptedException e11) {
                        throw e11;
                    } catch (Throwable unused) {
                        if (this.f12596c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return this.f12598e.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12598e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12598e.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f12598e.get(j10, timeUnit);
    }
}
