package oi;

import com.topstep.fitcloud.pro.model.data.SleepItem;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class g implements Comparator<SleepItem> {
    @Override // java.util.Comparator
    public final int compare(SleepItem sleepItem, SleepItem sleepItem2) {
        return (int) (sleepItem.f9601b.getTime() - sleepItem2.f9601b.getTime());
    }
}
