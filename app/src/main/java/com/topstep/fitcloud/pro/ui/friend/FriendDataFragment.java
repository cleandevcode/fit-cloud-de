package com.topstep.fitcloud.pro.ui.friend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.x;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentFriendDataBinding;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.widget.module.Text1ModuleItemView;
import com.topstep.fitcloud.pro.ui.widget.module.Text2ModuleItemView;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.b1;
import ei.j0;
import ei.x0;
import gm.b0;
import gm.t;
import i2.w;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import u6.z;
import v6.a;
import vf.r;

@Metadata
/* loaded from: classes2.dex */
public final class FriendDataFragment extends b1 implements v6.a, j0.a {

    /* renamed from: z0 */
    public static final /* synthetic */ mm.h<Object>[] f11482z0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11483t0;

    /* renamed from: u0 */
    public final i2.g f11484u0;

    /* renamed from: v0 */
    public final t0 f11485v0;

    /* renamed from: w0 */
    public final t0 f11486w0;

    /* renamed from: x0 */
    public final SimpleDateFormat f11487x0;

    /* renamed from: y0 */
    public final a f11488y0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FriendDataFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            i2.m f10;
            w iVar;
            LifecycleCoroutineScopeImpl j10;
            fm.p eVar;
            View view2 = view;
            gm.l.f(view2, "view");
            FriendDataFragment friendDataFragment = FriendDataFragment.this;
            mm.h<Object>[] hVarArr = FriendDataFragment.f11482z0;
            if (gm.l.a(view2, friendDataFragment.i1().cardViewTop)) {
                f10 = tb.a.f(FriendDataFragment.this);
                Friend friend = FriendDataFragment.this.h1().f13742a;
                gm.l.f(friend, "friend");
                iVar = new ei.j(friend);
            } else {
                if (gm.l.a(view2, FriendDataFragment.this.i1().layoutHeartRate)) {
                    j10 = qi.h.j(FriendDataFragment.this);
                    eVar = new com.topstep.fitcloud.pro.ui.friend.a(FriendDataFragment.this, null);
                } else if (gm.l.a(view2, FriendDataFragment.this.i1().layoutOxygen)) {
                    j10 = qi.h.j(FriendDataFragment.this);
                    eVar = new com.topstep.fitcloud.pro.ui.friend.b(FriendDataFragment.this, null);
                } else if (gm.l.a(view2, FriendDataFragment.this.i1().layoutBloodPressure)) {
                    j10 = qi.h.j(FriendDataFragment.this);
                    eVar = new com.topstep.fitcloud.pro.ui.friend.c(FriendDataFragment.this, null);
                } else if (gm.l.a(view2, FriendDataFragment.this.i1().layoutTemperature)) {
                    j10 = qi.h.j(FriendDataFragment.this);
                    eVar = new com.topstep.fitcloud.pro.ui.friend.d(FriendDataFragment.this, null);
                } else if (gm.l.a(view2, FriendDataFragment.this.i1().layoutPressure)) {
                    j10 = qi.h.j(FriendDataFragment.this);
                    eVar = new com.topstep.fitcloud.pro.ui.friend.e(FriendDataFragment.this, null);
                } else {
                    if (gm.l.a(view2, FriendDataFragment.this.i1().layoutEcg)) {
                        f10 = tb.a.f(FriendDataFragment.this);
                        Friend friend2 = FriendDataFragment.this.h1().f13742a;
                        gm.l.f(friend2, "friend");
                        iVar = new ei.i(friend2);
                    }
                    return tl.l.f28297a;
                }
                j10.e(eVar);
                return tl.l.f28297a;
            }
            v.l(f10, iVar);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataFragment$onViewCreated$3", f = "FriendDataFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<ei.p, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11490e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            FriendDataFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.p pVar, xl.d<? super tl.l> dVar) {
            return ((b) p(pVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11490e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            TextView textView;
            int i10;
            a0.k(obj);
            ei.p pVar = (ei.p) this.f11490e;
            String str = ((FriendViewModel) FriendDataFragment.this.f11486w0.getValue()).f11683k.get(Long.valueOf(FriendDataFragment.this.h1().f13742a.getUserId()));
            if (str == null) {
                str = FriendDataFragment.this.h1().f13742a.getMark();
            }
            String nickName = FriendDataFragment.this.h1().f13742a.getNickName();
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                FriendDataFragment.this.i1().infoViewBind.tvDisplayName.setText(nickName);
                FriendDataFragment.this.i1().infoViewBind.tvNickName.setVisibility(8);
            } else {
                FriendDataFragment.this.i1().infoViewBind.tvDisplayName.setText(str);
                FriendDataFragment.this.i1().infoViewBind.tvNickName.setVisibility(0);
                FriendDataFragment.this.i1().infoViewBind.tvNickName.setText(nickName);
            }
            qi.p.a(pVar.f13775a, FriendDataFragment.this.e1());
            u6.a<yf.a> aVar = pVar.f13776b;
            if (aVar instanceof u6.l) {
                FriendDataFragment.this.i1().loadingView.c();
            } else if (aVar instanceof u6.g) {
                FriendDataFragment.this.i1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                yf.a a10 = aVar.a();
                if (a10 == null) {
                    FriendDataFragment.this.i1().loadingView.b(R.string.tip_current_no_data);
                } else {
                    FriendDataFragment.this.i1().loadingView.setVisibility(8);
                    FriendDataFragment friendDataFragment = FriendDataFragment.this;
                    friendDataFragment.i1().tvStepValue.setText(n6.a0.o(a10.f31454a));
                    friendDataFragment.i1().tvSleepHourValue.setText(m0.v(a10.f31456c / 3600));
                    friendDataFragment.i1().tvSleepMinuteValue.setText(m0.v((a10.f31456c % 3600) / 60));
                    friendDataFragment.i1().tvDistanceValue.setText(n6.a0.d(a10.f31455b, ((uf.b) friendDataFragment.j1().f11512l.a().getValue()).a()));
                    if (((uf.b) friendDataFragment.j1().f11512l.a().getValue()).a()) {
                        textView = friendDataFragment.i1().tvDistanceUnit;
                        i10 = R.string.unit_km;
                    } else {
                        textView = friendDataFragment.i1().tvDistanceUnit;
                        i10 = R.string.unit_mi;
                    }
                    textView.setText(i10);
                    vf.f fVar = a10.f31457d;
                    if (fVar != null) {
                        friendDataFragment.i1().layoutHeartRate.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView = friendDataFragment.i1().layoutHeartRate;
                        text1ModuleItemView.f12482h.tvTitle.setText(R.string.heart_rate_module);
                        text1ModuleItemView.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_heart_rate);
                        friendDataFragment.i1().layoutHeartRate.g(fVar.f29280b);
                    }
                    vf.k kVar = a10.f31458e;
                    if (kVar != null) {
                        friendDataFragment.i1().layoutOxygen.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView2 = friendDataFragment.i1().layoutOxygen;
                        text1ModuleItemView2.f12482h.tvTitle.setText(R.string.oxygen_module);
                        text1ModuleItemView2.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_oxygen);
                        friendDataFragment.i1().layoutOxygen.h(kVar.f29288b);
                    }
                    vf.c cVar = a10.f31459f;
                    if (cVar != null) {
                        friendDataFragment.i1().layoutBloodPressure.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView3 = friendDataFragment.i1().layoutBloodPressure;
                        text1ModuleItemView3.f12482h.tvTitle.setText(R.string.blood_pressure_module);
                        text1ModuleItemView3.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_blood_pressure);
                        friendDataFragment.i1().layoutBloodPressure.f(cVar.f29269b, cVar.f29270c);
                    }
                    r rVar = a10.f31460g;
                    if (rVar != null) {
                        friendDataFragment.i1().layoutTemperature.setVisibility(0);
                        Text2ModuleItemView text2ModuleItemView = friendDataFragment.i1().layoutTemperature;
                        text2ModuleItemView.f12483h.tvTitle.setText(R.string.temperature_module);
                        text2ModuleItemView.f12483h.imgIcon.setImageResource(R.drawable.ic_main_module_temperature);
                        if (rVar.f29323b > 0.0f) {
                            friendDataFragment.i1().layoutTemperature.g(rVar.f29323b, rVar.f29324c, ((uf.b) friendDataFragment.j1().f11512l.a().getValue()).b());
                        } else {
                            friendDataFragment.i1().layoutTemperature.f(((uf.b) friendDataFragment.j1().f11512l.a().getValue()).b());
                        }
                    }
                    vf.m mVar = a10.f31461h;
                    if (mVar != null) {
                        friendDataFragment.i1().layoutPressure.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView4 = friendDataFragment.i1().layoutPressure;
                        text1ModuleItemView4.f12482h.tvTitle.setText(R.string.pressure_module);
                        text1ModuleItemView4.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_pressure);
                        friendDataFragment.i1().layoutPressure.i(mVar.f29296b);
                    }
                    if (a10.f31462i) {
                        friendDataFragment.i1().layoutEcg.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView5 = friendDataFragment.i1().layoutEcg;
                        text1ModuleItemView5.f12482h.tvTitle.setText(R.string.ecg_module);
                        text1ModuleItemView5.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_ecg);
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataFragment$onViewCreated$5", f = "FriendDataFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendDataFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11493e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendDataFragment friendDataFragment = FriendDataFragment.this;
            mm.h<Object>[] hVarArr = FriendDataFragment.f11482z0;
            qi.p.f(friendDataFragment.f1(), (Throwable) this.f11493e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataFragment$onViewCreated$6", f = "FriendDataFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            FriendDataFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((e) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendViewModel friendViewModel = (FriendViewModel) FriendDataFragment.this.f11486w0.getValue();
            long userId = FriendDataFragment.this.h1().f13742a.getUserId();
            friendViewModel.getClass();
            z0.g(rm.l.h(friendViewModel), null, 0, new x0(friendViewModel, userId, null), 3);
            tb.a.f(FriendDataFragment.this).q(R.id.friendListFragment, false);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendDataFragment$onViewCreated$8", f = "FriendDataFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            FriendDataFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((g) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f11497e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendDataFragment friendDataFragment = FriendDataFragment.this;
            mm.h<Object>[] hVarArr = FriendDataFragment.f11482z0;
            qi.p.f(friendDataFragment.f1(), (Throwable) this.f11497e);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.fragment.app.r rVar) {
            super(0);
            this.f11499b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11499b).f(R.id.friend_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.i iVar) {
            super(0);
            this.f11500b = iVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            i2.j jVar = (i2.j) this.f11500b.getValue();
            gm.l.e(jVar, "backStackEntry");
            androidx.lifecycle.x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11501b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.r rVar, tl.i iVar) {
            super(0);
            this.f11501b = rVar;
            this.f11502c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11501b.T0();
            i2.j jVar = (i2.j) this.f11502c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(androidx.fragment.app.r rVar) {
            super(0);
            this.f11503b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11503b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f11503b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.fragment.app.r rVar) {
            super(0);
            this.f11504b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f11504b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11505b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f11505b = lVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11505b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f11506b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f11506b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f11507b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11507b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11508b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f11508b = rVar;
            this.f11509c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11509c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11508b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendDataFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendDataBinding;", 0);
        b0.f15488a.getClass();
        f11482z0 = new mm.h[]{tVar};
    }

    public FriendDataFragment() {
        super(R.layout.fragment_friend_data);
        this.f11483t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendDataBinding.class, this);
        this.f11484u0 = new i2.g(b0.a(ei.h.class), new k(this));
        tl.d a10 = fb.e.a(new m(new l(this)));
        this.f11485v0 = ab.b.f(this, b0.a(FriendDataViewModel.class), new n(a10), new o(a10), new p(this, a10));
        tl.i iVar = new tl.i(new h(this));
        this.f11486w0 = ab.b.e(this, b0.a(FriendViewModel.class), new i(iVar), new j(this, iVar));
        this.f11487x0 = m0.n();
        this.f11488y0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // ei.j0.a
    public final void J() {
        FriendDataViewModel j12 = j1();
        long userId = h1().f13742a.getUserId();
        j12.getClass();
        v6.b.f(j12, new ei.l(j12, userId, null), null, ei.m.f13764b, 3);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Friend friend = h1().f13742a;
        Context V0 = V0();
        String avatar = friend.getAvatar();
        ImageView imageView = i1().infoViewBind.imgAvatar;
        gm.l.e(imageView, "viewBind.infoViewBind.imgAvatar");
        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(avatar).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((com.bumptech.glide.n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
        i1().infoViewBind.tvTime.setText(p0(R.string.friends_last_update_time, this.f11487x0.format(new Date(friend.getLastUpdateTime()))));
        i1().toolbar.setOnMenuItemClickListener(new s5.b(this, friend, 3));
        i1().cardViewTop.setClipToOutline(false);
        p.b.g(i1().cardViewTop, this.f11488y0);
        p.b.g(i1().layoutHeartRate, this.f11488y0);
        p.b.g(i1().layoutOxygen, this.f11488y0);
        p.b.g(i1().layoutBloodPressure, this.f11488y0);
        p.b.g(i1().layoutTemperature, this.f11488y0);
        p.b.g(i1().layoutPressure, this.f11488y0);
        p.b.g(i1().layoutEcg, this.f11488y0);
        i1().loadingView.setListener(new s.i(12, this));
        G(j1(), z.f28636a, new b(null));
        a.C0526a.b(this, j1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendDataFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.p) obj).f13775a;
            }
        }, v6.b.i(j1()), new d(null), new e(null));
        n(j1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendDataFragment.f
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.p) obj).f13776b;
            }
        }, v6.b.i(j1()), new g(null), null);
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final ei.h h1() {
        return (ei.h) this.f11484u0.getValue();
    }

    public final FragmentFriendDataBinding i1() {
        return (FragmentFriendDataBinding) this.f11483t0.a(this, f11482z0[0]);
    }

    public final FriendDataViewModel j1() {
        return (FriendDataViewModel) this.f11485v0.getValue();
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
