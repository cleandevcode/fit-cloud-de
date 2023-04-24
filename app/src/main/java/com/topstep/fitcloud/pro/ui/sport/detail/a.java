package com.topstep.fitcloud.pro.ui.sport.detail;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.FragmentSportPaceBinding;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.l;
import gm.m;
import gm.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mm.h;
import pm.z1;
import u6.z;
import v6.a;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class a extends ni.b implements v6.a {

    /* renamed from: u0 */
    public static final /* synthetic */ h<Object>[] f12227u0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12228r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportPaceBinding.class, this);

    /* renamed from: s0 */
    public final t0 f12229s0 = ab.b.f(this, b0.a(SportDetailViewModel.class), new e(this), new f(this), new g(this));

    /* renamed from: t0 */
    public Typeface f12230t0;

    /* renamed from: com.topstep.fitcloud.pro.ui.sport.detail.a$a */
    /* loaded from: classes2.dex */
    public static final class C0209a extends RecyclerView.e<b> {

        /* renamed from: d */
        public final List<c> f12231d;

        /* renamed from: e */
        public final int f12232e;

        /* renamed from: f */
        public final int f12233f;

        public C0209a(int i10, int i11, ArrayList arrayList) {
            this.f12231d = arrayList;
            this.f12232e = i10;
            this.f12233f = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            List<c> list = this.f12231d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0090  */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(com.topstep.fitcloud.pro.ui.sport.detail.a.b r12, int r13) {
            /*
                r11 = this;
                com.topstep.fitcloud.pro.ui.sport.detail.a$b r12 = (com.topstep.fitcloud.pro.ui.sport.detail.a.b) r12
                java.util.List<com.topstep.fitcloud.pro.ui.sport.detail.a$c> r0 = r11.f12231d
                if (r0 == 0) goto L9c
                java.lang.Object r0 = ul.q.J(r13, r0)
                com.topstep.fitcloud.pro.ui.sport.detail.a$c r0 = (com.topstep.fitcloud.pro.ui.sport.detail.a.c) r0
                if (r0 != 0) goto L10
                goto L9c
            L10:
                com.topstep.fitcloud.pro.ui.sport.detail.PaceItemView r1 = r12.f12234u
                int r2 = r11.f12233f
                double r2 = (double) r2
                r1.f12217a = r0
                int r4 = r0.f12235a
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L29
                android.content.Context r4 = r1.getContext()
                r7 = 2131952521(0x7f130389, float:1.9541487E38)
                java.lang.String r4 = r4.getString(r7)
                goto L4a
            L29:
                int r4 = r0.f12238d
                java.util.Locale r7 = bi.m0.f4330a
                if (r7 == 0) goto L95
                r8 = 2
                java.lang.Object[] r9 = new java.lang.Object[r8]
                int r10 = r4 / 60
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9[r5] = r10
                int r4 = r4 % 60
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r9[r6] = r4
                java.lang.String r4 = "%02d' %02d\""
                java.lang.String r10 = "format(locale, format, *args)"
                java.lang.String r4 = o5.a0.a(r9, r8, r7, r4, r10)
            L4a:
                r1.f12218b = r4
                r1.f12219c = r2
                int r1 = r0.f12235a
                r2 = 2131100319(0x7f06029f, float:1.7813016E38)
                if (r1 != 0) goto L56
                goto L78
            L56:
                int r0 = r0.f12238d
                int r1 = r11.f12233f
                if (r0 != r1) goto L68
                com.topstep.fitcloud.pro.ui.sport.detail.PaceItemView r0 = r12.f12234u
                android.view.View r1 = r12.f2927a
                android.content.Context r1 = r1.getContext()
                r2 = 2131100317(0x7f06029d, float:1.7813012E38)
                goto L80
            L68:
                int r1 = r11.f12232e
                if (r0 != r1) goto L78
                com.topstep.fitcloud.pro.ui.sport.detail.PaceItemView r0 = r12.f12234u
                android.view.View r1 = r12.f2927a
                android.content.Context r1 = r1.getContext()
                r2 = 2131100318(0x7f06029e, float:1.7813014E38)
                goto L80
            L78:
                com.topstep.fitcloud.pro.ui.sport.detail.PaceItemView r0 = r12.f12234u
                android.view.View r1 = r12.f2927a
                android.content.Context r1 = r1.getContext()
            L80:
                int r1 = y0.a.b(r1, r2)
                r0.setPaceColor(r1)
                com.topstep.fitcloud.pro.ui.sport.detail.PaceItemView r12 = r12.f12234u
                int r0 = r11.e()
                int r0 = r0 - r6
                if (r13 != r0) goto L91
                r5 = 1
            L91:
                r12.setIsLastItem(r5)
                goto L9c
            L95:
                java.lang.String r12 = "systemLocale"
                gm.l.l(r12)
                r12 = 0
                throw r12
            L9c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.sport.detail.a.C0209a.n(androidx.recyclerview.widget.RecyclerView$b0, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
            l.f(recyclerView, "parent");
            View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_sport_detail_pace_item, (ViewGroup) recyclerView, false);
            l.e(inflate, "from(parent.context).inf…pace_item, parent, false)");
            return new b(inflate);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final PaceItemView f12234u;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.pace_item_view);
            l.e(findViewById, "itemView.findViewById(R.id.pace_item_view)");
            this.f12234u = (PaceItemView) findViewById;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final int f12235a;

        /* renamed from: b */
        public int f12236b;

        /* renamed from: c */
        public final float f12237c;

        /* renamed from: d */
        public int f12238d;

        public c(int i10, int i11, int i12, float f10) {
            this.f12235a = i10;
            this.f12236b = i11;
            this.f12237c = f10;
            this.f12238d = i12;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.detail.SportPaceFragment$onViewCreated$1", f = "SportPaceFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements p<ei.a<SportRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f12239e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            a.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<SportRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((d) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f12239e = obj;
            return dVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:142:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0197  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 496
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.sport.detail.a.d.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ r f12241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f12241b = rVar;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f12241b.T0().z();
            l.e(z10, "requireActivity().viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ r f12242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f12242b = rVar;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f12242b.T0().s();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f12243b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f12243b = rVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f12243b.T0().r();
            l.e(r10, "requireActivity().defaultViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(a.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportPaceBinding;", 0);
        b0.f15488a.getClass();
        f12227u0 = new h[]{tVar};
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Typeface a10 = qi.i.a(V0());
        l.e(a10, "getSportTypeFace(requireContext())");
        this.f12230t0 = a10;
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        TextView textView = f1().tvAvgPace;
        Typeface typeface = this.f12230t0;
        if (typeface != null) {
            textView.setTypeface(typeface);
            TextView textView2 = f1().tvMaxPace;
            Typeface typeface2 = this.f12230t0;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
                TextView textView3 = f1().tvMinPace;
                Typeface typeface3 = this.f12230t0;
                if (typeface3 != null) {
                    textView3.setTypeface(typeface3);
                    RecyclerView recyclerView = f1().recyclerView;
                    V0();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    G((SportDetailViewModel) this.f12229s0.getValue(), z.f28636a, new d(null));
                    return;
                }
                l.l("sportTypeface");
                throw null;
            }
            l.l("sportTypeface");
            throw null;
        }
        l.l("sportTypeface");
        throw null;
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentSportPaceBinding f1() {
        return (FragmentSportPaceBinding) this.f12228r0.a(this, f12227u0[0]);
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
