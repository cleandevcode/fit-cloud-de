package ka;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.r1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p extends androidx.appcompat.widget.d {

    /* renamed from: e */
    public final r1 f18248e;

    /* renamed from: f */
    public final AccessibilityManager f18249f;

    /* renamed from: g */
    public final Rect f18250g;

    /* renamed from: h */
    public final int f18251h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = la.a.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f18250g = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView
            int r4 = com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r1 = r9.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L33
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L33
            r7.setKeyListener(r2)
        L33:
            int r0 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout
            int r1 = com.google.android.material.R.layout.mtrl_auto_complete_simple_item
            int r0 = r9.getResourceId(r0, r1)
            r7.f18251h = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.f18249f = r0
            androidx.appcompat.widget.r1 r0 = new androidx.appcompat.widget.r1
            int r1 = androidx.appcompat.R.attr.listPopupWindowStyle
            r0.<init>(r8, r2, r1, r6)
            r7.f18248e = r0
            r8 = 1
            r0.f1520x = r8
            androidx.appcompat.widget.r r1 = r0.f1521y
            r1.setFocusable(r8)
            r0.f1511o = r7
            androidx.appcompat.widget.r r8 = r0.f1521y
            r1 = 2
            r8.setInputMethodMode(r1)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r0.p(r8)
            ka.o r8 = new ka.o
            r8.<init>(r7)
            r0.f1512p = r8
            int r8 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems
            boolean r0 = r9.hasValue(r8)
            if (r0 == 0) goto L7d
            int r8 = r9.getResourceId(r8, r6)
            r7.setSimpleItems(r8)
        L7d:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.p.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.E) {
            return b10.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                r1 r1Var = this.f18248e;
                if (!r1Var.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = r1Var.f1499c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable h10 = this.f18248e.h();
                if (h10 != null) {
                    h10.getPadding(this.f18250g);
                    Rect rect = this.f18250g;
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f18248e.p(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f18251h, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f18249f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f18248e.b();
        }
    }
}
