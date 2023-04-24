package s1;

/* loaded from: classes.dex */
public final class v implements sm.g<b0<Object>> {

    /* renamed from: a */
    public final /* synthetic */ sm.g f26503a;

    @zl.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    /* loaded from: classes.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f26504d;

        /* renamed from: e */
        public int f26505e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            v.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f26504d = obj;
            this.f26505e |= Integer.MIN_VALUE;
            return v.this.n(null, this);
        }
    }

    public v(sm.g gVar) {
        this.f26503a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002f  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(s1.b0<java.lang.Object> r5, xl.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s1.v.a
            if (r0 == 0) goto L13
            r0 = r6
            s1.v$a r0 = (s1.v.a) r0
            int r1 = r0.f26505e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26505e = r1
            goto L18
        L13:
            s1.v$a r0 = new s1.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26504d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f26505e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            mf.a0.k(r6)
            sm.g r6 = r4.f26503a
            s1.b0 r5 = (s1.b0) r5
            boolean r2 = r5 instanceof s1.l
            if (r2 != 0) goto L6d
            boolean r2 = r5 instanceof s1.j
            if (r2 != 0) goto L68
            boolean r2 = r5 instanceof s1.c
            if (r2 == 0) goto L52
            s1.c r5 = (s1.c) r5
            T r5 = r5.f26404a
            r0.f26505e = r3
            java.lang.Object r5 = r6.n(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            tl.l r5 = tl.l.f28297a
            return r5
        L52:
            boolean r5 = r5 instanceof s1.c0
            if (r5 == 0) goto L62
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L62:
            qa.p r5 = new qa.p
            r5.<init>()
            throw r5
        L68:
            s1.j r5 = (s1.j) r5
            java.lang.Throwable r5 = r5.f26425a
            throw r5
        L6d:
            s1.l r5 = (s1.l) r5
            java.lang.Throwable r5 = r5.f26426a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.v.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
