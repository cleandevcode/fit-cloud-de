package dm;

import dm.a;
import java.io.File;

/* loaded from: classes2.dex */
public class b extends h7.a {
    public static final void B(File file) {
        a.b bVar = new a.b();
        while (true) {
            boolean z10 = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return;
        }
    }
}
