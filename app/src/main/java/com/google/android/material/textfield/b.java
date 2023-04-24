package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import ga.f;
import ga.i;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import ka.i;
import ka.k;
import l1.j;
import z9.n;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: e */
    public final a f6850e;

    /* renamed from: f */
    public final View$OnFocusChangeListenerC0099b f6851f;

    /* renamed from: g */
    public final c f6852g;

    /* renamed from: h */
    public final d f6853h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final e f6854i;

    /* renamed from: j */
    public final f f6855j;

    /* renamed from: k */
    public final g f6856k;

    /* renamed from: l */
    public boolean f6857l;

    /* renamed from: m */
    public boolean f6858m;

    /* renamed from: n */
    public long f6859n;

    /* renamed from: o */
    public StateListDrawable f6860o;

    /* renamed from: p */
    public ga.f f6861p;

    /* renamed from: q */
    public AccessibilityManager f6862q;

    /* renamed from: r */
    public ValueAnimator f6863r;

    /* renamed from: s */
    public ValueAnimator f6864s;

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: com.google.android.material.textfield.b$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0098a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f6866a;

            public RunnableC0098a(AutoCompleteTextView autoCompleteTextView) {
                a.this = r1;
                this.f6866a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isPopupShowing = this.f6866a.isPopupShowing();
                b.this.g(isPopupShowing);
                b.this.f6857l = isPopupShowing;
            }
        }

        public a() {
            b.this = r1;
        }

        @Override // z9.n, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            EditText editText = b.this.f18216a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (b.this.f6862q.isTouchExplorationEnabled()) {
                    if (autoCompleteTextView.getKeyListener() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !b.this.f18218c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new RunnableC0098a(autoCompleteTextView));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC0099b implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC0099b() {
            b.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            b.this.f18216a.setEndIconActivated(z10);
            if (!z10) {
                b.this.g(false);
                b.this.f6857l = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends TextInputLayout.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
            b.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, k1.a
        public final void d(View view, j jVar) {
            boolean z10;
            super.d(view, jVar);
            boolean z11 = true;
            if (b.this.f18216a.getEditText().getKeyListener() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                jVar.g(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z11 = jVar.f18670a.isShowingHintText();
            } else {
                Bundle extras = jVar.f18670a.getExtras();
                if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                    z11 = false;
                }
            }
            if (z11) {
                jVar.j(null);
            }
        }

        @Override // k1.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.e(view, accessibilityEvent);
            EditText editText = b.this.f18216a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (accessibilityEvent.getEventType() == 1 && b.this.f6862q.isEnabled()) {
                    if (b.this.f18216a.getEditText().getKeyListener() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        b.d(b.this, autoCompleteTextView);
                        b bVar = b.this;
                        bVar.f6857l = true;
                        bVar.f6859n = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.f {
        public d() {
            b.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.google.android.material.textfield.TextInputLayout r6) {
            /*
                r5 = this;
                android.widget.EditText r0 = r6.getEditText()
                boolean r1 = r0 instanceof android.widget.AutoCompleteTextView
                if (r1 == 0) goto L7f
                android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f18216a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L19
                ga.f r1 = r1.f6861p
                goto L1d
            L19:
                if (r2 != r4) goto L20
                android.graphics.drawable.StateListDrawable r1 = r1.f6860o
            L1d:
                r0.setDropDownBackgroundDrawable(r1)
            L20:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                r1.e(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                r1.getClass()
                ka.j r2 = new ka.j
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                com.google.android.material.textfield.b$b r2 = r1.f6851f
                r0.setOnFocusChangeListener(r2)
                ka.g r2 = new ka.g
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r1 = 0
                r0.setThreshold(r1)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f6850e
                r0.removeTextChangedListener(r2)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$a r2 = r2.f6850e
                r0.addTextChangedListener(r2)
                r6.setEndIconCheckable(r4)
                r2 = 0
                r6.setErrorIconDrawable(r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L5f
                r1 = 1
            L5f:
                if (r1 != 0) goto L74
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                android.view.accessibility.AccessibilityManager r0 = r0.f6862q
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L74
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f18218c
                java.util.WeakHashMap<android.view.View, k1.i2> r1 = k1.o0.f18161a
                k1.o0.d.s(r0, r3)
            L74:
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.b$c r0 = r0.f6852g
                r6.setTextInputAccessibilityDelegate(r0)
                r6.setEndIconVisible(r4)
                return
            L7f:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextInputLayout.g {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f6872a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                e.this = r1;
                this.f6872a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6872a.removeTextChangedListener(b.this.f6850e);
            }
        }

        public e() {
            b.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f6851f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i10 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f6855j);
                b bVar = b.this;
                AccessibilityManager accessibilityManager = bVar.f6862q;
                if (accessibilityManager != null) {
                    l1.c.b(accessibilityManager, bVar.f6856k);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnAttachStateChangeListener {
        public f() {
            b.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            TextInputLayout textInputLayout;
            b bVar = b.this;
            if (bVar.f6862q != null && (textInputLayout = bVar.f18216a) != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.g.b(textInputLayout)) {
                    l1.c.a(bVar.f6862q, bVar.f6856k);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            AccessibilityManager accessibilityManager = bVar.f6862q;
            if (accessibilityManager != null) {
                l1.c.b(accessibilityManager, bVar.f6856k);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements l1.d {
        public g() {
            b.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
            b.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.d(b.this, (AutoCompleteTextView) b.this.f18216a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout, i10);
        this.f6850e = new a();
        this.f6851f = new View$OnFocusChangeListenerC0099b();
        this.f6852g = new c(this.f18216a);
        this.f6853h = new d();
        this.f6854i = new e();
        this.f6855j = new f();
        this.f6856k = new g();
        this.f6857l = false;
        this.f6858m = false;
        this.f6859n = Long.MAX_VALUE;
    }

    public static void d(b bVar, AutoCompleteTextView autoCompleteTextView) {
        boolean z10;
        if (autoCompleteTextView == null) {
            bVar.getClass();
            return;
        }
        bVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - bVar.f6859n;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            bVar.f6857l = false;
        }
        if (!bVar.f6857l) {
            bVar.g(!bVar.f6858m);
            if (bVar.f6858m) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        bVar.f6857l = false;
    }

    @Override // ka.k
    public final void a() {
        TextInputLayout textInputLayout;
        float dimensionPixelOffset = this.f18217b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f18217b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f18217b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ga.f f10 = f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        ga.f f11 = f(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f6861p = f10;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f6860o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, f10);
        this.f6860o.addState(new int[0], f11);
        int i10 = this.f18219d;
        if (i10 == 0) {
            i10 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f18216a.setEndIconDrawable(i10);
        TextInputLayout textInputLayout2 = this.f18216a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f18216a.setEndIconOnClickListener(new h());
        TextInputLayout textInputLayout3 = this.f18216a;
        d dVar = this.f6853h;
        textInputLayout3.f6802n0.add(dVar);
        if (textInputLayout3.f6783e != null) {
            dVar.a(textInputLayout3);
        }
        this.f18216a.f6810r0.add(this.f6854i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = h9.a.f16043a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new i(this));
        this.f6864s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new i(this));
        this.f6863r = ofFloat2;
        ofFloat2.addListener(new ka.h(this));
        this.f6862q = (AccessibilityManager) this.f18217b.getSystemService("accessibility");
        this.f18216a.addOnAttachStateChangeListener(this.f6855j);
        if (this.f6862q != null && (textInputLayout = this.f18216a) != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.b(textInputLayout)) {
                l1.c.a(this.f6862q, this.f6856k);
            }
        }
    }

    @Override // ka.k
    public final boolean b(int i10) {
        return i10 != 0;
    }

    public final void e(AutoCompleteTextView autoCompleteTextView) {
        boolean z10;
        if (autoCompleteTextView.getKeyListener() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        int boxBackgroundMode = this.f18216a.getBoxBackgroundMode();
        ga.f boxBackground = this.f18216a.getBoxBackground();
        int b10 = u9.a.b(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            int b11 = u9.a.b(autoCompleteTextView, R.attr.colorSurface);
            ga.f fVar = new ga.f(boxBackground.f15069a.f15093a);
            int d10 = u9.a.d(0.1f, b10, b11);
            fVar.k(new ColorStateList(iArr, new int[]{d10, 0}));
            fVar.setTint(b11);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{d10, b11});
            ga.f fVar2 = new ga.f(boxBackground.f15069a.f15093a);
            fVar2.setTint(-1);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar, fVar2), boxBackground});
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.q(autoCompleteTextView, layerDrawable);
        } else if (boxBackgroundMode == 1) {
            int boxBackgroundColor = this.f18216a.getBoxBackgroundColor();
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{u9.a.d(0.1f, b10, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            o0.d.q(autoCompleteTextView, rippleDrawable);
        }
    }

    public final ga.f f(float f10, float f11, float f12, int i10) {
        i.a aVar = new i.a();
        aVar.f15133e = new ga.a(f10);
        aVar.f15134f = new ga.a(f10);
        aVar.f15136h = new ga.a(f11);
        aVar.f15135g = new ga.a(f11);
        ga.i iVar = new ga.i(aVar);
        Context context = this.f18217b;
        String str = ga.f.f15067x;
        int b10 = da.b.b(context, R.attr.colorSurface, ga.f.class.getSimpleName());
        ga.f fVar = new ga.f();
        fVar.i(context);
        fVar.k(ColorStateList.valueOf(b10));
        fVar.j(f12);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f15069a;
        if (bVar.f15100h == null) {
            bVar.f15100h = new Rect();
        }
        fVar.f15069a.f15100h.set(0, i10, 0, i10);
        fVar.invalidateSelf();
        return fVar;
    }

    public final void g(boolean z10) {
        if (this.f6858m != z10) {
            this.f6858m = z10;
            this.f6864s.cancel();
            this.f6863r.start();
        }
    }
}
