package xb;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public String f30461a;

    /* renamed from: b */
    public final ConcurrentHashMap f30462b = new ConcurrentHashMap(16);

    /* renamed from: c */
    public List<a> f30463c = new ArrayList(16);

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
            return null;
        }
        return (c) this.f30462b.get(str);
    }
}
