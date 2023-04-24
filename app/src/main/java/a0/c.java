package a0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends e0 {

    /* renamed from: a */
    public final Executor f29a;

    /* renamed from: b */
    public final Handler f30b;

    public c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f29a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f30b = handler;
    }

    @Override // a0.e0
    public final Executor a() {
        return this.f29a;
    }

    @Override // a0.e0
    public final Handler b() {
        return this.f30b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return this.f29a.equals(e0Var.a()) && this.f30b.equals(e0Var.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f29a.hashCode() ^ 1000003) * 1000003) ^ this.f30b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CameraThreadConfig{cameraExecutor=");
        a10.append(this.f29a);
        a10.append(", schedulerHandler=");
        a10.append(this.f30b);
        a10.append("}");
        return a10.toString();
    }
}
