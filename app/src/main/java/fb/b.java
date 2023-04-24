package fb;

import java.util.List;
import mf.e0;
import mf.t;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static String a(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void b(int i10, t tVar, e0 e0Var, String str) {
        tVar.f(e0Var, Integer.valueOf(i10));
        e0Var.s(str);
    }

    public static /* synthetic */ int c(String str) {
        if (str != null) {
            if (str.equals("AUTO")) {
                return 1;
            }
            if (str.equals("TEXT")) {
                return 2;
            }
            if (str.equals("BYTE")) {
                return 3;
            }
            if (str.equals("NUMERIC")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
