package com.topstep.fitcloud.pro.ui.settings.wh;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentWhDetailBinding;
import com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment;
import com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import mf.a0;
import pm.e0;

@Metadata
/* loaded from: classes2.dex */
public final class WhDetailFragment extends li.a implements CompoundButton.OnCheckedChangeListener, DatePickerDialogFragment.b {
    public static final /* synthetic */ mm.h<Object>[] I0;
    public final Date A0;
    public Date B0;
    public final c C0;
    public final b D0;
    public final a E0;
    public final String F0;
    public final String G0;
    public final String H0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12056t0;

    /* renamed from: u0 */
    public final i2.g f12057u0;

    /* renamed from: v0 */
    public final SimpleDateFormat f12058v0;

    /* renamed from: w0 */
    public final SimpleDateFormat f12059w0;

    /* renamed from: x0 */
    public ah.a f12060x0;

    /* renamed from: y0 */
    public gg.b f12061y0;

    /* renamed from: z0 */
    public final Calendar f12062z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            WhDetailFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            DatePickerDialogFragment a10;
            j0 h02;
            String str;
            View view2 = view;
            gm.l.f(view2, "view");
            WhDetailFragment whDetailFragment = WhDetailFragment.this;
            mm.h<Object>[] hVarArr = WhDetailFragment.I0;
            if (gm.l.a(view2, whDetailFragment.j1().tvGotoToday)) {
                WhCalendarView whCalendarView = WhDetailFragment.this.j1().calendarView;
                whCalendarView.setYearMonth(whCalendarView.f12031b);
                Date date = whCalendarView.f12043n;
                if (date == null || !WhCalendarView.c(date, whCalendarView.f12031b)) {
                    Date date2 = whCalendarView.f12031b;
                    whCalendarView.f12043n = date2;
                    WhCalendarView.b bVar = whCalendarView.f12044o;
                    if (bVar != null) {
                        bVar.a(date2);
                    }
                }
            } else if (gm.l.a(view2, WhDetailFragment.this.j1().imgArrowLeft)) {
                WhCalendarView whCalendarView2 = WhDetailFragment.this.j1().calendarView;
                whCalendarView2.f12041l.setTime(whCalendarView2.f12042m);
                Calendar calendar = whCalendarView2.f12041l;
                calendar.set(2, calendar.get(2) - 1);
                whCalendarView2.setYearMonth(whCalendarView2.f12041l.getTime());
            } else {
                if (gm.l.a(view2, WhDetailFragment.this.j1().tvYearMonth)) {
                    WhDetailFragment whDetailFragment2 = WhDetailFragment.this;
                    whDetailFragment2.f12062z0.setTime(whDetailFragment2.A0);
                    Calendar calendar2 = WhDetailFragment.this.f12062z0;
                    calendar2.set(1, calendar2.get(1) - 3);
                    Date time = WhDetailFragment.this.f12062z0.getTime();
                    gm.l.e(time, "calendar.time");
                    Calendar calendar3 = WhDetailFragment.this.f12062z0;
                    calendar3.set(1, calendar3.get(1) + 6);
                    Date time2 = WhDetailFragment.this.f12062z0.getTime();
                    gm.l.e(time2, "calendar.time");
                    int i10 = DatePickerDialogFragment.B0;
                    a10 = DatePickerDialogFragment.a.a(time, time2, WhDetailFragment.this.j1().calendarView.getYearMonth(), WhDetailFragment.this.o0(R.string.wh_set_calendar_title), true);
                    h02 = WhDetailFragment.this.h0();
                    str = WhDetailFragment.this.F0;
                } else if (gm.l.a(view2, WhDetailFragment.this.j1().imgArrowRight)) {
                    WhCalendarView whCalendarView3 = WhDetailFragment.this.j1().calendarView;
                    whCalendarView3.f12041l.setTime(whCalendarView3.f12042m);
                    Calendar calendar4 = whCalendarView3.f12041l;
                    calendar4.set(2, calendar4.get(2) + 1);
                    whCalendarView3.setYearMonth(whCalendarView3.f12041l.getTime());
                } else if (gm.l.a(view2, WhDetailFragment.this.j1().itemPregnancyDueDate)) {
                    Date date3 = new Date();
                    Calendar calendar5 = WhDetailFragment.this.f12062z0;
                    gm.l.e(calendar5, "calendar");
                    calendar5.setTime(date3);
                    calendar5.set(5, calendar5.get(5) + 280);
                    Date time3 = calendar5.getTime();
                    gm.l.e(time3, "calendar.time");
                    int i11 = DatePickerDialogFragment.B0;
                    WhDetailFragment whDetailFragment3 = WhDetailFragment.this;
                    Date date4 = whDetailFragment3.B0;
                    if (date4 != null) {
                        a10 = DatePickerDialogFragment.a.a(date3, time3, date4, whDetailFragment3.o0(R.string.wh_set_due_date), false);
                        h02 = WhDetailFragment.this.h0();
                        str = WhDetailFragment.this.G0;
                    } else {
                        gm.l.l("dueDate");
                        throw null;
                    }
                } else if (gm.l.a(view2, WhDetailFragment.this.j1().itemLatest)) {
                    Date date5 = new Date();
                    Calendar calendar6 = Calendar.getInstance();
                    gm.l.e(calendar6, "getInstance()");
                    calendar6.setTime(date5);
                    calendar6.set(5, calendar6.get(5) - 280);
                    Date time4 = calendar6.getTime();
                    gm.l.e(time4, "calendar.time");
                    int i12 = DatePickerDialogFragment.B0;
                    WhDetailFragment whDetailFragment4 = WhDetailFragment.this;
                    gg.b bVar2 = whDetailFragment4.f12061y0;
                    if (bVar2 != null) {
                        a10 = DatePickerDialogFragment.a.a(time4, date5, bVar2.f15342h, whDetailFragment4.o0(R.string.wh_menstruation_latest), false);
                        h02 = WhDetailFragment.this.h0();
                        str = WhDetailFragment.this.H0;
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                }
                a10.h1(h02, str);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements WhCalendarView.a {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$holder$1$getMenstruationDateType$1", f = "WhDetailFragment.kt", l = {221}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super gg.a>, Object> {

            /* renamed from: e */
            public int f12065e;

            /* renamed from: f */
            public final /* synthetic */ WhDetailFragment f12066f;

            /* renamed from: g */
            public final /* synthetic */ Date f12067g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WhDetailFragment whDetailFragment, Date date, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f12066f = whDetailFragment;
                this.f12067g = date;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super gg.a> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f12066f, this.f12067g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f12065e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ah.a i12 = this.f12066f.i1();
                    Calendar calendar = this.f12066f.f12062z0;
                    gm.l.e(calendar, "calendar");
                    Date date = this.f12067g;
                    this.f12065e = 1;
                    obj = i12.e(calendar, date, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        public b() {
            WhDetailFragment.this = r1;
        }

        @Override // com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.a
        public final boolean a() {
            WhDetailFragment whDetailFragment = WhDetailFragment.this;
            mm.h<Object>[] hVarArr = WhDetailFragment.I0;
            if (whDetailFragment.h1().f20035a == 3) {
                return true;
            }
            return false;
        }

        @Override // com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.a
        public final Integer b(Date date) {
            gm.l.f(date, "date");
            gg.a aVar = (gg.a) z0.n(new a(WhDetailFragment.this, date, null));
            if (aVar == null) {
                return null;
            }
            return Integer.valueOf(aVar.f15330d);
        }

        @Override // com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.a
        public final Integer c(Date date) {
            int i10;
            int i11;
            gm.l.f(date, "date");
            Calendar calendar = WhDetailFragment.this.f12062z0;
            gm.l.e(calendar, "calendar");
            gg.b bVar = WhDetailFragment.this.f12061y0;
            if (bVar != null) {
                Date date2 = bVar.f15342h;
                int i12 = bVar.f15340f;
                gm.l.f(date2, "latest");
                if (date.before(date2)) {
                    return null;
                }
                int e10 = hh.c.e(calendar, date2, date);
                if (i12 > 28) {
                    i10 = 280;
                } else {
                    i10 = i12 + 252;
                }
                if (e10 <= 84) {
                    i11 = 1;
                } else if (e10 <= 189) {
                    i11 = 2;
                } else if (e10 > i10) {
                    return null;
                } else {
                    i11 = 3;
                }
                return Integer.valueOf(i11);
            }
            gm.l.l("config");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements WhCalendarView.b {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$listener$1$onDateSelect$result$1", f = "WhDetailFragment.kt", l = {140}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super gg.a>, Object> {

            /* renamed from: e */
            public int f12069e;

            /* renamed from: f */
            public final /* synthetic */ WhDetailFragment f12070f;

            /* renamed from: g */
            public final /* synthetic */ Date f12071g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WhDetailFragment whDetailFragment, Date date, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f12070f = whDetailFragment;
                this.f12071g = date;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super gg.a> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f12070f, this.f12071g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f12069e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ah.a i12 = this.f12070f.i1();
                    Calendar calendar = this.f12070f.f12062z0;
                    gm.l.e(calendar, "calendar");
                    Date date = this.f12071g;
                    this.f12069e = 1;
                    obj = i12.e(calendar, date, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        public c() {
            WhDetailFragment.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:216:0x02de, code lost:
            if (r13.before(com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment.this.A0) != false) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:182:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x02cb  */
        @Override // com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.Date r13) {
            /*
                Method dump skipped, instructions count: 760
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment.c.a(java.util.Date):void");
        }

        @Override // com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.b
        public final void b(boolean z10) {
            int i10;
            WhDetailFragment whDetailFragment = WhDetailFragment.this;
            mm.h<Object>[] hVarArr = WhDetailFragment.I0;
            TextView textView = whDetailFragment.j1().tvYearMonth;
            WhDetailFragment whDetailFragment2 = WhDetailFragment.this;
            textView.setText(whDetailFragment2.f12059w0.format(whDetailFragment2.j1().calendarView.getYearMonth()));
            TextView textView2 = WhDetailFragment.this.j1().tvGotoToday;
            gm.l.e(textView2, "viewBind.tvGotoToday");
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView2.setVisibility(i10);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$onCheckedChanged$1", f = "WhDetailFragment.kt", l = {308}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12072e;

        /* renamed from: g */
        public final /* synthetic */ Date f12074g;

        /* renamed from: h */
        public final /* synthetic */ boolean f12075h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date, boolean z10, xl.d<? super d> dVar) {
            super(2, dVar);
            WhDetailFragment.this = r1;
            this.f12074g = date;
            this.f12075h = z10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(this.f12074g, this.f12075h, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12072e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ah.a i12 = WhDetailFragment.this.i1();
                Calendar calendar = WhDetailFragment.this.f12062z0;
                gm.l.e(calendar, "calendar");
                Date date = this.f12074g;
                boolean z10 = this.f12075h;
                this.f12072e = 1;
                if (i12.i(calendar, date, z10, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$onCreate$1", f = "WhDetailFragment.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<e0, xl.d<? super gg.b>, Object> {

        /* renamed from: e */
        public int f12076e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            WhDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super gg.b> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12076e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ah.a i12 = WhDetailFragment.this.i1();
                int i11 = WhDetailFragment.this.h1().f20035a;
                this.f12076e = 1;
                obj = i12.c(i11, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$onViewCreated$isEnabled$1", f = "WhDetailFragment.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<e0, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public int f12078e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            WhDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super Boolean> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12078e;
            if (i10 == 0) {
                a0.k(obj);
                ah.a i12 = WhDetailFragment.this.i1();
                this.f12078e = 1;
                obj = i12.h(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return obj;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$saveConfig$1", f = "WhDetailFragment.kt", l = {319}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f12080e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            WhDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new g(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12080e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ah.a i12 = WhDetailFragment.this.i1();
                gg.b bVar = WhDetailFragment.this.f12061y0;
                if (bVar != null) {
                    this.f12080e = 1;
                    if (i12.b(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f12082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f12082b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f12082b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f12082b, " has null arguments"));
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment$updateLatestUI$result$1", f = "WhDetailFragment.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends zl.i implements p<e0, xl.d<? super gg.a>, Object> {

        /* renamed from: e */
        public int f12083e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(2, dVar);
            WhDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super gg.a> dVar) {
            return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new i(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12083e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ah.a i12 = WhDetailFragment.this.i1();
                Calendar calendar = WhDetailFragment.this.f12062z0;
                gm.l.e(calendar, "calendar");
                Date date = WhDetailFragment.this.A0;
                this.f12083e = 1;
                obj = i12.e(calendar, date, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    static {
        t tVar = new t(WhDetailFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentWhDetailBinding;", 0);
        b0.f15488a.getClass();
        I0 = new mm.h[]{tVar};
    }

    public WhDetailFragment() {
        super(R.layout.fragment_wh_detail);
        this.f12056t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentWhDetailBinding.class, this);
        this.f12057u0 = new i2.g(b0.a(li.d.class), new h(this));
        this.f12058v0 = m0.m();
        this.f12059w0 = m0.k("yyyy-MMM");
        this.f12062z0 = Calendar.getInstance();
        this.A0 = new Date();
        this.C0 = new c();
        this.D0 = new b();
        this.E0 = new a();
        this.F0 = "set_calendar";
        this.G0 = "pregnancy_due_date";
        this.H0 = "latest";
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f12061y0 = (gg.b) z0.n(new e(null));
    }

    @Override // androidx.fragment.app.r
    public final void D0() {
        this.E = true;
        i1().g();
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        int i10;
        int i11;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (!((Boolean) z0.n(new f(null))).booleanValue()) {
            tb.a.f(this).p();
        }
        int i12 = h1().f20035a;
        if (i12 != 1) {
            if (i12 != 2) {
                i10 = R.string.wh_mode_pregnancy;
            } else {
                i10 = R.string.wh_mode_pregnancy_prepare;
            }
        } else {
            i10 = R.string.wh_menstruation;
        }
        j1().toolbar.setTitle(i10);
        j1().toolbar.k(R.menu.menu_wh_settings);
        j1().toolbar.setOnMenuItemClickListener(new jc.f(11, this));
        j1().calendarView.setOnDateSelectListener(this.C0);
        j1().calendarView.setDataHolder(this.D0);
        j1().tvYearMonth.setText(this.f12059w0.format(j1().calendarView.getYearMonth()));
        if (h1().f20035a != 3) {
            j1().layoutLegendPregnancy.setVisibility(8);
            j1().itemPregnancyDueDate.setVisibility(8);
            l1();
        } else {
            j1().layoutLegendMenstruation.setVisibility(8);
            j1().itemBeginOperation.setVisibility(8);
            j1().itemEndOperation.setVisibility(8);
            j1().itemNoOperation.setVisibility(8);
            j1().itemLatest.setVisibility(8);
            Calendar calendar = this.f12062z0;
            gm.l.e(calendar, "calendar");
            gg.b bVar = this.f12061y0;
            if (bVar != null) {
                Date date = bVar.f15342h;
                int i13 = bVar.f15340f;
                gm.l.f(date, "latest");
                if (i13 > 28) {
                    calendar.setTime(date);
                    i11 = calendar.get(5) + 280;
                } else {
                    calendar.setTime(date);
                    i11 = calendar.get(5) + i13 + 252;
                }
                calendar.set(5, i11);
                Date time = calendar.getTime();
                gm.l.e(time, "calendar.time");
                this.B0 = time;
                m1();
            } else {
                gm.l.l("config");
                throw null;
            }
        }
        WhCalendarView whCalendarView = j1().calendarView;
        whCalendarView.setYearMonth(whCalendarView.f12031b);
        Date date2 = whCalendarView.f12031b;
        whCalendarView.f12043n = date2;
        WhCalendarView.b bVar2 = whCalendarView.f12044o;
        if (bVar2 != null) {
            bVar2.a(date2);
        }
        j1().calendarView.invalidate();
        p.b.g(j1().tvGotoToday, this.E0);
        p.b.g(j1().imgArrowLeft, this.E0);
        p.b.g(j1().tvYearMonth, this.E0);
        p.b.g(j1().imgArrowRight, this.E0);
        p.b.g(j1().itemPregnancyDueDate, this.E0);
        p.b.g(j1().itemLatest, this.E0);
        j1().itemBeginOperation.getSwitchView().setOnCheckedChangeListener(this);
        j1().itemEndOperation.getSwitchView().setOnCheckedChangeListener(this);
    }

    public final li.d h1() {
        return (li.d) this.f12057u0.getValue();
    }

    public final ah.a i1() {
        ah.a aVar = this.f12060x0;
        if (aVar != null) {
            return aVar;
        }
        gm.l.l("configRepository");
        throw null;
    }

    public final FragmentWhDetailBinding j1() {
        return (FragmentWhDetailBinding) this.f12056t0.a(this, I0[0]);
    }

    public final void k1() {
        try {
            z0.n(new g(null));
        } catch (Exception e10) {
            qi.p.f(f1(), e10);
        }
        j1().calendarView.invalidate();
        Date selectDate = j1().calendarView.getSelectDate();
        if (selectDate == null) {
            return;
        }
        this.C0.a(selectDate);
    }

    public final void l1() {
        gg.a aVar = (gg.a) z0.n(new i(null));
        if (aVar == null) {
            TextView summaryView = j1().itemLatest.getSummaryView();
            SimpleDateFormat simpleDateFormat = this.f12058v0;
            gg.b bVar = this.f12061y0;
            if (bVar != null) {
                summaryView.setText(simpleDateFormat.format(bVar.f15342h));
                return;
            } else {
                gm.l.l("config");
                throw null;
            }
        }
        j1().itemLatest.getSummaryView().setText(this.f12058v0.format(aVar.f15327a));
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.DatePickerDialogFragment.b
    public final void m(String str, Date date) {
        int i10;
        if (gm.l.a(str, this.F0)) {
            j1().calendarView.setYearMonth(date);
        } else if (gm.l.a(str, this.G0)) {
            this.B0 = date;
            gg.b bVar = this.f12061y0;
            if (bVar != null) {
                Calendar calendar = this.f12062z0;
                gm.l.e(calendar, "calendar");
                Date date2 = this.B0;
                if (date2 != null) {
                    gg.b bVar2 = this.f12061y0;
                    if (bVar2 != null) {
                        int i11 = bVar2.f15340f;
                        if (i11 > 28) {
                            calendar.setTime(date2);
                            i10 = calendar.get(5) - 280;
                        } else {
                            calendar.setTime(date2);
                            i10 = calendar.get(5) + (-(i11 + 252));
                        }
                        calendar.set(5, i10);
                        Date time = calendar.getTime();
                        gm.l.e(time, "calendar.time");
                        this.f12061y0 = gg.b.a(bVar, 0, false, 0, 0, 0, 0, 0, time, 127);
                        k1();
                        m1();
                        return;
                    }
                    gm.l.l("config");
                    throw null;
                }
                gm.l.l("dueDate");
                throw null;
            }
            gm.l.l("config");
            throw null;
        } else if (gm.l.a(str, this.H0)) {
            gg.b bVar3 = this.f12061y0;
            if (bVar3 != null) {
                this.f12061y0 = gg.b.a(bVar3, 0, false, 0, 0, 0, 0, 0, date, 127);
                k1();
                l1();
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    public final void m1() {
        TextView summaryView = j1().itemPregnancyDueDate.getSummaryView();
        SimpleDateFormat simpleDateFormat = this.f12058v0;
        Date date = this.B0;
        if (date != null) {
            summaryView.setText(simpleDateFormat.format(date));
        } else {
            gm.l.l("dueDate");
            throw null;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Date selectDate;
        if (compoundButton == null || !compoundButton.isPressed()) {
            return;
        }
        if (!gm.l.a(compoundButton, j1().itemBeginOperation.getSwitchView())) {
            if (!gm.l.a(compoundButton, j1().itemEndOperation.getSwitchView()) || (selectDate = j1().calendarView.getSelectDate()) == null) {
                return;
            }
            try {
                z0.n(new d(selectDate, z10, null));
            } catch (Exception e10) {
                qi.p.f(f1(), e10);
            }
            j1().calendarView.invalidate();
            this.C0.a(selectDate);
            return;
        }
        Date selectDate2 = j1().calendarView.getSelectDate();
        if (selectDate2 != null && z10) {
            gg.b bVar = this.f12061y0;
            if (bVar == null) {
                gm.l.l("config");
                throw null;
            }
            this.f12061y0 = gg.b.a(bVar, 0, false, 0, 0, 0, 0, 0, selectDate2, 127);
            k1();
        }
    }
}
