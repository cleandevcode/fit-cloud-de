package db;

import pm.g0;
import rm.l;

/* loaded from: classes.dex */
public final class i extends g0 {
    @Override // pm.g0
    public final int f(char c10, StringBuilder sb2) {
        char c11;
        int i10;
        if (c10 == '\r') {
            c11 = 0;
        } else if (c10 == ' ') {
            c11 = 3;
        } else if (c10 == '*') {
            sb2.append((char) 1);
            return 1;
        } else if (c10 != '>') {
            if (c10 >= '0' && c10 <= '9') {
                i10 = (c10 - '0') + 4;
            } else if (c10 < 'A' || c10 > 'Z') {
                l.i(c10);
                throw null;
            } else {
                i10 = (c10 - 'A') + 14;
            }
            c11 = (char) i10;
        } else {
            c11 = 2;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // pm.g0, db.c
    public final void h(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!dVar.c()) {
                break;
            }
            char b10 = dVar.b();
            dVar.f12975f++;
            f(b10, sb2);
            if (sb2.length() % 3 == 0) {
                g0.n(dVar, sb2);
                if (l.o(dVar.f12970a, dVar.f12975f, 3) != 3) {
                    dVar.f12976g = 0;
                    break;
                }
            }
        }
        k(dVar, sb2);
    }

    @Override // pm.g0
    public final int i() {
        return 3;
    }

    @Override // pm.g0
    public final void k(d dVar, StringBuilder sb2) {
        dVar.d(dVar.a());
        int a10 = dVar.f12977h.f12985b - dVar.a();
        dVar.f12975f -= sb2.length();
        if ((dVar.f12970a.length() - dVar.f12978i) - dVar.f12975f > 1 || a10 > 1 || (dVar.f12970a.length() - dVar.f12978i) - dVar.f12975f != a10) {
            dVar.e((char) 254);
        }
        if (dVar.f12976g < 0) {
            dVar.f12976g = 0;
        }
    }
}
