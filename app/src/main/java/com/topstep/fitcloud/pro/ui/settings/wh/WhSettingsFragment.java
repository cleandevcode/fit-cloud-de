package com.topstep.fitcloud.pro.ui.settings.wh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import bi.m0;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentWhSettingsBinding;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.MessageDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloud.pro.ui.settings.wh.WhSettingsFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import i2.b0;
import i2.g;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import li.j;
import mf.a0;
import mm.h;
import og.t;
import pm.e0;
import tl.i;

@Metadata
/* loaded from: classes2.dex */
public final class WhSettingsFragment extends li.c implements SelectIntDialogFragment.b, DatePickerDialogFragment.b, ChoiceIntDialogFragment.b, MessageDialogFragment.b {
    public static final /* synthetic */ h<Object>[] O0;
    public final Calendar A0;
    public final Date B0;
    public Date C0;
    public final a D0;
    public final String E0;
    public final String F0;
    public final String G0;
    public final String H0;
    public final String I0;
    public final String J0;
    public final String K0;
    public final String L0;
    public final String M0;
    public final String N0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12101t0;

    /* renamed from: u0 */
    public final g f12102u0;

    /* renamed from: v0 */
    public final i f12103v0;

    /* renamed from: w0 */
    public ah.a f12104w0;

    /* renamed from: x0 */
    public t f12105x0;

    /* renamed from: y0 */
    public gg.b f12106y0;

    /* renamed from: z0 */
    public boolean f12107z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            WhSettingsFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            int i10;
            o a10;
            j0 h02;
            String str;
            View view2 = view;
            gm.l.f(view2, "view");
            WhSettingsFragment whSettingsFragment = WhSettingsFragment.this;
            h<Object>[] hVarArr = WhSettingsFragment.O0;
            if (gm.l.a(view2, whSettingsFragment.j1().itemDuration)) {
                int i11 = SelectIntDialogFragment.C0;
                WhSettingsFragment whSettingsFragment2 = WhSettingsFragment.this;
                gg.b bVar = whSettingsFragment2.f12106y0;
                if (bVar != null) {
                    a10 = SelectIntDialogFragment.a.a(3, 15, 1, bVar.f15341g, whSettingsFragment2.V0().getString(R.string.wh_menstruation_duration), WhSettingsFragment.this.V0().getString(R.string.unit_day_count));
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.E0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemCycle)) {
                int i12 = SelectIntDialogFragment.C0;
                WhSettingsFragment whSettingsFragment3 = WhSettingsFragment.this;
                gg.b bVar2 = whSettingsFragment3.f12106y0;
                if (bVar2 != null) {
                    a10 = SelectIntDialogFragment.a.a(17, 60, 1, bVar2.f15340f, whSettingsFragment3.V0().getString(R.string.wh_menstruation_cycle), WhSettingsFragment.this.V0().getString(R.string.unit_day_count));
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.F0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemLatest)) {
                Date date = new Date();
                Calendar calendar = WhSettingsFragment.this.A0;
                gm.l.e(calendar, "calendar");
                calendar.setTime(date);
                calendar.set(5, calendar.get(5) - 280);
                Date time = calendar.getTime();
                gm.l.e(time, "calendar.time");
                int i13 = DatePickerDialogFragment.B0;
                WhSettingsFragment whSettingsFragment4 = WhSettingsFragment.this;
                gg.b bVar3 = whSettingsFragment4.f12106y0;
                if (bVar3 != null) {
                    a10 = DatePickerDialogFragment.a.a(time, date, bVar3.f15342h, whSettingsFragment4.o0(R.string.wh_menstruation_latest), false);
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.G0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemPregnancyDueDate)) {
                Date date2 = new Date();
                Calendar calendar2 = WhSettingsFragment.this.A0;
                gm.l.e(calendar2, "calendar");
                calendar2.setTime(date2);
                calendar2.set(5, calendar2.get(5) + 280);
                Date time2 = calendar2.getTime();
                gm.l.e(time2, "calendar.time");
                int i14 = DatePickerDialogFragment.B0;
                WhSettingsFragment whSettingsFragment5 = WhSettingsFragment.this;
                Date date3 = whSettingsFragment5.C0;
                if (date3 != null) {
                    a10 = DatePickerDialogFragment.a.a(date2, time2, date3, whSettingsFragment5.o0(R.string.wh_set_due_date), false);
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.H0;
                } else {
                    gm.l.l("dueDate");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemPregnancyCycle)) {
                int i15 = SelectIntDialogFragment.C0;
                WhSettingsFragment whSettingsFragment6 = WhSettingsFragment.this;
                gg.b bVar4 = whSettingsFragment6.f12106y0;
                if (bVar4 != null) {
                    a10 = SelectIntDialogFragment.a.a(17, 60, 1, bVar4.f15340f, whSettingsFragment6.V0().getString(R.string.wh_menstruation_cycle), WhSettingsFragment.this.V0().getString(R.string.unit_day_count));
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.I0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemPregnancyLatest)) {
                Date date4 = new Date();
                Calendar calendar3 = WhSettingsFragment.this.A0;
                gm.l.e(calendar3, "calendar");
                calendar3.setTime(date4);
                calendar3.set(5, calendar3.get(5) - 280);
                Date time3 = calendar3.getTime();
                gm.l.e(time3, "calendar.time");
                int i16 = DatePickerDialogFragment.B0;
                WhSettingsFragment whSettingsFragment7 = WhSettingsFragment.this;
                gg.b bVar5 = whSettingsFragment7.f12106y0;
                if (bVar5 != null) {
                    a10 = DatePickerDialogFragment.a.a(time3, date4, bVar5.f15342h, whSettingsFragment7.o0(R.string.wh_menstruation_latest), false);
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.J0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemRemindAdvance)) {
                int i17 = SelectIntDialogFragment.C0;
                WhSettingsFragment whSettingsFragment8 = WhSettingsFragment.this;
                gg.b bVar6 = whSettingsFragment8.f12106y0;
                if (bVar6 != null) {
                    a10 = SelectIntDialogFragment.a.a(1, 3, 1, bVar6.f15338d, whSettingsFragment8.V0().getString(R.string.wh_menstruation_advance), WhSettingsFragment.this.V0().getString(R.string.unit_day_count));
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.K0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemRemindType)) {
                String[] strArr = {WhSettingsFragment.this.V0().getString(R.string.wh_pregnancy_remind_type1), WhSettingsFragment.this.V0().getString(R.string.wh_pregnancy_remind_type2)};
                int[] iArr = {1, 0};
                int i18 = ChoiceIntDialogFragment.B0;
                WhSettingsFragment whSettingsFragment9 = WhSettingsFragment.this;
                gg.b bVar7 = whSettingsFragment9.f12106y0;
                if (bVar7 != null) {
                    a10 = ChoiceIntDialogFragment.a.a(whSettingsFragment9.V0().getString(R.string.wh_pregnancy_remind_select_tips), bVar7.f15339e, iArr, strArr);
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.L0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, WhSettingsFragment.this.j1().itemRemindTime)) {
                int i19 = SelectIntDialogFragment.C0;
                WhSettingsFragment whSettingsFragment10 = WhSettingsFragment.this;
                gg.b bVar8 = whSettingsFragment10.f12106y0;
                if (bVar8 != null) {
                    a10 = SelectIntDialogFragment.a.a(0, 23, 60, bVar8.f15337c, whSettingsFragment10.V0().getString(R.string.wh_remind_time), null);
                    h02 = WhSettingsFragment.this.h0();
                    str = WhSettingsFragment.this.M0;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                if (gm.l.a(view2, WhSettingsFragment.this.j1().btnCommit)) {
                    ah.a aVar = WhSettingsFragment.this.f12104w0;
                    if (aVar != null) {
                        gg.b bVar9 = (gg.b) aVar.a().getValue();
                        if (bVar9 != null && bVar9.f15335a != WhSettingsFragment.this.h1().f20039a) {
                            Context V0 = WhSettingsFragment.this.V0();
                            int i20 = bVar9.f15335a;
                            int i21 = R.string.wh_mode_menstruation_name;
                            if (i20 != 2) {
                                if (i20 != 3) {
                                    i10 = R.string.wh_mode_menstruation_name;
                                } else {
                                    i10 = R.string.wh_mode_pregnancy_name;
                                }
                            } else {
                                i10 = R.string.wh_mode_pregnancy_prepare_name;
                            }
                            String string = V0.getString(i10);
                            gm.l.e(string, "context.getString(resId)");
                            Context V02 = WhSettingsFragment.this.V0();
                            int i22 = WhSettingsFragment.this.h1().f20039a;
                            if (i22 != 2) {
                                if (i22 == 3) {
                                    i21 = R.string.wh_mode_pregnancy_name;
                                }
                            } else {
                                i21 = R.string.wh_mode_pregnancy_prepare_name;
                            }
                            String string2 = V02.getString(i21);
                            gm.l.e(string2, "context.getString(resId)");
                            String p02 = WhSettingsFragment.this.p0(R.string.wh_mode_pregnancy_changed_tips, string, string2);
                            gm.l.e(p02, "getString(R.string.wh_mo…reviousMode, currentMode)");
                            int i23 = MessageDialogFragment.B0;
                            a10 = MessageDialogFragment.a.a(WhSettingsFragment.this.o0(R.string.tip_prompt), p02);
                            h02 = WhSettingsFragment.this.h0();
                            str = WhSettingsFragment.this.N0;
                        } else {
                            WhSettingsFragment.this.k1();
                        }
                    } else {
                        gm.l.l("configRepository");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
            a10.h1(h02, str);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<SimpleDateFormat> {

        /* renamed from: b */
        public static final b f12109b = new b();

        public b() {
            super(0);
        }

        @Override // fm.a
        public final SimpleDateFormat m() {
            return m0.m();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhSettingsFragment$onCreate$1", f = "WhSettingsFragment.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super gg.b>, Object> {

        /* renamed from: e */
        public int f12110e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            WhSettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super gg.b> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12110e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                WhSettingsFragment whSettingsFragment = WhSettingsFragment.this;
                ah.a aVar2 = whSettingsFragment.f12104w0;
                if (aVar2 != null) {
                    int i11 = whSettingsFragment.h1().f20039a;
                    this.f12110e = 1;
                    obj = aVar2.c(i11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("configRepository");
                    throw null;
                }
            }
            return obj;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhSettingsFragment$saveConfig$1", f = "WhSettingsFragment.kt", l = {271}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12112e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            WhSettingsFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12112e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                WhSettingsFragment whSettingsFragment = WhSettingsFragment.this;
                ah.a aVar2 = whSettingsFragment.f12104w0;
                if (aVar2 != null) {
                    gg.b bVar = whSettingsFragment.f12106y0;
                    if (bVar != null) {
                        this.f12112e = 1;
                        if (aVar2.b(bVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                } else {
                    gm.l.l("configRepository");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f12114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f12114b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f12114b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f12114b, " has null arguments"));
        }
    }

    static {
        gm.t tVar = new gm.t(WhSettingsFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentWhSettingsBinding;", 0);
        b0.f15488a.getClass();
        O0 = new h[]{tVar};
    }

    public WhSettingsFragment() {
        super(R.layout.fragment_wh_settings);
        this.f12101t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentWhSettingsBinding.class, this);
        this.f12102u0 = new g(b0.a(j.class), new e(this));
        this.f12103v0 = new i(b.f12109b);
        this.A0 = Calendar.getInstance();
        this.B0 = new Date();
        this.D0 = new a();
        this.E0 = "duration";
        this.F0 = "cycle";
        this.G0 = "latest";
        this.H0 = "pregnancy_due_date";
        this.I0 = "pregnancy_cycle";
        this.J0 = "pregnancy_latest";
        this.K0 = "remind_advance";
        this.L0 = "remind_type";
        this.M0 = "remind_time";
        this.N0 = "change_mode";
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f12106y0 = (gg.b) z0.n(new c(null));
        t tVar = this.f12105x0;
        if (tVar != null) {
            this.f12107z0 = tVar.D().c().g(11);
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        TextView textView;
        String a10;
        int i11;
        if (gm.l.a(str, this.E0)) {
            gg.b bVar = this.f12106y0;
            if (bVar != null) {
                this.f12106y0 = gg.b.a(bVar, 0, false, 0, 0, 0, 0, i10, null, 191);
                textView = j1().itemDuration.getTextView();
                Object[] objArr = new Object[1];
                gg.b bVar2 = this.f12106y0;
                if (bVar2 != null) {
                    objArr[0] = Integer.valueOf(bVar2.f15341g);
                    a10 = p0(R.string.unit_day_count_param, objArr);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else if (gm.l.a(str, this.F0)) {
            gg.b bVar3 = this.f12106y0;
            if (bVar3 != null) {
                this.f12106y0 = gg.b.a(bVar3, 0, false, 0, 0, 0, i10, 0, null, 223);
                textView = j1().itemCycle.getTextView();
                Object[] objArr2 = new Object[1];
                gg.b bVar4 = this.f12106y0;
                if (bVar4 != null) {
                    objArr2[0] = Integer.valueOf(bVar4.f15340f);
                    a10 = p0(R.string.unit_day_count_param, objArr2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else if (gm.l.a(str, this.I0)) {
            gg.b bVar5 = this.f12106y0;
            if (bVar5 != null) {
                this.f12106y0 = gg.b.a(bVar5, 0, false, 0, 0, 0, i10, 0, null, 223);
                TextView textView2 = j1().itemPregnancyCycle.getTextView();
                Object[] objArr3 = new Object[1];
                gg.b bVar6 = this.f12106y0;
                if (bVar6 != null) {
                    objArr3[0] = Integer.valueOf(bVar6.f15340f);
                    textView2.setText(p0(R.string.unit_day_count_param, objArr3));
                    Calendar calendar = this.A0;
                    gm.l.e(calendar, "calendar");
                    gg.b bVar7 = this.f12106y0;
                    if (bVar7 != null) {
                        Date date = bVar7.f15342h;
                        int i12 = bVar7.f15340f;
                        gm.l.f(date, "latest");
                        if (i12 > 28) {
                            calendar.setTime(date);
                            i11 = calendar.get(5) + 280;
                        } else {
                            calendar.setTime(date);
                            i11 = i12 + 252 + calendar.get(5);
                        }
                        calendar.set(5, i11);
                        Date time = calendar.getTime();
                        gm.l.e(time, "calendar.time");
                        this.C0 = time;
                        TextView summaryView = j1().itemPregnancyDueDate.getSummaryView();
                        SimpleDateFormat i13 = i1();
                        Date date2 = this.C0;
                        if (date2 != null) {
                            summaryView.setText(i13.format(date2));
                            l1();
                            return;
                        }
                        gm.l.l("dueDate");
                        throw null;
                    }
                    gm.l.l("config");
                    throw null;
                }
                gm.l.l("config");
                throw null;
            }
            gm.l.l("config");
            throw null;
        } else if (gm.l.a(str, this.K0)) {
            gg.b bVar8 = this.f12106y0;
            if (bVar8 != null) {
                this.f12106y0 = gg.b.a(bVar8, 0, false, 0, i10, 0, 0, 0, null, 247);
                textView = j1().itemRemindAdvance.getSummaryView();
                Object[] objArr4 = new Object[1];
                gg.b bVar9 = this.f12106y0;
                if (bVar9 != null) {
                    objArr4[0] = Integer.valueOf(bVar9.f15338d);
                    a10 = p0(R.string.wh_menstruation_advance_param, objArr4);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else if (gm.l.a(str, this.M0)) {
            gg.b bVar10 = this.f12106y0;
            if (bVar10 != null) {
                this.f12106y0 = gg.b.a(bVar10, 0, false, i10, 0, 0, 0, 0, null, 251);
                textView = j1().itemRemindTime.getTextView();
                gg.b bVar11 = this.f12106y0;
                if (bVar11 != null) {
                    int i14 = bVar11.f15337c;
                    Locale locale = m0.f4330a;
                    if (locale != null) {
                        a10 = o5.a0.a(new Object[]{Integer.valueOf(i14 / 60), Integer.valueOf(i14 % 60)}, 2, locale, "%02d:%02d", "format(locale, format, *args)");
                    } else {
                        gm.l.l("systemLocale");
                        throw null;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else {
            return;
        }
        textView.setText(a10);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        Button button;
        int i10;
        int i11;
        PreferenceItem preferenceItem;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        int i12 = h1().f20039a;
        boolean z10 = true;
        if (i12 != 1) {
            if (i12 != 2) {
                j1().toolbar.setTitle(R.string.wh_pregnancy_settings);
                button = j1().btnCommit;
                i10 = R.string.wh_mode_pregnancy_start;
            } else {
                j1().toolbar.setTitle(R.string.wh_pregnancy_prepare_settings);
                button = j1().btnCommit;
                i10 = R.string.wh_mode_pregnancy_prepare_start;
            }
        } else {
            j1().toolbar.setTitle(R.string.wh_menstruation_settings);
            button = j1().btnCommit;
            i10 = R.string.wh_mode_menstruation_start;
        }
        button.setText(i10);
        if (h1().f20039a != 3) {
            j1().layoutPregnancy1.setVisibility(8);
            j1().layoutPregnancy2.setVisibility(8);
            j1().itemRemindType.setVisibility(8);
            TextView textView = j1().itemDuration.getTextView();
            Object[] objArr = new Object[1];
            gg.b bVar = this.f12106y0;
            if (bVar != null) {
                objArr[0] = Integer.valueOf(bVar.f15341g);
                textView.setText(p0(R.string.unit_day_count_param, objArr));
                p.b.g(j1().itemDuration, this.D0);
                TextView textView2 = j1().itemCycle.getTextView();
                Object[] objArr2 = new Object[1];
                gg.b bVar2 = this.f12106y0;
                if (bVar2 != null) {
                    objArr2[0] = Integer.valueOf(bVar2.f15340f);
                    textView2.setText(p0(R.string.unit_day_count_param, objArr2));
                    p.b.g(j1().itemCycle, this.D0);
                    TextView summaryView = j1().itemLatest.getSummaryView();
                    SimpleDateFormat i13 = i1();
                    gg.b bVar3 = this.f12106y0;
                    if (bVar3 != null) {
                        summaryView.setText(i13.format(bVar3.f15342h));
                        p.b.g(j1().itemLatest, this.D0);
                        TextView summaryView2 = j1().itemRemindAdvance.getSummaryView();
                        Object[] objArr3 = new Object[1];
                        gg.b bVar4 = this.f12106y0;
                        if (bVar4 != null) {
                            objArr3[0] = Integer.valueOf(bVar4.f15338d);
                            summaryView2.setText(p0(R.string.wh_menstruation_advance_param, objArr3));
                            preferenceItem = j1().itemRemindAdvance;
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else {
            j1().layoutMenstruation1.setVisibility(8);
            j1().layoutMenstruation2.setVisibility(8);
            j1().itemRemindAdvance.setVisibility(8);
            Calendar calendar = this.A0;
            gm.l.e(calendar, "calendar");
            gg.b bVar5 = this.f12106y0;
            if (bVar5 != null) {
                Date date = bVar5.f15342h;
                int i14 = bVar5.f15340f;
                gm.l.f(date, "latest");
                if (i14 > 28) {
                    calendar.setTime(date);
                    i11 = calendar.get(5) + 280;
                } else {
                    calendar.setTime(date);
                    i11 = i14 + 252 + calendar.get(5);
                }
                calendar.set(5, i11);
                Date time = calendar.getTime();
                gm.l.e(time, "calendar.time");
                this.C0 = time;
                TextView summaryView3 = j1().itemPregnancyDueDate.getSummaryView();
                SimpleDateFormat i15 = i1();
                Date date2 = this.C0;
                if (date2 != null) {
                    summaryView3.setText(i15.format(date2));
                    p.b.g(j1().itemPregnancyDueDate, this.D0);
                    TextView textView3 = j1().itemPregnancyCycle.getTextView();
                    Object[] objArr4 = new Object[1];
                    gg.b bVar6 = this.f12106y0;
                    if (bVar6 != null) {
                        objArr4[0] = Integer.valueOf(bVar6.f15340f);
                        textView3.setText(p0(R.string.unit_day_count_param, objArr4));
                        p.b.g(j1().itemPregnancyCycle, this.D0);
                        TextView summaryView4 = j1().itemPregnancyLatest.getSummaryView();
                        SimpleDateFormat i16 = i1();
                        gg.b bVar7 = this.f12106y0;
                        if (bVar7 != null) {
                            summaryView4.setText(i16.format(bVar7.f15342h));
                            p.b.g(j1().itemPregnancyLatest, this.D0);
                            l1();
                            preferenceItem = j1().itemRemindType;
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                } else {
                    gm.l.l("dueDate");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        }
        p.b.g(preferenceItem, this.D0);
        SwitchMaterial switchView = j1().itemRemindDevice.getSwitchView();
        gg.b bVar8 = this.f12106y0;
        if (bVar8 != null) {
            switchView.setChecked(bVar8.f15336b);
            TextView textView4 = j1().itemRemindTime.getTextView();
            gg.b bVar9 = this.f12106y0;
            if (bVar9 != null) {
                int i17 = bVar9.f15337c;
                Locale locale = m0.f4330a;
                if (locale != null) {
                    String format = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i17 / 60), Integer.valueOf(i17 % 60)}, 2));
                    gm.l.e(format, "format(locale, format, *args)");
                    textView4.setText(format);
                    j1().itemRemindDevice.setEnabled(this.f12107z0);
                    j1().itemRemindTime.setEnabled((j1().itemRemindDevice.getSwitchView().isChecked() && this.f12107z0) ? false : false);
                    j1().itemRemindDevice.getSwitchView().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: li.i
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            WhSettingsFragment whSettingsFragment = WhSettingsFragment.this;
                            mm.h<Object>[] hVarArr = WhSettingsFragment.O0;
                            gm.l.f(whSettingsFragment, "this$0");
                            if (compoundButton.isPressed()) {
                                whSettingsFragment.j1().itemRemindTime.setEnabled(z11 && whSettingsFragment.f12107z0);
                            }
                        }
                    });
                    p.b.g(j1().itemRemindTime, this.D0);
                    p.b.g(j1().btnCommit, this.D0);
                    return;
                }
                gm.l.l("systemLocale");
                throw null;
            }
            gm.l.l("config");
            throw null;
        }
        gm.l.l("config");
        throw null;
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        if (gm.l.a(str, this.L0)) {
            gg.b bVar = this.f12106y0;
            if (bVar == null) {
                gm.l.l("config");
                throw null;
            }
            this.f12106y0 = gg.b.a(bVar, 0, false, 0, 0, i10, 0, 0, null, 239);
            l1();
        }
    }

    public final j h1() {
        return (j) this.f12102u0.getValue();
    }

    public final SimpleDateFormat i1() {
        return (SimpleDateFormat) this.f12103v0.getValue();
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.MessageDialogFragment.b
    public final void j(String str) {
        if (gm.l.a(str, this.N0)) {
            k1();
        }
    }

    public final FragmentWhSettingsBinding j1() {
        return (FragmentWhSettingsBinding) this.f12101t0.a(this, O0[0]);
    }

    public final void k1() {
        gg.b bVar = this.f12106y0;
        if (bVar != null) {
            this.f12106y0 = gg.b.a(bVar, h1().f20039a, j1().itemRemindDevice.getSwitchView().isChecked(), 0, 0, 0, 0, 0, null, 252);
            ah.a aVar = this.f12104w0;
            if (aVar != null) {
                gg.b bVar2 = (gg.b) aVar.a().getValue();
                gg.b bVar3 = this.f12106y0;
                if (bVar3 != null) {
                    if (!gm.l.a(bVar2, bVar3)) {
                        try {
                            z0.n(new d(null));
                        } catch (Exception e10) {
                            qi.p.f(f1(), e10);
                            return;
                        }
                    }
                    b0.a d10 = v.d();
                    d10.b(R.id.homePageFragment, false);
                    i2.b0 a10 = d10.a();
                    i2.m f10 = tb.a.f(this);
                    int i10 = h1().f20039a;
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("mode", i10);
                        f10.l(R.id.toWhDetail, bundle, a10);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
                gm.l.l("config");
                throw null;
            }
            gm.l.l("configRepository");
            throw null;
        }
        gm.l.l("config");
        throw null;
    }

    public final void l1() {
        Integer valueOf;
        Integer valueOf2;
        gg.b bVar = this.f12106y0;
        if (bVar != null) {
            int i10 = -1;
            int i11 = 280;
            if (bVar.f15339e == 0) {
                Calendar calendar = this.A0;
                gm.l.e(calendar, "calendar");
                gg.b bVar2 = this.f12106y0;
                if (bVar2 != null) {
                    Date date = bVar2.f15342h;
                    int i12 = bVar2.f15340f;
                    Date date2 = this.B0;
                    gm.l.f(date, "latest");
                    gm.l.f(date2, "target");
                    if (hh.c.g(calendar, date2, date)) {
                        valueOf2 = null;
                    } else {
                        int e10 = hh.c.e(calendar, date, date2);
                        if (i12 <= 28) {
                            i11 = i12 + 252;
                        }
                        if (e10 <= i11) {
                            i10 = e10 + 1;
                        }
                        valueOf2 = Integer.valueOf(i10);
                    }
                    if (valueOf2 != null) {
                        j1().itemRemindType.getSummaryView().setText(p0(R.string.wh_pregnancy_remind_info2, Integer.valueOf(valueOf2.intValue() / 7), Integer.valueOf(valueOf2.intValue() % 7)));
                        return;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                Calendar calendar2 = this.A0;
                gm.l.e(calendar2, "calendar");
                gg.b bVar3 = this.f12106y0;
                if (bVar3 != null) {
                    Date date3 = bVar3.f15342h;
                    int i13 = bVar3.f15340f;
                    Date date4 = this.B0;
                    gm.l.f(date3, "latest");
                    gm.l.f(date4, "target");
                    if (hh.c.g(calendar2, date4, date3)) {
                        valueOf = null;
                    } else {
                        int e11 = hh.c.e(calendar2, date3, date4);
                        if (i13 <= 28) {
                            i11 = i13 + 252;
                        }
                        if (e11 > i11) {
                            valueOf = -1;
                        } else {
                            valueOf = Integer.valueOf(i11 - e11);
                        }
                    }
                    if (valueOf != null) {
                        j1().itemRemindType.getSummaryView().setText(p0(R.string.wh_pregnancy_remind_info1, valueOf));
                        return;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            j1().itemRemindType.getSummaryView().setText((CharSequence) null);
            return;
        }
        gm.l.l("config");
        throw null;
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment.b
    public final void m(String str, Date date) {
        int i10;
        TextView summaryView;
        SimpleDateFormat i12;
        Date date2;
        int i11;
        if (gm.l.a(str, this.G0)) {
            gg.b bVar = this.f12106y0;
            if (bVar != null) {
                this.f12106y0 = gg.b.a(bVar, 0, false, 0, 0, 0, 0, 0, date, 127);
                TextView summaryView2 = j1().itemLatest.getSummaryView();
                SimpleDateFormat i13 = i1();
                gg.b bVar2 = this.f12106y0;
                if (bVar2 != null) {
                    summaryView2.setText(i13.format(bVar2.f15342h));
                    return;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            gm.l.l("config");
            throw null;
        }
        if (gm.l.a(str, this.H0)) {
            this.C0 = date;
            TextView summaryView3 = j1().itemPregnancyDueDate.getSummaryView();
            SimpleDateFormat i14 = i1();
            Date date3 = this.C0;
            if (date3 != null) {
                summaryView3.setText(i14.format(date3));
                gg.b bVar3 = this.f12106y0;
                if (bVar3 != null) {
                    Calendar calendar = this.A0;
                    gm.l.e(calendar, "calendar");
                    Date date4 = this.C0;
                    if (date4 != null) {
                        gg.b bVar4 = this.f12106y0;
                        if (bVar4 != null) {
                            int i15 = bVar4.f15340f;
                            if (i15 > 28) {
                                calendar.setTime(date4);
                                i11 = calendar.get(5) - 280;
                            } else {
                                calendar.setTime(date4);
                                i11 = calendar.get(5) + (-(i15 + 252));
                            }
                            calendar.set(5, i11);
                            Date time = calendar.getTime();
                            gm.l.e(time, "calendar.time");
                            this.f12106y0 = gg.b.a(bVar3, 0, false, 0, 0, 0, 0, 0, time, 127);
                            summaryView = j1().itemPregnancyLatest.getSummaryView();
                            i12 = i1();
                            gg.b bVar5 = this.f12106y0;
                            if (bVar5 != null) {
                                date2 = bVar5.f15342h;
                            } else {
                                gm.l.l("config");
                                throw null;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        gm.l.l("dueDate");
                        throw null;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("dueDate");
                throw null;
            }
        } else if (gm.l.a(str, this.J0)) {
            gg.b bVar6 = this.f12106y0;
            if (bVar6 != null) {
                this.f12106y0 = gg.b.a(bVar6, 0, false, 0, 0, 0, 0, 0, date, 127);
                TextView summaryView4 = j1().itemPregnancyLatest.getSummaryView();
                SimpleDateFormat i16 = i1();
                gg.b bVar7 = this.f12106y0;
                if (bVar7 != null) {
                    summaryView4.setText(i16.format(bVar7.f15342h));
                    Calendar calendar2 = this.A0;
                    gm.l.e(calendar2, "calendar");
                    gg.b bVar8 = this.f12106y0;
                    if (bVar8 != null) {
                        Date date5 = bVar8.f15342h;
                        int i17 = bVar8.f15340f;
                        gm.l.f(date5, "latest");
                        if (i17 > 28) {
                            calendar2.setTime(date5);
                            i10 = calendar2.get(5) + 280;
                        } else {
                            calendar2.setTime(date5);
                            i10 = i17 + 252 + calendar2.get(5);
                        }
                        calendar2.set(5, i10);
                        Date time2 = calendar2.getTime();
                        gm.l.e(time2, "calendar.time");
                        this.C0 = time2;
                        summaryView = j1().itemPregnancyDueDate.getSummaryView();
                        i12 = i1();
                        Date date6 = this.C0;
                        if (date6 != null) {
                            date2 = date6;
                        } else {
                            gm.l.l("dueDate");
                            throw null;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                gm.l.l("config");
                throw null;
            }
        } else {
            return;
        }
        summaryView.setText(i12.format(date2));
        l1();
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final String q(int i10, String str) {
        if (gm.l.a(str, this.M0)) {
            Locale locale = m0.f4330a;
            if (locale != null) {
                return o5.a0.a(new Object[]{Integer.valueOf(i10 / 60), Integer.valueOf(i10 % 60)}, 2, locale, "%02d:%02d", "format(locale, format, *args)");
            }
            gm.l.l("systemLocale");
            throw null;
        }
        return SelectIntDialogFragment.b.a.a(i10);
    }
}
