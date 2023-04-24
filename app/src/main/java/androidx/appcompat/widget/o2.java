package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.R;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import f.j;

/* loaded from: classes.dex */
public final class o2 implements j1 {

    /* renamed from: a */
    public Toolbar f1459a;

    /* renamed from: b */
    public int f1460b;

    /* renamed from: c */
    public c2 f1461c;

    /* renamed from: d */
    public View f1462d;

    /* renamed from: e */
    public Drawable f1463e;

    /* renamed from: f */
    public Drawable f1464f;

    /* renamed from: g */
    public Drawable f1465g;

    /* renamed from: h */
    public boolean f1466h;

    /* renamed from: i */
    public CharSequence f1467i;

    /* renamed from: j */
    public CharSequence f1468j;

    /* renamed from: k */
    public CharSequence f1469k;

    /* renamed from: l */
    public Window.Callback f1470l;

    /* renamed from: m */
    public boolean f1471m;

    /* renamed from: n */
    public c f1472n;

    /* renamed from: o */
    public int f1473o;

    /* renamed from: p */
    public Drawable f1474p;

    /* loaded from: classes.dex */
    public class a extends com.bumptech.glide.manager.g {

        /* renamed from: a */
        public boolean f1475a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1476b;

        public a(int i10) {
            o2.this = r1;
            this.f1476b = i10;
        }

        @Override // com.bumptech.glide.manager.g, k1.j2
        public final void a(View view) {
            this.f1475a = true;
        }

        @Override // com.bumptech.glide.manager.g, k1.j2
        public final void c() {
            o2.this.f1459a.setVisibility(0);
        }

        @Override // k1.j2
        public final void e() {
            if (this.f1475a) {
                return;
            }
            o2.this.f1459a.setVisibility(this.f1476b);
        }
    }

    public o2(Toolbar toolbar) {
        boolean z10;
        Drawable drawable;
        Toolbar toolbar2;
        int i10 = R.string.abc_action_bar_up_description;
        this.f1473o = 0;
        this.f1459a = toolbar;
        this.f1467i = toolbar.getTitle();
        this.f1468j = toolbar.getSubtitle();
        if (this.f1467i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1466h = z10;
        this.f1465g = toolbar.getNavigationIcon();
        l2 m10 = l2.m(toolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle);
        this.f1474p = m10.e(R.styleable.ActionBar_homeAsUpIndicator);
        CharSequence k10 = m10.k(R.styleable.ActionBar_title);
        if (!TextUtils.isEmpty(k10)) {
            this.f1466h = true;
            this.f1467i = k10;
            if ((this.f1460b & 8) != 0) {
                this.f1459a.setTitle(k10);
                if (this.f1466h) {
                    k1.o0.q(this.f1459a.getRootView(), k10);
                }
            }
        }
        CharSequence k11 = m10.k(R.styleable.ActionBar_subtitle);
        if (!TextUtils.isEmpty(k11)) {
            this.f1468j = k11;
            if ((this.f1460b & 8) != 0) {
                this.f1459a.setSubtitle(k11);
            }
        }
        Drawable e10 = m10.e(R.styleable.ActionBar_logo);
        if (e10 != null) {
            this.f1464f = e10;
            w();
        }
        Drawable e11 = m10.e(R.styleable.ActionBar_icon);
        if (e11 != null) {
            setIcon(e11);
        }
        if (this.f1465g == null && (drawable = this.f1474p) != null) {
            this.f1465g = drawable;
            if ((this.f1460b & 4) != 0) {
                toolbar2 = this.f1459a;
            } else {
                toolbar2 = this.f1459a;
                drawable = null;
            }
            toolbar2.setNavigationIcon(drawable);
        }
        l(m10.h(R.styleable.ActionBar_displayOptions, 0));
        int i11 = m10.i(R.styleable.ActionBar_customNavigationLayout, 0);
        if (i11 != 0) {
            View inflate = LayoutInflater.from(this.f1459a.getContext()).inflate(i11, (ViewGroup) this.f1459a, false);
            View view = this.f1462d;
            if (view != null && (this.f1460b & 16) != 0) {
                this.f1459a.removeView(view);
            }
            this.f1462d = inflate;
            if (inflate != null && (this.f1460b & 16) != 0) {
                this.f1459a.addView(inflate);
            }
            l(this.f1460b | 16);
        }
        int layoutDimension = m10.f1415b.getLayoutDimension(R.styleable.ActionBar_height, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = this.f1459a.getLayoutParams();
            layoutParams.height = layoutDimension;
            this.f1459a.setLayoutParams(layoutParams);
        }
        int c10 = m10.c(R.styleable.ActionBar_contentInsetStart, -1);
        int c11 = m10.c(R.styleable.ActionBar_contentInsetEnd, -1);
        if (c10 >= 0 || c11 >= 0) {
            Toolbar toolbar3 = this.f1459a;
            int max = Math.max(c10, 0);
            int max2 = Math.max(c11, 0);
            if (toolbar3.f1233t == null) {
                toolbar3.f1233t = new b2();
            }
            toolbar3.f1233t.a(max, max2);
        }
        int i12 = m10.i(R.styleable.ActionBar_titleTextStyle, 0);
        if (i12 != 0) {
            Toolbar toolbar4 = this.f1459a;
            Context context = toolbar4.getContext();
            toolbar4.f1225l = i12;
            d1 d1Var = toolbar4.f1213b;
            if (d1Var != null) {
                d1Var.setTextAppearance(context, i12);
            }
        }
        int i13 = m10.i(R.styleable.ActionBar_subtitleTextStyle, 0);
        if (i13 != 0) {
            Toolbar toolbar5 = this.f1459a;
            Context context2 = toolbar5.getContext();
            toolbar5.f1226m = i13;
            d1 d1Var2 = toolbar5.f1214c;
            if (d1Var2 != null) {
                d1Var2.setTextAppearance(context2, i13);
            }
        }
        int i14 = m10.i(R.styleable.ActionBar_popupTheme, 0);
        if (i14 != 0) {
            this.f1459a.setPopupTheme(i14);
        }
        m10.n();
        if (i10 != this.f1473o) {
            this.f1473o = i10;
            if (TextUtils.isEmpty(this.f1459a.getNavigationContentDescription())) {
                int i15 = this.f1473o;
                this.f1469k = i15 != 0 ? e().getString(i15) : null;
                v();
            }
        }
        this.f1469k = this.f1459a.getNavigationContentDescription();
        this.f1459a.setNavigationOnClickListener(new n2(this));
    }

    @Override // androidx.appcompat.widget.j1
    public final boolean a() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1459a.f1212a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f1079t;
        if (cVar != null && cVar.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.j1
    public final void b() {
        this.f1471m = true;
    }

    @Override // androidx.appcompat.widget.j1
    public final void c(androidx.appcompat.view.menu.f fVar, j.b bVar) {
        if (this.f1472n == null) {
            c cVar = new c(this.f1459a.getContext());
            this.f1472n = cVar;
            cVar.f880i = R.id.action_menu_presenter;
        }
        c cVar2 = this.f1472n;
        cVar2.f876e = bVar;
        Toolbar toolbar = this.f1459a;
        if (fVar != null || toolbar.f1212a != null) {
            toolbar.e();
            androidx.appcompat.view.menu.f fVar2 = toolbar.f1212a.f1075p;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.V);
                    fVar2.r(toolbar.W);
                }
                if (toolbar.W == null) {
                    toolbar.W = new Toolbar.d();
                }
                cVar2.f1281r = true;
                if (fVar != null) {
                    fVar.b(cVar2, toolbar.f1223j);
                    fVar.b(toolbar.W, toolbar.f1223j);
                } else {
                    cVar2.h(toolbar.f1223j, null);
                    toolbar.W.h(toolbar.f1223j, null);
                    cVar2.d(true);
                    toolbar.W.d(true);
                }
                toolbar.f1212a.setPopupTheme(toolbar.f1224k);
                toolbar.f1212a.setPresenter(cVar2);
                toolbar.V = cVar2;
            }
        }
    }

    @Override // androidx.appcompat.widget.j1
    public final void collapseActionView() {
        androidx.appcompat.view.menu.h hVar;
        Toolbar.d dVar = this.f1459a.W;
        if (dVar == null) {
            hVar = null;
        } else {
            hVar = dVar.f1244b;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.j1
    public final boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1459a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1212a) != null && actionMenuView.f1078s) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.j1
    public final Context e() {
        return this.f1459a.getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1459a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1212a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.f1079t
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f1285v
            if (r3 != 0) goto L19
            boolean r0 = r0.j()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o2.f():boolean");
    }

    @Override // androidx.appcompat.widget.j1
    public final boolean g() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1459a.f1212a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f1079t;
        if (cVar != null && cVar.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.j1
    public final CharSequence getTitle() {
        return this.f1459a.getTitle();
    }

    @Override // androidx.appcompat.widget.j1
    public final boolean h() {
        boolean z10;
        ActionMenuView actionMenuView = this.f1459a.f1212a;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f1079t;
        if (cVar != null && cVar.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.j1
    public final void i() {
        c cVar;
        ActionMenuView actionMenuView = this.f1459a.f1212a;
        if (actionMenuView != null && (cVar = actionMenuView.f1079t) != null) {
            cVar.b();
            c.a aVar = cVar.f1284u;
            if (aVar != null && aVar.b()) {
                aVar.f995j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.j1
    public final void j() {
    }

    @Override // androidx.appcompat.widget.j1
    public final boolean k() {
        Toolbar.d dVar = this.f1459a.W;
        if (dVar != null && dVar.f1244b != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.j1
    public final void l(int i10) {
        View view;
        Toolbar toolbar;
        Toolbar toolbar2;
        Drawable drawable;
        int i11 = this.f1460b ^ i10;
        this.f1460b = i10;
        if (i11 != 0) {
            CharSequence charSequence = null;
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    v();
                }
                if ((this.f1460b & 4) != 0) {
                    toolbar2 = this.f1459a;
                    drawable = this.f1465g;
                    if (drawable == null) {
                        drawable = this.f1474p;
                    }
                } else {
                    toolbar2 = this.f1459a;
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i11 & 3) != 0) {
                w();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1459a.setTitle(this.f1467i);
                    toolbar = this.f1459a;
                    charSequence = this.f1468j;
                } else {
                    this.f1459a.setTitle((CharSequence) null);
                    toolbar = this.f1459a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f1462d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1459a.addView(view);
                } else {
                    this.f1459a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.j1
    public final void m() {
        c2 c2Var = this.f1461c;
        if (c2Var != null) {
            ViewParent parent = c2Var.getParent();
            Toolbar toolbar = this.f1459a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1461c);
            }
        }
        this.f1461c = null;
    }

    @Override // androidx.appcompat.widget.j1
    public final void n(int i10) {
        this.f1464f = i10 != 0 ? g.a.b(e(), i10) : null;
        w();
    }

    @Override // androidx.appcompat.widget.j1
    public final void o() {
    }

    @Override // androidx.appcompat.widget.j1
    public final k1.i2 p(int i10, long j10) {
        k1.i2 a10 = k1.o0.a(this.f1459a);
        a10.a(i10 == 0 ? 1.0f : 0.0f);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    @Override // androidx.appcompat.widget.j1
    public final void q(int i10) {
        this.f1459a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.j1
    public final int r() {
        return this.f1460b;
    }

    @Override // androidx.appcompat.widget.j1
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.j1
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(e(), i10) : null);
    }

    @Override // androidx.appcompat.widget.j1
    public final void setIcon(Drawable drawable) {
        this.f1463e = drawable;
        w();
    }

    @Override // androidx.appcompat.widget.j1
    public final void setWindowCallback(Window.Callback callback) {
        this.f1470l = callback;
    }

    @Override // androidx.appcompat.widget.j1
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f1466h) {
            return;
        }
        this.f1467i = charSequence;
        if ((this.f1460b & 8) != 0) {
            this.f1459a.setTitle(charSequence);
            if (this.f1466h) {
                k1.o0.q(this.f1459a.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.j1
    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.j1
    public final void u(boolean z10) {
        this.f1459a.setCollapsible(z10);
    }

    public final void v() {
        if ((this.f1460b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1469k)) {
                this.f1459a.setNavigationContentDescription(this.f1473o);
            } else {
                this.f1459a.setNavigationContentDescription(this.f1469k);
            }
        }
    }

    public final void w() {
        Drawable drawable;
        int i10 = this.f1460b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1464f) == null) {
            drawable = this.f1463e;
        }
        this.f1459a.setLogo(drawable);
    }
}
