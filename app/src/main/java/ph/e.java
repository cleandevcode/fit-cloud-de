package ph;

import java.util.List;
import ph.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$leftClick$1", f = "AbsHealthDetailFragment.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24138e;

    /* renamed from: f */
    public final /* synthetic */ c<vf.i> f24139f;

    /* renamed from: g */
    public final /* synthetic */ c.b<vf.i> f24140g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c<vf.i> cVar, c.b<vf.i> bVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f24139f = cVar;
        this.f24140g = bVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f24139f, this.f24140g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        boolean z10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24138e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            c<vf.i> cVar = this.f24139f;
            this.f24138e = 1;
            obj = cVar.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) ((c.C0438c) obj).f24130a.a();
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return tl.l.f28297a;
        }
        this.f24139f.k(this.f24140g.f24126a - 1, list);
        return tl.l.f28297a;
    }
}
