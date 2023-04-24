package o3;

import android.database.Cursor;
import m2.y;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a */
    public final m2.t f22610a;

    /* renamed from: b */
    public final a f22611b;

    /* loaded from: classes.dex */
    public class a extends m2.i<d> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.f22608a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            Long l10 = dVar2.f22609b;
            if (l10 == null) {
                fVar.m0(2);
            } else {
                fVar.H(2, l10.longValue());
            }
        }
    }

    public f(m2.t tVar) {
        this.f22610a = tVar;
        this.f22611b = new a(tVar);
    }

    public final Long a(String str) {
        y h10 = y.h(1, "SELECT long_value FROM Preference where `key`=?");
        h10.p(1, str);
        this.f22610a.b();
        Long l10 = null;
        Cursor r10 = o8.b.r(this.f22610a, h10);
        try {
            if (r10.moveToFirst() && !r10.isNull(0)) {
                l10 = Long.valueOf(r10.getLong(0));
            }
            return l10;
        } finally {
            r10.close();
            h10.j();
        }
    }

    public final void b(d dVar) {
        this.f22610a.b();
        this.f22610a.c();
        try {
            this.f22611b.e(dVar);
            this.f22610a.p();
        } finally {
            this.f22610a.l();
        }
    }
}
