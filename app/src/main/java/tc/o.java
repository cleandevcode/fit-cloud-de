package tc;

import android.content.Context;
import android.os.Process;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public final Context f28008a;

    /* renamed from: b */
    public final HashSet f28009b = new HashSet();

    public o(Context context) {
        this.f28008a = context;
    }

    public final boolean a(String[] strArr) {
        boolean z10;
        for (String str : strArr) {
            if (str == null) {
                throw new IllegalArgumentException("permission is null");
            }
            if (this.f28009b.contains(str)) {
                z10 = true;
            } else {
                z10 = this.f28008a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
                if (z10) {
                    this.f28009b.add(str);
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
