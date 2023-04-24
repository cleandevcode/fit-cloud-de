package com.topstep.fitcloud.pro.ui;

import a0.k0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.h1;
import androidx.navigation.fragment.NavHostFragment;
import bi.r;
import bi.z0;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.topstep.fitcloud.pro.databinding.ActivityMainBinding;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.settings.AccountBindType;
import com.topstep.fitcloudpro.R;
import ga.f;
import gm.l;
import i2.b0;
import i2.m;
import i2.z;
import ih.n;
import ih.v;
import ih.x;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k1.i2;
import k1.l2;
import k1.o0;
import kg.k;
import kotlin.Metadata;
import mf.a0;
import og.t;
import pm.e0;
import qi.h;
import qi.p;
import s.i0;
import sm.f1;
import sm.g;
import sm.t0;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class MainActivity extends n {
    public static final /* synthetic */ int E = 0;
    public zg.b A;
    public t B;
    public k C;
    public final tl.d D = p.e(this);

    /* renamed from: x */
    public ActivityMainBinding f10240x;

    /* renamed from: y */
    public z f10241y;

    /* renamed from: z */
    public xg.a f10242z;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context) {
            l.f(context, "context");
            context.startActivity(new Intent(context, MainActivity.class));
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$checkBindEmail$1", f = "MainActivity.kt", l = {206, 207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10243e;

        @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$checkBindEmail$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public final /* synthetic */ MainActivity f10245e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10245e = mainActivity;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10245e, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                a0.k(obj);
                z zVar = this.f10245e.f10241y;
                if (zVar != null) {
                    ii.b bVar = new ii.b(AccountBindType.BIND_EMAIL, true);
                    Bundle bundle = new Bundle();
                    if (Parcelable.class.isAssignableFrom(AccountBindType.class)) {
                        AccountBindType accountBindType = bVar.f16892a;
                        l.d(accountBindType, "null cannot be cast to non-null type android.os.Parcelable");
                        bundle.putParcelable("bindType", (Parcelable) accountBindType);
                    } else if (Serializable.class.isAssignableFrom(AccountBindType.class)) {
                        AccountBindType accountBindType2 = bVar.f16892a;
                        l.d(accountBindType2, "null cannot be cast to non-null type java.io.Serializable");
                        bundle.putSerializable("bindType", accountBindType2);
                    } else {
                        throw new UnsupportedOperationException(h1.a(AccountBindType.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putBoolean("needPassword", bVar.f16893b);
                    zVar.l(R.id.accountBindFragment, bundle, v.d().a());
                    return tl.l.f28297a;
                }
                l.l("navController");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            MainActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r8) {
            /*
                r7 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r7.f10243e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                mf.a0.k(r8)
                goto L3a
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                mf.a0.k(r8)
                goto L2b
            L1d:
                mf.a0.k(r8)
                r5 = 3000(0xbb8, double:1.482E-320)
                r7.f10243e = r4
                java.lang.Object r8 = mf.a0.g(r5, r7)
                if (r8 != r0) goto L2b
                return r0
            L2b:
                com.topstep.fitcloud.pro.ui.MainActivity r8 = com.topstep.fitcloud.pro.ui.MainActivity.this
                kg.k r8 = r8.C
                if (r8 == 0) goto L55
                r7.f10243e = r3
                java.lang.Object r8 = r8.H(r7)
                if (r8 != r0) goto L3a
                return r0
            L3a:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L52
                com.topstep.fitcloud.pro.ui.MainActivity r8 = com.topstep.fitcloud.pro.ui.MainActivity.this
                androidx.lifecycle.LifecycleCoroutineScopeImpl r8 = rm.l.g(r8)
                com.topstep.fitcloud.pro.ui.MainActivity$b$a r0 = new com.topstep.fitcloud.pro.ui.MainActivity$b$a
                com.topstep.fitcloud.pro.ui.MainActivity r1 = com.topstep.fitcloud.pro.ui.MainActivity.this
                r0.<init>(r1, r2)
                r8.e(r0)
            L52:
                tl.l r8 = tl.l.f28297a
                return r8
            L55:
                java.lang.String r8 = "userInfoRepository"
                gm.l.l(r8)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.MainActivity.b.t(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$3$1", f = "MainActivity.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            MainActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10246e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                this.f10246e = 1;
                if (a0.g(100L, this) == aVar) {
                    return aVar;
                }
            }
            ActivityMainBinding activityMainBinding = MainActivity.this.f10240x;
            if (activityMainBinding != null) {
                BottomNavigationView bottomNavigationView = activityMainBinding.bottomNavView;
                l.e(bottomNavigationView, "viewBind.bottomNavView");
                bottomNavigationView.setVisibility(8);
                ActivityMainBinding activityMainBinding2 = MainActivity.this.f10240x;
                if (activityMainBinding2 != null) {
                    FrameLayout frameLayout = activityMainBinding2.viewNavigationBarScrim;
                    l.e(frameLayout, "viewBind.viewNavigationBarScrim");
                    frameLayout.setVisibility(4);
                    return tl.l.f28297a;
                }
                l.l("viewBind");
                throw null;
            }
            l.l("viewBind");
            throw null;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10248e;

        @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4$1", f = "MainActivity.kt", l = {127}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10250e;

            /* renamed from: f */
            public final /* synthetic */ MainActivity f10251f;

            /* renamed from: com.topstep.fitcloud.pro.ui.MainActivity$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0130a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ MainActivity f10252a;

                public C0130a(MainActivity mainActivity) {
                    this.f10252a = mainActivity;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ag.a aVar = (ag.a) obj;
                    if (aVar != null && aVar.f463b) {
                        ActivityMainBinding activityMainBinding = this.f10252a.f10240x;
                        if (activityMainBinding != null) {
                            activityMainBinding.bottomNavView.a(R.id.deviceFragment).g(true);
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    } else {
                        ActivityMainBinding activityMainBinding2 = this.f10252a.f10240x;
                        if (activityMainBinding2 != null) {
                            j9.a aVar2 = activityMainBinding2.bottomNavView.f4119b.f4102q.get(R.id.deviceFragment);
                            if (aVar2 != null) {
                                aVar2.g(false);
                            }
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    }
                    if (aVar != null && (aVar.f462a || aVar.f464c)) {
                        ActivityMainBinding activityMainBinding3 = this.f10252a.f10240x;
                        if (activityMainBinding3 != null) {
                            activityMainBinding3.bottomNavView.a(R.id.mineFragment).g(true);
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    } else {
                        ActivityMainBinding activityMainBinding4 = this.f10252a.f10240x;
                        if (activityMainBinding4 != null) {
                            j9.a aVar3 = activityMainBinding4.bottomNavView.f4119b.f4102q.get(R.id.mineFragment);
                            if (aVar3 != null) {
                                aVar3.g(false);
                            }
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10251f = mainActivity;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10251f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10250e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    xg.a aVar2 = this.f10251f.f10242z;
                    if (aVar2 != null) {
                        t0 a10 = aVar2.a();
                        C0130a c0130a = new C0130a(this.f10251f);
                        this.f10250e = 1;
                        if (a10.a(c0130a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l.l("noticeRepository");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4$2", f = "MainActivity.kt", l = {141}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10253e;

            /* renamed from: f */
            public final /* synthetic */ MainActivity f10254f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ MainActivity f10255a;

                public a(MainActivity mainActivity) {
                    this.f10255a = mainActivity;
                }

                /* JADX WARN: Removed duplicated region for block: B:57:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x005f  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0080  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(xl.d r7) {
                    /*
                        r6 = this;
                        boolean r0 = r7 instanceof com.topstep.fitcloud.pro.ui.a
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.topstep.fitcloud.pro.ui.a r0 = (com.topstep.fitcloud.pro.ui.a) r0
                        int r1 = r0.f10302g
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10302g = r1
                        goto L18
                    L13:
                        com.topstep.fitcloud.pro.ui.a r0 = new com.topstep.fitcloud.pro.ui.a
                        r0.<init>(r6, r7)
                    L18:
                        java.lang.Object r7 = r0.f10300e
                        yl.a r1 = yl.a.COROUTINE_SUSPENDED
                        int r2 = r0.f10302g
                        r3 = 1
                        r4 = 0
                        if (r2 == 0) goto L34
                        if (r2 != r3) goto L2c
                        com.topstep.fitcloud.pro.ui.MainActivity$d$b$a r0 = r0.f10299d
                        mf.a0.k(r7)     // Catch: java.lang.Exception -> L2a
                        goto L49
                    L2a:
                        r7 = move-exception
                        goto L55
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L34:
                        mf.a0.k(r7)
                        com.topstep.fitcloud.pro.ui.MainActivity r7 = r6.f10255a     // Catch: java.lang.Exception -> L4c
                        zg.b r7 = r7.A     // Catch: java.lang.Exception -> L4c
                        if (r7 == 0) goto L4e
                        r0.f10299d = r6     // Catch: java.lang.Exception -> L4c
                        r0.f10302g = r3     // Catch: java.lang.Exception -> L4c
                        java.lang.Object r7 = r7.b(r0)     // Catch: java.lang.Exception -> L4c
                        if (r7 != r1) goto L48
                        return r1
                    L48:
                        r0 = r6
                    L49:
                        eg.b r7 = (eg.b) r7     // Catch: java.lang.Exception -> L2a
                        goto L5b
                    L4c:
                        r7 = move-exception
                        goto L54
                    L4e:
                        java.lang.String r7 = "versionRepository"
                        gm.l.l(r7)     // Catch: java.lang.Exception -> L4c
                        throw r4     // Catch: java.lang.Exception -> L4c
                    L54:
                        r0 = r6
                    L55:
                        do.a$b r1 = p000do.a.f13275a
                        r1.q(r7)
                        r7 = r4
                    L5b:
                        java.lang.String r1 = "parcelArgs"
                        if (r7 == 0) goto L7e
                        com.topstep.fitcloud.pro.model.version.AppUpgradeInfo r2 = r7.f13617a
                        if (r2 == 0) goto L7e
                        com.topstep.fitcloud.pro.ui.MainActivity r3 = r0.f10255a
                        int r5 = com.topstep.fitcloud.pro.ui.dialog.a.I0
                        android.os.Bundle r5 = new android.os.Bundle
                        r5.<init>()
                        r5.putParcelable(r1, r2)
                        com.topstep.fitcloud.pro.ui.dialog.a r2 = new com.topstep.fitcloud.pro.ui.dialog.a
                        r2.<init>()
                        r2.Z0(r5)
                        androidx.fragment.app.k0 r3 = r3.J()
                        r2.h1(r3, r4)
                    L7e:
                        if (r7 == 0) goto L9f
                        com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo r7 = r7.f13618b
                        if (r7 == 0) goto L9f
                        com.topstep.fitcloud.pro.ui.MainActivity r0 = r0.f10255a
                        int r2 = com.topstep.fitcloud.pro.ui.dialog.e.I0
                        android.os.Bundle r2 = new android.os.Bundle
                        r2.<init>()
                        r2.putParcelable(r1, r7)
                        com.topstep.fitcloud.pro.ui.dialog.e r7 = new com.topstep.fitcloud.pro.ui.dialog.e
                        r7.<init>()
                        r7.Z0(r2)
                        androidx.fragment.app.k0 r0 = r0.J()
                        r7.h1(r0, r4)
                    L9f:
                        tl.l r7 = tl.l.f28297a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.MainActivity.d.b.a.a(xl.d):java.lang.Object");
                }

                @Override // sm.g
                public final /* bridge */ /* synthetic */ Object n(Object obj, xl.d dVar) {
                    wf.b bVar = (wf.b) obj;
                    return a(dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MainActivity mainActivity, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10254f = mainActivity;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10254f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                Object obj2 = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10253e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f10254f.B;
                    if (tVar != null) {
                        f1<wf.b> J = tVar.J();
                        a aVar = new a(this.f10254f);
                        this.f10253e = 1;
                        Object a10 = J.a(new x(aVar), this);
                        if (a10 != obj2) {
                            a10 = tl.l.f28297a;
                        }
                        if (a10 == obj2) {
                            return obj2;
                        }
                    } else {
                        l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4$3", f = "MainActivity.kt", l = {157}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10256e;

            /* renamed from: f */
            public final /* synthetic */ MainActivity f10257f;

            @e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4$3$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class a extends i implements fm.p<Integer, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public /* synthetic */ int f10258e;

                /* renamed from: f */
                public final /* synthetic */ MainActivity f10259f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MainActivity mainActivity, xl.d<? super a> dVar) {
                    super(2, dVar);
                    this.f10259f = mainActivity;
                }

                @Override // fm.p
                public final Object A(Integer num, xl.d<? super tl.l> dVar) {
                    return ((a) p(Integer.valueOf(num.intValue()), dVar)).t(tl.l.f28297a);
                }

                @Override // zl.a
                public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                    a aVar = new a(this.f10259f, dVar);
                    aVar.f10258e = ((Number) obj).intValue();
                    return aVar;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    d7.e eVar;
                    int i10;
                    a0.k(obj);
                    int i11 = this.f10258e;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                ((d7.e) this.f10259f.D.getValue()).a();
                            } else {
                                eVar = (d7.e) this.f10259f.D.getValue();
                                i10 = R.string.sync_data_failed;
                            }
                        } else {
                            eVar = (d7.e) this.f10259f.D.getValue();
                            i10 = R.string.device_state_disconnected;
                        }
                        d7.e.d(eVar, i10, null, 0, 30);
                    } else {
                        d7.e.h((d7.e) this.f10259f.D.getValue(), R.string.sync_data_success, false, 0, 30);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MainActivity mainActivity, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f10257f = mainActivity;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f10257f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10256e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f10257f.B;
                    if (tVar != null) {
                        sm.c n10 = tVar.n();
                        a aVar2 = new a(this.f10257f, null);
                        this.f10256e = 1;
                        if (r.o(n10, aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            MainActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10248e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10248e;
            z0.g(e0Var, null, 0, new a(MainActivity.this, null), 3);
            z0.g(e0Var, null, 0, new b(MainActivity.this, null), 3);
            z0.g(e0Var, null, 0, new c(MainActivity.this, null), 3);
            return tl.l.f28297a;
        }
    }

    public final void M() {
        if (!om.l.c0("fitcloudproGoogle", "google", true)) {
            return;
        }
        z0.g(rm.l.g(this), null, 0, new b(null), 3);
    }

    public final boolean N() {
        ActivityMainBinding activityMainBinding = this.f10240x;
        if (activityMainBinding != null) {
            return activityMainBinding.bottomNavView.getMenu().size() > 3;
        }
        l.l("viewBind");
        throw null;
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        l.e(inflate, "inflate(layoutInflater)");
        this.f10240x = inflate;
        setContentView(inflate.getRoot());
        ActivityMainBinding activityMainBinding = this.f10240x;
        if (activityMainBinding != null) {
            z9.r.a(activityMainBinding.viewNavigationBarScrim, new k0());
            ActivityMainBinding activityMainBinding2 = this.f10240x;
            if (activityMainBinding2 != null) {
                Drawable background = activityMainBinding2.viewNavigationBarScrim.getBackground();
                if (background == null || (background instanceof ColorDrawable)) {
                    f fVar = new f();
                    if (background instanceof ColorDrawable) {
                        fVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
                    }
                    ActivityMainBinding activityMainBinding3 = this.f10240x;
                    if (activityMainBinding3 != null) {
                        fVar.i(activityMainBinding3.viewNavigationBarScrim.getContext());
                        ActivityMainBinding activityMainBinding4 = this.f10240x;
                        if (activityMainBinding4 != null) {
                            fVar.j(activityMainBinding4.viewNavigationBarScrim.getElevation());
                            fVar.n();
                            ActivityMainBinding activityMainBinding5 = this.f10240x;
                            if (activityMainBinding5 != null) {
                                FrameLayout frameLayout = activityMainBinding5.viewNavigationBarScrim;
                                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                                o0.d.q(frameLayout, fVar);
                            } else {
                                l.l("viewBind");
                                throw null;
                            }
                        } else {
                            l.l("viewBind");
                            throw null;
                        }
                    } else {
                        l.l("viewBind");
                        throw null;
                    }
                }
                final boolean N = N();
                ActivityMainBinding activityMainBinding6 = this.f10240x;
                if (activityMainBinding6 != null) {
                    z9.r.a(activityMainBinding6.layoutContent, new s.t0(6));
                    androidx.fragment.app.r D = J().D(R.id.nav_host);
                    l.d(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                    this.f10241y = ((NavHostFragment) D).c1();
                    ActivityMainBinding activityMainBinding7 = this.f10240x;
                    if (activityMainBinding7 != null) {
                        BottomNavigationView bottomNavigationView = activityMainBinding7.bottomNavView;
                        l.e(bottomNavigationView, "viewBind.bottomNavView");
                        z zVar = this.f10241y;
                        if (zVar != null) {
                            bottomNavigationView.setOnItemSelectedListener(new i0(3, zVar));
                            zVar.b(new k2.a(new WeakReference(bottomNavigationView), zVar));
                            z zVar2 = this.f10241y;
                            if (zVar2 != null) {
                                zVar2.b(new m.b() { // from class: ih.w
                                    @Override // i2.m.b
                                    public final void a(i2.m mVar, i2.v vVar) {
                                        boolean z10;
                                        boolean z11 = N;
                                        MainActivity mainActivity = this;
                                        int i10 = MainActivity.E;
                                        gm.l.f(mainActivity, "this$0");
                                        gm.l.f(mVar, "<anonymous parameter 0>");
                                        gm.l.f(vVar, "destination");
                                        int i11 = vVar.f16410h;
                                        boolean z12 = true;
                                        if (i11 != R.id.homePageFragment && i11 != R.id.deviceFragment && i11 != R.id.mineFragment && (!z11 || i11 != R.id.sportFragment)) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        ActivityMainBinding activityMainBinding8 = mainActivity.f10240x;
                                        if (activityMainBinding8 != null) {
                                            BottomNavigationView bottomNavigationView2 = activityMainBinding8.bottomNavView;
                                            gm.l.e(bottomNavigationView2, "viewBind.bottomNavView");
                                            if (bottomNavigationView2.getVisibility() != 0) {
                                                z12 = false;
                                            }
                                            if (z12 != z10) {
                                                if (z10) {
                                                    ActivityMainBinding activityMainBinding9 = mainActivity.f10240x;
                                                    if (activityMainBinding9 != null) {
                                                        BottomNavigationView bottomNavigationView3 = activityMainBinding9.bottomNavView;
                                                        gm.l.e(bottomNavigationView3, "viewBind.bottomNavView");
                                                        bottomNavigationView3.setVisibility(0);
                                                        ActivityMainBinding activityMainBinding10 = mainActivity.f10240x;
                                                        if (activityMainBinding10 != null) {
                                                            FrameLayout frameLayout2 = activityMainBinding10.viewNavigationBarScrim;
                                                            gm.l.e(frameLayout2, "viewBind.viewNavigationBarScrim");
                                                            frameLayout2.setVisibility(0);
                                                            return;
                                                        }
                                                        gm.l.l("viewBind");
                                                        throw null;
                                                    }
                                                    gm.l.l("viewBind");
                                                    throw null;
                                                }
                                                z0.g(rm.l.g(mainActivity), null, 0, new MainActivity.c(null), 3);
                                                return;
                                            }
                                            return;
                                        }
                                        gm.l.l("viewBind");
                                        throw null;
                                    }
                                });
                                androidx.lifecycle.v vVar = this.f701d;
                                l.e(vVar, "lifecycle");
                                h.k(vVar, new d(null));
                                M();
                                return;
                            }
                            l.l("navController");
                            throw null;
                        }
                        l.l("navController");
                        throw null;
                    }
                    l.l("viewBind");
                    throw null;
                }
                l.l("viewBind");
                throw null;
            }
            l.l("viewBind");
            throw null;
        }
        l.l("viewBind");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        b0 b0Var = new b0(false, false, R.id.homePageFragment, true, false, -1, -1, -1, -1);
        z zVar = this.f10241y;
        if (zVar != null) {
            zVar.l(R.id.homePageFragment, null, b0Var);
            M();
            return;
        }
        l.l("navController");
        throw null;
    }
}
