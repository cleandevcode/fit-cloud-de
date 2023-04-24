package yk;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final f f31786a = new f();

    /* renamed from: b */
    public static final e f31787b = new e();

    /* renamed from: c */
    public static final c f31788c = new c();

    /* renamed from: d */
    public static final d f31789d = new d();

    /* renamed from: e */
    public static final h f31790e = new h();

    /* renamed from: f */
    public static final i f31791f = new i();

    /* renamed from: yk.a$a */
    /* loaded from: classes2.dex */
    public static final class C0601a<T> implements wk.d<T> {

        /* renamed from: a */
        public final wk.a f31792a;

        public C0601a(wk.a aVar) {
            this.f31792a = aVar;
        }

        @Override // wk.d
        public final void accept(T t10) {
            this.f31792a.run();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, U> implements wk.e<T, U> {

        /* renamed from: a */
        public final Class<U> f31793a = byte[].class;

        @Override // wk.e
        public final U apply(T t10) {
            return this.f31793a.cast(t10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements wk.a {
        @Override // wk.a
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements wk.d<Object> {
        @Override // wk.d
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements wk.e<Object, Object> {
        @Override // wk.e
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<T, U> implements Callable<U>, wk.g<U>, wk.e<T, U> {

        /* renamed from: a */
        public final U f31794a;

        public g(U u10) {
            this.f31794a = u10;
        }

        @Override // wk.e
        public final U apply(T t10) {
            return this.f31794a;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f31794a;
        }

        @Override // wk.g
        public final U get() {
            return this.f31794a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements wk.d<Throwable> {
        @Override // wk.d
        public final void accept(Throwable th2) {
            ol.a.a(new vk.b(th2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements wk.f<Object> {
        @Override // wk.f
        public final boolean test(Object obj) {
            return true;
        }
    }
}
