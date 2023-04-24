package oi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.github.kilnn.refreshloadlayout.RefreshLoadLayout;
import com.topstep.fitcloud.pro.databinding.LayoutHomePageRefreshViewBinding;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class c extends w6.a {

    /* renamed from: e */
    public LayoutHomePageRefreshViewBinding f23564e;

    public c(Context context) {
        super(context);
        this.f23564e = LayoutHomePageRefreshViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
    }

    @Override // w6.c
    public final void a(boolean z10) {
        TextView textView;
        int i10;
        if (z10) {
            textView = this.f23564e.tvStatus;
            i10 = R.string.home_page_refresh_completed;
        } else {
            textView = this.f23564e.tvStatus;
            i10 = R.string.sync_data_failed;
        }
        textView.setText(i10);
    }

    @Override // w6.c
    public final void d() {
    }

    @Override // w6.c
    public final void f(float f10) {
        TextView textView;
        int i10;
        if (f10 <= 1.0f) {
            textView = this.f23564e.tvStatus;
            i10 = R.string.home_page_refresh_pull_down;
        } else {
            textView = this.f23564e.tvStatus;
            i10 = R.string.home_page_refresh_release;
        }
        textView.setText(i10);
        this.f23564e.imgState.setRotation((float) (Math.min(1.0d, Math.max(0.0d, f10 - 0.5d)) * 180.0d));
    }

    @Override // w6.c
    public final void g() {
        this.f23564e.imgState.setBackgroundResource(R.drawable.ic_refresh_progress);
        this.f23564e.imgState.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.refresh_progress));
        this.f23564e.tvStatus.setText(getContext().getString(R.string.home_page_refresh_percent, 0));
    }

    @Override // w6.a, w6.c
    public final void i() {
        super.i();
        ((RefreshLoadLayout) getParent()).setDragLimitDistance((int) ((getResources().getDimensionPixelSize(R.dimen.ic_home_page_big_bg_height) - getResources().getDimensionPixelSize(R.dimen.ic_home_page_small_bg_height)) * 1.2f));
    }

    @Override // w6.c
    public final void k() {
        this.f23564e.imgState.setBackgroundResource(R.drawable.ic_refresh_pull_down);
        this.f23564e.tvStatus.setText(R.string.home_page_refresh_pull_down);
    }

    @Override // w6.a
    public final void l() {
        this.f23564e.imgState.clearAnimation();
        this.f23564e.imgState.setRotation(0.0f);
    }

    public void setProgress(int i10) {
        this.f23564e.tvStatus.setText(getContext().getString(R.string.home_page_refresh_percent, Integer.valueOf(i10)));
    }
}
