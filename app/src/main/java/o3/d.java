package o3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public String f22608a;

    /* renamed from: b */
    public Long f22609b;

    public d(long j10, String str) {
        this.f22608a = str;
        this.f22609b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f22608a.equals(dVar.f22608a)) {
                Long l10 = this.f22609b;
                Long l11 = dVar.f22609b;
                return l10 != null ? l10.equals(l11) : l11 == null;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f22608a.hashCode() * 31;
        Long l10 = this.f22609b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
