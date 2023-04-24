package com.topstep.fitcloud.pro.ui.data;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import androidx.lifecycle.i;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloudpro.R;
import d2.a;
import gm.b0;
import gm.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import n6.a0;
import ph.q0;
import pi.h;
import vf.m;

@Metadata
/* loaded from: classes2.dex */
public final class PressureDetailFragment extends q0<m, r7.c> {
    public TextView A0;
    public TextView B0;

    /* renamed from: y0 */
    public final t0 f10530y0;

    /* renamed from: z0 */
    public TextView f10531z0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(0);
            this.f10532b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10532b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f10533b = aVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10533b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10534b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f10534b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10534b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f10535b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10535b);
            i iVar = b10 instanceof i ? (i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10536b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, tl.d dVar) {
            super(0);
            this.f10536b = rVar;
            this.f10537c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10537c);
            i iVar = b10 instanceof i ? (i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10536b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public PressureDetailFragment() {
        tl.d a10 = fb.e.a(new b(new a(this)));
        this.f10530y0 = ab.b.f(this, b0.a(PressureDetailViewModel.class), new c(a10), new d(a10), new e(this, a10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [r7.a] */
    /* JADX WARN: Type inference failed for: r3v23, types: [r7.a, r7.b] */
    @Override // ph.b, ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        ((Toolbar) view.findViewById(R.id.toolbar)).setTitle(R.string.pressure_detail_title);
        ((TextView) view.findViewById(R.id.tv_highest_unit)).setVisibility(8);
        ((TextView) view.findViewById(R.id.tv_lowest_unit)).setVisibility(8);
        ((TextView) view.findViewById(R.id.tv_avg_unit)).setVisibility(8);
        View findViewById = view.findViewById(R.id.tv_highest);
        l.e(findViewById, "view.findViewById(R.id.tv_highest)");
        this.f10531z0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_lowest);
        l.e(findViewById2, "view.findViewById(R.id.tv_lowest)");
        this.A0 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_avg);
        l.e(findViewById3, "view.findViewById(R.id.tv_avg)");
        this.B0 = (TextView) findViewById3;
        pi.d.a(h1(), 0, 100);
        h hVar = new h(V0());
        hVar.setChartView(h1());
        ((r7.c) h1()).setMarker(hVar);
    }

    @Override // ph.b
    public final r7.c i1() {
        return new r7.c(V0());
    }

    @Override // ph.b
    public final int j1() {
        return R.layout.layout_base_health_detail_info;
    }

    @Override // ph.b
    public final int k1() {
        return R.layout.layout_pressure_detail_tips;
    }

    @Override // ph.b
    public final ph.c m1() {
        return (PressureDetailViewModel) this.f10530y0.getValue();
    }

    @Override // ph.b
    public final void n1(vf.i iVar) {
        boolean z10;
        int i10;
        m mVar = (m) iVar;
        l.f(mVar, "value");
        int i11 = mVar.f29296b;
        List<vf.l> list = mVar.f29297c;
        boolean z11 = false;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = i11;
            for (vf.l lVar : list) {
                int i12 = lVar.f29292b;
                if (i11 < i12) {
                    i11 = i12;
                }
                if (i10 > i12) {
                    i10 = i12;
                }
            }
        } else {
            i10 = i11;
        }
        TextView textView = this.f10531z0;
        if (textView != null) {
            textView.setText(a0.n(i11));
            TextView textView2 = this.A0;
            if (textView2 != null) {
                textView2.setText(a0.n(i10));
                TextView textView3 = this.B0;
                if (textView3 != null) {
                    textView3.setText(a0.n(mVar.f29296b));
                    ((r7.c) h1()).g();
                    if (!((list == null || list.isEmpty()) ? true : true)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        pi.d.b(list, arrayList, arrayList2, null, null, null);
                        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                            pi.d.c((r7.c) h1(), arrayList, arrayList2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                l.l("tvAvg");
                throw null;
            }
            l.l("tvLowest");
            throw null;
        }
        l.l("tvHighest");
        throw null;
    }
}