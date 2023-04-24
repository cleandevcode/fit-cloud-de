package mi;

import android.app.Dialog;
import android.os.Bundle;
import android.util.SparseArray;
import com.topstep.fitcloudpro.R;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class e extends f.q {
    public static final /* synthetic */ int B0 = 0;

    /* loaded from: classes2.dex */
    public interface a {
        void v(int i10);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        int i10 = U0().getInt("value") / 60;
        m7.b bVar = new m7.b(V0());
        SparseArray<m7.d> sparseArray = new SparseArray<>();
        sparseArray.put(0, new m7.d(10, 59, false));
        sparseArray.put(6, new m7.d(0, 0, false));
        bi.r rVar = new bi.r();
        bVar.d(new m7.e(0, 6, true, null, rVar), new m7.e(0, 59, true, null, rVar), sparseArray);
        bVar.f(i10 / 60, i10 % 60);
        v9.b bVar2 = new v9.b(V0(), 0);
        bVar2.k(R.string.sport_goal_time);
        bVar2.f(null);
        bVar2.h(17039370, new kh.b(this, bVar, 1));
        bVar2.m(bVar);
        return bVar2.a();
    }
}
