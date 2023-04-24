package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.u;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.topstep.fitcloud.pro.databinding.FragmentBusinessCardBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.q0;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class BusinessCardFragment extends u implements v6.a {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11079w0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11080t0;

    /* renamed from: u0 */
    public final t0 f11081u0;

    /* renamed from: v0 */
    public final a f11082v0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            BusinessCardFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            int i10;
            View view2 = view;
            gm.l.f(view2, "view");
            BusinessCardFragment businessCardFragment = BusinessCardFragment.this;
            mm.h<Object>[] hVarArr = BusinessCardFragment.f11079w0;
            if (gm.l.a(view2, businessCardFragment.h1().itemWechat)) {
                i10 = 33;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemQq)) {
                i10 = 35;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemFacebook)) {
                i10 = 36;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemWhatsapp)) {
                i10 = 37;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemTwitter)) {
                i10 = 38;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemInstagram)) {
                i10 = 39;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemLine)) {
                i10 = 41;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemSkype)) {
                i10 = 43;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemEmail)) {
                i10 = 44;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemPhone)) {
                i10 = 45;
            } else if (gm.l.a(view2, BusinessCardFragment.this.h1().itemLinkedin)) {
                i10 = 46;
            } else {
                throw new IllegalStateException();
            }
            v.l(tb.a.f(BusinessCardFragment.this), new bi.c(i10));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.BusinessCardFragment$onViewCreated$3", f = "BusinessCardFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11085e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            BusinessCardFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11085e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            BusinessCardFragment businessCardFragment = BusinessCardFragment.this;
            mm.h<Object>[] hVarArr = BusinessCardFragment.f11079w0;
            qi.p.f(businessCardFragment.f1(), (Throwable) this.f11085e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.BusinessCardFragment$onViewCreated$5", f = "BusinessCardFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<u6.a<? extends bi.e>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11088e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            BusinessCardFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends bi.e> aVar, xl.d<? super tl.l> dVar) {
            return ((e) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11088e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11088e;
            if (aVar instanceof u6.l) {
                BusinessCardFragment businessCardFragment = BusinessCardFragment.this;
                mm.h<Object>[] hVarArr = BusinessCardFragment.f11079w0;
                businessCardFragment.h1().loadingView.c();
            } else if (aVar instanceof u6.a0) {
                BusinessCardFragment businessCardFragment2 = BusinessCardFragment.this;
                mm.h<Object>[] hVarArr2 = BusinessCardFragment.f11079w0;
                int i20 = 8;
                businessCardFragment2.h1().loadingView.setVisibility(8);
                bi.e eVar = (bi.e) ((u6.a0) aVar).f28523c;
                PreferenceTextView preferenceTextView = BusinessCardFragment.this.h1().itemWechat;
                gm.l.e(preferenceTextView, "viewBind.itemWechat");
                if (eVar.f4273a) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                preferenceTextView.setVisibility(i10);
                PreferenceTextView preferenceTextView2 = BusinessCardFragment.this.h1().itemQq;
                gm.l.e(preferenceTextView2, "viewBind.itemQq");
                if (eVar.f4274b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                preferenceTextView2.setVisibility(i11);
                PreferenceTextView preferenceTextView3 = BusinessCardFragment.this.h1().itemFacebook;
                gm.l.e(preferenceTextView3, "viewBind.itemFacebook");
                if (eVar.f4275c) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                preferenceTextView3.setVisibility(i12);
                PreferenceTextView preferenceTextView4 = BusinessCardFragment.this.h1().itemWhatsapp;
                gm.l.e(preferenceTextView4, "viewBind.itemWhatsapp");
                if (eVar.f4276d) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                preferenceTextView4.setVisibility(i13);
                PreferenceTextView preferenceTextView5 = BusinessCardFragment.this.h1().itemTwitter;
                gm.l.e(preferenceTextView5, "viewBind.itemTwitter");
                if (eVar.f4277e) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                preferenceTextView5.setVisibility(i14);
                PreferenceTextView preferenceTextView6 = BusinessCardFragment.this.h1().itemInstagram;
                gm.l.e(preferenceTextView6, "viewBind.itemInstagram");
                if (eVar.f4278f) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                preferenceTextView6.setVisibility(i15);
                PreferenceTextView preferenceTextView7 = BusinessCardFragment.this.h1().itemLine;
                gm.l.e(preferenceTextView7, "viewBind.itemLine");
                if (eVar.f4279g) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                preferenceTextView7.setVisibility(i16);
                PreferenceTextView preferenceTextView8 = BusinessCardFragment.this.h1().itemSkype;
                gm.l.e(preferenceTextView8, "viewBind.itemSkype");
                if (eVar.f4280h) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                preferenceTextView8.setVisibility(i17);
                PreferenceTextView preferenceTextView9 = BusinessCardFragment.this.h1().itemEmail;
                gm.l.e(preferenceTextView9, "viewBind.itemEmail");
                if (eVar.f4281i) {
                    i18 = 0;
                } else {
                    i18 = 8;
                }
                preferenceTextView9.setVisibility(i18);
                PreferenceTextView preferenceTextView10 = BusinessCardFragment.this.h1().itemPhone;
                gm.l.e(preferenceTextView10, "viewBind.itemPhone");
                if (eVar.f4282j) {
                    i19 = 0;
                } else {
                    i19 = 8;
                }
                preferenceTextView10.setVisibility(i19);
                PreferenceTextView preferenceTextView11 = BusinessCardFragment.this.h1().itemLinkedin;
                gm.l.e(preferenceTextView11, "viewBind.itemLinkedin");
                if (eVar.f4283k) {
                    i20 = 0;
                }
                preferenceTextView11.setVisibility(i20);
            } else if (aVar instanceof u6.g) {
                BusinessCardFragment businessCardFragment3 = BusinessCardFragment.this;
                mm.h<Object>[] hVarArr3 = BusinessCardFragment.f11079w0;
                businessCardFragment3.h1().loadingView.a(R.string.tip_load_error);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f11090b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11090b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f11091b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11091b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f11092b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11092b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f11093b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11093b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11094b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11095c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.d dVar) {
            super(0);
            this.f11094b = rVar;
            this.f11095c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11095c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11094b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(BusinessCardFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBusinessCardBinding;", 0);
        b0.f15488a.getClass();
        f11079w0 = new mm.h[]{tVar};
    }

    public BusinessCardFragment() {
        super(R.layout.fragment_business_card);
        this.f11080t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBusinessCardBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.f11081u0 = ab.b.f(this, b0.a(BusinessCardViewModel.class), new h(a10), new i(a10), new j(this, a10));
        this.f11082v0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(h1().itemWechat, this.f11082v0);
        p.b.g(h1().itemQq, this.f11082v0);
        p.b.g(h1().itemFacebook, this.f11082v0);
        p.b.g(h1().itemWhatsapp, this.f11082v0);
        p.b.g(h1().itemTwitter, this.f11082v0);
        p.b.g(h1().itemInstagram, this.f11082v0);
        p.b.g(h1().itemLine, this.f11082v0);
        p.b.g(h1().itemSkype, this.f11082v0);
        p.b.g(h1().itemEmail, this.f11082v0);
        p.b.g(h1().itemPhone, this.f11082v0);
        p.b.g(h1().itemLinkedin, this.f11082v0);
        h1().loadingView.setListener(new q0(14, this));
        n((BusinessCardViewModel) this.f11081u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.settings.BusinessCardFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, v6.b.i((BusinessCardViewModel) this.f11081u0.getValue()), new c(null), null);
        e((BusinessCardViewModel) this.f11081u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.settings.BusinessCardFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, z.f28636a, new e(null));
    }

    @Override // v6.a
    public final androidx.lifecycle.u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentBusinessCardBinding h1() {
        return (FragmentBusinessCardBinding) this.f11080t0.a(this, f11079w0[0]);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
