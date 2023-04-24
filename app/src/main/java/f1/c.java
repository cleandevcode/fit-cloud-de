package f1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        gm.l.f(bundle, "bundle");
        gm.l.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        gm.l.f(bundle, "bundle");
        gm.l.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
