package ii;

import com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditIdentityIdViewModel$setIdentityId$1", f = "EditIdentityIdFragment.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16986e;

    /* renamed from: f */
    public final /* synthetic */ EditIdentityIdViewModel f16987f;

    /* renamed from: g */
    public final /* synthetic */ String f16988g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(EditIdentityIdViewModel editIdentityIdViewModel, String str, xl.d<? super t> dVar) {
        super(1, dVar);
        this.f16987f = editIdentityIdViewModel;
        this.f16988g = str;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new t(this.f16987f, this.f16988g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16986e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            EditIdentityIdViewModel editIdentityIdViewModel = this.f16987f;
            kg.k kVar = editIdentityIdViewModel.f11821i;
            long j10 = editIdentityIdViewModel.f11820h;
            String str = this.f16988g;
            this.f16986e = 1;
            if (kVar.B(j10, str, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
