package l1;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final d f18668a;

    public e(d dVar) {
        this.f18668a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f18668a.equals(((e) obj).f18668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18668a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        AutoCompleteTextView autoCompleteTextView;
        boolean z11;
        b.g gVar = (b.g) this.f18668a;
        TextInputLayout textInputLayout = com.google.android.material.textfield.b.this.f18216a;
        if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null) {
            int i10 = 1;
            if (autoCompleteTextView.getKeyListener() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                CheckableImageButton checkableImageButton = com.google.android.material.textfield.b.this.f18218c;
                if (z10) {
                    i10 = 2;
                }
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.s(checkableImageButton, i10);
            }
        }
    }
}
