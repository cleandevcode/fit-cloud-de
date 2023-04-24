package f;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.x2;
import androidx.appcompat.widget.z1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import k.a;
import k.e;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class j extends f.i implements f.a, LayoutInflater.Factory2 {

    /* renamed from: m0 */
    public static final o0.h<String, Integer> f13883m0 = new o0.h<>();

    /* renamed from: n0 */
    public static final int[] f13884n0 = {16842836};

    /* renamed from: o0 */
    public static final boolean f13885o0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: p0 */
    public static final boolean f13886p0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public k[] H;
    public k L;
    public boolean M;
    public boolean Q;
    public boolean U;
    public boolean V;
    public Configuration W;
    public int X;
    public int Y;
    public boolean Z;

    /* renamed from: c0 */
    public boolean f13887c0;

    /* renamed from: d */
    public final Object f13888d;

    /* renamed from: d0 */
    public i f13889d0;

    /* renamed from: e */
    public final Context f13890e;

    /* renamed from: e0 */
    public g f13891e0;

    /* renamed from: f */
    public Window f13892f;

    /* renamed from: f0 */
    public boolean f13893f0;

    /* renamed from: g */
    public f f13894g;

    /* renamed from: g0 */
    public int f13895g0;

    /* renamed from: h */
    public final f.h f13896h;

    /* renamed from: i */
    public w f13898i;

    /* renamed from: i0 */
    public boolean f13899i0;

    /* renamed from: j */
    public k.g f13900j;

    /* renamed from: j0 */
    public Rect f13901j0;

    /* renamed from: k */
    public CharSequence f13902k;

    /* renamed from: k0 */
    public Rect f13903k0;

    /* renamed from: l */
    public i1 f13904l;

    /* renamed from: l0 */
    public r f13905l0;

    /* renamed from: m */
    public b f13906m;

    /* renamed from: n */
    public l f13907n;

    /* renamed from: o */
    public k.a f13908o;

    /* renamed from: p */
    public ActionBarContextView f13909p;

    /* renamed from: q */
    public PopupWindow f13910q;

    /* renamed from: r */
    public m f13911r;

    /* renamed from: u */
    public boolean f13914u;

    /* renamed from: v */
    public ViewGroup f13915v;

    /* renamed from: w */
    public TextView f13916w;

    /* renamed from: x */
    public View f13917x;

    /* renamed from: y */
    public boolean f13918y;

    /* renamed from: z */
    public boolean f13919z;

    /* renamed from: s */
    public i2 f13912s = null;

    /* renamed from: t */
    public boolean f13913t = true;

    /* renamed from: h0 */
    public final a f13897h0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            if ((jVar.f13895g0 & 1) != 0) {
                jVar.E(0);
            }
            j jVar2 = j.this;
            if ((jVar2.f13895g0 & 4096) != 0) {
                jVar2.E(108);
            }
            j jVar3 = j.this;
            jVar3.f13893f0 = false;
            jVar3.f13895g0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements j.a {
        public b() {
            j.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            j.this.A(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback J = j.this.J();
            if (J != null) {
                J.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0312a {

        /* renamed from: a */
        public a.InterfaceC0312a f13922a;

        /* loaded from: classes.dex */
        public class a extends com.bumptech.glide.manager.g {
            public a() {
                c.this = r1;
            }

            @Override // k1.j2
            public final void e() {
                j.this.f13909p.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.f13910q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.f13909p.getParent() instanceof View) {
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.h.c((View) j.this.f13909p.getParent());
                }
                j.this.f13909p.h();
                j.this.f13912s.d(null);
                j jVar2 = j.this;
                jVar2.f13912s = null;
                ViewGroup viewGroup = jVar2.f13915v;
                WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                o0.h.c(viewGroup);
            }
        }

        public c(e.a aVar) {
            j.this = r1;
            this.f13922a = aVar;
        }

        @Override // k.a.InterfaceC0312a
        public final boolean a(k.a aVar, MenuItem menuItem) {
            return this.f13922a.a(aVar, menuItem);
        }

        @Override // k.a.InterfaceC0312a
        public final boolean b(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = j.this.f13915v;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.h.c(viewGroup);
            return this.f13922a.b(aVar, fVar);
        }

        @Override // k.a.InterfaceC0312a
        public final boolean c(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f13922a.c(aVar, fVar);
        }

        @Override // k.a.InterfaceC0312a
        public final void d(k.a aVar) {
            this.f13922a.d(aVar);
            j jVar = j.this;
            if (jVar.f13910q != null) {
                jVar.f13892f.getDecorView().removeCallbacks(j.this.f13911r);
            }
            j jVar2 = j.this;
            if (jVar2.f13909p != null) {
                i2 i2Var = jVar2.f13912s;
                if (i2Var != null) {
                    i2Var.b();
                }
                j jVar3 = j.this;
                i2 a10 = o0.a(jVar3.f13909p);
                a10.a(0.0f);
                jVar3.f13912s = a10;
                j.this.f13912s.d(new a());
            }
            f.h hVar = j.this.f13896h;
            if (hVar != null) {
                hVar.w();
            }
            j jVar4 = j.this;
            jVar4.f13908o = null;
            ViewGroup viewGroup = jVar4.f13915v;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.h.c(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode & 3;
            if (i10 != i11) {
                configuration3.colorMode |= i11;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode & 12;
            if (i12 != i13) {
                configuration3.colorMode |= i13;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends h {

        /* renamed from: c */
        public final PowerManager f13929c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super();
            j.this = r1;
            this.f13929c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // f.j.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // f.j.h
        public final int c() {
            return this.f13929c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // f.j.h
        public final void d() {
            j.this.d();
        }
    }

    /* loaded from: classes.dex */
    public abstract class h {

        /* renamed from: a */
        public a f13931a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
                h.this = r1;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                h.this.d();
            }
        }

        public h() {
            j.this = r1;
        }

        public final void a() {
            a aVar = this.f13931a;
            if (aVar != null) {
                try {
                    j.this.f13890e.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f13931a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f13931a == null) {
                this.f13931a = new a();
            }
            j.this.f13890e.registerReceiver(this.f13931a, b10);
        }
    }

    /* loaded from: classes.dex */
    public class i extends h {

        /* renamed from: c */
        public final v f13934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(v vVar) {
            super();
            j.this = r1;
            this.f13934c = vVar;
        }

        @Override // f.j.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:139:0x010e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
        @Override // f.j.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.j.i.c():int");
        }

        @Override // f.j.h
        public final void d() {
            j.this.d();
        }
    }

    /* renamed from: f.j$j */
    /* loaded from: classes.dex */
    public class C0246j extends ContentFrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0246j(k.c cVar) {
            super(cVar, null);
            j.this = r1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.D(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= -5 && y10 >= -5 && x10 <= getWidth() + 5 && y10 <= getHeight() + 5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    j jVar = j.this;
                    jVar.B(jVar.I(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a */
        public int f13937a;

        /* renamed from: b */
        public int f13938b;

        /* renamed from: c */
        public int f13939c;

        /* renamed from: d */
        public int f13940d;

        /* renamed from: e */
        public C0246j f13941e;

        /* renamed from: f */
        public View f13942f;

        /* renamed from: g */
        public View f13943g;

        /* renamed from: h */
        public androidx.appcompat.view.menu.f f13944h;

        /* renamed from: i */
        public androidx.appcompat.view.menu.d f13945i;

        /* renamed from: j */
        public k.c f13946j;

        /* renamed from: k */
        public boolean f13947k;

        /* renamed from: l */
        public boolean f13948l;

        /* renamed from: m */
        public boolean f13949m;

        /* renamed from: n */
        public boolean f13950n = false;

        /* renamed from: o */
        public boolean f13951o;

        /* renamed from: p */
        public Bundle f13952p;

        public k(int i10) {
            this.f13937a = i10;
        }
    }

    /* loaded from: classes.dex */
    public final class l implements j.a {
        public l() {
            j.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            boolean z11;
            int i10;
            k kVar;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i11 = 0;
            if (k10 != fVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            j jVar = j.this;
            if (z11) {
                fVar = k10;
            }
            k[] kVarArr = jVar.H;
            if (kVarArr != null) {
                i10 = kVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    kVar = kVarArr[i11];
                    if (kVar != null && kVar.f13944h == fVar) {
                        break;
                    }
                    i11++;
                } else {
                    kVar = null;
                    break;
                }
            }
            if (kVar != null) {
                j jVar2 = j.this;
                if (z11) {
                    jVar2.z(kVar.f13937a, kVar, k10);
                    j.this.B(kVar, true);
                    return;
                }
                jVar2.B(kVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            Window.Callback J;
            if (fVar == fVar.k()) {
                j jVar = j.this;
                if (!jVar.A || (J = jVar.J()) == null || j.this.V) {
                    return true;
                }
                J.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    public j(Context context, Window window, f.h hVar, Object obj) {
        o0.h<String, Integer> hVar2;
        Integer orDefault;
        androidx.appcompat.app.e eVar;
        this.X = -100;
        this.f13890e = context;
        this.f13896h = hVar;
        this.f13888d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof androidx.appcompat.app.e) {
                    eVar = (androidx.appcompat.app.e) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            eVar = null;
            if (eVar != null) {
                this.X = eVar.L().g();
            }
        }
        if (this.X == -100 && (orDefault = (hVar2 = f13883m0).getOrDefault(this.f13888d.getClass().getName(), null)) != null) {
            this.X = orDefault.intValue();
            hVar2.remove(this.f13888d.getClass().getName());
        }
        if (window != null) {
            y(window);
        }
        androidx.appcompat.widget.k.d();
    }

    public static Configuration C(Context context, int i10, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final void A(androidx.appcompat.view.menu.f fVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f13904l.j();
        Window.Callback J = J();
        if (J != null && !this.V) {
            J.onPanelClosed(108, fVar);
        }
        this.F = false;
    }

    public final void B(k kVar, boolean z10) {
        C0246j c0246j;
        i1 i1Var;
        if (z10 && kVar.f13937a == 0 && (i1Var = this.f13904l) != null && i1Var.a()) {
            A(kVar.f13944h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f13890e.getSystemService("window");
        if (windowManager != null && kVar.f13949m && (c0246j = kVar.f13941e) != null) {
            windowManager.removeView(c0246j);
            if (z10) {
                z(kVar.f13937a, kVar, null);
            }
        }
        kVar.f13947k = false;
        kVar.f13948l = false;
        kVar.f13949m = false;
        kVar.f13942f = null;
        kVar.f13950n = true;
        if (this.L == kVar) {
            this.L = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0131, code lost:
        if (r7 != false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.D(android.view.KeyEvent):boolean");
    }

    public final void E(int i10) {
        k I = I(i10);
        if (I.f13944h != null) {
            Bundle bundle = new Bundle();
            I.f13944h.t(bundle);
            if (bundle.size() > 0) {
                I.f13952p = bundle;
            }
            I.f13944h.w();
            I.f13944h.clear();
        }
        I.f13951o = true;
        I.f13950n = true;
        if ((i10 == 108 || i10 == 0) && this.f13904l != null) {
            k I2 = I(0);
            I2.f13947k = false;
            O(I2, null);
        }
    }

    public final void F() {
        int i10;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f13914u) {
            TypedArray obtainStyledAttributes = this.f13890e.obtainStyledAttributes(R.styleable.AppCompatTheme);
            int i11 = R.styleable.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i11)) {
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    r(1);
                } else if (obtainStyledAttributes.getBoolean(i11, false)) {
                    r(108);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                    r(109);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                    r(10);
                }
                this.D = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                G();
                this.f13892f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f13890e);
                if (!this.E) {
                    if (this.D) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.B = false;
                        this.A = false;
                    } else if (this.A) {
                        TypedValue typedValue = new TypedValue();
                        this.f13890e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.c(this.f13890e, typedValue.resourceId);
                        } else {
                            context = this.f13890e;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        i1 i1Var = (i1) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f13904l = i1Var;
                        i1Var.setWindowCallback(J());
                        if (this.B) {
                            this.f13904l.i(109);
                        }
                        if (this.f13918y) {
                            this.f13904l.i(2);
                        }
                        if (this.f13919z) {
                            this.f13904l.i(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.C) {
                        i10 = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i10 = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i10, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    f.k kVar = new f.k(this);
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.i.u(viewGroup, kVar);
                    if (this.f13904l == null) {
                        this.f13916w = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = x2.f1598a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f13892f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f13892f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new f.l(this));
                    this.f13915v = viewGroup;
                    Object obj = this.f13888d;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f13902k;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        i1 i1Var2 = this.f13904l;
                        if (i1Var2 != null) {
                            i1Var2.setWindowTitle(charSequence);
                        } else {
                            w wVar = this.f13898i;
                            if (wVar != null) {
                                wVar.f13998e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.f13916w;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f13915v.findViewById(16908290);
                    View decorView = this.f13892f.getDecorView();
                    contentFrameLayout2.f1106g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                    if (o0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f13890e.obtainStyledAttributes(R.styleable.AppCompatTheme);
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i12 = R.styleable.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i12)) {
                        obtainStyledAttributes2.getValue(i12, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i13 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i13)) {
                        obtainStyledAttributes2.getValue(i13, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i14 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i14)) {
                        obtainStyledAttributes2.getValue(i14, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i15 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i15)) {
                        obtainStyledAttributes2.getValue(i15, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f13914u = true;
                    k I = I(0);
                    if (!this.V && I.f13944h == null) {
                        this.f13895g0 |= 4096;
                        if (!this.f13893f0) {
                            o0.d.m(this.f13892f.getDecorView(), this.f13897h0);
                            this.f13893f0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder a10 = android.support.v4.media.d.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a10.append(this.A);
                a10.append(", windowActionBarOverlay: ");
                a10.append(this.B);
                a10.append(", android:windowIsFloating: ");
                a10.append(this.D);
                a10.append(", windowActionModeOverlay: ");
                a10.append(this.C);
                a10.append(", windowNoTitle: ");
                a10.append(this.E);
                a10.append(" }");
                throw new IllegalArgumentException(a10.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void G() {
        if (this.f13892f == null) {
            Object obj = this.f13888d;
            if (obj instanceof Activity) {
                y(((Activity) obj).getWindow());
            }
        }
        if (this.f13892f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final h H(Context context) {
        if (this.f13889d0 == null) {
            if (v.f13987d == null) {
                Context applicationContext = context.getApplicationContext();
                v.f13987d = new v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13889d0 = new i(v.f13987d);
        }
        return this.f13889d0;
    }

    public final k I(int i10) {
        k[] kVarArr = this.H;
        if (kVarArr == null || kVarArr.length <= i10) {
            k[] kVarArr2 = new k[i10 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.H = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i10];
        if (kVar == null) {
            k kVar2 = new k(i10);
            kVarArr[i10] = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public final Window.Callback J() {
        return this.f13892f.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            r3 = this;
            r3.F()
            boolean r0 = r3.A
            if (r0 == 0) goto L36
            f.w r0 = r3.f13898i
            if (r0 == 0) goto Lc
            goto L36
        Lc:
            java.lang.Object r0 = r3.f13888d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            f.w r0 = new f.w
            java.lang.Object r1 = r3.f13888d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.B
            r0.<init>(r1, r2)
            goto L2b
        L1e:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2d
            f.w r0 = new f.w
            java.lang.Object r1 = r3.f13888d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
        L2b:
            r3.f13898i = r0
        L2d:
            f.w r0 = r3.f13898i
            if (r0 == 0) goto L36
            boolean r1 = r3.f13899i0
            r0.e(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.K():void");
    }

    public final int L(Context context, int i10) {
        h H;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f13891e0 == null) {
                            this.f13891e0 = new g(context);
                        }
                        H = this.f13891e0;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                H = H(context);
            }
            return H.c();
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0151, code lost:
        if (r14 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0175, code lost:
        if (r14.f922g.getCount() > 0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(f.j.k r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.M(f.j$k, android.view.KeyEvent):void");
    }

    public final boolean N(k kVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.f13947k || O(kVar, keyEvent)) && (fVar = kVar.f13944h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean O(k kVar, KeyEvent keyEvent) {
        boolean z10;
        i1 i1Var;
        i1 i1Var2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        i1 i1Var3;
        i1 i1Var4;
        if (this.V) {
            return false;
        }
        if (kVar.f13947k) {
            return true;
        }
        k kVar2 = this.L;
        if (kVar2 != null && kVar2 != kVar) {
            B(kVar2, false);
        }
        Window.Callback J = J();
        if (J != null) {
            kVar.f13943g = J.onCreatePanelView(kVar.f13937a);
        }
        int i11 = kVar.f13937a;
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (i1Var4 = this.f13904l) != null) {
            i1Var4.b();
        }
        if (kVar.f13943g == null) {
            androidx.appcompat.view.menu.f fVar = kVar.f13944h;
            if (fVar == null || kVar.f13951o) {
                if (fVar == null) {
                    Context context = this.f13890e;
                    int i12 = kVar.f13937a;
                    if ((i12 == 0 || i12 == 108) && this.f13904l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            k.c cVar = new k.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f936e = this;
                    androidx.appcompat.view.menu.f fVar3 = kVar.f13944h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(kVar.f13945i);
                        }
                        kVar.f13944h = fVar2;
                        androidx.appcompat.view.menu.d dVar = kVar.f13945i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f932a);
                        }
                    }
                    if (kVar.f13944h == null) {
                        return false;
                    }
                }
                if (z10 && (i1Var2 = this.f13904l) != null) {
                    if (this.f13906m == null) {
                        this.f13906m = new b();
                    }
                    i1Var2.c(kVar.f13944h, this.f13906m);
                }
                kVar.f13944h.w();
                if (!J.onCreatePanelMenu(kVar.f13937a, kVar.f13944h)) {
                    androidx.appcompat.view.menu.f fVar4 = kVar.f13944h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(kVar.f13945i);
                        }
                        kVar.f13944h = null;
                    }
                    if (z10 && (i1Var = this.f13904l) != null) {
                        i1Var.c(null, this.f13906m);
                    }
                    return false;
                }
                kVar.f13951o = false;
            }
            kVar.f13944h.w();
            Bundle bundle = kVar.f13952p;
            if (bundle != null) {
                kVar.f13944h.s(bundle);
                kVar.f13952p = null;
            }
            if (!J.onPreparePanel(0, kVar.f13943g, kVar.f13944h)) {
                if (z10 && (i1Var3 = this.f13904l) != null) {
                    i1Var3.c(null, this.f13906m);
                }
                kVar.f13944h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            kVar.f13944h.setQwertyMode(z11);
            kVar.f13944h.v();
        }
        kVar.f13947k = true;
        kVar.f13948l = false;
        this.L = kVar;
        return true;
    }

    public final void P() {
        if (this.f13914u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        k kVar;
        Window.Callback J = J();
        if (J != null && !this.V) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            k[] kVarArr = this.H;
            if (kVarArr != null) {
                i10 = kVarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    kVar = kVarArr[i11];
                    if (kVar != null && kVar.f13944h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    kVar = null;
                    break;
                }
            }
            if (kVar != null) {
                return J.onMenuItemSelected(kVar.f13937a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i1 i1Var = this.f13904l;
        if (i1Var == null || !i1Var.d() || (ViewConfiguration.get(this.f13890e).hasPermanentMenuKey() && !this.f13904l.f())) {
            k I = I(0);
            I.f13950n = true;
            B(I, false);
            M(I, null);
            return;
        }
        Window.Callback J = J();
        if (this.f13904l.a()) {
            this.f13904l.g();
            if (this.V) {
                return;
            }
            J.onPanelClosed(108, I(0).f13944h);
        } else if (J == null || this.V) {
        } else {
            if (this.f13893f0 && (1 & this.f13895g0) != 0) {
                this.f13892f.getDecorView().removeCallbacks(this.f13897h0);
                this.f13897h0.run();
            }
            k I2 = I(0);
            androidx.appcompat.view.menu.f fVar2 = I2.f13944h;
            if (fVar2 == null || I2.f13951o || !J.onPreparePanel(0, I2.f13943g, fVar2)) {
                return;
            }
            J.onMenuOpened(108, I2.f13944h);
            this.f13904l.h();
        }
    }

    @Override // f.i
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        ((ViewGroup) this.f13915v.findViewById(16908290)).addView(view, layoutParams);
        this.f13894g.a(this.f13892f.getCallback());
    }

    @Override // f.i
    public final boolean d() {
        return x(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x0172  */
    @Override // f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Context e(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.e(android.content.Context):android.content.Context");
    }

    @Override // f.i
    public final <T extends View> T f(int i10) {
        F();
        return (T) this.f13892f.findViewById(i10);
    }

    @Override // f.i
    public final int g() {
        return this.X;
    }

    @Override // f.i
    public final MenuInflater h() {
        if (this.f13900j == null) {
            K();
            w wVar = this.f13898i;
            this.f13900j = new k.g(wVar != null ? wVar.c() : this.f13890e);
        }
        return this.f13900j;
    }

    @Override // f.i
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f13890e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof j)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // f.i
    public final void j() {
        if (this.f13898i != null) {
            K();
            this.f13898i.getClass();
            this.f13895g0 |= 1;
            if (!this.f13893f0) {
                View decorView = this.f13892f.getDecorView();
                a aVar = this.f13897h0;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.m(decorView, aVar);
                this.f13893f0 = true;
            }
        }
    }

    @Override // f.i
    public final void k(Configuration configuration) {
        if (this.A && this.f13914u) {
            K();
            w wVar = this.f13898i;
            if (wVar != null) {
                wVar.f(wVar.f13994a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.k a10 = androidx.appcompat.widget.k.a();
        Context context = this.f13890e;
        synchronized (a10) {
            z1 z1Var = a10.f1386a;
            synchronized (z1Var) {
                o0.e<WeakReference<Drawable.ConstantState>> eVar = z1Var.f1605d.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.W = new Configuration(this.f13890e.getResources().getConfiguration());
        x(false);
        configuration.updateFrom(this.f13890e.getResources().getConfiguration());
    }

    @Override // f.i
    public final void l() {
        this.Q = true;
        x(false);
        G();
        Object obj = this.f13888d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = x0.p.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                w wVar = this.f13898i;
                if (wVar == null) {
                    this.f13899i0 = true;
                } else {
                    wVar.e(true);
                }
            }
            synchronized (f.i.f13882c) {
                f.i.q(this);
                f.i.f13881b.add(new WeakReference<>(this));
            }
        }
        this.W = new Configuration(this.f13890e.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // f.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13888d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = f.i.f13882c
            monitor-enter(r0)
            f.i.q(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f13893f0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f13892f
            android.view.View r0 = r0.getDecorView()
            f.j$a r1 = r3.f13897h0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f13888d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            o0.h<java.lang.String, java.lang.Integer> r0 = f.j.f13883m0
            java.lang.Object r1 = r3.f13888d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            o0.h<java.lang.String, java.lang.Integer> r0 = f.j.f13883m0
            java.lang.Object r1 = r3.f13888d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            f.j$i r0 = r3.f13889d0
            if (r0 == 0) goto L63
            r0.a()
        L63:
            f.j$g r0 = r3.f13891e0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.m():void");
    }

    @Override // f.i
    public final void n() {
        K();
        w wVar = this.f13898i;
        if (wVar != null) {
            wVar.f14014u = true;
        }
    }

    @Override // f.i
    public final void o() {
        d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0208 A[Catch: all -> 0x0214, Exception -> 0x021c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x021c, all -> 0x0214, blocks: (B:264:0x01db, B:267:0x01ea, B:269:0x01ee, B:274:0x0208), top: B:307:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0225  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // f.i
    public final void p() {
        K();
        w wVar = this.f13898i;
        if (wVar != null) {
            wVar.f14014u = false;
            k.h hVar = wVar.f14013t;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    @Override // f.i
    public final boolean r(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.E && i10 == 108) {
            return false;
        }
        if (this.A && i10 == 1) {
            this.A = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f13892f.requestFeature(i10);
                            }
                            P();
                            this.B = true;
                            return true;
                        }
                        P();
                        this.A = true;
                        return true;
                    }
                    P();
                    this.C = true;
                    return true;
                }
                P();
                this.f13919z = true;
                return true;
            }
            P();
            this.f13918y = true;
            return true;
        }
        P();
        this.E = true;
        return true;
    }

    @Override // f.i
    public final void s(int i10) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.f13915v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13890e).inflate(i10, viewGroup);
        this.f13894g.a(this.f13892f.getCallback());
    }

    @Override // f.i
    public final void t(View view) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.f13915v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13894g.a(this.f13892f.getCallback());
    }

    @Override // f.i
    public final void u(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        ViewGroup viewGroup = (ViewGroup) this.f13915v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13894g.a(this.f13892f.getCallback());
    }

    @Override // f.i
    public final void v(int i10) {
        this.Y = i10;
    }

    @Override // f.i
    public final void w(CharSequence charSequence) {
        this.f13902k = charSequence;
        i1 i1Var = this.f13904l;
        if (i1Var != null) {
            i1Var.setWindowTitle(charSequence);
            return;
        }
        w wVar = this.f13898i;
        if (wVar != null) {
            wVar.f13998e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f13916w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(boolean r12) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.j.x(boolean):boolean");
    }

    public final void y(Window window) {
        int resourceId;
        Drawable g10;
        if (this.f13892f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof f)) {
                f fVar = new f(callback);
                this.f13894g = fVar;
                window.setCallback(fVar);
                Context context = this.f13890e;
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f13884n0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.k a10 = androidx.appcompat.widget.k.a();
                    synchronized (a10) {
                        g10 = a10.f1386a.g(context, resourceId, true);
                    }
                    drawable = g10;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f13892f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void z(int i10, k kVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (kVar == null && i10 >= 0) {
                k[] kVarArr = this.H;
                if (i10 < kVarArr.length) {
                    kVar = kVarArr[i10];
                }
            }
            if (kVar != null) {
                fVar = kVar.f13944h;
            }
        }
        if ((kVar == null || kVar.f13949m) && !this.V) {
            f fVar2 = this.f13894g;
            Window.Callback callback = this.f13892f.getCallback();
            fVar2.getClass();
            try {
                fVar2.f13927d = true;
                callback.onPanelClosed(i10, fVar);
            } finally {
                fVar2.f13927d = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class f extends k.j {

        /* renamed from: b */
        public boolean f13925b;

        /* renamed from: c */
        public boolean f13926c;

        /* renamed from: d */
        public boolean f13927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Window.Callback callback) {
            super(callback);
            j.this = r1;
        }

        public final void a(Window.Callback callback) {
            try {
                this.f13925b = true;
                callback.onContentChanged();
            } finally {
                this.f13925b = false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:163:0x0183, code lost:
            if (k1.o0.g.c(r1) != false) goto L73;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final k.e b(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 495
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.j.f.b(android.view.ActionMode$Callback):k.e");
        }

        @Override // k.j, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f13926c) {
                return this.f18064a.dispatchKeyEvent(keyEvent);
            }
            if (!j.this.D(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0038, code lost:
            if (r3 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0065, code lost:
            if (r7 != false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:72:0x006d A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        @Override // k.j, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r7)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L6e
                f.j r0 = f.j.this
                int r3 = r7.getKeyCode()
                r0.K()
                f.w r4 = r0.f13898i
                if (r4 == 0) goto L3b
                f.w$d r4 = r4.f14002i
                if (r4 != 0) goto L1a
                goto L37
            L1a:
                androidx.appcompat.view.menu.f r4 = r4.f14023d
                if (r4 == 0) goto L37
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L2e
                r5 = 1
                goto L2f
            L2e:
                r5 = 0
            L2f:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r2)
                goto L38
            L37:
                r3 = 0
            L38:
                if (r3 == 0) goto L3b
                goto L67
            L3b:
                f.j$k r3 = r0.L
                if (r3 == 0) goto L50
                int r4 = r7.getKeyCode()
                boolean r3 = r0.N(r3, r4, r7)
                if (r3 == 0) goto L50
                f.j$k r7 = r0.L
                if (r7 == 0) goto L67
                r7.f13948l = r1
                goto L67
            L50:
                f.j$k r3 = r0.L
                if (r3 != 0) goto L69
                f.j$k r3 = r0.I(r2)
                r0.O(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.N(r3, r4, r7)
                r3.f13947k = r2
                if (r7 == 0) goto L69
            L67:
                r7 = 1
                goto L6a
            L69:
                r7 = 0
            L6a:
                if (r7 == 0) goto L6d
                goto L6e
            L6d:
                r1 = 0
            L6e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f.j.f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f13925b) {
                this.f18064a.onContentChanged();
            }
        }

        @Override // k.j, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // k.j, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // k.j, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            j jVar = j.this;
            if (i10 == 108) {
                jVar.K();
                w wVar = jVar.f13898i;
                if (wVar != null) {
                    wVar.b(true);
                }
            } else {
                jVar.getClass();
            }
            return true;
        }

        @Override // k.j, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f13927d) {
                this.f18064a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            j jVar = j.this;
            if (i10 == 108) {
                jVar.K();
                w wVar = jVar.f13898i;
                if (wVar != null) {
                    wVar.b(false);
                }
            } else if (i10 == 0) {
                k I = jVar.I(i10);
                if (I.f13949m) {
                    jVar.B(I, false);
                }
            } else {
                jVar.getClass();
            }
        }

        @Override // k.j, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f955x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f955x = false;
            }
            return onPreparePanel;
        }

        @Override // k.j, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = j.this.I(0).f13944h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // k.j, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return j.this.f13913t ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // k.j, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (j.this.f13913t && i10 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }
}
