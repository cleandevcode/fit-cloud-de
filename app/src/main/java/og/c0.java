package og;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import nj.e;
import p000do.a;

/* loaded from: classes2.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ d0 f23235a;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$7$onReceive$1", f = "DeviceManager.kt", l = {336}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public nj.e f23236e;

        /* renamed from: f */
        public d0 f23237f;

        /* renamed from: g */
        public e.a f23238g;

        /* renamed from: h */
        public int f23239h;

        /* renamed from: i */
        public final /* synthetic */ d0 f23240i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f23240i = d0Var;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f23240i, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            d0 d0Var;
            e.a aVar;
            nj.e eVar;
            yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f23239h;
            if (i10 != 0) {
                if (i10 == 1) {
                    aVar = this.f23238g;
                    d0Var = this.f23237f;
                    eVar = this.f23236e;
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                nj.e d10 = this.f23240i.f23267w.d();
                d0Var = this.f23240i;
                e.a u10 = ih.v.u(d10);
                yg.u uVar = this.f23240i.f23250f;
                this.f23236e = d10;
                this.f23237f = d0Var;
                this.f23238g = u10;
                this.f23239h = 1;
                Object l10 = uVar.l(this);
                if (l10 == aVar2) {
                    return aVar2;
                }
                aVar = u10;
                eVar = d10;
                obj = l10;
            }
            d0.O(d0Var, aVar, ((Number) obj).intValue());
            nj.e b10 = aVar.b();
            d0 d0Var2 = this.f23240i;
            if (!gm.l.a(b10, eVar)) {
                d0Var2.f23267w.f(b10);
            }
            return tl.l.f28297a;
        }
    }

    public c0(d0 d0Var) {
        this.f23235a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        a.b bVar = p000do.a.f13275a;
        bVar.t("DeviceManager");
        Object[] objArr = new Object[1];
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        objArr[0] = str;
        bVar.h("receive:%s", objArr);
        d0 d0Var = this.f23235a;
        bi.z0.g(d0Var.f23247c, null, 0, new a(d0Var, null), 3);
    }
}
