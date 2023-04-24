package a0;

import a0.l0;
import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public interface a1 extends t1 {

    /* renamed from: e  reason: collision with root package name */
    public static final d f9e = l0.a.a("camerax.core.imageOutput.targetAspectRatio", y.c.class);

    /* renamed from: f  reason: collision with root package name */
    public static final d f10f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f11g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f12h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f13i;

    /* renamed from: j  reason: collision with root package name */
    public static final d f14j;

    /* renamed from: k  reason: collision with root package name */
    public static final d f15k;

    /* loaded from: classes.dex */
    public interface a<B> {
        B a(Size size);

        B d(int i10);
    }

    static {
        Class cls = Integer.TYPE;
        f10f = l0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f11g = l0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f12h = l0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f13i = l0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f14j = l0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f15k = l0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
    }

    List g();

    Size o();

    Size q();

    boolean s();

    int t();

    Size v();

    int x(int i10);

    int y();
}
