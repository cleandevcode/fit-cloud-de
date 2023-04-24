package s1;

import s1.q;

@zl.e(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends zl.i implements fm.p<q.a<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26495e;

    /* renamed from: f */
    public /* synthetic */ Object f26496f;

    /* renamed from: g */
    public final /* synthetic */ q<Object> f26497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q<Object> qVar, xl.d<? super t> dVar) {
        super(2, dVar);
        this.f26497g = qVar;
    }

    @Override // fm.p
    public final Object A(q.a<Object> aVar, xl.d<? super tl.l> dVar) {
        return ((t) p(aVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        t tVar = new t(this.f26497g, dVar);
        tVar.f26496f = obj;
        return tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0043, code lost:
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0052, code lost:
        if (r5 == r0) goto L21;
     */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r5) {
        /*
            r4 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r4.f26495e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            mf.a0.k(r5)
            goto L7b
        L19:
            mf.a0.k(r5)
            java.lang.Object r5 = r4.f26496f
            s1.q$a r5 = (s1.q.a) r5
            boolean r1 = r5 instanceof s1.q.a.C0466a
            if (r1 == 0) goto L6a
            s1.q<java.lang.Object> r1 = r4.f26497g
            s1.q$a$a r5 = (s1.q.a.C0466a) r5
            r4.f26495e = r3
            sm.g1 r2 = r1.f26446h
            java.lang.Object r2 = r2.getValue()
            s1.b0 r2 = (s1.b0) r2
            boolean r3 = r2 instanceof s1.c
            if (r3 == 0) goto L37
            goto L59
        L37:
            boolean r3 = r2 instanceof s1.l
            if (r3 == 0) goto L46
            s1.b0<T> r5 = r5.f26449a
            if (r2 != r5) goto L59
            java.lang.Object r5 = r1.f(r4)
            if (r5 != r0) goto L59
            goto L5b
        L46:
            s1.c0 r5 = s1.c0.f26406a
            boolean r5 = gm.l.a(r2, r5)
            if (r5 == 0) goto L55
            java.lang.Object r5 = r1.f(r4)
            if (r5 != r0) goto L59
            goto L5b
        L55:
            boolean r5 = r2 instanceof s1.j
            if (r5 != 0) goto L5e
        L59:
            tl.l r5 = tl.l.f28297a
        L5b:
            if (r5 != r0) goto L7b
            return r0
        L5e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L6a:
            boolean r1 = r5 instanceof s1.q.a.b
            if (r1 == 0) goto L7b
            s1.q<java.lang.Object> r1 = r4.f26497g
            s1.q$a$b r5 = (s1.q.a.b) r5
            r4.f26495e = r2
            java.lang.Object r5 = s1.q.b(r1, r5, r4)
            if (r5 != r0) goto L7b
            return r0
        L7b:
            tl.l r5 = tl.l.f28297a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.t.t(java.lang.Object):java.lang.Object");
    }
}
