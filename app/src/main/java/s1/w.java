package s1;

import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class w extends gm.m implements fm.a<File> {

    /* renamed from: b */
    public final /* synthetic */ q<Object> f26507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q<Object> qVar) {
        super(0);
        this.f26507b = qVar;
    }

    @Override // fm.a
    public final File m() {
        File m10 = this.f26507b.f26439a.m();
        String absolutePath = m10.getAbsolutePath();
        synchronized (q.f26438l) {
            LinkedHashSet linkedHashSet = q.f26437k;
            if (!linkedHashSet.contains(absolutePath)) {
                gm.l.e(absolutePath, "it");
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + m10 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return m10;
    }
}
