package fe;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public static String a(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            byte[] valueAt = sparseArray.valueAt(i10);
            int length = valueAt != null ? valueAt.length : 0;
            sb2.append(sparseArray.keyAt(i10));
            sb2.append("=(");
            sb2.append(length);
            sb2.append(")");
            sb2.append(he.a.b(valueAt));
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static <T> String b(Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            byte[] bArr = map.get(key);
            int length = bArr != null ? bArr.length : 0;
            sb2.append(key);
            sb2.append("=(");
            sb2.append(length);
            sb2.append(")");
            sb2.append(he.a.b(bArr));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
