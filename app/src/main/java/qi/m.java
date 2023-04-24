package qi;

import android.content.Context;
import androidx.fragment.app.j0;
import com.topstep.fitcloud.pro.R;
import gm.b0;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.a<d7.e> {

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.r f24864b;

    /* renamed from: c */
    public final /* synthetic */ String f24865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.fragment.app.r rVar, String str) {
        super(0);
        this.f24864b = rVar;
        this.f24865c = str;
    }

    @Override // fm.a
    public final d7.e m() {
        String str;
        Context V0 = this.f24864b.V0();
        j0 h02 = this.f24864b.h0();
        gm.l.e(h02, "childFragmentManager");
        String str2 = this.f24865c;
        if (str2 == null || str2.length() == 0) {
            str = b0.a(this.f24864b.getClass()).a() + "progress";
        } else {
            str = this.f24865c;
        }
        return new d7.e(V0, h02, str, R.style.Theme_FitCloudPro_Dialog_Progress);
    }
}
