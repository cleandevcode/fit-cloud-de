package ni;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import com.topstep.fitcloud.pro.databinding.FragmentSportChartBinding;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import tl.l;
import u6.z;
import ul.q;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class d extends lh.c implements v6.a {

    /* renamed from: o0 */
    public static final /* synthetic */ mm.h<Object>[] f22412o0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f22413m0;

    /* renamed from: n0 */
    public final t0 f22414n0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.detail.SportChartFragment$onViewCreated$1", f = "SportChartFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<ei.a<SportRecord>, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f22415e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            d.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<SportRecord> aVar, xl.d<? super l> dVar) {
            return ((a) p(aVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f22415e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            List<SportHeartRate> list;
            boolean z10;
            int i10;
            a0.k(obj);
            SportRecord sportRecord = (SportRecord) ((ei.a) this.f22415e).f13683a.a();
            if (sportRecord != null) {
                d dVar = d.this;
                mm.h<Object>[] hVarArr = d.f22412o0;
                uf.c value = ((SportDetailViewModel) dVar.f22414n0.getValue()).f12135n.getValue();
                if (value != null) {
                    List<SportHeartRate> list2 = sportRecord.f9637k;
                    if (list2 != null) {
                        list = q.U(list2, new e());
                    } else {
                        list = null;
                    }
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        int i11 = 5;
                        int b10 = hh.b.b(value.f28712c);
                        float f10 = 220 - b10;
                        float[] fArr = {0.9f * f10, 0.8f * f10, 0.7f * f10, f10 * 0.6f, 0.0f};
                        int[] iArr = new int[5];
                        int size = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        while (i13 < size) {
                            int i16 = list.get(i13).f9615b;
                            if (i16 > 0) {
                                i15 += i16;
                                i14++;
                                if (i16 > i12) {
                                    i12 = i16;
                                }
                                int i17 = list.get(i13).f9614a;
                                if (i13 != 0) {
                                    i17 -= list.get(i13 - 1).f9614a;
                                }
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= i11) {
                                        break;
                                    } else if (i16 >= fArr[i18]) {
                                        iArr[i18] = iArr[i18] + i17;
                                        break;
                                    } else {
                                        i18++;
                                        i11 = 5;
                                    }
                                }
                            }
                            i13++;
                            i11 = 5;
                        }
                        if (i14 > 0) {
                            i10 = i15 / i14;
                        } else {
                            i10 = 0;
                        }
                        dVar.e1().tvAvgHeartRate.setText(String.valueOf(i10));
                        dVar.e1().tvMaxHeartRate.setText(String.valueOf(i12));
                        dVar.e1().lineChart.setXAxis(list.get(list.size() - 1).f9614a);
                        dVar.e1().lineChart.setAge(b10);
                        dVar.e1().lineChart.setDatas(list);
                        dVar.e1().circleChart.setValues(iArr);
                        dVar.e1().tvHeartRateValue1.setText(dVar.p0(R.string.unit_minute_param, Integer.valueOf(iArr[4] / 60)));
                        dVar.e1().tvHeartRateValue2.setText(dVar.p0(R.string.unit_minute_param, Integer.valueOf(iArr[3] / 60)));
                        dVar.e1().tvHeartRateValue3.setText(dVar.p0(R.string.unit_minute_param, Integer.valueOf(iArr[2] / 60)));
                        dVar.e1().tvHeartRateValue4.setText(dVar.p0(R.string.unit_minute_param, Integer.valueOf(iArr[1] / 60)));
                        dVar.e1().tvHeartRateValue5.setText(dVar.p0(R.string.unit_minute_param, Integer.valueOf(iArr[0] / 60)));
                    }
                }
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ r f22417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar) {
            super(0);
            this.f22417b = rVar;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f22417b.T0().z();
            gm.l.e(z10, "requireActivity().viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ r f22418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f22418b = rVar;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f22418b.T0().s();
        }
    }

    /* renamed from: ni.d$d */
    /* loaded from: classes2.dex */
    public static final class C0402d extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f22419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0402d(r rVar) {
            super(0);
            this.f22419b = rVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f22419b.T0().r();
            gm.l.e(r10, "requireActivity().defaultViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(d.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportChartBinding;", 0);
        b0.f15488a.getClass();
        f22412o0 = new mm.h[]{tVar};
    }

    public d() {
        super(R.layout.fragment_sport_chart);
        this.f22413m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportChartBinding.class, this);
        this.f22414n0 = ab.b.f(this, b0.a(SportDetailViewModel.class), new b(this), new c(this), new C0402d(this));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        G((SportDetailViewModel) this.f22414n0.getValue(), z.f28636a, new a(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentSportChartBinding e1() {
        return (FragmentSportChartBinding) this.f22413m0.a(this, f22412o0[0]);
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
