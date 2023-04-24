package yb;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b */
    public static HashMap f31378b = new HashMap();

    /* renamed from: c */
    public static r f31379c;

    /* renamed from: a */
    public z f31380a = new z();

    public static r a() {
        if (f31379c == null) {
            synchronized (r.class) {
                if (f31379c == null) {
                    f31379c = new r();
                }
            }
        }
        return f31379c;
    }
}
