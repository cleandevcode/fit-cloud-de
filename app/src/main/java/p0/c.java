package p0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p0.b;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        public Object f23753a;

        /* renamed from: b */
        public d<T> f23754b;

        /* renamed from: c */
        public p0.d<Void> f23755c = new p0.d<>();

        /* renamed from: d */
        public boolean f23756d;

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
            if (r6 != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(T r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f23756d = r0
                p0.c$d<T> r1 = r5.f23754b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L23
                p0.c$d$a r1 = r1.f23758b
                r1.getClass()
                if (r6 != 0) goto L12
                java.lang.Object r6 = p0.b.f23733g
            L12:
                p0.b$a r4 = p0.b.f23732f
                boolean r6 = r4.b(r1, r2, r6)
                if (r6 == 0) goto L1f
                p0.b.c(r1)
                r6 = 1
                goto L20
            L1f:
                r6 = 0
            L20:
                if (r6 == 0) goto L23
                goto L24
            L23:
                r0 = 0
            L24:
                if (r0 == 0) goto L2c
                r5.f23753a = r2
                r5.f23754b = r2
                r5.f23755c = r2
            L2c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.c.a.a(java.lang.Object):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
            if (r6 != false) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.lang.Throwable r6) {
            /*
                r5 = this;
                r0 = 1
                r5.f23756d = r0
                p0.c$d<T> r1 = r5.f23754b
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L27
                p0.c$d$a r1 = r1.f23758b
                r1.getClass()
                p0.b$c r4 = new p0.b$c
                r6.getClass()
                r4.<init>(r6)
                p0.b$a r6 = p0.b.f23732f
                boolean r6 = r6.b(r1, r2, r4)
                if (r6 == 0) goto L23
                p0.b.c(r1)
                r6 = 1
                goto L24
            L23:
                r6 = 0
            L24:
                if (r6 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 == 0) goto L30
                r5.f23753a = r2
                r5.f23754b = r2
                r5.f23755c = r2
            L30:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.c.a.b(java.lang.Throwable):boolean");
        }

        public final void finalize() {
            p0.d<Void> dVar;
            d<T> dVar2 = this.f23754b;
            if (dVar2 != null && !dVar2.isDone()) {
                StringBuilder a10 = android.support.v4.media.d.a("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                a10.append(this.f23753a);
                b bVar = new b(a10.toString());
                d.a aVar = dVar2.f23758b;
                aVar.getClass();
                if (p0.b.f23732f.b(aVar, null, new b.c(bVar))) {
                    p0.b.c(aVar);
                }
            }
            if (!this.f23756d && (dVar = this.f23755c) != null) {
                dVar.h(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: p0.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0425c<T> {
        String g(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements na.a<T> {

        /* renamed from: a */
        public final WeakReference<a<T>> f23757a;

        /* renamed from: b */
        public final a f23758b = new a();

        /* loaded from: classes.dex */
        public class a extends p0.b<T> {
            public a() {
                d.this = r1;
            }

            @Override // p0.b
            public final String f() {
                a<T> aVar = d.this.f23757a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder a10 = android.support.v4.media.d.a("tag=[");
                a10.append(aVar.f23753a);
                a10.append("]");
                return a10.toString();
            }
        }

        public d(a<T> aVar) {
            this.f23757a = new WeakReference<>(aVar);
        }

        @Override // na.a
        public final void a(Runnable runnable, Executor executor) {
            this.f23758b.a(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            a<T> aVar = this.f23757a.get();
            boolean cancel = this.f23758b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.f23753a = null;
                aVar.f23754b = null;
                aVar.f23755c.h(null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f23758b.get();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j10, TimeUnit timeUnit) {
            return this.f23758b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f23758b.f23734a instanceof b.C0424b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f23758b.isDone();
        }

        public final String toString() {
            return this.f23758b.toString();
        }
    }

    public static d a(InterfaceC0425c interfaceC0425c) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f23754b = dVar;
        aVar.f23753a = interfaceC0425c.getClass();
        try {
            String g10 = interfaceC0425c.g(aVar);
            if (g10 != null) {
                aVar.f23753a = g10;
            }
        } catch (Exception e10) {
            d.a aVar2 = dVar.f23758b;
            aVar2.getClass();
            if (p0.b.f23732f.b(aVar2, null, new b.c(e10))) {
                p0.b.c(aVar2);
            }
        }
        return dVar;
    }
}
