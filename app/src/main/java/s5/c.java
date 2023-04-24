package s5;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    public static SensorManager f26583c;

    /* renamed from: d */
    public static g f26584d;

    /* renamed from: e */
    public static String f26585e;

    /* renamed from: h */
    public static volatile boolean f26588h;

    /* renamed from: a */
    public static final c f26581a = new c();

    /* renamed from: b */
    public static final h f26582b = new h();

    /* renamed from: f */
    public static final AtomicBoolean f26586f = new AtomicBoolean(true);

    /* renamed from: g */
    public static final AtomicBoolean f26587g = new AtomicBoolean(false);

    public static final String a() {
        if (i6.a.b(c.class)) {
            return null;
        }
        try {
            if (f26585e == null) {
                f26585e = UUID.randomUUID().toString();
            }
            String str = f26585e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            i6.a.a(c.class, th2);
            return null;
        }
    }
}
