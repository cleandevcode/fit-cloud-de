package ph;

import com.topstep.fitcloud.pro.ui.data.ExerciseFragment;

/* loaded from: classes2.dex */
public final class b0<T> implements sm.g {

    /* renamed from: a */
    public final /* synthetic */ sm.g f24108a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseFragment f24109b;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ExerciseFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2", f = "ExerciseFragment.kt", l = {224, 223}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f24110d;

        /* renamed from: e */
        public int f24111e;

        /* renamed from: f */
        public sm.g f24112f;

        /* renamed from: h */
        public sf.j f24114h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            b0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f24110d = obj;
            this.f24111e |= Integer.MIN_VALUE;
            return b0.this.n(null, this);
        }
    }

    public b0(sm.g gVar, ExerciseFragment exerciseFragment) {
        this.f24108a = gVar;
        this.f24109b = exerciseFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0074 A[RETURN] */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ph.b0.a
            if (r0 == 0) goto L13
            r0 = r14
            ph.b0$a r0 = (ph.b0.a) r0
            int r1 = r0.f24111e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24111e = r1
            goto L18
        L13:
            ph.b0$a r0 = new ph.b0$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24110d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f24111e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            mf.a0.k(r14)
            goto L75
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            sf.j r13 = r0.f24114h
            sm.g r2 = r0.f24112f
            mf.a0.k(r14)
            goto L57
        L3b:
            mf.a0.k(r14)
            sm.g r2 = r12.f24108a
            sf.j r13 = (sf.j) r13
            com.topstep.fitcloud.pro.ui.data.ExerciseFragment r14 = r12.f24109b
            lg.c r14 = r14.f10463z0
            if (r14 == 0) goto L78
            java.util.Date r6 = r13.f26940a
            r0.f24112f = r2
            r0.f24114h = r13
            r0.f24111e = r4
            java.lang.Object r14 = r14.e(r6, r0)
            if (r14 != r1) goto L57
            return r1
        L57:
            vf.p r14 = (vf.p) r14
            if (r14 != 0) goto L68
            vf.p r14 = new vf.p
            java.util.Date r7 = r13.f26940a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 30
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
        L68:
            r0.f24112f = r5
            r0.f24114h = r5
            r0.f24111e = r3
            java.lang.Object r13 = r2.n(r14, r0)
            if (r13 != r1) goto L75
            return r1
        L75:
            tl.l r13 = tl.l.f28297a
            return r13
        L78:
            java.lang.String r13 = "dataRepository"
            gm.l.l(r13)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.b0.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
