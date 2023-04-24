package androidx.camera.camera2;

import a0.i2;
import a0.j1;
import a0.n1;
import a0.y;
import a0.z;
import android.content.Context;
import java.util.Set;
import s.t;
import s.w0;
import s.z0;
import y.p;
import y.r;
import y.t0;
import y.v;

/* loaded from: classes.dex */
public final class Camera2Config {

    /* loaded from: classes.dex */
    public static final class DefaultProvider implements v.b {
        @Override // y.v.b
        public v getCameraXConfig() {
            return Camera2Config.a();
        }
    }

    public static v a() {
        z.a aVar = new z.a() { // from class: q.a
            @Override // a0.z.a
            public final t a(Context context, a0.c cVar, p pVar) {
                return new t(context, cVar, pVar);
            }
        };
        y.a aVar2 = new y.a() { // from class: q.b
            @Override // a0.y.a
            public final w0 a(Context context, Object obj, Set set) {
                try {
                    return new w0(context, obj, set);
                } catch (r e10) {
                    throw new t0(e10);
                }
            }
        };
        i2.c cVar = new i2.c() { // from class: q.c
            @Override // a0.i2.c
            public final z0 a(Context context) {
                return new z0(context);
            }
        };
        j1 B = j1.B();
        new v.a(B);
        B.E(v.f30783z, aVar);
        B.E(v.A, aVar2);
        B.E(v.B, cVar);
        return new v(n1.A(B));
    }
}
