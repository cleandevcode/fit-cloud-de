package tg;

import fm.p;
import pm.e0;
import tl.l;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$refreshTimer$1", f = "FriendRepository.kt", l = {175, 184, 190, 207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public long f28168e;

    /* renamed from: f */
    public int f28169f;

    /* renamed from: g */
    public /* synthetic */ Object f28170g;

    /* renamed from: h */
    public final /* synthetic */ i f28171h;

    /* renamed from: i */
    public final /* synthetic */ long f28172i;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.friend.FriendRepositoryImpl$refreshTimer$1$1", f = "FriendRepository.kt", l = {192, 201, 202}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f28173e;

        /* renamed from: f */
        public final /* synthetic */ i f28174f;

        /* renamed from: g */
        public final /* synthetic */ long f28175g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, long j10, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28174f = iVar;
            this.f28175g = j10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f28174f, this.f28175g, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x0051, code lost:
            r11 = r11.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0059, code lost:
            if (r11.hasNext() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0063, code lost:
            if (((com.topstep.fitcloud.pro.model.friend.FriendMsg) r11.next()).f9680f != 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0065, code lost:
            r1 = r1 + 1;
         */
        /* JADX WARN: Removed duplicated region for block: B:91:0x008a A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r11) {
            /*
                r10 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r10.f28173e
                r2 = 1
                r3 = 3
                r4 = 2
                if (r1 == 0) goto L24
                if (r1 == r2) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                mf.a0.k(r11)     // Catch: java.lang.Exception -> L8b
                goto L96
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                mf.a0.k(r11)     // Catch: java.lang.Exception -> L8b
                goto L77
            L20:
                mf.a0.k(r11)     // Catch: java.lang.Exception -> L8b
                goto L36
            L24:
                mf.a0.k(r11)
                tg.i r11 = r10.f28174f     // Catch: java.lang.Exception -> L8b
                vg.d r11 = r11.f28148c     // Catch: java.lang.Exception -> L8b
                long r5 = r10.f28175g     // Catch: java.lang.Exception -> L8b
                r10.f28173e = r2     // Catch: java.lang.Exception -> L8b
                java.lang.Object r11 = r11.Y(r5, r10)     // Catch: java.lang.Exception -> L8b
                if (r11 != r0) goto L36
                return r0
            L36:
                vg.i r11 = (vg.i) r11     // Catch: java.lang.Exception -> L8b
                java.util.List r11 = r11.a()     // Catch: java.lang.Exception -> L8b
                if (r11 == 0) goto L43
                java.util.ArrayList r11 = ul.q.Z(r11)     // Catch: java.lang.Exception -> L8b
                goto L44
            L43:
                r11 = 0
            L44:
                r1 = 0
                if (r11 == 0) goto L4f
                boolean r5 = r11.isEmpty()     // Catch: java.lang.Exception -> L8b
                if (r5 == 0) goto L4e
                goto L4f
            L4e:
                r2 = 0
            L4f:
                if (r2 != 0) goto L68
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L8b
            L55:
                boolean r2 = r11.hasNext()     // Catch: java.lang.Exception -> L8b
                if (r2 == 0) goto L68
                java.lang.Object r2 = r11.next()     // Catch: java.lang.Exception -> L8b
                com.topstep.fitcloud.pro.model.friend.FriendMsg r2 = (com.topstep.fitcloud.pro.model.friend.FriendMsg) r2     // Catch: java.lang.Exception -> L8b
                int r2 = r2.f9680f     // Catch: java.lang.Exception -> L8b
                if (r2 != 0) goto L55
                int r1 = r1 + 1
                goto L55
            L68:
                tg.i r11 = r10.f28174f     // Catch: java.lang.Exception -> L8b
                yg.u r11 = r11.f28150e     // Catch: java.lang.Exception -> L8b
                long r5 = r10.f28175g     // Catch: java.lang.Exception -> L8b
                r10.f28173e = r4     // Catch: java.lang.Exception -> L8b
                java.lang.Object r11 = r11.t(r5, r1, r10)     // Catch: java.lang.Exception -> L8b
                if (r11 != r0) goto L77
                return r0
            L77:
                tg.i r11 = r10.f28174f     // Catch: java.lang.Exception -> L8b
                yg.u r4 = r11.f28150e     // Catch: java.lang.Exception -> L8b
                long r5 = r10.f28175g     // Catch: java.lang.Exception -> L8b
                long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L8b
                r10.f28173e = r3     // Catch: java.lang.Exception -> L8b
                r9 = r10
                java.lang.Object r11 = r4.p(r5, r7, r9)     // Catch: java.lang.Exception -> L8b
                if (r11 != r0) goto L96
                return r0
            L8b:
                r11 = move-exception
                do.a$b r0 = p000do.a.f13275a
                java.lang.String r1 = "FriendRepository"
                r0.t(r1)
                r0.q(r11)
            L96:
                tl.l r11 = tl.l.f28297a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.j.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, long j10, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f28171h = iVar;
        this.f28172i = j10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((j) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        j jVar = new j(this.f28171h, this.f28172i, dVar);
        jVar.f28170g = obj;
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4  */
    /* JADX WARN: Type inference failed for: r1v10, types: [pm.e0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7, types: [pm.e0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x00d1 -> B:84:0x00ac). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.j.t(java.lang.Object):java.lang.Object");
    }
}
