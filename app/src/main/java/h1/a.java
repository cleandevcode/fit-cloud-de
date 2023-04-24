package h1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.window.SplashScreenView;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: b */
    public final ViewGroup$OnHierarchyChangeListenerC0281a f15739b;

    /* renamed from: h1.a$a */
    /* loaded from: classes.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC0281a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public final /* synthetic */ Activity f15741b;

        public ViewGroup$OnHierarchyChangeListenerC0281a(Activity activity) {
            a.this = r1;
            this.f15741b = activity;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view2 instanceof SplashScreenView) {
                a.this.getClass();
                a.c((SplashScreenView) view2);
                ((ViewGroup) this.f15741b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity);
        l.f(activity, InnerShareParams.ACTIVITY);
        this.f15739b = new ViewGroup$OnHierarchyChangeListenerC0281a(activity);
    }

    public static void c(SplashScreenView splashScreenView) {
        l.f(splashScreenView, "child");
        WindowInsets build = new WindowInsets$Builder().build();
        l.e(build, "Builder().build()");
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (build == splashScreenView.getRootView().computeSystemWindowInsets(build, rect)) {
            rect.isEmpty();
        }
    }

    @Override // h1.b
    public final void a() {
        Resources.Theme theme = this.f15742a.getTheme();
        l.e(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) this.f15742a.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f15739b);
    }
}
