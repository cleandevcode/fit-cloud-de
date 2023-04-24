package i4;

import h4.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: c */
    public t f16444c;

    /* renamed from: d */
    public boolean f16445d;

    public f(Class cls, n4.c cVar) {
        super(cls, cVar);
        boolean z10 = false;
        this.f16445d = false;
        f4.b d10 = cVar.d();
        if (d10 != null) {
            Class<?> deserializeUsing = d10.deserializeUsing();
            if (deserializeUsing != null && deserializeUsing != Void.class) {
                z10 = true;
            }
            this.f16445d = z10;
        }
    }

    @Override // i4.l
    public final int b() {
        t tVar = this.f16444c;
        if (tVar != null) {
            return tVar.b();
        }
        return 2;
    }

    @Override // i4.l
    public final void c(h4.a aVar, Object obj, Type type, HashMap hashMap) {
        byte[] f10;
        n4.c cVar;
        int i10;
        if (this.f16444c == null) {
            f(aVar.f15771c);
        }
        t tVar = this.f16444c;
        Type type2 = this.f16452a.f21952f;
        if (type instanceof ParameterizedType) {
            h4.j jVar = aVar.f15775g;
            if (jVar != null) {
                jVar.f15837e = type;
            }
            if (type2 != type) {
                type2 = n4.c.g(this.f16453b, type, type2, null);
                if (tVar instanceof p) {
                    tVar = aVar.f15771c.d(type2);
                }
            }
        }
        Type type3 = type2;
        if ((tVar instanceof o) && (i10 = (cVar = this.f16452a).f21956j) != 0) {
            f10 = ((o) tVar).f(aVar, type3, cVar.f21947a, i10);
        } else {
            n4.c cVar2 = this.f16452a;
            String str = cVar2.f21963q;
            if ((str != null || cVar2.f21956j != 0) && (tVar instanceof e)) {
                f10 = ((e) tVar).f(aVar, type3, cVar2.f21947a, str, cVar2.f21956j);
            } else {
                f10 = tVar.d(aVar, type3, cVar2.f21947a);
            }
        }
        if ((f10 instanceof byte[]) && ("gzip".equals(this.f16452a.f21963q) || "gzip,base64".equals(this.f16452a.f21963q))) {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) f10));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                f10 = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new e4.d("unzip bytes error.", e10);
            }
        }
        if (aVar.f15779k == 1) {
            a.C0282a y10 = aVar.y();
            y10.f15785c = this;
            y10.f15786d = aVar.f15775g;
            aVar.f15779k = 0;
        } else if (obj == null) {
            hashMap.put(this.f16452a.f21947a, f10);
        } else {
            d(obj, f10);
        }
    }

    public final t f(h4.k kVar) {
        if (this.f16444c == null) {
            f4.b d10 = this.f16452a.d();
            if (d10 == null || d10.deserializeUsing() == Void.class) {
                n4.c cVar = this.f16452a;
                this.f16444c = kVar.c(cVar.f21951e, cVar.f21952f);
            } else {
                try {
                    this.f16444c = (t) d10.deserializeUsing().newInstance();
                } catch (Exception e10) {
                    throw new e4.d("create deserializeUsing ObjectDeserializer error", e10);
                }
            }
        }
        return this.f16444c;
    }
}
