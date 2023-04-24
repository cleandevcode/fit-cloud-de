package ii;

import android.app.Dialog;
import android.os.Bundle;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import kotlin.Metadata;
import pm.z1;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class x0 extends f.q implements v6.a {
    public static final /* synthetic */ int C0 = 0;
    public final androidx.lifecycle.t0 B0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f16996b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f16996b = eVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f16996b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f16997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.d dVar) {
            super(0);
            this.f16997b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f16997b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f16998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f16998b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f16998b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f16999b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f17000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f16999b = rVar;
            this.f17000c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f17000c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f16999b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<androidx.lifecycle.y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            x0.this = r1;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return x0.this.W0();
        }
    }

    public x0() {
        tl.d a10 = fb.e.a(new a(new e()));
        this.B0 = ab.b.f(this, gm.b0.a(SettingsViewModel.class), new b(a10), new c(a10), new d(this, a10));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // v6.a
    public final androidx.lifecycle.u a() {
        return a.C0526a.a(this);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        bVar.d(R.string.account_sign_out_prompt);
        bVar.f(null);
        bVar.h(17039370, new bi.a1(this, 1));
        return bVar.a();
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, gm.t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
