package bi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.v0;
import com.topstep.fitcloud.pro.ui.DeviceViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import kotlin.Metadata;
import nj.e;

@Metadata
/* loaded from: classes2.dex */
public final class g1 extends f.q {
    public static final /* synthetic */ int C0 = 0;
    public final androidx.lifecycle.t0 B0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f4304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f4304b = eVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f4304b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.d dVar) {
            super(0);
            this.f4305b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f4305b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f4306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.d dVar) {
            super(0);
            this.f4306b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f4306b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f4307b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f4308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f4307b = rVar;
            this.f4308c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f4308c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f4307b.r();
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
            g1.this = r1;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return g1.this.W0();
        }
    }

    public g1() {
        tl.d a10 = fb.e.a(new a(new e()));
        this.B0 = ab.b.f(this, gm.b0.a(DeviceViewModel.class), new b(a10), new c(a10), new d(this, a10));
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        final og.f D = ((DeviceViewModel) this.B0.getValue()).f10182h.D();
        final nj.e d10 = D.d();
        String o02 = o0(R.string.ds_wear_way_left);
        gm.l.e(o02, "getString(R.string.ds_wear_way_left)");
        String o03 = o0(R.string.ds_wear_way_right);
        gm.l.e(o03, "getString(R.string.ds_wear_way_right)");
        CharSequence[] charSequenceArr = {o02, o03};
        boolean d11 = d10.d(0);
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_wear_way);
        bVar.j(charSequenceArr, d11 ? 1 : 0, new DialogInterface.OnClickListener() { // from class: bi.f1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                boolean z10;
                og.f fVar = og.f.this;
                nj.e eVar = d10;
                g1 g1Var = this;
                int i11 = g1.C0;
                gm.l.f(fVar, "$configFeature");
                gm.l.f(eVar, "$functionConfig");
                gm.l.f(g1Var, "this$0");
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e.a u10 = ih.v.u(eVar);
                u10.a(0, z10);
                fVar.f(u10.b());
                g1Var.c1(false, false);
            }
        });
        return bVar.a();
    }
}
