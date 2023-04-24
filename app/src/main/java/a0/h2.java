package a0;

import a0.h0;
import a0.l0;
import a0.u1;
import android.util.Range;
import androidx.camera.core.t;

/* loaded from: classes.dex */
public interface h2<T extends androidx.camera.core.t> extends e0.i<T>, e0.k, y0 {

    /* renamed from: l */
    public static final d f97l = l0.a.a("camerax.core.useCase.defaultSessionConfig", u1.class);

    /* renamed from: m */
    public static final d f98m = l0.a.a("camerax.core.useCase.defaultCaptureConfig", h0.class);

    /* renamed from: n */
    public static final d f99n = l0.a.a("camerax.core.useCase.sessionConfigUnpacker", u1.d.class);

    /* renamed from: o */
    public static final d f100o = l0.a.a("camerax.core.useCase.captureConfigUnpacker", h0.b.class);

    /* renamed from: p */
    public static final d f101p = l0.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: q */
    public static final d f102q = l0.a.a("camerax.core.useCase.cameraSelector", y.p.class);

    /* renamed from: r */
    public static final d f103r = l0.a.a("camerax.core.useCase.targetFrameRate", y.p.class);

    /* renamed from: s */
    public static final d f104s = l0.a.a("camerax.core.useCase.zslDisabled", Boolean.TYPE);

    /* loaded from: classes.dex */
    public interface a<T extends androidx.camera.core.t, C extends h2<T>, B> extends y.z<T> {
        C c();
    }

    Range i();

    u1 j();

    int k();

    u1.d l();

    y.p r();

    boolean w();
}
