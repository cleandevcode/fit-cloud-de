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
import gm.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import n6.a0;
import ph.o0;
import pi.g;
import vf.j;
import vf.k;

@Metadata
/* loaded from: classes2.dex */
public final class OxygenDetailFragment extends o0<k, r7.c> {
    public TextView A0;
    public TextView B0;

    /* renamed from: y0 */
    public final t0 f10503y0;

    /* renamed from: z0 */
    public TextView f10504z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10505b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(0);
            this.f10505b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10505b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f10506b = aVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10506b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10507b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f10507b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10507b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f10508b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10508b);
            i iVar = b10 instanceof i ? (i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10509b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, tl.d dVar) {
            super(0);
            this.f10509b = rVar;
            this.f10510c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10510c);
            i iVar = b10 instanceof i ? (i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10509b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    public OxygenDetailFragment() {
        tl.d a10 = fb.e.a(new b(new a(this)));
        this.f10503y0 = ab.b.f(this, b0.a(OxygenDetailViewModel.class), new c(a10), new d(a10), new e(this, a10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [r7.a] */
    /* JADX WARN: Type inference failed for: r3v23, types: [r7.a, r7.b] */
    @Override // ph.b, ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        ((Toolbar) view.findViewById(R.id.toolbar)).setTitle(R.string.oxygen_detail_title);
        ((TextView) view.findViewById(R.id.tv_highest_unit)).setText(R.string.percent);
        ((TextView) view.findViewById(R.id.tv_lowest_unit)).setText(R.string.percent);
        ((TextView) view.findViewById(R.id.tv_avg_unit)).setText(R.string.percent);
        View findViewById = view.findViewById(R.id.tv_highest);
        l.e(findViewById, "view.findViewById(R.id.tv_highest)");
        this.f10504z0 = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_lowest);
        l.e(findViewById2, "view.findViewById(R.id.tv_lowest)");
        this.A0 = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_avg);
        l.e(findViewById3, "view.findViewById(R.id.tv_avg)");
        this.B0 = (TextView) findViewById3;
        pi.d.a(h1(), 80, 110);
        g gVar = new g(V0());
        gVar.setChartView(h1());
        ((r7.c) h1()).setMarker(gVar);
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
        return R.layout.layout_oxygen_detail_tips;
    }

    @Override // ph.b
    public final ph.c m1() {
        return (OxygenDetailViewModel) this.f10503y0.getValue();
    }

    @Override // ph.b
    public final void n1(vf.i iVar) {
        boolean z10;
        int i10;
        k kVar = (k) iVar;
        l.f(kVar, "value");
        int i11 = kVar.f29288b;
        List<j> list = kVar.f29289c;
        boolean z11 = false;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = i11;
            for (j jVar : list) {
                int i12 = jVar.f29284b;
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
        TextView textView = this.f10504z0;
        if (textView != null) {
            textView.setText(a0.k(i11));
            TextView textView2 = this.A0;
            if (textView2 != null) {
                textView2.setText(a0.k(i10));
                TextView textView3 = this.B0;
                if (textView3 != null) {
                    textView3.setText(a0.k(kVar.f29288b));
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
