package androidx.camera.core;

import a0.a1;
import a0.d1;
import a0.h2;
import a0.i1;
import a0.i2;
import a0.j1;
import a0.j2;
import a0.k0;
import a0.l0;
import a0.n1;
import a0.u1;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.v;
import y.l1;
import y.u0;

@Deprecated
/* loaded from: classes.dex */
public final class u extends t {

    /* renamed from: t */
    public static final c f1812t = new c();

    /* renamed from: m */
    public HandlerThread f1813m;

    /* renamed from: n */
    public HandlerThread f1814n;

    /* renamed from: o */
    public MediaCodec f1815o;

    /* renamed from: p */
    public MediaCodec f1816p;

    /* renamed from: q */
    public u1.b f1817q;

    /* renamed from: r */
    public Surface f1818r;

    /* renamed from: s */
    public d1 f1819s;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(MediaCodec.CodecException codecException) {
            int errorCode;
            errorCode = codecException.getErrorCode();
            return errorCode;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h2.a<u, j2, b>, a1.a<b> {

        /* renamed from: a */
        public final j1 f1820a;

        public b(j1 j1Var) {
            Object obj;
            this.f1820a = j1Var;
            Object obj2 = null;
            try {
                obj = j1Var.c(e0.i.f13307v);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(u.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f1820a.E(e0.i.f13307v, u.class);
            j1 j1Var2 = this.f1820a;
            a0.d dVar = e0.i.f13306u;
            j1Var2.getClass();
            try {
                obj2 = j1Var2.c(dVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f1820a.E(e0.i.f13306u, u.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // a0.a1.a
        public final b a(Size size) {
            this.f1820a.E(a1.f12h, size);
            return this;
        }

        @Override // y.z
        public final i1 b() {
            return this.f1820a;
        }

        @Override // a0.h2.a
        public final j2 c() {
            return new j2(n1.A(this.f1820a));
        }

        @Override // a0.a1.a
        public final b d(int i10) {
            this.f1820a.E(a1.f10f, Integer.valueOf(i10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final j2 f1821a;

        static {
            Size size = new Size(1920, 1080);
            j1 B = j1.B();
            new b(B);
            B.E(j2.f115z, 30);
            B.E(j2.A, 8388608);
            B.E(j2.B, 1);
            B.E(j2.C, 64000);
            B.E(j2.D, 8000);
            B.E(j2.E, 1);
            B.E(j2.F, Integer.valueOf((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED));
            B.E(a1.f14j, size);
            B.E(h2.f101p, 3);
            B.E(a1.f9e, 1);
            f1821a = new j2(n1.A(B));
        }
    }

    public static MediaFormat y(j2 j2Var, Size size) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        createVideoFormat.setInteger("color-format", 2130708361);
        j2Var.getClass();
        createVideoFormat.setInteger("bitrate", ((Integer) ((n1) j2Var.b()).c(j2.A)).intValue());
        createVideoFormat.setInteger("frame-rate", ((Integer) ((n1) j2Var.b()).c(j2.f115z)).intValue());
        createVideoFormat.setInteger("i-frame-interval", ((Integer) ((n1) j2Var.b()).c(j2.B)).intValue());
        return createVideoFormat;
    }

    public final void A() {
        this.f1813m.quitSafely();
        this.f1814n.quitSafely();
        MediaCodec mediaCodec = this.f1816p;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f1816p = null;
        }
        if (this.f1818r != null) {
            z(true);
        }
    }

    public final void B(Size size, String str) {
        StringBuilder sb2;
        j2 j2Var = (j2) this.f1805f;
        this.f1815o.reset();
        try {
            this.f1815o.configure(y(j2Var, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.f1818r != null) {
                z(false);
            }
            Surface createInputSurface = this.f1815o.createInputSurface();
            this.f1818r = createInputSurface;
            this.f1817q = u1.b.e(j2Var);
            d1 d1Var = this.f1819s;
            if (d1Var != null) {
                d1Var.a();
            }
            d1 d1Var2 = new d1(this.f1818r, size, e());
            this.f1819s = d1Var2;
            na.a<Void> d10 = d1Var2.d();
            Objects.requireNonNull(createInputSurface);
            d10.a(new androidx.activity.b(3, createInputSurface), o8.b.p());
            u1.b bVar = this.f1817q;
            d1 d1Var3 = this.f1819s;
            bVar.getClass();
            bVar.f189a.add(u1.e.a(d1Var3).a());
            u1.b bVar2 = this.f1817q;
            bVar2.f193e.add(new l1(this, str, size));
            x(this.f1817q.d());
            throw null;
        } catch (MediaCodec.CodecException e10) {
            if (Build.VERSION.SDK_INT >= 23) {
                int a10 = a.a(e10);
                String diagnosticInfo = e10.getDiagnosticInfo();
                if (a10 == 1100) {
                    sb2 = new StringBuilder();
                } else if (a10 == 1101) {
                    sb2 = new StringBuilder();
                } else {
                    return;
                }
                sb2.append("CodecException: code: ");
                sb2.append(a10);
                sb2.append(" diagnostic: ");
                sb2.append(diagnosticInfo);
                u0.d("VideoCapture", sb2.toString());
            }
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    public final void C() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            o8.b.p().execute(new s.m(4, this));
            return;
        }
        u0.d("VideoCapture", "stopRecording");
        u1.b bVar = this.f1817q;
        bVar.f189a.clear();
        bVar.f190b.f89a.clear();
        u1.b bVar2 = this.f1817q;
        d1 d1Var = this.f1819s;
        bVar2.getClass();
        bVar2.f189a.add(u1.e.a(d1Var).a());
        x(this.f1817q.d());
        Iterator it = this.f1800a.iterator();
        while (it.hasNext()) {
            ((t.b) it.next()).f(this);
        }
    }

    @Override // androidx.camera.core.t
    public final h2<?> d(boolean z10, i2 i2Var) {
        l0 a10 = i2Var.a(i2.b.VIDEO_CAPTURE, 1);
        if (z10) {
            f1812t.getClass();
            a10 = k0.e(a10, c.f1821a);
        }
        if (a10 == null) {
            return null;
        }
        return new j2(n1.A(((b) h(a10)).f1820a));
    }

    @Override // androidx.camera.core.t
    public final h2.a<?, ?, ?> h(l0 l0Var) {
        return new b(j1.C(l0Var));
    }

    @Override // androidx.camera.core.t
    public final void n() {
        this.f1813m = new HandlerThread("CameraX-video encoding thread");
        this.f1814n = new HandlerThread("CameraX-audio encoding thread");
        this.f1813m.start();
        new Handler(this.f1813m.getLooper());
        this.f1814n.start();
        new Handler(this.f1814n.getLooper());
    }

    @Override // androidx.camera.core.t
    public final void q() {
        C();
        A();
    }

    @Override // androidx.camera.core.t
    public final void s() {
        C();
    }

    @Override // androidx.camera.core.t
    public final Size t(Size size) {
        if (this.f1818r != null) {
            this.f1815o.stop();
            this.f1815o.release();
            this.f1816p.stop();
            this.f1816p.release();
            z(false);
        }
        try {
            this.f1815o = MediaCodec.createEncoderByType("video/avc");
            this.f1816p = MediaCodec.createEncoderByType("audio/mp4a-latm");
            B(size, c());
            this.f1802c = 1;
            l();
            return size;
        } catch (IOException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("Unable to create MediaCodec due to: ");
            a10.append(e10.getCause());
            throw new IllegalStateException(a10.toString());
        }
    }

    public final void z(boolean z10) {
        d1 d1Var = this.f1819s;
        if (d1Var == null) {
            return;
        }
        MediaCodec mediaCodec = this.f1815o;
        d1Var.a();
        this.f1819s.d().a(new v(z10, mediaCodec), o8.b.p());
        if (z10) {
            this.f1815o = null;
        }
        this.f1818r = null;
        this.f1819s = null;
    }
}
