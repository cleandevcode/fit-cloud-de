package mi;

import android.app.Dialog;
import android.os.Bundle;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class d0 extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void f();
    }

    static {
        new a();
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        boolean z10;
        int i10;
        Bundle bundle2 = this.f2516f;
        if (bundle2 != null) {
            z10 = bundle2.getBoolean("distance_error");
        } else {
            z10 = true;
        }
        v9.b bVar = new v9.b(V0(), 0);
        bVar.k(R.string.sport_stop_warning_title);
        if (z10) {
            i10 = R.string.sport_stop_warning_message_distance;
        } else {
            i10 = R.string.sport_stop_warning_message_time;
        }
        bVar.d(i10);
        bVar.f838a.f817m = false;
        bVar.f(null);
        bVar.h(17039370, new n6.g(this, 4));
        return bVar.a();
    }
}
