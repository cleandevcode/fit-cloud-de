package mi;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class a extends f.q {
    public static final /* synthetic */ int B0 = 0;

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.tip_prompt);
        bVar.d(R.string.sport_gps_disabled_msg);
        bVar.f(null);
        bVar.h(17039370, new n6.g(this, 3));
        return bVar.a();
    }
}
