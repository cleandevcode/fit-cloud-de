package yg;

import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.InternalStorageKt$checkAuthInfoNotChanged$cache$1", f = "InternalStorage.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.p<e0, xl.d<? super pg.a>, Object> {

    /* renamed from: e */
    public int f31585e;

    /* renamed from: f */
    public final /* synthetic */ j f31586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, xl.d<? super k> dVar) {
        super(2, dVar);
        this.f31586f = jVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super pg.a> dVar) {
        return ((k) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new k(this.f31586f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31585e;
        if (i10 == 0) {
            mf.a0.k(obj);
            j jVar = this.f31586f;
            this.f31585e = 1;
            obj = jVar.w(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return obj;
    }
}
