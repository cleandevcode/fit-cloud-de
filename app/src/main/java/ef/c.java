package ef;

import java.io.IOException;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class c extends we.a {
    public static boolean s(int i10) {
        if (i10 == 4 || i10 == 6 || i10 == 7 || i10 == 8 || i10 == 10) {
            return true;
        }
        ge.b.o(String.format("not support section size check for ic:0x%02X", Integer.valueOf(i10)), we.a.f29796b);
        return false;
    }

    public static boolean t(int i10) {
        if (i10 == 4 || i10 == 6 || i10 == 7 || i10 == 8 || i10 == 10) {
            return true;
        }
        ge.b.o(String.format("not support section size check for ic:0x%02X", Integer.valueOf(i10)), we.a.f29796b);
        return false;
    }

    public static ze.a u(re.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        te.a aVar;
        se.a s10;
        int i10 = bVar.f25552b;
        String str = bVar.f25558h;
        int i11 = bVar.f25560j;
        ze.j jVar = bVar.f25561k;
        boolean z15 = bVar.f25562l;
        boolean z16 = bVar.f25564n;
        boolean z17 = bVar.f25565o;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ze.a g10 = we.a.g(bVar);
        me.a k10 = le.b.k(bVar);
        if (k10 != null) {
            ge.b.o(k10.toString(), we.a.f29795a);
            g10.f32231e = true;
            g10.f32232f = k10.f20478f;
            g10.f32238l = k10.v(0);
            g10.f32240n = k10.v(1);
            if (z16 && !g10.a(i10)) {
                return g10;
            }
            if (z17 && t(g10.f32232f) && (s10 = k10.s(we.a.r(2, jVar.N, jVar.Q))) != null) {
                te.a c10 = s10.c(g10.f32232f, bVar.f25570t);
                if (c10 != null && 1 != we.a.a(c10, s10.f26905j, jVar)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                z12 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            if (z11) {
                z13 = false;
                for (int i12 = 0; i12 < 16; i12++) {
                    int r10 = we.a.r(i12, jVar.N, jVar.Q);
                    if (r10 < 16) {
                        g10.f32236j |= 1;
                    } else {
                        g10.f32236j |= 2;
                    }
                    se.a s11 = k10.s(r10);
                    if (s11 != null) {
                        z14 = z13;
                        aVar = s11.c(g10.f32232f, bVar.f25570t);
                    } else {
                        z14 = z13;
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                        if (!re.a.f(i11, r10)) {
                            ge.b.n("image file disable: bitNumber=" + r10);
                        } else if (z15 && 1 != we.a.h(aVar, i12, jVar)) {
                            z13 = true;
                        } else {
                            if (z17 && t(g10.f32232f)) {
                                if (z12) {
                                    ge.b.d("preVerify OTA_HEADER_FILE ok, no need to check section size");
                                } else if (1 != we.a.a(aVar, s11.f26905j, jVar)) {
                                    g10.f32235i = false;
                                    g10.f32234h = DfuBaseService.ERROR_CRC_ERROR;
                                    return g10;
                                }
                            }
                            arrayList3.add(aVar);
                            arrayList.add(s11);
                        }
                    }
                    z13 = z14;
                }
            } else {
                ge.b.p("pre verify failed");
                z13 = false;
            }
            k10.k();
            z10 = z13;
        } else {
            try {
                byte[] q10 = we.a.q(i10, bVar.f25570t, str);
                te.a p10 = we.a.p(i10, bVar.f25570t, 0L, str);
                if (p10 != null) {
                    p10.f28067x = q10;
                    arrayList2.add(p10);
                    g10.f32232f = p10.f28052i & 255;
                    g10.f32233g = p10.f28055l;
                    if (z16 && !g10.a(i10)) {
                        return g10;
                    }
                    if (z15 && 1 != we.a.k(p10, jVar)) {
                        z10 = true;
                    } else if (!z17 || !t(g10.f32232f) || 1 == we.a.b(p10, jVar)) {
                        arrayList3.add(p10);
                    }
                }
                z10 = false;
            } catch (IOException e10) {
                ge.b.p(e10.toString());
                throw new ne.b(e10.getMessage(), DfuBaseService.ERROR_FILE_NOT_FOUND);
            }
        }
        g10.f32239m = arrayList2;
        g10.f32242p = arrayList3;
        g10.f32241o = arrayList;
        if (z15 && z10 && arrayList3.size() < 1) {
            g10.f32235i = false;
            g10.f32234h = DfuBaseService.ERROR_INVALID_RESPONSE;
        }
        return g10;
    }
}
