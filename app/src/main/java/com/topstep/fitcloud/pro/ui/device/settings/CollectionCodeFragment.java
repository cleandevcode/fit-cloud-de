package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.k;
import bi.v;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.topstep.fitcloud.pro.databinding.FragmentCollectionCodeBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.n2;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class CollectionCodeFragment extends v implements v6.a {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11097w0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11098t0;

    /* renamed from: u0 */
    public final t0 f11099u0;

    /* renamed from: v0 */
    public final a f11100v0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            CollectionCodeFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            int i10;
            View view2 = view;
            gm.l.f(view2, "view");
            CollectionCodeFragment collectionCodeFragment = CollectionCodeFragment.this;
            mm.h<Object>[] hVarArr = CollectionCodeFragment.f11097w0;
            if (gm.l.a(view2, collectionCodeFragment.h1().itemQq)) {
                i10 = 4;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemWechat)) {
                i10 = 1;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemAlipay)) {
                i10 = 2;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemPaypal)) {
                i10 = 3;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemPaytm)) {
                i10 = 5;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemPhonePe)) {
                i10 = 6;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemGpay)) {
                i10 = 7;
            } else if (gm.l.a(view2, CollectionCodeFragment.this.h1().itemBhim)) {
                i10 = 8;
            } else {
                throw new IllegalStateException();
            }
            ih.v.l(tb.a.f(CollectionCodeFragment.this), new bi.i(i10));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment$onViewCreated$3", f = "CollectionCodeFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11103e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            CollectionCodeFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11103e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            CollectionCodeFragment collectionCodeFragment = CollectionCodeFragment.this;
            mm.h<Object>[] hVarArr = CollectionCodeFragment.f11097w0;
            qi.p.f(collectionCodeFragment.f1(), (Throwable) this.f11103e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment$onViewCreated$5", f = "CollectionCodeFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<u6.a<? extends k>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11106e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            CollectionCodeFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends k> aVar, xl.d<? super tl.l> dVar) {
            return ((e) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11106e = obj;
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
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11106e;
            if (aVar instanceof u6.l) {
                CollectionCodeFragment collectionCodeFragment = CollectionCodeFragment.this;
                mm.h<Object>[] hVarArr = CollectionCodeFragment.f11097w0;
                collectionCodeFragment.h1().loadingView.c();
            } else if (aVar instanceof u6.a0) {
                CollectionCodeFragment collectionCodeFragment2 = CollectionCodeFragment.this;
                mm.h<Object>[] hVarArr2 = CollectionCodeFragment.f11097w0;
                int i17 = 8;
                collectionCodeFragment2.h1().loadingView.setVisibility(8);
                k kVar = (k) ((u6.a0) aVar).f28523c;
                PreferenceTextView preferenceTextView = CollectionCodeFragment.this.h1().itemQq;
                gm.l.e(preferenceTextView, "viewBind.itemQq");
                if (kVar.f4316a) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                preferenceTextView.setVisibility(i10);
                PreferenceTextView preferenceTextView2 = CollectionCodeFragment.this.h1().itemWechat;
                gm.l.e(preferenceTextView2, "viewBind.itemWechat");
                if (kVar.f4317b) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                preferenceTextView2.setVisibility(i11);
                PreferenceTextView preferenceTextView3 = CollectionCodeFragment.this.h1().itemAlipay;
                gm.l.e(preferenceTextView3, "viewBind.itemAlipay");
                if (kVar.f4318c) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                preferenceTextView3.setVisibility(i12);
                PreferenceTextView preferenceTextView4 = CollectionCodeFragment.this.h1().itemPaypal;
                gm.l.e(preferenceTextView4, "viewBind.itemPaypal");
                if (kVar.f4319d) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                preferenceTextView4.setVisibility(i13);
                PreferenceTextView preferenceTextView5 = CollectionCodeFragment.this.h1().itemPaytm;
                gm.l.e(preferenceTextView5, "viewBind.itemPaytm");
                if (kVar.f4320e) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                preferenceTextView5.setVisibility(i14);
                PreferenceTextView preferenceTextView6 = CollectionCodeFragment.this.h1().itemPhonePe;
                gm.l.e(preferenceTextView6, "viewBind.itemPhonePe");
                if (kVar.f4321f) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                preferenceTextView6.setVisibility(i15);
                PreferenceTextView preferenceTextView7 = CollectionCodeFragment.this.h1().itemGpay;
                gm.l.e(preferenceTextView7, "viewBind.itemGpay");
                if (kVar.f4322g) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                preferenceTextView7.setVisibility(i16);
                PreferenceTextView preferenceTextView8 = CollectionCodeFragment.this.h1().itemBhim;
                gm.l.e(preferenceTextView8, "viewBind.itemBhim");
                if (kVar.f4323h) {
                    i17 = 0;
                }
                preferenceTextView8.setVisibility(i17);
            } else if (aVar instanceof u6.g) {
                CollectionCodeFragment collectionCodeFragment3 = CollectionCodeFragment.this;
                mm.h<Object>[] hVarArr3 = CollectionCodeFragment.f11097w0;
                collectionCodeFragment3.h1().loadingView.a(R.string.tip_load_error);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f11108b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11108b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f11109b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11109b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f11110b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11110b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f11111b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11111b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11112b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.d dVar) {
            super(0);
            this.f11112b = rVar;
            this.f11113c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11113c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11112b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(CollectionCodeFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentCollectionCodeBinding;", 0);
        b0.f15488a.getClass();
        f11097w0 = new mm.h[]{tVar};
    }

    public CollectionCodeFragment() {
        super(R.layout.fragment_collection_code);
        this.f11098t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentCollectionCodeBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.f11099u0 = ab.b.f(this, b0.a(CollectionCodeViewModel.class), new h(a10), new i(a10), new j(this, a10));
        this.f11100v0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(h1().itemQq, this.f11100v0);
        p.b.g(h1().itemWechat, this.f11100v0);
        p.b.g(h1().itemAlipay, this.f11100v0);
        p.b.g(h1().itemPaypal, this.f11100v0);
        p.b.g(h1().itemPaytm, this.f11100v0);
        p.b.g(h1().itemPhonePe, this.f11100v0);
        p.b.g(h1().itemGpay, this.f11100v0);
        p.b.g(h1().itemBhim, this.f11100v0);
        h1().loadingView.setListener(new n2(9, this));
        n((CollectionCodeViewModel) this.f11099u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, v6.b.i((CollectionCodeViewModel) this.f11099u0.getValue()), new c(null), null);
        e((CollectionCodeViewModel) this.f11099u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, z.f28636a, new e(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentCollectionCodeBinding h1() {
        return (FragmentCollectionCodeBinding) this.f11098t0.a(this, f11097w0[0]);
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
