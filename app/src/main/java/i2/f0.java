package i2;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class f0 extends gm.m implements fm.l<View, View> {

    /* renamed from: b */
    public static final f0 f16277b = new f0();

    public f0() {
        super(1);
    }

    @Override // fm.l
    public final View k(View view) {
        View view2 = view;
        gm.l.f(view2, "it");
        ViewParent parent = view2.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
