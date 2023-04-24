package ao;

import a0.f1;
import ao.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h extends c.a {

    /* renamed from: a */
    public final Executor f3813a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements b<T> {

        /* renamed from: a */
        public final Executor f3814a;

        /* renamed from: b */
        public final b<T> f3815b;

        /* renamed from: ao.h$a$a */
        /* loaded from: classes2.dex */
        public class C0043a implements d<T> {

            /* renamed from: a */
            public final /* synthetic */ d f3816a;

            public C0043a(d dVar) {
                a.this = r1;
                this.f3816a = dVar;
            }

            @Override // ao.d
            public final void a(b<T> bVar, b0<T> b0Var) {
                a.this.f3814a.execute(new androidx.emoji2.text.g(this, this.f3816a, b0Var, 3));
            }

            @Override // ao.d
            public final void b(b<T> bVar, Throwable th2) {
                a.this.f3814a.execute(new f1(this, this.f3816a, th2, 2));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f3814a = executor;
            this.f3815b = bVar;
        }

        @Override // ao.b
        public final void cancel() {
            this.f3815b.cancel();
        }

        @Override // ao.b
        /* renamed from: clone */
        public final b<T> m0clone() {
            return new a(this.f3814a, this.f3815b.clone());
        }

        @Override // ao.b
        public final b0<T> execute() {
            return this.f3815b.execute();
        }

        @Override // ao.b
        public final zm.w j() {
            return this.f3815b.j();
        }

        @Override // ao.b
        public final boolean k() {
            return this.f3815b.k();
        }

        @Override // ao.b
        public final void q(d<T> dVar) {
            this.f3815b.q(new C0043a(dVar));
        }
    }

    public h(Executor executor) {
        this.f3813a = executor;
    }

    @Override // ao.c.a
    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (h0.f(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = h0.e(0, (ParameterizedType) type);
            if (!h0.i(annotationArr, f0.class)) {
                executor = this.f3813a;
            }
            return new g(e10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
