package ka;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.l2;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class r extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f18252a;

    /* renamed from: b */
    public final d1 f18253b;

    /* renamed from: c */
    public CharSequence f18254c;

    /* renamed from: d */
    public final CheckableImageButton f18255d;

    /* renamed from: e */
    public ColorStateList f18256e;

    /* renamed from: f */
    public PorterDuff.Mode f18257f;

    /* renamed from: g */
    public View.OnLongClickListener f18258g;

    /* renamed from: h */
    public boolean f18259h;

    public r(TextInputLayout textInputLayout, l2 l2Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f18252a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f18255d = checkableImageButton;
        d1 d1Var = new d1(getContext(), null);
        this.f18253b = d1Var;
        if (da.d.d(getContext())) {
            k1.h.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f18258g;
        checkableImageButton.setOnClickListener(null);
        l.c(checkableImageButton, onLongClickListener);
        this.f18258g = null;
        checkableImageButton.setOnLongClickListener(null);
        l.c(checkableImageButton, null);
        int i10 = R.styleable.TextInputLayout_startIconTint;
        if (l2Var.l(i10)) {
            this.f18256e = da.d.b(getContext(), l2Var, i10);
        }
        int i11 = R.styleable.TextInputLayout_startIconTintMode;
        if (l2Var.l(i11)) {
            this.f18257f = z9.r.d(l2Var.h(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_startIconDrawable;
        if (l2Var.l(i12)) {
            a(l2Var.e(i12));
            int i13 = R.styleable.TextInputLayout_startIconContentDescription;
            if (l2Var.l(i13) && checkableImageButton.getContentDescription() != (k10 = l2Var.k(i13))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(l2Var.a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        d1Var.setVisibility(8);
        d1Var.setId(R.id.textinput_prefix_text);
        d1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.g.f(d1Var, 1);
        o1.p.e(d1Var, l2Var.i(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i14 = R.styleable.TextInputLayout_prefixTextColor;
        if (l2Var.l(i14)) {
            d1Var.setTextColor(l2Var.b(i14));
        }
        CharSequence k11 = l2Var.k(R.styleable.TextInputLayout_prefixText);
        this.f18254c = TextUtils.isEmpty(k11) ? null : k11;
        d1Var.setText(k11);
        d();
        addView(checkableImageButton);
        addView(d1Var);
    }

    public final void a(Drawable drawable) {
        this.f18255d.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this.f18252a, this.f18255d, this.f18256e, this.f18257f);
            b(true);
            l.b(this.f18252a, this.f18255d, this.f18256e);
            return;
        }
        b(false);
        CheckableImageButton checkableImageButton = this.f18255d;
        View.OnLongClickListener onLongClickListener = this.f18258g;
        checkableImageButton.setOnClickListener(null);
        l.c(checkableImageButton, onLongClickListener);
        this.f18258g = null;
        CheckableImageButton checkableImageButton2 = this.f18255d;
        checkableImageButton2.setOnLongClickListener(null);
        l.c(checkableImageButton2, null);
        if (this.f18255d.getContentDescription() != null) {
            this.f18255d.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = 0;
        if (this.f18255d.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            CheckableImageButton checkableImageButton = this.f18255d;
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z10;
        EditText editText = this.f18252a.f6783e;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f18255d.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            i10 = o0.e.f(editText);
        }
        d1 d1Var = this.f18253b;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
        o0.e.k(d1Var, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10 = (this.f18254c == null || this.f18259h) ? 8 : 0;
        setVisibility(this.f18255d.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.f18253b.setVisibility(i10);
        this.f18252a.n();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
