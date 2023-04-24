package com.topstep.fitcloud.pro.ui.data.ecg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentEcgDetailBinding;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.widget.EcgView;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.t;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import rh.h0;
import rh.i0;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class EcgDetailFragment extends i0 implements v6.a {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f10615y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10616t0;

    /* renamed from: u0 */
    public final t0 f10617u0;

    /* renamed from: v0 */
    public final i2.g f10618v0;

    /* renamed from: w0 */
    public final SimpleDateFormat f10619w0;

    /* renamed from: x0 */
    public dk.a<kg.k> f10620x0;

    /* loaded from: classes2.dex */
    public static final class a implements EcgView.c {
        public a() {
            EcgDetailFragment.this = r1;
        }

        @Override // com.topstep.fitcloud.pro.ui.widget.EcgView.c
        public final void a() {
            EcgDetailFragment ecgDetailFragment = EcgDetailFragment.this;
            mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            ecgDetailFragment.h1().layoutDetail.btnEcgPlay.setText(R.string.ecg_stop_playback);
        }

        @Override // com.topstep.fitcloud.pro.ui.widget.EcgView.c
        public final void b() {
            EcgDetailFragment ecgDetailFragment = EcgDetailFragment.this;
            mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            ecgDetailFragment.h1().layoutDetail.btnEcgPlay.setText(R.string.ecg_start_playback);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            EcgDetailFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            EcgDetailFragment ecgDetailFragment = EcgDetailFragment.this;
            mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            EcgView ecgView = ecgDetailFragment.h1().layoutDetail.ecgView;
            int i10 = 3;
            if (ecgView.getMode() == 3) {
                i10 = 1;
            }
            ecgView.setMode(i10);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            EcgDetailFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            qi.h.j(EcgDetailFragment.this).e(new com.topstep.fitcloud.pro.ui.data.ecg.a(EcgDetailFragment.this, null));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            EcgDetailFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            qi.h.j(EcgDetailFragment.this).e(new com.topstep.fitcloud.pro.ui.data.ecg.b(EcgDetailFragment.this, null));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment$onViewCreated$7", f = "EcgDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10626e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            EcgDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f10626e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            EcgDetailFragment ecgDetailFragment = EcgDetailFragment.this;
            mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
            qi.p.f(ecgDetailFragment.f1(), (Throwable) this.f10626e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment$onViewCreated$9", f = "EcgDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements p<u6.a<? extends EcgRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10629e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(2, dVar);
            EcgDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends EcgRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((h) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f10629e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            EcgDetailFragment ecgDetailFragment;
            a0.k(obj);
            u6.a aVar = (u6.a) this.f10629e;
            if (aVar instanceof u6.l) {
                EcgDetailFragment ecgDetailFragment2 = EcgDetailFragment.this;
                mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
                ecgDetailFragment2.h1().layoutDetail.loadingView.c();
                ecgDetailFragment = EcgDetailFragment.this;
            } else if (aVar instanceof u6.g) {
                EcgDetailFragment ecgDetailFragment3 = EcgDetailFragment.this;
                mm.h<Object>[] hVarArr2 = EcgDetailFragment.f10615y0;
                ecgDetailFragment3.h1().layoutDetail.loadingView.a(R.string.tip_load_error);
                ecgDetailFragment = EcgDetailFragment.this;
            } else {
                if (aVar instanceof u6.a0) {
                    EcgDetailFragment ecgDetailFragment4 = EcgDetailFragment.this;
                    mm.h<Object>[] hVarArr3 = EcgDetailFragment.f10615y0;
                    ecgDetailFragment4.h1().layoutDetail.loadingView.setVisibility(8);
                    EcgDetailFragment.this.h1().layoutDetail.layoutContent.setVisibility(0);
                    EcgDetailFragment ecgDetailFragment5 = EcgDetailFragment.this;
                    EcgRecord ecgRecord = (EcgRecord) aVar.a();
                    ecgDetailFragment5.h1().layoutDetail.ecgView.c();
                    if (ecgRecord == null) {
                        ecgDetailFragment5.h1().layoutDetail.tvTime.setText((CharSequence) null);
                        ecgDetailFragment5.h1().layoutDetail.tvSpeed.setText((CharSequence) null);
                        ecgDetailFragment5.h1().layoutDetail.tvAmplitude.setText((CharSequence) null);
                    } else {
                        ecgDetailFragment5.h1().layoutDetail.ecgView.setMode(1);
                        ecgDetailFragment5.h1().layoutDetail.ecgView.setSampleRate(ecgRecord.getSampleBase());
                        ecgDetailFragment5.h1().layoutDetail.ecgView.setDataType(ecgRecord.getType());
                        ecgDetailFragment5.h1().layoutDetail.ecgView.a(ecgRecord.getIntArrays());
                        ecgDetailFragment5.h1().layoutDetail.tvTime.setText(ecgDetailFragment5.f10619w0.format(ecgRecord.getTime()));
                        if (ecgRecord.getType() == 1) {
                            ecgDetailFragment5.h1().layoutDetail.tvSpeed.setVisibility(0);
                            ecgDetailFragment5.h1().layoutDetail.tvAmplitude.setVisibility(0);
                            ecgDetailFragment5.h1().layoutDetail.tvSpeed.setText(ecgDetailFragment5.p0(R.string.ecg_speed, Integer.valueOf(ecgDetailFragment5.h1().layoutDetail.ecgView.getSpeed())));
                            ecgDetailFragment5.h1().layoutDetail.tvAmplitude.setText(ecgDetailFragment5.p0(R.string.ecg_amplitude, Integer.valueOf(ecgDetailFragment5.h1().layoutDetail.ecgView.getAmplitude())));
                        } else {
                            ecgDetailFragment5.h1().layoutDetail.tvSpeed.setVisibility(8);
                            ecgDetailFragment5.h1().layoutDetail.tvAmplitude.setVisibility(8);
                        }
                    }
                }
                return tl.l.f28297a;
            }
            ecgDetailFragment.h1().layoutDetail.layoutContent.setVisibility(4);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f10631b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10631b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f10631b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar) {
            super(0);
            this.f10632b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10632b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f10633b = jVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10633b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f10634b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10634b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.d dVar) {
            super(0);
            this.f10635b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10635b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10636b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10637c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(r rVar, tl.d dVar) {
            super(0);
            this.f10636b = rVar;
            this.f10637c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10637c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10636b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(EcgDetailFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEcgDetailBinding;", 0);
        b0.f15488a.getClass();
        f10615y0 = new mm.h[]{tVar};
    }

    public EcgDetailFragment() {
        super(R.layout.fragment_ecg_detail);
        this.f10616t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEcgDetailBinding.class, this);
        tl.d a10 = fb.e.a(new k(new j(this)));
        this.f10617u0 = ab.b.f(this, b0.a(EcgViewModel.class), new l(a10), new m(a10), new n(this, a10));
        this.f10618v0 = new i2.g(b0.a(rh.c.class), new i(this));
        this.f10619w0 = m0.n();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        h1().layoutDetail.ecgView.setOnPlayBackListener(new a());
        h1().layoutDetail.loadingView.setListener(new jc.f(4, this));
        p.b.g(h1().layoutDetail.btnEcgPlay, new b());
        p.b.g(h1().layoutDetail.imgHealthReport, new c());
        p.b.g(h1().layoutDetail.btnDetailReport, new d());
        n(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((h0) obj).f25695a;
            }
        }, v6.b.i(i1()), new f(null), null);
        e(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment.g
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((h0) obj).f25695a;
            }
        }, z.f28636a, new h(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentEcgDetailBinding h1() {
        return (FragmentEcgDetailBinding) this.f10616t0.a(this, f10615y0[0]);
    }

    public final EcgViewModel i1() {
        return (EcgViewModel) this.f10617u0.getValue();
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
