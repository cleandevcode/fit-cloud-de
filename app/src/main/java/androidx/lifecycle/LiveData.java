package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.k;
import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f2637k = new Object();

    /* renamed from: a */
    public final Object f2638a;

    /* renamed from: b */
    public n.b<b0<? super T>, LiveData<T>.c> f2639b;

    /* renamed from: c */
    public int f2640c;

    /* renamed from: d */
    public boolean f2641d;

    /* renamed from: e */
    public volatile Object f2642e;

    /* renamed from: f */
    public volatile Object f2643f;

    /* renamed from: g */
    public int f2644g;

    /* renamed from: h */
    public boolean f2645h;

    /* renamed from: i */
    public boolean f2646i;

    /* renamed from: j */
    public final a f2647j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements s {

        /* renamed from: e */
        public final u f2648e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LifecycleBoundObserver(u uVar, b0<? super T> b0Var) {
            super(b0Var);
            LiveData.this = r1;
            this.f2648e = uVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void b() {
            this.f2648e.a0().c(this);
        }

        @Override // androidx.lifecycle.s
        public final void d(u uVar, k.b bVar) {
            k.c cVar = this.f2648e.a0().f2790c;
            if (cVar == k.c.DESTROYED) {
                LiveData.this.i(this.f2651a);
                return;
            }
            k.c cVar2 = null;
            while (cVar2 != cVar) {
                a(f());
                cVar2 = cVar;
                cVar = this.f2648e.a0().f2790c;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean e(u uVar) {
            return this.f2648e == uVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean f() {
            return this.f2648e.a0().f2790c.a(k.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            LiveData.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f2638a) {
                obj = LiveData.this.f2643f;
                LiveData.this.f2643f = LiveData.f2637k;
            }
            LiveData.this.j(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, b0<? super T> b0Var) {
            super(b0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean f() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a */
        public final b0<? super T> f2651a;

        /* renamed from: b */
        public boolean f2652b;

        /* renamed from: c */
        public int f2653c = -1;

        public c(b0<? super T> b0Var) {
            LiveData.this = r1;
            this.f2651a = b0Var;
        }

        public final void a(boolean z10) {
            int i10;
            boolean z11;
            boolean z12;
            if (z10 == this.f2652b) {
                return;
            }
            this.f2652b = z10;
            LiveData liveData = LiveData.this;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = liveData.f2640c;
            liveData.f2640c = i10 + i11;
            if (!liveData.f2641d) {
                liveData.f2641d = true;
                while (true) {
                    try {
                        int i12 = liveData.f2640c;
                        if (i11 == i12) {
                            break;
                        }
                        if (i11 == 0 && i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 > 0 && i12 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            liveData.g();
                        } else if (z12) {
                            liveData.h();
                        }
                        i11 = i12;
                    } finally {
                        liveData.f2641d = false;
                    }
                }
            }
            if (this.f2652b) {
                LiveData.this.c(this);
            }
        }

        public void b() {
        }

        public boolean e(u uVar) {
            return false;
        }

        public abstract boolean f();
    }

    public LiveData() {
        this.f2638a = new Object();
        this.f2639b = new n.b<>();
        this.f2640c = 0;
        Object obj = f2637k;
        this.f2643f = obj;
        this.f2647j = new a();
        this.f2642e = obj;
        this.f2644g = -1;
    }

    public LiveData(T t10) {
        this.f2638a = new Object();
        this.f2639b = new n.b<>();
        this.f2640c = 0;
        this.f2643f = f2637k;
        this.f2647j = new a();
        this.f2642e = t10;
        this.f2644g = 0;
    }

    public static void a(String str) {
        boolean z10;
        m.a.C().f20150c.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2652b) {
            if (!cVar.f()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f2653c;
            int i11 = this.f2644g;
            if (i10 >= i11) {
                return;
            }
            cVar.f2653c = i11;
            cVar.f2651a.a((Object) this.f2642e);
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f2645h) {
            this.f2646i = true;
            return;
        }
        this.f2645h = true;
        do {
            this.f2646i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                n.b<b0<? super T>, LiveData<T>.c> bVar = this.f2639b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f21898c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2646i) {
                        break;
                    }
                }
            }
        } while (this.f2646i);
        this.f2645h = false;
    }

    public T d() {
        T t10 = (T) this.f2642e;
        if (t10 != f2637k) {
            return t10;
        }
        return null;
    }

    public final void e(u uVar, b0<? super T> b0Var) {
        a("observe");
        if (uVar.a0().f2790c == k.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(uVar, b0Var);
        LiveData<T>.c e10 = this.f2639b.e(b0Var, lifecycleBoundObserver);
        if (e10 != null && !e10.e(uVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (e10 != null) {
            return;
        }
        uVar.a0().a(lifecycleBoundObserver);
    }

    public final void f(b0<? super T> b0Var) {
        a("observeForever");
        b bVar = new b(this, b0Var);
        LiveData<T>.c e10 = this.f2639b.e(b0Var, bVar);
        if (e10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (e10 != null) {
            return;
        }
        bVar.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(b0<? super T> b0Var) {
        a("removeObserver");
        LiveData<T>.c f10 = this.f2639b.f(b0Var);
        if (f10 == null) {
            return;
        }
        f10.b();
        f10.a(false);
    }

    public void j(T t10) {
        a("setValue");
        this.f2644g++;
        this.f2642e = t10;
        c(null);
    }
}
