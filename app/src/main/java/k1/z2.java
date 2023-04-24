package k1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class z2 extends ie.b {

    /* renamed from: d */
    public final WindowInsetsController f18184d;

    /* renamed from: e */
    public Window f18185e;

    public z2(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new o0.h();
        this.f18184d = insetsController;
        this.f18185e = window;
    }

    @Override // ie.b
    public final void b() {
        this.f18184d.hide(7);
    }

    @Override // ie.b
    public final void f(boolean z10) {
        if (z10) {
            Window window = this.f18185e;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f18184d.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.f18185e;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f18184d.setSystemBarsAppearance(0, 16);
    }

    @Override // ie.b
    public final void g(boolean z10) {
        if (z10) {
            Window window = this.f18185e;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | DfuBaseService.ERROR_REMOTE_MASK);
            }
            this.f18184d.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.f18185e;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f18184d.setSystemBarsAppearance(0, 8);
    }

    @Override // ie.b
    public final void h() {
        this.f18184d.setSystemBarsBehavior(2);
    }
}
