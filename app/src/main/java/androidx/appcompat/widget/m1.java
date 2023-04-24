package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class m1 extends ListView {

    /* renamed from: a */
    public final Rect f1420a;

    /* renamed from: b */
    public int f1421b;

    /* renamed from: c */
    public int f1422c;

    /* renamed from: d */
    public int f1423d;

    /* renamed from: e */
    public int f1424e;

    /* renamed from: f */
    public int f1425f;

    /* renamed from: g */
    public Field f1426g;

    /* renamed from: h */
    public c f1427h;

    /* renamed from: i */
    public boolean f1428i;

    /* renamed from: j */
    public boolean f1429j;

    /* renamed from: k */
    public boolean f1430k;

    /* renamed from: l */
    public o1.h f1431l;

    /* renamed from: m */
    public d f1432m;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public static Method f1433a;

        /* renamed from: b */
        public static Method f1434b;

        /* renamed from: c */
        public static Method f1435c;

        /* renamed from: d */
        public static boolean f1436d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1433a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1434b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1435c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1436d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends h.c {

        /* renamed from: b */
        public boolean f1437b;

        public c(Drawable drawable) {
            super(drawable);
            this.f1437b = true;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1437b) {
                super.draw(canvas);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f1437b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1437b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1437b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1437b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
            m1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m1 m1Var = m1.this;
            m1Var.f1432m = null;
            m1Var.drawableStateChanged();
        }
    }

    public m1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1420a = new Rect();
        this.f1421b = 0;
        this.f1422c = 0;
        this.f1423d = 0;
        this.f1424e = 0;
        this.f1429j = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1426g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        c cVar = this.f1427h;
        if (cVar != null) {
            cVar.f1437b = z10;
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1420a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1420a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1432m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f1430k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f1429j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f1429j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1429j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f1429j && this.f1428i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1432m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1432m == null) {
            d dVar = new d();
            this.f1432m = dVar;
            post(dVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && b.f1436d) {
                        try {
                            b.f1433a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1434b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f1435c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1430k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1425f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d dVar = this.f1432m;
        if (dVar != null) {
            m1 m1Var = m1.this;
            m1Var.f1432m = null;
            m1Var.removeCallbacks(dVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1428i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        c cVar = drawable != null ? new c(drawable) : null;
        this.f1427h = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1421b = rect.left;
        this.f1422c = rect.top;
        this.f1423d = rect.right;
        this.f1424e = rect.bottom;
    }
}
