package ta;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import qa.x;

/* loaded from: classes.dex */
public final class l extends x<Object> {

    /* renamed from: c */
    public static final k f27878c = new k();

    /* renamed from: a */
    public final qa.h f27879a;

    /* renamed from: b */
    public final qa.v f27880b;

    public l(qa.h hVar, qa.v vVar) {
        this.f27879a = hVar;
        this.f27880b = vVar;
    }

    public static Serializable d(ya.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                aVar.a();
                return new ArrayList();
            } else if (i11 != 2) {
                return null;
            } else {
                aVar.b();
                return new sa.o();
            }
        }
        throw null;
    }

    @Override // qa.x
    public final Object a(ya.a aVar) {
        int h02 = aVar.h0();
        Object d10 = d(aVar, h02);
        if (d10 == null) {
            return c(aVar, h02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.D()) {
                String R = d10 instanceof Map ? aVar.R() : null;
                int h03 = aVar.h0();
                Serializable d11 = d(aVar, h03);
                boolean z10 = d11 != null;
                Serializable c10 = d11 == null ? c(aVar, h03) : d11;
                if (d10 instanceof List) {
                    ((List) d10).add(c10);
                } else {
                    ((Map) d10).put(R, c10);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = c10;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.k();
                } else {
                    aVar.q();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    @Override // qa.x
    public final void b(ya.b bVar, Object obj) {
        if (obj == null) {
            bVar.y();
            return;
        }
        qa.h hVar = this.f27879a;
        Class<?> cls = obj.getClass();
        hVar.getClass();
        x c10 = hVar.c(new xa.a(cls));
        if (c10 instanceof l) {
            bVar.h();
            bVar.q();
            return;
        }
        c10.b(bVar, obj);
    }

    public final Serializable c(ya.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 == 8) {
                            aVar.X();
                            return null;
                        }
                        StringBuilder a10 = android.support.v4.media.d.a("Unexpected token: ");
                        a10.append(a1.b.c(i10));
                        throw new IllegalStateException(a10.toString());
                    }
                    return Boolean.valueOf(aVar.I());
                }
                return this.f27880b.a(aVar);
            }
            return aVar.b0();
        }
        throw null;
    }
}
