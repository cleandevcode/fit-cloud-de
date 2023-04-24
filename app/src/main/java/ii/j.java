package ii;

import eh.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y3.f1;

/* loaded from: classes2.dex */
public final class j extends y3.k0<i> {

    /* renamed from: f */
    public dk.a<eh.a> f16946f;

    /* renamed from: g */
    public dk.a<jh.q> f16947g;

    /* loaded from: classes2.dex */
    public static final class a implements y3.r0<j, i> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<j, i> f16948a = new qf.d<>(j.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public j create(f1 f1Var, i iVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(iVar, "state");
            return this.f16948a.create(f1Var, iVar);
        }

        /* renamed from: initialState */
        public i m7initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f16948a.initialState(f1Var);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteViewModel$accountDelete$1", f = "AccountDeleteFragment.kt", l = {162}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f16949e;

        /* renamed from: g */
        public final /* synthetic */ a.C0241a f16951g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a.C0241a c0241a, xl.d<? super b> dVar) {
            super(1, dVar);
            j.this = r1;
            this.f16951g = c0241a;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new b(this.f16951g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f16949e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                dk.a<eh.a> aVar2 = j.this.f16946f;
                if (aVar2 != null) {
                    a.C0241a c0241a = this.f16951g;
                    this.f16949e = 1;
                    if (aVar2.get().b(c0241a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("accountDeleteUseCase");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.p<i, y3.b<? extends tl.l>, i> {

        /* renamed from: b */
        public static final c f16952b = new c();

        public c() {
            super(2);
        }

        @Override // fm.p
        public final i A(i iVar, y3.b<? extends tl.l> bVar) {
            i iVar2 = iVar;
            y3.b<? extends tl.l> bVar2 = bVar;
            gm.l.f(iVar2, "$this$execute");
            gm.l.f(bVar2, "it");
            return i.copy$default(iVar2, null, bVar2, 1, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar) {
        super(iVar, null, 2, null);
        gm.l.f(iVar, "initState");
    }

    public final void c(a.C0241a c0241a) {
        y3.k0.a(this, new b(c0241a, null), c.f16952b);
    }
}
