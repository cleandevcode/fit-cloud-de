package com.topstep.fitcloud.pro.ui.data.ecg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.k0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import bi.r;
import bi.z0;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.databinding.ActivityEcgHealthReportBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.widget.EcgReportHeaderView;
import com.topstep.fitcloudpro.R;
import d7.a;
import gm.b0;
import gm.t;
import java.io.File;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import rh.m0;
import rh.v;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class EcgHealthReportActivity extends m0 implements v6.a {
    public static final /* synthetic */ int F = 0;
    public kg.g A;
    public ActivityEcgHealthReportBinding B;
    public UserInfo C;

    /* renamed from: y */
    public long f10696y;

    /* renamed from: z */
    public dk.a<kg.k> f10697z;

    /* renamed from: x */
    public final tl.d f10695x = qi.p.e(this);
    public final t0 D = new t0(b0.a(EcgHealthReportViewModel.class), new p(this), new o(this), new q(this));
    public final String E = "report_dialog";

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context, EcgRecord ecgRecord, Friend friend) {
            Intent intent = new Intent(context, EcgHealthReportActivity.class);
            intent.putExtra("record", ecgRecord);
            if (friend != null) {
                intent.putExtra("friend", friend);
            }
            context.startActivity(intent);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$10", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<File, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10698e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(File file, xl.d<? super tl.l> dVar) {
            return ((b) p(file, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10698e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            if (((File) this.f10698e) == null) {
                d7.e.d(EcgHealthReportActivity.M(EcgHealthReportActivity.this), R.string.ecg_report_create_failed, null, 0, 30);
            } else {
                d7.e.h(EcgHealthReportActivity.M(EcgHealthReportActivity.this), R.string.ecg_report_create_success, false, 0, 30);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$12", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10701e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10701e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            qi.p.f(EcgHealthReportActivity.M(EcgHealthReportActivity.this), (Throwable) this.f10701e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$13", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<File, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10703e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(File file, xl.d<? super tl.l> dVar) {
            return ((e) p(file, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10703e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            File file = (File) this.f10703e;
            if (file == null) {
                d7.e.e(EcgHealthReportActivity.M(EcgHealthReportActivity.this), "导出心电数据失败");
            } else {
                d7.e M = EcgHealthReportActivity.M(EcgHealthReportActivity.this);
                StringBuilder a10 = android.support.v4.media.d.a("导出心电数据成功：");
                a10.append(file.getPath());
                String sb2 = a10.toString();
                a.b bVar = d7.a.f12825a;
                M.getClass();
                gm.l.f(bVar, "autoCancel");
                d7.d b10 = M.b();
                b10.i1(2, sb2, false, false, bVar, 0);
                b10.h1(M.f12860b, M.f12861c);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$1", f = "EcgHealthReportActivity.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<e0, xl.d<? super UserInfo>, Object> {

        /* renamed from: e */
        public int f10705e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super UserInfo> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10705e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                dk.a<kg.k> aVar2 = EcgHealthReportActivity.this.f10697z;
                if (aVar2 != null) {
                    kg.l m10 = aVar2.get().m(EcgHealthReportActivity.this.f10696y);
                    this.f10705e = 1;
                    obj = r.w(m10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("userInfoRepository");
                    throw null;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends t {

        /* renamed from: g */
        public static final g f10707g = new g();

        public g() {
            super(v.class, "asyncResult", "getAsyncResult()Lcom/github/airbnb/mvrx/Async;", 0);
        }

        @Override // gm.t, mm.f
        public final Object get(Object obj) {
            return ((v) obj).f25744a;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends t {

        /* renamed from: g */
        public static final h f10708g = new h();

        public h() {
            super(v.class, "asyncPdf", "getAsyncPdf()Lcom/github/airbnb/mvrx/Async;", 0);
        }

        @Override // gm.t, mm.f
        public final Object get(Object obj) {
            return ((v) obj).f25745b;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$4", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends zl.i implements fm.q<u6.a<? extends vf.d>, u6.a<? extends File>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ u6.a f10709e;

        /* renamed from: f */
        public /* synthetic */ u6.a f10710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(3, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.q
        public final Object j(u6.a<? extends vf.d> aVar, u6.a<? extends File> aVar2, xl.d<? super tl.l> dVar) {
            i iVar = new i(dVar);
            iVar.f10709e = aVar;
            iVar.f10710f = aVar2;
            return iVar.t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            rh.p pVar;
            rh.p pVar2;
            a0.k(obj);
            u6.a aVar = this.f10709e;
            u6.a aVar2 = this.f10710f;
            if (!(aVar instanceof u6.l) && !(aVar2 instanceof u6.l) && (!(aVar instanceof u6.a0) || !(aVar2 instanceof u6.b0))) {
                EcgHealthReportActivity ecgHealthReportActivity = EcgHealthReportActivity.this;
                int i10 = EcgHealthReportActivity.F;
                androidx.fragment.app.r E = ecgHealthReportActivity.J().E(ecgHealthReportActivity.E);
                if (E instanceof rh.p) {
                    pVar2 = (rh.p) E;
                } else {
                    pVar2 = null;
                }
                if (pVar2 != null && pVar2.t0()) {
                    pVar2.c1(false, false);
                }
            } else {
                EcgHealthReportActivity ecgHealthReportActivity2 = EcgHealthReportActivity.this;
                int i11 = EcgHealthReportActivity.F;
                androidx.fragment.app.r E2 = ecgHealthReportActivity2.J().E(ecgHealthReportActivity2.E);
                if (E2 instanceof rh.p) {
                    pVar = (rh.p) E2;
                } else {
                    pVar = null;
                }
                if (pVar == null) {
                    pVar = new rh.p();
                }
                if (!pVar.t0()) {
                    k0 J = ecgHealthReportActivity2.J();
                    String str = ecgHealthReportActivity2.E;
                    pVar.f2479y0 = false;
                    pVar.f2480z0 = true;
                    J.getClass();
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(J);
                    aVar3.f2578p = true;
                    aVar3.g(0, pVar, str, 1);
                    aVar3.f();
                }
            }
            if (aVar instanceof u6.a0) {
                ActivityEcgHealthReportBinding activityEcgHealthReportBinding = EcgHealthReportActivity.this.B;
                if (activityEcgHealthReportBinding != null) {
                    activityEcgHealthReportBinding.ecgReportHeaderView.setAlgorithmResult((vf.d) ((u6.a0) aVar).f28523c);
                } else {
                    gm.l.l("viewBind");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$6", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10713e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((k) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f10713e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            Throwable th2 = (Throwable) this.f10713e;
            if (th2 instanceof dh.a) {
                d7.e.d(EcgHealthReportActivity.M(EcgHealthReportActivity.this), R.string.ecg_diagnosis_failed, null, 0, 30);
            } else {
                qi.p.f(EcgHealthReportActivity.M(EcgHealthReportActivity.this), th2);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$7", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<vf.d, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(xl.d<? super l> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(vf.d dVar, xl.d<? super tl.l> dVar2) {
            return ((l) p(dVar, dVar2)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new l(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            EcgHealthReportActivity ecgHealthReportActivity = EcgHealthReportActivity.this;
            ActivityEcgHealthReportBinding activityEcgHealthReportBinding = ecgHealthReportActivity.B;
            if (activityEcgHealthReportBinding != null) {
                activityEcgHealthReportBinding.ecgReportView.invalidate();
                ActivityEcgHealthReportBinding activityEcgHealthReportBinding2 = ecgHealthReportActivity.B;
                if (activityEcgHealthReportBinding2 != null) {
                    activityEcgHealthReportBinding2.ecgReportView.getViewTreeObserver().addOnPreDrawListener(new rh.n(ecgHealthReportActivity));
                    return tl.l.f28297a;
                }
                gm.l.l("viewBind");
                throw null;
            }
            gm.l.l("viewBind");
            throw null;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity$onCreate$9", f = "EcgHealthReportActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10717e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(xl.d<? super n> dVar) {
            super(2, dVar);
            EcgHealthReportActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((n) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.f10717e = obj;
            return nVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            qi.p.f(EcgHealthReportActivity.M(EcgHealthReportActivity.this), (Throwable) this.f10717e);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10719b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f10719b = componentActivity;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f10719b.r();
            gm.l.e(r10, "defaultViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentActivity componentActivity) {
            super(0);
            this.f10720b = componentActivity;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f10720b.z();
            gm.l.e(z10, "viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f10721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentActivity componentActivity) {
            super(0);
            this.f10721b = componentActivity;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f10721b.s();
        }
    }

    public static final d7.e M(EcgHealthReportActivity ecgHealthReportActivity) {
        return (d7.e) ecgHealthReportActivity.f10695x.getValue();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    public final EcgHealthReportViewModel N() {
        return (EcgHealthReportViewModel) this.D.getValue();
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, g.f10707g, h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        UserInfo userInfo;
        Context context;
        int i10;
        Resources resources;
        int i11;
        super.onCreate(bundle);
        ActivityEcgHealthReportBinding inflate = ActivityEcgHealthReportBinding.inflate(getLayoutInflater());
        gm.l.e(inflate, "inflate(layoutInflater)");
        this.B = inflate;
        setContentView(inflate.getRoot());
        ActivityEcgHealthReportBinding activityEcgHealthReportBinding = this.B;
        if (activityEcgHealthReportBinding != null) {
            MaterialToolbar materialToolbar = activityEcgHealthReportBinding.toolbarTitle;
            gm.l.e(materialToolbar, "viewBind.toolbarTitle");
            lh.b.b(materialToolbar);
            ActivityEcgHealthReportBinding activityEcgHealthReportBinding2 = this.B;
            if (activityEcgHealthReportBinding2 != null) {
                MaterialToolbar materialToolbar2 = activityEcgHealthReportBinding2.toolbarNavigation;
                gm.l.e(materialToolbar2, "viewBind.toolbarNavigation");
                lh.b.b(materialToolbar2);
                Intent intent = getIntent();
                gm.l.e(intent, "intent");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = (Parcelable) intent.getParcelableExtra("friend", Friend.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("friend");
                }
                Friend friend = (Friend) parcelableExtra;
                if (friend == null || (userInfo = friend.toUserInfo()) == null) {
                    userInfo = (UserInfo) z0.n(new f(null));
                }
                this.C = userInfo;
                ActivityEcgHealthReportBinding activityEcgHealthReportBinding3 = this.B;
                if (activityEcgHealthReportBinding3 != null) {
                    activityEcgHealthReportBinding3.toolbarNavigation.setNavigationOnClickListener(new rh.k(0, this));
                    ActivityEcgHealthReportBinding activityEcgHealthReportBinding4 = this.B;
                    if (activityEcgHealthReportBinding4 != null) {
                        EcgReportHeaderView ecgReportHeaderView = activityEcgHealthReportBinding4.ecgReportHeaderView;
                        EcgRecord ecgRecord = N().f10724l;
                        UserInfo userInfo2 = this.C;
                        if (userInfo2 != null) {
                            kg.g gVar = this.A;
                            if (gVar != null) {
                                boolean a10 = ((uf.b) gVar.a().getValue()).a();
                                kg.g gVar2 = this.A;
                                if (gVar2 != null) {
                                    boolean c10 = ((uf.b) gVar2.a().getValue()).c();
                                    ecgReportHeaderView.getClass();
                                    int type = ecgRecord.getType();
                                    ecgReportHeaderView.f12284a = type;
                                    if (type == 0) {
                                        context = ecgReportHeaderView.getContext();
                                        i10 = R.layout.layout_ecg_report_header_view1;
                                    } else {
                                        context = ecgReportHeaderView.getContext();
                                        i10 = R.layout.layout_ecg_report_header_view2;
                                    }
                                    View.inflate(context, i10, ecgReportHeaderView);
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.text_name)).setText(R.string.ecg_report_user_name);
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.tv_name)).setText(userInfo2.getNickName());
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.text_sex)).setText(R.string.ecg_report_user_sex);
                                    TextView textView = (TextView) ecgReportHeaderView.findViewById(R.id.tv_sex);
                                    if (userInfo2.getSex() == 0) {
                                        resources = ecgReportHeaderView.getResources();
                                        i11 = R.string.user_info_sex_male;
                                    } else {
                                        resources = ecgReportHeaderView.getResources();
                                        i11 = R.string.user_info_sex_female;
                                    }
                                    textView.setText(resources.getString(i11));
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.text_age)).setText(R.string.ecg_report_user_age);
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.tv_age)).setText(String.valueOf(hh.b.b(userInfo2.getBirthday())));
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.text_height)).setText(R.string.ecg_report_user_height);
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.tv_height)).setText(n6.a0.r(ecgReportHeaderView.getContext(), userInfo2.getHeight(), a10));
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.text_weight)).setText(R.string.ecg_report_user_weight);
                                    ((TextView) ecgReportHeaderView.findViewById(R.id.tv_weight)).setText(n6.a0.t(ecgReportHeaderView.getContext(), userInfo2.getWeight(), c10));
                                    ActivityEcgHealthReportBinding activityEcgHealthReportBinding5 = this.B;
                                    if (activityEcgHealthReportBinding5 != null) {
                                        activityEcgHealthReportBinding5.ecgReportView.setData(N().f10724l);
                                        ActivityEcgHealthReportBinding activityEcgHealthReportBinding6 = this.B;
                                        if (activityEcgHealthReportBinding6 != null) {
                                            p.b.g(activityEcgHealthReportBinding6.btnShare, new rh.m(this));
                                            EcgHealthReportViewModel N = N();
                                            g gVar3 = g.f10707g;
                                            h hVar = h.f10708g;
                                            a.C0526a.g(this, N, new i(null));
                                            a.C0526a.b(this, N(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity.j
                                                @Override // gm.t, mm.f
                                                public final Object get(Object obj) {
                                                    return ((v) obj).f25744a;
                                                }
                                            }, v6.b.i(N()), new k(null), new l(null));
                                            a.C0526a.b(this, N(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity.m
                                                @Override // gm.t, mm.f
                                                public final Object get(Object obj) {
                                                    return ((v) obj).f25745b;
                                                }
                                            }, v6.b.i(N()), new n(null), new b(null));
                                            a.C0526a.b(this, N(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity.c
                                                @Override // gm.t, mm.f
                                                public final Object get(Object obj) {
                                                    return ((v) obj).f25746c;
                                                }
                                            }, v6.b.i(N()), new d(null), new e(null));
                                            return;
                                        }
                                        gm.l.l("viewBind");
                                        throw null;
                                    }
                                    gm.l.l("viewBind");
                                    throw null;
                                }
                                gm.l.l("unitConfigRepository");
                                throw null;
                            }
                            gm.l.l("unitConfigRepository");
                            throw null;
                        }
                        gm.l.l("userInfo");
                        throw null;
                    }
                    gm.l.l("viewBind");
                    throw null;
                }
                gm.l.l("viewBind");
                throw null;
            }
            gm.l.l("viewBind");
            throw null;
        }
        gm.l.l("viewBind");
        throw null;
    }
}
