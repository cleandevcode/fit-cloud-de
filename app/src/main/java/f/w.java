package f;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import f.a;
import f.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.a;
import k1.i2;
import k1.k2;
import k1.o0;

/* loaded from: classes.dex */
public final class w extends f.a implements ActionBarOverlayLayout.d {

    /* renamed from: a */
    public Context f13994a;

    /* renamed from: b */
    public Context f13995b;

    /* renamed from: c */
    public ActionBarOverlayLayout f13996c;

    /* renamed from: d */
    public ActionBarContainer f13997d;

    /* renamed from: e */
    public j1 f13998e;

    /* renamed from: f */
    public ActionBarContextView f13999f;

    /* renamed from: g */
    public View f14000g;

    /* renamed from: h */
    public boolean f14001h;

    /* renamed from: i */
    public d f14002i;

    /* renamed from: j */
    public d f14003j;

    /* renamed from: k */
    public a.InterfaceC0312a f14004k;

    /* renamed from: l */
    public boolean f14005l;

    /* renamed from: m */
    public ArrayList<a.b> f14006m;

    /* renamed from: n */
    public boolean f14007n;

    /* renamed from: o */
    public int f14008o;

    /* renamed from: p */
    public boolean f14009p;

    /* renamed from: q */
    public boolean f14010q;

    /* renamed from: r */
    public boolean f14011r;

    /* renamed from: s */
    public boolean f14012s;

    /* renamed from: t */
    public k.h f14013t;

    /* renamed from: u */
    public boolean f14014u;

    /* renamed from: v */
    public boolean f14015v;

    /* renamed from: w */
    public final a f14016w;

    /* renamed from: x */
    public final b f14017x;

    /* renamed from: y */
    public final c f14018y;

    /* renamed from: z */
    public static final AccelerateInterpolator f13993z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends com.bumptech.glide.manager.g {
        public a() {
            w.this = r1;
        }

        @Override // k1.j2
        public final void e() {
            View view;
            w wVar = w.this;
            if (wVar.f14009p && (view = wVar.f14000g) != null) {
                view.setTranslationY(0.0f);
                w.this.f13997d.setTranslationY(0.0f);
            }
            w.this.f13997d.setVisibility(8);
            w.this.f13997d.setTransitioning(false);
            w wVar2 = w.this;
            wVar2.f14013t = null;
            a.InterfaceC0312a interfaceC0312a = wVar2.f14004k;
            if (interfaceC0312a != null) {
                interfaceC0312a.d(wVar2.f14003j);
                wVar2.f14003j = null;
                wVar2.f14004k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = w.this.f13996c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends com.bumptech.glide.manager.g {
        public b() {
            w.this = r1;
        }

        @Override // k1.j2
        public final void e() {
            w wVar = w.this;
            wVar.f14013t = null;
            wVar.f13997d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements k2 {
        public c() {
            w.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class d extends k.a implements f.a {

        /* renamed from: c */
        public final Context f14022c;

        /* renamed from: d */
        public final androidx.appcompat.view.menu.f f14023d;

        /* renamed from: e */
        public a.InterfaceC0312a f14024e;

        /* renamed from: f */
        public WeakReference<View> f14025f;

        public d(Context context, j.c cVar) {
            w.this = r1;
            this.f14022c = context;
            this.f14024e = cVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f943l = 1;
            this.f14023d = fVar;
            fVar.f936e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0312a interfaceC0312a = this.f14024e;
            if (interfaceC0312a != null) {
                return interfaceC0312a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f14024e == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = w.this.f13999f.f1256d;
            if (cVar != null) {
                cVar.n();
            }
        }

        @Override // k.a
        public final void c() {
            w wVar = w.this;
            if (wVar.f14002i != this) {
                return;
            }
            if (!(!wVar.f14010q)) {
                wVar.f14003j = this;
                wVar.f14004k = this.f14024e;
            } else {
                this.f14024e.d(this);
            }
            this.f14024e = null;
            w.this.a(false);
            ActionBarContextView actionBarContextView = w.this.f13999f;
            if (actionBarContextView.f1035k == null) {
                actionBarContextView.h();
            }
            w wVar2 = w.this;
            wVar2.f13996c.setHideOnContentScrollEnabled(wVar2.f14015v);
            w.this.f14002i = null;
        }

        @Override // k.a
        public final View d() {
            WeakReference<View> weakReference = this.f14025f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f14023d;
        }

        @Override // k.a
        public final MenuInflater f() {
            return new k.g(this.f14022c);
        }

        @Override // k.a
        public final CharSequence g() {
            return w.this.f13999f.getSubtitle();
        }

        @Override // k.a
        public final CharSequence h() {
            return w.this.f13999f.getTitle();
        }

        @Override // k.a
        public final void i() {
            if (w.this.f14002i != this) {
                return;
            }
            this.f14023d.w();
            try {
                this.f14024e.b(this, this.f14023d);
            } finally {
                this.f14023d.v();
            }
        }

        @Override // k.a
        public final boolean j() {
            return w.this.f13999f.f1043s;
        }

        @Override // k.a
        public final void k(View view) {
            w.this.f13999f.setCustomView(view);
            this.f14025f = new WeakReference<>(view);
        }

        @Override // k.a
        public final void l(int i10) {
            m(w.this.f13994a.getResources().getString(i10));
        }

        @Override // k.a
        public final void m(CharSequence charSequence) {
            w.this.f13999f.setSubtitle(charSequence);
        }

        @Override // k.a
        public final void n(int i10) {
            o(w.this.f13994a.getResources().getString(i10));
        }

        @Override // k.a
        public final void o(CharSequence charSequence) {
            w.this.f13999f.setTitle(charSequence);
        }

        @Override // k.a
        public final void p(boolean z10) {
            this.f18001b = z10;
            w.this.f13999f.setTitleOptional(z10);
        }
    }

    public w(Activity activity, boolean z10) {
        new ArrayList();
        this.f14006m = new ArrayList<>();
        this.f14008o = 0;
        this.f14009p = true;
        this.f14012s = true;
        this.f14016w = new a();
        this.f14017x = new b();
        this.f14018y = new c();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z10) {
            return;
        }
        this.f14000g = decorView.findViewById(16908290);
    }

    public w(Dialog dialog) {
        new ArrayList();
        this.f14006m = new ArrayList<>();
        this.f14008o = 0;
        this.f14009p = true;
        this.f14012s = true;
        this.f14016w = new a();
        this.f14017x = new b();
        this.f14018y = new c();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z10) {
        i2 p10;
        i2 e10;
        long j10;
        if (z10) {
            if (!this.f14011r) {
                this.f14011r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13996c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f14011r) {
            this.f14011r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13996c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f13997d;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.g.c(actionBarContainer)) {
            if (z10) {
                e10 = this.f13998e.p(4, 100L);
                p10 = this.f13999f.e(0, 200L);
            } else {
                p10 = this.f13998e.p(0, 200L);
                e10 = this.f13999f.e(8, 100L);
            }
            k.h hVar = new k.h();
            hVar.f18055a.add(e10);
            View view = e10.f18125a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = p10.f18125a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            hVar.f18055a.add(p10);
            hVar.b();
        } else if (z10) {
            this.f13998e.q(4);
            this.f13999f.setVisibility(0);
        } else {
            this.f13998e.q(0);
            this.f13999f.setVisibility(8);
        }
    }

    public final void b(boolean z10) {
        if (z10 == this.f14005l) {
            return;
        }
        this.f14005l = z10;
        int size = this.f14006m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14006m.get(i10).a();
        }
    }

    public final Context c() {
        if (this.f13995b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13994a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f13995b = new ContextThemeWrapper(this.f13994a, i10);
            } else {
                this.f13995b = this.f13994a;
            }
        }
        return this.f13995b;
    }

    public final void d(View view) {
        String str;
        j1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f13996c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof j1) {
            wrapper = (j1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            a10.append(str);
            throw new IllegalStateException(a10.toString());
        }
        this.f13998e = wrapper;
        this.f13999f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f13997d = actionBarContainer;
        j1 j1Var = this.f13998e;
        if (j1Var != null && this.f13999f != null && actionBarContainer != null) {
            this.f13994a = j1Var.e();
            if ((this.f13998e.r() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f14001h = true;
            }
            Context context = this.f13994a;
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f13998e.j();
            f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f13994a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13996c;
                if (actionBarOverlayLayout2.f1053h) {
                    this.f14015v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f13997d;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(w.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    public final void e(boolean z10) {
        if (this.f14001h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        int r10 = this.f13998e.r();
        this.f14001h = true;
        this.f13998e.l((i10 & 4) | (r10 & (-5)));
    }

    public final void f(boolean z10) {
        this.f14007n = z10;
        if (!z10) {
            this.f13998e.m();
            this.f13997d.setTabContainer(null);
        } else {
            this.f13997d.setTabContainer(null);
            this.f13998e.m();
        }
        this.f13998e.o();
        j1 j1Var = this.f13998e;
        boolean z11 = this.f14007n;
        j1Var.u(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13996c;
        boolean z12 = this.f14007n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z10) {
        boolean z11;
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        boolean z12 = this.f14010q;
        if (this.f14011r || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (z11) {
            if (!this.f14012s) {
                this.f14012s = true;
                k.h hVar = this.f14013t;
                if (hVar != null) {
                    hVar.a();
                }
                this.f13997d.setVisibility(0);
                if (this.f14008o == 0 && (this.f14014u || z10)) {
                    this.f13997d.setTranslationY(0.0f);
                    float f10 = -this.f13997d.getHeight();
                    if (z10) {
                        this.f13997d.getLocationInWindow(new int[]{0, 0});
                        f10 -= iArr2[1];
                    }
                    this.f13997d.setTranslationY(f10);
                    k.h hVar2 = new k.h();
                    i2 a10 = o0.a(this.f13997d);
                    a10.e(0.0f);
                    final c cVar = this.f14018y;
                    final View view4 = a10.f18125a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: k1.g2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) f.w.this.f13997d.getParent()).invalidate();
                                }
                            };
                        }
                        i2.a.a(view4.animate(), animatorUpdateListener);
                    }
                    if (!hVar2.f18059e) {
                        hVar2.f18055a.add(a10);
                    }
                    if (this.f14009p && (view3 = this.f14000g) != null) {
                        view3.setTranslationY(f10);
                        i2 a11 = o0.a(this.f14000g);
                        a11.e(0.0f);
                        if (!hVar2.f18059e) {
                            hVar2.f18055a.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z13 = hVar2.f18059e;
                    if (!z13) {
                        hVar2.f18057c = decelerateInterpolator;
                    }
                    if (!z13) {
                        hVar2.f18056b = 250L;
                    }
                    b bVar = this.f14017x;
                    if (!z13) {
                        hVar2.f18058d = bVar;
                    }
                    this.f14013t = hVar2;
                    hVar2.b();
                } else {
                    this.f13997d.setAlpha(1.0f);
                    this.f13997d.setTranslationY(0.0f);
                    if (this.f14009p && (view2 = this.f14000g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f14017x.e();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13996c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f14012s) {
            this.f14012s = false;
            k.h hVar3 = this.f14013t;
            if (hVar3 != null) {
                hVar3.a();
            }
            if (this.f14008o == 0 && (this.f14014u || z10)) {
                this.f13997d.setAlpha(1.0f);
                this.f13997d.setTransitioning(true);
                k.h hVar4 = new k.h();
                float f11 = -this.f13997d.getHeight();
                if (z10) {
                    this.f13997d.getLocationInWindow(new int[]{0, 0});
                    f11 -= iArr[1];
                }
                i2 a12 = o0.a(this.f13997d);
                a12.e(f11);
                final c cVar2 = this.f14018y;
                final View view5 = a12.f18125a.get();
                if (view5 != null) {
                    if (cVar2 != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: k1.g2
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) f.w.this.f13997d.getParent()).invalidate();
                            }
                        };
                    }
                    i2.a.a(view5.animate(), animatorUpdateListener);
                }
                if (!hVar4.f18059e) {
                    hVar4.f18055a.add(a12);
                }
                if (this.f14009p && (view = this.f14000g) != null) {
                    i2 a13 = o0.a(view);
                    a13.e(f11);
                    if (!hVar4.f18059e) {
                        hVar4.f18055a.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f13993z;
                boolean z14 = hVar4.f18059e;
                if (!z14) {
                    hVar4.f18057c = accelerateInterpolator;
                }
                if (!z14) {
                    hVar4.f18056b = 250L;
                }
                a aVar = this.f14016w;
                if (!z14) {
                    hVar4.f18058d = aVar;
                }
                this.f14013t = hVar4;
                hVar4.b();
                return;
            }
            this.f14016w.e();
        }
    }
}
