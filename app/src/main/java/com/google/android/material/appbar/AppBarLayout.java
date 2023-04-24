package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import i9.g;
import i9.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.n2;
import k1.o0;
import k1.z;
import l1.j;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: t */
    public static final int f6158t = R.style.Widget_Design_AppBarLayout;

    /* renamed from: a */
    public int f6159a;

    /* renamed from: b */
    public int f6160b;

    /* renamed from: c */
    public int f6161c;

    /* renamed from: d */
    public int f6162d;

    /* renamed from: e */
    public boolean f6163e;

    /* renamed from: f */
    public int f6164f;

    /* renamed from: g */
    public n2 f6165g;

    /* renamed from: h */
    public ArrayList f6166h;

    /* renamed from: i */
    public boolean f6167i;

    /* renamed from: j */
    public boolean f6168j;

    /* renamed from: k */
    public boolean f6169k;

    /* renamed from: l */
    public boolean f6170l;

    /* renamed from: m */
    public int f6171m;

    /* renamed from: n */
    public WeakReference<View> f6172n;

    /* renamed from: o */
    public ValueAnimator f6173o;

    /* renamed from: p */
    public final ArrayList f6174p;

    /* renamed from: q */
    public int[] f6175q;

    /* renamed from: r */
    public Drawable f6176r;

    /* renamed from: s */
    public Behavior f6177s;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends i9.f<T> {

        /* renamed from: j */
        public int f6178j;

        /* renamed from: k */
        public int f6179k;

        /* renamed from: l */
        public ValueAnimator f6180l;

        /* renamed from: m */
        public b f6181m;

        /* renamed from: n */
        public WeakReference<View> f6182n;

        /* renamed from: o */
        public boolean f6183o;

        /* loaded from: classes.dex */
        public class a extends k1.a {
            public a() {
                BaseBehavior.this = r1;
            }

            @Override // k1.a
            public final void d(View view, j jVar) {
                this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
                jVar.k(BaseBehavior.this.f6183o);
                jVar.g(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public static class b extends q1.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c */
            public boolean f6185c;

            /* renamed from: d */
            public boolean f6186d;

            /* renamed from: e */
            public int f6187e;

            /* renamed from: f */
            public float f6188f;

            /* renamed from: g */
            public boolean f6189g;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i10) {
                    return new b[i10];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f6185c = parcel.readByte() != 0;
                this.f6186d = parcel.readByte() != 0;
                this.f6187e = parcel.readInt();
                this.f6188f = parcel.readFloat();
                this.f6189g = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // q1.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f24504a, i10);
                parcel.writeByte(this.f6185c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f6186d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f6187e);
                parcel.writeFloat(this.f6188f);
                parcel.writeByte(this.f6189g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof z) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:83:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void H(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$d r1 = (com.google.android.material.appbar.AppBarLayout.d) r1
                int r1 = r1.f6192a
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                java.util.WeakHashMap<android.view.View, k1.i2> r3 = k1.o0.f18161a
                int r3 = k1.o0.d.d(r4)
                if (r9 <= 0) goto L4a
                r9 = r1 & 12
                if (r9 == 0) goto L4a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
                goto L5b
            L4a:
                r9 = r1 & 2
                if (r9 == 0) goto L5d
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                int r1 = r7.getTopInset()
                int r9 = r9 - r1
                if (r8 < r9) goto L5d
            L5b:
                r8 = 1
                goto L5e
            L5d:
                r8 = 0
            L5e:
                boolean r9 = r7.f6170l
                if (r9 == 0) goto L6a
                android.view.View r8 = C(r6)
                boolean r8 = r7.g(r8)
            L6a:
                boolean r8 = r7.f(r8)
                if (r10 != 0) goto L9c
                if (r8 == 0) goto L9f
                java.util.ArrayList r6 = r6.g(r7)
                int r8 = r6.size()
                r9 = 0
            L7b:
                if (r9 >= r8) goto L9a
                java.lang.Object r10 = r6.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f2159a
                boolean r1 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r6 = r10.f16751f
                if (r6 == 0) goto L9a
                r2 = 1
                goto L9a
            L97:
                int r9 = r9 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r7.jumpDrawablesToCurrentState()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.H(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(x() - i10);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int x10 = x();
            if (x10 == i10) {
                ValueAnimator valueAnimator = this.f6180l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f6180l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f6180l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6180l = valueAnimator3;
                valueAnimator3.setInterpolator(h9.a.f16047e);
                this.f6180l.addUpdateListener(new com.google.android.material.appbar.b(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f6180l.setDuration(Math.min(round, 600));
            this.f6180l.setIntValues(x10, i10);
            this.f6180l.start();
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i13 = -appBarLayout.getTotalScrollRange();
                    i11 = i13;
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                if (i11 != i12) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i10, i11, i12);
                }
            }
            if (appBarLayout.f6170l) {
                appBarLayout.f(appBarLayout.g(view));
            }
        }

        public final b E(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = q1.a.f24503b;
                    }
                    b bVar = new b(parcelable);
                    if (s10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f6186d = z10;
                    if (!z10 && (-s10) >= t10.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f6185c = z11;
                    bVar.f6187e = i10;
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    if (bottom == t10.getTopInset() + o0.d.d(childAt)) {
                        z12 = true;
                    }
                    bVar.f6189g = z12;
                    bVar.f6188f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int x10 = x() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 < childCount) {
                    View childAt = t10.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    d dVar = (d) childAt.getLayoutParams();
                    if ((dVar.f6192a & 32) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    int i11 = -x10;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i12 = dVar2.f6192a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                        if (o0.d.b(t10) && o0.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                        i14 += o0.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, i2> weakHashMap3 = o0.f18161a;
                            int d10 = o0.d.d(childAt2) + i14;
                            if (x10 < d10) {
                                i13 = d10;
                            } else {
                                i14 = d10;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i13 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (x10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t10, b0.c.k(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            o0.m(coordinatorLayout, j.a.f18674f.a());
            boolean z13 = false;
            o0.h(coordinatorLayout, 0);
            o0.m(coordinatorLayout, j.a.f18675g.a());
            o0.h(coordinatorLayout, 0);
            if (t10.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                view = null;
                if (i10 >= childCount) {
                    break;
                }
                view = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) view.getLayoutParams()).f2159a instanceof ScrollingViewBehavior) {
                    break;
                }
                i10++;
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t10.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 < childCount2) {
                    if (((d) t10.getChildAt(i11).getLayoutParams()).f6192a != 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return;
            }
            if (o0.d(coordinatorLayout) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                o0.p(coordinatorLayout, new a());
            }
            if (x() != (-t10.getTotalScrollRange())) {
                o0.n(coordinatorLayout, j.a.f18674f, new com.google.android.material.appbar.d(t10, false));
                z13 = true;
            }
            if (x() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i12 = -t10.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        o0.n(coordinatorLayout, j.a.f18675g, new com.google.android.material.appbar.c(this, coordinatorLayout, t10, view2, i12));
                    }
                } else {
                    o0.n(coordinatorLayout, j.a.f18675g, new com.google.android.material.appbar.d(t10, true));
                }
                this.f6183o = z10;
            }
            z10 = z13;
            this.f6183o = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i9.h, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int i11;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f6181m;
            if (bVar != null && (pendingAction & 8) == 0) {
                if (bVar.f6185c) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    A(coordinatorLayout, appBarLayout, i11);
                } else {
                    if (!bVar.f6186d) {
                        View childAt = appBarLayout.getChildAt(bVar.f6187e);
                        int i12 = -childAt.getBottom();
                        if (this.f6181m.f6189g) {
                            round = appBarLayout.getTopInset() + o0.d.d(childAt) + i12;
                        } else {
                            round = Math.round(childAt.getHeight() * this.f6181m.f6188f) + i12;
                        }
                        A(coordinatorLayout, appBarLayout, round);
                    }
                    A(coordinatorLayout, appBarLayout, 0);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, i11);
                    }
                    A(coordinatorLayout, appBarLayout, i11);
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                    A(coordinatorLayout, appBarLayout, 0);
                }
            }
            appBarLayout.f6164f = 0;
            this.f6181m = null;
            int k10 = b0.c.k(s(), -appBarLayout.getTotalScrollRange(), 0);
            i iVar = this.f16752a;
            if (iVar != null) {
                iVar.b(k10);
            } else {
                this.f16753b = k10;
            }
            H(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.d(s());
            G(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.t(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                G(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.f6181m;
                this.f6181m = (b) parcelable;
                return;
            }
            this.f6181m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b E = E(absSavedState, (AppBarLayout) view);
            if (E != null) {
                return E;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f6170l
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = 0
            L2d:
                if (r6 == 0) goto L36
                android.animation.ValueAnimator r2 = r1.f6180l
                if (r2 == 0) goto L36
                r2.cancel()
            L36:
                r2 = 0
                r1.f6182n = r2
                r1.f6179k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f6179k == 0 || i10 == 1) {
                F(coordinatorLayout, appBarLayout);
                if (appBarLayout.f6170l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f6182n = new WeakReference<>(view2);
        }

        @Override // i9.f
        public final boolean u(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f6182n;
            return weakReference == null || !((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1));
        }

        @Override // i9.f
        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // i9.f
        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // i9.f
        public final int x() {
            return s() + this.f6178j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i9.f
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            F(coordinatorLayout, appBarLayout);
            if (appBarLayout.f6170l) {
                appBarLayout.f(appBarLayout.g(C(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i9.f
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            boolean z10;
            int i14;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int x10 = x();
            int i15 = 0;
            if (i11 != 0 && x10 >= i11 && x10 <= i12) {
                int k10 = b0.c.k(i10, i11, i12);
                if (x10 != k10) {
                    if (appBarLayout.f6163e) {
                        int abs = Math.abs(k10);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.f6194c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i17 = dVar.f6192a;
                                    if ((i17 & 1) != 0) {
                                        i14 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + 0;
                                        if ((i17 & 2) != 0) {
                                            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                                            i14 -= o0.d.d(childAt);
                                        }
                                    } else {
                                        i14 = 0;
                                    }
                                    WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                                    if (o0.d.b(childAt)) {
                                        i14 -= appBarLayout.getTopInset();
                                    }
                                    if (i14 > 0) {
                                        float f10 = i14;
                                        i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(k10);
                                    }
                                }
                            } else {
                                i16++;
                            }
                        }
                    }
                    i13 = k10;
                    i iVar = this.f16752a;
                    if (iVar != null) {
                        z10 = iVar.b(i13);
                    } else {
                        this.f16753b = i13;
                        z10 = false;
                    }
                    int i18 = x10 - k10;
                    this.f6178j = k10 - i13;
                    int i19 = 1;
                    if (z10) {
                        for (int i20 = 0; i20 < appBarLayout.getChildCount(); i20++) {
                            d dVar2 = (d) appBarLayout.getChildAt(i20).getLayoutParams();
                            b bVar = dVar2.f6193b;
                            if (bVar != null && (dVar2.f6192a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i20);
                                c cVar = (c) bVar;
                                Rect rect = cVar.f6190a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = cVar.f6190a.top - Math.abs(s());
                                float f11 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / cVar.f6190a.height());
                                    if (abs3 >= 0.0f) {
                                        if (abs3 > 1.0f) {
                                            f11 = 1.0f;
                                        } else {
                                            f11 = abs3;
                                        }
                                    }
                                    float f12 = 1.0f - f11;
                                    float height = (-abs2) - ((cVar.f6190a.height() * 0.3f) * (1.0f - (f12 * f12)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(cVar.f6191b);
                                    cVar.f6191b.offset(0, (int) (-height));
                                    Rect rect2 = cVar.f6191b;
                                    WeakHashMap<View, i2> weakHashMap3 = o0.f18161a;
                                    o0.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, i2> weakHashMap4 = o0.f18161a;
                                    o0.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!z10 && appBarLayout.f6163e) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.d(s());
                    if (k10 < x10) {
                        i19 = -1;
                    }
                    H(coordinatorLayout, appBarLayout, k10, i19, false);
                    i15 = i18;
                }
            } else {
                this.f6178j = 0;
            }
            G(coordinatorLayout, appBarLayout);
            return i15;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollingViewBehavior_Layout);
            this.f16751f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int k10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f2159a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f6178j + this.f16750e;
                if (this.f16751f == 0) {
                    k10 = 0;
                } else {
                    float v10 = v(view2);
                    int i10 = this.f16751f;
                    k10 = b0.c.k((int) (v10 * i10), 0, i10);
                }
                o0.j(view, bottom - k10);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f6170l) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                o0.m(coordinatorLayout, j.a.f18674f.a());
                o0.h(coordinatorLayout, 0);
                o0.m(coordinatorLayout, j.a.f18675g.a());
                o0.h(coordinatorLayout, 0);
                o0.p(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    View view2 = (View) f10.get(i10);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i10++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f16748c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayout.e(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // i9.g
        public final AppBarLayout u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // i9.g
        public final float v(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f2159a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).x();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i10 / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // i9.g
        public final int w(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }
    }

    /* loaded from: classes.dex */
    public interface a<T extends AppBarLayout> {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a */
        public final Rect f6190a = new Rect();

        /* renamed from: b */
        public final Rect f6191b = new Rect();
    }

    /* loaded from: classes.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f6192a;

        /* renamed from: b */
        public b f6193b;

        /* renamed from: c */
        public Interpolator f6194c;

        public d() {
            super(-1, -2);
            this.f6192a = 1;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6192a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppBarLayout_Layout);
            this.f6192a = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            this.f6193b = obtainStyledAttributes.getInt(R.styleable.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new c();
            int i10 = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f6194c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6192a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6192a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6192a = 1;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes.dex */
    public interface f extends a<AppBarLayout> {
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            int r6 = com.google.android.material.R.attr.appBarLayoutStyle
            int r7 = com.google.android.material.appbar.AppBarLayout.f6158t
            android.content.Context r13 = la.a.a(r13, r14, r6, r7)
            r12.<init>(r13, r14, r6)
            r13 = -1
            r12.f6160b = r13
            r12.f6161c = r13
            r12.f6162d = r13
            r8 = 0
            r12.f6164f = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f6174p = r0
            android.content.Context r9 = r12.getContext()
            r0 = 1
            r12.setOrientation(r0)
            int r10 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r12.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L33
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r12.setOutlineProvider(r0)
        L33:
            android.content.Context r11 = r12.getContext()
            int[] r2 = i9.j.f16758a
            int[] r5 = new int[r8]
            r0 = r11
            r1 = r14
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r0 = z9.o.d(r0, r1, r2, r3, r4, r5)
            boolean r1 = r0.hasValue(r8)     // Catch: java.lang.Throwable -> Lf8
            if (r1 == 0) goto L54
            int r1 = r0.getResourceId(r8, r8)     // Catch: java.lang.Throwable -> Lf8
            android.animation.StateListAnimator r1 = android.animation.AnimatorInflater.loadStateListAnimator(r11, r1)     // Catch: java.lang.Throwable -> Lf8
            r12.setStateListAnimator(r1)     // Catch: java.lang.Throwable -> Lf8
        L54:
            r0.recycle()
            int[] r2 = com.google.android.material.R.styleable.AppBarLayout
            int[] r5 = new int[r8]
            r0 = r9
            r1 = r14
            r3 = r6
            r4 = r7
            android.content.res.TypedArray r14 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            java.util.WeakHashMap<android.view.View, k1.i2> r1 = k1.o0.f18161a
            k1.o0.d.q(r12, r0)
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L92
            android.graphics.drawable.Drawable r0 = r12.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            ga.f r1 = new ga.f
            r1.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            r1.i(r9)
            k1.o0.d.q(r12, r1)
        L92:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_expanded
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto La1
            boolean r0 = r14.getBoolean(r0, r8)
            r12.e(r0, r8, r8)
        La1:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_elevation
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto Lb1
            int r0 = r14.getDimensionPixelSize(r0, r8)
            float r0 = (float) r0
            i9.j.a(r12, r0)
        Lb1:
            r0 = 26
            if (r10 < r0) goto Ld3
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto Lc4
            boolean r0 = r14.getBoolean(r0, r8)
            r12.setKeyboardNavigationCluster(r0)
        Lc4:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r1 = r14.hasValue(r0)
            if (r1 == 0) goto Ld3
            boolean r0 = r14.getBoolean(r0, r8)
            r12.setTouchscreenBlocksFocus(r0)
        Ld3:
            int r0 = com.google.android.material.R.styleable.AppBarLayout_liftOnScroll
            boolean r0 = r14.getBoolean(r0, r8)
            r12.f6170l = r0
            int r0 = com.google.android.material.R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r13 = r14.getResourceId(r0, r13)
            r12.f6171m = r13
            int r13 = com.google.android.material.R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r13)
            r12.setStatusBarForeground(r13)
            r14.recycle()
            i9.a r13 = new i9.a
            r13.<init>(r12)
            k1.o0.i.u(r12, r13)
            return
        Lf8:
            r13 = move-exception
            r0.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static d b(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public final void a(f fVar) {
        if (this.f6166h == null) {
            this.f6166h = new ArrayList();
        }
        if (fVar == null || this.f6166h.contains(fVar)) {
            return;
        }
        this.f6166h.add(fVar);
    }

    public final void c() {
        BaseBehavior.b bVar;
        Behavior behavior = this.f6177s;
        if (behavior != null && this.f6160b != -1 && this.f6164f == 0) {
            bVar = behavior.E(q1.a.f24503b, this);
        } else {
            bVar = null;
        }
        this.f6160b = -1;
        this.f6161c = -1;
        this.f6162d = -1;
        if (bVar != null) {
            Behavior behavior2 = this.f6177s;
            if (behavior2.f6181m == null) {
                behavior2.f6181m = bVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(int i10) {
        this.f6159a = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }
        ArrayList arrayList = this.f6166h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f6166h.get(i11);
                if (aVar != null) {
                    aVar.a(i10);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.f6176r != null && getTopInset() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f6159a);
            this.f6176r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6176r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        this.f6164f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z10) {
        float f10;
        if ((!this.f6167i) && this.f6169k != z10) {
            this.f6169k = z10;
            refreshDrawableState();
            if (!this.f6170l || !(getBackground() instanceof ga.f)) {
                return true;
            }
            ga.f fVar = (ga.f) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = dimension;
            }
            if (!z10) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f6173o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
            this.f6173o = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f6173o.setInterpolator(h9.a.f16043a);
            this.f6173o.addUpdateListener(new com.google.android.material.appbar.a(this, fVar));
            this.f6173o.start();
            return true;
        }
        return false;
    }

    public final boolean g(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f6172n == null && (i10 = this.f6171m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f6171m);
            }
            if (view2 != null) {
                this.f6172n = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f6172n;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f6177s = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f6161c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L60
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$d r4 = (com.google.android.material.appbar.AppBarLayout.d) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f6192a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L5a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L36
            java.util.WeakHashMap<android.view.View, k1.i2> r4 = k1.o0.f18161a
            int r4 = k1.o0.d.d(r3)
        L34:
            int r4 = r4 + r7
            goto L45
        L36:
            r4 = r6 & 2
            if (r4 == 0) goto L43
            java.util.WeakHashMap<android.view.View, k1.i2> r4 = k1.o0.f18161a
            int r4 = k1.o0.d.d(r3)
            int r4 = r5 - r4
            goto L34
        L43:
            int r4 = r7 + r5
        L45:
            if (r0 != 0) goto L58
            java.util.WeakHashMap<android.view.View, k1.i2> r6 = k1.o0.f18161a
            boolean r3 = k1.o0.d.b(r3)
            if (r3 == 0) goto L58
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L58:
            int r2 = r2 + r4
            goto L5d
        L5a:
            if (r2 <= 0) goto L5d
            goto L60
        L5d:
            int r0 = r0 + (-1)
            goto Le
        L60:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f6161c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f6162d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
            int i13 = dVar.f6192a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                i12 -= o0.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6162d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6171m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int d10 = o0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = o0.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f6164f;
    }

    public Drawable getStatusBarForeground() {
        return this.f6176r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        n2 n2Var = this.f6165g;
        if (n2Var != null) {
            return n2Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f6160b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = dVar.f6192a;
            if ((i13 & 1) == 0) {
                break;
            }
            int i14 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i12;
            if (i11 == 0) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.d.b(childAt)) {
                    i14 -= getTopInset();
                }
            }
            i12 = i14;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                i12 -= o0.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6160b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                return !o0.d.b(childAt);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f6175q == null) {
            this.f6175q = new int[4];
        }
        int[] iArr = this.f6175q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f6168j;
        int i11 = R.attr.state_liftable;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f6169k) ? R.attr.state_lifted : -R.attr.state_lifted;
        int i12 = R.attr.state_collapsible;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f6169k) ? R.attr.state_collapsed : -R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f6172n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6172n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        boolean z13 = true;
        if (o0.d.b(this) && h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o0.j(getChildAt(childCount), topInset);
            }
        }
        c();
        this.f6163e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((d) getChildAt(i14).getLayoutParams()).f6194c != null) {
                this.f6163e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f6176r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f6167i) {
            if (!this.f6170l) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((d) getChildAt(i15).getLayoutParams()).f6192a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.f6168j != z13) {
                this.f6168j = z13;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.d.b(this) && h()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = b0.c.k(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.b.x(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        e(z10, o0.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f6170l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f6171m = i10;
        WeakReference<View> weakReference = this.f6172n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6172n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f6167i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f6176r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6176r = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6176r.setState(getDrawableState());
                }
                Drawable drawable4 = this.f6176r;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                b1.a.c(drawable4, o0.e.d(this));
                Drawable drawable5 = this.f6176r;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f6176r.setCallback(this);
            }
            if (this.f6176r != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            o0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        i9.j.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f6176r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6176r;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
