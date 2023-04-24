package f3;

import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a */
    public UUID f14112a;

    /* renamed from: b */
    public o3.p f14113b;

    /* renamed from: c */
    public Set<String> f14114c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* renamed from: c */
        public o3.p f14117c;

        /* renamed from: a */
        public boolean f14115a = false;

        /* renamed from: d */
        public HashSet f14118d = new HashSet();

        /* renamed from: b */
        public UUID f14116b = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f14117c = new o3.p(this.f14116b.toString(), cls.getName());
            this.f14118d.add(cls.getName());
            c();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x001d, code lost:
            if (r5 == false) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final W a() {
            /*
                r6 = this;
                f3.u r0 = r6.b()
                o3.p r1 = r6.f14117c
                f3.c r1 = r1.f22634j
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 1
                r4 = 0
                r5 = 24
                if (r2 < r5) goto L1f
                f3.d r5 = r1.f14073h
                java.util.HashSet r5 = r5.f14076a
                int r5 = r5.size()
                if (r5 <= 0) goto L1c
                r5 = 1
                goto L1d
            L1c:
                r5 = 0
            L1d:
                if (r5 != 0) goto L31
            L1f:
                boolean r5 = r1.f14069d
                if (r5 != 0) goto L31
                boolean r5 = r1.f14067b
                if (r5 != 0) goto L31
                r5 = 23
                if (r2 < r5) goto L30
                boolean r1 = r1.f14068c
                if (r1 == 0) goto L30
                goto L31
            L30:
                r3 = 0
            L31:
                o3.p r1 = r6.f14117c
                boolean r2 = r1.f22641q
                if (r2 == 0) goto L52
                if (r3 != 0) goto L4a
                long r1 = r1.f22631g
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L42
                goto L52
            L42:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs cannot be delayed"
                r0.<init>(r1)
                throw r0
            L4a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L52:
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r6.f14116b = r1
                o3.p r1 = new o3.p
                o3.p r2 = r6.f14117c
                r1.<init>(r2)
                r6.f14117c = r1
                java.util.UUID r2 = r6.f14116b
                java.lang.String r2 = r2.toString()
                r1.f22625a = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.u.a.a():f3.u");
        }

        public abstract W b();

        public abstract B c();

        public final a d(int i10, long j10, TimeUnit timeUnit) {
            this.f14115a = true;
            o3.p pVar = this.f14117c;
            pVar.f22636l = i10;
            long millis = timeUnit.toMillis(j10);
            if (millis > 18000000) {
                m.c().f(o3.p.f22624s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
                millis = 18000000;
            }
            if (millis < 10000) {
                m.c().f(o3.p.f22624s, "Backoff delay duration less than minimum value", new Throwable[0]);
                millis = 10000;
            }
            pVar.f22637m = millis;
            return c();
        }

        public final B e(long j10, TimeUnit timeUnit) {
            this.f14117c.f22631g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f14117c.f22631g) {
                return c();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public u(UUID uuid, o3.p pVar, HashSet hashSet) {
        this.f14112a = uuid;
        this.f14113b = pVar;
        this.f14114c = hashSet;
    }
}
