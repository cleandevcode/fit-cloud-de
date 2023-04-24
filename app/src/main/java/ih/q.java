package ih;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewTreeObserver;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class q implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ HomePageFragment f16870a;

    public q(HomePageFragment homePageFragment) {
        this.f16870a = homePageFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Context i02 = this.f16870a.i0();
        if (i02 == null) {
            return;
        }
        TypedArray obtainStyledAttributes = i02.getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        if (this.f16870a.r1().toolbar.getHeight() > dimensionPixelSize) {
            this.f16870a.r1().toolbar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f16870a.r1().layoutStepInfo.getLayoutParams().height = this.f16870a.n0().getDimensionPixelSize(R.dimen.ic_home_page_small_bg_height) - this.f16870a.r1().toolbar.getHeight();
            this.f16870a.r1().layoutStepInfo.requestLayout();
        }
    }
}
