package nh;

import bi.z0;
import fm.p;
import mf.a0;
import pm.e0;
import tl.l;
import zl.i;

/* loaded from: classes2.dex */
public abstract class e<T> extends f<d<T>, c<T>> {

    @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncViewModel$execute$1", f = "AsyncState.kt", l = {40, 44, 47, 48, 51, 52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public Object f22383e;

        /* renamed from: f */
        public Object f22384f;

        /* renamed from: g */
        public Object f22385g;

        /* renamed from: h */
        public int f22386h;

        /* renamed from: i */
        public /* synthetic */ Object f22387i;

        /* renamed from: j */
        public final /* synthetic */ long f22388j;

        /* renamed from: k */
        public final /* synthetic */ e<T> f22389k;

        /* renamed from: l */
        public final /* synthetic */ fm.l<xl.d<? super T>, Object> f22390l;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.base.viewmodel.AsyncViewModel$execute$1$delayLoading$1", f = "AsyncState.kt", l = {36, 37}, m = "invokeSuspend")
        /* renamed from: nh.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C0401a extends i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f22391e;

            /* renamed from: f */
            public final /* synthetic */ e<T> f22392f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0401a(e<T> eVar, xl.d<? super C0401a> dVar) {
                super(2, dVar);
                this.f22392f = eVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0401a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0401a(this.f22392f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f22391e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a0.k(obj);
                            return l.f28297a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    this.f22391e = 1;
                    if (a0.g(1000L, this) == aVar) {
                        return aVar;
                    }
                }
                e<T> eVar = this.f22392f;
                y3.p pVar = new y3.p(null);
                eVar.e().getClass();
                d a10 = d.a(pVar);
                this.f22391e = 2;
                if (eVar.g(a10) == aVar) {
                    return aVar;
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, e<T> eVar, fm.l<? super xl.d<? super T>, ? extends Object> lVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f22388j = j10;
            this.f22389k = eVar;
            this.f22390l = lVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f22388j, this.f22389k, this.f22390l, dVar);
            aVar.f22387i = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x013d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00f8  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [pm.g1, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nh.e.a.t(java.lang.Object):java.lang.Object");
        }
    }

    public e() {
        super(new d(null, 1, null));
    }

    public final void h(fm.l<? super xl.d<? super T>, ? extends Object> lVar, long j10) {
        z0.g(rm.l.h(this), null, 0, new a(j10, this, lVar, null), 3);
    }
}
