package e5;

import android.graphics.Bitmap;
import e5.f;

/* loaded from: classes.dex */
public final class d extends c5.c<c> {
    public d(c cVar) {
        super(cVar);
    }

    @Override // c5.c, t4.u
    public final void a() {
        ((c) this.f4537a).f13443a.f13453a.f13466l.prepareToDraw();
    }

    @Override // t4.x
    public final int b() {
        f fVar = ((c) this.f4537a).f13443a.f13453a;
        return fVar.f13455a.f() + fVar.f13469o;
    }

    @Override // t4.x
    public final void c() {
        ((c) this.f4537a).stop();
        c cVar = (c) this.f4537a;
        cVar.f13446d = true;
        f fVar = cVar.f13443a.f13453a;
        fVar.f13457c.clear();
        Bitmap bitmap = fVar.f13466l;
        if (bitmap != null) {
            fVar.f13459e.d(bitmap);
            fVar.f13466l = null;
        }
        fVar.f13460f = false;
        f.a aVar = fVar.f13463i;
        if (aVar != null) {
            fVar.f13458d.j(aVar);
            fVar.f13463i = null;
        }
        f.a aVar2 = fVar.f13465k;
        if (aVar2 != null) {
            fVar.f13458d.j(aVar2);
            fVar.f13465k = null;
        }
        f.a aVar3 = fVar.f13468n;
        if (aVar3 != null) {
            fVar.f13458d.j(aVar3);
            fVar.f13468n = null;
        }
        fVar.f13455a.clear();
        fVar.f13464j = true;
    }

    @Override // t4.x
    public final Class<c> d() {
        return c.class;
    }
}
