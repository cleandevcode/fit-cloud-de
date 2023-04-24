package com.topstep.fitcloud.pro.ui.settings.assist;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.i1;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentAssistBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.dialog.MessageDialogFragment;
import com.topstep.fitcloudpro.R;
import d2.a;
import gm.b0;
import gm.t;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import mf.a0;
import p000do.a;
import pm.z1;
import s.n2;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class AssistFragment extends ji.k implements v6.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f11946x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11947t0;

    /* renamed from: u0 */
    public final t0 f11948u0;

    /* renamed from: v0 */
    public sg.a f11949v0;

    /* renamed from: w0 */
    public final a f11950w0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AssistFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            AssistFragment assistFragment = AssistFragment.this;
            mm.h<Object>[] hVarArr = AssistFragment.f11946x0;
            if (gm.l.a(view2, assistFragment.h1().itemDeviceInfo)) {
                try {
                    tb.a.f(AssistFragment.this).l(R.id.toDeviceInfo, new Bundle(), v.d().a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemLocalDfu)) {
                tb.a.f(AssistFragment.this).l(R.id.hardwareUpgradeFragment, null, v.d().a());
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemUiInfo)) {
                AssistViewModel i12 = AssistFragment.this.i1();
                i12.getClass();
                v6.b.f(i12, new ji.g(i12, null), null, ji.h.f17854b, 3);
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemSleepRaw)) {
                AssistViewModel i13 = AssistFragment.this.i1();
                i13.getClass();
                v6.b.f(i13, new ji.e(i13, null), null, ji.f.f17851b, 3);
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemAssistInfo)) {
                AssistViewModel i14 = AssistFragment.this.i1();
                i14.getClass();
                v6.b.f(i14, new ji.c(i14, null), null, ji.d.f17848b, 3);
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemWeather)) {
                Object systemService = AssistFragment.this.V0().getSystemService("location");
                if (systemService != null) {
                    if (!d1.g.a((LocationManager) systemService)) {
                        new com.topstep.fitcloud.pro.ui.dialog.j().h1(AssistFragment.this.h0(), null);
                    } else {
                        si.f fVar = si.f.f27071a;
                        AssistFragment assistFragment2 = AssistFragment.this;
                        fVar.k(assistFragment2, new n2(12, assistFragment2));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
                }
            } else if (gm.l.a(view2, AssistFragment.this.h1().itemLog)) {
                z0.g(qi.h.j(AssistFragment.this), null, 0, new com.topstep.fitcloud.pro.ui.settings.assist.a(AssistFragment.this, null), 3);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$10", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<qj.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11952e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(qj.a aVar, xl.d<? super tl.l> dVar) {
            return ((b) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11952e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            String aVar = ((qj.a) this.f11952e).toString();
            gm.l.e(aVar, "it.toString()");
            a.b bVar = p000do.a.f13275a;
            bVar.t("AssistInfo");
            bVar.h(aVar, new Object[0]);
            int i10 = MessageDialogFragment.B0;
            MessageDialogFragment.a.a(AssistFragment.this.V0().getString(R.string.assist_request_assist_info), aVar).h1(AssistFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$1", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<ji.b, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11954e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ji.b bVar, xl.d<? super tl.l> dVar) {
            return ((c) p(bVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11954e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ji.b bVar = (ji.b) this.f11954e;
            if (!(bVar.f17843a instanceof u6.l) && !(bVar.f17844b instanceof u6.l) && !(bVar.f17845c instanceof u6.l)) {
                AssistFragment assistFragment = AssistFragment.this;
                mm.h<Object>[] hVarArr = AssistFragment.f11946x0;
                assistFragment.e1().a();
            } else {
                AssistFragment assistFragment2 = AssistFragment.this;
                mm.h<Object>[] hVarArr2 = AssistFragment.f11946x0;
                d7.e.g(assistFragment2.e1());
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$3", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11957e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AssistFragment assistFragment = AssistFragment.this;
            mm.h<Object>[] hVarArr = AssistFragment.f11946x0;
            qi.p.f(assistFragment.f1(), (Throwable) this.f11957e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$4", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<rj.e, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(rj.e eVar, xl.d<? super tl.l> dVar) {
            return ((f) p(eVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11959e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            rj.e eVar = (rj.e) this.f11959e;
            String d10 = i1.d(new Object[]{new Integer(eVar.f25772a), new Integer(eVar.f25773b), new Integer(eVar.f25774c)}, 3, "UI Num:%d\nUI Serial:%d\nStyle Index:%d", "format(this, *args)");
            a.b bVar = p000do.a.f13275a;
            bVar.t("UiInfo");
            bVar.h(d10, new Object[0]);
            int i10 = MessageDialogFragment.B0;
            MessageDialogFragment.a.a(AssistFragment.this.V0().getString(R.string.assist_request_ui_info), d10).h1(AssistFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$6", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11962e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((h) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f11962e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AssistFragment assistFragment = AssistFragment.this;
            mm.h<Object>[] hVarArr = AssistFragment.f11946x0;
            qi.p.f(assistFragment.f1(), (Throwable) this.f11962e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$7", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends zl.i implements fm.p<List<? extends qj.b>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11964e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(List<? extends qj.b> list, xl.d<? super tl.l> dVar) {
            return ((i) p(list, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            i iVar = new i(dVar);
            iVar.f11964e = obj;
            return iVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            StringBuilder sb2 = new StringBuilder();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
            Date date = new Date();
            for (qj.b bVar : (List) this.f11964e) {
                date.setTime(bVar.f24936a);
                sb2.append(simpleDateFormat.format(date) + " -> " + bVar.f24937b + '\n');
            }
            String sb3 = sb2.toString();
            gm.l.e(sb3, "sb.toString()");
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("SleepRawData");
            bVar2.h(sb3, new Object[0]);
            int i10 = MessageDialogFragment.B0;
            MessageDialogFragment.a.a(AssistFragment.this.V0().getString(R.string.assist_request_sleep_raw), sb3).h1(AssistFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment$onViewCreated$9", f = "AssistFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11967e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(2, dVar);
            AssistFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((k) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f11967e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AssistFragment assistFragment = AssistFragment.this;
            mm.h<Object>[] hVarArr = AssistFragment.f11946x0;
            qi.p.f(assistFragment.f1(), (Throwable) this.f11967e);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11969b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(r rVar) {
            super(0);
            this.f11969b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11969b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f11970b = lVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11970b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11971b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f11971b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11971b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f11972b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11972b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11973b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(r rVar, tl.d dVar) {
            super(0);
            this.f11973b = rVar;
            this.f11974c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11974c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11973b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(AssistFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAssistBinding;", 0);
        b0.f15488a.getClass();
        f11946x0 = new mm.h[]{tVar};
    }

    public AssistFragment() {
        super(R.layout.fragment_assist);
        this.f11947t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAssistBinding.class, this);
        tl.d a10 = fb.e.a(new m(new l(this)));
        this.f11948u0 = ab.b.f(this, b0.a(AssistViewModel.class), new n(a10), new o(a10), new p(this, a10));
        this.f11950w0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(h1().itemDeviceInfo, this.f11950w0);
        p.b.g(h1().itemLocalDfu, this.f11950w0);
        p.b.g(h1().itemUiInfo, this.f11950w0);
        p.b.g(h1().itemSleepRaw, this.f11950w0);
        p.b.g(h1().itemAssistInfo, this.f11950w0);
        p.b.g(h1().itemWeather, this.f11950w0);
        p.b.g(h1().itemLog, this.f11950w0);
        G(i1(), z.f28636a, new c(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ji.b) obj).f17843a;
            }
        }, v6.b.i(i1()), new e(null), new f(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment.g
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ji.b) obj).f17844b;
            }
        }, v6.b.i(i1()), new h(null), new i(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment.j
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ji.b) obj).f17845c;
            }
        }, v6.b.i(i1()), new k(null), new b(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentAssistBinding h1() {
        return (FragmentAssistBinding) this.f11947t0.a(this, f11946x0[0]);
    }

    public final AssistViewModel i1() {
        return (AssistViewModel) this.f11948u0.getValue();
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
