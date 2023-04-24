package ni;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentSportDetailBinding;
import com.topstep.fitcloud.pro.databinding.ItemSportDetailGirdBinding;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.h1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class f extends ni.a implements v6.a {

    /* renamed from: u0 */
    public static final /* synthetic */ mm.h<Object>[] f22420u0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f22421r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportDetailBinding.class, this);

    /* renamed from: s0 */
    public final t0 f22422s0 = ab.b.f(this, b0.a(SportDetailViewModel.class), new e(this), new C0403f(this), new g(this));

    /* renamed from: t0 */
    public Typeface f22423t0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<c> {

        /* renamed from: d */
        public final List<b> f22424d;

        /* renamed from: e */
        public final Typeface f22425e;

        public a(ArrayList arrayList, Typeface typeface) {
            this.f22424d = arrayList;
            this.f22425e = typeface;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int e() {
            return this.f22424d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(c cVar, int i10) {
            c cVar2 = cVar;
            cVar2.f22428u.tvValue.setTypeface(this.f22425e);
            cVar2.f22428u.tvValue.setText(this.f22424d.get(i10).f22427b);
            cVar2.f22428u.tvText.setText(this.f22424d.get(i10).f22426a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
            l.f(recyclerView, "parent");
            ItemSportDetailGirdBinding inflate = ItemSportDetailGirdBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
            return new c(inflate);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final String f22426a;

        /* renamed from: b */
        public final String f22427b;

        public b(String str, String str2) {
            this.f22426a = str;
            this.f22427b = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemSportDetailGirdBinding f22428u;

        public c(ItemSportDetailGirdBinding itemSportDetailGirdBinding) {
            super(itemSportDetailGirdBinding.getRoot());
            this.f22428u = itemSportDetailGirdBinding;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.detail.SportDetailFragment$onViewCreated$1", f = "SportDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<ei.a<SportRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f22429e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            f.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<SportRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((d) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f22429e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10;
            TextView textView;
            DecimalFormat decimalFormat;
            String format;
            int i11;
            int i12;
            int i13;
            boolean z10;
            int i14;
            int i15;
            int i16;
            boolean z11;
            float f10;
            int i17;
            a0.k(obj);
            SportRecord sportRecord = (SportRecord) ((ei.a) this.f22429e).f13683a.a();
            if (sportRecord != null) {
                f fVar = f.this;
                mm.h<Object>[] hVarArr = f.f22420u0;
                boolean z12 = ((SportDetailViewModel) fVar.f22422s0.getValue()).f12134m;
                int a10 = SportRecord.a.a(sportRecord.f9635i);
                if (a10 != 0) {
                    TextView textView2 = fVar.f1().tvMainAttrUnit;
                    if (a10 != 1) {
                        textView2.setText(R.string.unit_k_calorie);
                        textView = fVar.f1().tvMainAttr;
                        int i18 = (int) sportRecord.f9631e;
                        Locale locale = m0.f4330a;
                        if (locale != null) {
                            format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i18)}, 1));
                            l.e(format, "format(locale, format, *args)");
                        } else {
                            l.l("systemLocale");
                            throw null;
                        }
                    } else {
                        textView2.setText(R.string.unit_step);
                        textView = fVar.f1().tvMainAttr;
                        int i19 = sportRecord.f9632f;
                        Locale locale2 = m0.f4330a;
                        if (locale2 != null) {
                            format = o5.a0.a(new Object[]{Integer.valueOf(i19)}, 1, locale2, "%d", "format(locale, format, *args)");
                        } else {
                            l.l("systemLocale");
                            throw null;
                        }
                    }
                } else {
                    TextView textView3 = fVar.f1().tvMainAttrUnit;
                    if (z12) {
                        i10 = R.string.unit_km;
                    } else {
                        i10 = R.string.unit_mi;
                    }
                    textView3.setText(i10);
                    textView = fVar.f1().tvMainAttr;
                    float f11 = sportRecord.f9630d;
                    if (z12) {
                        decimalFormat = m0.f4331b;
                        if (decimalFormat == null) {
                            l.l("DECIMAL_1_FORMAT");
                            throw null;
                        }
                    } else {
                        int i20 = hh.b.f16094a;
                        f11 *= 0.6213712f;
                        decimalFormat = m0.f4331b;
                        if (decimalFormat == null) {
                            l.l("DECIMAL_1_FORMAT");
                            throw null;
                        }
                    }
                    format = decimalFormat.format(Double.parseDouble(String.valueOf(f11)));
                    l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                }
                textView.setText(format);
                fVar.f1().tvTime.setText(m0.n().format(sportRecord.f9628b));
                int i21 = sportRecord.f9635i;
                if (i21 <= 0) {
                    i12 = 0;
                } else {
                    if (i21 <= 0) {
                        i11 = 0;
                    } else {
                        i11 = (i21 - 1) % 4;
                    }
                    i12 = i21 - i11;
                }
                ArrayList arrayList = new ArrayList(10);
                String o02 = fVar.o0(R.string.sport_use_time);
                l.e(o02, "getString(R.string.sport_use_time)");
                int i22 = sportRecord.f9629c;
                int i23 = i12;
                int i24 = i22 % 3600;
                arrayList.add(new b(o02, o5.a0.a(new Object[]{Integer.valueOf(i22 / 3600), Integer.valueOf(i24 / 60), Integer.valueOf(i24 % 60)}, 3, m0.r(), "%02d:%02d:%02d", "format(locale, format, *args)")));
                if (a10 == 0) {
                    if (z12) {
                        i17 = R.string.sport_unit_pace_min_per_km;
                    } else {
                        i17 = R.string.sport_unit_pace_min_per_mi;
                    }
                    String o03 = fVar.o0(i17);
                    l.e(o03, "if (isLengthMetric) {\n  …mi)\n                    }");
                    float d10 = hh.b.d(sportRecord.f9630d, sportRecord.f9629c);
                    if (!z12) {
                        d10 /= 0.6213712f;
                    }
                    arrayList.add(new b(o03, n6.a0.l((int) (d10 * 60))));
                }
                if (a10 != 2) {
                    String o04 = fVar.o0(R.string.sport_unit_consumes_k_calorie);
                    l.e(o04, "getString(R.string.sport_unit_consumes_k_calorie)");
                    int i25 = (int) sportRecord.f9631e;
                    Locale locale3 = m0.f4330a;
                    if (locale3 != null) {
                        arrayList.add(new b(o04, o5.a0.a(new Object[]{Integer.valueOf(i25)}, 1, locale3, "%d", "format(locale, format, *args)")));
                    } else {
                        l.l("systemLocale");
                        throw null;
                    }
                }
                float f12 = 0.0f;
                if (a10 == 0) {
                    if (z12) {
                        i16 = R.string.sport_unit_speed_km_per_hour;
                    } else {
                        i16 = R.string.sport_unit_speed_mi_per_hour;
                    }
                    String o05 = fVar.o0(i16);
                    l.e(o05, "if (isLengthMetric) {\n  …ur)\n                    }");
                    float d11 = hh.b.d(sportRecord.f9630d, sportRecord.f9629c);
                    if (!z12) {
                        d11 /= 0.6213712f;
                    }
                    if (d11 == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        f10 = 60 / d11;
                    } else {
                        f10 = 0.0f;
                    }
                    DecimalFormat decimalFormat2 = m0.f4331b;
                    if (decimalFormat2 != null) {
                        String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f10)));
                        l.e(format2, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                        arrayList.add(new b(o05, format2));
                    } else {
                        l.l("DECIMAL_1_FORMAT");
                        throw null;
                    }
                }
                if (a10 != 0) {
                    String o06 = fVar.o0(R.string.sport_step_count);
                    l.e(o06, "getString(R.string.sport_step_count)");
                    b bVar = new b(o06, n6.a0.o(sportRecord.f9632f));
                    i13 = i23;
                    if (i13 == 21) {
                        arrayList.add(1, bVar);
                    } else {
                        arrayList.add(bVar);
                    }
                    int i26 = sportRecord.f9629c;
                    if (i26 > 0) {
                        i15 = (int) ((sportRecord.f9632f / i26) * 60);
                    } else {
                        i15 = 0;
                    }
                    String o07 = fVar.o0(R.string.sport_unit_step_rate_step_per_minute);
                    l.e(o07, "getString(R.string.sport…tep_rate_step_per_minute)");
                    arrayList.add(new b(o07, n6.a0.o(i15)));
                    int i27 = sportRecord.f9632f;
                    if (i27 != 0) {
                        f12 = ((sportRecord.f9630d * 1000) * 100) / i27;
                    }
                    String o08 = fVar.o0(R.string.sport_unit_step_length_cm);
                    l.e(o08, "getString(R.string.sport_unit_step_length_cm)");
                    arrayList.add(new b(o08, m0.i(f12)));
                } else {
                    i13 = i23;
                }
                if (i13 == 5 || i13 == 13 || i13 == 17) {
                    String o09 = fVar.o0(R.string.sport_unit_total_climb_m);
                    l.e(o09, "getString(R.string.sport_unit_total_climb_m)");
                    arrayList.add(new b(o09, m0.v((int) sportRecord.f9633g)));
                }
                List<SportHeartRate> list = sportRecord.f9637k;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    int i28 = 0;
                    int i29 = 0;
                    for (SportHeartRate sportHeartRate : list) {
                        int i30 = sportHeartRate.f9615b;
                        if (i30 > 0) {
                            i29 += i30;
                            i28++;
                        }
                    }
                    if (i28 > 0) {
                        i14 = i29 / i28;
                    } else {
                        i14 = 0;
                    }
                    String o010 = fVar.o0(R.string.sport_unit_avg_heart_rate);
                    l.e(o010, "getString(R.string.sport_unit_avg_heart_rate)");
                    Locale locale4 = m0.f4330a;
                    if (locale4 != null) {
                        arrayList.add(new b(o010, o5.a0.a(new Object[]{Integer.valueOf(i14)}, 1, locale4, "%d", "format(locale, format, *args)")));
                    } else {
                        l.l("systemLocale");
                        throw null;
                    }
                }
                RecyclerView recyclerView = fVar.f1().recyclerView;
                Typeface typeface = fVar.f22423t0;
                if (typeface != null) {
                    recyclerView.setAdapter(new a(arrayList, typeface));
                } else {
                    l.l("sportTypeface");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ r f22431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f22431b = rVar;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f22431b.T0().z();
            l.e(z10, "requireActivity().viewModelStore");
            return z10;
        }
    }

    /* renamed from: ni.f$f */
    /* loaded from: classes2.dex */
    public static final class C0403f extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ r f22432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0403f(r rVar) {
            super(0);
            this.f22432b = rVar;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f22432b.T0().s();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f22433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f22433b = rVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f22433b.T0().r();
            l.e(r10, "requireActivity().defaultViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(f.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportDetailBinding;", 0);
        b0.f15488a.getClass();
        f22420u0 = new mm.h[]{tVar};
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Typeface a10 = qi.i.a(V0());
        l.e(a10, "getSportTypeFace(requireContext())");
        this.f22423t0 = a10;
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        TextView textView = f1().tvMainAttr;
        Typeface typeface = this.f22423t0;
        if (typeface != null) {
            textView.setTypeface(typeface);
            int p10 = h1.p(V0(), 3);
            RecyclerView recyclerView = f1().recyclerView;
            V0();
            recyclerView.setLayoutManager(new GridLayoutManager(p10));
            G((SportDetailViewModel) this.f22422s0.getValue(), z.f28636a, new d(null));
            return;
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

    public final FragmentSportDetailBinding f1() {
        return (FragmentSportDetailBinding) this.f22421r0.a(this, f22420u0[0]);
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
