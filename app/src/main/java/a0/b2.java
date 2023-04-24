package a0;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class b2 {
    public static h c(int i10, Size size, c2 c2Var) {
        int i11 = 4;
        int i12 = i10 == 35 ? 2 : i10 == 256 ? 3 : i10 == 32 ? 4 : 1;
        int a10 = i0.b.a(size);
        if (a10 <= i0.b.a(c2Var.a())) {
            i11 = 1;
        } else if (a10 <= i0.b.a(c2Var.b())) {
            i11 = 2;
        } else if (a10 <= i0.b.a(c2Var.c())) {
            i11 = 3;
        }
        return new h(i12, i11);
    }

    public abstract int a();

    public abstract int b();
}
