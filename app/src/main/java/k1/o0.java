package k1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k1.a;
import k1.c;
import k1.n2;
import k1.o0;
import l1.j;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public static WeakHashMap<View, i2> f18161a;

    /* renamed from: b */
    public static Field f18162b;

    /* renamed from: c */
    public static boolean f18163c;

    /* renamed from: d */
    public static ThreadLocal<Rect> f18164d;

    /* renamed from: e */
    public static final int[] f18165e;

    /* renamed from: f */
    public static final j0 f18166f;

    /* renamed from: g */
    public static final a f18167g;

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap<View, Boolean> f18168a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f18168a.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        o0.h(key, z10 ? 16 : 32);
                        this.f18168a.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a */
        public final int f18169a;

        /* renamed from: b */
        public final Class<T> f18170b;

        /* renamed from: c */
        public final int f18171c;

        /* renamed from: d */
        public final int f18172d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f18169a = i10;
            this.f18170b = cls;
            this.f18172d = i11;
            this.f18171c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            boolean z10;
            if (Build.VERSION.SDK_INT >= this.f18171c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(view);
            }
            T t10 = (T) view.getTag(this.f18169a);
            if (this.f18170b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public final void e(View view, T t10) {
            boolean z10;
            k1.a aVar;
            if (Build.VERSION.SDK_INT >= this.f18171c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(view, t10);
            } else if (f(d(view), t10)) {
                View.AccessibilityDelegate d10 = o0.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0313a) {
                    aVar = ((a.C0313a) d10).f18087a;
                } else {
                    aVar = new k1.a(d10);
                }
                if (aVar == null) {
                    aVar = new k1.a();
                }
                o0.p(view, aVar);
                view.setTag(this.f18169a, t10);
                o0.h(view, this.f18172d);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public n2 f18173a = null;

            /* renamed from: b */
            public final /* synthetic */ View f18174b;

            /* renamed from: c */
            public final /* synthetic */ e0 f18175c;

            public a(View view, e0 e0Var) {
                this.f18174b = view;
                this.f18175c = e0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n2 i10 = n2.i(windowInsets, view);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    i.a(windowInsets, this.f18174b);
                    if (i10.equals(this.f18173a)) {
                        return this.f18175c.a(view, i10).h();
                    }
                }
                this.f18173a = i10;
                n2 a10 = this.f18175c.a(view, i10);
                if (i11 >= 30) {
                    return a10.h();
                }
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                h.c(view);
                return a10.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static n2 b(View view, n2 n2Var, Rect rect) {
            WindowInsets h10 = n2Var.h();
            if (h10 != null) {
                return n2.i(view.computeSystemWindowInsets(h10, rect), view);
            }
            rect.setEmpty();
            return n2Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static n2 j(View view) {
            n2.e bVar;
            if (n2.a.f18134d && view.isAttachedToWindow()) {
                try {
                    Object obj = n2.a.f18131a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) n2.a.f18132b.get(obj);
                        Rect rect2 = (Rect) n2.a.f18133c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                bVar = new n2.d();
                            } else if (i10 >= 29) {
                                bVar = new n2.c();
                            } else {
                                bVar = new n2.b();
                            }
                            bVar.e(a1.c.b(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.g(a1.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            n2 b10 = bVar.b();
                            b10.f18130a.p(b10);
                            b10.f18130a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    StringBuilder a10 = android.support.v4.media.d.a("Failed to get insets from AttachInfo. ");
                    a10.append(e10.getMessage());
                    Log.w("WindowInsetsCompat", a10.toString(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, e0 e0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, e0Var);
            }
            if (e0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, e0Var));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static n2 a(View view) {
            WindowInsets rootWindowInsets;
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            n2 i10 = n2.i(rootWindowInsets, null);
            i10.f18130a.p(i10);
            i10.f18130a.d(view.getRootView());
            return i10;
        }

        public static int b(View view) {
            int scrollIndicators;
            scrollIndicators = view.getScrollIndicators();
            return scrollIndicators;
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            boolean startDragAndDrop;
            startDragAndDrop = view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
            return startDragAndDrop;
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        public static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        public static boolean d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        public static boolean e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        public static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        public static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        public static View h(View view, View view2, int i10) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
            return keyboardNavigationClusterSearch;
        }

        public static boolean i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        /* JADX WARN: Type inference failed for: r0v1, types: [k1.o1, java.lang.Object] */
        public static void a(View view, final r rVar) {
            int i10 = R.id.tag_unhandled_key_listeners;
            o0.h hVar = (o0.h) view.getTag(i10);
            if (hVar == null) {
                hVar = new o0.h();
                view.setTag(i10, hVar);
            }
            Objects.requireNonNull(rVar);
            ?? r02 = new View$OnUnhandledKeyEventListener() { // from class: k1.o1
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return o0.r.this.a();
                }
            };
            hVar.put(rVar, r02);
            view.addOnUnhandledKeyEventListener(r02);
        }

        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        public static void e(View view, r rVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            o0.h hVar = (o0.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.get(rVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            View requireViewById;
            requireViewById = view.requireViewById(i10);
            return (T) requireViewById;
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        public static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static k1.c b(View view, k1.c cVar) {
            ContentInfo performReceiveContent;
            ContentInfo c10 = cVar.f18095a.c();
            Objects.requireNonNull(c10);
            performReceiveContent = view.performReceiveContent(c10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c10) {
                return cVar;
            }
            return new k1.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, f0 f0Var) {
            if (f0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(f0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a */
        public final f0 f18176a;

        public q(f0 f0Var) {
            this.f18176a = f0Var;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            k1.c cVar = new k1.c(new c.d(contentInfo));
            k1.c a10 = this.f18176a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c10 = a10.f18095a.c();
            Objects.requireNonNull(c10);
            return c10;
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f18177d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f18178a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f18179b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f18180c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f18178a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [k1.j0] */
    static {
        new AtomicInteger(1);
        f18161a = null;
        f18163c = false;
        f18165e = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f18166f = new g0() { // from class: k1.j0
            @Override // k1.g0
            public final c a(c cVar) {
                return cVar;
            }
        };
        f18167g = new a();
    }

    public static i2 a(View view) {
        if (f18161a == null) {
            f18161a = new WeakHashMap<>();
        }
        i2 i2Var = f18161a.get(view);
        if (i2Var == null) {
            i2 i2Var2 = new i2(view);
            f18161a.put(view, i2Var2);
            return i2Var2;
        }
        return i2Var;
    }

    public static n2 b(View view, n2 n2Var) {
        WindowInsets h10 = n2Var.h();
        if (h10 != null) {
            WindowInsets a10 = h.a(view, h10);
            if (!a10.equals(h10)) {
                return n2.i(a10, view);
            }
        }
        return n2Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f18177d;
        int i10 = R.id.tag_unhandled_key_event_manager;
        s sVar = (s) view.getTag(i10);
        if (sVar == null) {
            sVar = new s();
            view.setTag(i10, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f18178a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f18177d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f18178a == null) {
                        sVar.f18178a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f18177d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f18178a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f18178a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f18179b == null) {
                    sVar.f18179b = new SparseArray<>();
                }
                sVar.f18179b.put(keyCode, new WeakReference<>(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f18163c) {
            return null;
        }
        if (f18162b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f18162b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f18163c = true;
                return null;
            }
        }
        Object obj = f18162b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static ArrayList e(View view) {
        int i10 = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i10, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect f() {
        if (f18164d == null) {
            f18164d = new ThreadLocal<>();
        }
        Rect rect = f18164d.get();
        if (rect == null) {
            rect = new Rect();
            f18164d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i10) {
        boolean z10;
        CharSequence charSequence;
        boolean z11;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        int i11 = R.id.tag_accessibility_pane_title;
        int i12 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        if (i12 >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        CharSequence charSequence2 = null;
        if (z10) {
            charSequence = m.b(view);
        } else {
            Object tag = view.getTag(i11);
            if (CharSequence.class.isInstance(tag)) {
                charSequence = tag;
            } else {
                charSequence = null;
            }
        }
        if (charSequence != null && view.isShown() && view.getWindowVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = 32;
        if (g.a(view) == 0 && !z11) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                List<CharSequence> text = obtain.getText();
                if (i12 >= 28) {
                    z12 = true;
                }
                if (z12) {
                    charSequence2 = m.b(view);
                } else {
                    Object tag2 = view.getTag(i11);
                    if (CharSequence.class.isInstance(tag2)) {
                        charSequence2 = tag2;
                    }
                }
                text.add(charSequence2);
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z11) {
            i13 = 2048;
        }
        obtain2.setEventType(i13);
        g.g(obtain2, i10);
        if (z11) {
            List<CharSequence> text2 = obtain2.getText();
            if (i12 >= 28) {
                z12 = true;
            }
            if (z12) {
                charSequence2 = m.b(view);
            } else {
                Object tag3 = view.getTag(i11);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence2 = tag3;
                }
            }
            text2.add(charSequence2);
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (d.c((View) parent) == 4) {
                    d.s(view, 2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void i(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect f10 = f();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !f10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            t(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z10 && f10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f10);
        }
    }

    public static void j(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect f10 = f();
        boolean z10 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f10.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !f10.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            t(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                t((View) parent2);
            }
        }
        if (z10 && f10.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f10);
        }
    }

    public static n2 k(View view, n2 n2Var) {
        WindowInsets h10 = n2Var.h();
        if (h10 != null) {
            WindowInsets b10 = h.b(view, h10);
            if (!b10.equals(h10)) {
                return n2.i(b10, view);
            }
        }
        return n2Var;
    }

    public static k1.c l(View view, k1.c cVar) {
        g0 g0Var;
        g0 g0Var2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        f0 f0Var = (f0) view.getTag(R.id.tag_on_receive_content_listener);
        if (f0Var != null) {
            k1.c a10 = f0Var.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof g0) {
                g0Var2 = (g0) view;
            } else {
                g0Var2 = f18166f;
            }
            return g0Var2.a(a10);
        }
        if (view instanceof g0) {
            g0Var = (g0) view;
        } else {
            g0Var = f18166f;
        }
        return g0Var.a(cVar);
    }

    public static void m(View view, int i10) {
        ArrayList e10 = e(view);
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (((j.a) e10.get(i11)).a() == i10) {
                e10.remove(i11);
                return;
            }
        }
    }

    public static void n(View view, j.a aVar, l1.n nVar) {
        k1.a aVar2;
        if (nVar == null) {
            m(view, aVar.a());
            h(view, 0);
            return;
        }
        j.a aVar3 = new j.a(null, aVar.f18682b, null, nVar, aVar.f18683c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            aVar2 = null;
        } else if (d10 instanceof a.C0313a) {
            aVar2 = ((a.C0313a) d10).f18087a;
        } else {
            aVar2 = new k1.a(d10);
        }
        if (aVar2 == null) {
            aVar2 = new k1.a();
        }
        p(view, aVar2);
        m(view, aVar3.a());
        e(view).add(aVar3);
        h(view, 0);
    }

    public static void o(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void p(View view, k1.a aVar) {
        a.C0313a c0313a;
        if (aVar == null && (d(view) instanceof a.C0313a)) {
            aVar = new k1.a();
        }
        if (aVar == null) {
            c0313a = null;
        } else {
            c0313a = aVar.f18086b;
        }
        view.setAccessibilityDelegate(c0313a);
    }

    public static void q(View view, CharSequence charSequence) {
        boolean z10;
        new l0(R.id.tag_accessibility_pane_title, CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f18167g;
            WeakHashMap<View, Boolean> weakHashMap = aVar.f18168a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f18167g;
        aVar2.f18168a.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }

    public static void r(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        i.q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (i.g(view) == null && i.h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            d.q(view, background);
        }
    }

    public static void s(View view, i0 i0Var) {
        PointerIcon pointerIcon;
        if (Build.VERSION.SDK_INT >= 24) {
            if (i0Var != null) {
                pointerIcon = i0Var.f18124a;
            } else {
                pointerIcon = null;
            }
            k.d(view, pointerIcon);
        }
    }

    public static void t(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
