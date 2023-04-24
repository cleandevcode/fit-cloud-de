package q6;

import gm.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements d6.h {

    /* renamed from: b */
    public static final j f24626b;

    /* renamed from: c */
    public static final /* synthetic */ j[] f24627c;

    /* renamed from: a */
    public final int f24628a = 20170417;

    static {
        j jVar = new j();
        f24626b = jVar;
        f24627c = new j[]{jVar};
    }

    public static j valueOf(String str) {
        l.f(str, "value");
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) Arrays.copyOf(f24627c, 1);
    }

    @Override // d6.h
    public final int a() {
        return this.f24628a;
    }

    @Override // d6.h
    public final String c() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }
}
