package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.l2;
import cn.sharesdk.framework.Platform;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k1.w;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f18020e;

    /* renamed from: f */
    public static final Class<?>[] f18021f;

    /* renamed from: a */
    public final Object[] f18022a;

    /* renamed from: b */
    public final Object[] f18023b;

    /* renamed from: c */
    public Context f18024c;

    /* renamed from: d */
    public Object f18025d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f18026c = {MenuItem.class};

        /* renamed from: a */
        public Object f18027a;

        /* renamed from: b */
        public Method f18028b;

        public a(Object obj, String str) {
            this.f18027a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f18028b = cls.getMethod(str, f18026c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException(f.a(cls, androidx.activity.result.d.a("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f18028b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f18028b.invoke(this.f18027a, menuItem)).booleanValue();
                }
                this.f18028b.invoke(this.f18027a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a */
        public Menu f18029a;

        /* renamed from: h */
        public boolean f18036h;

        /* renamed from: i */
        public int f18037i;

        /* renamed from: j */
        public int f18038j;

        /* renamed from: k */
        public CharSequence f18039k;

        /* renamed from: l */
        public CharSequence f18040l;

        /* renamed from: m */
        public int f18041m;

        /* renamed from: n */
        public char f18042n;

        /* renamed from: o */
        public int f18043o;

        /* renamed from: p */
        public char f18044p;

        /* renamed from: q */
        public int f18045q;

        /* renamed from: r */
        public int f18046r;

        /* renamed from: s */
        public boolean f18047s;

        /* renamed from: t */
        public boolean f18048t;

        /* renamed from: u */
        public boolean f18049u;

        /* renamed from: v */
        public int f18050v;

        /* renamed from: w */
        public int f18051w;

        /* renamed from: x */
        public String f18052x;

        /* renamed from: y */
        public String f18053y;

        /* renamed from: z */
        public k1.b f18054z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b */
        public int f18030b = 0;

        /* renamed from: c */
        public int f18031c = 0;

        /* renamed from: d */
        public int f18032d = 0;

        /* renamed from: e */
        public int f18033e = 0;

        /* renamed from: f */
        public boolean f18034f = true;

        /* renamed from: g */
        public boolean f18035g = true;

        public b(Menu menu) {
            g.this = r1;
            this.f18029a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f18024c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10;
            MenuItem enabled = menuItem.setChecked(this.f18047s).setVisible(this.f18048t).setEnabled(this.f18049u);
            boolean z11 = false;
            if (this.f18046r >= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            enabled.setCheckable(z10).setTitleCondensed(this.f18040l).setIcon(this.f18041m);
            int i10 = this.f18050v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f18053y != null) {
                if (!g.this.f18024c.isRestricted()) {
                    g gVar = g.this;
                    if (gVar.f18025d == null) {
                        gVar.f18025d = g.a(gVar.f18024c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(gVar.f18025d, this.f18053y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f18046r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f982x = (hVar.f982x & (-5)) | 4;
                } else if (menuItem instanceof l.c) {
                    l.c cVar = (l.c) menuItem;
                    try {
                        if (cVar.f18652e == null) {
                            cVar.f18652e = cVar.f18651d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f18652e.invoke(cVar.f18651d, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f18052x;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.f18020e, g.this.f18022a));
                z11 = true;
            }
            int i11 = this.f18051w;
            if (i11 > 0) {
                if (!z11) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            k1.b bVar = this.f18054z;
            if (bVar != null) {
                if (menuItem instanceof c1.b) {
                    ((c1.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z12 = menuItem instanceof c1.b;
            if (z12) {
                ((c1.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z12) {
                ((c1.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w.m(menuItem, charSequence2);
            }
            char c10 = this.f18042n;
            int i12 = this.f18043o;
            if (z12) {
                ((c1.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w.g(menuItem, c10, i12);
            }
            char c11 = this.f18044p;
            int i13 = this.f18045q;
            if (z12) {
                ((c1.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                w.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z12) {
                    ((c1.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    w.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z12) {
                    ((c1.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    w.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f18020e = clsArr;
        f18021f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f18024c = context;
        Object[] objArr = {context};
        this.f18022a = objArr;
        this.f18023b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        char charAt;
        char charAt2;
        int i10;
        boolean z10;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException(a.b.b("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            str = null;
                            z12 = false;
                        } else if (name2.equals("group")) {
                            bVar.f18030b = 0;
                            bVar.f18031c = 0;
                            bVar.f18032d = 0;
                            bVar.f18033e = 0;
                            bVar.f18034f = true;
                            bVar.f18035g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f18036h) {
                                k1.b bVar2 = bVar.f18054z;
                                if (bVar2 != null && bVar2.a()) {
                                    bVar.f18036h = true;
                                    bVar.b(bVar.f18029a.addSubMenu(bVar.f18030b, bVar.f18037i, bVar.f18038j, bVar.f18039k).getItem());
                                } else {
                                    bVar.f18036h = true;
                                    bVar.b(bVar.f18029a.add(bVar.f18030b, bVar.f18037i, bVar.f18038j, bVar.f18039k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z11 = true;
                        }
                    }
                } else if (!z12) {
                    String name3 = xmlResourceParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = g.this.f18024c.obtainStyledAttributes(attributeSet, R.styleable.MenuGroup);
                        bVar.f18030b = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
                        bVar.f18031c = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
                        bVar.f18032d = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
                        bVar.f18033e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
                        bVar.f18034f = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
                        bVar.f18035g = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = g.this.f18024c;
                        l2 l2Var = new l2(context, context.obtainStyledAttributes(attributeSet, R.styleable.MenuItem));
                        bVar.f18037i = l2Var.i(R.styleable.MenuItem_android_id, 0);
                        bVar.f18038j = (l2Var.h(R.styleable.MenuItem_android_menuCategory, bVar.f18031c) & (-65536)) | (l2Var.h(R.styleable.MenuItem_android_orderInCategory, bVar.f18032d) & Platform.CUSTOMER_ACTION_MASK);
                        bVar.f18039k = l2Var.k(R.styleable.MenuItem_android_title);
                        bVar.f18040l = l2Var.k(R.styleable.MenuItem_android_titleCondensed);
                        bVar.f18041m = l2Var.i(R.styleable.MenuItem_android_icon, 0);
                        String j10 = l2Var.j(R.styleable.MenuItem_android_alphabeticShortcut);
                        if (j10 == null) {
                            charAt = 0;
                        } else {
                            charAt = j10.charAt(0);
                        }
                        bVar.f18042n = charAt;
                        bVar.f18043o = l2Var.h(R.styleable.MenuItem_alphabeticModifiers, 4096);
                        String j11 = l2Var.j(R.styleable.MenuItem_android_numericShortcut);
                        if (j11 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j11.charAt(0);
                        }
                        bVar.f18044p = charAt2;
                        bVar.f18045q = l2Var.h(R.styleable.MenuItem_numericModifiers, 4096);
                        int i11 = R.styleable.MenuItem_android_checkable;
                        if (l2Var.l(i11)) {
                            i10 = l2Var.a(i11, false);
                        } else {
                            i10 = bVar.f18033e;
                        }
                        bVar.f18046r = i10;
                        bVar.f18047s = l2Var.a(R.styleable.MenuItem_android_checked, false);
                        bVar.f18048t = l2Var.a(R.styleable.MenuItem_android_visible, bVar.f18034f);
                        bVar.f18049u = l2Var.a(R.styleable.MenuItem_android_enabled, bVar.f18035g);
                        bVar.f18050v = l2Var.h(R.styleable.MenuItem_showAsAction, -1);
                        bVar.f18053y = l2Var.j(R.styleable.MenuItem_android_onClick);
                        bVar.f18051w = l2Var.i(R.styleable.MenuItem_actionLayout, 0);
                        bVar.f18052x = l2Var.j(R.styleable.MenuItem_actionViewClass);
                        String j12 = l2Var.j(R.styleable.MenuItem_actionProviderClass);
                        if (j12 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && bVar.f18051w == 0 && bVar.f18052x == null) {
                            bVar.f18054z = (k1.b) bVar.a(j12, f18021f, g.this.f18023b);
                        } else {
                            if (z10) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f18054z = null;
                        }
                        bVar.A = l2Var.k(R.styleable.MenuItem_contentDescription);
                        bVar.B = l2Var.k(R.styleable.MenuItem_tooltipText);
                        int i12 = R.styleable.MenuItem_iconTintMode;
                        if (l2Var.l(i12)) {
                            bVar.D = k1.d(l2Var.h(i12, -1), bVar.D);
                        } else {
                            bVar.D = null;
                        }
                        int i13 = R.styleable.MenuItem_iconTint;
                        if (l2Var.l(i13)) {
                            bVar.C = l2Var.b(i13);
                        } else {
                            bVar.C = null;
                        }
                        l2Var.n();
                        bVar.f18036h = false;
                    } else if (name3.equals("menu")) {
                        bVar.f18036h = true;
                        SubMenu addSubMenu = bVar.f18029a.addSubMenu(bVar.f18030b, bVar.f18037i, bVar.f18038j, bVar.f18039k);
                        bVar.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        z12 = true;
                        str = name3;
                    }
                }
                eventType = xmlResourceParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof c1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f18024c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
