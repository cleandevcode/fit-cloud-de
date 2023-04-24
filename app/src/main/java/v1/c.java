package v1;

import gm.l;
import gm.m;
import java.io.File;

/* loaded from: classes.dex */
public final class c extends m implements fm.a<File> {

    /* renamed from: b */
    public final /* synthetic */ fm.a<File> f28985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u1.b bVar) {
        super(0);
        this.f28985b = bVar;
    }

    @Override // fm.a
    public final File m() {
        File m10 = this.f28985b.m();
        l.f(m10, "<this>");
        String name = m10.getName();
        l.e(name, "name");
        if (l.a(om.l.w0(name, ""), "preferences_pb")) {
            return m10;
        }
        throw new IllegalStateException(("File extension for file: " + m10 + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
