package ni;

import bi.r;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class e<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return r.q(Integer.valueOf(((SportHeartRate) t10).f9614a), Integer.valueOf(((SportHeartRate) t11).f9614a));
    }
}
