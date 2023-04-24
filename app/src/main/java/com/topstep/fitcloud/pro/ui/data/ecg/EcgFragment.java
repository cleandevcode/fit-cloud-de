package com.topstep.fitcloud.pro.ui.data.ecg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import bi.r;
import bi.z0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentEcgBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.widget.EcgView;
import com.topstep.fitcloudpro.R;
import d2.a;
import i2.b0;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import jj.d0;
import kotlin.Metadata;
import mf.a0;
import og.t;
import pm.e0;
import pm.z1;
import rh.c0;
import rh.h0;
import rh.i;
import rh.k0;
import rh.w;
import rh.x;
import u6.z;
import ul.q;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class EcgFragment extends k0 implements v6.a, x.a, i.a {
    public static final /* synthetic */ mm.h<Object>[] D0;
    public c0 A0;
    public final a B0;
    public final b C0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10661t0;

    /* renamed from: u0 */
    public final rh.b f10662u0;

    /* renamed from: v0 */
    public final SimpleDateFormat f10663v0;

    /* renamed from: w0 */
    public final t0 f10664w0;

    /* renamed from: x0 */
    public DateMonitor f10665x0;

    /* renamed from: y0 */
    public lg.c f10666y0;

    /* renamed from: z0 */
    public t f10667z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            EcgFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            if (EcgFragment.this.f10662u0.e() <= 0) {
                EcgFragment.this.k1().emptyView.setVisibility(0);
                EcgFragment.this.k1().recyclerView.setVisibility(8);
                return;
            }
            EcgFragment.this.k1().emptyView.setVisibility(8);
            EcgFragment.this.k1().recyclerView.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements c0.a {
        public b() {
            EcgFragment.this = r1;
        }

        @Override // rh.c0.a
        public final void a(int i10) {
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            ecgFragment.k1().btnStop.setText(EcgFragment.this.p0(R.string.healthy_stop_test, Integer.valueOf(i10)));
        }

        @Override // rh.c0.a
        public final void b(EcgRecord ecgRecord) {
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            ecgFragment.k1().ecgView.setMode(1);
            EcgFragment.this.k1().btnStart.setVisibility(0);
            EcgFragment.this.k1().btnStop.setVisibility(8);
            EcgFragment.this.k1().progressBar.setVisibility(8);
            if (ecgRecord != null) {
                lg.c cVar = EcgFragment.this.f10666y0;
                if (cVar != null) {
                    cVar.r(ecgRecord);
                    new w().h1(EcgFragment.this.h0(), null);
                    return;
                }
                gm.l.l("dataRepository");
                throw null;
            }
            EcgFragment.h1(EcgFragment.this);
        }

        @Override // rh.c0.a
        public final void c(int[] iArr) {
            gm.l.f(iArr, "data");
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            EcgView ecgView = ecgFragment.k1().ecgView;
            ecgView.getClass();
            for (int i10 : iArr) {
                ecgView.f12310b.add(Integer.valueOf(i10));
            }
            if (ecgView.f12309a == 1) {
                ecgView.invalidate();
            }
        }

        @Override // rh.c0.a
        public final void d() {
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            ecgFragment.k1().btnStart.setVisibility(8);
            EcgFragment.this.k1().btnStop.setVisibility(0);
            EcgFragment.this.k1().btnStop.setText((CharSequence) null);
            EcgFragment.this.k1().progressBar.setVisibility(0);
            EcgFragment.this.k1().tvTime.setText((CharSequence) null);
            EcgFragment.this.k1().tvSpeed.setVisibility(8);
            EcgFragment.this.k1().tvAmplitude.setVisibility(8);
        }

        @Override // rh.c0.a
        public final void e(int i10, int i11, Date date) {
            gm.l.f(date, CrashHianalyticsData.TIME);
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            ecgFragment.k1().progressBar.setVisibility(8);
            EcgFragment.this.k1().btnStop.setText(EcgFragment.this.p0(R.string.healthy_stop_test, 60));
            EcgFragment.this.k1().tvTime.setText(EcgFragment.this.f10663v0.format(date));
            EcgFragment.this.k1().ecgView.c();
            EcgFragment.this.k1().ecgView.setMode(2);
            EcgFragment.this.k1().ecgView.setDataType(i10);
            EcgFragment.this.k1().ecgView.setSampleRate(i11);
            if (i10 == 1) {
                EcgFragment.this.k1().tvSpeed.setVisibility(0);
                EcgFragment.this.k1().tvAmplitude.setVisibility(0);
                TextView textView = EcgFragment.this.k1().tvSpeed;
                EcgFragment ecgFragment2 = EcgFragment.this;
                textView.setText(ecgFragment2.p0(R.string.ecg_speed, Integer.valueOf(ecgFragment2.k1().ecgView.getSpeed())));
                TextView textView2 = EcgFragment.this.k1().tvAmplitude;
                EcgFragment ecgFragment3 = EcgFragment.this;
                textView2.setText(ecgFragment3.p0(R.string.ecg_amplitude, Integer.valueOf(ecgFragment3.k1().ecgView.getAmplitude())));
            }
        }

        @Override // rh.c0.a
        public final void f(Throwable th2) {
            gm.l.f(th2, "throwable");
            EcgFragment.h1(EcgFragment.this);
            if (!EcgFragment.this.j1().D().c().g(270) && (th2 instanceof yi.d)) {
                new rh.i().h1(EcgFragment.this.h0(), null);
            } else {
                qi.p.f(EcgFragment.this.f1(), th2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements mh.a<SimpleEcgRecord> {
        public c() {
            EcgFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            SimpleEcgRecord simpleEcgRecord = (SimpleEcgRecord) obj;
            gm.l.f(simpleEcgRecord, "item");
            i2.m f10 = tb.a.f(EcgFragment.this);
            String uuid = simpleEcgRecord.f9595a.toString();
            gm.l.e(uuid, "item.ecgId.toString()");
            b0 a10 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putString("ecgId", uuid);
                f10.l(R.id.toDetail, bundle, a10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            EcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            v.l(tb.a.f(EcgFragment.this), new i2.a(R.id.toHelp));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            EcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            EcgFragment.i1(EcgFragment.this);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(1);
            EcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            EcgFragment.i1(EcgFragment.this);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$onViewCreated$5", f = "EcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10674e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$onViewCreated$5$1", f = "EcgFragment.kt", l = {98}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10676e;

            /* renamed from: f */
            public final /* synthetic */ EcgFragment f10677f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C0153a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ EcgFragment f10678a;

                public C0153a(EcgFragment ecgFragment) {
                    this.f10678a = ecgFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<? extends T> list;
                    List list2 = (List) obj;
                    rh.b bVar = this.f10678a.f10662u0;
                    if (list2 != null) {
                        list = q.S(list2);
                    } else {
                        list = null;
                    }
                    bVar.f24818e = list;
                    this.f10678a.f10662u0.h();
                    EcgFragment.h1(this.f10678a);
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$onViewCreated$5$1$invokeSuspend$$inlined$flatMapLatest$1", f = "EcgFragment.kt", l = {190}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class b extends zl.i implements fm.q<sm.g<? super List<? extends SimpleEcgRecord>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10679e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10680f;

                /* renamed from: g */
                public /* synthetic */ Object f10681g;

                /* renamed from: h */
                public final /* synthetic */ EcgFragment f10682h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(EcgFragment ecgFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10682h = ecgFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super List<? extends SimpleEcgRecord>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    b bVar = new b(this.f10682h, dVar);
                    bVar.f10680f = gVar;
                    bVar.f10681g = jVar;
                    return bVar.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10679e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        sm.g gVar = this.f10680f;
                        sf.j jVar = (sf.j) this.f10681g;
                        lg.c cVar = this.f10682h.f10666y0;
                        if (cVar != null) {
                            tm.j b10 = cVar.b(jVar.f26941b);
                            this.f10679e = 1;
                            if (r.v(this, b10, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            gm.l.l("dataRepository");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EcgFragment ecgFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10677f = ecgFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10677f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10676e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    EcgFragment ecgFragment = this.f10677f;
                    DateMonitor dateMonitor = ecgFragment.f10665x0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new b(ecgFragment, null));
                        C0153a c0153a = new C0153a(this.f10677f);
                        this.f10676e = 1;
                        if (O.a(c0153a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            EcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f10674e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            z0.g((e0) this.f10674e, null, 0, new a(EcgFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$onViewCreated$7", f = "EcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10684e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(xl.d<? super i> dVar) {
            super(2, dVar);
            EcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((i) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            i iVar = new i(dVar);
            iVar.f10684e = obj;
            return iVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            EcgFragment ecgFragment = EcgFragment.this;
            mm.h<Object>[] hVarArr = EcgFragment.D0;
            qi.p.f(ecgFragment.f1(), (Throwable) this.f10684e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment$onViewCreated$9", f = "EcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<u6.a<? extends EcgRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10687e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(2, dVar);
            EcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends EcgRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((k) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f10687e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a aVar = (u6.a) this.f10687e;
            if (aVar instanceof u6.a0) {
                c0 c0Var = EcgFragment.this.A0;
                if (c0Var != null) {
                    if (!c0Var.f25677f) {
                        EcgFragment ecgFragment = EcgFragment.this;
                        EcgRecord ecgRecord = (EcgRecord) aVar.a();
                        ecgFragment.k1().ecgView.c();
                        if (ecgRecord == null) {
                            ecgFragment.k1().tvTime.setText((CharSequence) null);
                            ecgFragment.k1().tvSpeed.setText((CharSequence) null);
                            ecgFragment.k1().tvAmplitude.setText((CharSequence) null);
                        } else {
                            ecgFragment.k1().ecgView.setMode(1);
                            ecgFragment.k1().ecgView.setSampleRate(ecgRecord.getSampleBase());
                            ecgFragment.k1().ecgView.setDataType(ecgRecord.getType());
                            ecgFragment.k1().ecgView.a(ecgRecord.getIntArrays());
                            ecgFragment.k1().tvTime.setText(ecgFragment.f10663v0.format(ecgRecord.getTime()));
                            if (ecgRecord.getType() == 1) {
                                ecgFragment.k1().tvSpeed.setVisibility(0);
                                ecgFragment.k1().tvAmplitude.setVisibility(0);
                                ecgFragment.k1().tvSpeed.setText(ecgFragment.p0(R.string.ecg_speed, Integer.valueOf(ecgFragment.k1().ecgView.getSpeed())));
                                ecgFragment.k1().tvAmplitude.setText(ecgFragment.p0(R.string.ecg_amplitude, Integer.valueOf(ecgFragment.k1().ecgView.getAmplitude())));
                            } else {
                                ecgFragment.k1().tvSpeed.setVisibility(8);
                                ecgFragment.k1().tvAmplitude.setVisibility(8);
                            }
                        }
                    }
                } else {
                    gm.l.l("ecgTestHelper");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(androidx.fragment.app.r rVar) {
            super(0);
            this.f10689b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f10689b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10690b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f10690b = lVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10690b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f10691b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10691b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f10692b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10692b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10693b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10694c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f10693b = rVar;
            this.f10694c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10694c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10693b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        gm.t tVar = new gm.t(EcgFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEcgBinding;", 0);
        gm.b0.f15488a.getClass();
        D0 = new mm.h[]{tVar};
    }

    public EcgFragment() {
        super(R.layout.fragment_ecg);
        this.f10661t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEcgBinding.class, this);
        this.f10662u0 = new rh.b();
        this.f10663v0 = m0.n();
        tl.d a10 = fb.e.a(new m(new l(this)));
        this.f10664w0 = ab.b.f(this, gm.b0.a(EcgViewModel.class), new n(a10), new o(a10), new p(this, a10));
        this.B0 = new a();
        this.C0 = new b();
    }

    public static final void h1(EcgFragment ecgFragment) {
        SimpleEcgRecord simpleEcgRecord;
        List<? extends T> list = ecgFragment.f10662u0.f24818e;
        if (list != 0 && (simpleEcgRecord = (SimpleEcgRecord) q.I(list)) != null) {
            ecgFragment.k1().tvTime.setText(ecgFragment.f10663v0.format(simpleEcgRecord.f9596b));
            ((EcgViewModel) ecgFragment.f10664w0.getValue()).j(simpleEcgRecord.f9595a);
        }
    }

    public static final void i1(EcgFragment ecgFragment) {
        d7.e f12;
        int i10;
        c0 c0Var = ecgFragment.A0;
        if (c0Var != null) {
            if (c0Var.f25677f) {
                c0 c0Var2 = ecgFragment.A0;
                if (c0Var2 != null) {
                    c0Var2.b();
                    return;
                } else {
                    gm.l.l("ecgTestHelper");
                    throw null;
                }
            }
            if (!og.x0.b(ecgFragment.j1())) {
                f12 = ecgFragment.f1();
                i10 = R.string.device_state_disconnected;
            } else if (((d0) ecgFragment.j1().f()).f17884d) {
                f12 = ecgFragment.f1();
                i10 = R.string.sync_data_ongoing;
            } else if (ecgFragment.j1().D().c().g(270)) {
                c0 c0Var3 = ecgFragment.A0;
                if (c0Var3 != null) {
                    c0Var3.a();
                    return;
                } else {
                    gm.l.l("ecgTestHelper");
                    throw null;
                }
            } else {
                new x().h1(ecgFragment.h0(), null);
                return;
            }
            d7.e.f(f12, i10);
            return;
        }
        gm.l.l("ecgTestHelper");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.f10665x0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            lg.c cVar = this.f10666y0;
            if (cVar != null) {
                cVar.n(jVar.f26941b);
                this.A0 = new c0(V0(), j1(), this.C0);
                return;
            }
            gm.l.l("dataRepository");
            throw null;
        }
        gm.l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void D0() {
        this.E = true;
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.f25679h.release();
        } else {
            gm.l.l("ecgTestHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        rh.b bVar = this.f10662u0;
        bVar.f24819f = null;
        bVar.x(this.B0);
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.b();
        } else {
            gm.l.l("ecgTestHelper");
            throw null;
        }
    }

    @Override // rh.i.a
    public final void N() {
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.a();
        } else {
            gm.l.l("ecgTestHelper");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        rh.b bVar = this.f10662u0;
        bVar.f24819f = new c();
        bVar.u(this.B0);
        RecyclerView recyclerView = k1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        k1().recyclerView.g(new oi.a(V0()));
        k1().recyclerView.setAdapter(this.f10662u0);
        p.b.g(k1().imgHelpInfo, new d());
        p.b.g(k1().btnStart, new e());
        p.b.g(k1().btnStop, new f());
        qi.h.k(qi.h.i(this), new g(null));
        n((EcgViewModel) this.f10664w0.getValue(), new gm.t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment.h
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((h0) obj).f25695a;
            }
        }, v6.b.i((EcgViewModel) this.f10664w0.getValue()), new i(null), null);
        e((EcgViewModel) this.f10664w0.getValue(), new gm.t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgFragment.j
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((h0) obj).f25695a;
            }
        }, z.f28636a, new k(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // rh.x.a
    public final void f() {
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.a();
        } else {
            gm.l.l("ecgTestHelper");
            throw null;
        }
    }

    public final t j1() {
        t tVar = this.f10667z0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    public final FragmentEcgBinding k1() {
        return (FragmentEcgBinding) this.f10661t0.a(this, D0[0]);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
