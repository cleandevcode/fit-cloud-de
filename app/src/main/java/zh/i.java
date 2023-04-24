package zh;

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
public final class i extends nh.e<n> {

    /* renamed from: h */
    public final DialPushViewModel f32458h;

    /* renamed from: i */
    public final d1 f32459i;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomViewModel$1", f = "DialCustomFragment.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f32460e;

        /* renamed from: zh.i$a$a */
        /* loaded from: classes2.dex */
        public static final class C0624a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ i f32462a;

            public C0624a(i iVar) {
                this.f32462a = iVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                y3.b<T> bVar = ((nh.d) obj).f22382a;
                if (bVar instanceof y3.p) {
                    i iVar = this.f32462a;
                    y3.p pVar = new y3.p(null);
                    iVar.e().getClass();
                    tl.l g10 = iVar.g(nh.d.a(pVar));
                    if (g10 == aVar) {
                        return g10;
                    }
                } else if (bVar instanceof y3.j) {
                    i iVar2 = this.f32462a;
                    y3.j jVar = new y3.j(null, ((y3.j) bVar).f30961b);
                    iVar2.e().getClass();
                    tl.l g11 = iVar2.g(nh.d.a(jVar));
                    if (g11 == aVar) {
                        return g11;
                    }
                } else if (bVar instanceof c1) {
                    i iVar3 = this.f32462a;
                    iVar3.getClass();
                    iVar3.h(new k(iVar3, (DialPushParams) ((c1) bVar).f30937b, null), 1000L);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            i.this = r1;
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
            int i10 = this.f32460e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                i iVar = i.this;
                t0 t0Var = iVar.f32458h.f22394e;
                C0624a c0624a = new C0624a(iVar);
                this.f32460e = 1;
                if (t0Var.a(c0624a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        i a(DialPushViewModel dialPushViewModel);
    }

    public i(DialPushViewModel dialPushViewModel) {
        gm.l.f(dialPushViewModel, "dialPushViewModel");
        this.f32458h = dialPushViewModel;
        this.f32459i = dialPushViewModel.f10918i;
        z0.g(rm.l.h(this), null, 0, new a(null), 3);
    }
}
