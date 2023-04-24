package com.topstep.fitcloud.pro.ui.data;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.i;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloudpro.R;
import d2.a;
import gm.b0;
import gm.l;
import gm.m;
import java.util.ArrayList;
import java.util.List;
import kg.g;
import kotlin.Metadata;
import n6.a0;
import ph.t0;
import s.x2;
import s7.f;
import vf.q;
import vf.r;

@Metadata
/* loaded from: classes2.dex */
public final class TemperatureDetailFragment extends t0<r, r7.c> {
    public static final /* synthetic */ int I0 = 0;
    public boolean A0;
    public TextView B0;
    public TextView C0;
    public TextView D0;
    public TextView E0;
    public TextView F0;
    public TextView G0;
    public x2 H0;

    /* renamed from: y0 */
    public final androidx.lifecycle.t0 f10587y0;

    /* renamed from: z0 */
    public g f10588z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.r rVar) {
            super(0);
            this.f10589b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f10589b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f10590b = aVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10590b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f10591b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10591b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f10592b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10592b);
            i iVar = b10 instanceof i ? (i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10593b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f10593b = rVar;
            this.f10594c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10594c);
            i iVar = b10 instanceof i ? (i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10593b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public TemperatureDetailFragment() {
        tl.d a10 = fb.e.a(new b(new a(this)));
        this.f10587y0 = ab.b.f(this, b0.a(TemperatureDetailViewModel.class), new c(a10), new d(a10), new e(this, a10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v45, types: [r7.a, r7.b] */
    @Override // ph.b, ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        TextView textView;
        int i10;
        int i11;
        int i12;
        r7.a aVar;
        l.f(view, "view");
        super.O0(view, bundle);
        g gVar = this.f10588z0;
        if (gVar != null) {
            this.A0 = ((uf.b) gVar.a().getValue()).b();
            ((Toolbar) view.findViewById(R.id.toolbar)).setTitle(R.string.temperature_detail_title);
            if (this.A0) {
                textView = (TextView) view.findViewById(R.id.tv_body_highest_unit);
                i10 = R.string.unit_centigrade;
            } else {
                textView = (TextView) view.findViewById(R.id.tv_body_highest_unit);
                i10 = R.string.unit_fahrenheit;
            }
            textView.setText(i10);
            ((TextView) view.findViewById(R.id.tv_body_avg_unit)).setText(i10);
            ((TextView) view.findViewById(R.id.tv_body_lowest_unit)).setText(i10);
            ((TextView) view.findViewById(R.id.tv_wrist_highest_unit)).setText(i10);
            ((TextView) view.findViewById(R.id.tv_wrist_avg_unit)).setText(i10);
            ((TextView) view.findViewById(R.id.tv_wrist_lowest_unit)).setText(i10);
            View findViewById = view.findViewById(R.id.tv_body_highest);
            l.e(findViewById, "view.findViewById(R.id.tv_body_highest)");
            this.B0 = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_body_lowest);
            l.e(findViewById2, "view.findViewById(R.id.tv_body_lowest)");
            this.C0 = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tv_body_avg);
            l.e(findViewById3, "view.findViewById(R.id.tv_body_avg)");
            this.D0 = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tv_wrist_highest);
            l.e(findViewById4, "view.findViewById(R.id.tv_wrist_highest)");
            this.E0 = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tv_wrist_lowest);
            l.e(findViewById5, "view.findViewById(R.id.tv_wrist_lowest)");
            this.F0 = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tv_wrist_avg);
            l.e(findViewById6, "view.findViewById(R.id.tv_wrist_avg)");
            this.G0 = (TextView) findViewById6;
            if (this.A0) {
                i11 = 36;
                i12 = 42;
                aVar = h1();
            } else {
                this.H0 = new x2(4);
                i11 = 96;
                i12 = 108;
                aVar = h1();
            }
            pi.d.a(aVar, i11, i12);
            ((r7.c) h1()).getLegend().f26656a = true;
            ((r7.c) h1()).getLegend().f26669l = 6;
            ((r7.c) h1()).getLegend().f26665h = 1;
            ((r7.c) h1()).getLegend().f26666i = 1;
            f fVar = new f();
            fVar.f26681a = o0(R.string.temperature_body);
            fVar.f26686f = y0.a.b(V0(), R.color.temperature_body_color);
            f fVar2 = new f();
            fVar2.f26681a = o0(R.string.temperature_wrist);
            fVar2.f26686f = y0.a.b(V0(), R.color.temperature_wrist_color);
            s7.e legend = ((r7.c) h1()).getLegend();
            legend.f26663f = new f[]{fVar, fVar2};
            legend.f26664g = true;
            pi.m mVar = new pi.m(V0(), this.A0);
            mVar.setChartView(h1());
            ((r7.c) h1()).setMarker(mVar);
            return;
        }
        l.l("unitConfigRepository");
        throw null;
    }

    @Override // ph.b
    public final r7.c i1() {
        return new r7.c(V0());
    }

    @Override // ph.b
    public final int j1() {
        return R.layout.layout_temperature_detail_info;
    }

    @Override // ph.b
    public final int k1() {
        return R.layout.layout_temperature_detail_tips;
    }

    @Override // ph.b
    public final ph.c m1() {
        return (TemperatureDetailViewModel) this.f10587y0.getValue();
    }

    @Override // ph.b
    public final void n1(vf.i iVar) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        boolean z11;
        float[] fArr;
        r rVar = (r) iVar;
        l.f(rVar, "value");
        float f13 = rVar.f29324c;
        float f14 = rVar.f29323b;
        List<q> list = rVar.f29325d;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            f10 = f14;
            f11 = f10;
            f12 = f13;
            for (q qVar : list) {
                float f15 = qVar.f29318c;
                if (f13 < f15) {
                    f13 = f15;
                }
                if (f12 > f15) {
                    f12 = f15;
                }
                float f16 = qVar.f29317b;
                if (f10 < f16) {
                    f10 = f16;
                }
                if (f11 > f16) {
                    f11 = f16;
                }
            }
        } else {
            f10 = f14;
            f11 = f10;
            f12 = f13;
        }
        TextView textView = this.E0;
        if (textView != null) {
            textView.setText(a0.p(f13, this.A0));
            TextView textView2 = this.B0;
            if (textView2 != null) {
                textView2.setText(a0.p(f10, this.A0));
                TextView textView3 = this.G0;
                if (textView3 != null) {
                    textView3.setText(a0.p(rVar.f29324c, this.A0));
                    TextView textView4 = this.D0;
                    if (textView4 != null) {
                        textView4.setText(a0.p(rVar.f29323b, this.A0));
                        TextView textView5 = this.F0;
                        if (textView5 != null) {
                            textView5.setText(a0.p(f12, this.A0));
                            TextView textView6 = this.C0;
                            if (textView6 != null) {
                                textView6.setText(a0.p(f11, this.A0));
                                ((r7.c) h1()).g();
                                if (list != null && !list.isEmpty()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (!z11) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    pi.d.b(list, arrayList, arrayList2, arrayList3, this.H0, new float[2]);
                                    if (!arrayList.isEmpty() && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                                        float f17 = 3;
                                        ((r7.c) h1()).getAxisLeft().f(((float) Math.floor(fArr[0])) - f17);
                                        ((r7.c) h1()).getAxisLeft().e(((float) Math.ceil(fArr[1])) + f17);
                                        pi.d.d((r7.c) h1(), arrayList, arrayList2, arrayList3, y0.a.b(V0(), R.color.temperature_body_color), y0.a.b(V0(), R.color.temperature_wrist_color));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            l.l("tvBodyLowest");
                            throw null;
                        }
                        l.l("tvWristLowest");
                        throw null;
                    }
                    l.l("tvBodyAvg");
                    throw null;
                }
                l.l("tvWristAvg");
                throw null;
            }
            l.l("tvBodyHighest");
            throw null;
        }
        l.l("tvWristHighest");
        throw null;
    }
}
