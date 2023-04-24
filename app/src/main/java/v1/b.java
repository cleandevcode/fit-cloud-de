package v1;

import fm.p;
import mf.a0;
import s1.i;
import s1.q;
import tl.l;

/* loaded from: classes.dex */
public final class b implements i<d> {

    /* renamed from: a */
    public final i<d> f28981a;

    @zl.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements p<d, xl.d<? super d>, Object> {

        /* renamed from: e */
        public int f28982e;

        /* renamed from: f */
        public /* synthetic */ Object f28983f;

        /* renamed from: g */
        public final /* synthetic */ p<d, xl.d<? super d>, Object> f28984g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super d, ? super xl.d<? super d>, ? extends Object> pVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28984g = pVar;
        }

        @Override // fm.p
        public final Object A(d dVar, xl.d<? super d> dVar2) {
            return ((a) p(dVar, dVar2)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f28984g, dVar);
            aVar.f28983f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28982e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                p<d, xl.d<? super d>, Object> pVar = this.f28984g;
                this.f28982e = 1;
                obj = pVar.A((d) this.f28983f, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            d dVar = (d) obj;
            ((v1.a) dVar).f28979b.set(true);
            return dVar;
        }
    }

    public b(q qVar) {
        this.f28981a = qVar;
    }

    @Override // s1.i
    public final Object a(p<? super d, ? super xl.d<? super d>, ? extends Object> pVar, xl.d<? super d> dVar) {
        return this.f28981a.a(new a(pVar, null), dVar);
    }

    @Override // s1.i
    public final sm.f<d> getData() {
        return this.f28981a.getData();
    }
}
