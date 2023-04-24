package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final TextView f1441a;

    /* renamed from: b */
    public final y1.f f1442b;

    public n(TextView textView) {
        this.f1441a = textView;
        this.f1442b = new y1.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1442b.f30822a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1441a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        this.f1442b.f30822a.c(z10);
    }

    public final void d(boolean z10) {
        this.f1442b.f30822a.d(z10);
    }
}
