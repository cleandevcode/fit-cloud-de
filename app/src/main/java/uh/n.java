package uh;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectViewMode$unbind$1", f = "DeviceConnectDialogFragment.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28791e;

    /* renamed from: f */
    public final /* synthetic */ m f28792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, xl.d<? super n> dVar) {
        super(1, dVar);
        this.f28792f = mVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new n(this.f28792f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28791e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            og.t tVar = this.f28792f.f28789f;
            if (tVar != null) {
                this.f28791e = 1;
                if (tVar.g(this) == aVar) {
                    return aVar;
                }
            } else {
                gm.l.l("deviceManager");
                throw null;
            }
        }
        return tl.l.f28297a;
    }
}
