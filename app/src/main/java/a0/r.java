package a0;

import b0.j;

/* loaded from: classes.dex */
public final /* synthetic */ class r {
    public static void a(s sVar, j.a aVar) {
        int i10;
        int f10 = sVar.f();
        if (f10 != 1) {
            int b10 = s.c0.b(f10);
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        StringBuilder a10 = android.support.v4.media.d.a("Unknown flash state: ");
                        a10.append(q.c(f10));
                        y.u0.h("ExifData", a10.toString());
                        return;
                    }
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 32;
            }
            if ((i10 & 1) == 1) {
                aVar.c("LightSource", String.valueOf(4), aVar.f3957a);
            }
            aVar.c("Flash", String.valueOf(i10), aVar.f3957a);
        }
    }
}
