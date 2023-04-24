package y;

import a0.u1;
import android.util.Size;

/* loaded from: classes.dex */
public final class l1 implements u1.c {

    /* renamed from: a */
    public final /* synthetic */ String f30734a;

    /* renamed from: b */
    public final /* synthetic */ Size f30735b;

    /* renamed from: c */
    public final /* synthetic */ androidx.camera.core.u f30736c;

    public l1(androidx.camera.core.u uVar, String str, Size size) {
        this.f30736c = uVar;
        this.f30734a = str;
        this.f30735b = size;
    }

    @Override // a0.u1.c
    public final void a() {
        if (this.f30736c.i(this.f30734a)) {
            this.f30736c.B(this.f30735b, this.f30734a);
            this.f30736c.k();
        }
    }
}
