package cl;

import bi.z0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nl.h;
import tk.r;
import tk.t;
import wk.e;
import yk.a;

/* loaded from: classes2.dex */
public final class c<T, R> extends cl.a<T, R> {

    /* renamed from: c */
    public final e<? super T, ? extends t<? extends R>> f4934c;

    /* renamed from: d */
    public final boolean f4935d;

    /* renamed from: e */
    public final int f4936e;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicInteger implements tk.e<T>, xn.b {

        /* renamed from: a */
        public final xn.a<? super R> f4937a;

        /* renamed from: b */
        public final boolean f4938b;

        /* renamed from: c */
        public final int f4939c;

        /* renamed from: h */
        public final e<? super T, ? extends t<? extends R>> f4944h;

        /* renamed from: j */
        public xn.b f4946j;

        /* renamed from: k */
        public volatile boolean f4947k;

        /* renamed from: d */
        public final AtomicLong f4940d = new AtomicLong();

        /* renamed from: e */
        public final uk.b f4941e = new uk.b();

        /* renamed from: g */
        public final kl.b f4943g = new kl.b();

        /* renamed from: f */
        public final AtomicInteger f4942f = new AtomicInteger(1);

        /* renamed from: i */
        public final AtomicReference<h<R>> f4945i = new AtomicReference<>();

        /* renamed from: cl.c$a$a */
        /* loaded from: classes2.dex */
        public final class C0078a extends AtomicReference<uk.c> implements r<R>, uk.c {
            public C0078a() {
                a.this = r1;
            }

            @Override // tk.r, tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // uk.c
            public final void c() {
                xk.b.a(this);
            }

            @Override // tk.r, tk.b, tk.g
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f4941e.d(this);
                if (aVar.f4943g.c(th2)) {
                    if (!aVar.f4938b) {
                        aVar.f4946j.cancel();
                        aVar.f4941e.c();
                    } else if (aVar.f4939c != Integer.MAX_VALUE) {
                        aVar.f4946j.g(1L);
                    }
                    aVar.f4942f.decrementAndGet();
                    aVar.e();
                }
            }

            @Override // tk.r, tk.g
            public final void onSuccess(R r10) {
                a aVar = a.this;
                aVar.f4941e.d(this);
                if (aVar.get() == 0) {
                    boolean z10 = false;
                    if (aVar.compareAndSet(0, 1)) {
                        if (aVar.f4942f.decrementAndGet() == 0) {
                            z10 = true;
                        }
                        if (aVar.f4940d.get() != 0) {
                            aVar.f4937a.b(r10);
                            h<R> hVar = aVar.f4945i.get();
                            if (z10 && (hVar == null || hVar.isEmpty())) {
                                aVar.f4943g.g(aVar.f4937a);
                                return;
                            }
                            z0.l(aVar.f4940d, 1L);
                            if (aVar.f4939c != Integer.MAX_VALUE) {
                                aVar.f4946j.g(1L);
                            }
                        } else {
                            h<R> h10 = aVar.h();
                            synchronized (h10) {
                                h10.offer(r10);
                            }
                        }
                        if (aVar.decrementAndGet() == 0) {
                            return;
                        }
                        aVar.f();
                    }
                }
                h<R> h11 = aVar.h();
                synchronized (h11) {
                    h11.offer(r10);
                }
                aVar.f4942f.decrementAndGet();
                if (aVar.getAndIncrement() != 0) {
                    return;
                }
                aVar.f();
            }
        }

        public a(xn.a<? super R> aVar, e<? super T, ? extends t<? extends R>> eVar, boolean z10, int i10) {
            this.f4937a = aVar;
            this.f4944h = eVar;
            this.f4938b = z10;
            this.f4939c = i10;
        }

        @Override // xn.a
        public final void a(xn.b bVar) {
            if (jl.b.c(this.f4946j, bVar)) {
                this.f4946j = bVar;
                this.f4937a.a(this);
                int i10 = this.f4939c;
                bVar.g(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        @Override // xn.a
        public final void b(T t10) {
            try {
                t<? extends R> apply = this.f4944h.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                t<? extends R> tVar = apply;
                this.f4942f.getAndIncrement();
                C0078a c0078a = new C0078a();
                if (this.f4947k || !this.f4941e.b(c0078a)) {
                    return;
                }
                tVar.c(c0078a);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f4946j.cancel();
                onError(th2);
            }
        }

        public final void c() {
            h<R> hVar = this.f4945i.get();
            if (hVar != null) {
                hVar.clear();
            }
        }

        @Override // xn.b
        public final void cancel() {
            this.f4947k = true;
            this.f4946j.cancel();
            this.f4941e.c();
            this.f4943g.d();
        }

        public final void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:109:0x006b, code lost:
            if (r13 != 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x006f, code lost:
            if (r17.f4947k == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0071, code lost:
            c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0074, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0077, code lost:
            if (r17.f4938b != false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0081, code lost:
            if (r17.f4943g.get() == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x0083, code lost:
            c();
            r17.f4943g.g(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x008b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0090, code lost:
            if (r2.get() != 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0092, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0094, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0095, code lost:
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x009b, code lost:
            if (r7 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x00a1, code lost:
            if (r7.isEmpty() == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x00a3, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x00a4, code lost:
            if (r6 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x00a6, code lost:
            if (r12 == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x00a8, code lost:
            r17.f4943g.g(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x00ad, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x00b0, code lost:
            if (r10 == 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x00b2, code lost:
            bi.z0.l(r17.f4940d, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x00bc, code lost:
            if (r17.f4939c == Integer.MAX_VALUE) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x00be, code lost:
            r17.f4946j.g(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x00c3, code lost:
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f() {
            /*
                r17 = this;
                r0 = r17
                xn.a<? super R> r1 = r0.f4937a
                java.util.concurrent.atomic.AtomicInteger r2 = r0.f4942f
                java.util.concurrent.atomic.AtomicReference<nl.h<R>> r3 = r0.f4945i
                r4 = 1
                r5 = 1
            La:
                java.util.concurrent.atomic.AtomicLong r6 = r0.f4940d
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L13:
                r12 = 0
                int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r13 == 0) goto L6b
                boolean r14 = r0.f4947k
                if (r14 == 0) goto L20
                r17.c()
                return
            L20:
                boolean r14 = r0.f4938b
                if (r14 != 0) goto L39
                kl.b r14 = r0.f4943g
                java.lang.Object r14 = r14.get()
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto L39
                r17.c()
                kl.b r1 = r0.f4943g
                xn.a<? super R> r2 = r0.f4937a
                r1.g(r2)
                return
            L39:
                int r14 = r2.get()
                if (r14 != 0) goto L41
                r14 = 1
                goto L42
            L41:
                r14 = 0
            L42:
                java.lang.Object r15 = r3.get()
                nl.h r15 = (nl.h) r15
                if (r15 == 0) goto L4f
                java.lang.Object r15 = r15.poll()
                goto L50
            L4f:
                r15 = 0
            L50:
                if (r15 != 0) goto L55
                r16 = 1
                goto L57
            L55:
                r16 = 0
            L57:
                if (r14 == 0) goto L61
                if (r16 == 0) goto L61
                kl.b r2 = r0.f4943g
                r2.g(r1)
                return
            L61:
                if (r16 == 0) goto L64
                goto L6b
            L64:
                r1.b(r15)
                r12 = 1
                long r10 = r10 + r12
                goto L13
            L6b:
                if (r13 != 0) goto Lae
                boolean r6 = r0.f4947k
                if (r6 == 0) goto L75
                r17.c()
                return
            L75:
                boolean r6 = r0.f4938b
                if (r6 != 0) goto L8c
                kl.b r6 = r0.f4943g
                java.lang.Object r6 = r6.get()
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 == 0) goto L8c
                r17.c()
                kl.b r2 = r0.f4943g
                r2.g(r1)
                return
            L8c:
                int r6 = r2.get()
                if (r6 != 0) goto L94
                r6 = 1
                goto L95
            L94:
                r6 = 0
            L95:
                java.lang.Object r7 = r3.get()
                nl.h r7 = (nl.h) r7
                if (r7 == 0) goto La3
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto La4
            La3:
                r12 = 1
            La4:
                if (r6 == 0) goto Lae
                if (r12 == 0) goto Lae
                kl.b r2 = r0.f4943g
                r2.g(r1)
                return
            Lae:
                int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r6 == 0) goto Lc3
                java.util.concurrent.atomic.AtomicLong r6 = r0.f4940d
                bi.z0.l(r6, r10)
                int r6 = r0.f4939c
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r6 == r7) goto Lc3
                xn.b r6 = r0.f4946j
                r6.g(r10)
            Lc3:
                int r5 = -r5
                int r5 = r0.addAndGet(r5)
                if (r5 != 0) goto La
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.c.a.f():void");
        }

        @Override // xn.b
        public final void g(long j10) {
            if (jl.b.a(j10)) {
                z0.b(this.f4940d, j10);
                e();
            }
        }

        public final h<R> h() {
            boolean z10;
            h<R> hVar = this.f4945i.get();
            if (hVar != null) {
                return hVar;
            }
            h<R> hVar2 = new h<>(tk.d.f28269a);
            AtomicReference<h<R>> atomicReference = this.f4945i;
            while (true) {
                if (atomicReference.compareAndSet(null, hVar2)) {
                    z10 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return hVar2;
            }
            return this.f4945i.get();
        }

        @Override // xn.a
        public final void onComplete() {
            this.f4942f.decrementAndGet();
            e();
        }

        @Override // xn.a
        public final void onError(Throwable th2) {
            this.f4942f.decrementAndGet();
            if (this.f4943g.c(th2)) {
                if (!this.f4938b) {
                    this.f4941e.c();
                }
                e();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar);
        a.f fVar = yk.a.f31786a;
        this.f4934c = fVar;
        this.f4935d = false;
        this.f4936e = Integer.MAX_VALUE;
    }

    @Override // tk.d
    public final void b(xn.a<? super R> aVar) {
        this.f4924b.a(new a(aVar, this.f4934c, this.f4935d, this.f4936e));
    }
}
