package y4;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.ArrayDeque;
import r4.h;
import x4.m;
import x4.n;
import x4.o;
import x4.r;

/* loaded from: classes.dex */
public final class a implements n<x4.f, InputStream> {

    /* renamed from: b */
    public static final r4.g<Integer> f31106b = r4.g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a */
    public final m<x4.f, x4.f> f31107a;

    /* renamed from: y4.a$a */
    /* loaded from: classes.dex */
    public static class C0572a implements o<x4.f, InputStream> {

        /* renamed from: a */
        public final m<x4.f, x4.f> f31108a = new m<>();

        @Override // x4.o
        public final n<x4.f, InputStream> b(r rVar) {
            return new a(this.f31108a);
        }
    }

    public a(m<x4.f, x4.f> mVar) {
        this.f31107a = mVar;
    }

    @Override // x4.n
    public final /* bridge */ /* synthetic */ boolean a(x4.f fVar) {
        return true;
    }

    @Override // x4.n
    public final n.a<InputStream> b(x4.f fVar, int i10, int i11, h hVar) {
        x4.f fVar2 = fVar;
        m<x4.f, x4.f> mVar = this.f31107a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar2);
            Object a11 = mVar.f30230a.a(a10);
            ArrayDeque arrayDeque = m.a.f30231d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            x4.f fVar3 = (x4.f) a11;
            if (fVar3 == null) {
                m<x4.f, x4.f> mVar2 = this.f31107a;
                mVar2.getClass();
                mVar2.f30230a.d(m.a.a(fVar2), fVar2);
            } else {
                fVar2 = fVar3;
            }
        }
        return new n.a<>(fVar2, new j(fVar2, ((Integer) hVar.c(f31106b)).intValue()));
    }
}
