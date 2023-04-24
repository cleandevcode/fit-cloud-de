package s1;

import java.util.List;
import s1.h;

@zl.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends zl.i implements fm.p<k<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26407e;

    /* renamed from: f */
    public /* synthetic */ Object f26408f;

    /* renamed from: g */
    public final /* synthetic */ List<d<Object>> f26409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends d<Object>> list, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f26409g = list;
    }

    @Override // fm.p
    public final Object A(k<Object> kVar, xl.d<? super tl.l> dVar) {
        return ((e) p(kVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e eVar = new e(this.f26409g, dVar);
        eVar.f26408f = obj;
        return eVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26407e;
        if (i10 == 0) {
            mf.a0.k(obj);
            h.a aVar2 = h.f26424a;
            List<d<Object>> list = this.f26409g;
            this.f26407e = 1;
            if (h.a.a(aVar2, list, (k) this.f26408f, this) == aVar) {
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
