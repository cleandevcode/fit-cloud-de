package j4;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

/* loaded from: classes.dex */
public final class s implements t0 {

    /* renamed from: a */
    public static final s f17465a = new s();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        try {
            if (obj == null) {
                i0Var.u();
                return;
            }
            Reader characterStream = ((Clob) obj).getCharacterStream();
            StringBuilder sb2 = new StringBuilder();
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int read = characterStream.read(cArr, 0, 2048);
                    if (read < 0) {
                        String sb3 = sb2.toString();
                        characterStream.close();
                        i0Var.t(sb3);
                        return;
                    }
                    sb2.append(cArr, 0, read);
                }
            } catch (Exception e10) {
                throw new e4.d("read string from reader error", e10);
            }
        } catch (SQLException e11) {
            throw new IOException("write clob error", e11);
        }
    }
}
