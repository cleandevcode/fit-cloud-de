package of;

import com.topstep.fitcloud.pro.MyApplication;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.MyApplication$initMainProcess$2", f = "MyApplication.kt", l = {92, 94, 95, 98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23214e;

    /* renamed from: f */
    public final /* synthetic */ MyApplication f23215f;

    @zl.e(c = "com.topstep.fitcloud.pro.MyApplication$initMainProcess$2$1", f = "MyApplication.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ MyApplication f23216e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MyApplication myApplication, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f23216e = myApplication;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f23216e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            MyApplication myApplication = this.f23216e;
            dk.a<sf.i> aVar = myApplication.f9538e;
            if (aVar != null) {
                myApplication.f9542i = aVar.get().f26939i;
                return tl.l.f28297a;
            }
            gm.l.l("coreMonitor");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MyApplication myApplication, xl.d<? super r> dVar) {
        super(2, dVar);
        this.f23215f = myApplication;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((r) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new r(this.f23215f, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0076  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r12) {
        /*
            r11 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r11.f23214e
            r2 = 1500(0x5dc, double:7.41E-321)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L2d
            if (r1 == r7) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            mf.a0.k(r12)
            goto L6a
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            mf.a0.k(r12)
            goto L61
        L25:
            mf.a0.k(r12)
            goto L4d
        L29:
            mf.a0.k(r12)
            goto L3b
        L2d:
            mf.a0.k(r12)
            r9 = 3000(0xbb8, double:1.482E-320)
            r11.f23214e = r7
            java.lang.Object r12 = mf.a0.g(r9, r11)
            if (r12 != r0) goto L3b
            return r0
        L3b:
            com.topstep.fitcloud.pro.MyApplication r12 = r11.f23215f
            dk.a<og.t> r12 = r12.f9537d
            if (r12 == 0) goto L7c
            r12.get()
            r11.f23214e = r6
            java.lang.Object r12 = mf.a0.g(r2, r11)
            if (r12 != r0) goto L4d
            return r0
        L4d:
            wm.c r12 = pm.o0.f24381a
            pm.p1 r12 = um.q.f28935a
            of.r$a r1 = new of.r$a
            com.topstep.fitcloud.pro.MyApplication r6 = r11.f23215f
            r1.<init>(r6, r8)
            r11.f23214e = r5
            java.lang.Object r12 = bi.z0.s(r11, r12, r1)
            if (r12 != r0) goto L61
            return r0
        L61:
            r11.f23214e = r4
            java.lang.Object r12 = mf.a0.g(r2, r11)
            if (r12 != r0) goto L6a
            return r0
        L6a:
            com.topstep.fitcloud.pro.MyApplication r12 = r11.f23215f
            dk.a<java.lang.Object> r12 = r12.f9539f
            if (r12 == 0) goto L76
            r12.get()
            tl.l r12 = tl.l.f28297a
            return r12
        L76:
            java.lang.String r12 = "workRepository"
            gm.l.l(r12)
            throw r8
        L7c:
            java.lang.String r12 = "deviceManager"
            gm.l.l(r12)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: of.r.t(java.lang.Object):java.lang.Object");
    }
}
