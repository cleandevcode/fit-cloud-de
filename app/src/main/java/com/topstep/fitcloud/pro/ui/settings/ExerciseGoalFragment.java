package com.topstep.fitcloud.pro.ui.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.k;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentExerciseGoalBinding;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.m;
import gm.t;
import i2.b0;
import ih.v;
import ii.c0;
import ii.p;
import ii.r;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class ExerciseGoalFragment extends c0 implements SelectIntDialogFragment.b, r.a, p.a {

    /* renamed from: z0 */
    public static final /* synthetic */ mm.h<Object>[] f11834z0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11835r0;

    /* renamed from: s0 */
    public final i2.g f11836s0;

    /* renamed from: t0 */
    public long f11837t0;

    /* renamed from: u0 */
    public kg.g f11838u0;

    /* renamed from: v0 */
    public kg.a f11839v0;

    /* renamed from: w0 */
    public boolean f11840w0;

    /* renamed from: x0 */
    public uf.a f11841x0;

    /* renamed from: y0 */
    public final a f11842y0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            ExerciseGoalFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            o pVar;
            View view2 = view;
            gm.l.f(view2, "view");
            ExerciseGoalFragment exerciseGoalFragment = ExerciseGoalFragment.this;
            mm.h<Object>[] hVarArr = ExerciseGoalFragment.f11834z0;
            if (gm.l.a(view2, exerciseGoalFragment.h1().layoutStep)) {
                ExerciseGoalFragment exerciseGoalFragment2 = ExerciseGoalFragment.this;
                uf.a aVar = exerciseGoalFragment2.f11841x0;
                if (aVar != null) {
                    int i10 = aVar.f28704a;
                    int i11 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(1, 50, 1000, i10, exerciseGoalFragment2.o0(R.string.ds_page_config_step), exerciseGoalFragment2.o0(R.string.unit_step)).h1(exerciseGoalFragment2.h0(), "exercise_step");
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            } else if (gm.l.a(view2, ExerciseGoalFragment.this.h1().layoutDistance)) {
                if (ExerciseGoalFragment.this.f11840w0) {
                    pVar = new r();
                } else {
                    pVar = new p();
                }
                pVar.h1(ExerciseGoalFragment.this.h0(), null);
            } else if (gm.l.a(view2, ExerciseGoalFragment.this.h1().layoutCalorie)) {
                ExerciseGoalFragment exerciseGoalFragment3 = ExerciseGoalFragment.this;
                uf.a aVar2 = exerciseGoalFragment3.f11841x0;
                if (aVar2 != null) {
                    int i12 = aVar2.f28706c;
                    int i13 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(1, 50, 30, i12, exerciseGoalFragment3.o0(R.string.ds_page_config_calorie), exerciseGoalFragment3.o0(R.string.unit_k_calorie)).h1(exerciseGoalFragment3.h0(), "exercise_calorie");
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            } else if (gm.l.a(view2, ExerciseGoalFragment.this.h1().btnCommit)) {
                i2.m f10 = tb.a.f(ExerciseGoalFragment.this);
                b0 a10 = v.d().a();
                try {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isAfterFillUser", true);
                    bundle.putString("nameSpecify", null);
                    f10.l(R.id.toDeviceBind, bundle, a10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k {
        public b() {
            super(true);
        }

        @Override // androidx.activity.k
        public final void a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.r rVar) {
            super(0);
            this.f11844b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11844b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11844b, " has null arguments"));
        }
    }

    static {
        t tVar = new t(ExerciseGoalFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentExerciseGoalBinding;", 0);
        gm.b0.f15488a.getClass();
        f11834z0 = new mm.h[]{tVar};
    }

    public ExerciseGoalFragment() {
        super(R.layout.fragment_exercise_goal);
        this.f11835r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentExerciseGoalBinding.class, this);
        this.f11836s0 = new i2.g(gm.b0.a(ii.v.class), new c(this));
        this.f11842y0 = new a();
    }

    public static float g1(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        int i10 = (int) (f10 / 0.5f);
        if (i10 * 2 != ((int) (f10 / 0.25f))) {
            i10++;
        }
        return i10 * 0.5f;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        if (((ii.v) this.f11836s0.getValue()).f16992a) {
            T0().f705h.a(this, new b());
        }
        kg.g gVar = this.f11838u0;
        if (gVar != null) {
            this.f11840w0 = ((uf.b) gVar.a().getValue()).a();
            this.f11841x0 = (uf.a) f1().a().getValue();
            return;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // ii.p.a
    public final void E(float f10) {
        uf.a aVar = this.f11841x0;
        if (aVar != null) {
            int i10 = hh.b.f16094a;
            this.f11841x0 = uf.a.a(aVar, 0, f10 / 0.6213712f, 0, 5);
            TextView textView = h1().tvDistanceValue;
            uf.a aVar2 = this.f11841x0;
            if (aVar2 != null) {
                float g12 = g1(aVar2.f28705b * 0.6213712f);
                DecimalFormat decimalFormat = m0.f4331b;
                if (decimalFormat != null) {
                    String format = decimalFormat.format(Double.parseDouble(String.valueOf(g12)));
                    gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                    textView.setText(format);
                    kg.a f12 = f1();
                    long j10 = this.f11837t0;
                    uf.a aVar3 = this.f11841x0;
                    if (aVar3 != null) {
                        f12.C(j10, aVar3);
                        return;
                    } else {
                        gm.l.l("exerciseGoal");
                        throw null;
                    }
                }
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
            gm.l.l("exerciseGoal");
            throw null;
        }
        gm.l.l("exerciseGoal");
        throw null;
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        kg.a f12;
        long j10;
        uf.a aVar;
        if (gm.l.a("exercise_step", str)) {
            uf.a aVar2 = this.f11841x0;
            if (aVar2 != null) {
                this.f11841x0 = uf.a.a(aVar2, i10, 0.0f, 0, 6);
                TextView textView = h1().tvStepValue;
                uf.a aVar3 = this.f11841x0;
                if (aVar3 != null) {
                    int i11 = aVar3.f28704a;
                    Locale locale = m0.f4330a;
                    if (locale != null) {
                        String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                        gm.l.e(format, "format(locale, format, *args)");
                        textView.setText(format);
                        f12 = f1();
                        j10 = this.f11837t0;
                        aVar = this.f11841x0;
                        if (aVar == null) {
                            gm.l.l("exerciseGoal");
                            throw null;
                        }
                    } else {
                        gm.l.l("systemLocale");
                        throw null;
                    }
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            } else {
                gm.l.l("exerciseGoal");
                throw null;
            }
        } else if (gm.l.a("exercise_calorie", str)) {
            uf.a aVar4 = this.f11841x0;
            if (aVar4 != null) {
                this.f11841x0 = uf.a.a(aVar4, 0, 0.0f, i10, 3);
                TextView textView2 = h1().tvCalorieValue;
                uf.a aVar5 = this.f11841x0;
                if (aVar5 != null) {
                    int i12 = aVar5.f28706c;
                    Locale locale2 = m0.f4330a;
                    if (locale2 != null) {
                        String format2 = String.format(locale2, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                        gm.l.e(format2, "format(locale, format, *args)");
                        textView2.setText(format2);
                        f12 = f1();
                        j10 = this.f11837t0;
                        aVar = this.f11841x0;
                        if (aVar == null) {
                            gm.l.l("exerciseGoal");
                            throw null;
                        }
                    } else {
                        gm.l.l("systemLocale");
                        throw null;
                    }
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            } else {
                gm.l.l("exerciseGoal");
                throw null;
            }
        } else {
            return;
        }
        f12.C(j10, aVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        TextView textView;
        int i10;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (((ii.v) this.f11836s0.getValue()).f16992a) {
            h1().btnCommit.setVisibility(0);
            h1().toolbar.setNavigationIcon((Drawable) null);
        } else {
            h1().btnCommit.setVisibility(8);
        }
        TextView textView2 = h1().tvStepValue;
        uf.a aVar = this.f11841x0;
        if (aVar != null) {
            textView2.setText(m0.v(aVar.f28704a));
            if (this.f11840w0) {
                TextView textView3 = h1().tvDistanceValue;
                uf.a aVar2 = this.f11841x0;
                if (aVar2 != null) {
                    textView3.setText(m0.i(g1(aVar2.f28705b)));
                    textView = h1().tvDistanceUnit;
                    i10 = R.string.unit_km;
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            } else {
                TextView textView4 = h1().tvDistanceValue;
                uf.a aVar3 = this.f11841x0;
                if (aVar3 != null) {
                    float f10 = aVar3.f28705b;
                    int i11 = hh.b.f16094a;
                    textView4.setText(m0.i(g1(f10 * 0.6213712f)));
                    textView = h1().tvDistanceUnit;
                    i10 = R.string.unit_mi;
                } else {
                    gm.l.l("exerciseGoal");
                    throw null;
                }
            }
            textView.setText(i10);
            TextView textView5 = h1().tvCalorieValue;
            uf.a aVar4 = this.f11841x0;
            if (aVar4 != null) {
                textView5.setText(m0.v(aVar4.f28706c));
                p.b.g(h1().layoutStep, this.f11842y0);
                p.b.g(h1().layoutDistance, this.f11842y0);
                p.b.g(h1().layoutCalorie, this.f11842y0);
                p.b.g(h1().btnCommit, this.f11842y0);
                return;
            }
            gm.l.l("exerciseGoal");
            throw null;
        }
        gm.l.l("exerciseGoal");
        throw null;
    }

    @Override // ii.r.a
    public final float Q() {
        uf.a aVar = this.f11841x0;
        if (aVar != null) {
            return g1(aVar.f28705b);
        }
        gm.l.l("exerciseGoal");
        throw null;
    }

    @Override // ii.p.a
    public final float V() {
        uf.a aVar = this.f11841x0;
        if (aVar != null) {
            float f10 = aVar.f28705b;
            int i10 = hh.b.f16094a;
            return g1(f10 * 0.6213712f);
        }
        gm.l.l("exerciseGoal");
        throw null;
    }

    @Override // ii.r.a
    public final void W(float f10) {
        uf.a aVar = this.f11841x0;
        if (aVar != null) {
            this.f11841x0 = uf.a.a(aVar, 0, f10, 0, 5);
            TextView textView = h1().tvDistanceValue;
            uf.a aVar2 = this.f11841x0;
            if (aVar2 != null) {
                float g12 = g1(aVar2.f28705b);
                DecimalFormat decimalFormat = m0.f4331b;
                if (decimalFormat != null) {
                    String format = decimalFormat.format(Double.parseDouble(String.valueOf(g12)));
                    gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
                    textView.setText(format);
                    kg.a f12 = f1();
                    long j10 = this.f11837t0;
                    uf.a aVar3 = this.f11841x0;
                    if (aVar3 != null) {
                        f12.C(j10, aVar3);
                        return;
                    } else {
                        gm.l.l("exerciseGoal");
                        throw null;
                    }
                }
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
            gm.l.l("exerciseGoal");
            throw null;
        }
        gm.l.l("exerciseGoal");
        throw null;
    }

    public final kg.a f1() {
        kg.a aVar = this.f11839v0;
        if (aVar != null) {
            return aVar;
        }
        gm.l.l("exerciseGoalRepository");
        throw null;
    }

    public final FragmentExerciseGoalBinding h1() {
        return (FragmentExerciseGoalBinding) this.f11835r0.a(this, f11834z0[0]);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final String q(int i10, String str) {
        return SelectIntDialogFragment.b.a.a(i10);
    }
}
