package ph;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$requestDetailInner$1", f = "AbsHealthDetailFragment.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements fm.l<xl.d<vf.i>, Object> {

    /* renamed from: e */
    public int f24144e;

    /* renamed from: f */
    public final /* synthetic */ c<vf.i> f24145f;

    /* renamed from: g */
    public final /* synthetic */ vf.i f24146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c<vf.i> cVar, vf.i iVar, xl.d<? super f> dVar) {
        super(1, dVar);
        this.f24145f = cVar;
        this.f24146g = iVar;
    }

    @Override // fm.l
    public final Object k(xl.d<vf.i> dVar) {
        return new f(this.f24145f, this.f24146g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24144e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            c<vf.i> cVar = this.f24145f;
            sh.b<vf.i> bVar = cVar.f24116k;
            long j10 = cVar.f24117l;
            vf.i iVar = this.f24146g;
            this.f24144e = 1;
            obj = bVar.a(j10, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
