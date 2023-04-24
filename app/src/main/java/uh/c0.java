package uh;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class c0 extends f.q {
    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.device_scan_tips_error);
        bVar.d(R.string.device_scan_tips_restart);
        bVar.h(R.string.tip_i_know, null);
        return bVar.a();
    }
}
