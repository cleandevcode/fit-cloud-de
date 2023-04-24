package com.topstep.fitcloud.pro.ui.settings.wh;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.m0;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.topstep.fitcloud.pro.databinding.FragmentWhHomePageBinding;
import com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import pm.e0;
import sm.g;
import sm.t0;
import tl.i;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class WhHomePageFragment extends li.b {

    /* renamed from: w0 */
    public static final /* synthetic */ h<Object>[] f12085w0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12086t0;

    /* renamed from: u0 */
    public ah.a f12087u0;

    /* renamed from: v0 */
    public final i f12088v0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<SimpleDateFormat> {

        /* renamed from: b */
        public static final a f12089b = new a();

        public a() {
            super(0);
        }

        @Override // fm.a
        public final SimpleDateFormat m() {
            return m0.m();
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment$onViewCreated$1", f = "WhHomePageFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f12090e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment$onViewCreated$1$1", f = "WhHomePageFragment.kt", l = {43}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f12092e;

            /* renamed from: f */
            public final /* synthetic */ WhHomePageFragment f12093f;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0205a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ WhHomePageFragment f12094a;

                public C0205a(WhHomePageFragment whHomePageFragment) {
                    this.f12094a = whHomePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    int i10;
                    TextView summaryView;
                    String p02;
                    gg.b bVar = (gg.b) obj;
                    WhHomePageFragment whHomePageFragment = this.f12094a;
                    h<Object>[] hVarArr = WhHomePageFragment.f12085w0;
                    if (bVar != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    whHomePageFragment.h1().itemEnabled.getSwitchView().setChecked(z10);
                    LinearLayout linearLayout = whHomePageFragment.h1().layoutDetail;
                    gm.l.e(linearLayout, "viewBind.layoutDetail");
                    qi.h.m(linearLayout, z10);
                    if (z10) {
                        gm.l.c(bVar);
                        int i11 = bVar.f15335a;
                        if (i11 == 1) {
                            PreferenceItem preferenceItem = whHomePageFragment.h1().itemModeMenstruation;
                            gm.l.e(preferenceItem, "viewBind.itemModeMenstruation");
                            preferenceItem.getImageView().setVisibility(0);
                            preferenceItem.getSummaryView().setVisibility(0);
                            PreferenceItem preferenceItem2 = whHomePageFragment.h1().itemModePregnancyPrepare;
                            gm.l.e(preferenceItem2, "viewBind.itemModePregnancyPrepare");
                            WhHomePageFragment.i1(preferenceItem2);
                            PreferenceItem preferenceItem3 = whHomePageFragment.h1().itemModePregnancy;
                            gm.l.e(preferenceItem3, "viewBind.itemModePregnancy");
                            WhHomePageFragment.i1(preferenceItem3);
                            summaryView = whHomePageFragment.h1().itemModeMenstruation.getSummaryView();
                            p02 = whHomePageFragment.p0(R.string.wh_menstruation_days_info, Integer.valueOf(bVar.f15340f), Integer.valueOf(bVar.f15341g));
                        } else if (i11 == 2) {
                            PreferenceItem preferenceItem4 = whHomePageFragment.h1().itemModeMenstruation;
                            gm.l.e(preferenceItem4, "viewBind.itemModeMenstruation");
                            WhHomePageFragment.i1(preferenceItem4);
                            PreferenceItem preferenceItem5 = whHomePageFragment.h1().itemModePregnancyPrepare;
                            gm.l.e(preferenceItem5, "viewBind.itemModePregnancyPrepare");
                            preferenceItem5.getImageView().setVisibility(0);
                            preferenceItem5.getSummaryView().setVisibility(0);
                            PreferenceItem preferenceItem6 = whHomePageFragment.h1().itemModePregnancy;
                            gm.l.e(preferenceItem6, "viewBind.itemModePregnancy");
                            WhHomePageFragment.i1(preferenceItem6);
                            summaryView = whHomePageFragment.h1().itemModePregnancyPrepare.getSummaryView();
                            p02 = whHomePageFragment.p0(R.string.wh_menstruation_days_info, Integer.valueOf(bVar.f15340f), Integer.valueOf(bVar.f15341g));
                        } else {
                            PreferenceItem preferenceItem7 = whHomePageFragment.h1().itemModeMenstruation;
                            gm.l.e(preferenceItem7, "viewBind.itemModeMenstruation");
                            WhHomePageFragment.i1(preferenceItem7);
                            PreferenceItem preferenceItem8 = whHomePageFragment.h1().itemModePregnancyPrepare;
                            gm.l.e(preferenceItem8, "viewBind.itemModePregnancyPrepare");
                            WhHomePageFragment.i1(preferenceItem8);
                            PreferenceItem preferenceItem9 = whHomePageFragment.h1().itemModePregnancy;
                            gm.l.e(preferenceItem9, "viewBind.itemModePregnancy");
                            preferenceItem9.getImageView().setVisibility(0);
                            preferenceItem9.getSummaryView().setVisibility(0);
                            Calendar calendar = Calendar.getInstance();
                            gm.l.e(calendar, "getInstance()");
                            Date date = bVar.f15342h;
                            int i12 = bVar.f15340f;
                            gm.l.f(date, "latest");
                            if (i12 > 28) {
                                calendar.setTime(date);
                                i10 = calendar.get(5) + 280;
                            } else {
                                calendar.setTime(date);
                                i10 = i12 + 252 + calendar.get(5);
                            }
                            calendar.set(5, i10);
                            Date time = calendar.getTime();
                            gm.l.e(time, "calendar.time");
                            summaryView = whHomePageFragment.h1().itemModePregnancy.getSummaryView();
                            p02 = whHomePageFragment.p0(R.string.wh_menstruation_due_date_info, ((SimpleDateFormat) whHomePageFragment.f12088v0.getValue()).format(time));
                        }
                        summaryView.setText(p02);
                    } else {
                        PreferenceItem preferenceItem10 = whHomePageFragment.h1().itemModeMenstruation;
                        gm.l.e(preferenceItem10, "viewBind.itemModeMenstruation");
                        WhHomePageFragment.i1(preferenceItem10);
                        PreferenceItem preferenceItem11 = whHomePageFragment.h1().itemModePregnancyPrepare;
                        gm.l.e(preferenceItem11, "viewBind.itemModePregnancyPrepare");
                        WhHomePageFragment.i1(preferenceItem11);
                        PreferenceItem preferenceItem12 = whHomePageFragment.h1().itemModePregnancy;
                        gm.l.e(preferenceItem12, "viewBind.itemModePregnancy");
                        WhHomePageFragment.i1(preferenceItem12);
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WhHomePageFragment whHomePageFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f12093f = whHomePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                ((a) p(e0Var, dVar)).t(l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f12093f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f12092e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    ah.a aVar2 = this.f12093f.f12087u0;
                    if (aVar2 != null) {
                        t0 a10 = aVar2.a();
                        C0205a c0205a = new C0205a(this.f12093f);
                        this.f12092e = 1;
                        if (a10.a(c0205a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("configRepository");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            WhHomePageFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((b) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f12090e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            z0.g((e0) this.f12090e, null, 0, new a(WhHomePageFragment.this, null), 3);
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.wh.WhHomePageFragment$onViewCreated$2$1", f = "WhHomePageFragment.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f12095e;

        /* renamed from: g */
        public final /* synthetic */ boolean f12097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, xl.d<? super c> dVar) {
            super(2, dVar);
            WhHomePageFragment.this = r1;
            this.f12097g = z10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((c) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new c(this.f12097g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f12095e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                ah.a aVar2 = WhHomePageFragment.this.f12087u0;
                if (aVar2 != null) {
                    boolean z10 = this.f12097g;
                    this.f12095e = 1;
                    if (aVar2.d(z10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("configRepository");
                    throw null;
                }
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<PreferenceItem, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            WhHomePageFragment.this = r1;
        }

        @Override // fm.l
        public final l k(PreferenceItem preferenceItem) {
            gm.l.f(preferenceItem, "it");
            v.l(tb.a.f(WhHomePageFragment.this), new li.g(1));
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<PreferenceItem, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            WhHomePageFragment.this = r1;
        }

        @Override // fm.l
        public final l k(PreferenceItem preferenceItem) {
            gm.l.f(preferenceItem, "it");
            v.l(tb.a.f(WhHomePageFragment.this), new li.g(2));
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.l<PreferenceItem, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            WhHomePageFragment.this = r1;
        }

        @Override // fm.l
        public final l k(PreferenceItem preferenceItem) {
            gm.l.f(preferenceItem, "it");
            v.l(tb.a.f(WhHomePageFragment.this), new li.g(3));
            return l.f28297a;
        }
    }

    static {
        t tVar = new t(WhHomePageFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentWhHomePageBinding;", 0);
        b0.f15488a.getClass();
        f12085w0 = new h[]{tVar};
    }

    public WhHomePageFragment() {
        super(R.layout.fragment_wh_home_page);
        this.f12086t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentWhHomePageBinding.class, this);
        this.f12088v0 = new i(a.f12089b);
    }

    public static void i1(PreferenceItem preferenceItem) {
        preferenceItem.getImageView().setVisibility(4);
        preferenceItem.getSummaryView().setVisibility(8);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        h1().itemModeMenstruation.getImageView().setImageResource(R.drawable.ic_baseline_done_24);
        h1().itemModePregnancyPrepare.getImageView().setImageResource(R.drawable.ic_baseline_done_24);
        h1().itemModePregnancy.getImageView().setImageResource(R.drawable.ic_baseline_done_24);
        qi.h.k(qi.h.i(this), new b(null));
        h1().itemEnabled.getSwitchView().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: li.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                WhHomePageFragment whHomePageFragment = WhHomePageFragment.this;
                mm.h<Object>[] hVarArr = WhHomePageFragment.f12085w0;
                gm.l.f(whHomePageFragment, "this$0");
                if (compoundButton.isPressed()) {
                    try {
                        z0.n(new WhHomePageFragment.c(z10, null));
                    } catch (Exception e10) {
                        qi.p.f(whHomePageFragment.f1(), e10);
                    }
                }
            }
        });
        p.b.g(h1().itemModeMenstruation, new d());
        p.b.g(h1().itemModePregnancyPrepare, new e());
        p.b.g(h1().itemModePregnancy, new f());
    }

    public final FragmentWhHomePageBinding h1() {
        return (FragmentWhHomePageBinding) this.f12086t0.a(this, f12085w0[0]);
    }
}
