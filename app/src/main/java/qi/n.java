package qi;

import android.content.Context;
import androidx.fragment.app.j0;
import com.topstep.fitcloud.pro.R;
import gm.b0;

/* loaded from: classes2.dex */
public final class n extends gm.m implements fm.a<d7.e> {

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.r f24866b;

    /* renamed from: c */
    public final /* synthetic */ String f24867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.fragment.app.r rVar, String str) {
        super(0);
        this.f24866b = rVar;
        this.f24867c = str;
    }

    @Override // fm.a
    public final d7.e m() {
        String str;
        Context V0 = this.f24866b.V0();
        j0 h02 = this.f24866b.h0();
        gm.l.e(h02, "childFragmentManager");
        String str2 = this.f24867c;
        if (str2 == null || str2.length() == 0) {
            str = b0.a(this.f24866b.getClass()).a() + "toast";
        } else {
            str = this.f24867c;
        }
        return new d7.e(V0, h02, str, R.style.Theme_FitCloudPro_Dialog_Toast);
    }
}
