package mg;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jg.b;
import lg.d;

/* loaded from: classes2.dex */
public abstract class h1 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final UUID f21044a;

        /* renamed from: b */
        public final Date f21045b;

        public a(UUID uuid, Date date) {
            this.f21044a = uuid;
            this.f21045b = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return gm.l.a(this.f21044a, aVar.f21044a) && gm.l.a(this.f21045b, aVar.f21045b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21045b.hashCode() + (this.f21044a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SimpleEcgRecordEntity(ecgId=");
            a10.append(this.f21044a);
            a10.append(", time=");
            a10.append(this.f21045b);
            a10.append(')');
            return a10.toString();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.EcgDao", f = "EcgDao.kt", l = {68}, m = "saveRemoteData$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public h1 f21046d;

        /* renamed from: e */
        public Iterator f21047e;

        /* renamed from: f */
        public long f21048f;

        /* renamed from: g */
        public /* synthetic */ Object f21049g;

        /* renamed from: i */
        public int f21051i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            h1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f21049g = obj;
            this.f21051i |= Integer.MIN_VALUE;
            return h1.l(h1.this, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x008e -> B:35:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object l(mg.h1 r26, long r27, java.util.List<com.topstep.fitcloud.pro.model.data.SimpleEcgRecord> r29, xl.d<? super tl.l> r30) {
        /*
            r0 = r30
            boolean r1 = r0 instanceof mg.h1.b
            if (r1 == 0) goto L17
            r1 = r0
            mg.h1$b r1 = (mg.h1.b) r1
            int r2 = r1.f21051i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f21051i = r2
            r2 = r26
            goto L1e
        L17:
            mg.h1$b r1 = new mg.h1$b
            r2 = r26
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.f21049g
            yl.a r3 = yl.a.COROUTINE_SUSPENDED
            int r4 = r1.f21051i
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            long r6 = r1.f21048f
            java.util.Iterator r2 = r1.f21047e
            mg.h1 r4 = r1.f21046d
            mf.a0.k(r0)
            r0 = r2
            r2 = r4
        L34:
            r14 = r6
            goto L47
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            mf.a0.k(r0)
            java.util.Iterator r0 = r29.iterator()
            r14 = r27
        L47:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r0.next()
            com.topstep.fitcloud.pro.model.data.SimpleEcgRecord r4 = (com.topstep.fitcloud.pro.model.data.SimpleEcgRecord) r4
            rg.d r13 = new rg.d
            java.util.UUID r9 = r4.f9595a
            java.util.Date r10 = r4.f9596b
            r11 = 0
            r12 = 0
            r4 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 2
            r22 = 1016(0x3f8, float:1.424E-42)
            r6 = r13
            r7 = r14
            r23 = r13
            r13 = r4
            r24 = r14
            r14 = r16
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20)
            r1.f21046d = r2
            r1.f21047e = r0
            r6 = r24
            r1.f21048f = r6
            r1.f21051i = r5
            r4 = r23
            java.lang.Object r4 = r2.e(r4, r1)
            if (r4 != r3) goto L34
            return r3
        L91:
            tl.l r0 = tl.l.f28297a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h1.l(mg.h1, long, java.util.List, xl.d):java.lang.Object");
    }

    public abstract Object a(long j10, b.C0309b c0309b);

    public abstract sm.u0 b(long j10, Date date);

    public abstract Object c(rg.d dVar, xl.d<? super tl.l> dVar2);

    public abstract Object d(List<rg.d> list, xl.d<? super tl.l> dVar);

    public abstract Object e(rg.d dVar, b bVar);

    public abstract Object f(UUID uuid, zl.c cVar);

    public abstract Object g(long j10, Date date, d.k0 k0Var);

    public abstract Object h(long j10, Date date, d.v vVar);

    public Object i(long j10, List<rg.d> list, xl.d<? super tl.l> dVar) {
        Object d10 = d(list, dVar);
        return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
    }

    public Object j(long j10, EcgRecordBean ecgRecordBean, xl.d<? super tl.l> dVar) {
        Object c10 = c(new rg.d(j10, ecgRecordBean.f9903a, ecgRecordBean.f9904b, ecgRecordBean.f9905c, ecgRecordBean.f9906d, ecgRecordBean.f9907e, ecgRecordBean.f9908f, ecgRecordBean.f9909g, ecgRecordBean.f9910h, ecgRecordBean.f9911i, 1), dVar);
        if (c10 != yl.a.COROUTINE_SUSPENDED) {
            return tl.l.f28297a;
        }
        return c10;
    }

    public Object k(long j10, List<SimpleEcgRecord> list, xl.d<? super tl.l> dVar) {
        return l(this, j10, list, dVar);
    }

    public abstract Object m(UUID uuid, List list, d.t tVar);

    public abstract Object n(UUID uuid, zl.c cVar);
}
