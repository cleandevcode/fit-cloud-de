package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    private static final String f7023b = "c";

    /* renamed from: c */
    private static final c f7024c = new c();

    /* renamed from: a */
    public Set<String> f7025a;

    private c() {
    }

    public static c a() {
        return f7024c;
    }

    public final void a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            ob.a.d(4, f7023b, "Installed module name:".concat(String.valueOf(stringArrayList)));
            this.f7025a = new HashSet(stringArrayList);
            return;
        }
        ob.a.d(5, f7023b, "Get installed module name failed.");
        this.f7025a = new HashSet();
    }
}
