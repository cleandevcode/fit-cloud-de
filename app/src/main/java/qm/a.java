package qm;

import android.os.Looper;
import java.util.List;
import pm.p1;
import um.o;

/* loaded from: classes2.dex */
public final class a implements o {
    @Override // um.o
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // um.o
    public p1 b(List<? extends o> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // um.o
    public int c() {
        return 1073741823;
    }
}
