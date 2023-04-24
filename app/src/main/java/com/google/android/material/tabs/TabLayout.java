package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.q2;
import androidx.viewpager.widget.ViewPager;
import b1.a;
import com.google.android.material.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i0;
import k1.i2;
import k1.o0;
import l1.j;
import o1.p;
import z9.r;

@ViewPager.d
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: g0 */
    public static final int f6691g0 = R.style.Widget_Design_TabLayout;

    /* renamed from: h0 */
    public static final j1.f f6692h0 = new j1.f(16);
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public com.google.android.material.tabs.a F;
    public c H;
    public final ArrayList<c> L;
    public j M;
    public ValueAnimator Q;
    public ViewPager U;
    public b3.a V;
    public e W;

    /* renamed from: a */
    public final ArrayList<g> f6693a;

    /* renamed from: b */
    public g f6694b;

    /* renamed from: c */
    public final f f6695c;

    /* renamed from: c0 */
    public h f6696c0;

    /* renamed from: d */
    public int f6697d;

    /* renamed from: d0 */
    public b f6698d0;

    /* renamed from: e */
    public int f6699e;

    /* renamed from: e0 */
    public boolean f6700e0;

    /* renamed from: f */
    public int f6701f;

    /* renamed from: f0 */
    public final j1.e f6702f0;

    /* renamed from: g */
    public int f6703g;

    /* renamed from: h */
    public int f6704h;

    /* renamed from: i */
    public ColorStateList f6705i;

    /* renamed from: j */
    public ColorStateList f6706j;

    /* renamed from: k */
    public ColorStateList f6707k;

    /* renamed from: l */
    public Drawable f6708l;

    /* renamed from: m */
    public int f6709m;

    /* renamed from: n */
    public PorterDuff.Mode f6710n;

    /* renamed from: o */
    public float f6711o;

    /* renamed from: p */
    public float f6712p;

    /* renamed from: q */
    public final int f6713q;

    /* renamed from: r */
    public int f6714r;

    /* renamed from: s */
    public final int f6715s;

    /* renamed from: t */
    public final int f6716t;

    /* renamed from: u */
    public final int f6717u;

    /* renamed from: v */
    public int f6718v;

    /* renamed from: w */
    public int f6719w;

    /* renamed from: x */
    public int f6720x;

    /* renamed from: y */
    public int f6721y;

    /* renamed from: z */
    public int f6722z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
            TabLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewPager.h {

        /* renamed from: a */
        public boolean f6724a;

        public b() {
            TabLayout.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, b3.a aVar, b3.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.U == viewPager) {
                tabLayout.m(aVar2, this.f6724a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends g> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    /* loaded from: classes.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
            TabLayout.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayout {

        /* renamed from: f */
        public static final /* synthetic */ int f6727f = 0;

        /* renamed from: a */
        public ValueAnimator f6728a;

        /* renamed from: b */
        public int f6729b;

        /* renamed from: c */
        public float f6730c;

        /* renamed from: d */
        public int f6731d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(context);
            TabLayout.this = r1;
            this.f6729b = -1;
            this.f6731d = -1;
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f6729b);
            TabLayout tabLayout = TabLayout.this;
            com.google.android.material.tabs.a aVar = tabLayout.F;
            Drawable drawable = tabLayout.f6708l;
            aVar.getClass();
            RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        }

        public final void b(int i10) {
            Rect bounds = TabLayout.this.f6708l.getBounds();
            TabLayout.this.f6708l.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            boolean z10;
            if (view != null && view.getWidth() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.F.b(tabLayout, view, view2, f10, tabLayout.f6708l);
            } else {
                Drawable drawable = TabLayout.this.f6708l;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f6708l.getBounds().bottom);
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }

        public final void d(int i10, int i11, boolean z10) {
            View childAt = getChildAt(this.f6729b);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a();
                return;
            }
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (!z10) {
                this.f6728a.removeAllUpdateListeners();
                this.f6728a.addUpdateListener(bVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6728a = valueAnimator;
            valueAnimator.setInterpolator(h9.a.f16044b);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(bVar);
            valueAnimator.addListener(new com.google.android.material.tabs.c(this, i10));
            valueAnimator.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x004f  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f6708l
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f6708l
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.f6721y
                r2 = 0
                if (r1 == 0) goto L37
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L28
                if (r1 == r4) goto L41
                r0 = 3
                if (r1 == r0) goto L3d
                r0 = 0
                goto L41
            L28:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L41
            L37:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L3d:
                int r0 = r5.getHeight()
            L41:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f6708l
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L95
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f6708l
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f6708l
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f6708l
                int r0 = r0.f6709m
                r2 = 21
                if (r0 == 0) goto L86
                android.graphics.drawable.Drawable r1 = b1.a.g(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 != r2) goto L7e
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f6709m
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                r1.setColorFilter(r0, r2)
                goto L92
            L7e:
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f6709m
                b1.a.b.g(r1, r0)
                goto L92
            L86:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                if (r0 != r2) goto L8f
                r1.setColorFilter(r3)
                goto L92
            L8f:
                b1.a.b.h(r1, r3)
            L92:
                r1.draw(r6)
            L95:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f6728a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(this.f6729b, -1, false);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f6719w == 1 || tabLayout.f6722z == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) r.b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f6719w = 0;
                    tabLayout2.p(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f6731d == i10) {
                return;
            }
            requestLayout();
            this.f6731d = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        public Drawable f6733a;

        /* renamed from: b */
        public CharSequence f6734b;

        /* renamed from: c */
        public CharSequence f6735c;

        /* renamed from: e */
        public View f6737e;

        /* renamed from: g */
        public TabLayout f6739g;

        /* renamed from: h */
        public i f6740h;

        /* renamed from: d */
        public int f6736d = -1;

        /* renamed from: f */
        public int f6738f = 1;

        /* renamed from: i */
        public int f6741i = -1;

        public final void a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f6735c) && !TextUtils.isEmpty(charSequence)) {
                this.f6740h.setContentDescription(charSequence);
            }
            this.f6734b = charSequence;
            i iVar = this.f6740h;
            if (iVar != null) {
                iVar.e();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements ViewPager.i {

        /* renamed from: a */
        public final WeakReference<TabLayout> f6742a;

        /* renamed from: b */
        public int f6743b;

        /* renamed from: c */
        public int f6744c;

        public h(TabLayout tabLayout) {
            this.f6742a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f10, int i10) {
            TabLayout tabLayout = this.f6742a.get();
            if (tabLayout != null) {
                int i11 = this.f6744c;
                boolean z10 = false;
                tabLayout.n(i10, f10, i11 != 2 || this.f6743b == 1, (i11 == 2 && this.f6743b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i10) {
            this.f6743b = this.f6744c;
            this.f6744c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i10) {
            TabLayout tabLayout = this.f6742a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f6744c;
            tabLayout.l(tabLayout.h(i10), i11 == 0 || (i11 == 2 && this.f6743b == 0));
        }
    }

    /* loaded from: classes.dex */
    public final class i extends LinearLayout {

        /* renamed from: l */
        public static final /* synthetic */ int f6745l = 0;

        /* renamed from: a */
        public g f6746a;

        /* renamed from: b */
        public TextView f6747b;

        /* renamed from: c */
        public ImageView f6748c;

        /* renamed from: d */
        public View f6749d;

        /* renamed from: e */
        public j9.a f6750e;

        /* renamed from: f */
        public View f6751f;

        /* renamed from: g */
        public TextView f6752g;

        /* renamed from: h */
        public ImageView f6753h;

        /* renamed from: i */
        public Drawable f6754i;

        /* renamed from: j */
        public int f6755j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(context);
            i0 i0Var;
            TabLayout.this = r5;
            this.f6755j = 2;
            f(context);
            int i10 = r5.f6697d;
            int i11 = r5.f6699e;
            int i12 = r5.f6701f;
            int i13 = r5.f6703g;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.e.k(this, i10, i11, i12, i13);
            setGravity(17);
            setOrientation(!r5.A ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                i0Var = new i0(i0.a.b(context2, 1002));
            } else {
                i0Var = new i0(null);
            }
            o0.s(this, i0Var);
        }

        private j9.a getBadge() {
            return this.f6750e;
        }

        private j9.a getOrCreateBadge() {
            if (this.f6750e == null) {
                this.f6750e = new j9.a(getContext(), null);
            }
            c();
            j9.a aVar = this.f6750e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a(View view) {
            boolean z10;
            if (this.f6750e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                j9.a aVar = this.f6750e;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(view, null);
                if (aVar.d() != null) {
                    aVar.d().setForeground(aVar);
                } else {
                    view.getOverlay().add(aVar);
                }
                this.f6749d = view;
            }
        }

        public final void b() {
            boolean z10;
            if (this.f6750e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f6749d;
            if (view != null) {
                j9.a aVar = this.f6750e;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
                this.f6749d = null;
            }
        }

        public final void c() {
            boolean z10;
            g gVar;
            View view;
            g gVar2;
            if (this.f6750e != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            if (this.f6751f == null) {
                View view2 = this.f6748c;
                if (view2 != null && (gVar2 = this.f6746a) != null && gVar2.f6733a != null) {
                    if (this.f6749d != view2) {
                        b();
                        view = this.f6748c;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
                view2 = this.f6747b;
                if (view2 != null && (gVar = this.f6746a) != null && gVar.f6738f == 1) {
                    if (this.f6749d != view2) {
                        b();
                        view = this.f6747b;
                        a(view);
                        return;
                    }
                    d(view2);
                    return;
                }
            }
            b();
        }

        public final void d(View view) {
            boolean z10;
            j9.a aVar = this.f6750e;
            if (aVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && view == this.f6749d) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.h(view, null);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f6754i;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f6754i.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            View view;
            boolean z10;
            g gVar = this.f6746a;
            ImageView imageView = null;
            if (gVar != null) {
                view = gVar.f6737e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f6751f = view;
                TextView textView = this.f6747b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView2 = this.f6748c;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f6748c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f6752g = textView2;
                if (textView2 != null) {
                    this.f6755j = p.a.b(textView2);
                }
                imageView = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f6751f;
                if (view2 != null) {
                    removeView(view2);
                    this.f6751f = null;
                }
                this.f6752g = null;
            }
            this.f6753h = imageView;
            boolean z11 = false;
            if (this.f6751f == null) {
                if (this.f6748c == null) {
                    ImageView imageView3 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f6748c = imageView3;
                    addView(imageView3, 0);
                }
                if (this.f6747b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f6747b = textView3;
                    addView(textView3);
                    this.f6755j = p.a.b(this.f6747b);
                }
                p.e(this.f6747b, TabLayout.this.f6704h);
                ColorStateList colorStateList = TabLayout.this.f6705i;
                if (colorStateList != null) {
                    this.f6747b.setTextColor(colorStateList);
                }
                g(this.f6747b, this.f6748c);
                c();
                ImageView imageView4 = this.f6748c;
                if (imageView4 != null) {
                    imageView4.addOnLayoutChangeListener(new com.google.android.material.tabs.d(this, imageView4));
                }
                TextView textView4 = this.f6747b;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new com.google.android.material.tabs.d(this, textView4));
                }
            } else {
                TextView textView5 = this.f6752g;
                if (textView5 != null || imageView != null) {
                    g(textView5, imageView);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f6735c)) {
                setContentDescription(gVar.f6735c);
            }
            if (gVar != null) {
                TabLayout tabLayout = gVar.f6739g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition != -1 && selectedTabPosition == gVar.f6736d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        public final void f(Context context) {
            int i10 = TabLayout.this.f6713q;
            GradientDrawable gradientDrawable = null;
            if (i10 != 0) {
                Drawable b10 = g.a.b(context, i10);
                this.f6754i = b10;
                if (b10 != null && b10.isStateful()) {
                    this.f6754i.setState(getDrawableState());
                }
            } else {
                this.f6754i = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f6707k != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a10 = ea.b.a(TabLayout.this.f6707k);
                boolean z10 = TabLayout.this.E;
                if (z10) {
                    gradientDrawable2 = null;
                }
                if (!z10) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a10, gradientDrawable2, gradientDrawable);
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.q(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        public final void g(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i10;
            Drawable drawable2;
            g gVar = this.f6746a;
            CharSequence charSequence2 = null;
            if (gVar != null && (drawable2 = gVar.f6733a) != null) {
                drawable = b1.a.g(drawable2).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                a.b.h(drawable, TabLayout.this.f6706j);
                PorterDuff.Mode mode = TabLayout.this.f6710n;
                if (mode != null) {
                    a.b.i(drawable, mode);
                }
            }
            g gVar2 = this.f6746a;
            if (gVar2 != null) {
                charSequence = gVar2.f6734b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z10) {
                    textView.setText(charSequence);
                    if (this.f6746a.f6738f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z10 && imageView.getVisibility() == 0) {
                    i10 = (int) r.b(getContext(), 8);
                } else {
                    i10 = 0;
                }
                if (TabLayout.this.A) {
                    if (i10 != k1.h.b(marginLayoutParams)) {
                        k1.h.g(marginLayoutParams, i10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i10;
                    k1.h.g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f6746a;
            if (gVar3 != null) {
                charSequence2 = gVar3.f6735c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z10) {
                    charSequence = charSequence2;
                }
                q2.a(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f6747b, this.f6748c, this.f6751f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f6747b, this.f6748c, this.f6751f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f6746a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            j9.a aVar = this.f6750e;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f6750e.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j.c.a(0, 1, this.f6746a.f6736d, 1, isSelected()).f18686a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) j.a.f18673e.f18681a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0094, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L28;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L1e
                if (r1 == 0) goto L14
                if (r0 <= r2) goto L1e
            L14:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.f6714r
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L1e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f6747b
                if (r0 == 0) goto La6
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f6711o
                int r1 = r7.f6755j
                android.widget.ImageView r2 = r7.f6748c
                r3 = 1
                if (r2 == 0) goto L38
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L38
                r1 = 1
                goto L46
            L38:
                android.widget.TextView r2 = r7.f6747b
                if (r2 == 0) goto L46
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L46
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f6712p
            L46:
                android.widget.TextView r2 = r7.f6747b
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f6747b
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f6747b
                int r5 = o1.p.a.b(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L60
                if (r5 < 0) goto La6
                if (r1 == r5) goto La6
            L60:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.f6722z
                r6 = 0
                if (r5 != r3) goto L97
                if (r2 <= 0) goto L97
                if (r4 != r3) goto L97
                android.widget.TextView r2 = r7.f6747b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L96
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L97
            L96:
                r3 = 0
            L97:
                if (r3 == 0) goto La6
                android.widget.TextView r2 = r7.f6747b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f6747b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            La6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f6746a != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                g gVar = this.f6746a;
                TabLayout tabLayout = gVar.f6739g;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f6747b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f6748c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f6751f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f6746a) {
                this.f6746a = gVar;
                e();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j implements d {

        /* renamed from: a */
        public final ViewPager f6757a;

        public j(ViewPager viewPager) {
            this.f6757a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(g gVar) {
            this.f6757a.setCurrentItem(gVar.f6736d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(g gVar) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getDefaultHeight() {
        int size = this.f6693a.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f6693a.get(i10);
                if (gVar != null && gVar.f6733a != null && !TextUtils.isEmpty(gVar.f6734b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        if (z10 && !this.A) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f6715s;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f6722z;
        if (i11 == 0 || i11 == 2) {
            return this.f6717u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f6695c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f6695c.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f6695c.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        if (this.L.contains(cVar)) {
            return;
        }
        this.L.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public final void b(g gVar, boolean z10) {
        float f10;
        int size = this.f6693a.size();
        if (gVar.f6739g == this) {
            gVar.f6736d = size;
            this.f6693a.add(size, gVar);
            int size2 = this.f6693a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.f6693a.get(size).f6736d = size;
            }
            i iVar = gVar.f6740h;
            iVar.setSelected(false);
            iVar.setActivated(false);
            f fVar = this.f6695c;
            int i10 = gVar.f6736d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f6722z == 1 && this.f6719w == 0) {
                layoutParams.width = 0;
                f10 = 1.0f;
            } else {
                layoutParams.width = -2;
                f10 = 0.0f;
            }
            layoutParams.weight = f10;
            fVar.addView(iVar, i10, layoutParams);
            if (z10) {
                TabLayout tabLayout = gVar.f6739g;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            g i10 = i();
            CharSequence charSequence = tabItem.f6688a;
            if (charSequence != null) {
                i10.a(charSequence);
            }
            Drawable drawable = tabItem.f6689b;
            if (drawable != null) {
                i10.f6733a = drawable;
                TabLayout tabLayout = i10.f6739g;
                if (tabLayout.f6719w == 1 || tabLayout.f6722z == 2) {
                    tabLayout.p(true);
                }
                i iVar = i10.f6740h;
                if (iVar != null) {
                    iVar.e();
                }
            }
            int i11 = tabItem.f6690c;
            if (i11 != 0) {
                i10.f6737e = LayoutInflater.from(i10.f6740h.getContext()).inflate(i11, (ViewGroup) i10.f6740h, false);
                i iVar2 = i10.f6740h;
                if (iVar2 != null) {
                    iVar2.e();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i10.f6735c = tabItem.getContentDescription();
                i iVar3 = i10.f6740h;
                if (iVar3 != null) {
                    iVar3.e();
                }
            }
            b(i10, this.f6693a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(this)) {
                f fVar = this.f6695c;
                int childCount = fVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 < childCount) {
                        if (fVar.getChildAt(i11).getWidth() <= 0) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int f10 = f(0.0f, i10);
                    if (scrollX != f10) {
                        g();
                        this.Q.setIntValues(scrollX, f10);
                        this.Q.start();
                    }
                    f fVar2 = this.f6695c;
                    int i12 = this.f6720x;
                    ValueAnimator valueAnimator = fVar2.f6728a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar2.f6728a.cancel();
                    }
                    fVar2.d(i10, i12, true);
                    return;
                }
            }
        }
        n(i10, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003c, code lost:
        if (r0 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.f6722z
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r5.f6718v
            int r3 = r5.f6697d
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            com.google.android.material.tabs.TabLayout$f r3 = r5.f6695c
            java.util.WeakHashMap<android.view.View, k1.i2> r4 = k1.o0.f18161a
            k1.o0.e.k(r3, r0, r2, r2, r2)
            int r0 = r5.f6722z
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 == r3) goto L27
            if (r0 == r1) goto L27
            goto L50
        L27:
            int r0 = r5.f6719w
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6695c
            r0.setGravity(r3)
            goto L50
        L36:
            int r0 = r5.f6719w
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3f
            if (r0 == r1) goto L48
            goto L50
        L3f:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6695c
            r1 = 1
            goto L4d
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f6695c
            r1 = 8388611(0x800003, float:1.1754948E-38)
        L4d:
            r0.setGravity(r1)
        L50:
            r5.p(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(float f10, int i10) {
        View childAt;
        int i11 = this.f6722z;
        if ((i11 == 0 || i11 == 2) && (childAt = this.f6695c.getChildAt(i10)) != null) {
            int i12 = i10 + 1;
            View childAt2 = i12 < this.f6695c.getChildCount() ? this.f6695c.getChildAt(i12) : null;
            int width = childAt.getWidth();
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
            int i13 = (int) ((width + width2) * 0.5f * f10);
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            return o0.e.d(this) == 0 ? left + i13 : left - i13;
        }
        return 0;
    }

    public final void g() {
        if (this.Q == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.Q = valueAnimator;
            valueAnimator.setInterpolator(h9.a.f16044b);
            this.Q.setDuration(this.f6720x);
            this.Q.addUpdateListener(new a());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f6694b;
        if (gVar != null) {
            return gVar.f6736d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f6693a.size();
    }

    public int getTabGravity() {
        return this.f6719w;
    }

    public ColorStateList getTabIconTint() {
        return this.f6706j;
    }

    public int getTabIndicatorAnimationMode() {
        return this.D;
    }

    public int getTabIndicatorGravity() {
        return this.f6721y;
    }

    public int getTabMaxWidth() {
        return this.f6714r;
    }

    public int getTabMode() {
        return this.f6722z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f6707k;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f6708l;
    }

    public ColorStateList getTabTextColors() {
        return this.f6705i;
    }

    public final g h(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f6693a.get(i10);
    }

    public final g i() {
        i iVar;
        CharSequence charSequence;
        g gVar = (g) f6692h0.acquire();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f6739g = this;
        j1.e eVar = this.f6702f0;
        if (eVar != null) {
            iVar = (i) eVar.acquire();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f6735c)) {
            charSequence = gVar.f6734b;
        } else {
            charSequence = gVar.f6735c;
        }
        iVar.setContentDescription(charSequence);
        gVar.f6740h = iVar;
        int i10 = gVar.f6741i;
        if (i10 != -1) {
            iVar.setId(i10);
        }
        return gVar;
    }

    public final void j() {
        int currentItem;
        k();
        b3.a aVar = this.V;
        if (aVar != null) {
            int b10 = aVar.b();
            for (int i10 = 0; i10 < b10; i10++) {
                g i11 = i();
                this.V.getClass();
                i11.a(null);
                b(i11, false);
            }
            ViewPager viewPager = this.U;
            if (viewPager == null || b10 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            l(h(currentItem), true);
        }
    }

    public final void k() {
        for (int childCount = this.f6695c.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) this.f6695c.getChildAt(childCount);
            this.f6695c.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f6702f0.release(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f6693a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f6739g = null;
            next.f6740h = null;
            next.f6733a = null;
            next.f6741i = -1;
            next.f6734b = null;
            next.f6735c = null;
            next.f6736d = -1;
            next.f6737e = null;
            f6692h0.release(next);
        }
        this.f6694b = null;
    }

    public final void l(g gVar, boolean z10) {
        int i10;
        g gVar2 = this.f6694b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = this.L.size() - 1; size >= 0; size--) {
                    this.L.get(size).a(gVar);
                }
                d(gVar.f6736d);
                return;
            }
            return;
        }
        if (gVar != null) {
            i10 = gVar.f6736d;
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((gVar2 == null || gVar2.f6736d == -1) && i10 != -1) {
                n(i10, 0.0f, true, true);
            } else {
                d(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f6694b = gVar;
        if (gVar2 != null) {
            for (int size2 = this.L.size() - 1; size2 >= 0; size2--) {
                this.L.get(size2).c(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = this.L.size() - 1; size3 >= 0; size3--) {
                this.L.get(size3).b(gVar);
            }
        }
    }

    public final void m(b3.a aVar, boolean z10) {
        e eVar;
        b3.a aVar2 = this.V;
        if (aVar2 != null && (eVar = this.W) != null) {
            aVar2.f3994a.unregisterObserver(eVar);
        }
        this.V = aVar;
        if (z10 && aVar != null) {
            if (this.W == null) {
                this.W = new e();
            }
            aVar.f3994a.registerObserver(this.W);
        }
        j();
    }

    public final void n(int i10, float f10, boolean z10, boolean z11) {
        int f11;
        int round = Math.round(i10 + f10);
        if (round >= 0 && round < this.f6695c.getChildCount()) {
            if (z11) {
                f fVar = this.f6695c;
                ValueAnimator valueAnimator = fVar.f6728a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f6728a.cancel();
                }
                fVar.f6729b = i10;
                fVar.f6730c = f10;
                fVar.c(fVar.getChildAt(i10), fVar.getChildAt(fVar.f6729b + 1), fVar.f6730c);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            if (i10 < 0) {
                f11 = 0;
            } else {
                f11 = f(f10, i10);
            }
            scrollTo(f11, 0);
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.U;
        if (viewPager2 != null) {
            h hVar = this.f6696c0;
            if (hVar != null && (arrayList2 = viewPager2.f3488f0) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.f6698d0;
            if (bVar != null && (arrayList = this.U.f3492h0) != null) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.M;
        if (jVar != null) {
            this.L.remove(jVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.U = viewPager;
            if (this.f6696c0 == null) {
                this.f6696c0 = new h(this);
            }
            h hVar2 = this.f6696c0;
            hVar2.f6744c = 0;
            hVar2.f6743b = 0;
            if (viewPager.f3488f0 == null) {
                viewPager.f3488f0 = new ArrayList();
            }
            viewPager.f3488f0.add(hVar2);
            j jVar2 = new j(viewPager);
            this.M = jVar2;
            a(jVar2);
            b3.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.f6698d0 == null) {
                this.f6698d0 = new b();
            }
            b bVar2 = this.f6698d0;
            bVar2.f6724a = true;
            if (viewPager.f3492h0 == null) {
                viewPager.f3492h0 = new ArrayList();
            }
            viewPager.f3492h0.add(bVar2);
            n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.U = null;
            m(null, false);
        }
        this.f6700e0 = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.y(this);
        if (this.U == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6700e0) {
            setupWithViewPager(null);
            this.f6700e0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        for (int i10 = 0; i10 < this.f6695c.getChildCount(); i10++) {
            View childAt = this.f6695c.getChildAt(i10);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).f6754i) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.f6754i.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(1, getTabCount(), 1).f18685a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (getTabMode() != 0 && getTabMode() != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0073, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = z9.r.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f6716t
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = z9.r.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f6714r = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f6722z
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() != 0 && getTabMode() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10) {
        float f10;
        for (int i10 = 0; i10 < this.f6695c.getChildCount(); i10++) {
            View childAt = this.f6695c.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f6722z == 1 && this.f6719w == 0) {
                layoutParams.width = 0;
                f10 = 1.0f;
            } else {
                layoutParams.width = -2;
                f10 = 0.0f;
            }
            layoutParams.weight = f10;
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.b.x(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        ImageView imageView;
        if (this.A != z10) {
            this.A = z10;
            for (int i10 = 0; i10 < this.f6695c.getChildCount(); i10++) {
                View childAt = this.f6695c.getChildAt(i10);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    iVar.setOrientation(!TabLayout.this.A ? 1 : 0);
                    TextView textView = iVar.f6752g;
                    if (textView == null && iVar.f6753h == null) {
                        textView = iVar.f6747b;
                        imageView = iVar.f6748c;
                    } else {
                        imageView = iVar.f6753h;
                    }
                    iVar.g(textView, imageView);
                }
            }
            e();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.H;
        if (cVar2 != null) {
            this.L.remove(cVar2);
        }
        this.H = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.Q.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i10) {
        setSelectedTabIndicator(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f6708l != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f6708l = drawable;
            int i10 = this.C;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f6695c.b(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f6709m = i10;
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f6721y != i10) {
            this.f6721y = i10;
            f fVar = this.f6695c;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.C = i10;
        this.f6695c.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f6719w != i10) {
            this.f6719w = i10;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f6706j != colorStateList) {
            this.f6706j = colorStateList;
            int size = this.f6693a.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = this.f6693a.get(i10).f6740h;
                if (iVar != null) {
                    iVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(g.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        com.google.android.material.tabs.a aVar;
        this.D = i10;
        if (i10 == 0) {
            aVar = new com.google.android.material.tabs.a();
        } else if (i10 == 1) {
            aVar = new ja.a();
        } else if (i10 != 2) {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        } else {
            aVar = new ja.b();
        }
        this.F = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.B = z10;
        f fVar = this.f6695c;
        int i10 = f.f6727f;
        fVar.a();
        f fVar2 = this.f6695c;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.k(fVar2);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f6722z) {
            this.f6722z = i10;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f6707k != colorStateList) {
            this.f6707k = colorStateList;
            for (int i10 = 0; i10 < this.f6695c.getChildCount(); i10++) {
                View childAt = this.f6695c.getChildAt(i10);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i11 = i.f6745l;
                    ((i) childAt).f(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(g.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f6705i != colorStateList) {
            this.f6705i = colorStateList;
            int size = this.f6693a.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = this.f6693a.get(i10).f6740h;
                if (iVar != null) {
                    iVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(b3.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            for (int i10 = 0; i10 < this.f6695c.getChildCount(); i10++) {
                View childAt = this.f6695c.getChildAt(i10);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i11 = i.f6745l;
                    ((i) childAt).f(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
