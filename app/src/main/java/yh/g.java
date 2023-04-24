package yh;

import bi.z0;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import fm.p;
import mf.a0;
import og.d1;
import pm.e0;
import sm.t0;
import y3.c1;

/* loaded from: classes2.dex */
public final class g extends nh.e<o> {

    /* renamed from: h */
    public final DialPushViewModel f31742h;

    /* renamed from: i */
    public final boolean f31743i;

    /* renamed from: j */
    public final d1 f31744j;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListViewModel$1", f = "DialPacketListFragment.kt", l = {205}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f31745e;

        /* renamed from: yh.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C0599a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ g f31747a;

            public C0599a(g gVar) {
                this.f31747a = gVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                y3.b<T> bVar = ((nh.d) obj).f22382a;
                if (bVar instanceof y3.p) {
                    g gVar = this.f31747a;
                    y3.p pVar = new y3.p(null);
                    gVar.e().getClass();
                    tl.l g10 = gVar.g(nh.d.a(pVar));
                    if (g10 == aVar) {
                        return g10;
                    }
                } else if (bVar instanceof y3.j) {
                    g gVar2 = this.f31747a;
                    y3.j jVar = new y3.j(null, ((y3.j) bVar).f30961b);
                    gVar2.e().getClass();
                    tl.l g11 = gVar2.g(nh.d.a(jVar));
                    if (g11 == aVar) {
                        return g11;
                    }
                } else if (bVar instanceof c1) {
                    g gVar3 = this.f31747a;
                    gVar3.getClass();
                    gVar3.h(new i(gVar3, (DialPushParams) ((c1) bVar).f30937b, null), 1000L);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            g.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31745e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                g gVar = g.this;
                t0 t0Var = gVar.f31742h.f22394e;
                C0599a c0599a = new C0599a(gVar);
                this.f31745e = 1;
                if (t0Var.a(c0599a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        g a(DialPushViewModel dialPushViewModel, boolean z10);
    }

    public g(DialPushViewModel dialPushViewModel, boolean z10) {
        gm.l.f(dialPushViewModel, "dialPushViewModel");
        this.f31742h = dialPushViewModel;
        this.f31743i = z10;
        this.f31744j = dialPushViewModel.f10918i;
        z0.g(rm.l.h(this), null, 0, new a(null), 3);
    }

    public final void i() {
        Object obj = this.f31742h.e().f22382a;
        if (!(obj instanceof y3.p)) {
            if (obj instanceof y3.j) {
                if (!(((y3.j) obj).f30961b instanceof lc.f)) {
                    DialPushViewModel dialPushViewModel = this.f31742h;
                    dialPushViewModel.getClass();
                    dialPushViewModel.h(new wh.d(dialPushViewModel, null), 0L);
                }
            } else if (obj instanceof c1) {
                h(new i(this, (DialPushParams) ((c1) obj).f30937b, null), 1000L);
            }
        }
    }
}
