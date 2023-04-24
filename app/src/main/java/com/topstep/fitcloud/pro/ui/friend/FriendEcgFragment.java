package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentFriendEcgBinding;
import com.topstep.fitcloud.pro.model.data.EcgRecord;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.widget.EcgView;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.c1;
import ei.u;
import gm.b0;
import gm.t;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.i0;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendEcgFragment extends c1 implements v6.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f11513x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11514t0;

    /* renamed from: u0 */
    public final t0 f11515u0;

    /* renamed from: v0 */
    public final rh.b f11516v0;

    /* renamed from: w0 */
    public final SimpleDateFormat f11517w0;

    /* loaded from: classes2.dex */
    public static final class a implements mh.a<SimpleEcgRecord> {
        public a() {
            FriendEcgFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            SimpleEcgRecord simpleEcgRecord = (SimpleEcgRecord) obj;
            gm.l.f(simpleEcgRecord, "item");
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            friendEcgFragment.i1().j(simpleEcgRecord);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$13", f = "FriendEcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11520e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11520e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            qi.p.f(friendEcgFragment.f1(), (Throwable) this.f11520e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$14", f = "FriendEcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<List<? extends SimpleEcgRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(List<? extends SimpleEcgRecord> list, xl.d<? super tl.l> dVar) {
            return ((d) p(list, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11522e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            SimpleEcgRecord simpleEcgRecord;
            a0.k(obj);
            List list = (List) this.f11522e;
            if (list != null && (simpleEcgRecord = (SimpleEcgRecord) ul.q.I(list)) != null) {
                FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
                mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
                friendEcgFragment.i1().j(simpleEcgRecord);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$16", f = "FriendEcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<u6.a<? extends List<? extends SimpleEcgRecord>>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11525e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends List<? extends SimpleEcgRecord>> aVar, xl.d<? super tl.l> dVar) {
            return ((f) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11525e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11525e;
            if (aVar instanceof u6.l) {
                FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
                mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
                friendEcgFragment.h1().loadingView.c();
            } else if (aVar instanceof u6.g) {
                FriendEcgFragment friendEcgFragment2 = FriendEcgFragment.this;
                mm.h<Object>[] hVarArr2 = FriendEcgFragment.f11513x0;
                friendEcgFragment2.h1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                List<? extends T> list = (List) aVar.a();
                if (list != 0 && !list.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    FriendEcgFragment friendEcgFragment3 = FriendEcgFragment.this;
                    mm.h<Object>[] hVarArr3 = FriendEcgFragment.f11513x0;
                    friendEcgFragment3.h1().loadingView.b(R.string.tip_current_no_data);
                } else {
                    FriendEcgFragment friendEcgFragment4 = FriendEcgFragment.this;
                    mm.h<Object>[] hVarArr4 = FriendEcgFragment.f11513x0;
                    friendEcgFragment4.h1().loadingView.setVisibility(8);
                }
                rh.b bVar = FriendEcgFragment.this.f11516v0;
                bVar.f24818e = list;
                bVar.h();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements EcgView.c {
        public g() {
            FriendEcgFragment.this = r1;
        }

        @Override // com.topstep.fitcloud.pro.ui.widget.EcgView.c
        public final void a() {
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            friendEcgFragment.h1().layoutDetail.btnEcgPlay.setText(R.string.ecg_stop_playback);
        }

        @Override // com.topstep.fitcloud.pro.ui.widget.EcgView.c
        public final void b() {
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            friendEcgFragment.h1().layoutDetail.btnEcgPlay.setText(R.string.ecg_start_playback);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(1);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            EcgView ecgView = friendEcgFragment.h1().layoutDetail.ecgView;
            int i10 = 3;
            if (ecgView.getMode() == 3) {
                i10 = 1;
            }
            ecgView.setMode(i10);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.l<ImageView, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i() {
            super(1);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ImageView imageView) {
            gm.l.f(imageView, "it");
            qi.h.j(FriendEcgFragment.this).e(new com.topstep.fitcloud.pro.ui.friend.f(FriendEcgFragment.this, null));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(1);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            qi.h.j(FriendEcgFragment.this).e(new com.topstep.fitcloud.pro.ui.friend.g(FriendEcgFragment.this, null));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$7", f = "FriendEcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11532e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(xl.d<? super l> dVar) {
            super(2, dVar);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((l) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            l lVar = new l(dVar);
            lVar.f11532e = obj;
            return lVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendEcgFragment friendEcgFragment = FriendEcgFragment.this;
            mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
            qi.p.f(friendEcgFragment.f1(), (Throwable) this.f11532e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment$onViewCreated$9", f = "FriendEcgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends zl.i implements fm.p<u6.a<? extends EcgRecord>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11535e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(xl.d<? super n> dVar) {
            super(2, dVar);
            FriendEcgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends EcgRecord> aVar, xl.d<? super tl.l> dVar) {
            return ((n) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.f11535e = obj;
            return nVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            FriendEcgFragment friendEcgFragment;
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11535e;
            if (aVar instanceof u6.l) {
                FriendEcgFragment friendEcgFragment2 = FriendEcgFragment.this;
                mm.h<Object>[] hVarArr = FriendEcgFragment.f11513x0;
                friendEcgFragment2.h1().layoutDetail.loadingView.c();
                friendEcgFragment = FriendEcgFragment.this;
            } else if (aVar instanceof u6.g) {
                FriendEcgFragment friendEcgFragment3 = FriendEcgFragment.this;
                mm.h<Object>[] hVarArr2 = FriendEcgFragment.f11513x0;
                friendEcgFragment3.h1().layoutDetail.loadingView.a(R.string.tip_load_error);
                friendEcgFragment = FriendEcgFragment.this;
            } else {
                if (aVar instanceof u6.a0) {
                    FriendEcgFragment friendEcgFragment4 = FriendEcgFragment.this;
                    mm.h<Object>[] hVarArr3 = FriendEcgFragment.f11513x0;
                    friendEcgFragment4.h1().layoutDetail.loadingView.setVisibility(8);
                    FriendEcgFragment.this.h1().layoutDetail.layoutContent.setVisibility(0);
                    FriendEcgFragment friendEcgFragment5 = FriendEcgFragment.this;
                    EcgRecord ecgRecord = (EcgRecord) aVar.a();
                    friendEcgFragment5.h1().layoutDetail.ecgView.c();
                    if (ecgRecord == null) {
                        friendEcgFragment5.h1().layoutDetail.tvTime.setText((CharSequence) null);
                        friendEcgFragment5.h1().layoutDetail.tvSpeed.setText((CharSequence) null);
                        friendEcgFragment5.h1().layoutDetail.tvAmplitude.setText((CharSequence) null);
                    } else {
                        friendEcgFragment5.h1().layoutDetail.ecgView.setMode(1);
                        friendEcgFragment5.h1().layoutDetail.ecgView.setSampleRate(ecgRecord.getSampleBase());
                        friendEcgFragment5.h1().layoutDetail.ecgView.setDataType(ecgRecord.getType());
                        friendEcgFragment5.h1().layoutDetail.ecgView.a(ecgRecord.getIntArrays());
                        friendEcgFragment5.h1().layoutDetail.tvTime.setText(friendEcgFragment5.f11517w0.format(ecgRecord.getTime()));
                        if (ecgRecord.getType() == 1) {
                            friendEcgFragment5.h1().layoutDetail.tvSpeed.setVisibility(0);
                            friendEcgFragment5.h1().layoutDetail.tvAmplitude.setVisibility(0);
                            friendEcgFragment5.h1().layoutDetail.tvSpeed.setText(friendEcgFragment5.p0(R.string.ecg_speed, Integer.valueOf(friendEcgFragment5.h1().layoutDetail.ecgView.getSpeed())));
                            friendEcgFragment5.h1().layoutDetail.tvAmplitude.setText(friendEcgFragment5.p0(R.string.ecg_amplitude, Integer.valueOf(friendEcgFragment5.h1().layoutDetail.ecgView.getAmplitude())));
                        } else {
                            friendEcgFragment5.h1().layoutDetail.tvSpeed.setVisibility(8);
                            friendEcgFragment5.h1().layoutDetail.tvAmplitude.setVisibility(8);
                        }
                    }
                }
                return tl.l.f28297a;
            }
            friendEcgFragment.h1().layoutDetail.layoutContent.setVisibility(4);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(androidx.fragment.app.r rVar) {
            super(0);
            this.f11537b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f11537b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11538b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f11538b = oVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11538b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(tl.d dVar) {
            super(0);
            this.f11539b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11539b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(tl.d dVar) {
            super(0);
            this.f11540b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11540b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f11541b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11542c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f11541b = rVar;
            this.f11542c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11542c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11541b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendEcgFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendEcgBinding;", 0);
        b0.f15488a.getClass();
        f11513x0 = new mm.h[]{tVar};
    }

    public FriendEcgFragment() {
        super(R.layout.fragment_friend_ecg);
        this.f11514t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendEcgBinding.class, this);
        tl.d a10 = fb.e.a(new p(new o(this)));
        this.f11515u0 = ab.b.f(this, b0.a(FriendEcgViewModel.class), new q(a10), new r(a10), new s(this, a10));
        this.f11516v0 = new rh.b();
        this.f11517w0 = m0.n();
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        this.f11516v0.f24819f = null;
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        h1().layoutDetail.ecgView.setOnPlayBackListener(new g());
        h1().layoutDetail.loadingView.setListener(new i0(13, this));
        p.b.g(h1().layoutDetail.btnEcgPlay, new h());
        p.b.g(h1().layoutDetail.imgHealthReport, new i());
        p.b.g(h1().layoutDetail.btnDetailReport, new j());
        n(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment.k
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((u) obj).f13790b;
            }
        }, v6.b.i(i1()), new l(null), null);
        e(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment.m
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((u) obj).f13790b;
            }
        }, z.f28636a, new n(null));
        this.f11516v0.f24819f = new a();
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        h1().recyclerView.g(new oi.a(V0()));
        h1().recyclerView.setAdapter(this.f11516v0);
        h1().loadingView.setListener(new jc.f(10, this));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((u) obj).f13789a;
            }
        }, v6.b.i(i1()), new c(null), new d(null));
        e(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((u) obj).f13789a;
            }
        }, z.f28636a, new f(null));
    }

    @Override // v6.a
    public final androidx.lifecycle.u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentFriendEcgBinding h1() {
        return (FragmentFriendEcgBinding) this.f11514t0.a(this, f11513x0[0]);
    }

    public final FriendEcgViewModel i1() {
        return (FriendEcgViewModel) this.f11515u0.getValue();
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
