package ni;

import androidx.fragment.app.k0;
import androidx.fragment.app.r;
import androidx.lifecycle.v;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends FragmentStateAdapter {

    /* renamed from: l */
    public final List<Integer> f22434l;

    public g(k0 k0Var, v vVar, ArrayList arrayList) {
        super(k0Var, vVar);
        this.f22434l = arrayList;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final r A(int i10) {
        int intValue = this.f22434l.get(i10).intValue();
        return intValue != R.string.sport_detail ? intValue != R.string.sport_pace ? intValue != R.string.sport_track ? new d() : new j() : new com.topstep.fitcloud.pro.ui.sport.detail.a() : new f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f22434l.size();
    }
}
