package en;

import gm.l;
import java.net.ProtocolException;
import zm.v;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    public final v f13864a;

    /* renamed from: b */
    public final int f13865b;

    /* renamed from: c */
    public final String f13866c;

    /* loaded from: classes2.dex */
    public static final class a {
        public static j a(String str) {
            String str2;
            v vVar = v.HTTP_1_0;
            l.f(str, "statusLine");
            int i10 = 9;
            if (om.h.a0(str, "HTTP/1.", false)) {
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            vVar = v.HTTP_1_1;
                        } else {
                            throw new ProtocolException(a.b.b("Unexpected status line: ", str));
                        }
                    }
                } else {
                    throw new ProtocolException(a.b.b("Unexpected status line: ", str));
                }
            } else if (om.h.a0(str, "ICY ", false)) {
                i10 = 4;
            } else {
                throw new ProtocolException(a.b.b("Unexpected status line: ", str));
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() > i11) {
                        if (str.charAt(i11) == ' ') {
                            str2 = str.substring(i10 + 4);
                            l.e(str2, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException(a.b.b("Unexpected status line: ", str));
                        }
                    } else {
                        str2 = "";
                    }
                    return new j(vVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(a.b.b("Unexpected status line: ", str));
                }
            }
            throw new ProtocolException(a.b.b("Unexpected status line: ", str));
        }
    }

    public j(v vVar, int i10, String str) {
        this.f13864a = vVar;
        this.f13865b = i10;
        this.f13866c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13864a == v.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f13865b);
        sb2.append(' ');
        sb2.append(this.f13866c);
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
