package mi;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.topstep.fitcloudpro.R;
import java.text.DecimalFormat;
import kotlin.Metadata;
import mi.d;

@Metadata
/* loaded from: classes2.dex */
public final class d extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void x(float f10);
    }

    /* loaded from: classes2.dex */
    public static final class b implements m7.f {
        @Override // m7.f
        public final String a(int i10, int i11) {
            float f10 = i11 / 2.0f;
            DecimalFormat decimalFormat = bi.m0.f4331b;
            if (decimalFormat == null) {
                gm.l.l("DECIMAL_1_FORMAT");
                throw null;
            }
            String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
            gm.l.e(format, "DECIMAL_1_FORMAT.format(…ue.toString().toDouble())");
            return format;
        }
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        final boolean z10 = U0().getBoolean("is_metric", true);
        float f10 = U0().getFloat("value");
        final OneWheelLayout oneWheelLayout = new OneWheelLayout(V0(), null, 6);
        if (z10) {
            oneWheelLayout.setConfig(new m7.e(1, 50, false, o0(R.string.unit_km), new bi.r()));
        } else {
            oneWheelLayout.setConfig(new m7.e(1, 70, false, o0(R.string.unit_mi), new b()));
            int i10 = hh.b.f16094a;
            f10 = f10 * 0.6213712f * 2;
        }
        oneWheelLayout.setValue((int) f10);
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.sport_goal_distance);
        bVar.f(null);
        bVar.h(17039370, new DialogInterface.OnClickListener() { // from class: mi.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                float value;
                d dVar = d.this;
                boolean z11 = z10;
                OneWheelLayout oneWheelLayout2 = oneWheelLayout;
                int i12 = d.B0;
                gm.l.f(dVar, "this$0");
                gm.l.f(oneWheelLayout2, "$layout");
                Context i02 = dVar.i0();
                d.a aVar = i02 instanceof d.a ? (d.a) i02 : null;
                if (aVar != null) {
                    if (z11) {
                        value = oneWheelLayout2.getValue();
                    } else {
                        int i13 = hh.b.f16094a;
                        value = (oneWheelLayout2.getValue() / 2.0f) / 0.6213712f;
                    }
                    aVar.x(value);
                }
            }
        });
        bVar.m(oneWheelLayout);
        return bVar.a();
    }
}
