package com.topstep.fitcloud.pro.ui.sport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import b7.b;
import bi.m0;
import bi.z0;
import com.github.kilnn.sport.utils.GpsSignalMonitorLifecycleObserverAdapter;
import com.github.kilnn.tool.widget.FitPaddingMaterialToolbar;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.o;
import java.util.Arrays;
import java.util.Locale;
import k1.l2;
import kg.k;
import kotlin.Metadata;
import mf.a0;
import mi.d0;
import mi.i0;
import mi.m;
import mi.o0;
import mi.p0;
import mi.q0;
import mi.r0;
import mi.s0;
import mm.h;
import p000do.a;
import pm.e0;
import tl.i;
import tl.l;
import z6.c;

@Metadata
/* loaded from: classes2.dex */
public final class SportingActivity extends m implements d0.b {
    public static final a X;
    public static final /* synthetic */ h<Object>[] Y;
    public boolean A;
    public uf.c B;
    public c7.b C;
    public LayoutSportingRootBinding D;
    public LayoutSportingMapContainerBinding E;
    public z6.g F;
    public kg.g H;
    public k L;
    public boolean V;
    public boolean W;

    /* renamed from: z */
    public Typeface f12183z;

    /* renamed from: x */
    public final im.a f12181x = new im.a();

    /* renamed from: y */
    public final im.a f12182y = new im.a();
    public final t0 M = new t0(b0.a(SportingViewMode.class), new d(this), new c(this), new e(this));
    public final i Q = new i(new f());
    public final i U = new i(new g());

    /* loaded from: classes2.dex */
    public static final class a {
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportingActivity$onCreate$1", f = "SportingActivity.kt", l = {197}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f12184e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ SportingActivity f12186a;

            public a(SportingActivity sportingActivity) {
                this.f12186a = sportingActivity;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                SportGoal sportGoal = (SportGoal) obj;
                SportingActivity sportingActivity = this.f12186a;
                a aVar = SportingActivity.X;
                sportingActivity.S();
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            SportingActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            ((b) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12184e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                SportingActivity sportingActivity = SportingActivity.this;
                a aVar2 = SportingActivity.X;
                sm.t0 t0Var = ((SportingViewMode) sportingActivity.M.getValue()).f12193e;
                a aVar3 = new a(SportingActivity.this);
                this.f12184e = 1;
                if (t0Var.a(aVar3, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f12187b = componentActivity;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10 = this.f12187b.r();
            gm.l.e(r10, "defaultViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f12188b = componentActivity;
        }

        @Override // fm.a
        public final x0 m() {
            x0 z10 = this.f12188b.z();
            gm.l.e(z10, "viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ ComponentActivity f12189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f12189b = componentActivity;
        }

        @Override // fm.a
        public final d2.a m() {
            return this.f12189b.s();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<com.topstep.fitcloud.pro.ui.sport.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(0);
            SportingActivity.this = r1;
        }

        @Override // fm.a
        public final com.topstep.fitcloud.pro.ui.sport.a m() {
            return new com.topstep.fitcloud.pro.ui.sport.a(SportingActivity.this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<b7.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            SportingActivity.this = r1;
        }

        @Override // fm.a
        public final b7.b m() {
            SportingActivity sportingActivity = SportingActivity.this;
            return new b7.b(sportingActivity, (b.a) sportingActivity.Q.getValue());
        }
    }

    static {
        o oVar = new o(SportingActivity.class, "sportType", "getSportType()I");
        b0.f15488a.getClass();
        Y = new h[]{oVar, new o(SportingActivity.class, "fromMain", "getFromMain()Z")};
        X = new a();
    }

    public static final void M(SportingActivity sportingActivity, TextSwitcher textSwitcher, String str) {
        sportingActivity.getClass();
        View nextView = textSwitcher.getNextView();
        gm.l.d(nextView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) nextView;
        textView.setText(str);
        if (gm.l.a("GO!", str)) {
            Typeface typeface = sportingActivity.f12183z;
            if (typeface == null) {
                gm.l.l("sportTypeface");
                throw null;
            }
            textView.setTypeface(typeface, 2);
        }
        textSwitcher.showNext();
    }

    public static final void N(SportingActivity sportingActivity, y6.e eVar) {
        LayoutSportingRootBinding layoutSportingRootBinding = sportingActivity.D;
        if (layoutSportingRootBinding != null) {
            int i10 = eVar.f31183c;
            Locale locale = m0.f4330a;
            if (locale != null) {
                int i11 = i10 % 3600;
                String a10 = o5.a0.a(new Object[]{Integer.valueOf(i10 / 3600), Integer.valueOf(i11 / 60), Integer.valueOf(i11 % 60)}, 3, locale, "%02d:%02d:%02d", "format(locale, format, *args)");
                layoutSportingRootBinding.tvNormalDuration.setText(a10);
                String e10 = n6.a0.e(eVar.f31184d, sportingActivity.A);
                layoutSportingRootBinding.tvNormalMainValue.setText(e10);
                float f10 = eVar.f31189i;
                if (!sportingActivity.A) {
                    int i12 = hh.b.f16094a;
                    f10 /= 0.6213712f;
                }
                String l10 = n6.a0.l((int) (f10 * 60));
                if (sportingActivity.P() == 2) {
                    TextView textView = layoutSportingRootBinding.tvNormalLeftValue;
                    int i13 = eVar.f31186f;
                    Locale locale2 = m0.f4330a;
                    if (locale2 != null) {
                        String format = String.format(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                        gm.l.e(format, "format(locale, format, *args)");
                        textView.setText(format);
                    } else {
                        gm.l.l("systemLocale");
                        throw null;
                    }
                } else {
                    layoutSportingRootBinding.tvNormalLeftValue.setText(l10);
                }
                String c10 = n6.a0.c(eVar.f31185e);
                layoutSportingRootBinding.tvNormalCalorieValue.setText(c10);
                LayoutSportingMapContainerBinding layoutSportingMapContainerBinding = sportingActivity.E;
                if (layoutSportingMapContainerBinding != null) {
                    layoutSportingMapContainerBinding.tvMapDuration.setText(a10);
                    layoutSportingMapContainerBinding.tvMapDistance.setText(e10);
                    layoutSportingMapContainerBinding.tvMapPace.setText(l10);
                    layoutSportingMapContainerBinding.tvMapCalorie.setText(c10);
                    sportingActivity.S();
                    return;
                }
                return;
            }
            gm.l.l("systemLocale");
            throw null;
        }
    }

    public final b7.b O() {
        return (b7.b) this.U.getValue();
    }

    public final int P() {
        return ((Number) this.f12181x.a(this, Y[0])).intValue();
    }

    @SuppressLint({"RestrictedApi"})
    public final void Q() {
        TextView textView;
        int i10;
        int i11;
        boolean z10;
        ViewGroup viewGroup;
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.ts_count_down);
        if (textSwitcher != null) {
            ViewParent parent = textSwitcher.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(textSwitcher);
            }
        }
        LayoutSportingRootBinding bind = LayoutSportingRootBinding.bind(((ViewStub) findViewById(R.id.view_stub_sporting_root)).inflate());
        this.D = bind;
        gm.l.e(bind, "bind(findViewById<ViewSt…alViewBind = it\n        }");
        CircularRevealFrameLayout root = bind.getRoot();
        gm.l.e(root, "normalViewBind.root");
        lh.b.a(root);
        FitPaddingMaterialToolbar fitPaddingMaterialToolbar = bind.toolBar;
        gm.l.e(fitPaddingMaterialToolbar, "normalViewBind.toolBar");
        lh.b.b(fitPaddingMaterialToolbar);
        bind.toolBar.setOnMenuItemClickListener(new jc.f(12, this));
        TextView textView2 = bind.tvNormalDuration;
        Typeface typeface = this.f12183z;
        if (typeface != null) {
            textView2.setTypeface(typeface);
            TextView textView3 = bind.tvNormalMainValue;
            Typeface typeface2 = this.f12183z;
            if (typeface2 != null) {
                textView3.setTypeface(typeface2);
                TextView textView4 = bind.tvNormalLeftValue;
                Typeface typeface3 = this.f12183z;
                if (typeface3 != null) {
                    textView4.setTypeface(typeface3);
                    TextView textView5 = bind.tvNormalCalorieValue;
                    Typeface typeface4 = this.f12183z;
                    if (typeface4 != null) {
                        textView5.setTypeface(typeface4);
                        if (this.A) {
                            bind.tvNormalMainValueUnit.setText(R.string.unit_km);
                        } else {
                            bind.tvNormalMainValueUnit.setText(R.string.unit_mi);
                        }
                        if (P() == 2) {
                            bind.imgNormalLeftIcon.setImageResource(R.drawable.ic_sport_data_freq);
                            TextView textView6 = bind.tvNormalLeftValue;
                            Locale locale = m0.f4330a;
                            if (locale != null) {
                                String format = String.format(locale, "%02d", Arrays.copyOf(new Object[]{0}, 1));
                                gm.l.e(format, "format(locale, format, *args)");
                                textView6.setText(format);
                                bind.imgChangeModeToMap.setVisibility(8);
                            } else {
                                gm.l.l("systemLocale");
                                throw null;
                            }
                        } else {
                            LayoutSportingMapContainerBinding bind2 = LayoutSportingMapContainerBinding.bind(bind.viewStubMapContainer.inflate());
                            this.E = bind2;
                            gm.l.e(bind2, "bind(normalViewBind.view…apViewBind = it\n        }");
                            FrameLayout root2 = bind2.getRoot();
                            gm.l.e(root2, "mapViewBind.root");
                            lh.b.b(root2);
                            TextView textView7 = bind2.tvMapDistance;
                            Typeface typeface5 = this.f12183z;
                            if (typeface5 != null) {
                                textView7.setTypeface(typeface5);
                                TextView textView8 = bind2.tvMapPace;
                                Typeface typeface6 = this.f12183z;
                                if (typeface6 != null) {
                                    textView8.setTypeface(typeface6);
                                    TextView textView9 = bind2.tvMapCalorie;
                                    Typeface typeface7 = this.f12183z;
                                    if (typeface7 != null) {
                                        textView9.setTypeface(typeface7);
                                        TextView textView10 = bind2.tvMapDuration;
                                        Typeface typeface8 = this.f12183z;
                                        if (typeface8 != null) {
                                            textView10.setTypeface(typeface8);
                                            if (this.A) {
                                                bind2.tvMapDistanceUnit.setText(R.string.unit_km);
                                                textView = bind2.tvMapPaceUnit;
                                                i10 = R.string.sport_unit_min_per_km;
                                            } else {
                                                bind2.tvMapDistanceUnit.setText(R.string.unit_mi);
                                                textView = bind2.tvMapPaceUnit;
                                                i10 = R.string.sport_unit_min_per_mi;
                                            }
                                            textView.setText(i10);
                                            p.b.g(bind2.imgChangeModeToNormal, new i0(this));
                                            gm.l.f(x6.k.f30377a, "<this>");
                                            c.a aVar = new c.a(this, (int) ((getResources().getDisplayMetrics().density * 5.0f) + 0.5f), (int) ((getResources().getDisplayMetrics().density * 12.0f) + 0.5f), (int) ((getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
                                            FrameLayout root3 = bind2.getRoot();
                                            gm.l.e(root3, "mapViewBind.root");
                                            z6.g gVar = new z6.g(aVar, root3);
                                            this.F = gVar;
                                            boolean z11 = this.A;
                                            z6.f fVar = gVar.f32007b;
                                            fVar.f31979e = z11;
                                            fVar.d();
                                            z6.f fVar2 = gVar.f32007b;
                                            fVar2.f31982h = false;
                                            fVar2.d();
                                            gVar.a(null);
                                            if (this.W) {
                                                gVar.g();
                                            }
                                            if (this.V) {
                                                gVar.e();
                                            }
                                            bind2.getRoot().setVisibility(8);
                                        } else {
                                            gm.l.l("sportTypeface");
                                            throw null;
                                        }
                                    } else {
                                        gm.l.l("sportTypeface");
                                        throw null;
                                    }
                                } else {
                                    gm.l.l("sportTypeface");
                                    throw null;
                                }
                            } else {
                                gm.l.l("sportTypeface");
                                throw null;
                            }
                        }
                        p.b.g(bind.pauseView, new p0(this));
                        p.b.g(bind.resumeView, new q0(this));
                        p.b.g(bind.stopView, new r0(this));
                        p.b.g(bind.imgChangeModeToMap, new s0(this));
                        int P = P();
                        FitPaddingMaterialToolbar fitPaddingMaterialToolbar2 = bind.toolBar;
                        if (P != 0) {
                            if (P != 1) {
                                i11 = R.string.sport_type_climb;
                            } else {
                                i11 = R.string.sport_type_od;
                            }
                        } else {
                            i11 = R.string.sport_type_walk;
                        }
                        fitPaddingMaterialToolbar2.setTitle(i11);
                        c7.b bVar = this.C;
                        if (bVar != null) {
                            bVar.f4548d.e(this, new mi.e0(0, new mi.t0(this)));
                            x6.k kVar = x6.k.f30377a;
                            int P2 = P();
                            uf.c cVar = this.B;
                            if (cVar != null) {
                                long j10 = cVar.f28710a;
                                if (cVar.f28711b == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                float f10 = cVar.f28713d;
                                float f11 = cVar.f28714e;
                                kVar.getClass();
                                a.b bVar2 = p000do.a.f13275a;
                                bVar2.t("SportManager");
                                bVar2.b("Start sport:userId=%d, sportType=%d", Long.valueOf(j10), Integer.valueOf(P2));
                                Class<? extends x6.c> cls = x6.k.f30380d;
                                if (cls != null) {
                                    Intent intent = new Intent(this, cls);
                                    intent.putExtra("sport_type", P2);
                                    if (j10 > 0) {
                                        intent.putExtra("user_id", j10);
                                        intent.putExtra("user_sex", z10);
                                        intent.putExtra("user_height", f10);
                                        intent.putExtra("user_weight", f11);
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            startForegroundService(intent);
                                        } else {
                                            startService(intent);
                                        }
                                        b7.b O = O();
                                        Context context = O.f4026a.get();
                                        if (context != null) {
                                            Class<? extends x6.c> cls2 = x6.k.f30380d;
                                            if (cls2 != null) {
                                                O.f4029d = context.bindService(new Intent(context, cls2), O.f4030e, 72);
                                                return;
                                            } else {
                                                gm.l.l("serviceClass");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    throw new IllegalArgumentException("userId:" + j10 + " is invalid");
                                }
                                gm.l.l("serviceClass");
                                throw null;
                            }
                            gm.l.l("userInfo");
                            throw null;
                        }
                        gm.l.l("gpsSignalMonitor");
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
        gm.l.l("sportTypeface");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            r5 = this;
            b7.b r0 = r5.O()
            r0.getClass()
            x6.f r0 = r0.f4028c     // Catch: android.os.RemoteException -> L10
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.u()     // Catch: android.os.RemoteException -> L10
            goto L15
        L10:
            r0 = move-exception
            r0.printStackTrace()
        L14:
            r0 = 0
        L15:
            r1 = 1
            if (r0 == 0) goto L31
            com.topstep.fitcloud.pro.ui.sport.SportDetailActivity$a r2 = com.topstep.fitcloud.pro.ui.sport.SportDetailActivity.B
            im.a r3 = r5.f12182y
            mm.h<java.lang.Object>[] r4 = com.topstep.fitcloud.pro.ui.sport.SportingActivity.Y
            r1 = r4[r1]
            java.lang.Object r1 = r3.a(r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2.getClass()
            com.topstep.fitcloud.pro.ui.sport.SportDetailActivity.a.a(r5, r0, r1)
            goto L43
        L31:
            im.a r0 = r5.f12182y
            mm.h<java.lang.Object>[] r2 = com.topstep.fitcloud.pro.ui.sport.SportingActivity.Y
            r1 = r2[r1]
            java.lang.Object r0 = r0.a(r5, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
        L43:
            r5.finish()
            goto L4a
        L47:
            qi.h.l(r5)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.sport.SportingActivity.R():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            r9 = this;
            com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding r0 = r9.D
            if (r0 != 0) goto L5
            return
        L5:
            androidx.lifecycle.t0 r1 = r9.M
            java.lang.Object r1 = r1.getValue()
            com.topstep.fitcloud.pro.ui.sport.SportingViewMode r1 = (com.topstep.fitcloud.pro.ui.sport.SportingViewMode) r1
            sm.t0 r1 = r1.f12193e
            java.lang.Object r1 = r1.getValue()
            com.topstep.fitcloud.pro.model.data.SportGoal r1 = (com.topstep.fitcloud.pro.model.data.SportGoal) r1
            r2 = 0
            if (r1 == 0) goto L8a
            int r3 = r1.f9607b
            if (r3 != 0) goto L1e
            goto L8a
        L1e:
            android.widget.TextView r3 = r0.tvSportGoal
            r4 = 0
            r3.setVisibility(r4)
            com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding r3 = r9.E
            if (r3 == 0) goto L2a
            android.widget.ImageView r2 = r3.imgMapProgress
        L2a:
            if (r2 != 0) goto L2d
            goto L30
        L2d:
            r2.setVisibility(r4)
        L30:
            b7.b r2 = r9.O()
            y6.e r2 = r2.a()
            if (r2 != 0) goto L3b
            return
        L3b:
            int r3 = r1.f9607b
            r5 = 1
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r5) goto L4d
            float r7 = r1.f9608c
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 <= 0) goto L4d
            float r1 = r2.f31184d
            float r1 = r1 / r7
            goto L5d
        L4d:
            r7 = 2
            if (r3 != r7) goto L5b
            int r1 = r1.f9609d
            if (r1 <= 0) goto L5b
            int r2 = r2.f31183c
            float r2 = (float) r2
            float r1 = (float) r1
            float r1 = r2 / r1
            goto L5d
        L5b:
            r1 = 1065353216(0x3f800000, float:1.0)
        L5d:
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto L62
            r6 = r1
        L62:
            r1 = 100
            float r2 = (float) r1
            float r6 = r6 * r2
            int r2 = (int) r6
            android.widget.TextView r0 = r0.tvSportGoal
            r3 = 2131952505(0x7f130379, float:1.9541455E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = java.lang.String.valueOf(r2)
            r5[r4] = r6
            java.lang.String r3 = r9.getString(r3, r5)
            r0.setText(r3)
            com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding r0 = r9.E
            if (r0 == 0) goto L9d
            android.widget.ImageView r0 = r0.imgMapProgress
            if (r0 == 0) goto L9d
            int r2 = r2 * 100
            r0.setImageLevel(r2)
            goto L9d
        L8a:
            android.widget.TextView r0 = r0.tvSportGoal
            r1 = 8
            r0.setVisibility(r1)
            com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding r0 = r9.E
            if (r0 == 0) goto L97
            android.widget.ImageView r2 = r0.imgMapProgress
        L97:
            if (r2 != 0) goto L9a
            goto L9d
        L9a:
            r2.setVisibility(r1)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.sport.SportingActivity.S():void");
    }

    @Override // mi.d0.b
    public final void f() {
        R();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((TextSwitcher) findViewById(R.id.ts_count_down)) != null) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        setContentView(R.layout.activity_sporting);
        int intExtra = getIntent().getIntExtra("sport_type", 0);
        im.a aVar = this.f12181x;
        h<Object>[] hVarArr = Y;
        aVar.b(hVarArr[0], Integer.valueOf(intExtra));
        this.f12182y.b(hVarArr[1], Boolean.valueOf(getIntent().getBooleanExtra("from_main", false)));
        Typeface a10 = qi.i.a(this);
        gm.l.e(a10, "getSportTypeFace(this)");
        this.f12183z = a10;
        kg.g gVar = this.H;
        if (gVar != null) {
            this.A = ((uf.b) gVar.a().getValue()).a();
            k kVar = this.L;
            if (kVar != null) {
                uf.c cVar = (uf.c) kVar.a().getValue();
                if (cVar == null) {
                    finish();
                    return;
                }
                this.B = cVar;
                c7.b bVar = new c7.b(this);
                this.C = bVar;
                this.f701d.a(new GpsSignalMonitorLifecycleObserverAdapter(bVar));
                Integer a11 = x6.k.f30377a.a(this, cVar.f28710a);
                int P = P();
                if (a11 == null || a11.intValue() != P) {
                    TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.ts_count_down);
                    if (textSwitcher != null) {
                        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
                        final int color = obtainStyledAttributes.getColor(0, 0);
                        obtainStyledAttributes.recycle();
                        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: mi.f0
                            @Override // android.widget.ViewSwitcher.ViewFactory
                            public final View makeView() {
                                SportingActivity sportingActivity = this;
                                int i10 = color;
                                SportingActivity.a aVar2 = SportingActivity.X;
                                gm.l.f(sportingActivity, "this$0");
                                TextView textView = new TextView(sportingActivity);
                                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                textView.setTextSize(0, sportingActivity.getResources().getDimension(R.dimen.text_size_sport_count_down));
                                textView.setTextColor(i10);
                                Typeface typeface = sportingActivity.f12183z;
                                if (typeface == null) {
                                    gm.l.l("sportTypeface");
                                    throw null;
                                }
                                textView.setTypeface(typeface);
                                textView.setGravity(17);
                                return textView;
                            }
                        });
                        textSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, 17432576));
                        z0.g(rm.l.g(this), null, 0, new o0(this, textSwitcher, null), 3);
                    }
                } else {
                    Q();
                }
                v vVar = this.f701d;
                gm.l.e(vVar, "lifecycle");
                qi.h.k(vVar, new b(null));
                return;
            }
            gm.l.l("userInfoRepository");
            throw null;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        b7.b O = O();
        O.getClass();
        try {
            x6.f fVar = O.f4028c;
            if (fVar != null) {
                fVar.e(O.f4031f);
            }
            O.f4031f.a0();
        } catch (RemoteException e10) {
            e10.printStackTrace();
        }
        O.f4028c = null;
        if (O.f4029d) {
            O.f4029d = false;
            Context context = O.f4026a.get();
            if (context != null) {
                context.unbindService(O.f4030e);
            }
        }
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.c();
        }
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onPause() {
        super.onPause();
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.d();
        }
        this.V = false;
    }

    @Override // androidx.fragment.app.x, android.app.Activity
    public final void onResume() {
        super.onResume();
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.e();
        }
        this.V = true;
    }

    @Override // androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        gm.l.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.f(bundle);
        }
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onStart() {
        super.onStart();
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.g();
        }
        this.W = true;
    }

    @Override // androidx.appcompat.app.e, androidx.fragment.app.x, android.app.Activity
    public final void onStop() {
        super.onStop();
        z6.g gVar = this.F;
        if (gVar != null) {
            gVar.h();
        }
        this.W = false;
    }
}
