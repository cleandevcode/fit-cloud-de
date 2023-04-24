package ih;

import com.topstep.fitcloud.pro.ui.DeviceViewModel;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceViewModel$deviceReset$1", f = "DeviceFragment.kt", l = {582, 584, 586, 588}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16831e;

    /* renamed from: f */
    public /* synthetic */ Object f16832f;

    /* renamed from: g */
    public final /* synthetic */ DeviceViewModel f16833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeviceViewModel deviceViewModel, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f16833g = deviceViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e eVar = new e(this.f16833g, dVar);
        eVar.f16832f = obj;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009d  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f16831e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            mf.a0.k(r8)
            goto Lad
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.f16832f
            tl.g r1 = (tl.g) r1
            mf.a0.k(r8)
            goto L93
        L27:
            mf.a0.k(r8)     // Catch: java.lang.Throwable -> L68
            goto L65
        L2b:
            java.lang.Object r1 = r7.f16832f
            pm.e0 r1 = (pm.e0) r1
            mf.a0.k(r8)
            goto L55
        L33:
            mf.a0.k(r8)
            java.lang.Object r8 = r7.f16832f
            pm.e0 r8 = (pm.e0) r8
            com.topstep.fitcloud.pro.ui.DeviceViewModel r1 = r7.f16833g
            java.lang.Object r6 = r1.e()
            ih.g r6 = (ih.g) r6
            r6.getClass()
            ih.g r6 = new ih.g
            r6.<init>(r5)
            r7.f16832f = r8
            r7.f16831e = r5
            tl.l r8 = r1.g(r6)
            if (r8 != r0) goto L55
            return r0
        L55:
            com.topstep.fitcloud.pro.ui.DeviceViewModel r8 = r7.f16833g
            og.t r8 = r8.f10182h     // Catch: java.lang.Throwable -> L68
            r1 = 0
            r7.f16832f = r1     // Catch: java.lang.Throwable -> L68
            r7.f16831e = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r8 = r8.v(r7)     // Catch: java.lang.Throwable -> L68
            if (r8 != r0) goto L65
            return r0
        L65:
            tl.l r8 = tl.l.f28297a     // Catch: java.lang.Throwable -> L68
            goto L72
        L68:
            r8 = move-exception
            do.a$b r1 = p000do.a.f13275a
            r1.q(r8)
            tl.g$a r8 = mf.a0.f(r8)
        L72:
            tl.g r1 = new tl.g
            r1.<init>(r8)
            com.topstep.fitcloud.pro.ui.DeviceViewModel r8 = r7.f16833g
            java.lang.Object r4 = r8.e()
            ih.g r4 = (ih.g) r4
            r5 = 0
            r4.getClass()
            ih.g r4 = new ih.g
            r4.<init>(r5)
            r7.f16832f = r1
            r7.f16831e = r3
            tl.l r8 = r8.g(r4)
            if (r8 != r0) goto L93
            return r0
        L93:
            java.lang.Object r8 = r1.f28288a
            com.topstep.fitcloud.pro.ui.DeviceViewModel r1 = r7.f16833g
            java.lang.Throwable r3 = tl.g.a(r8)
            if (r3 == 0) goto Lad
            ih.d$a r4 = new ih.d$a
            r4.<init>(r3)
            r7.f16832f = r8
            r7.f16831e = r2
            java.lang.Object r8 = r1.f(r4, r7)
            if (r8 != r0) goto Lad
            return r0
        Lad:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.e.t(java.lang.Object):java.lang.Object");
    }
}
