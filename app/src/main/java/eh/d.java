package eh;

/* loaded from: classes2.dex */
public final class d extends dh.b<tl.l, String> {

    /* renamed from: b */
    public final jg.a f13639b;

    public d(wm.b bVar, jg.b bVar2) {
        super(bVar);
        this.f13639b = bVar2;
    }

    @Override // dh.b
    public final /* bridge */ /* synthetic */ Object a(tl.l lVar, xl.d<? super String> dVar) {
        return c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00be A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(xl.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof eh.c
            if (r0 == 0) goto L13
            r0 = r6
            eh.c r0 = (eh.c) r0
            int r1 = r0.f13638f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13638f = r1
            goto L18
        L13:
            eh.c r0 = new eh.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13636d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f13638f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            mf.a0.k(r6)
            jg.a r6 = r5.f13639b
            r0.f13638f = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lbe
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r0 == 0) goto L4f
            r0 = 0
            goto L5d
        L4f:
            java.lang.String r0 = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.matches()
        L5d:
            if (r0 != 0) goto Lb5
            java.lang.String r0 = " "
            boolean r2 = om.l.c0(r6, r0, r1)
            if (r2 == 0) goto Lb5
            om.c r2 = new om.c
            r2.<init>(r0)
            java.util.List r0 = r2.a(r6)
            int r2 = r0.size()
            r4 = 2
            if (r2 != r4) goto Lb5
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r4 = "+86"
            boolean r2 = gm.l.a(r2, r4)
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r0.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L94
            int r4 = r2.length()
            if (r4 != 0) goto L92
            goto L94
        L92:
            r4 = 0
            goto L95
        L94:
            r4 = 1
        L95:
            if (r4 == 0) goto L99
            r2 = 0
            goto La7
        L99:
            java.lang.String r4 = "^1[3-9][0-9]\\d{8}$"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r2 = r2.matches()
        La7:
            if (r2 == 0) goto Lb5
            eh.l r6 = new eh.l
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r6.<init>(r0, r3)
            goto Lbb
        Lb5:
            eh.l r0 = new eh.l
            r0.<init>(r6, r1)
            r6 = r0
        Lbb:
            java.lang.String r6 = r6.f13681a
            goto Lbf
        Lbe:
            r6 = 0
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.d.c(xl.d):java.lang.Object");
    }
}
