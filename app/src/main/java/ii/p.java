package ii;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.topstep.fitcloudpro.R;
import ii.p;
import java.text.DecimalFormat;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class p extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void E(float f10);

        float V();
    }

    /* loaded from: classes2.dex */
    public static final class b implements m7.f {
        @Override // m7.f
        public final String a(int i10, int i11) {
            float f10 = i11 * 0.5f;
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
        final a aVar;
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar instanceof a) {
            aVar = (a) rVar;
        } else {
            aVar = null;
        }
        final OneWheelLayout oneWheelLayout = new OneWheelLayout(V0(), null, 6);
        oneWheelLayout.setConfig(new m7.e(1, 50, false, o0(R.string.unit_mi), new b()));
        if (aVar != null) {
            oneWheelLayout.setValue((int) (aVar.V() / 0.5f));
        }
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_page_config_distance);
        bVar.m(oneWheelLayout);
        bVar.h(17039370, new DialogInterface.OnClickListener() { // from class: ii.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                p.a aVar2 = p.a.this;
                OneWheelLayout oneWheelLayout2 = oneWheelLayout;
                int i11 = p.B0;
                gm.l.f(oneWheelLayout2, "$layout");
                if (aVar2 != null) {
                    aVar2.E(oneWheelLayout2.getValue() * 0.5f);
                }
            }
        });
        bVar.f(null);
        return bVar.a();
    }
}