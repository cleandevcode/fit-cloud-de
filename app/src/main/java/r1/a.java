package r1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import l1.k;
import l1.m;
import no.nordicsemi.android.dfu.DfuBaseService;
import r1.b;

/* loaded from: classes.dex */
public abstract class a extends k1.a {

    /* renamed from: n */
    public static final Rect f25147n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C0455a f25148o = new C0455a();

    /* renamed from: p */
    public static final b f25149p = new b();

    /* renamed from: h */
    public final AccessibilityManager f25154h;

    /* renamed from: i */
    public final View f25155i;

    /* renamed from: j */
    public c f25156j;

    /* renamed from: d */
    public final Rect f25150d = new Rect();

    /* renamed from: e */
    public final Rect f25151e = new Rect();

    /* renamed from: f */
    public final Rect f25152f = new Rect();

    /* renamed from: g */
    public final int[] f25153g = new int[2];

    /* renamed from: k */
    public int f25157k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f25158l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f25159m = Integer.MIN_VALUE;

    /* renamed from: r1.a$a */
    /* loaded from: classes.dex */
    public class C0455a implements b.a<j> {
    }

    /* loaded from: classes.dex */
    public class b {
    }

    /* loaded from: classes.dex */
    public class c extends k {
        public c() {
            a.this = r1;
        }

        @Override // l1.k
        public final j a(int i10) {
            return new j(AccessibilityNodeInfo.obtain(a.this.n(i10).f18670a));
        }

        @Override // l1.k
        public final j b(int i10) {
            int i11 = i10 == 2 ? a.this.f25157k : a.this.f25158l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        @Override // l1.k
        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        boolean z11 = false;
                        if (i11 != 64) {
                            if (i11 != 128) {
                                Chip.b bVar = (Chip.b) aVar;
                                bVar.getClass();
                                if (i11 == 16) {
                                    if (i10 == 0) {
                                        return Chip.this.performClick();
                                    }
                                    if (i10 == 1) {
                                        Chip chip = Chip.this;
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f6367h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            z11 = true;
                                        }
                                        if (chip.f6379t) {
                                            chip.f6378s.q(1, 1);
                                        }
                                    }
                                }
                                return z11;
                            }
                            if (aVar.f25157k == i10) {
                                aVar.f25157k = Integer.MIN_VALUE;
                                aVar.f25155i.invalidate();
                                aVar.q(i10, 65536);
                            }
                            z10 = false;
                        } else {
                            if (aVar.f25154h.isEnabled() && aVar.f25154h.isTouchExplorationEnabled() && (i12 = aVar.f25157k) != i10) {
                                if (i12 != Integer.MIN_VALUE) {
                                    aVar.f25157k = Integer.MIN_VALUE;
                                    aVar.f25155i.invalidate();
                                    aVar.q(i12, 65536);
                                }
                                aVar.f25157k = i10;
                                aVar.f25155i.invalidate();
                                aVar.q(i10, DfuBaseService.ERROR_CONNECTION_STATE_MASK);
                            }
                            z10 = false;
                        }
                        return z10;
                    }
                    return aVar.j(i10);
                }
                return aVar.p(i10);
            }
            View view = aVar.f25155i;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            return o0.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f25155i = view;
            this.f25154h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.d.c(view) == 0) {
                o0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // k1.a
    public final k b(View view) {
        if (this.f25156j == null) {
            this.f25156j = new c();
        }
        return this.f25156j;
    }

    @Override // k1.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // k1.a
    public final void d(View view, j jVar) {
        boolean z10;
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        Chip.b bVar = (Chip.b) this;
        com.google.android.material.chip.a aVar = Chip.this.f6364e;
        if (aVar != null && aVar.f6397e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.f18670a.setCheckable(z10);
        jVar.f18670a.setClickable(Chip.this.isClickable());
        jVar.g(Chip.this.getAccessibilityClassName());
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            jVar.l(text);
        } else {
            jVar.i(text);
        }
    }

    public final boolean j(int i10) {
        if (this.f25158l != i10) {
            return false;
        }
        this.f25158l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f6373n = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final j k(int i10) {
        boolean z10;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        j jVar = new j(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        jVar.g("android.view.View");
        Rect rect = f25147n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f25155i;
        jVar.f18671b = -1;
        obtain.setParent(view);
        o(i10, jVar);
        if (jVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        jVar.d(this.f25151e);
        if (!this.f25151e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(this.f25155i.getContext().getPackageName());
                    View view2 = this.f25155i;
                    jVar.f18672c = i10;
                    obtain.setSource(view2, i10);
                    boolean z11 = false;
                    if (this.f25157k == i10) {
                        obtain.setAccessibilityFocused(true);
                        jVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        jVar.a(64);
                    }
                    if (this.f25158l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        jVar.a(2);
                    } else if (obtain.isFocusable()) {
                        jVar.a(1);
                    }
                    obtain.setFocused(z10);
                    this.f25155i.getLocationOnScreen(this.f25153g);
                    obtain.getBoundsInScreen(this.f25150d);
                    if (this.f25150d.equals(rect)) {
                        jVar.d(this.f25150d);
                        if (jVar.f18671b != -1) {
                            j jVar2 = new j(AccessibilityNodeInfo.obtain());
                            for (int i11 = jVar.f18671b; i11 != -1; i11 = jVar2.f18671b) {
                                View view3 = this.f25155i;
                                jVar2.f18671b = -1;
                                jVar2.f18670a.setParent(view3, -1);
                                jVar2.f18670a.setBoundsInParent(f25147n);
                                o(i11, jVar2);
                                jVar2.d(this.f25151e);
                                Rect rect2 = this.f25150d;
                                Rect rect3 = this.f25151e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            jVar2.f18670a.recycle();
                        }
                        this.f25150d.offset(this.f25153g[0] - this.f25155i.getScrollX(), this.f25153g[1] - this.f25155i.getScrollY());
                    }
                    if (this.f25155i.getLocalVisibleRect(this.f25152f)) {
                        this.f25152f.offset(this.f25153g[0] - this.f25155i.getScrollX(), this.f25153g[1] - this.f25155i.getScrollY());
                        if (this.f25150d.intersect(this.f25152f)) {
                            jVar.f18670a.setBoundsInScreen(this.f25150d);
                            Rect rect4 = this.f25150d;
                            if (rect4 != null && !rect4.isEmpty() && this.f25155i.getWindowVisibility() == 0) {
                                View view4 = this.f25155i;
                                while (true) {
                                    ViewParent parent = view4.getParent();
                                    if (parent instanceof View) {
                                        view4 = (View) parent;
                                        if (view4.getAlpha() <= 0.0f) {
                                            break;
                                        } else if (view4.getVisibility() != 0) {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                jVar.f18670a.setVisibleToUser(true);
                            }
                        }
                    }
                    return jVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:197:0x013a, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0146 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.a.m(int, android.graphics.Rect):boolean");
    }

    public final j n(int i10) {
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f25155i);
            j jVar = new j(obtain);
            View view = this.f25155i;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                jVar.f18670a.addChild(this.f25155i, ((Integer) arrayList.get(i11)).intValue());
            }
            return jVar;
        }
        return k(i10);
    }

    public abstract void o(int i10, j jVar);

    public final boolean p(int i10) {
        int i11;
        if ((!this.f25155i.isFocused() && !this.f25155i.requestFocus()) || (i11 = this.f25158l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f25158l = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.f6373n = true;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final void q(int i10, int i11) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i10 == Integer.MIN_VALUE || !this.f25154h.isEnabled() || (parent = this.f25155i.getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            obtain = AccessibilityEvent.obtain(i11);
            j n10 = n(i10);
            obtain.getText().add(n10.e());
            obtain.setContentDescription(n10.f18670a.getContentDescription());
            obtain.setScrollable(n10.f18670a.isScrollable());
            obtain.setPassword(n10.f18670a.isPassword());
            obtain.setEnabled(n10.f18670a.isEnabled());
            obtain.setChecked(n10.f18670a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(n10.f18670a.getClassName());
            m.a(obtain, this.f25155i, i10);
            obtain.setPackageName(this.f25155i.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i11);
            this.f25155i.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(this.f25155i, obtain);
    }
}
