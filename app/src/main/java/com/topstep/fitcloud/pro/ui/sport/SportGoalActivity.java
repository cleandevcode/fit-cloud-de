package com.topstep.fitcloud.pro.ui.sport;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloud.pro.databinding.ActivitySportGoalBinding;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.m;
import k1.l2;
import kg.g;
import kotlin.Metadata;
import lg.j0;
import mf.a0;
import mi.d;
import mi.e;
import mi.j;
import pm.e0;
import s.n2;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SportGoalActivity extends j implements d.a, e.a {
    public static final /* synthetic */ int D = 0;
    public SportGoal A;
    public j0 B;
    public final a C = new a();

    /* renamed from: x */
    public ActivitySportGoalBinding f12152x;

    /* renamed from: y */
    public g f12153y;

    /* renamed from: z */
    public boolean f12154z;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SportGoalActivity.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            ActivitySportGoalBinding activitySportGoalBinding = SportGoalActivity.this.f12152x;
            if (activitySportGoalBinding != null) {
                if (gm.l.a(view2, activitySportGoalBinding.layoutNone)) {
                    SportGoalActivity sportGoalActivity = SportGoalActivity.this;
                    SportGoal sportGoal = sportGoalActivity.A;
                    if (sportGoal != null) {
                        sportGoalActivity.A = SportGoal.a(sportGoal, 0, 0.0f, 0, 13);
                        SportGoalActivity.this.N();
                    } else {
                        gm.l.l("goal");
                        throw null;
                    }
                } else {
                    ActivitySportGoalBinding activitySportGoalBinding2 = SportGoalActivity.this.f12152x;
                    if (activitySportGoalBinding2 != null) {
                        if (gm.l.a(view2, activitySportGoalBinding2.layoutDistance)) {
                            int i10 = d.B0;
                            SportGoalActivity sportGoalActivity2 = SportGoalActivity.this;
                            SportGoal sportGoal2 = sportGoalActivity2.A;
                            if (sportGoal2 != null) {
                                float f10 = sportGoal2.f9608c;
                                boolean z10 = sportGoalActivity2.f12154z;
                                d dVar = new d();
                                Bundle bundle = new Bundle();
                                bundle.putFloat("value", f10);
                                bundle.putBoolean("is_metric", z10);
                                dVar.Z0(bundle);
                                dVar.h1(SportGoalActivity.this.J(), null);
                            } else {
                                gm.l.l("goal");
                                throw null;
                            }
                        } else {
                            ActivitySportGoalBinding activitySportGoalBinding3 = SportGoalActivity.this.f12152x;
                            if (activitySportGoalBinding3 != null) {
                                if (gm.l.a(view2, activitySportGoalBinding3.layoutTime)) {
                                    int i11 = e.B0;
                                    SportGoal sportGoal3 = SportGoalActivity.this.A;
                                    if (sportGoal3 != null) {
                                        int i12 = sportGoal3.f9609d;
                                        e eVar = new e();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("value", i12);
                                        eVar.Z0(bundle2);
                                        eVar.h1(SportGoalActivity.this.J(), null);
                                    } else {
                                        gm.l.l("goal");
                                        throw null;
                                    }
                                }
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        }
                    } else {
                        gm.l.l("viewBind");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
            gm.l.l("viewBind");
            throw null;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportGoalActivity$onCreate$1$1", f = "SportGoalActivity.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12156e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportGoalActivity$onCreate$1$1$1", f = "SportGoalActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public final /* synthetic */ SportGoalActivity f12158e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportGoalActivity sportGoalActivity, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f12158e = sportGoalActivity;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f12158e, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                a0.k(obj);
                this.f12158e.finish();
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            SportGoalActivity.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12156e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                SportGoalActivity sportGoalActivity = SportGoalActivity.this;
                j0 j0Var = sportGoalActivity.B;
                if (j0Var != null) {
                    SportGoal sportGoal = sportGoalActivity.A;
                    if (sportGoal != null) {
                        this.f12156e = 1;
                        if (j0Var.a(sportGoal, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("goal");
                        throw null;
                    }
                } else {
                    gm.l.l("sportRepository");
                    throw null;
                }
            }
            rm.l.g(SportGoalActivity.this).e(new a(SportGoalActivity.this, null));
            return tl.l.f28297a;
        }
    }

    public final String M() {
        String string;
        SportGoal sportGoal = this.A;
        if (sportGoal != null) {
            int i10 = sportGoal.f9607b;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    String string2 = getString(R.string.sport_goal_none);
                    gm.l.e(string2, "{\n                getStr…_goal_none)\n            }");
                    return string2;
                } else if (sportGoal != null) {
                    int i11 = sportGoal.f9609d / 60;
                    int i12 = i11 / 60;
                    int i13 = i11 % 60;
                    String str = "";
                    if (i12 != 0) {
                        str = "" + i12 + getString(R.string.unit_hour);
                    }
                    if (i13 != 0) {
                        return str + i13 + getString(R.string.unit_minute);
                    }
                    return str;
                } else {
                    gm.l.l("goal");
                    throw null;
                }
            } else if (sportGoal != null) {
                float f10 = sportGoal.f9608c;
                if (this.f12154z) {
                    string = getString(R.string.unit_km);
                    gm.l.e(string, "getString(R.string.unit_km)");
                } else {
                    string = getString(R.string.unit_mi);
                    gm.l.e(string, "getString(R.string.unit_mi)");
                    int i14 = hh.b.f16094a;
                    f10 *= 0.6213712f;
                }
                float t10 = rm.l.t(f10);
                int i15 = (int) t10;
                if (t10 != i15) {
                    z10 = false;
                }
                if (z10) {
                    return i15 + string;
                }
                return t10 + string;
            } else {
                gm.l.l("goal");
                throw null;
            }
        }
        gm.l.l("goal");
        throw null;
    }

    public final void N() {
        TextView textView;
        SportGoal sportGoal = this.A;
        if (sportGoal != null) {
            int i10 = sportGoal.f9607b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ActivitySportGoalBinding activitySportGoalBinding = this.f12152x;
                        if (activitySportGoalBinding != null) {
                            activitySportGoalBinding.imgNoneSelect.setVisibility(8);
                            ActivitySportGoalBinding activitySportGoalBinding2 = this.f12152x;
                            if (activitySportGoalBinding2 != null) {
                                activitySportGoalBinding2.imgDistanceSelect.setVisibility(8);
                                ActivitySportGoalBinding activitySportGoalBinding3 = this.f12152x;
                                if (activitySportGoalBinding3 != null) {
                                    activitySportGoalBinding3.imgTimeSelect.setVisibility(0);
                                    ActivitySportGoalBinding activitySportGoalBinding4 = this.f12152x;
                                    if (activitySportGoalBinding4 != null) {
                                        activitySportGoalBinding4.layoutDistanceDetail.setVisibility(8);
                                        ActivitySportGoalBinding activitySportGoalBinding5 = this.f12152x;
                                        if (activitySportGoalBinding5 != null) {
                                            activitySportGoalBinding5.layoutTimeDetail.setVisibility(0);
                                            ActivitySportGoalBinding activitySportGoalBinding6 = this.f12152x;
                                            if (activitySportGoalBinding6 != null) {
                                                textView = activitySportGoalBinding6.tvTimeDetail;
                                            } else {
                                                gm.l.l("viewBind");
                                                throw null;
                                            }
                                        } else {
                                            gm.l.l("viewBind");
                                            throw null;
                                        }
                                    } else {
                                        gm.l.l("viewBind");
                                        throw null;
                                    }
                                } else {
                                    gm.l.l("viewBind");
                                    throw null;
                                }
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        } else {
                            gm.l.l("viewBind");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    ActivitySportGoalBinding activitySportGoalBinding7 = this.f12152x;
                    if (activitySportGoalBinding7 != null) {
                        activitySportGoalBinding7.imgNoneSelect.setVisibility(8);
                        ActivitySportGoalBinding activitySportGoalBinding8 = this.f12152x;
                        if (activitySportGoalBinding8 != null) {
                            activitySportGoalBinding8.imgDistanceSelect.setVisibility(0);
                            ActivitySportGoalBinding activitySportGoalBinding9 = this.f12152x;
                            if (activitySportGoalBinding9 != null) {
                                activitySportGoalBinding9.imgTimeSelect.setVisibility(8);
                                ActivitySportGoalBinding activitySportGoalBinding10 = this.f12152x;
                                if (activitySportGoalBinding10 != null) {
                                    activitySportGoalBinding10.layoutDistanceDetail.setVisibility(0);
                                    ActivitySportGoalBinding activitySportGoalBinding11 = this.f12152x;
                                    if (activitySportGoalBinding11 != null) {
                                        activitySportGoalBinding11.layoutTimeDetail.setVisibility(8);
                                        ActivitySportGoalBinding activitySportGoalBinding12 = this.f12152x;
                                        if (activitySportGoalBinding12 != null) {
                                            textView = activitySportGoalBinding12.tvDistanceDetail;
                                        } else {
                                            gm.l.l("viewBind");
                                            throw null;
                                        }
                                    } else {
                                        gm.l.l("viewBind");
                                        throw null;
                                    }
                                } else {
                                    gm.l.l("viewBind");
                                    throw null;
                                }
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        } else {
                            gm.l.l("viewBind");
                            throw null;
                        }
                    } else {
                        gm.l.l("viewBind");
                        throw null;
                    }
                }
                textView.setText(M());
                return;
            }
            ActivitySportGoalBinding activitySportGoalBinding13 = this.f12152x;
            if (activitySportGoalBinding13 != null) {
                activitySportGoalBinding13.imgNoneSelect.setVisibility(0);
                ActivitySportGoalBinding activitySportGoalBinding14 = this.f12152x;
                if (activitySportGoalBinding14 != null) {
                    activitySportGoalBinding14.imgDistanceSelect.setVisibility(8);
                    ActivitySportGoalBinding activitySportGoalBinding15 = this.f12152x;
                    if (activitySportGoalBinding15 != null) {
                        activitySportGoalBinding15.imgTimeSelect.setVisibility(8);
                        ActivitySportGoalBinding activitySportGoalBinding16 = this.f12152x;
                        if (activitySportGoalBinding16 != null) {
                            activitySportGoalBinding16.layoutDistanceDetail.setVisibility(8);
                            ActivitySportGoalBinding activitySportGoalBinding17 = this.f12152x;
                            if (activitySportGoalBinding17 != null) {
                                activitySportGoalBinding17.layoutTimeDetail.setVisibility(8);
                                return;
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        }
                        gm.l.l("viewBind");
                        throw null;
                    }
                    gm.l.l("viewBind");
                    throw null;
                }
                gm.l.l("viewBind");
                throw null;
            }
            gm.l.l("viewBind");
            throw null;
        }
        gm.l.l("goal");
        throw null;
    }

    @Override // androidx.fragment.app.x, androidx.activity.ComponentActivity, x0.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        super.onCreate(bundle);
        l2.a(getWindow(), false);
        ActivitySportGoalBinding inflate = ActivitySportGoalBinding.inflate(getLayoutInflater());
        gm.l.e(inflate, "inflate(layoutInflater)");
        this.f12152x = inflate;
        setContentView(inflate.getRoot());
        g gVar = this.f12153y;
        if (gVar != null) {
            this.f12154z = ((uf.b) gVar.a().getValue()).a();
            Intent intent = getIntent();
            gm.l.e(intent, "intent");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = (Parcelable) intent.getParcelableExtra("sport_goal", SportGoal.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("sport_goal");
            }
            gm.l.c(parcelableExtra);
            this.A = (SportGoal) parcelableExtra;
            N();
            ActivitySportGoalBinding activitySportGoalBinding = this.f12152x;
            if (activitySportGoalBinding != null) {
                MaterialToolbar materialToolbar = activitySportGoalBinding.toolBar;
                gm.l.e(materialToolbar, "viewBind.toolBar");
                lh.b.b(materialToolbar);
                ActivitySportGoalBinding activitySportGoalBinding2 = this.f12152x;
                if (activitySportGoalBinding2 != null) {
                    activitySportGoalBinding2.toolBar.setOnMenuItemClickListener(new n2(15, this));
                    ActivitySportGoalBinding activitySportGoalBinding3 = this.f12152x;
                    if (activitySportGoalBinding3 != null) {
                        p.b.g(activitySportGoalBinding3.layoutNone, this.C);
                        ActivitySportGoalBinding activitySportGoalBinding4 = this.f12152x;
                        if (activitySportGoalBinding4 != null) {
                            p.b.g(activitySportGoalBinding4.layoutDistance, this.C);
                            ActivitySportGoalBinding activitySportGoalBinding5 = this.f12152x;
                            if (activitySportGoalBinding5 != null) {
                                p.b.g(activitySportGoalBinding5.layoutTime, this.C);
                                return;
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        }
                        gm.l.l("viewBind");
                        throw null;
                    }
                    gm.l.l("viewBind");
                    throw null;
                }
                gm.l.l("viewBind");
                throw null;
            }
            gm.l.l("viewBind");
            throw null;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // mi.e.a
    public final void v(int i10) {
        SportGoal sportGoal = this.A;
        if (sportGoal == null) {
            gm.l.l("goal");
            throw null;
        }
        this.A = SportGoal.a(sportGoal, 2, 0.0f, i10, 5);
        N();
    }

    @Override // mi.d.a
    public final void x(float f10) {
        SportGoal sportGoal = this.A;
        if (sportGoal == null) {
            gm.l.l("goal");
            throw null;
        }
        this.A = SportGoal.a(sportGoal, 1, f10, 0, 9);
        N();
    }
}
