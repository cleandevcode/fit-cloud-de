package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.u1;
import androidx.appcompat.widget.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class b extends l.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = R.layout.abc_cascading_menu_item_layout;
    public boolean A;

    /* renamed from: b */
    public final Context f881b;

    /* renamed from: c */
    public final int f882c;

    /* renamed from: d */
    public final int f883d;

    /* renamed from: e */
    public final int f884e;

    /* renamed from: f */
    public final boolean f885f;

    /* renamed from: g */
    public final Handler f886g;

    /* renamed from: o */
    public View f894o;

    /* renamed from: p */
    public View f895p;

    /* renamed from: q */
    public int f896q;

    /* renamed from: r */
    public boolean f897r;

    /* renamed from: s */
    public boolean f898s;

    /* renamed from: t */
    public int f899t;

    /* renamed from: u */
    public int f900u;

    /* renamed from: w */
    public boolean f902w;

    /* renamed from: x */
    public j.a f903x;

    /* renamed from: y */
    public ViewTreeObserver f904y;

    /* renamed from: z */
    public PopupWindow.OnDismissListener f905z;

    /* renamed from: h */
    public final ArrayList f887h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f888i = new ArrayList();

    /* renamed from: j */
    public final a f889j = new a();

    /* renamed from: k */
    public final View$OnAttachStateChangeListenerC0018b f890k = new View$OnAttachStateChangeListenerC0018b();

    /* renamed from: l */
    public final c f891l = new c();

    /* renamed from: m */
    public int f892m = 0;

    /* renamed from: n */
    public int f893n = 0;

    /* renamed from: v */
    public boolean f901v = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
            b.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (b.this.a() && b.this.f888i.size() > 0 && !((d) b.this.f888i.get(0)).f909a.f1520x) {
                View view = b.this.f895p;
                if (view != null && view.isShown()) {
                    Iterator it = b.this.f888i.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f909a.b();
                    }
                    return;
                }
                b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0018b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0018b() {
            b.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f904y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f904y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f904y.removeGlobalOnLayoutListener(bVar.f889j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements u1 {
        public c() {
            b.this = r1;
        }

        @Override // androidx.appcompat.widget.u1
        public final void d(f fVar, h hVar) {
            b.this.f886g.removeCallbacksAndMessages(null);
            int size = b.this.f888i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (fVar == ((d) b.this.f888i.get(i10)).f910b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f886g.postAtTime(new androidx.appcompat.view.menu.c(this, i11 < b.this.f888i.size() ? (d) b.this.f888i.get(i11) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.u1
        public final void g(f fVar, MenuItem menuItem) {
            b.this.f886g.removeCallbacksAndMessages(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final x1 f909a;

        /* renamed from: b */
        public final f f910b;

        /* renamed from: c */
        public final int f911c;

        public d(x1 x1Var, f fVar, int i10) {
            this.f909a = x1Var;
            this.f910b = fVar;
            this.f911c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f881b = context;
        this.f894o = view;
        this.f883d = i10;
        this.f884e = i11;
        this.f885f = z10;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        this.f896q = o0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f882c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f886g = new Handler();
    }

    @Override // l.f
    public final boolean a() {
        return this.f888i.size() > 0 && ((d) this.f888i.get(0)).f909a.a();
    }

    @Override // l.f
    public final void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f887h.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        this.f887h.clear();
        View view = this.f894o;
        this.f895p = view;
        if (view != null) {
            boolean z10 = this.f904y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f904y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f889j);
            }
            this.f895p.addOnAttachStateChangeListener(this.f890k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        int i10;
        int size = this.f888i.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (fVar == ((d) this.f888i.get(i11)).f910b) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < this.f888i.size()) {
            ((d) this.f888i.get(i12)).f910b.c(false);
        }
        d dVar = (d) this.f888i.remove(i11);
        dVar.f910b.r(this);
        if (this.A) {
            x1 x1Var = dVar.f909a;
            if (Build.VERSION.SDK_INT >= 23) {
                x1.a.b(x1Var.f1521y, null);
            } else {
                x1Var.getClass();
            }
            dVar.f909a.f1521y.setAnimationStyle(0);
        }
        dVar.f909a.dismiss();
        int size2 = this.f888i.size();
        if (size2 > 0) {
            i10 = ((d) this.f888i.get(size2 - 1)).f911c;
        } else {
            View view = this.f894o;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.e.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f896q = i10;
        if (size2 == 0) {
            dismiss();
            j.a aVar = this.f903x;
            if (aVar != null) {
                aVar.c(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f904y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f904y.removeGlobalOnLayoutListener(this.f889j);
                }
                this.f904y = null;
            }
            this.f895p.removeOnAttachStateChangeListener(this.f890k);
            this.f905z.onDismiss();
        } else if (z10) {
            ((d) this.f888i.get(0)).f910b.c(false);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        Iterator it = this.f888i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f909a.f1499c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        int size = this.f888i.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) this.f888i.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f909a.a()) {
                dVar.f909a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f903x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // l.f
    public final m1 j() {
        if (this.f888i.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f888i;
        return ((d) arrayList.get(arrayList.size() - 1)).f909a.f1499c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        Iterator it = this.f888i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f910b) {
                dVar.f909a.f1499c.requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            n(mVar);
            j.a aVar = this.f903x;
            if (aVar != null) {
                aVar.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // l.d
    public final void n(f fVar) {
        fVar.b(this, this.f881b);
        if (a()) {
            x(fVar);
        } else {
            this.f887h.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        int size = this.f888i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f888i.get(i10);
            if (!dVar.f909a.a()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f910b.c(false);
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
        if (this.f894o != view) {
            this.f894o = view;
            int i10 = this.f892m;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            this.f893n = Gravity.getAbsoluteGravity(i10, o0.e.d(view));
        }
    }

    @Override // l.d
    public final void q(boolean z10) {
        this.f901v = z10;
    }

    @Override // l.d
    public final void r(int i10) {
        if (this.f892m != i10) {
            this.f892m = i10;
            View view = this.f894o;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            this.f893n = Gravity.getAbsoluteGravity(i10, o0.e.d(view));
        }
    }

    @Override // l.d
    public final void s(int i10) {
        this.f897r = true;
        this.f899t = i10;
    }

    @Override // l.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f905z = onDismissListener;
    }

    @Override // l.d
    public final void u(boolean z10) {
        this.f902w = z10;
    }

    @Override // l.d
    public final void v(int i10) {
        this.f898s = true;
        this.f900u = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(androidx.appcompat.view.menu.f r17) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.x(androidx.appcompat.view.menu.f):void");
    }
}
