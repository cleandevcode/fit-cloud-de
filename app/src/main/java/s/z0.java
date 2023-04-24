package s;

import a0.h0;
import a0.i2;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class z0 implements a0.i2 {

    /* renamed from: b */
    public final t1 f26262b;

    public z0(Context context) {
        this.f26262b = t1.b(context);
    }

    @Override // a0.i2
    public final a0.l0 a(i2.b bVar, int i10) {
        int i11;
        int i12;
        int i13;
        h0.b bVar2;
        z0 z0Var;
        a0.j1 B = a0.j1.B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h0.a aVar = new h0.a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal == 3) {
                    aVar.f91c = 3;
                }
            } else {
                aVar.f91c = 1;
            }
        } else {
            if (i10 == 2) {
                i11 = 5;
            } else {
                i11 = 1;
            }
            aVar.f91c = i11;
        }
        i2.b bVar3 = i2.b.PREVIEW;
        if (bVar == bVar3 && ((v.y) v.k.a(v.y.class)) != null) {
            a0.j1 B2 = a0.j1.B();
            B2.E(r.a.A(CaptureRequest.TONEMAP_MODE), 2);
            aVar.c(new r.a(a0.n1.A(B2)));
        }
        B.E(a0.h2.f97l, new a0.u1(new ArrayList(linkedHashSet), arrayList, arrayList2, arrayList4, arrayList3, aVar.d(), null));
        B.E(a0.h2.f99n, y0.f26247a);
        HashSet hashSet = new HashSet();
        a0.j1 B3 = a0.j1.B();
        ArrayList arrayList5 = new ArrayList();
        a0.k1 c10 = a0.k1.c();
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1 && ordinal2 != 2) {
                if (ordinal2 != 3) {
                    i13 = -1;
                } else {
                    i13 = 3;
                }
            } else {
                i13 = 1;
            }
        } else {
            if (i10 == 2) {
                i12 = 5;
            } else {
                i12 = 2;
            }
            i13 = i12;
        }
        a0.d dVar = a0.h2.f98m;
        ArrayList arrayList6 = new ArrayList(hashSet);
        a0.n1 A = a0.n1.A(B3);
        a0.d2 d2Var = a0.d2.f45b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c10.b()) {
            arrayMap.put(str, c10.a(str));
        }
        B.E(dVar, new a0.h0(arrayList6, A, i13, arrayList5, false, new a0.d2(arrayMap), null));
        a0.d dVar2 = a0.h2.f100o;
        if (bVar == i2.b.IMAGE_CAPTURE) {
            bVar2 = a2.f25913c;
        } else {
            bVar2 = h0.f25976a;
        }
        B.E(dVar2, bVar2);
        if (bVar == bVar3) {
            z0Var = this;
            B.E(a0.a1.f14j, z0Var.f26262b.d());
        } else {
            z0Var = this;
        }
        B.E(a0.a1.f10f, Integer.valueOf(z0Var.f26262b.c().getRotation()));
        if (bVar == i2.b.VIDEO_CAPTURE) {
            B.E(a0.h2.f104s, Boolean.TRUE);
        }
        return a0.n1.A(B);
    }
}
