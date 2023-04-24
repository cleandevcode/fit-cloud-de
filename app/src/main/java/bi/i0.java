package bi;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class i0 extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void O(int i10);

        int b0();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        a aVar;
        int i10;
        String[] strArr = {o0(R.string.ds_flow_system), o0(R.string.ds_hour_style_12), o0(R.string.ds_hour_style_24)};
        androidx.fragment.app.r rVar = this.f2537v;
        if (rVar instanceof a) {
            aVar = (a) rVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            i10 = aVar.b0();
        } else {
            i10 = 0;
        }
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.ds_hour_style);
        bVar.j(strArr, i10, new rh.h(this, 1));
        return bVar.a();
    }
}
