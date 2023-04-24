package wj;

import android.util.SparseArray;
import fl.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l extends ti.f<List<? extends rj.c>> {

    /* loaded from: classes2.dex */
    public static final class a extends ti.g<bj.b, List<? extends rj.c>> {

        /* renamed from: d */
        public final SparseArray<rj.c> f29992d;

        public a(g.a aVar, ej.a aVar2) {
            super(aVar, aVar2);
            this.f29992d = new SparseArray<>(10);
        }

        @Override // tk.n
        public final void b(Object obj) {
            bj.b bVar = (bj.b) obj;
            gm.l.f(bVar, "packet");
            try {
                c(bVar);
            } catch (Exception e10) {
                h7.a.y(e10);
                onError(e10);
            }
        }

        public final void c(bj.b bVar) {
            yi.f fVar;
            boolean z10;
            byte[] bArr = bVar.f4399c;
            if (bArr != null) {
                int i10 = 1;
                if (bArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i11 = bArr[0] & 255;
                    while (i10 < bArr.length) {
                        int i12 = i10 + 1;
                        try {
                            int i13 = i12 + 1;
                            int i14 = bArr[i12] & 255;
                            Charset charset = om.a.f23623a;
                            String str = new String(bArr, i13, i14, charset);
                            int i15 = i13 + i14;
                            int i16 = i15 + 1;
                            int i17 = bArr[i15] & 255;
                            String str2 = new String(bArr, i16, i17, charset);
                            int i18 = i16 + i17;
                            this.f29992d.put(bArr[i10] & 255, new rj.c(str2, str));
                            i10 = i18;
                        } catch (Exception unused) {
                            fVar = new yi.f(bVar);
                        }
                    }
                    if (this.f29992d.size() >= i11) {
                        ArrayList arrayList = new ArrayList(this.f29992d.size());
                        int size = this.f29992d.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            arrayList.add(this.f29992d.valueAt(i19));
                        }
                        ((g.a) this.f28258a).d(arrayList);
                        onComplete();
                        return;
                    }
                    return;
                }
            }
            fVar = new yi.f(bVar);
            onError(fVar);
        }
    }

    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        a aVar4 = new a(aVar, aVar2);
        cj.h hVar = (cj.h) aVar3;
        new fl.t(hVar.d(), new ti.a(2, m.f29993b)).C(10L, TimeUnit.SECONDS).d(aVar4);
        try {
            hVar.g(new bj.b((byte) 2, (byte) 85, null), aVar2);
        } catch (Exception e10) {
            aVar4.onError(e10);
        }
    }
}
