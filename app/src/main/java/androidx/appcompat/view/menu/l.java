package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.x1;

/* loaded from: classes.dex */
public final class l extends l.d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v */
    public static final int f999v = R.layout.abc_popup_menu_item_layout;

    /* renamed from: b */
    public final Context f1000b;

    /* renamed from: c */
    public final f f1001c;

    /* renamed from: d */
    public final e f1002d;

    /* renamed from: e */
    public final boolean f1003e;

    /* renamed from: f */
    public final int f1004f;

    /* renamed from: g */
    public final int f1005g;

    /* renamed from: h */
    public final int f1006h;

    /* renamed from: i */
    public final x1 f1007i;

    /* renamed from: l */
    public PopupWindow.OnDismissListener f1010l;

    /* renamed from: m */
    public View f1011m;

    /* renamed from: n */
    public View f1012n;

    /* renamed from: o */
    public j.a f1013o;

    /* renamed from: p */
    public ViewTreeObserver f1014p;

    /* renamed from: q */
    public boolean f1015q;

    /* renamed from: r */
    public boolean f1016r;

    /* renamed from: s */
    public int f1017s;

    /* renamed from: u */
    public boolean f1019u;

    /* renamed from: j */
    public final a f1008j = new a();

    /* renamed from: k */
    public final b f1009k = new b();

    /* renamed from: t */
    public int f1018t = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            l.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (l.this.a()) {
                l lVar = l.this;
                if (!lVar.f1007i.f1520x) {
                    View view = lVar.f1012n;
                    if (view != null && view.isShown()) {
                        l.this.f1007i.b();
                    } else {
                        l.this.dismiss();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
            l.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1014p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1014p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1014p.removeGlobalOnLayoutListener(lVar.f1008j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f1000b = context;
        this.f1001c = fVar;
        this.f1003e = z10;
        this.f1002d = new e(fVar, LayoutInflater.from(context), z10, f999v);
        this.f1005g = i10;
        this.f1006h = i11;
        Resources resources = context.getResources();
        this.f1004f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1011m = view;
        this.f1007i = new x1(context, i10, i11);
        fVar.b(this, context);
    }

    @Override // l.f
    public final boolean a() {
        return !this.f1015q && this.f1007i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    @Override // l.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            goto Lc7
        La:
            boolean r0 = r7.f1015q
            if (r0 != 0) goto Lc8
            android.view.View r0 = r7.f1011m
            if (r0 != 0) goto L14
            goto Lc8
        L14:
            r7.f1012n = r0
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            androidx.appcompat.widget.r r0 = r0.f1521y
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            r0.f1512p = r7
            r0.f1520x = r2
            androidx.appcompat.widget.r r0 = r0.f1521y
            r0.setFocusable(r2)
            android.view.View r0 = r7.f1012n
            android.view.ViewTreeObserver r3 = r7.f1014p
            if (r3 != 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f1014p = r4
            if (r3 == 0) goto L3e
            androidx.appcompat.view.menu.l$a r3 = r7.f1008j
            r4.addOnGlobalLayoutListener(r3)
        L3e:
            androidx.appcompat.view.menu.l$b r3 = r7.f1009k
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.x1 r3 = r7.f1007i
            r3.f1511o = r0
            int r0 = r7.f1018t
            r3.f1508l = r0
            boolean r0 = r7.f1016r
            if (r0 != 0) goto L5d
            androidx.appcompat.view.menu.e r0 = r7.f1002d
            android.content.Context r3 = r7.f1000b
            int r4 = r7.f1004f
            int r0 = l.d.o(r0, r3, r4)
            r7.f1017s = r0
            r7.f1016r = r2
        L5d:
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            int r3 = r7.f1017s
            r0.r(r3)
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            androidx.appcompat.widget.r r0 = r0.f1521y
            r3 = 2
            r0.setInputMethodMode(r3)
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            android.graphics.Rect r3 = r7.f18661a
            r4 = 0
            if (r3 == 0) goto L7c
            r0.getClass()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r3)
            goto L7d
        L7c:
            r5 = r4
        L7d:
            r0.f1519w = r5
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            r0.b()
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            androidx.appcompat.widget.m1 r0 = r0.f1499c
            r0.setOnKeyListener(r7)
            boolean r3 = r7.f1019u
            if (r3 == 0) goto Lbb
            androidx.appcompat.view.menu.f r3 = r7.f1001c
            java.lang.CharSequence r3 = r3.f944m
            if (r3 == 0) goto Lbb
            android.content.Context r3 = r7.f1000b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r5 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            android.view.View r3 = r3.inflate(r5, r0, r1)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb5
            androidx.appcompat.view.menu.f r6 = r7.f1001c
            java.lang.CharSequence r6 = r6.f944m
            r5.setText(r6)
        Lb5:
            r3.setEnabled(r1)
            r0.addHeaderView(r3, r4, r1)
        Lbb:
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            androidx.appcompat.view.menu.e r1 = r7.f1002d
            r0.p(r1)
            androidx.appcompat.widget.x1 r0 = r7.f1007i
            r0.b()
        Lc7:
            r1 = 1
        Lc8:
            if (r1 == 0) goto Lcb
            return
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.b():void");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        if (fVar != this.f1001c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1013o;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        this.f1016r = false;
        e eVar = this.f1002d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        if (a()) {
            this.f1007i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f1013o = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // l.f
    public final m1 j() {
        return this.f1007i.f1499c;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f1000b
            android.view.View r6 = r9.f1012n
            boolean r8 = r9.f1003e
            int r3 = r9.f1005g
            int r4 = r9.f1006h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f1013o
            r0.f994i = r2
            l.d r3 = r0.f995j
            if (r3 == 0) goto L23
            r3.f(r2)
        L23:
            boolean r2 = l.d.w(r10)
            r0.f993h = r2
            l.d r3 = r0.f995j
            if (r3 == 0) goto L30
            r3.q(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1010l
            r0.f996k = r2
            r2 = 0
            r9.f1010l = r2
            androidx.appcompat.view.menu.f r2 = r9.f1001c
            r2.c(r1)
            androidx.appcompat.widget.x1 r2 = r9.f1007i
            int r3 = r2.f1502f
            int r2 = r2.o()
            int r4 = r9.f1018t
            android.view.View r5 = r9.f1011m
            java.util.WeakHashMap<android.view.View, k1.i2> r6 = k1.o0.f18161a
            int r5 = k1.o0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f1011m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f991f
            if (r4 != 0) goto L6c
            r0 = 0
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = 1
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.j$a r0 = r9.f1013o
            if (r0 == 0) goto L79
            r0.d(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.k(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // l.d
    public final void n(f fVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f1015q = true;
        this.f1001c.c(true);
        ViewTreeObserver viewTreeObserver = this.f1014p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1014p = this.f1012n.getViewTreeObserver();
            }
            this.f1014p.removeGlobalOnLayoutListener(this.f1008j);
            this.f1014p = null;
        }
        this.f1012n.removeOnAttachStateChangeListener(this.f1009k);
        PopupWindow.OnDismissListener onDismissListener = this.f1010l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // l.d
    public final void p(View view) {
        this.f1011m = view;
    }

    @Override // l.d
    public final void q(boolean z10) {
        this.f1002d.f927c = z10;
    }

    @Override // l.d
    public final void r(int i10) {
        this.f1018t = i10;
    }

    @Override // l.d
    public final void s(int i10) {
        this.f1007i.f1502f = i10;
    }

    @Override // l.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1010l = onDismissListener;
    }

    @Override // l.d
    public final void u(boolean z10) {
        this.f1019u = z10;
    }

    @Override // l.d
    public final void v(int i10) {
        this.f1007i.l(i10);
    }
}
