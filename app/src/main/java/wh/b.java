package wh;

import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import fm.p;
import mf.a0;
import og.x0;
import pm.e0;
import sm.g;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel$1", f = "DialPushViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29833e;

    /* renamed from: f */
    public final /* synthetic */ DialPushViewModel f29834f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ DialPushViewModel f29835a;

        public a(DialPushViewModel dialPushViewModel) {
            this.f29835a = dialPushViewModel;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            if (((Boolean) obj).booleanValue()) {
                DialPushViewModel dialPushViewModel = this.f29835a;
                dialPushViewModel.getClass();
                dialPushViewModel.h(new d(dialPushViewModel, null), 0L);
            }
            return l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialPushViewModel dialPushViewModel, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f29834f = dialPushViewModel;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((b) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new b(this.f29834f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29833e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.f<Boolean> a10 = x0.a(this.f29834f.f10917h);
            a aVar2 = new a(this.f29834f);
            this.f29833e = 1;
            if (a10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return l.f28297a;
    }
}
