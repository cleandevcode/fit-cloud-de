package sm;

import a0.a2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class e1 implements b1 {

    /* renamed from: a */
    public final long f27162a;

    /* renamed from: b */
    public final long f27163b;

    @zl.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.q<g<? super z0>, Integer, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f27164e;

        /* renamed from: f */
        public /* synthetic */ g f27165f;

        /* renamed from: g */
        public /* synthetic */ int f27166g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(3, dVar);
            e1.this = r1;
        }

        @Override // fm.q
        public final Object j(g<? super z0> gVar, Integer num, xl.d<? super tl.l> dVar) {
            int intValue = num.intValue();
            a aVar = new a(dVar);
            aVar.f27165f = gVar;
            aVar.f27166g = intValue;
            return aVar.t(tl.l.f28297a);
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x007d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008b A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r10) {
            /*
                r9 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r9.f27164e
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L30
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L30
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                sm.g r1 = r9.f27165f
                mf.a0.k(r10)
                goto L7e
            L24:
                sm.g r1 = r9.f27165f
                mf.a0.k(r10)
                goto L6f
            L2a:
                sm.g r1 = r9.f27165f
                mf.a0.k(r10)
                goto L58
            L30:
                mf.a0.k(r10)
                goto L8c
            L34:
                mf.a0.k(r10)
                sm.g r10 = r9.f27165f
                int r1 = r9.f27166g
                if (r1 <= 0) goto L48
                sm.z0 r1 = sm.z0.START
                r9.f27164e = r6
                java.lang.Object r10 = r10.n(r1, r9)
                if (r10 != r0) goto L8c
                return r0
            L48:
                sm.e1 r1 = sm.e1.this
                long r6 = r1.f27162a
                r9.f27165f = r10
                r9.f27164e = r5
                java.lang.Object r1 = mf.a0.g(r6, r9)
                if (r1 != r0) goto L57
                return r0
            L57:
                r1 = r10
            L58:
                sm.e1 r10 = sm.e1.this
                long r5 = r10.f27163b
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L7e
                sm.z0 r10 = sm.z0.STOP
                r9.f27165f = r1
                r9.f27164e = r4
                java.lang.Object r10 = r1.n(r10, r9)
                if (r10 != r0) goto L6f
                return r0
            L6f:
                sm.e1 r10 = sm.e1.this
                long r4 = r10.f27163b
                r9.f27165f = r1
                r9.f27164e = r3
                java.lang.Object r10 = mf.a0.g(r4, r9)
                if (r10 != r0) goto L7e
                return r0
            L7e:
                sm.z0 r10 = sm.z0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f27165f = r3
                r9.f27164e = r2
                java.lang.Object r10 = r1.n(r10, r9)
                if (r10 != r0) goto L8c
                return r0
            L8c:
                tl.l r10 = tl.l.f28297a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: sm.e1.a.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<z0, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f27168e;

        public b(xl.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(z0 z0Var, xl.d<? super Boolean> dVar) {
            return ((b) p(z0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f27168e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            return Boolean.valueOf(((z0) this.f27168e) != z0.START);
        }
    }

    public e1(long j10, long j11) {
        this.f27162a = j10;
        this.f27163b = j11;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // sm.b1
    public final f<z0> a(f1<Integer> f1Var) {
        return bi.r.t(new v(new b(null), bi.r.O(f1Var, new a(null))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            if (this.f27162a == e1Var.f27162a && this.f27163b == e1Var.f27163b) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        long j10 = this.f27162a;
        long j11 = this.f27163b;
        return (((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        vl.a aVar = new vl.a(2);
        if (this.f27162a > 0) {
            StringBuilder a10 = android.support.v4.media.d.a("stopTimeout=");
            a10.append(this.f27162a);
            a10.append("ms");
            aVar.add(a10.toString());
        }
        if (this.f27163b < Long.MAX_VALUE) {
            StringBuilder a11 = android.support.v4.media.d.a("replayExpiration=");
            a11.append(this.f27163b);
            a11.append("ms");
            aVar.add(a11.toString());
        }
        h7.a.g(aVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SharingStarted.WhileSubscribed(");
        return a2.a(sb2, ul.q.M(aVar, null, null, null, null, 63), ')');
    }
}
