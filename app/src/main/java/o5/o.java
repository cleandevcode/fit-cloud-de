package o5;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: b */
    public final int f22796b;

    /* renamed from: c */
    public final String f22797c;

    public o(String str, int i10, String str2) {
        super(str);
        this.f22796b = i10;
        this.f22797c = str2;
    }

    @Override // o5.p, java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = p.a.a("{FacebookDialogException: ", "errorCode: ");
        a10.append(this.f22796b);
        a10.append(", message: ");
        a10.append(getMessage());
        a10.append(", url: ");
        a10.append(this.f22797c);
        a10.append("}");
        String sb2 = a10.toString();
        gm.l.e(sb2, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
