package t4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t4.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final boolean f27570a;

    /* renamed from: b */
    public final Executor f27571b;

    /* renamed from: c */
    public final HashMap f27572c;

    /* renamed from: d */
    public final ReferenceQueue<s<?>> f27573d;

    /* renamed from: e */
    public s.a f27574e;

    /* loaded from: classes.dex */
    public static final class a extends WeakReference<s<?>> {

        /* renamed from: a */
        public final r4.f f27575a;

        /* renamed from: b */
        public final boolean f27576b;

        /* renamed from: c */
        public x<?> f27577c;

        public a(r4.f fVar, s<?> sVar, ReferenceQueue<? super s<?>> referenceQueue, boolean z10) {
            super(sVar, referenceQueue);
            x<?> xVar;
            b0.c.i(fVar);
            this.f27575a = fVar;
            if (sVar.f27726a && z10) {
                xVar = sVar.f27728c;
                b0.c.i(xVar);
            } else {
                xVar = null;
            }
            this.f27577c = xVar;
            this.f27576b = sVar.f27726a;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new t4.a());
        this.f27572c = new HashMap();
        this.f27573d = new ReferenceQueue<>();
        this.f27570a = false;
        this.f27571b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(r4.f fVar, s<?> sVar) {
        a aVar = (a) this.f27572c.put(fVar, new a(fVar, sVar, this.f27573d, this.f27570a));
        if (aVar != null) {
            aVar.f27577c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        x<?> xVar;
        synchronized (this) {
            this.f27572c.remove(aVar.f27575a);
            if (aVar.f27576b && (xVar = aVar.f27577c) != null) {
                this.f27574e.a(aVar.f27575a, new s<>(xVar, true, false, aVar.f27575a, this.f27574e));
            }
        }
    }
}
