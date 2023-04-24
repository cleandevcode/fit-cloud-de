package nc;

import java.util.Map;

/* loaded from: classes.dex */
public final class a implements Map.Entry<String, mc.b> {

    /* renamed from: a */
    public final String f22220a;

    /* renamed from: b */
    public final d f22221b;

    public a(String str, d dVar) {
        this.f22220a = str;
        this.f22221b = dVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22220a.equals(aVar.f22220a) && this.f22221b.equals(aVar.f22221b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f22220a;
    }

    @Override // java.util.Map.Entry
    public final mc.b getValue() {
        return this.f22221b.get();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f22221b.hashCode() + (this.f22220a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final mc.b setValue(mc.b bVar) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
