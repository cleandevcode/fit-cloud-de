package o5;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: b */
    public final s f22857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, String str) {
        super(str);
        gm.l.f(sVar, "requestError");
        this.f22857b = sVar;
    }

    @Override // o5.p, java.lang.Throwable
    public final String toString() {
        StringBuilder a10 = p.a.a("{FacebookServiceException: ", "httpResponseCode: ");
        a10.append(this.f22857b.f22822a);
        a10.append(", facebookErrorCode: ");
        a10.append(this.f22857b.f22823b);
        a10.append(", facebookErrorType: ");
        a10.append(this.f22857b.f22825d);
        a10.append(", message: ");
        a10.append(this.f22857b.a());
        a10.append("}");
        String sb2 = a10.toString();
        gm.l.e(sb2, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
