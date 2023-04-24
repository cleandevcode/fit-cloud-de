package bi;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class p extends f.q {
    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        AlertController.b bVar2 = bVar.f838a;
        bVar2.f823s = null;
        bVar2.f822r = R.layout.dialog_health_alarm_tips;
        bVar.h(R.string.tip_i_know, null);
        return bVar.a();
    }
}
