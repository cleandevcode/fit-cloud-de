package com.topstep.fitcloud.pro.ui.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentSettingsBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.model.version.AppUpgradeInfo;
import com.topstep.fitcloud.pro.ui.auth.AuthActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.a;
import gm.b0;
import gm.t;
import ih.v;
import ii.e0;
import ii.p0;
import ii.q0;
import ii.r0;
import ii.v0;
import ii.w0;
import ii.x0;
import ii.y0;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import mf.a0;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import pm.z1;
import sm.s0;
import u6.z;
import v6.a;
import y0.a;

@Metadata
/* loaded from: classes2.dex */
public final class SettingsFragment extends e0 implements v6.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f11874x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11875t0;

    /* renamed from: u0 */
    public final t0 f11876u0;

    /* renamed from: v0 */
    public final SimpleDateFormat f11877v0;

    /* renamed from: w0 */
    public final a f11878w0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SettingsFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            androidx.fragment.app.o y0Var;
            i2.m f10;
            i2.a aVar;
            View view2 = view;
            gm.l.f(view2, "view");
            SettingsFragment settingsFragment = SettingsFragment.this;
            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
            if (gm.l.a(view2, settingsFragment.h1().itemAccountManage)) {
                if (!hh.b.f(SettingsFragment.this.i1().f11913j)) {
                    f10 = tb.a.f(SettingsFragment.this);
                    aVar = new i2.a(R.id.toAccountManage);
                    v.l(f10, aVar);
                }
                int i10 = AuthActivity.f10303x;
                AuthActivity.a.a(SettingsFragment.this.V0());
            } else if (gm.l.a(view2, SettingsFragment.this.h1().itemCloudSync)) {
                if (!hh.b.f(SettingsFragment.this.i1().f11913j)) {
                    SettingsViewModel i12 = SettingsFragment.this.i1();
                    i12.getClass();
                    v6.b.f(i12, new v0(i12, null), null, w0.f16995b, 3);
                }
                int i102 = AuthActivity.f10303x;
                AuthActivity.a.a(SettingsFragment.this.V0());
            } else {
                if (gm.l.a(view2, SettingsFragment.this.h1().itemBgRunSettings)) {
                    f10 = tb.a.f(SettingsFragment.this);
                    aVar = new i2.a(R.id.toBgRunSettings);
                } else if (gm.l.a(view2, SettingsFragment.this.h1().itemVersionUpdate)) {
                    SettingsViewModel i13 = SettingsFragment.this.i1();
                    i13.getClass();
                    v6.b.f(i13, new q0(i13, null), null, r0.f16982b, 3);
                } else if (gm.l.a(view2, SettingsFragment.this.h1().itemAbout)) {
                    f10 = tb.a.f(SettingsFragment.this);
                    aVar = new i2.a(R.id.toAbout);
                } else {
                    if (gm.l.a(view2, SettingsFragment.this.h1().btnSignOut)) {
                        y0Var = new x0();
                    } else if (gm.l.a(view2, SettingsFragment.this.h1().itemConnectHelp)) {
                        f10 = tb.a.f(SettingsFragment.this);
                        aVar = new i2.a(R.id.toConnectHelp);
                    } else if (gm.l.a(view2, SettingsFragment.this.h1().itemNotificationHelp)) {
                        f10 = tb.a.f(SettingsFragment.this);
                        aVar = new i2.a(R.id.toNotificationHelp);
                    } else if (gm.l.a(view2, SettingsFragment.this.h1().itemTheme)) {
                        y0Var = new y0();
                    }
                    y0Var.h1(SettingsFragment.this.h0(), null);
                }
                v.l(f10, aVar);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$2", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11881e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11881e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SettingsFragment settingsFragment = SettingsFragment.this;
            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
            qi.p.f(settingsFragment.f1(), (Throwable) this.f11881e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$3", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((d) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            int i10 = AuthActivity.f10303x;
            AuthActivity.a.a(SettingsFragment.this.V0());
            SettingsFragment.this.T0().finish();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$5", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11885e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11885e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SettingsFragment settingsFragment = SettingsFragment.this;
            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
            qi.p.f(settingsFragment.f1(), (Throwable) this.f11885e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$6", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<Boolean, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ boolean f11887e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Boolean bool, xl.d<? super tl.l> dVar) {
            return ((g) p(Boolean.valueOf(bool.booleanValue()), dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f11887e = ((Boolean) obj).booleanValue();
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            if (this.f11887e) {
                SettingsFragment settingsFragment = SettingsFragment.this;
                mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                d7.e.h(settingsFragment.f1(), R.string.cloud_sync_success, false, 0, 30);
            } else {
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                mm.h<Object>[] hVarArr2 = SettingsFragment.f11874x0;
                d7.e.d(settingsFragment2.f1(), R.string.cloud_sync_error_time, new a.b(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT), 0, 22);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$8", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11890e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((i) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            i iVar = new i(dVar);
            iVar.f11890e = obj;
            return iVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SettingsFragment settingsFragment = SettingsFragment.this;
            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
            qi.p.f(settingsFragment.f1(), (Throwable) this.f11890e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onCreate$9", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<AppUpgradeInfo, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11892e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(AppUpgradeInfo appUpgradeInfo, xl.d<? super tl.l> dVar) {
            return ((j) p(appUpgradeInfo, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            j jVar = new j(dVar);
            jVar.f11892e = obj;
            return jVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AppUpgradeInfo appUpgradeInfo = (AppUpgradeInfo) this.f11892e;
            if (appUpgradeInfo != null) {
                int i10 = com.topstep.fitcloud.pro.ui.dialog.a.I0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("parcelArgs", appUpgradeInfo);
                com.topstep.fitcloud.pro.ui.dialog.a aVar = new com.topstep.fitcloud.pro.ui.dialog.a();
                aVar.Z0(bundle);
                aVar.h1(SettingsFragment.this.h0(), null);
            } else {
                SettingsFragment settingsFragment = SettingsFragment.this;
                mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                d7.e.f(settingsFragment.f1(), R.string.version_is_latest_version);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$1", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11894e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$1$1", f = "SettingsFragment.kt", l = {109}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11896e;

            /* renamed from: f */
            public final /* synthetic */ SettingsFragment f11897f;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.SettingsFragment$k$a$a */
            /* loaded from: classes2.dex */
            public static final class C0201a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SettingsFragment f11898a;

                public C0201a(SettingsFragment settingsFragment) {
                    this.f11898a = settingsFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    UserInfo userInfo = (UserInfo) obj;
                    String phone = userInfo.getPhone();
                    boolean z11 = false;
                    if (phone != null && phone.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        String email = userInfo.getEmail();
                        if ((email == null || email.length() == 0) ? true : true) {
                            SettingsFragment settingsFragment = this.f11898a;
                            mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                            settingsFragment.h1().itemAccountManage.getTextView().setText(R.string.account_no_bind);
                            return tl.l.f28297a;
                        }
                    }
                    SettingsFragment settingsFragment2 = this.f11898a;
                    mm.h<Object>[] hVarArr2 = SettingsFragment.f11874x0;
                    settingsFragment2.h1().itemAccountManage.getTextView().setText((CharSequence) null);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SettingsFragment settingsFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11897f = settingsFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11897f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11896e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    SettingsFragment settingsFragment = this.f11897f;
                    mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                    s0 s0Var = settingsFragment.i1().f11919p;
                    C0201a c0201a = new C0201a(this.f11897f);
                    this.f11896e = 1;
                    if (s0Var.a(c0201a, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$1$2", f = "SettingsFragment.kt", l = {118}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11899e;

            /* renamed from: f */
            public final /* synthetic */ SettingsFragment f11900f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SettingsFragment f11901a;

                public a(SettingsFragment settingsFragment) {
                    this.f11901a = settingsFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    String p02;
                    long longValue = ((Number) obj).longValue();
                    SettingsFragment settingsFragment = this.f11901a;
                    mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                    TextView textView = settingsFragment.h1().tvLastSyncTime;
                    if (longValue == 0) {
                        p02 = this.f11901a.p0(R.string.cloud_sync_last_sync_time, "");
                    } else {
                        SettingsFragment settingsFragment2 = this.f11901a;
                        p02 = settingsFragment2.p0(R.string.cloud_sync_last_sync_time, settingsFragment2.f11877v0.format(new Date(longValue)));
                    }
                    textView.setText(p02);
                    qi.h.j(this.f11901a).b(new com.topstep.fitcloud.pro.ui.settings.i(this.f11901a, null));
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SettingsFragment settingsFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f11900f = settingsFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((b) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f11900f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11899e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    SettingsFragment settingsFragment = this.f11900f;
                    mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                    s0 s0Var = settingsFragment.i1().f11920q;
                    a aVar2 = new a(this.f11900f);
                    this.f11899e = 1;
                    if (s0Var.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$1$3", f = "SettingsFragment.kt", l = {130}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11902e;

            /* renamed from: f */
            public final /* synthetic */ SettingsFragment f11903f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SettingsFragment f11904a;

                public a(SettingsFragment settingsFragment) {
                    this.f11904a = settingsFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ag.a aVar = (ag.a) obj;
                    if (aVar != null && aVar.f462a) {
                        Context V0 = this.f11904a.V0();
                        Object obj2 = y0.a.f30807a;
                        Drawable b10 = a.c.b(V0, R.drawable.shape_badge);
                        gm.l.c(b10);
                        b10.setBounds(0, 0, b10.getIntrinsicWidth(), b10.getIntrinsicHeight());
                        this.f11904a.h1().itemVersionUpdate.getImageView().setImageDrawable(b10);
                    } else {
                        SettingsFragment settingsFragment = this.f11904a;
                        mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                        settingsFragment.h1().itemVersionUpdate.getImageView().setImageDrawable(null);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SettingsFragment settingsFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f11903f = settingsFragment;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((c) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f11903f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11902e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    SettingsFragment settingsFragment = this.f11903f;
                    mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                    sm.t0 a10 = settingsFragment.i1().f11916m.a();
                    a aVar2 = new a(this.f11903f);
                    this.f11902e = 1;
                    if (a10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((k) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f11894e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            pm.e0 e0Var = (pm.e0) this.f11894e;
            z0.g(e0Var, null, 0, new a(SettingsFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(SettingsFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(SettingsFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsFragment$onViewCreated$2", f = "SettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<p0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11905e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(xl.d<? super l> dVar) {
            super(2, dVar);
            SettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(p0 p0Var, xl.d<? super tl.l> dVar) {
            return ((l) p(p0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            l lVar = new l(dVar);
            lVar.f11905e = obj;
            return lVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            p0 p0Var = (p0) this.f11905e;
            if (!(p0Var.f16976b instanceof u6.l) && !(p0Var.f16977c instanceof u6.l)) {
                SettingsFragment settingsFragment = SettingsFragment.this;
                mm.h<Object>[] hVarArr = SettingsFragment.f11874x0;
                settingsFragment.e1().a();
            } else {
                SettingsFragment settingsFragment2 = SettingsFragment.this;
                mm.h<Object>[] hVarArr2 = SettingsFragment.f11874x0;
                d7.e.g(settingsFragment2.e1());
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(r rVar) {
            super(0);
            this.f11907b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11907b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f11908b = mVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f11908b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f11909b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f11909b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(tl.d dVar) {
            super(0);
            this.f11910b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11910b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11911b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(r rVar, tl.d dVar) {
            super(0);
            this.f11911b = rVar;
            this.f11912c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11912c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11911b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(SettingsFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSettingsBinding;", 0);
        b0.f15488a.getClass();
        f11874x0 = new mm.h[]{tVar};
    }

    public SettingsFragment() {
        super(R.layout.fragment_settings);
        this.f11875t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSettingsBinding.class, this);
        tl.d a10 = fb.e.a(new n(new m(this)));
        this.f11876u0 = ab.b.f(this, b0.a(SettingsViewModel.class), new o(a10), new p(a10), new q(this, a10));
        this.f11877v0 = m0.n();
        this.f11878w0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.SettingsFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((p0) obj).f16975a;
            }
        }, v6.b.i(i1()), new c(null), new d(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.SettingsFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((p0) obj).f16976b;
            }
        }, v6.b.i(i1()), new f(null), new g(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.SettingsFragment.h
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((p0) obj).f16977c;
            }
        }, v6.b.i(i1()), new i(null), new j(null));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        boolean f10 = hh.b.f(i1().f11913j);
        int i10 = 8;
        if (f10) {
            h1().itemAccountManage.getTextView().setText(R.string.account_sign_in);
            h1().itemCloudSync.setVisibility(8);
        } else {
            qi.h.k(qi.h.i(this), new k(null));
        }
        G(i1(), z.f28636a, new l(null));
        p.b.g(h1().itemAccountManage, this.f11878w0);
        p.b.g(h1().itemCloudSync, this.f11878w0);
        p.b.g(h1().itemBgRunSettings, this.f11878w0);
        p.b.g(h1().itemVersionUpdate, this.f11878w0);
        p.b.g(h1().itemAbout, this.f11878w0);
        p.b.g(h1().itemConnectHelp, this.f11878w0);
        p.b.g(h1().itemNotificationHelp, this.f11878w0);
        p.b.g(h1().itemTheme, this.f11878w0);
        Button button = h1().btnSignOut;
        gm.l.e(button, "viewBind.btnSignOut");
        if (!f10) {
            i10 = 0;
        }
        button.setVisibility(i10);
        p.b.g(h1().btnSignOut, this.f11878w0);
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentSettingsBinding h1() {
        return (FragmentSettingsBinding) this.f11875t0.a(this, f11874x0[0]);
    }

    public final SettingsViewModel i1() {
        return (SettingsViewModel) this.f11876u0.getValue();
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
