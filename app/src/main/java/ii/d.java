package ii;

import fh.a;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountBindViewModel$accountBind$1", f = "AccountBindFragment.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16906e;

    /* renamed from: f */
    public final /* synthetic */ c f16907f;

    /* renamed from: g */
    public final /* synthetic */ String f16908g;

    /* renamed from: h */
    public final /* synthetic */ String f16909h;

    /* renamed from: i */
    public final /* synthetic */ String f16910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, String str2, String str3, xl.d<? super d> dVar) {
        super(1, dVar);
        this.f16907f = cVar;
        this.f16908g = str;
        this.f16909h = str2;
        this.f16910i = str3;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new d(this.f16907f, this.f16908g, this.f16909h, this.f16910i, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16906e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            dk.a<fh.a> aVar2 = this.f16907f.f16899f;
            if (aVar2 != null) {
                a.C0252a c0252a = new a.C0252a(this.f16908g, this.f16909h, this.f16910i);
                this.f16906e = 1;
                if (aVar2.get().b(c0252a, this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("accountBindUseCase");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
