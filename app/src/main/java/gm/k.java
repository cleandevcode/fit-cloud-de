package gm;

import a0.c1;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements c1.a {
    public static /* synthetic */ void b(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(l.i(str));
        l.j(l.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    @Override // a0.c1.a
    public void a(c1 c1Var) {
        try {
            androidx.camera.core.j g10 = c1Var.g();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + g10);
            if (g10 != null) {
                g10.close();
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }
}
