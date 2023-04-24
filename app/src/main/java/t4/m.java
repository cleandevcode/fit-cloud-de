package t4;

import android.util.Log;
import com.bumptech.glide.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n5.a;
import t4.j;
import x4.n;

/* loaded from: classes.dex */
public final class m<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f27651a;

    /* renamed from: b */
    public final List<? extends r4.j<DataType, ResourceType>> f27652b;

    /* renamed from: c */
    public final f5.c<ResourceType, Transcode> f27653c;

    /* renamed from: d */
    public final j1.d<List<Throwable>> f27654d;

    /* renamed from: e */
    public final String f27655e;

    public m(Class cls, Class cls2, Class cls3, List list, f5.c cVar, a.c cVar2) {
        this.f27651a = cls;
        this.f27652b = list;
        this.f27653c = cVar;
        this.f27654d = cVar2;
        StringBuilder a10 = android.support.v4.media.d.a("Failed DecodePath{");
        a10.append(cls.getSimpleName());
        a10.append("->");
        a10.append(cls2.getSimpleName());
        a10.append("->");
        a10.append(cls3.getSimpleName());
        a10.append("}");
        this.f27655e = a10.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x a(int i10, int i11, r4.h hVar, com.bumptech.glide.load.data.e eVar, j.b bVar) {
        x xVar;
        r4.l lVar;
        boolean z10;
        r4.c cVar;
        boolean z11;
        r4.f fVar;
        List<Throwable> acquire = this.f27654d.acquire();
        b0.c.i(acquire);
        List<Throwable> list = acquire;
        try {
            x<ResourceType> b10 = b(eVar, i10, i11, hVar, list);
            this.f27654d.release(list);
            j jVar = j.this;
            r4.a aVar = bVar.f27643a;
            jVar.getClass();
            Class<?> cls = b10.get().getClass();
            r4.k kVar = null;
            if (aVar != r4.a.RESOURCE_DISK_CACHE) {
                r4.l f10 = jVar.f27617a.f(cls);
                xVar = f10.b(jVar.f27624h, b10, jVar.f27628l, jVar.f27629m);
                lVar = f10;
            } else {
                xVar = b10;
                lVar = null;
            }
            if (!b10.equals(xVar)) {
                b10.c();
            }
            if (jVar.f27617a.f27601c.a().f5688d.a(xVar.d()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                r4.k a10 = jVar.f27617a.f27601c.a().f5688d.a(xVar.d());
                if (a10 != null) {
                    cVar = a10.b(jVar.f27631o);
                    kVar = a10;
                } else {
                    throw new k.d(xVar.d());
                }
            } else {
                cVar = r4.c.NONE;
            }
            i<R> iVar = jVar.f27617a;
            r4.f fVar2 = jVar.f27640x;
            ArrayList b11 = iVar.b();
            int size = b11.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (((n.a) b11.get(i12)).f30235a.equals(fVar2)) {
                        z11 = true;
                        break;
                    }
                    i12++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (jVar.f27630n.d(!z11, aVar, cVar)) {
                if (kVar != null) {
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            fVar = new z(jVar.f27617a.f27601c.f5668a, jVar.f27640x, jVar.f27625i, jVar.f27628l, jVar.f27629m, lVar, cls, jVar.f27631o);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + cVar);
                        }
                    } else {
                        fVar = new f(jVar.f27640x, jVar.f27625i);
                    }
                    w<Z> wVar = (w) w.f27744e.acquire();
                    b0.c.i(wVar);
                    wVar.f27748d = false;
                    wVar.f27747c = true;
                    wVar.f27746b = xVar;
                    j.c<?> cVar2 = jVar.f27622f;
                    cVar2.f27645a = fVar;
                    cVar2.f27646b = kVar;
                    cVar2.f27647c = wVar;
                    xVar = wVar;
                } else {
                    throw new k.d(xVar.get().getClass());
                }
            }
            return this.f27653c.c(xVar, hVar);
        } catch (Throwable th2) {
            this.f27654d.release(list);
            throw th2;
        }
    }

    public final x<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, r4.h hVar, List<Throwable> list) {
        int size = this.f27652b.size();
        x<ResourceType> xVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            r4.j<DataType, ResourceType> jVar = this.f27652b.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    xVar = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (xVar != null) {
                break;
            }
        }
        if (xVar != null) {
            return xVar;
        }
        throw new t(this.f27655e, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DecodePath{ dataClass=");
        a10.append(this.f27651a);
        a10.append(", decoders=");
        a10.append(this.f27652b);
        a10.append(", transcoder=");
        a10.append(this.f27653c);
        a10.append('}');
        return a10.toString();
    }
}
