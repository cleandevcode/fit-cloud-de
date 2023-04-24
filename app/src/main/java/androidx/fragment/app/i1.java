package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 {
    public static final void a(int i10, View view) {
        int i11;
        if (i10 == 0) {
            throw null;
        }
        int i12 = i10 - 1;
        if (i12 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (j0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (j0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            i11 = 0;
        } else if (i12 == 2) {
            if (j0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i11 = 8;
        } else if (i12 != 3) {
            return;
        } else {
            if (j0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 4) {
                return 4;
            }
            if (i10 == 8) {
                return 3;
            }
            throw new IllegalArgumentException(androidx.appcompat.widget.u0.a("Unknown visibility ", i10));
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static String d(Object[] objArr, int i10, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i10));
        gm.l.e(format, str2);
        return format;
    }

    public static /* synthetic */ String e(int i10) {
        return i10 == 1 ? "REMOVED" : i10 == 2 ? "VISIBLE" : i10 == 3 ? "GONE" : i10 == 4 ? "INVISIBLE" : "null";
    }
}
