package sf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bi.z0;
import mf.a0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import p000do.a;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.function.FindPhoneManager$start$1", f = "FindPhoneManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f26942e;

    /* renamed from: f */
    public final /* synthetic */ n f26943f;

    /* renamed from: g */
    public final /* synthetic */ boolean f26944g;

    @zl.e(c = "com.topstep.fitcloud.pro.function.FindPhoneManager$start$1$1", f = "FindPhoneManager.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f26945e;

        /* renamed from: f */
        public final /* synthetic */ n f26946f;

        /* renamed from: sf.l$a$a */
        /* loaded from: classes2.dex */
        public static final class C0481a extends gm.m implements fm.l<Throwable, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ n f26947b;

            /* renamed from: c */
            public final /* synthetic */ b f26948c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0481a(n nVar, b bVar) {
                super(1);
                this.f26947b = nVar;
                this.f26948c = bVar;
            }

            @Override // fm.l
            public final tl.l k(Throwable th2) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("FindPhone");
                bVar.h("unregisterReceiver", new Object[0]);
                this.f26947b.f26955a.unregisterReceiver(this.f26948c);
                return tl.l.f28297a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends BroadcastReceiver {

            /* renamed from: a */
            public final /* synthetic */ pm.i<tl.l> f26949a;

            public b(pm.j jVar) {
                this.f26949a = jVar;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String str;
                a.b bVar = p000do.a.f13275a;
                bVar.t("FindPhone");
                Object[] objArr = new Object[1];
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                objArr[0] = str;
                bVar.h("onReceive:%s", objArr);
                try {
                    this.f26949a.G(null);
                } catch (Exception e10) {
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("FindPhone");
                    bVar2.q(e10);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f26946f = nVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f26946f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f26945e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                n nVar = this.f26946f;
                this.f26945e = 1;
                pm.j jVar = new pm.j(1, a0.i(this));
                jVar.u();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                intentFilter.addAction("com.topstep.fitcloudpro.action.StopFindPhone");
                b bVar = new b(jVar);
                nVar.f26955a.registerReceiver(bVar, intentFilter);
                a.b bVar2 = p000do.a.f13275a;
                bVar2.t("FindPhone");
                bVar2.h("registerReceiver", new Object[0]);
                jVar.z(new C0481a(nVar, bVar));
                if (jVar.t() == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ e0 f26950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var) {
            super(1);
            this.f26950b = e0Var;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("FindPhone");
            bVar.h("cancel the receiver", new Object[0]);
            bi.r.m(this.f26950b);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.function.FindPhoneManager$start$1$3", f = "FindPhoneManager.kt", l = {83, 85}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f26951e;

        /* renamed from: f */
        public final /* synthetic */ boolean f26952f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, xl.d<? super c> dVar) {
            super(2, dVar);
            this.f26952f = z10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f26952f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f26951e;
            if (i10 == 0) {
                a0.k(obj);
                if (this.f26952f) {
                    this.f26951e = 1;
                    if (a0.g(22000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f26951e = 2;
                    if (a0.g(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ e0 f26953b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var) {
            super(1);
            this.f26953b = e0Var;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("FindPhone");
            bVar.h("cancel the timer", new Object[0]);
            bi.r.m(this.f26953b);
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, boolean z10, xl.d<? super l> dVar) {
        super(2, dVar);
        this.f26943f = nVar;
        this.f26944g = z10;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((l) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        l lVar = new l(this.f26943f, this.f26944g, dVar);
        lVar.f26942e = obj;
        return lVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        e0 e0Var = (e0) this.f26942e;
        n.a(this.f26943f, this.f26944g);
        z0.g(e0Var, null, 0, new a(this.f26943f, null), 3).k(new b(e0Var));
        z0.g(e0Var, null, 0, new c(this.f26944g, null), 3).k(new d(e0Var));
        return tl.l.f28297a;
    }
}
