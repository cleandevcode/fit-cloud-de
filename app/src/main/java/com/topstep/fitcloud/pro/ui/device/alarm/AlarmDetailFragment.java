package com.topstep.fitcloud.pro.ui.device.alarm;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentAlarmDetailBinding;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import gm.b0;
import gm.m;
import java.util.Calendar;
import kotlin.Metadata;
import oc.g1;
import th.b;
import th.h;
import th.p;
import th.r;
import th.s;
import th.t;

@Metadata
/* loaded from: classes2.dex */
public final class AlarmDetailFragment extends lh.i implements h.a, b.a, p.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f10742x0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10743o0;

    /* renamed from: p0 */
    public final t0 f10744p0;

    /* renamed from: q0 */
    public final i2.g f10745q0;

    /* renamed from: r0 */
    public final g1 f10746r0;

    /* renamed from: s0 */
    public final Calendar f10747s0;

    /* renamed from: t0 */
    public final tl.i f10748t0;

    /* renamed from: u0 */
    public rj.a f10749u0;

    /* renamed from: v0 */
    public boolean f10750v0;

    /* renamed from: w0 */
    public final a f10751w0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AlarmDetailFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            o hVar;
            View view2 = view;
            gm.l.f(view2, "view");
            AlarmDetailFragment alarmDetailFragment = AlarmDetailFragment.this;
            mm.h<Object>[] hVarArr = AlarmDetailFragment.f10742x0;
            if (gm.l.a(view2, alarmDetailFragment.h1().btnSave)) {
                int value = AlarmDetailFragment.this.h1().wheelHour.getValue();
                if (!AlarmDetailFragment.this.j1()) {
                    if (AlarmDetailFragment.this.h1().wheelAmPm.getValue() == 0) {
                        if (value == 12) {
                            value = 0;
                        }
                    } else if (value < 12) {
                        value += 12;
                    }
                }
                AlarmDetailFragment alarmDetailFragment2 = AlarmDetailFragment.this;
                rj.a aVar = alarmDetailFragment2.f10749u0;
                if (aVar != null) {
                    aVar.f25761e = value;
                    aVar.f25762f = alarmDetailFragment2.h1().wheelMinute.getValue();
                    rj.a aVar2 = AlarmDetailFragment.this.f10749u0;
                    if (aVar2 != null) {
                        aVar2.f25764h = true;
                        aVar2.a();
                        AlarmDetailFragment alarmDetailFragment3 = AlarmDetailFragment.this;
                        if (alarmDetailFragment3.f10750v0) {
                            AlarmViewModel i12 = alarmDetailFragment3.i1();
                            int i10 = ((th.c) AlarmDetailFragment.this.f10745q0.getValue()).f28179a;
                            rj.a aVar3 = AlarmDetailFragment.this.f10749u0;
                            if (aVar3 != null) {
                                i12.getClass();
                                z0.g(rm.l.h(i12), null, 0, new t(i12, i10, aVar3, null), 3);
                            } else {
                                gm.l.l("alarm");
                                throw null;
                            }
                        } else {
                            AlarmViewModel i13 = alarmDetailFragment3.i1();
                            rj.a aVar4 = AlarmDetailFragment.this.f10749u0;
                            if (aVar4 != null) {
                                i13.getClass();
                                z0.g(rm.l.h(i13), null, 0, new r(i13, aVar4, null), 3);
                            } else {
                                gm.l.l("alarm");
                                throw null;
                            }
                        }
                        tb.a.f(AlarmDetailFragment.this).o();
                    } else {
                        gm.l.l("alarm");
                        throw null;
                    }
                } else {
                    gm.l.l("alarm");
                    throw null;
                }
            } else {
                if (gm.l.a(view2, AlarmDetailFragment.this.h1().btnDelete)) {
                    hVar = new th.b();
                } else if (gm.l.a(view2, AlarmDetailFragment.this.h1().itemRepeat)) {
                    hVar = new p();
                } else if (gm.l.a(view2, AlarmDetailFragment.this.h1().itemLabel)) {
                    hVar = new th.h();
                }
                hVar.h1(AlarmDetailFragment.this.h0(), null);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            AlarmDetailFragment.this = r1;
        }

        @Override // fm.a
        public final Boolean m() {
            boolean z10;
            AlarmDetailFragment alarmDetailFragment = AlarmDetailFragment.this;
            mm.h<Object>[] hVarArr = AlarmDetailFragment.f10742x0;
            th.f fVar = alarmDetailFragment.i1().f10786i;
            Context V0 = AlarmDetailFragment.this.V0();
            Boolean bool = fVar.f28186a;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                boolean is24HourFormat = DateFormat.is24HourFormat(V0);
                fVar.f28186a = Boolean.valueOf(is24HourFormat);
                z10 = is24HourFormat;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements m7.f {
        public c() {
            AlarmDetailFragment.this = r1;
        }

        @Override // m7.f
        public final String a(int i10, int i11) {
            String string;
            String str;
            if (i10 == 0) {
                string = AlarmDetailFragment.this.V0().getString(R.string.ds_alarm_am);
                str = "{\n                      …am)\n                    }";
            } else {
                string = AlarmDetailFragment.this.V0().getString(R.string.ds_alarm_pm);
                str = "{\n                      …pm)\n                    }";
            }
            gm.l.e(string, str);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.r rVar) {
            super(0);
            this.f10755b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10755b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f10755b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10756b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i iVar) {
            super(0);
            this.f10756b = iVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10756b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f10757b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10757b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.d dVar) {
            super(0);
            this.f10758b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10758b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10759b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f10759b = rVar;
            this.f10760c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10760c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10759b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i() {
            super(0);
            AlarmDetailFragment.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return AlarmDetailFragment.this.W0();
        }
    }

    static {
        gm.t tVar = new gm.t(AlarmDetailFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAlarmDetailBinding;", 0);
        b0.f15488a.getClass();
        f10742x0 = new mm.h[]{tVar};
    }

    public AlarmDetailFragment() {
        super(R.layout.fragment_alarm_detail);
        this.f10743o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAlarmDetailBinding.class, this);
        tl.d a10 = fb.e.a(new e(new i()));
        this.f10744p0 = ab.b.f(this, b0.a(AlarmViewModel.class), new f(a10), new g(a10), new h(this, a10));
        this.f10745q0 = new i2.g(b0.a(th.c.class), new d(this));
        this.f10746r0 = new g1();
        this.f10747s0 = Calendar.getInstance();
        this.f10748t0 = new tl.i(new b());
        this.f10751w0 = new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e5, code lost:
        if (r4 == 0) goto L39;
     */
    @Override // lh.c, androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.alarm.AlarmDetailFragment.O0(android.view.View, android.os.Bundle):void");
    }

    @Override // th.b.a
    public final void P() {
        AlarmViewModel i12 = i1();
        int i10 = ((th.c) this.f10745q0.getValue()).f28179a;
        i12.getClass();
        z0.g(rm.l.h(i12), null, 0, new s(i12, i10, null), 3);
        tb.a.f(this).o();
    }

    @Override // th.h.a
    public final String S() {
        return g1();
    }

    public final String g1() {
        boolean z10;
        rj.a aVar = this.f10749u0;
        if (aVar != null) {
            String str = aVar.f25765i;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return o0(R.string.ds_alarm_label_default);
            }
            rj.a aVar2 = this.f10749u0;
            if (aVar2 != null) {
                return aVar2.f25765i;
            }
            gm.l.l("alarm");
            throw null;
        }
        gm.l.l("alarm");
        throw null;
    }

    public final FragmentAlarmDetailBinding h1() {
        return (FragmentAlarmDetailBinding) this.f10743o0.a(this, f10742x0[0]);
    }

    public final AlarmViewModel i1() {
        return (AlarmViewModel) this.f10744p0.getValue();
    }

    public final boolean j1() {
        return ((Boolean) this.f10748t0.getValue()).booleanValue();
    }

    @Override // th.h.a
    public final void p(String str) {
        rj.a aVar = this.f10749u0;
        if (aVar != null) {
            aVar.f25765i = str;
            h1().itemLabel.getTextView().setText(str);
            return;
        }
        gm.l.l("alarm");
        throw null;
    }

    @Override // th.p.a
    public final void u(int i10) {
        rj.a aVar = this.f10749u0;
        if (aVar != null) {
            aVar.f25763g = i10;
            TextView textView = h1().itemRepeat.getTextView();
            th.f fVar = i1().f10786i;
            Context V0 = V0();
            rj.a aVar2 = this.f10749u0;
            if (aVar2 != null) {
                textView.setText(fVar.a(V0, aVar2.f25763g));
                return;
            } else {
                gm.l.l("alarm");
                throw null;
            }
        }
        gm.l.l("alarm");
        throw null;
    }

    @Override // th.p.a
    public final int v() {
        rj.a aVar = this.f10749u0;
        if (aVar != null) {
            return aVar.f25763g;
        }
        gm.l.l("alarm");
        throw null;
    }
}
