package xh;

import bi.z0;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import fm.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.a0;
import og.d1;
import og.t;
import og.x0;
import pm.e0;
import y3.b0;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class i extends k0<c> {

    /* renamed from: f */
    public final t f30567f;

    /* renamed from: g */
    public final d1 f30568g;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentViewModel$1", f = "DialComponentViewModel.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f30569e;

        /* renamed from: xh.i$a$a */
        /* loaded from: classes2.dex */
        public static final class C0560a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ i f30571a;

            public C0560a(i iVar) {
                this.f30571a = iVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                if (((Boolean) obj).booleanValue()) {
                    i iVar = this.f30571a;
                    iVar.getClass();
                    k0.a(iVar, new k(iVar, null), l.f30578b);
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
            int i10 = this.f30569e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                sm.f<Boolean> a10 = x0.a(i.this.f30567f);
                C0560a c0560a = new C0560a(i.this);
                this.f30569e = 1;
                if (a10.a(c0560a, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements r0<i, c> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<i, c> f30572a = new qf.d<>(i.class);

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public i create(f1 f1Var, c cVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(cVar, "state");
            return this.f30572a.create(f1Var, cVar);
        }

        /* renamed from: initialState */
        public c m16initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f30572a.initialState(f1Var);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b0 {

        /* renamed from: a */
        public final y3.b<DialPushParams> f30573a;

        /* renamed from: b */
        public final y3.b<tl.l> f30574b;

        public c() {
            this(null, null, 3, null);
        }

        public c(y3.b<DialPushParams> bVar, y3.b<tl.l> bVar2) {
            gm.l.f(bVar, "getParams");
            gm.l.f(bVar2, "setComponents");
            this.f30573a = bVar;
            this.f30574b = bVar2;
        }

        public /* synthetic */ c(y3.b bVar, y3.b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? y3.d1.f30940b : bVar, (i10 & 2) != 0 ? y3.d1.f30940b : bVar2);
        }

        public static c copy$default(c cVar, y3.b bVar, y3.b bVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = cVar.f30573a;
            }
            if ((i10 & 2) != 0) {
                bVar2 = cVar.f30574b;
            }
            cVar.getClass();
            gm.l.f(bVar, "getParams");
            gm.l.f(bVar2, "setComponents");
            return new c(bVar, bVar2);
        }

        public final y3.b<DialPushParams> component1() {
            return this.f30573a;
        }

        public final y3.b<tl.l> component2() {
            return this.f30574b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return gm.l.a(this.f30573a, cVar.f30573a) && gm.l.a(this.f30574b, cVar.f30574b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f30574b.hashCode() + (this.f30573a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("State(getParams=");
            a10.append(this.f30573a);
            a10.append(", setComponents=");
            a10.append(this.f30574b);
            a10.append(')');
            return a10.toString();
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, t tVar, d1 d1Var) {
        super(cVar, null, 2, null);
        gm.l.f(cVar, "initState");
        gm.l.f(tVar, "deviceManager");
        gm.l.f(d1Var, "dialRepository");
        this.f30567f = tVar;
        this.f30568g = d1Var;
        z0.g(this.f30970b, null, 0, new a(null), 3);
    }
}
