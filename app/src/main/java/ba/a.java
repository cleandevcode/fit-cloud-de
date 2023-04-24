package ba;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.q2;
import b1.a;
import com.google.android.material.R;
import java.util.WeakHashMap;
import k1.i0;
import k1.i2;
import k1.o0;
import l1.j;
import y0.a;

/* loaded from: classes.dex */
public abstract class a extends FrameLayout implements k.a {
    public static final int[] C = {16842912};
    public static final c D = new c();
    public static final d E = new d();
    public int A;
    public j9.a B;

    /* renamed from: a */
    public boolean f4054a;

    /* renamed from: b */
    public int f4055b;

    /* renamed from: c */
    public int f4056c;

    /* renamed from: d */
    public float f4057d;

    /* renamed from: e */
    public float f4058e;

    /* renamed from: f */
    public float f4059f;

    /* renamed from: g */
    public int f4060g;

    /* renamed from: h */
    public boolean f4061h;

    /* renamed from: i */
    public final FrameLayout f4062i;

    /* renamed from: j */
    public final View f4063j;

    /* renamed from: k */
    public final ImageView f4064k;

    /* renamed from: l */
    public final ViewGroup f4065l;

    /* renamed from: m */
    public final TextView f4066m;

    /* renamed from: n */
    public final TextView f4067n;

    /* renamed from: o */
    public int f4068o;

    /* renamed from: p */
    public h f4069p;

    /* renamed from: q */
    public ColorStateList f4070q;

    /* renamed from: r */
    public Drawable f4071r;

    /* renamed from: s */
    public Drawable f4072s;

    /* renamed from: t */
    public ValueAnimator f4073t;

    /* renamed from: u */
    public c f4074u;

    /* renamed from: v */
    public float f4075v;

    /* renamed from: w */
    public boolean f4076w;

    /* renamed from: x */
    public int f4077x;

    /* renamed from: y */
    public int f4078y;

    /* renamed from: z */
    public boolean f4079z;

    /* renamed from: ba.a$a */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0055a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ a f4080a;

        public View$OnLayoutChangeListenerC0055a(m9.a aVar) {
            this.f4080a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z10;
            if (this.f4080a.f4064k.getVisibility() == 0) {
                a aVar = this.f4080a;
                ImageView imageView = aVar.f4064k;
                j9.a aVar2 = aVar.B;
                if (aVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar2.setBounds(rect);
                    aVar2.h(imageView, null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f4081a;

        public b(int i10) {
            a.this = r1;
            this.f4081a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.g(this.f4081a);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // ba.a.c
        public final float a(float f10, float f11) {
            LinearInterpolator linearInterpolator = h9.a.f16043a;
            return (f10 * 0.6f) + 0.4f;
        }
    }

    public a(Context context) {
        super(context);
        this.f4054a = false;
        this.f4068o = -1;
        this.f4074u = D;
        this.f4075v = 0.0f;
        this.f4076w = false;
        this.f4077x = 0;
        this.f4078y = 0;
        this.f4079z = false;
        this.A = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f4062i = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f4063j = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.f4064k = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.f4065l = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.f4066m = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.f4067n = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f4055b = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f4056c = viewGroup.getPaddingBottom();
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.s(textView, 2);
        o0.d.s(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0055a((m9.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.widget.TextView r4, int r5) {
        /*
            o1.p.e(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = 0
            goto L5b
        Lc:
            int[] r2 = com.google.android.material.R.styleable.TextAppearance
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = com.google.android.material.R.styleable.TextAppearance_android_textSize
            boolean r3 = r5.getValue(r3, r2)
            r5.recycle()
            if (r3 != 0) goto L23
            goto La
        L23:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r5 < r3) goto L2e
            int r5 = da.c.a(r2)
            goto L33
        L2e:
            int r5 = r2.data
            int r5 = r5 >> r1
            r5 = r5 & 15
        L33:
            r3 = 2
            if (r5 != r3) goto L4d
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L5b
        L4d:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L5b:
            if (r5 == 0) goto L61
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.c(android.widget.TextView, int):void");
    }

    public static void e(float f10, float f11, int i10, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i10);
    }

    public static void f(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f4062i;
        return frameLayout != null ? frameLayout : this.f4064k;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        j9.a aVar = this.B;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return this.f4064k.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        j9.a aVar = this.B;
        if (aVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = aVar.getMinimumWidth() - this.B.f17528e.f17538b.f17554m.intValue();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        int max = Math.max(minimumWidth, layoutParams.leftMargin);
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f4064k.getMeasuredWidth() + max;
    }

    public static void h(ViewGroup viewGroup, int i10) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a(float f10, float f11) {
        this.f4057d = f10 - f11;
        this.f4058e = (f11 * 1.0f) / f10;
        this.f4059f = (f10 * 1.0f) / f11;
    }

    public final void b(float f10, float f11) {
        float f12;
        float f13;
        View view = this.f4063j;
        if (view != null) {
            c cVar = this.f4074u;
            cVar.getClass();
            LinearInterpolator linearInterpolator = h9.a.f16043a;
            view.setScaleX((0.6f * f10) + 0.4f);
            view.setScaleY(cVar.a(f10, f11));
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                f12 = 0.8f;
            } else {
                f12 = 0.0f;
            }
            if (i10 == 0) {
                f13 = 1.0f;
            } else {
                f13 = 0.2f;
            }
            view.setAlpha(h9.a.a(0.0f, 1.0f, f12, f13, f10));
        }
        this.f4075v = f10;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        CharSequence charSequence;
        int i10;
        this.f4069p = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f963e);
        setId(hVar.f959a);
        if (!TextUtils.isEmpty(hVar.f975q)) {
            setContentDescription(hVar.f975q);
        }
        if (!TextUtils.isEmpty(hVar.f976r)) {
            charSequence = hVar.f976r;
        } else {
            charSequence = hVar.f963e;
        }
        if (Build.VERSION.SDK_INT > 23) {
            q2.a(this, charSequence);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        this.f4054a = true;
    }

    public final void g(int i10) {
        boolean z10;
        int i11;
        if (this.f4063j == null) {
            return;
        }
        int min = Math.min(this.f4077x, i10 - (this.A * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4063j.getLayoutParams();
        if (this.f4079z && this.f4060g == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = min;
        } else {
            i11 = this.f4078y;
        }
        layoutParams.height = i11;
        layoutParams.width = min;
        this.f4063j.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f4063j;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public j9.a getBadge() {
        return this.B;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f4069p;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f4068o;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4065l.getLayoutParams();
        return this.f4065l.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4065l.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.f4065l.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.f4069p;
        if (hVar != null && hVar.isCheckable() && this.f4069p.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j9.a aVar = this.B;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.f4069p;
            CharSequence charSequence = hVar.f963e;
            if (!TextUtils.isEmpty(hVar.f975q)) {
                charSequence = this.f4069p.f975q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.B.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j.c.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f18686a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) j.a.f18673e.f18681a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f4063j;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f4076w = z10;
        View view = this.f4063j;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f4078y = i10;
        g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.A = i10;
        g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f4079z = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f4077x = i10;
        g(getWidth());
    }

    public void setBadge(j9.a aVar) {
        boolean z10;
        boolean z11;
        j9.a aVar2 = this.B;
        if (aVar2 == aVar) {
            return;
        }
        boolean z12 = true;
        if (aVar2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f4064k != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            ImageView imageView = this.f4064k;
            if (this.B != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (imageView != null) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    j9.a aVar3 = this.B;
                    if (aVar3 != null) {
                        if (aVar3.d() != null) {
                            aVar3.d().setForeground(null);
                        } else {
                            imageView.getOverlay().remove(aVar3);
                        }
                    }
                }
                this.B = null;
            }
        }
        this.B = aVar;
        ImageView imageView2 = this.f4064k;
        if (imageView2 != null) {
            if (aVar == null) {
                z12 = false;
            }
            if (z12) {
                setClipChildren(false);
                setClipToPadding(false);
                j9.a aVar4 = this.B;
                Rect rect = new Rect();
                imageView2.getDrawingRect(rect);
                aVar4.setBounds(rect);
                aVar4.h(imageView2, null);
                if (aVar4.d() != null) {
                    aVar4.d().setForeground(aVar4);
                } else {
                    imageView2.getOverlay().add(aVar4);
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d4, code lost:
        if (r10 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dd, code lost:
        if (r10 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ea, code lost:
        if (r10 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ec, code lost:
        f(r0, r1, 49);
        h(r9.f4065l, r9.f4056c);
        r9.f4067n.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fc, code lost:
        f(r0, r1, 17);
        h(r9.f4065l, 0);
        r9.f4067n.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0109, code lost:
        r9.f4066m.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0116, code lost:
        if (r10 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0118, code lost:
        f(getIconOrContainer(), (int) (r9.f4055b + r9.f4057d), 49);
        e(1.0f, 1.0f, 0, r9.f4067n);
        r0 = r9.f4066m;
        r1 = r9.f4058e;
        e(r1, r1, 4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0133, code lost:
        f(getIconOrContainer(), r9.f4055b, 49);
        r1 = r9.f4067n;
        r2 = r9.f4059f;
        e(r2, r2, 4, r1);
        e(1.0f, 1.0f, 0, r9.f4066m);
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r10) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.a.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f4066m.setEnabled(z10);
        this.f4067n.setEnabled(z10);
        this.f4064k.setEnabled(z10);
        i0 i0Var = null;
        if (z10) {
            Context context = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                i0Var = new i0(i0.a.b(context, 1002));
            } else {
                i0Var = new i0(null);
            }
        }
        o0.s(this, i0Var);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f4071r) {
            return;
        }
        this.f4071r = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = b1.a.g(drawable).mutate();
            this.f4072s = drawable;
            ColorStateList colorStateList = this.f4070q;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }
        this.f4064k.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4064k.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f4064k.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f4070q = colorStateList;
        if (this.f4069p != null && (drawable = this.f4072s) != null) {
            a.b.h(drawable, colorStateList);
            this.f4072s.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        Drawable b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            Context context = getContext();
            Object obj = y0.a.f30807a;
            b10 = a.c.b(context, i10);
        }
        setItemBackground(b10);
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f4056c != i10) {
            this.f4056c = i10;
            h hVar = this.f4069p;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f4055b != i10) {
            this.f4055b = i10;
            h hVar = this.f4069p;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.f4068o = i10;
    }

    public void setLabelVisibilityMode(int i10) {
        boolean z10;
        c cVar;
        if (this.f4060g != i10) {
            this.f4060g = i10;
            if (this.f4079z && i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar = E;
            } else {
                cVar = D;
            }
            this.f4074u = cVar;
            g(getWidth());
            h hVar = this.f4069p;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.f4061h != z10) {
            this.f4061h = z10;
            h hVar = this.f4069p;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) {
        c(this.f4067n, i10);
        a(this.f4066m.getTextSize(), this.f4067n.getTextSize());
    }

    public void setTextAppearanceInactive(int i10) {
        c(this.f4066m, i10);
        a(this.f4066m.getTextSize(), this.f4067n.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f4066m.setTextColor(colorStateList);
            this.f4067n.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f4066m.setText(charSequence);
        this.f4067n.setText(charSequence);
        h hVar = this.f4069p;
        if (hVar == null || TextUtils.isEmpty(hVar.f975q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.f4069p;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f976r)) {
            charSequence = this.f4069p.f976r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            q2.a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.q(this, drawable);
    }
}
