package x5;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final String f30327a;

    /* renamed from: b */
    public final boolean f30328b;

    public m(String str, boolean z10) {
        this.f30327a = str;
        this.f30328b = z10;
    }

    public final String toString() {
        String str = this.f30328b ? "Applink" : "Unclassified";
        if (this.f30327a != null) {
            return str + '(' + ((Object) this.f30327a) + ')';
        }
        return str;
    }
}
