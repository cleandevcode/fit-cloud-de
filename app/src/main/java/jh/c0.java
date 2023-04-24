package jh;

import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import eh.j;
import java.util.concurrent.CancellationException;
import tl.g;
import y3.d1;
import y3.k0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInViewModel$signInPlatform$1", f = "SignInFragment.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f17753e;

    /* renamed from: f */
    public /* synthetic */ Object f17754f;

    /* renamed from: g */
    public final /* synthetic */ z f17755g;

    /* renamed from: h */
    public final /* synthetic */ String f17756h;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<y, y> {

        /* renamed from: b */
        public static final a f17757b = new a();

        public a() {
            super(1);
        }

        @Override // fm.l
        public final y k(y yVar) {
            gm.l.f(yVar, "$this$setState");
            return y.a(d1.f30940b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<y, y> {

        /* renamed from: b */
        public final /* synthetic */ Throwable f17758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th2) {
            super(1);
            this.f17758b = th2;
        }

        @Override // fm.l
        public final y k(y yVar) {
            gm.l.f(yVar, "$this$setState");
            return y.a(new y3.j(null, this.f17758b));
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInViewModel$signInPlatform$1$4$1", f = "SignInFragment.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.l<xl.d<? super FillUserInfo>, Object> {

        /* renamed from: e */
        public int f17759e;

        /* renamed from: f */
        public final /* synthetic */ z f17760f;

        /* renamed from: g */
        public final /* synthetic */ j.a f17761g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar, j.a aVar, xl.d<? super c> dVar) {
            super(1, dVar);
            this.f17760f = zVar;
            this.f17761g = aVar;
        }

        @Override // fm.l
        public final Object k(xl.d<? super FillUserInfo> dVar) {
            return new c(this.f17760f, this.f17761g, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f17759e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                dk.a<eh.j> aVar2 = this.f17760f.f17840k;
                if (aVar2 != null) {
                    j.a aVar3 = this.f17761g;
                    this.f17759e = 1;
                    obj = aVar2.get().b(aVar3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("signInThirdPartyUseCase");
                    throw null;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.p<y, y3.b<? extends FillUserInfo>, y> {

        /* renamed from: b */
        public static final d f17762b = new d();

        public d() {
            super(2);
        }

        @Override // fm.p
        public final y A(y yVar, y3.b<? extends FillUserInfo> bVar) {
            y3.b<? extends FillUserInfo> bVar2 = bVar;
            gm.l.f(yVar, "$this$execute");
            gm.l.f(bVar2, "it");
            return y.a(bVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z zVar, String str, xl.d<? super c0> dVar) {
        super(2, dVar);
        this.f17755g = zVar;
        this.f17756h = str;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((c0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c0 c0Var = new c0(this.f17755g, this.f17756h, dVar);
        c0Var.f17754f = obj;
        return c0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object f10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f17753e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                pm.e0 e0Var = (pm.e0) this.f17754f;
                z zVar = this.f17755g;
                a aVar2 = a.f17757b;
                int i11 = z.f17834m;
                k0<S>.b bVar = zVar.f30971c;
                bVar.getClass();
                bVar.a(aVar2);
                z zVar2 = this.f17755g;
                String str = this.f17756h;
                dk.a<q> aVar3 = zVar2.f17839j;
                if (aVar3 != null) {
                    this.f17753e = 1;
                    obj = aVar3.get().b(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("platformAuthUseCase");
                    throw null;
                }
            }
            f10 = (j.a) obj;
        } catch (Throwable th2) {
            f10 = mf.a0.f(th2);
        }
        z zVar3 = this.f17755g;
        Throwable a10 = tl.g.a(f10);
        if (a10 != null && !(a10 instanceof n) && !(a10 instanceof CancellationException)) {
            b bVar2 = new b(a10);
            int i12 = z.f17834m;
            k0<S>.b bVar3 = zVar3.f30971c;
            bVar3.getClass();
            bVar3.a(bVar2);
        }
        z zVar4 = this.f17755g;
        if (!(f10 instanceof g.a)) {
            k0.a(zVar4, new c(zVar4, (j.a) f10, null), d.f17762b);
        }
        return tl.l.f28297a;
    }
}
