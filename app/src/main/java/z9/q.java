package z9;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f32163a;

    public q(EditText editText) {
        this.f32163a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.f32163a.getContext().getSystemService("input_method")).showSoftInput(this.f32163a, 1);
    }
}
