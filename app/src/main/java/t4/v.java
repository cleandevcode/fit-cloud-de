package t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n5.a;
import t4.j;

/* loaded from: classes.dex */
public final class v<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final j1.d<List<Throwable>> f27741a;

    /* renamed from: b */
    public final List<? extends m<Data, ResourceType, Transcode>> f27742b;

    /* renamed from: c */
    public final String f27743c;

    public v(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.f27741a = cVar;
        if (!list.isEmpty()) {
            this.f27742b = list;
            StringBuilder a10 = android.support.v4.media.d.a("Failed LoadPath{");
            a10.append(cls.getSimpleName());
            a10.append("->");
            a10.append(cls2.getSimpleName());
            a10.append("->");
            a10.append(cls3.getSimpleName());
            a10.append("}");
            this.f27743c = a10.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final x a(int i10, int i11, r4.h hVar, com.bumptech.glide.load.data.e eVar, j.b bVar) {
        List<Throwable> acquire = this.f27741a.acquire();
        b0.c.i(acquire);
        List<Throwable> list = acquire;
        try {
            int size = this.f27742b.size();
            x xVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    xVar = this.f27742b.get(i12).a(i10, i11, hVar, eVar, bVar);
                } catch (t e10) {
                    list.add(e10);
                }
                if (xVar != null) {
                    break;
                }
            }
            if (xVar != null) {
                return xVar;
            }
            throw new t(this.f27743c, new ArrayList(list));
        } finally {
            this.f27741a.release(list);
        }
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LoadPath{decodePaths=");
        a10.append(Arrays.toString(this.f27742b.toArray()));
        a10.append('}');
        return a10.toString();
    }
}
