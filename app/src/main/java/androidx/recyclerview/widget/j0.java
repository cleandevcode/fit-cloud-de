package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class j0 {
    public static int a(RecyclerView.y yVar, d0 d0Var, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.y() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z10) {
            return Math.min(d0Var.l(), d0Var.b(view2) - d0Var.e(view));
        }
        return Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1;
    }

    public static int b(RecyclerView.y yVar, d0 d0Var, View view, View view2, RecyclerView.m mVar, boolean z10, boolean z11) {
        if (mVar.y() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (yVar.b() - Math.max(RecyclerView.m.H(view), RecyclerView.m.H(view2))) - 1) : Math.max(0, Math.min(RecyclerView.m.H(view), RecyclerView.m.H(view2)));
        if (z10) {
            return Math.round((max * (Math.abs(d0Var.b(view2) - d0Var.e(view)) / (Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1))) + (d0Var.k() - d0Var.e(view)));
        }
        return max;
    }

    public static int c(RecyclerView.y yVar, d0 d0Var, View view, View view2, RecyclerView.m mVar, boolean z10) {
        if (mVar.y() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z10) {
            return (int) (((d0Var.b(view2) - d0Var.e(view)) / (Math.abs(RecyclerView.m.H(view) - RecyclerView.m.H(view2)) + 1)) * yVar.b());
        }
        return yVar.b();
    }
}
