package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$flowState$2", f = "DeviceManager.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends zl.i implements fm.r<wf.a, Boolean, wf.b, xl.d<? super wf.b>, Object> {

    /* renamed from: e */
    public int f23387e;

    /* renamed from: f */
    public /* synthetic */ wf.a f23388f;

    /* renamed from: g */
    public /* synthetic */ Boolean f23389g;

    /* renamed from: h */
    public /* synthetic */ wf.b f23390h;

    /* renamed from: i */
    public final /* synthetic */ d0 f23391i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d0 d0Var, xl.d<? super k0> dVar) {
        super(4, dVar);
        this.f23391i = d0Var;
    }

    @Override // fm.r
    public final Object s(wf.a aVar, Boolean bool, wf.b bVar, xl.d<? super wf.b> dVar) {
        k0 k0Var = new k0(this.f23391i, dVar);
        k0Var.f23388f = aVar;
        k0Var.f23389g = bool;
        k0Var.f23390h = bVar;
        return k0Var.t(tl.l.f28297a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r6) {
        /*
            r5 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r5.f23387e
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            wf.b r0 = r5.f23390h
            java.lang.Boolean r1 = r5.f23389g
            wf.a r2 = r5.f23388f
            mf.a0.k(r6)
            goto L41
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            mf.a0.k(r6)
            wf.a r6 = r5.f23388f
            java.lang.Boolean r1 = r5.f23389g
            wf.b r3 = r5.f23390h
            if (r6 == 0) goto L43
            boolean r4 = r6.f29804c
            if (r4 == 0) goto L43
            wf.b r4 = wf.b.CONNECTED
            if (r3 != r4) goto L43
            og.d0 r4 = r5.f23391i
            r5.f23388f = r6
            r5.f23389g = r1
            r5.f23390h = r3
            r5.f23387e = r2
            java.lang.Object r2 = og.d0.P(r4, r6, r5)
            if (r2 != r0) goto L3f
            return r0
        L3f:
            r2 = r6
            r0 = r3
        L41:
            r3 = r0
            r6 = r2
        L43:
            java.lang.String r0 = "isAdapterEnabled"
            gm.l.e(r1, r0)
            boolean r0 = r1.booleanValue()
            java.lang.String r1 = "connectorState"
            gm.l.e(r3, r1)
            if (r6 != 0) goto L56
            wf.b r3 = wf.b.NO_DEVICE
            goto L5a
        L56:
            if (r0 != 0) goto L5a
            wf.b r3 = wf.b.BT_DISABLED
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: og.k0.t(java.lang.Object):java.lang.Object");
    }
}
