package dagger.hilt.android.internal.managers;

import of.k;
import of.p;
import w.o;

/* loaded from: classes2.dex */
public final class d implements lk.b<Object> {

    /* renamed from: a */
    public volatile k f12958a;

    /* renamed from: b */
    public final Object f12959b = new Object();

    /* renamed from: c */
    public final e f12960c;

    public d(p.a aVar) {
        this.f12960c = aVar;
    }

    @Override // lk.b
    public final Object h() {
        if (this.f12958a == null) {
            synchronized (this.f12959b) {
                if (this.f12958a == null) {
                    this.f12958a = new k(new jk.a(p.this), new o(), new com.bumptech.glide.manager.g());
                }
            }
        }
        return this.f12958a;
    }
}
