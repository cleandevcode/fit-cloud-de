package di;

import bi.z0;
import fm.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.a0;
import og.p1;
import og.t;
import og.x0;
import pm.e0;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class g extends k0<nh.d<bg.a>> {

    /* renamed from: f */
    public final t f13062f;

    /* renamed from: g */
    public final p1 f13063g;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushViewModel$1", f = "SportPushViewModel.kt", l = {26}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f13064e;

        /* renamed from: di.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C0225a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ g f13066a;

            public C0225a(g gVar) {
                this.f13066a = gVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                if (((Boolean) obj).booleanValue()) {
                    g gVar = this.f13066a;
                    gVar.getClass();
                    k0.a(gVar, new h(gVar, null), i.f13070b);
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
            int i10 = this.f13064e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                sm.f<Boolean> a10 = x0.a(g.this.f13062f);
                C0225a c0225a = new C0225a(g.this);
                this.f13064e = 1;
                if (a10.a(c0225a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements r0<g, nh.d<bg.a>> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<g, nh.d<bg.a>> f13067a = new qf.d<>(g.class);

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public g create(f1 f1Var, nh.d<bg.a> dVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(dVar, "state");
            return this.f13067a.create(f1Var, dVar);
        }

        /* renamed from: initialState */
        public nh.d<bg.a> m5initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f13067a.initialState(f1Var);
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nh.d<bg.a> dVar, t tVar, p1 p1Var) {
        super(dVar, null, 2, null);
        gm.l.f(dVar, "initState");
        gm.l.f(tVar, "deviceManager");
        gm.l.f(p1Var, "sportPushRepository");
        this.f13062f = tVar;
        this.f13063g = p1Var;
        z0.g(this.f30970b, null, 0, new a(null), 3);
    }
}
