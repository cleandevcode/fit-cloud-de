package h1;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.splashscreen.R;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public final Activity f15742a;

    public b(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
        this.f15742a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f15742a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
            return;
        }
        this.f15742a.setTheme(i10);
    }
}
