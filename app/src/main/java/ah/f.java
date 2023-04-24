package ah;

import fm.q;
import sm.g;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.wh.WomenHealthRepositoryImpl$special$$inlined$flatMapLatest$1", f = "WomenHealthRepository.kt", l = {219, 190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends i implements q<g<? super gg.b>, Long, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f516e;

    /* renamed from: f */
    public /* synthetic */ g f517f;

    /* renamed from: g */
    public /* synthetic */ Object f518g;

    /* renamed from: h */
    public final /* synthetic */ e f519h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, xl.d dVar) {
        super(3, dVar);
        this.f519h = eVar;
    }

    @Override // fm.q
    public final Object j(g<? super gg.b> gVar, Long l10, xl.d<? super l> dVar) {
        f fVar = new f(this.f519h, dVar);
        fVar.f517f = gVar;
        fVar.f518g = l10;
        return fVar.t(l.f28297a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[RETURN] */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r10) {
        /*
            r9 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r9.f516e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L23
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            mf.a0.k(r10)
            goto L67
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            java.lang.Object r1 = r9.f518g
            java.lang.Long r1 = (java.lang.Long) r1
            sm.g r3 = r9.f517f
            mf.a0.k(r10)
            goto L4c
        L23:
            mf.a0.k(r10)
            sm.g r10 = r9.f517f
            java.lang.Object r1 = r9.f518g
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto L34
            sm.i r1 = new sm.i
            r1.<init>(r4)
            goto L5a
        L34:
            ah.e r5 = r9.f519h
            yg.u r5 = r5.f487d
            long r6 = r1.longValue()
            r9.f517f = r10
            r9.f518g = r1
            r9.f516e = r3
            tm.j r3 = r5.s(r6)
            if (r3 != r0) goto L49
            return r0
        L49:
            r8 = r3
            r3 = r10
            r10 = r8
        L4c:
            sm.f r10 = (sm.f) r10
            ah.c r5 = new ah.c
            ah.e r6 = r9.f519h
            r5.<init>(r4, r6, r1)
            tm.j r1 = bi.r.O(r10, r5)
            r10 = r3
        L5a:
            r9.f517f = r4
            r9.f518g = r4
            r9.f516e = r2
            java.lang.Object r10 = bi.r.v(r9, r1, r10)
            if (r10 != r0) goto L67
            return r0
        L67:
            tl.l r10 = tl.l.f28297a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.f.t(java.lang.Object):java.lang.Object");
    }
}
