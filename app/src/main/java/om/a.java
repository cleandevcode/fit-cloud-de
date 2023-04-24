package om;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final Charset f23623a;

    /* renamed from: b */
    public static final Charset f23624b;

    static {
        Charset forName = Charset.forName("UTF-8");
        gm.l.e(forName, "forName(\"UTF-8\")");
        f23623a = forName;
        gm.l.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        gm.l.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        gm.l.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        gm.l.e(forName2, "forName(\"US-ASCII\")");
        f23624b = forName2;
        gm.l.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
