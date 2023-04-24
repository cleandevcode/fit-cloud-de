package k1;

import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class v2 extends ie.b {

    /* renamed from: d */
    public final Window f18182d;

    /* renamed from: e */
    public final View f18183e;

    public v2(Window window, View view) {
        this.f18182d = window;
        this.f18183e = view;
    }

    @Override // ie.b
    public final void b() {
        int i10;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((7 & i11) != 0) {
                if (i11 != 1) {
                    i10 = 2;
                    if (i11 != 2) {
                        if (i11 == 8) {
                            ((InputMethodManager) this.f18182d.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f18182d.getDecorView().getWindowToken(), 0);
                        }
                    }
                } else {
                    i10 = 4;
                }
                i(i10);
            }
        }
    }

    @Override // ie.b
    public final void h() {
        j(2048);
        i(4096);
    }

    public final void i(int i10) {
        View decorView = this.f18182d.getDecorView();
        decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
    }

    public final void j(int i10) {
        View decorView = this.f18182d.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
