package jh;

import bi.z0;
import eh.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pm.z1;
import y3.c1;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class c extends k0<jh.b> {

    /* renamed from: h */
    public static final /* synthetic */ int f17742h = 0;

    /* renamed from: f */
    public dk.a<eh.e> f17743f;

    /* renamed from: g */
    public z1 f17744g;

    /* loaded from: classes2.dex */
    public static final class a implements r0<c, jh.b> {

        /* renamed from: a */
        public final /* synthetic */ qf.d<c, jh.b> f17745a = new qf.d<>(c.class);

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public c create(f1 f1Var, jh.b bVar) {
            gm.l.f(f1Var, "viewModelContext");
            gm.l.f(bVar, "state");
            return this.f17745a.create(f1Var, bVar);
        }

        /* renamed from: initialState */
        public jh.b m9initialState(f1 f1Var) {
            gm.l.f(f1Var, "viewModelContext");
            return this.f17745a.initialState(f1Var);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<jh.b, jh.b> {

        /* renamed from: b */
        public static final b f17746b = new b();

        public b() {
            super(1);
        }

        @Override // fm.l
        public final jh.b k(jh.b bVar) {
            jh.b bVar2 = bVar;
            gm.l.f(bVar2, "$this$setState");
            return jh.b.copy$default(bVar2, null, null, 0, 6, null);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.AuthCodeViewModel$requestAuthCode$2", f = "AuthCodeViewModel.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: jh.c$c */
    /* loaded from: classes2.dex */
    public static final class C0310c extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f17747e;

        /* renamed from: g */
        public final /* synthetic */ String f17749g;

        /* renamed from: h */
        public final /* synthetic */ boolean f17750h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0310c(String str, boolean z10, xl.d<? super C0310c> dVar) {
            super(1, dVar);
            c.this = r1;
            this.f17749g = str;
            this.f17750h = z10;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new C0310c(this.f17749g, this.f17750h, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f17747e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                dk.a<eh.e> aVar2 = c.this.f17743f;
                if (aVar2 != null) {
                    e.a aVar3 = new e.a(this.f17749g, this.f17750h);
                    this.f17747e = 1;
                    if (aVar2.get().b(aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("requestAuthCodeUseCase");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.p<jh.b, y3.b<? extends tl.l>, jh.b> {

        /* renamed from: c */
        public final /* synthetic */ String f17752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(2);
            c.this = r1;
            this.f17752c = str;
        }

        @Override // fm.p
        public final jh.b A(jh.b bVar, y3.b<? extends tl.l> bVar2) {
            jh.b bVar3 = bVar;
            y3.b<? extends tl.l> bVar4 = bVar2;
            gm.l.f(bVar3, "$this$execute");
            gm.l.f(bVar4, "it");
            if (bVar4 instanceof c1) {
                c cVar = c.this;
                z1 z1Var = cVar.f17744g;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                cVar.f17744g = z0.g(cVar.f30970b, null, 0, new jh.d(cVar, null), 3);
                return new jh.b(this.f17752c, bVar4, 60);
            }
            return jh.b.copy$default(bVar3, null, bVar4, 0, 5, null);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jh.b bVar) {
        super(bVar, null, 2, null);
        gm.l.f(bVar, "initState");
    }

    public final void c(String str, boolean z10) {
        gm.l.f(str, "username");
        b bVar = b.f17746b;
        k0<S>.b bVar2 = this.f30971c;
        bVar2.getClass();
        bVar2.a(bVar);
        k0.a(this, new C0310c(str, z10, null), new d(str));
    }
}
