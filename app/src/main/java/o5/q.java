package o5;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: b */
    public final e0 f22806b;

    public q(e0 e0Var, String str) {
        super(str);
        this.f22806b = e0Var;
    }

    @Override // o5.p, java.lang.Throwable
    public final String toString() {
        s sVar;
        e0 e0Var = this.f22806b;
        if (e0Var == null) {
            sVar = null;
        } else {
            sVar = e0Var.f22704c;
        }
        StringBuilder a10 = android.support.v4.media.d.a("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            a10.append(message);
            a10.append(" ");
        }
        if (sVar != null) {
            a10.append("httpResponseCode: ");
            a10.append(sVar.f22822a);
            a10.append(", facebookErrorCode: ");
            a10.append(sVar.f22823b);
            a10.append(", facebookErrorType: ");
            a10.append(sVar.f22825d);
            a10.append(", message: ");
            a10.append(sVar.a());
            a10.append("}");
        }
        String sb2 = a10.toString();
        gm.l.e(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
