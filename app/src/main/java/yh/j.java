package yh;

import fm.p;
import mf.a0;
import og.d1;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListViewModel$removeLocalDialPacket$1", f = "DialPacketListFragment.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31754e;

    /* renamed from: f */
    public final /* synthetic */ g f31755f;

    /* renamed from: g */
    public final /* synthetic */ String f31756g;

    /* renamed from: h */
    public final /* synthetic */ int f31757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, String str, int i10, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f31755f = gVar;
        this.f31756g = str;
        this.f31757h = i10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new j(this.f31755f, this.f31756g, this.f31757h, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31754e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            d1 d1Var = this.f31755f.f31744j;
            String str = this.f31756g;
            int i11 = this.f31757h;
            this.f31754e = 1;
            if (d1Var.a(i11, str, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
