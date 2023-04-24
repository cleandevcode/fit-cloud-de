package kh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import bi.r;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.topstep.fitcloudpro.R;
import f.q;
import gm.l;
import ih.v;
import kh.f;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class f extends q {
    public static final /* synthetic */ int D0 = 0;
    public b B0;
    public final r C0 = new r();

    /* loaded from: classes2.dex */
    public static final class a {
        public static f a(float f10, boolean z10) {
            if (f10 <= 0.0f) {
                f10 = 170.0f;
            }
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putFloat("value", f10);
            bundle.putBoolean("is_metric", z10);
            fVar.Z0(bundle);
            return fVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void c(float f10);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void A0(Context context) {
        b bVar;
        l.f(context, "context");
        super.A0(context);
        androidx.fragment.app.r rVar = this.f2537v;
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
        boolean z10 = U0().getBoolean("is_metric", true);
        Bundle U0 = U0();
        if (z10) {
            f10 = 170.0f;
        } else {
            f10 = 65.0f;
        }
        float f11 = U0.getFloat("value", f10);
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.user_info_height);
        bVar.f(null);
        if (z10) {
            final OneWheelLayout oneWheelLayout = new OneWheelLayout(V0(), null, 6);
            oneWheelLayout.setConfig(new m7.e(30, 242, false, o0(R.string.unit_cm), this.C0));
            int i10 = hh.b.f16094a;
            oneWheelLayout.setValue(v.o(f11));
            bVar.b(17039370, new DialogInterface.OnClickListener() { // from class: kh.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    f fVar = f.this;
                    OneWheelLayout oneWheelLayout2 = oneWheelLayout;
                    int i12 = f.D0;
                    l.f(fVar, "this$0");
                    l.f(oneWheelLayout2, "$layout");
                    f.b bVar2 = fVar.B0;
                    if (bVar2 != null) {
                        int value = oneWheelLayout2.getValue();
                        int i13 = hh.b.f16094a;
                        bVar2.c(value);
                    }
                }
            });
            bVar.c(oneWheelLayout);
            return bVar.a();
        }
        m7.b bVar2 = new m7.b(V0());
        SparseArray<m7.d> sparseArray = new SparseArray<>();
        sparseArray.put(1, new m7.d(0, 11, false));
        sparseArray.put(7, new m7.d(0, 11, false));
        bVar2.d(new m7.e(1, 7, false, o0(R.string.unit_feet), this.C0), new m7.e(0, 11, false, o0(R.string.unit_inch), this.C0), sparseArray);
        int i11 = hh.b.f16094a;
        int o10 = v.o(f11 * 0.3937008f);
        bVar2.f(o10 / 12, o10 % 12);
        bVar.b(17039370, new d(bVar2, this, 0));
        bVar.c(bVar2);
        return bVar.a();
    }
}
