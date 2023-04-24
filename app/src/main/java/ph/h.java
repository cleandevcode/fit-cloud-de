package ph;

import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$requestList$1", f = "AbsHealthDetailFragment.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends zl.i implements fm.l<xl.d<? super List<vf.i>>, Object> {

    /* renamed from: e */
    public int f24157e;

    /* renamed from: f */
    public final /* synthetic */ c<vf.i> f24158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c<vf.i> cVar, xl.d<? super h> dVar) {
        super(1, dVar);
        this.f24158f = cVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super List<vf.i>> dVar) {
        return new h(this.f24158f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24157e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            c<vf.i> cVar = this.f24158f;
            sh.b<vf.i> bVar = cVar.f24116k;
            long j10 = cVar.f24117l;
            this.f24157e = 1;
            obj = bVar.b(j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
