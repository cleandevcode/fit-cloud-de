package ka;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a */
    public TextInputLayout f18216a;

    /* renamed from: b */
    public Context f18217b;

    /* renamed from: c */
    public CheckableImageButton f18218c;

    /* renamed from: d */
    public final int f18219d;

    public k(TextInputLayout textInputLayout, int i10) {
        this.f18216a = textInputLayout;
        this.f18217b = textInputLayout.getContext();
        this.f18218c = textInputLayout.getEndIconView();
        this.f18219d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z10) {
    }
}
