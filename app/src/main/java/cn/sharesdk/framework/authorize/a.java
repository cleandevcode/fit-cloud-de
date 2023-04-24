package cn.sharesdk.framework.authorize;

import android.app.Activity;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static volatile a f5200a;

    /* renamed from: b */
    private Activity f5201b;

    /* renamed from: c */
    private boolean f5202c;

    public static a c() {
        synchronized (a.class) {
            if (f5200a == null) {
                synchronized (a.class) {
                    if (f5200a == null) {
                        f5200a = new a();
                    }
                }
            }
        }
        return f5200a;
    }

    public void a(Activity activity) {
        this.f5201b = activity;
    }

    public void a(boolean z10) {
        this.f5202c = z10;
    }

    public boolean a() {
        return this.f5202c;
    }

    public Activity b() {
        return this.f5201b;
    }
}
