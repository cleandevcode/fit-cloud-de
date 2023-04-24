package v1;

import fm.p;
import java.util.Map;
import mf.a0;
import tl.l;
import ul.z;
import v1.d;
import zl.i;

/* loaded from: classes.dex */
public final class e {

    @zl.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<d, xl.d<? super d>, Object> {

        /* renamed from: e */
        public int f28987e;

        /* renamed from: f */
        public /* synthetic */ Object f28988f;

        /* renamed from: g */
        public final /* synthetic */ p<v1.a, xl.d<? super l>, Object> f28989g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super v1.a, ? super xl.d<? super l>, ? extends Object> pVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28989g = pVar;
        }

        @Override // fm.p
        public final Object A(d dVar, xl.d<? super d> dVar2) {
            return ((a) p(dVar, dVar2)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f28989g, dVar);
            aVar.f28988f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28987e;
            if (i10 != 0) {
                if (i10 == 1) {
                    v1.a aVar2 = (v1.a) this.f28988f;
                    a0.k(obj);
                    return aVar2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.k(obj);
            v1.a aVar3 = new v1.a((Map<d.a<?>, Object>) z.H(((d) this.f28988f).a()), false);
            p<v1.a, xl.d<? super l>, Object> pVar = this.f28989g;
            this.f28988f = aVar3;
            this.f28987e = 1;
            if (pVar.A(aVar3, this) == aVar) {
                return aVar;
            }
            return aVar3;
        }
    }

    public static final Object a(s1.i<d> iVar, p<? super v1.a, ? super xl.d<? super l>, ? extends Object> pVar, xl.d<? super d> dVar) {
        return iVar.a(new a(pVar, null), dVar);
    }
}
