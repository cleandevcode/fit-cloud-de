package s1;

import java.util.Iterator;
import java.util.List;

@zl.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends zl.i implements fm.p<Object, xl.d<Object>, Object> {

    /* renamed from: e */
    public Iterator f26415e;

    /* renamed from: f */
    public d f26416f;

    /* renamed from: g */
    public Object f26417g;

    /* renamed from: h */
    public int f26418h;

    /* renamed from: i */
    public /* synthetic */ Object f26419i;

    /* renamed from: j */
    public final /* synthetic */ List<d<Object>> f26420j;

    /* renamed from: k */
    public final /* synthetic */ List<fm.l<xl.d<? super tl.l>, Object>> f26421k;

    @zl.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f26422e;

        /* renamed from: f */
        public final /* synthetic */ d<Object> f26423f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<Object> dVar, xl.d<? super a> dVar2) {
            super(1, dVar2);
            this.f26423f = dVar;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new a(this.f26423f, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f26422e;
            if (i10 == 0) {
                mf.a0.k(obj);
                d<Object> dVar = this.f26423f;
                this.f26422e = 1;
                if (dVar.a() == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends d<Object>> list, List<fm.l<xl.d<? super tl.l>, Object>> list2, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f26420j = list;
        this.f26421k = list2;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<Object> dVar) {
        return ((g) p(obj, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        g gVar = new g(this.f26420j, this.f26421k, dVar);
        gVar.f26419i = obj;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0083 -> B:38:0x003b). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r11) {
        /*
            r10 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r10.f26418h
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L1e
            if (r1 != r3) goto L16
            java.util.Iterator r1 = r10.f26415e
            java.lang.Object r4 = r10.f26419i
            java.util.List r4 = (java.util.List) r4
            mf.a0.k(r11)
            goto L3a
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f26417g
            s1.d r4 = r10.f26416f
            java.util.Iterator r5 = r10.f26415e
            java.lang.Object r6 = r10.f26419i
            java.util.List r6 = (java.util.List) r6
            mf.a0.k(r11)
            r7 = r10
            goto L60
        L2d:
            mf.a0.k(r11)
            java.lang.Object r11 = r10.f26419i
            java.util.List<s1.d<java.lang.Object>> r1 = r10.f26420j
            java.util.List<fm.l<xl.d<? super tl.l>, java.lang.Object>> r4 = r10.f26421k
            java.util.Iterator r1 = r1.iterator()
        L3a:
            r5 = r10
        L3b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r6 = r1.next()
            s1.d r6 = (s1.d) r6
            r5.f26419i = r4
            r5.f26415e = r1
            r5.f26416f = r6
            r5.f26417g = r11
            r5.f26418h = r2
            java.lang.Object r7 = r6.c()
            if (r7 != r0) goto L58
            return r0
        L58:
            r8 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r8
            r9 = r6
            r6 = r4
            r4 = r9
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L82
            s1.g$a r11 = new s1.g$a
            r1 = 0
            r11.<init>(r4, r1)
            r6.add(r11)
            r7.f26419i = r6
            r7.f26415e = r5
            r7.f26416f = r1
            r7.f26417g = r1
            r7.f26418h = r3
            java.lang.Object r11 = r4.b()
            if (r11 != r0) goto L83
            return r0
        L82:
            r11 = r1
        L83:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L3b
        L87:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.g.t(java.lang.Object):java.lang.Object");
    }
}
