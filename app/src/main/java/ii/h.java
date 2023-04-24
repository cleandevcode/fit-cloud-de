package ii;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloud.pro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class h extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void R();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), R.style.Theme_FitCloudPro_AlertDialog_Warning);
        bVar.k(com.topstep.fitcloudpro.R.string.tip_prompt);
        bVar.d(com.topstep.fitcloudpro.R.string.account_delete_dialog_msg1);
        bVar.f(null);
        bVar.h(17039370, new th.y(this, 2));
        return bVar.a();
    }
}
