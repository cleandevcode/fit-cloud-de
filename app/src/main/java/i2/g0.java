package i2;

import android.view.View;
import androidx.navigation.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g0 extends gm.m implements fm.l<View, m> {

    /* renamed from: b */
    public static final g0 f16281b = new g0();

    public g0() {
        super(1);
    }

    @Override // fm.l
    public final m k(View view) {
        View view2 = view;
        gm.l.f(view2, "it");
        Object tag = view2.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof m)) {
            return null;
        }
        return (m) tag;
    }
}
