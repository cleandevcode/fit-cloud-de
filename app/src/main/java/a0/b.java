package a0;

import android.util.Range;
import android.util.Size;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a */
    public final b2 f16a;

    /* renamed from: b */
    public final int f17b;

    /* renamed from: c */
    public final Size f18c;

    /* renamed from: d */
    public final Range<Integer> f19d;

    public b(h hVar, int i10, Size size, Range range) {
        if (hVar == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f16a = hVar;
        this.f17b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f18c = size;
        this.f19d = range;
    }

    @Override // a0.a
    public final int a() {
        return this.f17b;
    }

    @Override // a0.a
    public final Size b() {
        return this.f18c;
    }

    @Override // a0.a
    public final b2 c() {
        return this.f16a;
    }

    @Override // a0.a
    public final Range<Integer> d() {
        return this.f19d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f16a.equals(aVar.c()) && this.f17b == aVar.a() && this.f18c.equals(aVar.b())) {
                Range<Integer> range = this.f19d;
                Range<Integer> d10 = aVar.d();
                if (range == null) {
                    if (d10 == null) {
                        return true;
                    }
                } else if (range.equals(d10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f16a.hashCode() ^ 1000003) * 1000003) ^ this.f17b) * 1000003) ^ this.f18c.hashCode()) * 1000003;
        Range<Integer> range = this.f19d;
        return hashCode ^ (range == null ? 0 : range.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AttachedSurfaceInfo{surfaceConfig=");
        a10.append(this.f16a);
        a10.append(", imageFormat=");
        a10.append(this.f17b);
        a10.append(", size=");
        a10.append(this.f18c);
        a10.append(", targetFrameRate=");
        a10.append(this.f19d);
        a10.append("}");
        return a10.toString();
    }
}
