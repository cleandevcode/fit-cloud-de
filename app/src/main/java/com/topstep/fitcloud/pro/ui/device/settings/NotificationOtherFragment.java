package com.topstep.fitcloud.pro.ui.device.settings;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.c0;
import bi.m0;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import com.topstep.fitcloud.pro.databinding.FragmentNotificationOtherBinding;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.l;
import i2.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import no.nordicsemi.android.dfu.DfuBaseService;
import og.j1;
import pm.e0;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class NotificationOtherFragment extends c0 {

    /* renamed from: u0 */
    public static final /* synthetic */ h<Object>[] f11220u0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11221r0;

    /* renamed from: s0 */
    public j1 f11222s0;

    /* renamed from: t0 */
    public b f11223t0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f11224a;

        /* renamed from: b */
        public final String f11225b;

        /* renamed from: c */
        public final Drawable f11226c;

        public a(String str, String str2, Drawable drawable) {
            l.f(str, MLApplicationSetting.BundleKeyConstants.AppInfo.appName);
            this.f11224a = str;
            this.f11225b = str2;
            this.f11226c = drawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return l.a(this.f11224a, aVar.f11224a) && l.a(this.f11225b, aVar.f11225b) && l.a(this.f11226c, aVar.f11226c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11226c.hashCode() + t.a(this.f11225b, this.f11224a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("AppInfo(appName=");
            a10.append(this.f11224a);
            a10.append(", packageName=");
            a10.append(this.f11225b);
            a10.append(", appIcon=");
            a10.append(this.f11226c);
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.e<c> {

        /* renamed from: d */
        public final ArrayList<String> f11227d = new ArrayList<>();

        /* renamed from: e */
        public List<a> f11228e;

        /* renamed from: f */
        public a f11229f;

        /* loaded from: classes2.dex */
        public interface a {
            void a(a aVar, boolean z10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            List<a> list = this.f11228e;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(c cVar, int i10) {
            c cVar2 = cVar;
            List<a> list = this.f11228e;
            if (list != null) {
                final a aVar = list.get(i10);
                aVar.f11226c.setBounds(0, 0, 72, 72);
                cVar2.f11230u.getTitleView().setCompoundDrawablePadding(14);
                cVar2.f11230u.getTitleView().setCompoundDrawablesRelative(aVar.f11226c, null, null, null);
                cVar2.f11230u.getTitleView().setText(aVar.f11224a);
                cVar2.f11230u.getSwitchView().setChecked(this.f11227d.contains(aVar.f11225b));
                cVar2.f11230u.getSwitchView().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: bi.n0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        NotificationOtherFragment.b bVar = NotificationOtherFragment.b.this;
                        NotificationOtherFragment.a aVar2 = aVar;
                        gm.l.f(bVar, "this$0");
                        gm.l.f(aVar2, "$item");
                        if (compoundButton.isPressed()) {
                            ArrayList<String> arrayList = bVar.f11227d;
                            if (z10) {
                                arrayList.add(aVar2.f11225b);
                            } else {
                                arrayList.remove(aVar2.f11225b);
                            }
                            NotificationOtherFragment.b.a aVar3 = bVar.f11229f;
                            if (aVar3 != null) {
                                aVar3.a(aVar2, z10);
                            }
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
            l.f(recyclerView, "parent");
            View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_notification_other, (ViewGroup) recyclerView, false);
            l.e(inflate, "from(parent.context).inf…, false\n                )");
            return new c(inflate);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.b0 {

        /* renamed from: u */
        public final PreferenceItem f11230u;

        public c(View view) {
            super(view);
            this.f11230u = (PreferenceItem) view;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements b.a {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$onViewCreated$1$onItemCheckedChange$1", f = "NotificationOtherFragment.kt", l = {53, 55}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11232e;

            /* renamed from: f */
            public final /* synthetic */ boolean f11233f;

            /* renamed from: g */
            public final /* synthetic */ NotificationOtherFragment f11234g;

            /* renamed from: h */
            public final /* synthetic */ a f11235h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, NotificationOtherFragment notificationOtherFragment, a aVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11233f = z10;
                this.f11234g = notificationOtherFragment;
                this.f11235h = aVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11233f, this.f11234g, this.f11235h, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11232e;
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    if (this.f11233f) {
                        j1 j1Var = this.f11234g.f11222s0;
                        if (j1Var != null) {
                            a aVar2 = this.f11235h;
                            String str = aVar2.f11224a;
                            String str2 = aVar2.f11225b;
                            this.f11232e = 1;
                            if (j1Var.h(str, str2, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            l.l("notificationRepository");
                            throw null;
                        }
                    } else {
                        j1 j1Var2 = this.f11234g.f11222s0;
                        if (j1Var2 != null) {
                            String str3 = this.f11235h.f11225b;
                            this.f11232e = 2;
                            if (j1Var2.g(str3, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            l.l("notificationRepository");
                            throw null;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        public d() {
            NotificationOtherFragment.this = r1;
        }

        @Override // com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.b.a
        public final void a(a aVar, boolean z10) {
            z0.g(rm.l.g(NotificationOtherFragment.this), null, 0, new a(z10, NotificationOtherFragment.this, aVar, null), 3);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$onViewCreated$2", f = "NotificationOtherFragment.kt", l = {68, 71}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public List f11236e;

        /* renamed from: f */
        public int f11237f;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$onViewCreated$2$sources$1", f = "NotificationOtherFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super List<? extends a>>, Object> {

            /* renamed from: e */
            public final /* synthetic */ NotificationOtherFragment f11239e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationOtherFragment notificationOtherFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11239e = notificationOtherFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super List<? extends a>> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11239e, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                boolean z10;
                Drawable loadIcon;
                a0.k(obj);
                NotificationOtherFragment notificationOtherFragment = this.f11239e;
                h<Object>[] hVarArr = NotificationOtherFragment.f11220u0;
                PackageManager packageManager = notificationOtherFragment.V0().getPackageManager();
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(DfuBaseService.ERROR_REMOTE_MASK);
                l.e(installedApplications, "if (Build.VERSION.SDK_IN…ALLED_PACKAGES)\n        }");
                Collections.sort(installedApplications, new ApplicationInfo.DisplayNameComparator(packageManager));
                ArrayList arrayList = new ArrayList(installedApplications.size());
                List q10 = h7.a.q("com.tencent.mobileqq", "com.tencent.mm", "com.facebook.katana", "com.twitter.android", "com.whatsapp", "com.skype.raider", "com.skype.rover", "com.instagram.android", "com.google.android.gm", "com.tencent.androidqqmail", "com.netease.mail", "com.netease.mobimail", "com.yahoo.mobile.client.android.mail", "com.microsoft.office.outlook", "com.my.mail", "com.mailbox.email", "com.appple.app.email", "com.tohsoft.mail.email.emailclient", "ru.mail.mailapp", "me.bluemail.mail", "net.daum.android.solmail", "ch.protonmail.android", "park.outlook.sign.in.clint", "park.yahoo.sign.in.app", "com.google.android.apps.inbox", "com.android.email", "com.google.android.gm.lite");
                for (ApplicationInfo applicationInfo : installedApplications) {
                    String str = applicationInfo.name;
                    boolean z11 = false;
                    if (str != null && str.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                        l.e(loadLabel, "app.loadLabel(packageManager)");
                        if (loadLabel.length() == 0) {
                            z11 = true;
                        }
                        if (!z11 && (loadIcon = applicationInfo.loadIcon(packageManager)) != null && !q10.contains(applicationInfo.packageName) && !m0.w(applicationInfo.flags, 1)) {
                            String obj2 = loadLabel.toString();
                            String str2 = applicationInfo.packageName;
                            l.e(str2, "app.packageName");
                            arrayList.add(new a(obj2, str2, loadIcon));
                        }
                    }
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            NotificationOtherFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0077  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r7) {
            /*
                r6 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r6.f11237f
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                java.util.List r0 = r6.f11236e
                mf.a0.k(r7)
                goto L49
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                mf.a0.k(r7)
                goto L34
            L1f:
                mf.a0.k(r7)
                wm.b r7 = pm.o0.f24382b
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$e$a r1 = new com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$e$a
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment r5 = com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.this
                r1.<init>(r5, r2)
                r6.f11237f = r4
                java.lang.Object r7 = bi.z0.s(r6, r7, r1)
                if (r7 != r0) goto L34
                return r0
            L34:
                java.util.List r7 = (java.util.List) r7
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment r1 = com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.this
                og.j1 r1 = r1.f11222s0
                if (r1 == 0) goto L7b
                r6.f11236e = r7
                r6.f11237f = r3
                java.lang.Object r1 = r1.f(r6)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r7
                r7 = r1
            L49:
                java.util.List r7 = (java.util.List) r7
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment r1 = com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.this
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$b r1 = r1.f11223t0
                java.lang.String r3 = "adapter"
                if (r1 == 0) goto L77
                r1.f11228e = r0
                java.util.ArrayList<java.lang.String> r0 = r1.f11227d
                r0.addAll(r7)
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment r7 = com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.this
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment$b r7 = r7.f11223t0
                if (r7 == 0) goto L73
                r7.h()
                com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment r7 = com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentNotificationOtherBinding r7 = r7.f1()
                com.topstep.fitcloud.pro.ui.widget.LoadingView r7 = r7.loadingView
                r0 = 8
                r7.setVisibility(r0)
                tl.l r7 = tl.l.f28297a
                return r7
            L73:
                gm.l.l(r3)
                throw r2
            L77:
                gm.l.l(r3)
                throw r2
            L7b:
                java.lang.String r7 = "notificationRepository"
                gm.l.l(r7)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.NotificationOtherFragment.e.t(java.lang.Object):java.lang.Object");
        }
    }

    static {
        gm.t tVar = new gm.t(NotificationOtherFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentNotificationOtherBinding;", 0);
        b0.f15488a.getClass();
        f11220u0 = new h[]{tVar};
    }

    public NotificationOtherFragment() {
        super(R.layout.fragment_notification_other);
        this.f11221r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentNotificationOtherBinding.class, this);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11223t0 = new b();
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        b bVar = this.f11223t0;
        if (bVar != null) {
            bVar.f11229f = null;
        } else {
            l.l("adapter");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        b bVar = this.f11223t0;
        if (bVar != null) {
            bVar.f11229f = new d();
            RecyclerView recyclerView = f1().recyclerView;
            V0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            f1().recyclerView.g(new oi.a(V0()));
            RecyclerView recyclerView2 = f1().recyclerView;
            b bVar2 = this.f11223t0;
            if (bVar2 != null) {
                recyclerView2.setAdapter(bVar2);
                f1().loadingView.c();
                z0.g(rm.l.g(this), null, 0, new e(null), 3);
                return;
            }
            l.l("adapter");
            throw null;
        }
        l.l("adapter");
        throw null;
    }

    public final FragmentNotificationOtherBinding f1() {
        return (FragmentNotificationOtherBinding) this.f11221r0.a(this, f11220u0[0]);
    }
}
