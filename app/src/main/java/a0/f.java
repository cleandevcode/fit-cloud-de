package a0;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f extends o1 {

    /* renamed from: a */
    public final Surface f50a;

    /* renamed from: b */
    public final Size f51b;

    /* renamed from: c */
    public final int f52c;

    public f(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f50a = surface;
        this.f51b = size;
        this.f52c = i10;
    }

    @Override // a0.o1
    public final int a() {
        return this.f52c;
    }

    @Override // a0.o1
    public final Size b() {
        return this.f51b;
    }

    @Override // a0.o1
    public final Surface c() {
        return this.f50a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            return this.f50a.equals(o1Var.c()) && this.f51b.equals(o1Var.b()) && this.f52c == o1Var.a();
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50a.hashCode() ^ 1000003) * 1000003) ^ this.f51b.hashCode()) * 1000003) ^ this.f52c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("OutputSurface{surface=");
        a10.append(this.f50a);
        a10.append(", size=");
        a10.append(this.f51b);
        a10.append(", imageFormat=");
        return q.b(a10, this.f52c, "}");
    }
}
