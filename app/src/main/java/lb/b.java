package lb;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
    @Override // java.util.Comparator
    public final int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
        return entry.getValue().intValue() - entry2.getValue().intValue();
    }
}
