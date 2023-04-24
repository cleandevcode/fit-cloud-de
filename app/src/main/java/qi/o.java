package qi;

import androidx.fragment.app.k0;
import androidx.fragment.app.x;
import com.topstep.fitcloud.pro.R;
import gm.b0;

/* loaded from: classes2.dex */
public final class o extends gm.m implements fm.a<d7.e> {

    /* renamed from: b */
    public final /* synthetic */ x f24868b;

    /* renamed from: c */
    public final /* synthetic */ String f24869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, String str) {
        super(0);
        this.f24868b = xVar;
        this.f24869c = str;
    }

    @Override // fm.a
    public final d7.e m() {
        String str;
        x xVar = this.f24868b;
        k0 J = xVar.J();
        gm.l.e(J, "supportFragmentManager");
        String str2 = this.f24869c;
        if (str2 == null || str2.length() == 0) {
            str = b0.a(this.f24868b.getClass()).a() + "toast";
        } else {
            str = this.f24869c;
        }
        return new d7.e(xVar, J, str, R.style.Theme_FitCloudPro_Dialog_Toast);
    }
}
