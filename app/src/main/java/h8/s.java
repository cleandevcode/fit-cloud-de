package h8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    public final Map f16018a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f16019b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f16018a) {
            hashMap = new HashMap(this.f16018a);
        }
        synchronized (this.f16019b) {
            hashMap2 = new HashMap(this.f16019b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((g9.h) entry2.getKey()).b(new g8.b(status));
            }
        }
    }
}
