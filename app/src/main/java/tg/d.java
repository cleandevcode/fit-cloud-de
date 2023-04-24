package tg;

import fm.q;
import gm.a0;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$flowUnreadMsgCount$$inlined$flatMapLatest$1", f = "FriendRepository.kt", l = {220, 190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements q<sm.g<? super Integer>, Long, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f28133e;

    /* renamed from: f */
    public /* synthetic */ sm.g f28134f;

    /* renamed from: g */
    public /* synthetic */ Object f28135g;

    /* renamed from: h */
    public final /* synthetic */ i f28136h;

    /* renamed from: i */
    public a0 f28137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, xl.d dVar) {
        super(3, dVar);
        this.f28136h = iVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super Integer> gVar, Long l10, xl.d<? super l> dVar) {
        d dVar2 = new d(this.f28136h, dVar);
        dVar2.f28134f = gVar;
        dVar2.f28135g = l10;
        return dVar2.t(l.f28297a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[RETURN] */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r11) {
        /*
            r10 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r10.f28133e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            mf.a0.k(r11)
            goto L99
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            gm.a0 r1 = r10.f28137i
            java.lang.Object r3 = r10.f28135g
            java.lang.Long r3 = (java.lang.Long) r3
            sm.g r5 = r10.f28134f
            mf.a0.k(r11)
            goto L5b
        L26:
            mf.a0.k(r11)
            sm.g r5 = r10.f28134f
            java.lang.Object r11 = r10.f28135g
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L7e
            long r6 = r11.longValue()
            boolean r1 = hh.b.f(r6)
            if (r1 == 0) goto L3c
            goto L7e
        L3c:
            gm.a0 r1 = new gm.a0
            r1.<init>()
            tg.i r6 = r10.f28136h
            yg.u r6 = r6.f28150e
            long r7 = r11.longValue()
            r10.f28134f = r5
            r10.f28135g = r11
            r10.f28137i = r1
            r10.f28133e = r3
            tm.j r3 = r6.r(r7)
            if (r3 != r0) goto L58
            return r0
        L58:
            r9 = r3
            r3 = r11
            r11 = r9
        L5b:
            sm.f r11 = (sm.f) r11
            tg.e r6 = new tg.e
            tg.i r7 = r10.f28136h
            r6.<init>(r1, r7, r3, r4)
            sm.o r3 = new sm.o
            r3.<init>(r6, r11)
            tg.f r11 = new tg.f
            r11.<init>(r4)
            sm.k0 r6 = new sm.k0
            r6.<init>(r11, r3)
            tg.g r11 = new tg.g
            r11.<init>(r1, r4)
            sm.n r1 = new sm.n
            r1.<init>(r6, r11)
            goto L8a
        L7e:
            r11 = 0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r11)
            sm.i r11 = new sm.i
            r11.<init>(r1)
            r1 = r11
        L8a:
            r10.f28134f = r4
            r10.f28135g = r4
            r10.f28137i = r4
            r10.f28133e = r2
            java.lang.Object r11 = bi.r.v(r10, r1, r5)
            if (r11 != r0) goto L99
            return r0
        L99:
            tl.l r11 = tl.l.f28297a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.t(java.lang.Object):java.lang.Object");
    }
}
