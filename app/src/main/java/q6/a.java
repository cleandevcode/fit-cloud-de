package q6;

import gm.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements d6.h {

    /* renamed from: b */
    public static final a f24602b;

    /* renamed from: c */
    public static final /* synthetic */ a[] f24603c;

    /* renamed from: a */
    public final int f24604a = 20170417;

    static {
        a aVar = new a();
        f24602b = aVar;
        f24603c = new a[]{aVar};
    }

    public static a valueOf(String str) {
        l.f(str, "value");
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(f24603c, 1);
    }

    @Override // d6.h
    public final int a() {
        return this.f24604a;
    }

    @Override // d6.h
    public final String c() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }
}
