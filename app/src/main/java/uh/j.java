package uh;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreateDialog$1$2$1$1", f = "DeviceConnectDialogFragment.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28782e;

    /* renamed from: f */
    public int f28783f;

    /* renamed from: g */
    public int f28784g;

    /* renamed from: h */
    public i f28785h;

    /* renamed from: i */
    public int f28786i;

    /* renamed from: j */
    public final /* synthetic */ i f28787j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f28787j = iVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new j(this.f28787j, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x0068). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r12) {
        /*
            r11 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r11.f28786i
            r2 = 2131952920(0x7f130518, float:1.9542296E38)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 != r4) goto L1a
            int r1 = r11.f28784g
            int r5 = r11.f28783f
            int r6 = r11.f28782e
            uh.i r7 = r11.f28785h
            mf.a0.k(r12)
            r12 = r11
            goto L68
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            mf.a0.k(r12)
            uh.i r12 = r11.f28787j
            og.t r12 = r12.j1()
            int r12 = r12.u()
            uh.i r1 = r11.f28787j
            com.topstep.fitcloud.pro.databinding.DialogDeviceConnectBinding r1 = r1.J0
            gm.l.c(r1)
            android.widget.TextView r1 = r1.tvState
            uh.i r5 = r11.f28787j
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            r6[r3] = r7
            java.lang.String r5 = r5.p0(r2, r6)
            r1.setText(r5)
            if (r12 <= 0) goto L85
            uh.i r1 = r11.f28787j
            r6 = r12
            r7 = r1
            r1 = 0
            r12 = r11
        L52:
            if (r1 >= r6) goto L85
            r8 = 1000(0x3e8, double:4.94E-321)
            r12.f28785h = r7
            r12.f28782e = r6
            r12.f28783f = r1
            r12.f28784g = r1
            r12.f28786i = r4
            java.lang.Object r5 = mf.a0.g(r8, r12)
            if (r5 != r0) goto L67
            return r0
        L67:
            r5 = r1
        L68:
            com.topstep.fitcloud.pro.databinding.DialogDeviceConnectBinding r8 = r7.J0
            gm.l.c(r8)
            android.widget.TextView r8 = r8.tvState
            java.lang.Object[] r9 = new java.lang.Object[r4]
            int r1 = r6 - r1
            int r1 = r1 - r4
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            r9[r3] = r10
            java.lang.String r1 = r7.p0(r2, r9)
            r8.setText(r1)
            int r1 = r5 + 1
            goto L52
        L85:
            tl.l r12 = tl.l.f28297a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.j.t(java.lang.Object):java.lang.Object");
    }
}
