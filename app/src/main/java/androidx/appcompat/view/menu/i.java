package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    public final Context f986a;

    /* renamed from: b */
    public final f f987b;

    /* renamed from: c */
    public final boolean f988c;

    /* renamed from: d */
    public final int f989d;

    /* renamed from: e */
    public final int f990e;

    /* renamed from: f */
    public View f991f;

    /* renamed from: g */
    public int f992g;

    /* renamed from: h */
    public boolean f993h;

    /* renamed from: i */
    public j.a f994i;

    /* renamed from: j */
    public l.d f995j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f996k;

    /* renamed from: l */
    public final a f997l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
            i.this = r1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f992g = 8388611;
        this.f997l = new a();
        this.f986a = context;
        this.f987b = fVar;
        this.f991f = view;
        this.f988c = z10;
        this.f989d = i10;
        this.f990e = i11;
    }

    public i(Context context, f fVar, View view, boolean z10, int i10) {
        this(i10, 0, context, view, fVar, z10);
    }

    public final l.d a() {
        boolean z10;
        l.d lVar;
        if (this.f995j == null) {
            Display defaultDisplay = ((WindowManager) this.f986a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= this.f986a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                lVar = new androidx.appcompat.view.menu.b(this.f986a, this.f991f, this.f989d, this.f990e, this.f988c);
            } else {
                Context context = this.f986a;
                f fVar = this.f987b;
                lVar = new l(this.f989d, this.f990e, context, this.f991f, fVar, this.f988c);
            }
            lVar.n(this.f987b);
            lVar.t(this.f997l);
            lVar.p(this.f991f);
            lVar.f(this.f994i);
            lVar.q(this.f993h);
            lVar.r(this.f992g);
            this.f995j = lVar;
        }
        return this.f995j;
    }

    public final boolean b() {
        l.d dVar = this.f995j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f995j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f996k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        l.d a10 = a();
        a10.u(z11);
        if (z10) {
            int i12 = this.f992g;
            View view = this.f991f;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if ((Gravity.getAbsoluteGravity(i12, o0.e.d(view)) & 7) == 5) {
                i10 -= this.f991f.getWidth();
            }
            a10.s(i10);
            a10.v(i11);
            int i13 = (int) ((this.f986a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f18661a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.b();
    }
}
