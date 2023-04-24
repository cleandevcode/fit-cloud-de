package s;

import a0.c1;
import a0.u1;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y2 implements v2 {

    /* renamed from: a */
    public final HashMap f26249a;

    /* renamed from: b */
    public final t.t f26250b;

    /* renamed from: c */
    public final i0.c f26251c;

    /* renamed from: d */
    public boolean f26252d = false;

    /* renamed from: e */
    public boolean f26253e = false;

    /* renamed from: f */
    public boolean f26254f;

    /* renamed from: g */
    public androidx.camera.core.o f26255g;

    /* renamed from: h */
    public l.a f26256h;

    /* renamed from: i */
    public a0.d1 f26257i;

    /* renamed from: j */
    public ImageWriter f26258j;

    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.StateCallback {
        public a() {
            y2.this = r1;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface;
            inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                y2.this.f26258j = f0.a.a(1, inputSurface);
            }
        }
    }

    public y2(t.t tVar) {
        boolean z10;
        HashMap hashMap;
        int[] inputFormats;
        int[] inputFormats2;
        Size[] inputSizes;
        this.f26254f = false;
        this.f26250b = tVar;
        int[] iArr = (int[]) tVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 4) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        this.f26254f = z10;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f26250b.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            inputFormats = streamConfigurationMap.getInputFormats();
            if (inputFormats != null) {
                hashMap = new HashMap();
                inputFormats2 = streamConfigurationMap.getInputFormats();
                for (int i11 : inputFormats2) {
                    inputSizes = streamConfigurationMap.getInputSizes(i11);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new b0.d(true));
                        hashMap.put(Integer.valueOf(i11), inputSizes[0]);
                    }
                }
                this.f26249a = hashMap;
                this.f26251c = new i0.c(new x2(0));
            }
        }
        hashMap = new HashMap();
        this.f26249a = hashMap;
        this.f26251c = new i0.c(new x2(0));
    }

    @Override // s.v2
    public final void a(u1.b bVar) {
        boolean isEmpty;
        boolean z10;
        int[] validOutputFormatsForInput;
        androidx.camera.core.j removeLast;
        i0.c cVar = this.f26251c;
        while (true) {
            synchronized (cVar.f16195b) {
                isEmpty = cVar.f16194a.isEmpty();
            }
            if (isEmpty) {
                break;
            }
            synchronized (cVar.f16195b) {
                removeLast = cVar.f16194a.removeLast();
            }
            removeLast.close();
        }
        a0.d1 d1Var = this.f26257i;
        if (d1Var != null) {
            androidx.camera.core.o oVar = this.f26255g;
            if (oVar != null) {
                d1Var.d().a(new androidx.appcompat.widget.r2(2, oVar), o8.b.p());
                this.f26255g = null;
            }
            d1Var.a();
            this.f26257i = null;
        }
        ImageWriter imageWriter = this.f26258j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f26258j = null;
        }
        if (!this.f26252d && this.f26254f && !this.f26249a.isEmpty() && this.f26249a.containsKey(34)) {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f26250b.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i10 : validOutputFormatsForInput) {
                    if (i10 == 256) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (z10) {
                Size size = (Size) this.f26249a.get(34);
                androidx.camera.core.l lVar = new androidx.camera.core.l(size.getWidth(), size.getHeight(), 34, 9);
                this.f26256h = lVar.f1721b;
                this.f26255g = new androidx.camera.core.o(lVar);
                lVar.j(new c1.a() { // from class: s.w2
                    @Override // a0.c1.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void a(a0.c1 r6) {
                        /*
                            r5 = this;
                            int r0 = r1
                            r1 = 0
                            switch(r0) {
                                case 0: goto L7;
                                default: goto L6;
                            }
                        L6:
                            goto L71
                        L7:
                            java.lang.Object r0 = r2
                            s.y2 r0 = (s.y2) r0
                            r0.getClass()
                            androidx.camera.core.j r6 = r6.g()     // Catch: java.lang.IllegalStateException -> L59
                            if (r6 == 0) goto L70
                            i0.c r0 = r0.f26251c     // Catch: java.lang.IllegalStateException -> L59
                            r0.getClass()     // Catch: java.lang.IllegalStateException -> L59
                            y.o0 r2 = r6.d0()     // Catch: java.lang.IllegalStateException -> L59
                            boolean r3 = r2 instanceof e0.c     // Catch: java.lang.IllegalStateException -> L59
                            if (r3 == 0) goto L25
                            e0.c r2 = (e0.c) r2     // Catch: java.lang.IllegalStateException -> L59
                            a0.s r1 = r2.f13287a     // Catch: java.lang.IllegalStateException -> L59
                        L25:
                            a0.o r2 = r1.i()     // Catch: java.lang.IllegalStateException -> L59
                            a0.o r3 = a0.o.LOCKED_FOCUSED     // Catch: java.lang.IllegalStateException -> L59
                            r4 = 0
                            if (r2 == r3) goto L37
                            a0.o r2 = r1.i()     // Catch: java.lang.IllegalStateException -> L59
                            a0.o r3 = a0.o.PASSIVE_FOCUSED     // Catch: java.lang.IllegalStateException -> L59
                            if (r2 == r3) goto L37
                            goto L4a
                        L37:
                            a0.n r2 = r1.g()     // Catch: java.lang.IllegalStateException -> L59
                            a0.n r3 = a0.n.CONVERGED     // Catch: java.lang.IllegalStateException -> L59
                            if (r2 == r3) goto L40
                            goto L4a
                        L40:
                            a0.p r1 = r1.e()     // Catch: java.lang.IllegalStateException -> L59
                            a0.p r2 = a0.p.CONVERGED     // Catch: java.lang.IllegalStateException -> L59
                            if (r1 == r2) goto L49
                            goto L4a
                        L49:
                            r4 = 1
                        L4a:
                            if (r4 == 0) goto L50
                            r0.a(r6)     // Catch: java.lang.IllegalStateException -> L59
                            goto L70
                        L50:
                            s.x2 r0 = r0.f16196c     // Catch: java.lang.IllegalStateException -> L59
                            r0.getClass()     // Catch: java.lang.IllegalStateException -> L59
                            r6.close()     // Catch: java.lang.IllegalStateException -> L59
                            goto L70
                        L59:
                            r6 = move-exception
                            java.lang.String r0 = "Failed to acquire latest image IllegalStateException = "
                            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
                            java.lang.String r6 = r6.getMessage()
                            r0.append(r6)
                            java.lang.String r6 = r0.toString()
                            java.lang.String r0 = "ZslControlImpl"
                            y.u0.b(r0, r6)
                        L70:
                            return
                        L71:
                            java.lang.Object r0 = r2
                            z.c r0 = (z.c) r0
                            r0.getClass()
                            androidx.camera.core.j r6 = r6.l()
                            java.util.Objects.requireNonNull(r6)
                            p.b.f()
                            r0.getClass()
                            r0.getClass()
                            r6 = 0
                            throw r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: s.w2.a(a0.c1):void");
                    }
                }, o8.b.o());
                a0.d1 d1Var2 = new a0.d1(this.f26255g.getSurface(), new Size(this.f26255g.f(), this.f26255g.c()), 34);
                this.f26257i = d1Var2;
                androidx.camera.core.o oVar2 = this.f26255g;
                na.a<Void> d10 = d1Var2.d();
                Objects.requireNonNull(oVar2);
                d10.a(new androidx.activity.h(2, oVar2), o8.b.p());
                bVar.c(this.f26257i);
                bVar.a(this.f26256h);
                bVar.b(new a());
                bVar.f195g = new InputConfiguration(this.f26255g.f(), this.f26255g.c(), this.f26255g.h());
            }
        }
    }

    @Override // s.v2
    public final boolean b() {
        return this.f26252d;
    }

    @Override // s.v2
    public final boolean c() {
        return this.f26253e;
    }

    @Override // s.v2
    public final void d(boolean z10) {
        this.f26253e = z10;
    }

    @Override // s.v2
    public final void e(boolean z10) {
        this.f26252d = z10;
    }

    @Override // s.v2
    public final androidx.camera.core.j f() {
        androidx.camera.core.j removeLast;
        try {
            i0.c cVar = this.f26251c;
            synchronized (cVar.f16195b) {
                removeLast = cVar.f16194a.removeLast();
            }
            return removeLast;
        } catch (NoSuchElementException unused) {
            y.u0.b("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override // s.v2
    public final boolean g(androidx.camera.core.j jVar) {
        ImageWriter imageWriter;
        Image s02 = jVar.s0();
        if (Build.VERSION.SDK_INT >= 23 && (imageWriter = this.f26258j) != null && s02 != null) {
            try {
                f0.a.c(imageWriter, s02);
                return true;
            } catch (IllegalStateException e10) {
                StringBuilder a10 = android.support.v4.media.d.a("enqueueImageToImageWriter throws IllegalStateException = ");
                a10.append(e10.getMessage());
                y.u0.b("ZslControlImpl", a10.toString());
                return false;
            }
        }
        return false;
    }
}
