package yb;

import android.content.Context;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c */
    public static q f31375c;

    /* renamed from: a */
    public Context f31376a;

    /* renamed from: b */
    public final Object f31377b = new Object();

    public static q a() {
        if (f31375c == null) {
            synchronized (q.class) {
                if (f31375c == null) {
                    f31375c = new q();
                }
            }
        }
        return f31375c;
    }
}
