package sf;

import androidx.lifecycle.f0;
import androidx.lifecycle.k;
import bi.z0;
import com.topstep.fitcloud.pro.ui.camera.CameraActivity;
import jj.o0;
import mf.a0;
import og.c1;
import p000do.a;
import pm.e0;
import pm.z1;

@zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$1", f = "CoreMonitor.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26908e;

    /* renamed from: f */
    public final /* synthetic */ i f26909f;

    /* renamed from: sf.a$a */
    /* loaded from: classes2.dex */
    public static final class C0480a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ i f26910a;

        public C0480a(i iVar) {
            this.f26910a = iVar;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            pj.a aVar = (pj.a) obj;
            a.b bVar = p000do.a.f13275a;
            bVar.t("CoreMonitor");
            boolean z10 = true;
            bVar.h("receive msg:%d", new Integer(aVar.f24277a));
            int i10 = aVar.f24277a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 22) {
                        i iVar = this.f26910a;
                        iVar.getClass();
                        if (!f0.f2713i.f2719f.f2790c.a(k.c.STARTED)) {
                            z0.g(iVar.f26932b, null, 0, new f(iVar, null), 3);
                        }
                        int i11 = CameraActivity.f10412y;
                        CameraActivity.a.a(this.f26910a.f26931a, true);
                    }
                } else {
                    n nVar = this.f26910a.f26934d.get();
                    nVar.getClass();
                    bVar.t("FindPhone");
                    bVar.h("stop find phone", new Object[0]);
                    z1 z1Var = nVar.f26958d;
                    if (z1Var != null) {
                        z1Var.h(null);
                    }
                    nVar.f26958d = null;
                }
            } else {
                n nVar2 = this.f26910a.f26934d.get();
                c1 d10 = nVar2.f26957c.d();
                a0.j(d10.f23242b, new og.z0(d10, null));
                z1 z1Var2 = nVar2.f26958d;
                if ((z1Var2 == null || !z1Var2.a()) ? false : false) {
                    bVar.t("FindPhone");
                    bVar.h("already find phone", new Object[0]);
                } else {
                    boolean g10 = nVar2.f26957c.D().c().g(281);
                    bVar.t("FindPhone");
                    bVar.h("start find phone", new Object[0]);
                    z1 g11 = z0.g(nVar2.f26956b, null, 0, new l(nVar2, g10, null), 3);
                    g11.k(new m(nVar2));
                    nVar2.f26958d = g11;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f26909f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f26909f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26908e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.b d10 = qi.h.d(((o0) this.f26909f.f26933c.d().f23241a).a());
            C0480a c0480a = new C0480a(this.f26909f);
            this.f26908e = 1;
            if (d10.a(c0480a, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
