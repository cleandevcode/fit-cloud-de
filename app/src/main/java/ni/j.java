package ni;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentSportTrackBinding;
import com.topstep.fitcloud.pro.model.data.SportLatLng;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import u6.z;
import v6.a;
import z6.c;

@Metadata
/* loaded from: classes2.dex */
public final class j extends ni.c implements v6.a {

    /* renamed from: v0 */
    public static final /* synthetic */ mm.h<Object>[] f22435v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f22436r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportTrackBinding.class, this);

    /* renamed from: s0 */
    public final t0 f22437s0 = ab.b.f(this, b0.a(SportDetailViewModel.class), new d(this), new e(this), new f(this));

    /* renamed from: t0 */
    public Typeface f22438t0;

    /* renamed from: u0 */
    public z6.g f22439u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            j.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            z6.g gVar = j.this.f22439u0;
            if (gVar != null) {
                z6.f fVar = gVar.f32007b;
                fVar.f31980f = !fVar.f31980f;
                fVar.d();
            }
            j.this.h1();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            j.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            z6.g gVar = j.this.f22439u0;
            if (gVar != null) {
                z6.f fVar = gVar.f32007b;
                fVar.f31981g = !fVar.f31981g;
                fVar.d();
            }
            j.this.g1();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.detail.SportTrackFragment$onViewCreated$3", f = "SportTrackFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<ei.a<SportRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f22442e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            j.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<SportRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((c) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f22442e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10;
            int i11;
            boolean z10;
            a0.k(obj);
            SportRecord sportRecord = (SportRecord) ((ei.a) this.f22442e).f13683a.a();
            if (sportRecord != null) {
                j jVar = j.this;
                mm.h<Object>[] hVarArr = j.f22435v0;
                boolean z11 = ((SportDetailViewModel) jVar.f22437s0.getValue()).f12134m;
                TextView textView = jVar.f1().tvDistanceUnit;
                if (z11) {
                    i10 = R.string.unit_km;
                } else {
                    i10 = R.string.unit_mi;
                }
                textView.setText(i10);
                jVar.f1().tvDistance.setText(n6.a0.e(sportRecord.f9630d, z11));
                TextView textView2 = jVar.f1().tvDuration;
                int i12 = sportRecord.f9629c;
                Locale locale = m0.f4330a;
                ArrayList arrayList = null;
                if (locale != null) {
                    int i13 = i12 % 3600;
                    String format = String.format(locale, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12 / 3600), Integer.valueOf(i13 / 60), Integer.valueOf(i13 % 60)}, 3));
                    gm.l.e(format, "format(locale, format, *args)");
                    textView2.setText(format);
                    TextView textView3 = jVar.f1().tvPace;
                    float d10 = hh.b.d(sportRecord.f9630d, sportRecord.f9629c);
                    if (!z11) {
                        d10 /= 0.6213712f;
                    }
                    textView3.setText(n6.a0.l((int) (d10 * 60)));
                    jVar.f1().tvCalories.setText(n6.a0.c(sportRecord.f9631e));
                    z6.g gVar = jVar.f22439u0;
                    if (gVar != null) {
                        SportingActivity.X.getClass();
                        List<SportLatLng> list = sportRecord.f9636j;
                        if (list != null) {
                            arrayList = new ArrayList(ul.l.B(list, 10));
                            for (SportLatLng sportLatLng : list) {
                                double d11 = sportLatLng.f9618a;
                                double d12 = sportLatLng.f9619b;
                                long j10 = sportLatLng.f9620c;
                                int i14 = sportLatLng.f9621d;
                                if (sportLatLng.f9622e == 1) {
                                    i11 = i14;
                                    z10 = true;
                                } else {
                                    i11 = i14;
                                    z10 = false;
                                }
                                arrayList.add(new y6.f(d11, d12, j10, i11, z10));
                            }
                        }
                        gVar.i(arrayList);
                        z6.f fVar = gVar.f32007b;
                        fVar.f31979e = z11;
                        fVar.d();
                        z6.f fVar2 = gVar.f32007b;
                        fVar2.f31980f = true;
                        fVar2.d();
                        z6.f fVar3 = gVar.f32007b;
                        fVar3.f31982h = true;
                        fVar3.d();
                        z6.f fVar4 = gVar.f32007b;
                        fVar4.f31981g = false;
                        fVar4.d();
                    }
                    jVar.h1();
                    jVar.g1();
                } else {
                    gm.l.l("systemLocale");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ r f22444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(0);
            this.f22444b = rVar;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f22444b.T0().z();
            gm.l.e(z10, "requireActivity().viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ r f22445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f22445b = rVar;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f22445b.T0().s();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f22446b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f22446b = rVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f22446b.T0().r();
            gm.l.e(r10, "requireActivity().defaultViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(j.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportTrackBinding;", 0);
        b0.f15488a.getClass();
        f22435v0 = new mm.h[]{tVar};
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        Typeface a10 = qi.i.a(V0());
        gm.l.e(a10, "getSportTypeFace(requireContext())");
        this.f22438t0 = a10;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.d();
        }
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.e();
        }
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.f(bundle);
        }
    }

    @Override // androidx.fragment.app.r
    public final void M0() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.g();
        }
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.h();
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Context V0 = V0();
        gm.l.f(x6.k.f30377a, "<this>");
        c.a aVar = new c.a(V0, (int) ((V0().getResources().getDisplayMetrics().density * 5.0f) + 0.5f), (int) ((V0().getResources().getDisplayMetrics().density * 12.0f) + 0.5f), (int) ((V0().getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
        FrameLayout frameLayout = f1().layoutMapContainer;
        gm.l.e(frameLayout, "viewBind.layoutMapContainer");
        z6.g gVar = new z6.g(aVar, frameLayout);
        this.f22439u0 = gVar;
        gVar.a(bundle);
        TextView textView = f1().tvDistance;
        Typeface typeface = this.f22438t0;
        if (typeface != null) {
            textView.setTypeface(typeface);
            TextView textView2 = f1().tvPace;
            Typeface typeface2 = this.f22438t0;
            if (typeface2 != null) {
                textView2.setTypeface(typeface2);
                TextView textView3 = f1().tvCalories;
                Typeface typeface3 = this.f22438t0;
                if (typeface3 != null) {
                    textView3.setTypeface(typeface3);
                    TextView textView4 = f1().tvDuration;
                    Typeface typeface4 = this.f22438t0;
                    if (typeface4 != null) {
                        textView4.setTypeface(typeface4);
                        p.b.g(f1().imgShowMap, new a());
                        p.b.g(f1().imgShowDistance, new b());
                        G((SportDetailViewModel) this.f22437s0.getValue(), z.f28636a, new c(null));
                        return;
                    }
                    gm.l.l("sportTypeface");
                    throw null;
                }
                gm.l.l("sportTypeface");
                throw null;
            }
            gm.l.l("sportTypeface");
            throw null;
        }
        gm.l.l("sportTypeface");
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

    public final FragmentSportTrackBinding f1() {
        return (FragmentSportTrackBinding) this.f22436r0.a(this, f22435v0[0]);
    }

    public final void g1() {
        boolean z10;
        ImageView imageView;
        int i10;
        z6.g gVar = this.f22439u0;
        boolean z11 = true;
        if (gVar != null && gVar.f32007b.f31981g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            z11 = (gVar == null || !gVar.f32007b.f31979e) ? false : false;
            imageView = f1().imgShowDistance;
            if (z11) {
                i10 = R.drawable.ic_sport_detail_track_kilometer_show;
            } else {
                i10 = R.drawable.ic_sport_detail_track_mile_show;
            }
        } else {
            z11 = (gVar == null || !gVar.f32007b.f31979e) ? false : false;
            imageView = f1().imgShowDistance;
            if (z11) {
                i10 = R.drawable.ic_sport_detail_track_kilometer_hide;
            } else {
                i10 = R.drawable.ic_sport_detail_track_mile_hide;
            }
        }
        imageView.setImageResource(i10);
    }

    public final void h1() {
        int i10;
        z6.g gVar = this.f22439u0;
        boolean z10 = true;
        z10 = (gVar == null || !gVar.f32007b.f31980f) ? false : false;
        ImageView imageView = f1().imgShowMap;
        if (z10) {
            i10 = R.drawable.ic_sport_detail_show_map;
        } else {
            i10 = R.drawable.ic_sport_detail_hide_map;
        }
        imageView.setImageResource(i10);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }

    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.E = true;
        z6.g gVar = this.f22439u0;
        if (gVar != null) {
            gVar.c();
        }
    }
}
