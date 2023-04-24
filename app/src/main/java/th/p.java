package th;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class p extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void u(int i10);

        int v();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        a aVar;
        int i10;
        boolean z10;
        String[] strArr = {o0(R.string.ds_alarm_repeat_00), o0(R.string.ds_alarm_repeat_01), o0(R.string.ds_alarm_repeat_02), o0(R.string.ds_alarm_repeat_03), o0(R.string.ds_alarm_repeat_04), o0(R.string.ds_alarm_repeat_05), o0(R.string.ds_alarm_repeat_06)};
        final gm.z zVar = new gm.z();
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar instanceof a) {
            aVar = (a) rVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            i10 = aVar.v();
        } else {
            i10 = 0;
        }
        zVar.f15508a = i10;
        boolean[] zArr = new boolean[7];
        for (int i11 = 0; i11 < 7; i11++) {
            if ((zVar.f15508a & new int[]{1, 2, 4, 8, 16, 32, 64}[i11]) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i11] = z10;
        }
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_alarm_repeat);
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: th.n
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i12, boolean z11) {
                int i13;
                int i14;
                gm.z zVar2 = gm.z.this;
                int i15 = p.B0;
                gm.l.f(zVar2, "$repeat");
                int i16 = rj.d.f25771a;
                int i17 = zVar2.f15508a;
                int[] iArr = {1, 2, 4, 8, 16, 32, 64};
                if (z11) {
                    int i18 = iArr[i12];
                    i13 = (~i18) & i17;
                    i14 = i18 & i18;
                } else {
                    int i19 = iArr[i12];
                    i13 = (~i19) & i17;
                    i14 = i19 & 0;
                }
                zVar2.f15508a = i14 | i13;
            }
        };
        AlertController.b bVar2 = bVar.f838a;
        bVar2.f819o = strArr;
        bVar2.f828x = onMultiChoiceClickListener;
        bVar2.f824t = zArr;
        bVar2.f825u = true;
        bVar.f(null);
        bVar.h(17039370, new o(this, zVar, 0));
        return bVar.a();
    }
}
