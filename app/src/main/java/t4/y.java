package t4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import t4.h;
import t4.o;
import x4.n;

/* loaded from: classes.dex */
public final class y implements h, d.a<Object> {

    /* renamed from: a */
    public final h.a f27749a;

    /* renamed from: b */
    public final i<?> f27750b;

    /* renamed from: c */
    public int f27751c;

    /* renamed from: d */
    public int f27752d = -1;

    /* renamed from: e */
    public r4.f f27753e;

    /* renamed from: f */
    public List<x4.n<File, ?>> f27754f;

    /* renamed from: g */
    public int f27755g;

    /* renamed from: h */
    public volatile n.a<?> f27756h;

    /* renamed from: i */
    public File f27757i;

    /* renamed from: j */
    public z f27758j;

    public y(i<?> iVar, h.a aVar) {
        this.f27750b = iVar;
        this.f27749a = aVar;
    }

    @Override // t4.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a10 = this.f27750b.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> d10 = this.f27750b.d();
        if (d10.isEmpty()) {
            if (File.class.equals(this.f27750b.f27609k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f27750b.f27602d.getClass() + " to " + this.f27750b.f27609k);
        }
        while (true) {
            List<x4.n<File, ?>> list = this.f27754f;
            if (list != null) {
                if (this.f27755g < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f27756h = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f27755g < this.f27754f.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<x4.n<File, ?>> list2 = this.f27754f;
                        int i10 = this.f27755g;
                        this.f27755g = i10 + 1;
                        File file = this.f27757i;
                        i<?> iVar = this.f27750b;
                        this.f27756h = list2.get(i10).b(file, iVar.f27603e, iVar.f27604f, iVar.f27607i);
                        if (this.f27756h != null) {
                            if (this.f27750b.c(this.f27756h.f30237c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f27756h.f30237c.e(this.f27750b.f27613o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f27752d + 1;
            this.f27752d = i11;
            if (i11 >= d10.size()) {
                int i12 = this.f27751c + 1;
                this.f27751c = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f27752d = 0;
            }
            r4.f fVar = (r4.f) a10.get(this.f27751c);
            Class<?> cls = d10.get(this.f27752d);
            r4.l<Z> f10 = this.f27750b.f(cls);
            i<?> iVar2 = this.f27750b;
            this.f27758j = new z(iVar2.f27601c.f5668a, fVar, iVar2.f27612n, iVar2.f27603e, iVar2.f27604f, f10, cls, iVar2.f27607i);
            File a11 = ((o.c) iVar2.f27606h).a().a(this.f27758j);
            this.f27757i = a11;
            if (a11 != null) {
                this.f27753e = fVar;
                this.f27754f = this.f27750b.f27601c.a().e(a11);
                this.f27755g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f27749a.d(this.f27758j, exc, this.f27756h.f30237c, r4.a.RESOURCE_DISK_CACHE);
    }

    @Override // t4.h
    public final void cancel() {
        n.a<?> aVar = this.f27756h;
        if (aVar != null) {
            aVar.f30237c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f27749a.a(this.f27753e, obj, this.f27756h.f30237c, r4.a.RESOURCE_DISK_CACHE, this.f27758j);
    }
}
