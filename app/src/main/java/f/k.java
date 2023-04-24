package f;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.x2;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.e0;
import k1.i2;
import k1.n2;
import k1.o0;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class k implements e0 {

    /* renamed from: a */
    public final /* synthetic */ j f13954a;

    public k(j jVar) {
        this.f13954a = jVar;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        boolean z10;
        View view2;
        n2 n2Var2;
        boolean z11;
        n2 j10;
        int c10;
        int d10;
        Context context;
        int i10;
        int e10 = n2Var.e();
        j jVar = this.f13954a;
        jVar.getClass();
        int e11 = n2Var.e();
        ActionBarContextView actionBarContextView = jVar.f13909p;
        int i11 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jVar.f13909p.getLayoutParams();
            boolean z12 = true;
            if (jVar.f13909p.isShown()) {
                if (jVar.f13901j0 == null) {
                    jVar.f13901j0 = new Rect();
                    jVar.f13903k0 = new Rect();
                }
                Rect rect = jVar.f13901j0;
                Rect rect2 = jVar.f13903k0;
                rect.set(n2Var.c(), n2Var.e(), n2Var.d(), n2Var.b());
                ViewGroup viewGroup = jVar.f13915v;
                Method method = x2.f1598a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e12) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e12);
                    }
                }
                int i12 = rect.top;
                int i13 = rect.left;
                int i14 = rect.right;
                ViewGroup viewGroup2 = jVar.f13915v;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (Build.VERSION.SDK_INT >= 23) {
                    j10 = o0.j.a(viewGroup2);
                } else {
                    j10 = o0.i.j(viewGroup2);
                }
                if (j10 == null) {
                    c10 = 0;
                } else {
                    c10 = j10.c();
                }
                if (j10 == null) {
                    d10 = 0;
                } else {
                    d10 = j10.d();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                if (i12 > 0 && jVar.f13917x == null) {
                    View view3 = new View(jVar.f13890e);
                    jVar.f13917x = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c10;
                    layoutParams.rightMargin = d10;
                    jVar.f13915v.addView(jVar.f13917x, -1, layoutParams);
                } else {
                    View view4 = jVar.f13917x;
                    if (view4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != c10 || marginLayoutParams2.rightMargin != d10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = c10;
                            marginLayoutParams2.rightMargin = d10;
                            jVar.f13917x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view5 = jVar.f13917x;
                if (view5 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = jVar.f13917x;
                    if ((o0.d.g(view6) & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
                        z12 = false;
                    }
                    if (z12) {
                        context = jVar.f13890e;
                        i10 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = jVar.f13890e;
                        i10 = R.color.abc_decor_view_status_guard;
                    }
                    view6.setBackgroundColor(y0.a.b(context, i10));
                }
                if (!jVar.C && z10) {
                    e11 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z12 = false;
                }
                z11 = z12;
                z10 = false;
            }
            if (z11) {
                jVar.f13909p.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view7 = jVar.f13917x;
        if (view7 != null) {
            if (z10) {
                i11 = 0;
            }
            view7.setVisibility(i11);
        }
        if (e10 != e11) {
            n2Var2 = n2Var.g(n2Var.c(), e11, n2Var.d(), n2Var.b());
            view2 = view;
        } else {
            view2 = view;
            n2Var2 = n2Var;
        }
        return o0.k(view2, n2Var2);
    }
}
