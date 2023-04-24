package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.b2;
import k1.o0;

/* loaded from: classes.dex */
public final class u2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static u2 f1554k;

    /* renamed from: l */
    public static u2 f1555l;

    /* renamed from: a */
    public final View f1556a;

    /* renamed from: b */
    public final CharSequence f1557b;

    /* renamed from: c */
    public final int f1558c;

    /* renamed from: d */
    public final r2 f1559d = new r2(0, this);

    /* renamed from: e */
    public final s2 f1560e = new s2(0, this);

    /* renamed from: f */
    public int f1561f;

    /* renamed from: g */
    public int f1562g;

    /* renamed from: h */
    public v2 f1563h;

    /* renamed from: i */
    public boolean f1564i;

    /* renamed from: j */
    public boolean f1565j;

    public u2(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1556a = view;
        this.f1557b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = k1.b2.f18094a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = b2.b.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1558c = scaledTouchSlop;
        this.f1565j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(u2 u2Var) {
        u2 u2Var2 = f1554k;
        if (u2Var2 != null) {
            u2Var2.f1556a.removeCallbacks(u2Var2.f1559d);
        }
        f1554k = u2Var;
        if (u2Var != null) {
            u2Var.f1556a.postDelayed(u2Var.f1559d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        if (f1555l == this) {
            f1555l = null;
            v2 v2Var = this.f1563h;
            if (v2Var != null) {
                if (v2Var.f1584b.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) v2Var.f1583a.getSystemService("window")).removeView(v2Var.f1584b);
                }
                this.f1563h = null;
                this.f1565j = true;
                this.f1556a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1554k == this) {
            b(null);
        }
        this.f1556a.removeCallbacks(this.f1560e);
    }

    public final void c(boolean z10) {
        boolean z11;
        int height;
        int i10;
        int i11;
        int i12;
        long j10;
        long longPressTimeout;
        boolean z12;
        View view = this.f1556a;
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        if (!o0.g.b(view)) {
            return;
        }
        b(null);
        u2 u2Var = f1555l;
        if (u2Var != null) {
            u2Var.a();
        }
        f1555l = this;
        this.f1564i = z10;
        v2 v2Var = new v2(this.f1556a.getContext());
        this.f1563h = v2Var;
        View view2 = this.f1556a;
        int i13 = this.f1561f;
        int i14 = this.f1562g;
        boolean z13 = this.f1564i;
        CharSequence charSequence = this.f1557b;
        if (v2Var.f1584b.getParent() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (v2Var.f1584b.getParent() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ((WindowManager) v2Var.f1583a.getSystemService("window")).removeView(v2Var.f1584b);
            }
        }
        v2Var.f1585c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = v2Var.f1586d;
        layoutParams.token = view2.getApplicationWindowToken();
        int dimensionPixelOffset = v2Var.f1583a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view2.getWidth() < dimensionPixelOffset) {
            i13 = view2.getWidth() / 2;
        }
        if (view2.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = v2Var.f1583a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i10 = i14 - dimensionPixelOffset2;
        } else {
            height = view2.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = v2Var.f1583a.getResources();
        if (z13) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view2.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view2.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(v2Var.f1587e);
            Rect rect = v2Var.f1587e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = v2Var.f1583a.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                v2Var.f1587e.set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(v2Var.f1589g);
            view2.getLocationOnScreen(v2Var.f1588f);
            int[] iArr = v2Var.f1588f;
            int i15 = iArr[0];
            int[] iArr2 = v2Var.f1589g;
            int i16 = i15 - iArr2[0];
            iArr[0] = i16;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i16 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            v2Var.f1584b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = v2Var.f1584b.getMeasuredHeight();
            int i17 = v2Var.f1588f[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (!z13 ? measuredHeight + i19 <= v2Var.f1587e.height() : i18 < 0) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
        }
        ((WindowManager) v2Var.f1583a.getSystemService("window")).addView(v2Var.f1584b, v2Var.f1586d);
        this.f1556a.addOnAttachStateChangeListener(this);
        if (this.f1564i) {
            longPressTimeout = 2500;
        } else {
            if ((o0.d.g(this.f1556a) & 1) == 1) {
                j10 = 3000;
            } else {
                j10 = 15000;
            }
            longPressTimeout = j10 - ViewConfiguration.getLongPressTimeout();
        }
        this.f1556a.removeCallbacks(this.f1560e);
        this.f1556a.postDelayed(this.f1560e, longPressTimeout);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1563h != null && this.f1564i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1556a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f1565j = true;
                a();
            }
        } else if (this.f1556a.isEnabled() && this.f1563h == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f1565j && Math.abs(x10 - this.f1561f) <= this.f1558c && Math.abs(y10 - this.f1562g) <= this.f1558c) {
                z10 = false;
            } else {
                this.f1561f = x10;
                this.f1562g = y10;
                this.f1565j = false;
            }
            if (z10) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1561f = view.getWidth() / 2;
        this.f1562g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
