package kh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import f.q;
import gm.l;
import ih.v;
import kh.h;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class h extends q {
    public static final /* synthetic */ int C0 = 0;
    public b B0;

    /* loaded from: classes2.dex */
    public static final class a {
        public static h a(float f10, boolean z10) {
            if (f10 <= 0.0f) {
                f10 = 70.0f;
            }
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putFloat("value", f10);
            bundle.putBoolean("is_metric", z10);
            hVar.Z0(bundle);
            return hVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void x(float f10);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        b bVar;
        l.f(context, "context");
        super.A0(context);
        r rVar = this.f2537v;
        if (rVar instanceof b) {
            bVar = (b) rVar;
        } else {
            bVar = null;
        }
        this.B0 = bVar;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void F0() {
        super.F0();
        this.B0 = null;
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        float f10;
        float f11;
        float f12;
        int i10;
        float t10;
        final boolean z10 = U0().getBoolean("is_metric", true);
        Bundle U0 = U0();
        if (z10) {
            f10 = 70.0f;
        } else {
            f10 = 150.0f;
        }
        float f13 = U0.getFloat("value", f10);
        v9.b bVar = new v9.b(V0(), 0);
        final m7.b bVar2 = new m7.b(V0());
        if (z10) {
            f11 = 20.0f;
            f12 = 350.0f;
            i10 = R.string.unit_kg;
        } else {
            f11 = 45.0f;
            f12 = 750.0f;
            i10 = R.string.unit_lbs;
        }
        String o02 = o0(i10);
        bi.r rVar = new bi.r();
        v vVar = new v();
        float o10 = tb.a.o(f11);
        float o11 = tb.a.o(f12);
        int i11 = (int) o10;
        int i12 = (int) o11;
        m7.e eVar = new m7.e(i11, i12, false, null, rVar);
        m7.e eVar2 = new m7.e(0, 9, false, o02, vVar);
        SparseArray<m7.d> sparseArray = new SparseArray<>();
        float f14 = 10;
        int i13 = ((int) (o10 * f14)) % 10;
        if (i13 > 0) {
            sparseArray.put(i11, new m7.d(i13, 9, false));
        }
        int i14 = ((int) (o11 * f14)) % 10;
        if (i14 < 9) {
            sparseArray.put(i12, new m7.d(0, i14, false));
        }
        bVar2.d(eVar, eVar2, sparseArray);
        if (z10) {
            int i15 = hh.b.f16094a;
            t10 = rm.l.t(f13);
        } else {
            int i16 = hh.b.f16094a;
            t10 = rm.l.t(f13 * 2.2046225f);
        }
        tb.a.p(bVar2, t10);
        bVar.k(R.string.user_info_weight);
        bVar.m(bVar2);
        bVar.f(null);
        bVar.h(17039370, new DialogInterface.OnClickListener() { // from class: kh.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i17) {
                h.b bVar3;
                float f15;
                boolean z11 = z10;
                h hVar = this;
                m7.b bVar4 = bVar2;
                int i18 = h.C0;
                l.f(hVar, "this$0");
                l.f(bVar4, "$layout");
                if (z11) {
                    bVar3 = hVar.B0;
                    if (bVar3 != null) {
                        int[] value = bVar4.getValue();
                        f15 = (value[1] / 10.0f) + value[0];
                        int i19 = hh.b.f16094a;
                    } else {
                        return;
                    }
                } else {
                    bVar3 = hVar.B0;
                    if (bVar3 != null) {
                        int[] value2 = bVar4.getValue();
                        float f16 = (value2[1] / 10.0f) + value2[0];
                        int i20 = hh.b.f16094a;
                        f15 = f16 / 2.2046225f;
                    } else {
                        return;
                    }
                }
                bVar3.x(f15);
            }
        });
        return bVar.a();
    }
}
