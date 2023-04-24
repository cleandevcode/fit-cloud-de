package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.k1;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import ga.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import ka.k;
import ka.l;
import ka.m;
import ka.n;
import ka.r;
import o1.p;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int U0 = R.style.Widget_Design_TextInputLayout;
    public CharSequence A;
    public ColorStateList A0;
    public final d1 B;
    public PorterDuff.Mode B0;
    public boolean C;
    public ColorStateList C0;
    public CharSequence D;
    public ColorStateList D0;
    public boolean E;
    public int E0;
    public ga.f F;
    public int F0;
    public int G0;
    public ga.f H;
    public ColorStateList H0;
    public int I0;
    public int J0;
    public int K0;
    public ga.f L;
    public int L0;
    public i M;
    public int M0;
    public boolean N0;
    public final z9.d O0;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public ValueAnimator R0;
    public boolean S0;
    public boolean T0;
    public final int U;
    public int V;
    public int W;

    /* renamed from: a */
    public final FrameLayout f6777a;

    /* renamed from: b */
    public final r f6778b;

    /* renamed from: c */
    public final LinearLayout f6779c;

    /* renamed from: c0 */
    public int f6780c0;

    /* renamed from: d */
    public final FrameLayout f6781d;

    /* renamed from: d0 */
    public int f6782d0;

    /* renamed from: e */
    public EditText f6783e;

    /* renamed from: e0 */
    public int f6784e0;

    /* renamed from: f */
    public CharSequence f6785f;

    /* renamed from: f0 */
    public int f6786f0;

    /* renamed from: g */
    public int f6787g;

    /* renamed from: g0 */
    public int f6788g0;

    /* renamed from: h */
    public int f6789h;

    /* renamed from: h0 */
    public final Rect f6790h0;

    /* renamed from: i */
    public int f6791i;

    /* renamed from: i0 */
    public final Rect f6792i0;

    /* renamed from: j */
    public int f6793j;

    /* renamed from: j0 */
    public final RectF f6794j0;

    /* renamed from: k */
    public final m f6795k;

    /* renamed from: k0 */
    public Typeface f6796k0;

    /* renamed from: l */
    public boolean f6797l;

    /* renamed from: l0 */
    public ColorDrawable f6798l0;

    /* renamed from: m */
    public int f6799m;

    /* renamed from: m0 */
    public int f6800m0;

    /* renamed from: n */
    public boolean f6801n;

    /* renamed from: n0 */
    public final LinkedHashSet<f> f6802n0;

    /* renamed from: o */
    public d1 f6803o;

    /* renamed from: o0 */
    public int f6804o0;

    /* renamed from: p */
    public int f6805p;

    /* renamed from: p0 */
    public final SparseArray<k> f6806p0;

    /* renamed from: q */
    public int f6807q;

    /* renamed from: q0 */
    public final CheckableImageButton f6808q0;

    /* renamed from: r */
    public CharSequence f6809r;

    /* renamed from: r0 */
    public final LinkedHashSet<g> f6810r0;

    /* renamed from: s */
    public boolean f6811s;

    /* renamed from: s0 */
    public ColorStateList f6812s0;

    /* renamed from: t */
    public d1 f6813t;

    /* renamed from: t0 */
    public PorterDuff.Mode f6814t0;

    /* renamed from: u */
    public ColorStateList f6815u;

    /* renamed from: u0 */
    public ColorDrawable f6816u0;

    /* renamed from: v */
    public int f6817v;

    /* renamed from: v0 */
    public int f6818v0;

    /* renamed from: w */
    public androidx.transition.c f6819w;

    /* renamed from: w0 */
    public Drawable f6820w0;

    /* renamed from: x */
    public androidx.transition.c f6821x;

    /* renamed from: x0 */
    public View.OnLongClickListener f6822x0;

    /* renamed from: y */
    public ColorStateList f6823y;

    /* renamed from: y0 */
    public View.OnLongClickListener f6824y0;

    /* renamed from: z */
    public ColorStateList f6825z;

    /* renamed from: z0 */
    public final CheckableImageButton f6826z0;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.T0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f6797l) {
                textInputLayout2.l(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f6811s) {
                textInputLayout3.t(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f6808q0.performClick();
            TextInputLayout.this.f6808q0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f6783e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.O0.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends k1.a {

        /* renamed from: d */
        public final TextInputLayout f6831d;

        public e(TextInputLayout textInputLayout) {
            this.f6831d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:94:0x00a8, code lost:
            if (r2 != null) goto L53;
         */
        @Override // k1.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(android.view.View r14, l1.j r15) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, l1.j):void");
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    /* loaded from: classes.dex */
    public static class h extends q1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c */
        public CharSequence f6832c;

        /* renamed from: d */
        public boolean f6833d;

        /* renamed from: e */
        public CharSequence f6834e;

        /* renamed from: f */
        public CharSequence f6835f;

        /* renamed from: g */
        public CharSequence f6836g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6832c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6833d = parcel.readInt() == 1;
            this.f6834e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6835f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6836g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("TextInputLayout.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" error=");
            a10.append((Object) this.f6832c);
            a10.append(" hint=");
            a10.append((Object) this.f6834e);
            a10.append(" helperText=");
            a10.append((Object) this.f6835f);
            a10.append(" placeholderText=");
            a10.append((Object) this.f6836g);
            a10.append("}");
            return a10.toString();
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            TextUtils.writeToParcel(this.f6832c, parcel, i10);
            parcel.writeInt(this.f6833d ? 1 : 0);
            TextUtils.writeToParcel(this.f6834e, parcel, i10);
            TextUtils.writeToParcel(this.f6835f, parcel, i10);
            TextUtils.writeToParcel(this.f6836g, parcel, i10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private k getEndIconDelegate() {
        k kVar = this.f6806p0.get(this.f6804o0);
        return kVar != null ? kVar : this.f6806p0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        boolean z10;
        if (this.f6826z0.getVisibility() == 0) {
            return this.f6826z0;
        }
        if (this.f6804o0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && f()) {
            return this.f6808q0;
        }
        return null;
    }

    public static void i(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt, z10);
            }
        }
    }

    public static void j(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        boolean a10 = o0.c.a(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (a10 || z10) ? true : true;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(a10);
        checkableImageButton.setPressable(a10);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        o0.d.s(checkableImageButton, i10);
    }

    private void setEditText(EditText editText) {
        if (this.f6783e == null) {
            if (this.f6804o0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f6783e = editText;
            int i10 = this.f6787g;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f6791i);
            }
            int i11 = this.f6789h;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f6793j);
            }
            g();
            setTextInputAccessibilityDelegate(new e(this));
            z9.d dVar = this.O0;
            Typeface typeface = this.f6783e.getTypeface();
            boolean n10 = dVar.n(typeface);
            boolean p10 = dVar.p(typeface);
            if (n10 || p10) {
                dVar.j(false);
            }
            z9.d dVar2 = this.O0;
            float textSize = this.f6783e.getTextSize();
            if (dVar2.f32099m != textSize) {
                dVar2.f32099m = textSize;
                dVar2.j(false);
            }
            z9.d dVar3 = this.O0;
            float letterSpacing = this.f6783e.getLetterSpacing();
            if (dVar3.f32088g0 != letterSpacing) {
                dVar3.f32088g0 = letterSpacing;
                dVar3.j(false);
            }
            int gravity = this.f6783e.getGravity();
            this.O0.m((gravity & (-113)) | 48);
            z9.d dVar4 = this.O0;
            if (dVar4.f32095k != gravity) {
                dVar4.f32095k = gravity;
                dVar4.j(false);
            }
            this.f6783e.addTextChangedListener(new a());
            if (this.C0 == null) {
                this.C0 = this.f6783e.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.f6783e.getHint();
                    this.f6785f = hint;
                    setHint(hint);
                    this.f6783e.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f6803o != null) {
                l(this.f6783e.getText().length());
            }
            o();
            this.f6795k.b();
            this.f6778b.bringToFront();
            this.f6779c.bringToFront();
            this.f6781d.bringToFront();
            this.f6826z0.bringToFront();
            Iterator<f> it = this.f6802n0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            v();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            z9.d dVar = this.O0;
            if (charSequence == null || !TextUtils.equals(dVar.G, charSequence)) {
                dVar.G = charSequence;
                dVar.H = null;
                Bitmap bitmap = dVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    dVar.K = null;
                }
                dVar.j(false);
            }
            if (!this.N0) {
                h();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f6811s == z10) {
            return;
        }
        if (z10) {
            d1 d1Var = this.f6813t;
            if (d1Var != null) {
                this.f6777a.addView(d1Var);
                this.f6813t.setVisibility(0);
            }
        } else {
            d1 d1Var2 = this.f6813t;
            if (d1Var2 != null) {
                d1Var2.setVisibility(8);
            }
            this.f6813t = null;
        }
        this.f6811s = z10;
    }

    public final void a(float f10) {
        if (this.O0.f32079c == f10) {
            return;
        }
        if (this.R0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.R0 = valueAnimator;
            valueAnimator.setInterpolator(h9.a.f16044b);
            this.R0.setDuration(167L);
            this.R0.addUpdateListener(new d());
        }
        this.R0.setFloatValues(this.O0.f32079c, f10);
        this.R0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f6777a.addView(view, layoutParams2);
        this.f6777a.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float e10;
        if (this.C) {
            int i10 = this.V;
            if (i10 == 0) {
                e10 = this.O0.e();
            } else if (i10 != 2) {
                return 0;
            } else {
                e10 = this.O0.e() / 2.0f;
            }
            return (int) e10;
        }
        return 0;
    }

    public final boolean d() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof ka.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f6783e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f6785f != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f6783e.setHint(this.f6785f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f6783e.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f6777a.getChildCount());
        for (int i11 = 0; i11 < this.f6777a.getChildCount(); i11++) {
            View childAt = this.f6777a.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f6783e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ga.f fVar;
        super.draw(canvas);
        if (this.C) {
            this.O0.d(canvas);
        }
        if (this.L != null && (fVar = this.H) != null) {
            fVar.draw(canvas);
            if (this.f6783e.isFocused()) {
                Rect bounds = this.L.getBounds();
                Rect bounds2 = this.H.getBounds();
                float f10 = this.O0.f32079c;
                int centerX = bounds2.centerX();
                bounds.left = h9.a.b(f10, centerX, bounds2.left);
                bounds.right = h9.a.b(f10, centerX, bounds2.right);
                this.L.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        if (this.S0) {
            return;
        }
        boolean z11 = true;
        this.S0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        z9.d dVar = this.O0;
        if (dVar != null) {
            z10 = dVar.s(drawableState) | false;
        } else {
            z10 = false;
        }
        if (this.f6783e != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            s((o0.g.c(this) && isEnabled()) ? false : false, false);
        }
        o();
        x();
        if (z10) {
            invalidate();
        }
        this.S0 = false;
    }

    public final int e(int i10, boolean z10) {
        int compoundPaddingLeft = this.f6783e.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final boolean f() {
        return this.f6781d.getVisibility() == 0 && this.f6808q0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.g():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6783e;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public ga.f getBoxBackground() {
        int i10 = this.V;
        if (i10 == 1 || i10 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6788g0;
    }

    public int getBoxBackgroundMode() {
        return this.V;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        ga.c cVar;
        if (z9.r.c(this)) {
            cVar = this.M.f15124h;
        } else {
            cVar = this.M.f15123g;
        }
        return cVar.a(this.f6794j0);
    }

    public float getBoxCornerRadiusBottomStart() {
        ga.c cVar;
        if (z9.r.c(this)) {
            cVar = this.M.f15123g;
        } else {
            cVar = this.M.f15124h;
        }
        return cVar.a(this.f6794j0);
    }

    public float getBoxCornerRadiusTopEnd() {
        ga.c cVar;
        if (z9.r.c(this)) {
            cVar = this.M.f15121e;
        } else {
            cVar = this.M.f15122f;
        }
        return cVar.a(this.f6794j0);
    }

    public float getBoxCornerRadiusTopStart() {
        ga.c cVar;
        if (z9.r.c(this)) {
            cVar = this.M.f15122f;
        } else {
            cVar = this.M.f15121e;
        }
        return cVar.a(this.f6794j0);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.f6782d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6784e0;
    }

    public int getCounterMaxLength() {
        return this.f6799m;
    }

    public CharSequence getCounterOverflowDescription() {
        d1 d1Var;
        if (this.f6797l && this.f6801n && (d1Var = this.f6803o) != null) {
            return d1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f6823y;
    }

    public ColorStateList getCounterTextColor() {
        return this.f6823y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.f6783e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6808q0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6808q0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f6804o0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6808q0;
    }

    public CharSequence getError() {
        m mVar = this.f6795k;
        if (mVar.f18230k) {
            return mVar.f18229j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6795k.f18232m;
    }

    public int getErrorCurrentTextColors() {
        return this.f6795k.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f6826z0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f6795k.g();
    }

    public CharSequence getHelperText() {
        m mVar = this.f6795k;
        if (mVar.f18236q) {
            return mVar.f18235p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        d1 d1Var = this.f6795k.f18237r;
        if (d1Var != null) {
            return d1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.O0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        z9.d dVar = this.O0;
        return dVar.f(dVar.f32105p);
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public int getMaxEms() {
        return this.f6789h;
    }

    public int getMaxWidth() {
        return this.f6793j;
    }

    public int getMinEms() {
        return this.f6787g;
    }

    public int getMinWidth() {
        return this.f6791i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6808q0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6808q0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6811s) {
            return this.f6809r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6817v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6815u;
    }

    public CharSequence getPrefixText() {
        return this.f6778b.f18254c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6778b.f18253b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6778b.f18253b;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6778b.f18255d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6778b.f18255d.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.f6796k0;
    }

    public final void h() {
        float f10;
        float f11;
        float f12;
        float f13;
        if (!d()) {
            return;
        }
        RectF rectF = this.f6794j0;
        z9.d dVar = this.O0;
        int width = this.f6783e.getWidth();
        int gravity = this.f6783e.getGravity();
        boolean b10 = dVar.b(dVar.G);
        dVar.I = b10;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? b10 : !b10) {
                f12 = dVar.f32091i.left;
                rectF.left = f12;
                Rect rect = dVar.f32091i;
                float f14 = rect.top;
                rectF.top = f14;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!b10) {
                            f13 = dVar.f32094j0 + f12;
                        }
                        f13 = rect.right;
                    } else {
                        if (b10) {
                            f13 = dVar.f32094j0 + f12;
                        }
                        f13 = rect.right;
                    }
                } else {
                    f13 = (width / 2.0f) + (dVar.f32094j0 / 2.0f);
                }
                rectF.right = f13;
                rectF.bottom = dVar.e() + f14;
                float f15 = rectF.left;
                float f16 = this.U;
                rectF.left = f15 - f16;
                rectF.right += f16;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f6780c0);
                ka.f fVar = (ka.f) this.F;
                fVar.getClass();
                fVar.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f10 = dVar.f32091i.right;
            f11 = dVar.f32094j0;
        } else {
            f10 = width / 2.0f;
            f11 = dVar.f32094j0 / 2.0f;
        }
        f12 = f10 - f11;
        rectF.left = f12;
        Rect rect2 = dVar.f32091i;
        float f142 = rect2.top;
        rectF.top = f142;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (dVar.f32094j0 / 2.0f);
        rectF.right = f13;
        rectF.bottom = dVar.e() + f142;
        float f152 = rectF.left;
        float f162 = this.U;
        rectF.left = f152 - f162;
        rectF.right += f162;
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f6780c0);
        ka.f fVar2 = (ka.f) this.F;
        fVar2.getClass();
        fVar2.r(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            o1.p.e(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R.style.TextAppearance_AppCompat_Caption
            o1.p.e(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R.color.design_error
            int r4 = y0.a.b(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.k(android.widget.TextView, int):void");
    }

    public final void l(int i10) {
        boolean z10;
        int i11;
        boolean z11 = this.f6801n;
        int i12 = this.f6799m;
        String str = null;
        if (i12 == -1) {
            this.f6803o.setText(String.valueOf(i10));
            this.f6803o.setContentDescription(null);
            this.f6801n = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6801n = z10;
            Context context = getContext();
            d1 d1Var = this.f6803o;
            int i13 = this.f6799m;
            if (this.f6801n) {
                i11 = R.string.character_counter_overflowed_content_description;
            } else {
                i11 = R.string.character_counter_content_description;
            }
            d1Var.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z11 != this.f6801n) {
                m();
            }
            i1.a c10 = i1.a.c();
            d1 d1Var2 = this.f6803o;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f6799m));
            i1.e eVar = c10.f16203c;
            if (string != null) {
                str = c10.d(string, eVar).toString();
            }
            d1Var2.setText(str);
        }
        if (this.f6783e != null && z11 != this.f6801n) {
            s(false, false);
            x();
            o();
        }
    }

    public final void m() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d1 d1Var = this.f6803o;
        if (d1Var != null) {
            k(d1Var, this.f6801n ? this.f6805p : this.f6807q);
            if (!this.f6801n && (colorStateList2 = this.f6823y) != null) {
                this.f6803o.setTextColor(colorStateList2);
            }
            if (!this.f6801n || (colorStateList = this.f6825z) == null) {
                return;
            }
            this.f6803o.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0095, code lost:
        if (f() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0099, code lost:
        if (r10.A != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.n():boolean");
    }

    public final void o() {
        Drawable background;
        d1 d1Var;
        int currentTextColor;
        EditText editText = this.f6783e;
        if (editText == null || this.V != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = k1.f1396a;
        Drawable mutate = background.mutate();
        if (this.f6795k.e()) {
            currentTextColor = this.f6795k.g();
        } else if (!this.f6801n || (d1Var = this.f6803o) == null) {
            b1.a.a(mutate);
            this.f6783e.refreshDrawableState();
            return;
        } else {
            currentTextColor = d1Var.getCurrentTextColor();
        }
        mutate.setColorFilter(androidx.appcompat.widget.k.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O0.h(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01bb  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        if (this.f6783e != null && this.f6783e.getMeasuredHeight() < (max = Math.max(this.f6779c.getMeasuredHeight(), this.f6778b.getMeasuredHeight()))) {
            this.f6783e.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean n10 = n();
        if (z10 || n10) {
            this.f6783e.post(new c());
        }
        if (this.f6813t != null && (editText = this.f6783e) != null) {
            this.f6813t.setGravity(editText.getGravity());
            this.f6813t.setPadding(this.f6783e.getCompoundPaddingLeft(), this.f6783e.getCompoundPaddingTop(), this.f6783e.getCompoundPaddingRight(), this.f6783e.getCompoundPaddingBottom());
        }
        v();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f24504a);
        setError(hVar.f6832c);
        if (hVar.f6833d) {
            this.f6808q0.post(new b());
        }
        setHint(hVar.f6834e);
        setHelperText(hVar.f6835f);
        setPlaceholderText(hVar.f6836g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        super.onRtlPropertiesChanged(i10);
        boolean z11 = false;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = this.Q;
        if (z10 != z12) {
            if (z10 && !z12) {
                z11 = true;
            }
            float a10 = this.M.f15121e.a(this.f6794j0);
            float a11 = this.M.f15122f.a(this.f6794j0);
            float a12 = this.M.f15124h.a(this.f6794j0);
            float a13 = this.M.f15123g.a(this.f6794j0);
            if (z11) {
                f10 = a10;
            } else {
                f10 = a11;
            }
            if (z11) {
                a10 = a11;
            }
            if (z11) {
                f11 = a12;
            } else {
                f11 = a13;
            }
            if (z11) {
                a12 = a13;
            }
            boolean c10 = z9.r.c(this);
            this.Q = c10;
            if (c10) {
                f12 = a10;
            } else {
                f12 = f10;
            }
            if (!c10) {
                f10 = a10;
            }
            if (c10) {
                f13 = a12;
            } else {
                f13 = f11;
            }
            if (!c10) {
                f11 = a12;
            }
            ga.f fVar = this.F;
            if (fVar != null && fVar.f15069a.f15093a.f15121e.a(fVar.h()) == f12) {
                ga.f fVar2 = this.F;
                if (fVar2.f15069a.f15093a.f15122f.a(fVar2.h()) == f10) {
                    ga.f fVar3 = this.F;
                    if (fVar3.f15069a.f15093a.f15124h.a(fVar3.h()) == f13) {
                        ga.f fVar4 = this.F;
                        if (fVar4.f15069a.f15093a.f15123g.a(fVar4.h()) == f11) {
                            return;
                        }
                    }
                }
            }
            i iVar = this.M;
            iVar.getClass();
            i.a aVar = new i.a(iVar);
            aVar.f15133e = new ga.a(f12);
            aVar.f15134f = new ga.a(f10);
            aVar.f15136h = new ga.a(f13);
            aVar.f15135g = new ga.a(f11);
            this.M = new i(aVar);
            b();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        h hVar = new h(super.onSaveInstanceState());
        if (this.f6795k.e()) {
            hVar.f6832c = getError();
        }
        boolean z11 = true;
        if (this.f6804o0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hVar.f6833d = (z10 && this.f6808q0.isChecked()) ? false : false;
        hVar.f6834e = getHint();
        hVar.f6835f = getHelperText();
        hVar.f6836g = getPlaceholderText();
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f6781d
            com.google.android.material.internal.CheckableImageButton r1 = r5.f6808q0
            int r1 = r1.getVisibility()
            r2 = 1
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r1 = r5.f6826z0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1d
            r1 = 0
            goto L1f
        L1d:
            r1 = 8
        L1f:
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r5.A
            if (r0 == 0) goto L2c
            boolean r0 = r5.N0
            if (r0 != 0) goto L2c
            r0 = 0
            goto L2e
        L2c:
            r0 = 8
        L2e:
            boolean r1 = r5.f()
            if (r1 != 0) goto L45
            com.google.android.material.internal.CheckableImageButton r1 = r5.f6826z0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r1 != 0) goto L45
            if (r0 != 0) goto L44
            goto L45
        L44:
            r2 = 0
        L45:
            android.widget.LinearLayout r0 = r5.f6779c
            if (r2 == 0) goto L4a
            r3 = 0
        L4a:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getErrorIconDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            ka.m r0 = r4.f6795k
            boolean r3 = r0.f18230k
            if (r3 == 0) goto L16
            boolean r0 = r0.e()
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f6826z0
            if (r0 == 0) goto L1d
            r0 = 0
            goto L1f
        L1d:
            r0 = 8
        L1f:
            r3.setVisibility(r0)
            r4.p()
            r4.v()
            int r0 = r4.f6804o0
            if (r0 == 0) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L33
            r4.n()
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():void");
    }

    public final void r() {
        if (this.V != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6777a.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                this.f6777a.requestLayout();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        z9.d dVar;
        d1 d1Var;
        ColorStateList colorStateList2;
        int length;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f6783e;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f6783e;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean e10 = this.f6795k.e();
        ColorStateList colorStateList3 = this.C0;
        if (colorStateList3 != null) {
            this.O0.l(colorStateList3);
            z9.d dVar2 = this.O0;
            ColorStateList colorStateList4 = this.C0;
            if (dVar2.f32103o != colorStateList4) {
                dVar2.f32103o = colorStateList4;
                dVar2.j(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList5 = this.C0;
            if (colorStateList5 != null) {
                i10 = colorStateList5.getColorForState(new int[]{-16842910}, this.M0);
            } else {
                i10 = this.M0;
            }
            this.O0.l(ColorStateList.valueOf(i10));
            z9.d dVar3 = this.O0;
            ColorStateList valueOf = ColorStateList.valueOf(i10);
            if (dVar3.f32103o != valueOf) {
                dVar3.f32103o = valueOf;
                dVar3.j(false);
            }
        } else if (e10) {
            z9.d dVar4 = this.O0;
            d1 d1Var2 = this.f6795k.f18231l;
            if (d1Var2 != null) {
                colorStateList2 = d1Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            dVar4.l(colorStateList2);
        } else {
            if (this.f6801n && (d1Var = this.f6803o) != null) {
                dVar = this.O0;
                colorStateList = d1Var.getTextColors();
            } else if (z13 && (colorStateList = this.D0) != null) {
                dVar = this.O0;
            }
            dVar.l(colorStateList);
        }
        if (!z12 && this.P0 && (!isEnabled() || !z13)) {
            if (z11 || !this.N0) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.R0.cancel();
                }
                if (z10 && this.Q0) {
                    a(0.0f);
                } else {
                    this.O0.q(0.0f);
                }
                if (d() && (!((ka.f) this.F).f18210z.isEmpty()) && d()) {
                    ((ka.f) this.F).r(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.N0 = true;
                d1 d1Var3 = this.f6813t;
                if (d1Var3 != null && this.f6811s) {
                    d1Var3.setText((CharSequence) null);
                    androidx.transition.k.a(this.f6777a, this.f6821x);
                    this.f6813t.setVisibility(4);
                }
                r rVar = this.f6778b;
                rVar.f18259h = true;
                rVar.d();
                w();
            }
        } else if (z11 || this.N0) {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.R0.cancel();
            }
            if (z10 && this.Q0) {
                a(1.0f);
            } else {
                this.O0.q(1.0f);
            }
            this.N0 = false;
            if (d()) {
                h();
            }
            EditText editText3 = this.f6783e;
            if (editText3 == null) {
                length = 0;
            } else {
                length = editText3.getText().length();
            }
            t(length);
            r rVar2 = this.f6778b;
            rVar2.f18259h = false;
            rVar2.d();
            w();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f6788g0 != i10) {
            this.f6788g0 = i10;
            this.I0 = i10;
            this.K0 = i10;
            this.L0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(y0.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.f6788g0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.V) {
            return;
        }
        this.V = i10;
        if (this.f6783e != null) {
            g();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.W = i10;
    }

    public void setBoxStrokeColor(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.G0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            x();
        }
        this.E0 = colorStateList.getDefaultColor();
        this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.F0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.G0 = defaultColor;
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f6782d0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f6784e0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        int length;
        if (this.f6797l != z10) {
            if (z10) {
                d1 d1Var = new d1(getContext(), null);
                this.f6803o = d1Var;
                d1Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f6796k0;
                if (typeface != null) {
                    this.f6803o.setTypeface(typeface);
                }
                this.f6803o.setMaxLines(1);
                this.f6795k.a(this.f6803o, 2);
                k1.h.h((ViewGroup.MarginLayoutParams) this.f6803o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m();
                if (this.f6803o != null) {
                    EditText editText = this.f6783e;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    l(length);
                }
            } else {
                this.f6795k.i(this.f6803o, 2);
                this.f6803o = null;
            }
            this.f6797l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f6799m != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f6799m = i10;
            if (!this.f6797l || this.f6803o == null) {
                return;
            }
            EditText editText = this.f6783e;
            l(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f6805p != i10) {
            this.f6805p = i10;
            m();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f6825z != colorStateList) {
            this.f6825z = colorStateList;
            m();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f6807q != i10) {
            this.f6807q = i10;
            m();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f6823y != colorStateList) {
            this.f6823y = colorStateList;
            m();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.f6783e != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        i(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f6808q0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f6808q0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f6808q0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f6808q0.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this, this.f6808q0, this.f6812s0, this.f6814t0);
            l.b(this, this.f6808q0, this.f6812s0);
        }
    }

    public void setEndIconMode(int i10) {
        boolean z10;
        int i11 = this.f6804o0;
        if (i11 == i10) {
            return;
        }
        this.f6804o0 = i10;
        Iterator<g> it = this.f6810r0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i11);
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEndIconVisible(z10);
        if (getEndIconDelegate().b(this.V)) {
            getEndIconDelegate().a();
            l.a(this, this.f6808q0, this.f6812s0, this.f6814t0);
            return;
        }
        StringBuilder a10 = android.support.v4.media.d.a("The current box background mode ");
        a10.append(this.V);
        a10.append(" is not supported by the end icon mode ");
        a10.append(i10);
        throw new IllegalStateException(a10.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6808q0;
        View.OnLongClickListener onLongClickListener = this.f6822x0;
        checkableImageButton.setOnClickListener(onClickListener);
        j(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6822x0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6808q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f6812s0 != colorStateList) {
            this.f6812s0 = colorStateList;
            l.a(this, this.f6808q0, colorStateList, this.f6814t0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f6814t0 != mode) {
            this.f6814t0 = mode;
            l.a(this, this.f6808q0, this.f6812s0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (f() != z10) {
            this.f6808q0.setVisibility(z10 ? 0 : 8);
            p();
            v();
            n();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f6795k.f18230k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            m mVar = this.f6795k;
            mVar.c();
            mVar.f18229j = charSequence;
            mVar.f18231l.setText(charSequence);
            int i10 = mVar.f18227h;
            if (i10 != 1) {
                mVar.f18228i = 1;
            }
            mVar.k(i10, mVar.f18228i, mVar.j(mVar.f18231l, charSequence));
            return;
        }
        this.f6795k.h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        m mVar = this.f6795k;
        mVar.f18232m = charSequence;
        d1 d1Var = mVar.f18231l;
        if (d1Var != null) {
            d1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        m mVar = this.f6795k;
        if (mVar.f18230k != z10) {
            mVar.c();
            if (z10) {
                d1 d1Var = new d1(mVar.f18220a, null);
                mVar.f18231l = d1Var;
                d1Var.setId(R.id.textinput_error);
                mVar.f18231l.setTextAlignment(5);
                Typeface typeface = mVar.f18240u;
                if (typeface != null) {
                    mVar.f18231l.setTypeface(typeface);
                }
                int i10 = mVar.f18233n;
                mVar.f18233n = i10;
                d1 d1Var2 = mVar.f18231l;
                if (d1Var2 != null) {
                    mVar.f18221b.k(d1Var2, i10);
                }
                ColorStateList colorStateList = mVar.f18234o;
                mVar.f18234o = colorStateList;
                d1 d1Var3 = mVar.f18231l;
                if (d1Var3 != null && colorStateList != null) {
                    d1Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = mVar.f18232m;
                mVar.f18232m = charSequence;
                d1 d1Var4 = mVar.f18231l;
                if (d1Var4 != null) {
                    d1Var4.setContentDescription(charSequence);
                }
                mVar.f18231l.setVisibility(4);
                d1 d1Var5 = mVar.f18231l;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.g.f(d1Var5, 1);
                mVar.a(mVar.f18231l, 0);
            } else {
                mVar.h();
                mVar.i(mVar.f18231l, 0);
                mVar.f18231l = null;
                mVar.f18221b.o();
                mVar.f18221b.x();
            }
            mVar.f18230k = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
        l.b(this, this.f6826z0, this.A0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6826z0.setImageDrawable(drawable);
        q();
        l.a(this, this.f6826z0, this.A0, this.B0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6826z0;
        View.OnLongClickListener onLongClickListener = this.f6824y0;
        checkableImageButton.setOnClickListener(onClickListener);
        j(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6824y0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6826z0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            l.a(this, this.f6826z0, colorStateList, this.B0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.B0 != mode) {
            this.B0 = mode;
            l.a(this, this.f6826z0, this.A0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        m mVar = this.f6795k;
        mVar.f18233n = i10;
        d1 d1Var = mVar.f18231l;
        if (d1Var != null) {
            mVar.f18221b.k(d1Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        m mVar = this.f6795k;
        mVar.f18234o = colorStateList;
        d1 d1Var = mVar.f18231l;
        if (d1Var != null && colorStateList != null) {
            d1Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f6795k.f18236q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f6795k.f18236q) {
            setHelperTextEnabled(true);
        }
        m mVar = this.f6795k;
        mVar.c();
        mVar.f18235p = charSequence;
        mVar.f18237r.setText(charSequence);
        int i10 = mVar.f18227h;
        if (i10 != 2) {
            mVar.f18228i = 2;
        }
        mVar.k(i10, mVar.f18228i, mVar.j(mVar.f18237r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        m mVar = this.f6795k;
        mVar.f18239t = colorStateList;
        d1 d1Var = mVar.f18237r;
        if (d1Var != null && colorStateList != null) {
            d1Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        m mVar = this.f6795k;
        if (mVar.f18236q != z10) {
            mVar.c();
            if (z10) {
                d1 d1Var = new d1(mVar.f18220a, null);
                mVar.f18237r = d1Var;
                d1Var.setId(R.id.textinput_helper_text);
                mVar.f18237r.setTextAlignment(5);
                Typeface typeface = mVar.f18240u;
                if (typeface != null) {
                    mVar.f18237r.setTypeface(typeface);
                }
                mVar.f18237r.setVisibility(4);
                d1 d1Var2 = mVar.f18237r;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.g.f(d1Var2, 1);
                int i10 = mVar.f18238s;
                mVar.f18238s = i10;
                d1 d1Var3 = mVar.f18237r;
                if (d1Var3 != null) {
                    p.e(d1Var3, i10);
                }
                ColorStateList colorStateList = mVar.f18239t;
                mVar.f18239t = colorStateList;
                d1 d1Var4 = mVar.f18237r;
                if (d1Var4 != null && colorStateList != null) {
                    d1Var4.setTextColor(colorStateList);
                }
                mVar.a(mVar.f18237r, 1);
                mVar.f18237r.setAccessibilityDelegate(new n(mVar));
            } else {
                mVar.c();
                int i11 = mVar.f18227h;
                if (i11 == 2) {
                    mVar.f18228i = 0;
                }
                mVar.k(i11, mVar.f18228i, mVar.j(mVar.f18237r, ""));
                mVar.i(mVar.f18237r, 1);
                mVar.f18237r = null;
                mVar.f18221b.o();
                mVar.f18221b.x();
            }
            mVar.f18236q = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        m mVar = this.f6795k;
        mVar.f18238s = i10;
        d1 d1Var = mVar.f18237r;
        if (d1Var != null) {
            p.e(d1Var, i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (z10) {
                CharSequence hint = this.f6783e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f6783e.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f6783e.getHint())) {
                    this.f6783e.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f6783e != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.O0.k(i10);
        this.D0 = this.O0.f32105p;
        if (this.f6783e != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                this.O0.l(colorStateList);
            }
            this.D0 = colorStateList;
            if (this.f6783e != null) {
                s(false, false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.f6789h = i10;
        EditText editText = this.f6783e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f6793j = i10;
        EditText editText = this.f6783e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f6787g = i10;
        EditText editText = this.f6783e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f6791i = i10;
        EditText editText = this.f6783e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6808q0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6808q0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f6804o0 != 1) {
            setEndIconMode(1);
        } else if (z10) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f6812s0 = colorStateList;
        l.a(this, this.f6808q0, colorStateList, this.f6814t0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f6814t0 = mode;
        l.a(this, this.f6808q0, this.f6812s0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6813t == null) {
            d1 d1Var = new d1(getContext(), null);
            this.f6813t = d1Var;
            d1Var.setId(R.id.textinput_placeholder);
            d1 d1Var2 = this.f6813t;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.s(d1Var2, 2);
            androidx.transition.c cVar = new androidx.transition.c();
            cVar.f3418c = 87L;
            LinearInterpolator linearInterpolator = h9.a.f16043a;
            cVar.f3419d = linearInterpolator;
            this.f6819w = cVar;
            cVar.f3417b = 67L;
            androidx.transition.c cVar2 = new androidx.transition.c();
            cVar2.f3418c = 87L;
            cVar2.f3419d = linearInterpolator;
            this.f6821x = cVar2;
            setPlaceholderTextAppearance(this.f6817v);
            setPlaceholderTextColor(this.f6815u);
        }
        int i10 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6811s) {
                setPlaceholderTextEnabled(true);
            }
            this.f6809r = charSequence;
        }
        EditText editText = this.f6783e;
        if (editText != null) {
            i10 = editText.getText().length();
        }
        t(i10);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f6817v = i10;
        d1 d1Var = this.f6813t;
        if (d1Var != null) {
            p.e(d1Var, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6815u != colorStateList) {
            this.f6815u = colorStateList;
            d1 d1Var = this.f6813t;
            if (d1Var == null || colorStateList == null) {
                return;
            }
            d1Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        r rVar = this.f6778b;
        rVar.getClass();
        rVar.f18254c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rVar.f18253b.setText(charSequence);
        rVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        p.e(this.f6778b.f18253b, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6778b.f18253b.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f6778b.f18255d.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        r rVar = this.f6778b;
        if (rVar.f18255d.getContentDescription() != charSequence) {
            rVar.f18255d.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6778b.a(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f6778b;
        CheckableImageButton checkableImageButton = rVar.f18255d;
        View.OnLongClickListener onLongClickListener = rVar.f18258g;
        checkableImageButton.setOnClickListener(onClickListener);
        l.c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f6778b;
        rVar.f18258g = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f18255d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        r rVar = this.f6778b;
        if (rVar.f18256e != colorStateList) {
            rVar.f18256e = colorStateList;
            l.a(rVar.f18252a, rVar.f18255d, colorStateList, rVar.f18257f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f6778b;
        if (rVar.f18257f != mode) {
            rVar.f18257f = mode;
            l.a(rVar.f18252a, rVar.f18255d, rVar.f18256e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f6778b.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        w();
    }

    public void setSuffixTextAppearance(int i10) {
        p.e(this.B, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f6783e;
        if (editText != null) {
            o0.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6796k0) {
            this.f6796k0 = typeface;
            z9.d dVar = this.O0;
            boolean n10 = dVar.n(typeface);
            boolean p10 = dVar.p(typeface);
            if (n10 || p10) {
                dVar.j(false);
            }
            m mVar = this.f6795k;
            if (typeface != mVar.f18240u) {
                mVar.f18240u = typeface;
                d1 d1Var = mVar.f18231l;
                if (d1Var != null) {
                    d1Var.setTypeface(typeface);
                }
                d1 d1Var2 = mVar.f18237r;
                if (d1Var2 != null) {
                    d1Var2.setTypeface(typeface);
                }
            }
            d1 d1Var3 = this.f6803o;
            if (d1Var3 != null) {
                d1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i10) {
        if (i10 == 0 && !this.N0) {
            if (this.f6813t != null && this.f6811s && !TextUtils.isEmpty(this.f6809r)) {
                this.f6813t.setText(this.f6809r);
                androidx.transition.k.a(this.f6777a, this.f6819w);
                this.f6813t.setVisibility(0);
                this.f6813t.bringToFront();
                announceForAccessibility(this.f6809r);
                return;
            }
            return;
        }
        d1 d1Var = this.f6813t;
        if (d1Var != null && this.f6811s) {
            d1Var.setText((CharSequence) null);
            androidx.transition.k.a(this.f6777a, this.f6821x);
            this.f6813t.setVisibility(4);
        }
    }

    public final void u(boolean z10, boolean z11) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f6786f0 = colorForState2;
        } else if (z11) {
            this.f6786f0 = colorForState;
        } else {
            this.f6786f0 = defaultColor;
        }
    }

    public final void v() {
        boolean z10;
        if (this.f6783e == null) {
            return;
        }
        int i10 = 0;
        if (!f()) {
            if (this.f6826z0.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                EditText editText = this.f6783e;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                i10 = o0.e.e(editText);
            }
        }
        d1 d1Var = this.B;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f6783e.getPaddingTop();
        int paddingBottom = this.f6783e.getPaddingBottom();
        WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
        o0.e.k(d1Var, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void w() {
        int i10;
        int visibility = this.B.getVisibility();
        boolean z10 = false;
        if (this.A != null && !this.N0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            k endIconDelegate = getEndIconDelegate();
            if (i10 == 0) {
                z10 = true;
            }
            endIconDelegate.c(z10);
        }
        p();
        this.B.setVisibility(i10);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }
}
