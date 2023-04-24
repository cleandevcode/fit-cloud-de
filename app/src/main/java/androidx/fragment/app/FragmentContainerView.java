package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Iterator;
import k1.n2;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public final ArrayList f2298a;

    /* renamed from: b */
    public final ArrayList f2299b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f2300c;

    /* renamed from: d */
    public boolean f2301d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f2298a = new ArrayList();
        this.f2299b = new ArrayList();
        this.f2301d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        gm.l.f(context, "context");
        this.f2298a = new ArrayList();
        this.f2299b = new ArrayList();
        this.f2301d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = R.styleable.FragmentContainerView;
            gm.l.e(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f2299b.contains(view)) {
            this.f2298a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        r rVar;
        gm.l.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof r) {
            rVar = (r) tag;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        n2 k10;
        gm.l.f(windowInsets, "insets");
        n2 i10 = n2.i(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2300c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            gm.l.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            k10 = n2.i(onApplyWindowInsets, null);
        } else {
            k10 = k1.o0.k(this, i10);
        }
        gm.l.e(k10, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!k10.f18130a.m()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                k1.o0.b(getChildAt(i11), k10);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gm.l.f(canvas, "canvas");
        if (this.f2301d) {
            Iterator it = this.f2298a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gm.l.f(canvas, "canvas");
        gm.l.f(view, "child");
        if (this.f2301d && (!this.f2298a.isEmpty()) && this.f2298a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        gm.l.f(view, "view");
        this.f2299b.remove(view);
        if (this.f2298a.remove(view)) {
            this.f2301d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public final <F extends r> F getFragment() {
        r rVar;
        j0 J;
        x xVar = null;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof r) {
                    rVar = (r) tag;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (rVar.t0()) {
                J = rVar.h0();
            } else {
                throw new IllegalStateException("The Fragment " + rVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof x) {
                    xVar = (x) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (xVar != null) {
                J = xVar.J();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) J.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        gm.l.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            gm.l.e(childAt, "view");
            a(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        gm.l.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        gm.l.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        gm.l.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            gm.l.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            gm.l.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f2301d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        gm.l.f(onApplyWindowInsetsListener, "listener");
        this.f2300c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        gm.l.f(view, "view");
        if (view.getParent() == this) {
            this.f2299b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, j0 j0Var) {
        super(context, attributeSet);
        View view;
        gm.l.f(context, "context");
        gm.l.f(attributeSet, "attrs");
        gm.l.f(j0Var, "fm");
        this.f2298a = new ArrayList();
        this.f2299b = new ArrayList();
        this.f2301d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R.styleable.FragmentContainerView;
        gm.l.e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        r D = j0Var.D(id2);
        if (classAttribute != null && D == null) {
            if (id2 == -1) {
                throw new IllegalStateException(android.support.v4.media.a.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a.b.b(" with tag ", string) : ""));
            }
            c0 G = j0Var.G();
            context.getClassLoader();
            r a10 = G.a(classAttribute);
            gm.l.e(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.H0(context, attributeSet, null);
            a aVar = new a(j0Var);
            aVar.f2578p = true;
            a10.F = this;
            aVar.g(getId(), a10, string, 1);
            if (!aVar.f2569g) {
                aVar.f2570h = false;
                aVar.f2306q.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = j0Var.f2395c.d().iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            r rVar = q0Var.f2503c;
            if (rVar.f2539x == getId() && (view = rVar.H) != null && view.getParent() == null) {
                rVar.F = this;
                q0Var.b();
            }
        }
    }
}
