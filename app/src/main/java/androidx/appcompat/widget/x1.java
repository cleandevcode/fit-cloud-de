package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class x1 extends r1 implements u1 {
    public static Method D;
    public u1 C;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends m1 {

        /* renamed from: n */
        public final int f1594n;

        /* renamed from: o */
        public final int f1595o;

        /* renamed from: p */
        public u1 f1596p;

        /* renamed from: q */
        public androidx.appcompat.view.menu.h f1597q;

        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1594n = 21;
                this.f1595o = 22;
                return;
            }
            this.f1594n = 22;
            this.f1595o = 21;
        }

        @Override // androidx.appcompat.widget.m1, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.f1596p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) adapter;
                androidx.appcompat.view.menu.h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < eVar.getCount()) {
                    hVar = eVar.getItem(i11);
                }
                androidx.appcompat.view.menu.h hVar2 = this.f1597q;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.f925a;
                    if (hVar2 != null) {
                        this.f1596p.g(fVar, hVar2);
                    }
                    this.f1597q = hVar;
                    if (hVar != null) {
                        this.f1596p.d(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1594n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i10 == this.f1595o) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((androidx.appcompat.view.menu.e) adapter).f925a.c(false);
                return true;
            } else {
                return super.onKeyDown(i10, keyEvent);
            }
        }

        public void setHoverListener(u1 u1Var) {
            this.f1596p = u1Var;
        }

        @Override // androidx.appcompat.widget.m1, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public x1(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.u1
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        u1 u1Var = this.C;
        if (u1Var != null) {
            u1Var.d(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.u1
    public final void g(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        u1 u1Var = this.C;
        if (u1Var != null) {
            u1Var.g(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.r1
    public final m1 q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
