package ei;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class j0 extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void J();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.friends_delete);
        bVar.d(R.string.friends_delete_tips);
        bVar.f(null);
        bVar.h(17039370, new rh.h(this, 3));
        return bVar.a();
    }
}
