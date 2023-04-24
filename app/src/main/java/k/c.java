package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f */
    public static Configuration f18002f;

    /* renamed from: a */
    public int f18003a;

    /* renamed from: b */
    public Resources.Theme f18004b;

    /* renamed from: c */
    public LayoutInflater f18005c;

    /* renamed from: d */
    public Configuration f18006d;

    /* renamed from: e */
    public Resources f18007e;

    /* loaded from: classes.dex */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f18003a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f18004b = theme;
    }

    public final void a(Configuration configuration) {
        if (this.f18007e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f18006d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f18006d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f18004b == null) {
            this.f18004b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f18004b.setTo(theme);
            }
        }
        this.f18004b.applyStyle(this.f18003a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0022, code lost:
        if (r0.equals(k.c.f18002f) != false) goto L14;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f18007e
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f18006d
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = k.c.f18002f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            k.c.f18002f = r1
        L1c:
            android.content.res.Configuration r1 = k.c.f18002f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f18006d
            android.content.Context r0 = k.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f18007e = r0
        L36:
            android.content.res.Resources r0 = r3.f18007e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f18005c == null) {
                this.f18005c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f18005c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f18004b;
        if (theme != null) {
            return theme;
        }
        if (this.f18003a == 0) {
            this.f18003a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f18004b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f18003a != i10) {
            this.f18003a = i10;
            b();
        }
    }
}
