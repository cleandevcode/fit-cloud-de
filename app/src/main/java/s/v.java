package s;

import android.media.MediaCodec;
import androidx.camera.core.u;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26218a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f26219b;

    /* renamed from: c */
    public final /* synthetic */ Object f26220c;

    public /* synthetic */ v(a0 a0Var, boolean z10) {
        this.f26220c = a0Var;
        this.f26219b = z10;
    }

    public /* synthetic */ v(boolean z10, MediaCodec mediaCodec) {
        this.f26219b = z10;
        this.f26220c = mediaCodec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26218a) {
            case 0:
                a0 a0Var = (a0) this.f26220c;
                boolean z10 = this.f26219b;
                a0Var.f25893y = z10;
                if (z10 && a0Var.f25873e == 2) {
                    a0Var.F(false);
                    return;
                }
                return;
            default:
                boolean z11 = this.f26219b;
                MediaCodec mediaCodec = (MediaCodec) this.f26220c;
                u.c cVar = androidx.camera.core.u.f1812t;
                if (z11 && mediaCodec != null) {
                    mediaCodec.release();
                    return;
                }
                return;
        }
    }
}
