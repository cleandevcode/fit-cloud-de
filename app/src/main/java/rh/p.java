package rh;

import android.app.Dialog;
import android.os.Bundle;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloud.pro.databinding.DialogEcgHealthReportBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import kotlin.Metadata;
import sm.g1;

@Metadata
/* loaded from: classes2.dex */
public final class p extends n0 {
    public DialogEcgHealthReportBinding G0;
    public final t0 H0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportDialogFragment$onCreateDialog$1", f = "EcgHealthReportDialogFragment.kt", l = {26}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f25721e;

        /* renamed from: rh.p$a$a */
        /* loaded from: classes2.dex */
        public static final class C0463a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ p f25723a;

            public C0463a(p pVar) {
                this.f25723a = pVar;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                int intValue = ((Number) obj).intValue();
                DialogEcgHealthReportBinding dialogEcgHealthReportBinding = this.f25723a.G0;
                gm.l.c(dialogEcgHealthReportBinding);
                dialogEcgHealthReportBinding.progressBar.setIndeterminate(false);
                DialogEcgHealthReportBinding dialogEcgHealthReportBinding2 = this.f25723a.G0;
                gm.l.c(dialogEcgHealthReportBinding2);
                dialogEcgHealthReportBinding2.progressBar.setProgress(intValue);
                DialogEcgHealthReportBinding dialogEcgHealthReportBinding3 = this.f25723a.G0;
                gm.l.c(dialogEcgHealthReportBinding3);
                dialogEcgHealthReportBinding3.tvPercentage.setText(this.f25723a.V0().getString(R.string.percent_param, new Integer(intValue)));
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            p.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f25721e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                g1 g1Var = ((EcgHealthReportViewModel) p.this.H0.getValue()).f10726n;
                C0463a c0463a = new C0463a(p.this);
                this.f25721e = 1;
                if (g1Var.a(c0463a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f25724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f25724b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f25724b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f25725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f25725b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f25725b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f25726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f25726b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f25726b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f25727b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f25728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f25727b = rVar;
            this.f25728c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f25728c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f25727b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f() {
            super(0);
            p.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return p.this.T0();
        }
    }

    public p() {
        tl.d a10 = fb.e.a(new b(new f()));
        this.H0 = ab.b.f(this, gm.b0.a(EcgHealthReportViewModel.class), new c(a10), new d(a10), new e(this, a10));
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.G0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        f1(false);
        DialogEcgHealthReportBinding inflate = DialogEcgHealthReportBinding.inflate(k0());
        this.G0 = inflate;
        gm.l.c(inflate);
        inflate.tvState.setText(R.string.ecg_report_creating);
        DialogEcgHealthReportBinding dialogEcgHealthReportBinding = this.G0;
        gm.l.c(dialogEcgHealthReportBinding);
        dialogEcgHealthReportBinding.progressBar.setIndeterminate(true);
        androidx.lifecycle.v vVar = this.Z;
        gm.l.e(vVar, "lifecycle");
        qi.h.k(vVar, new a(null));
        v9.b bVar = new v9.b(V0(), 0);
        DialogEcgHealthReportBinding dialogEcgHealthReportBinding2 = this.G0;
        gm.l.c(dialogEcgHealthReportBinding2);
        bVar.m(dialogEcgHealthReportBinding2.getRoot());
        return bVar.a();
    }
}
