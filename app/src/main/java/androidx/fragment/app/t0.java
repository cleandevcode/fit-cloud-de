package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    public static final v0 f2593a = new v0();

    /* renamed from: b */
    public static final z0 f2594b;

    static {
        z0 z0Var;
        try {
            z0Var = (z0) androidx.transition.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            z0Var = null;
        }
        f2594b = z0Var;
    }

    public static void a(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
