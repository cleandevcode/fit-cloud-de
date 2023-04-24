package ao;

import ao.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class e extends c.a {

    /* renamed from: a */
    public static final e f3804a = new e();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<R> implements ao.c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f3805a;

        @IgnoreJRERequirement
        /* renamed from: ao.e$a$a */
        /* loaded from: classes2.dex */
        public class C0042a implements d<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f3806a;

            public C0042a(b bVar) {
                this.f3806a = bVar;
            }

            @Override // ao.d
            public final void a(ao.b<R> bVar, b0<R> b0Var) {
                boolean z10;
                int i10 = b0Var.f3791a.f32532d;
                if (200 <= i10 && 299 >= i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f3806a.complete(b0Var.f3792b);
                } else {
                    this.f3806a.completeExceptionally(new i(b0Var));
                }
            }

            @Override // ao.d
            public final void b(ao.b<R> bVar, Throwable th2) {
                this.f3806a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f3805a = type;
        }

        @Override // ao.c
        public final Type a() {
            return this.f3805a;
        }

        @Override // ao.c
        public final Object b(s sVar) {
            b bVar = new b(sVar);
            sVar.q(new C0042a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        public final ao.b<?> f3807a;

        public b(s sVar) {
            this.f3807a = sVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f3807a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class c<R> implements ao.c<R, CompletableFuture<b0<R>>> {

        /* renamed from: a */
        public final Type f3808a;

        @IgnoreJRERequirement
        /* loaded from: classes2.dex */
        public class a implements d<R> {

            /* renamed from: a */
            public final CompletableFuture<b0<R>> f3809a;

            public a(b bVar) {
                this.f3809a = bVar;
            }

            @Override // ao.d
            public final void a(ao.b<R> bVar, b0<R> b0Var) {
                this.f3809a.complete(b0Var);
            }

            @Override // ao.d
            public final void b(ao.b<R> bVar, Throwable th2) {
                this.f3809a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f3808a = type;
        }

        @Override // ao.c
        public final Type a() {
            return this.f3808a;
        }

        @Override // ao.c
        public final Object b(s sVar) {
            b bVar = new b(sVar);
            sVar.q(new a(bVar));
            return bVar;
        }
    }

    @Override // ao.c.a
    public final ao.c a(Type type, Annotation[] annotationArr) {
        if (h0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = h0.e(0, (ParameterizedType) type);
            if (h0.f(e10) != b0.class) {
                return new a(e10);
            }
            if (e10 instanceof ParameterizedType) {
                return new c(h0.e(0, (ParameterizedType) e10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
