package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.l0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import f.r;
import ka.p;
import q9.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends r {
    @Override // f.r
    public final d a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    @Override // f.r
    public final f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // f.r
    public final g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // f.r
    public final l0 d(Context context, AttributeSet attributeSet) {
        return new ca.a(context, attributeSet);
    }

    @Override // f.r
    public final d1 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
