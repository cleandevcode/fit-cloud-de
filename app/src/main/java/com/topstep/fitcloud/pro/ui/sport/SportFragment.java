package com.topstep.fitcloud.pro.ui.sport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.a1;
import androidx.fragment.app.x;
import bi.m0;
import com.github.kilnn.sport.utils.GpsSignalMonitorLifecycleObserverAdapter;
import com.topstep.fitcloud.pro.databinding.FragmentSportBinding;
import com.topstep.fitcloud.pro.model.data.SportTotal;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.sport.SportFragment;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import lg.j0;
import mf.a0;
import mi.h;
import pm.e0;
import si.f;
import tl.l;
import tm.j;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SportFragment extends h {

    /* renamed from: z0 */
    public static final /* synthetic */ mm.h<Object>[] f12136z0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12137t0;

    /* renamed from: u0 */
    public final boolean f12138u0;

    /* renamed from: v0 */
    public c7.b f12139v0;

    /* renamed from: w0 */
    public kg.g f12140w0;

    /* renamed from: x0 */
    public j0 f12141x0;

    /* renamed from: y0 */
    public boolean f12142y0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportFragment$onCreate$1", f = "SportFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            SportFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            si.f fVar = si.f.f27071a;
            SportFragment sportFragment = SportFragment.this;
            gm.l.f(sportFragment, "fragment");
            if (Build.VERSION.SDK_INT >= 23) {
                Context V0 = sportFragment.V0();
                ArrayList f10 = h7.a.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                String string = V0.getString(R.string.permission_location_for_sport);
                gm.l.e(string, "context.getString(R.stri…ssion_location_for_sport)");
                si.f.h(fVar, sportFragment, f10, h7.a.f(new si.c("android.permission-group.LOCATION", string, null)), null);
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<Integer, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            SportFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                SportFragment sportFragment = SportFragment.this;
                mm.h<Object>[] hVarArr = SportFragment.f12136z0;
                sportFragment.i1().gpsSignalView.setGpsSignal(num2.intValue());
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.l<TextView, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            SportFragment.this = r1;
        }

        @Override // fm.l
        public final l k(TextView textView) {
            gm.l.f(textView, "it");
            SportFragment.h1(SportFragment.this, 0);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<TextView, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            SportFragment.this = r1;
        }

        @Override // fm.l
        public final l k(TextView textView) {
            gm.l.f(textView, "it");
            SportFragment.h1(SportFragment.this, 1);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<TextView, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            SportFragment.this = r1;
        }

        @Override // fm.l
        public final l k(TextView textView) {
            gm.l.f(textView, "it");
            SportFragment.h1(SportFragment.this, 2);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            SportFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Button button) {
            gm.l.f(button, "it");
            v.l(tb.a.f(SportFragment.this), new i2.a(R.id.toHistory));
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportFragment$onViewCreated$7", f = "SportFragment.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f12149e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ SportFragment f12151a;

            public a(SportFragment sportFragment) {
                this.f12151a = sportFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                DecimalFormat decimalFormat;
                SportTotal sportTotal = (SportTotal) obj;
                SportFragment sportFragment = this.f12151a;
                mm.h<Object>[] hVarArr = SportFragment.f12136z0;
                TextView textView = sportFragment.i1().tvTotalDistance;
                float f10 = sportTotal.f9647b;
                if (this.f12151a.f12142y0) {
                    decimalFormat = m0.f4331b;
                    if (decimalFormat == null) {
                        gm.l.l("DECIMAL_1_FORMAT");
                        throw null;
                    }
                } else {
                    int i10 = hh.b.f16094a;
                    f10 *= 0.6213712f;
                    decimalFormat = m0.f4331b;
                    if (decimalFormat == null) {
                        gm.l.l("DECIMAL_1_FORMAT");
                        throw null;
                    }
                }
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
                gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                textView.setText(format);
                this.f12151a.i1().btnCumulative.setText(this.f12151a.p0(R.string.sport_cumulative, new Integer(sportTotal.f9646a)));
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            SportFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((g) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new g(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12149e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                j0 j0Var = SportFragment.this.f12141x0;
                if (j0Var != null) {
                    j b10 = j0Var.b();
                    a aVar2 = new a(SportFragment.this);
                    this.f12149e = 1;
                    if (b10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("sportRepository");
                    throw null;
                }
            }
            return l.f28297a;
        }
    }

    static {
        t tVar = new t(SportFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportBinding;", 0);
        b0.f15488a.getClass();
        f12136z0 = new mm.h[]{tVar};
    }

    public SportFragment() {
        super(R.layout.fragment_sport);
        this.f12137t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportBinding.class, this);
        this.f12138u0 = om.l.c0("fitcloudproGoogle", "google", true);
        this.f12142y0 = true;
    }

    public static final void h1(SportFragment sportFragment, final int i10) {
        sportFragment.getClass();
        si.f fVar = si.f.f27071a;
        f.a aVar = new f.a() { // from class: mi.t
            @Override // si.f.a
            public final void b(boolean z10) {
                androidx.fragment.app.o aVar2;
                boolean z11;
                SportFragment sportFragment2 = SportFragment.this;
                int i11 = i10;
                mm.h<Object>[] hVarArr = SportFragment.f12136z0;
                gm.l.f(sportFragment2, "this$0");
                if (z10) {
                    Object systemService = sportFragment2.V0().getSystemService("location");
                    if (systemService != null) {
                        if (((LocationManager) systemService).isProviderEnabled("gps")) {
                            if (sportFragment2.i1().gpsSignalView.f12340c <= 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                aVar2 = new b();
                                Bundle bundle = new Bundle();
                                bundle.putInt("sport_type", i11);
                                aVar2.Z0(bundle);
                            } else {
                                SportingActivity.a aVar3 = SportingActivity.X;
                                Context V0 = sportFragment2.V0();
                                aVar3.getClass();
                                Intent intent = new Intent(V0, SportingActivity.class);
                                intent.putExtra("sport_type", i11);
                                intent.putExtra("from_main", true);
                                V0.startActivity(intent);
                                return;
                            }
                        } else {
                            aVar2 = new a();
                        }
                        aVar2.h1(sportFragment2.h0(), null);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
                }
            }
        };
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            aVar.b(true);
            return;
        }
        Context V0 = sportFragment.V0();
        ArrayList f10 = h7.a.f("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        String string = V0.getString(R.string.permission_location_for_sport);
        gm.l.e(string, "context.getString(R.stri…ssion_location_for_sport)");
        ArrayList f11 = h7.a.f(new si.c("android.permission-group.LOCATION", string, null));
        if (i11 >= 29) {
            f10.add("android.permission.ACTIVITY_RECOGNITION");
            String string2 = V0.getString(R.string.permission_recognition_for_sport);
            gm.l.e(string2, "context.getString(R.stri…on_recognition_for_sport)");
            f11.add(new si.c("android.permission-group.ACTIVITY_RECOGNITION", string2, null));
        }
        si.f.h(fVar, sportFragment, f10, f11, aVar);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        kg.g gVar = this.f12140w0;
        if (gVar != null) {
            this.f12142y0 = ((uf.b) gVar.a().getValue()).a();
            if (this.f12138u0) {
                c7.b bVar = new c7.b(V0());
                this.f12139v0 = bVar;
                this.Z.a(new GpsSignalMonitorLifecycleObserverAdapter(bVar));
                rm.l.g(this).b(new a(null));
                return;
            }
            return;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        MainActivity mainActivity;
        boolean z10;
        TextView textView;
        int i10;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        x f02 = f0();
        if (f02 instanceof MainActivity) {
            mainActivity = (MainActivity) f02;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            z10 = mainActivity.N();
        } else {
            z10 = false;
        }
        if (z10) {
            i1().toolbar.setNavigationIcon((Drawable) null);
        }
        Typeface a10 = qi.i.a(V0());
        if (a10 != null) {
            i1().tvTotalDistance.setTypeface(a10);
        }
        i1().tvTotalDistance.setText("0");
        if (this.f12142y0) {
            textView = i1().tvTotalDistanceUnit;
            i10 = R.string.unit_km;
        } else {
            textView = i1().tvTotalDistanceUnit;
            i10 = R.string.unit_mi;
        }
        textView.setText(i10);
        i1().btnCumulative.setText(p0(R.string.sport_cumulative, 0));
        if (this.f12138u0) {
            c7.b bVar = this.f12139v0;
            if (bVar != null) {
                androidx.lifecycle.a0<Integer> a0Var = bVar.f4548d;
                a1 q02 = q0();
                final b bVar2 = new b();
                a0Var.e(q02, new androidx.lifecycle.b0() { // from class: mi.s
                    @Override // androidx.lifecycle.b0
                    public final void a(Object obj) {
                        fm.l lVar = bVar2;
                        mm.h<Object>[] hVarArr = SportFragment.f12136z0;
                        gm.l.f(lVar, "$tmp0");
                        lVar.k(obj);
                    }
                });
            }
            p.b.g(i1().layoutSportType.tvSportTypeWalk, new c());
            p.b.g(i1().layoutSportType.tvSportTypeOd, new d());
            p.b.g(i1().layoutSportType.tvSportTypeClimb, new e());
        } else {
            i1().gpsSignalView.setVisibility(8);
            i1().layoutSportType.getRoot().setVisibility(8);
        }
        p.b.g(i1().btnCumulative, new f());
        qi.h.k(qi.h.i(this), new g(null));
    }

    public final FragmentSportBinding i1() {
        return (FragmentSportBinding) this.f12137t0.a(this, f12136z0[0]);
    }
}
