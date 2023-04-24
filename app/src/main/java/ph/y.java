package ph;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public abstract class y extends lh.i {

    /* renamed from: o0 */
    public static final /* synthetic */ int f24249o0 = 0;

    public y(int i10) {
        super(i10);
    }

    @Override // lh.c, androidx.fragment.app.r
    public void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(new y.i0(this, toolbar, 3));
        }
    }

    public Integer g1() {
        return null;
    }
}
