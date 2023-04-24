package a;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.m;
import androidx.camera.core.s;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements m.d {
    public static String b(String str, String str2) {
        return str + str2;
    }

    @Override // androidx.camera.core.m.d
    public void a(s sVar) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(sVar.f1787b.getWidth(), sVar.f1787b.getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        sVar.a(surface, o8.b.i(), new j1.a() { // from class: e0.d
            @Override // j1.a
            public final void accept(Object obj) {
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                s.c cVar = (s.c) obj;
                surface2.release();
                surfaceTexture2.release();
            }
        });
    }
}
