package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes.dex */
public interface HttpResponseCallback extends PublicMemberKeeper {
    void onResponse(HttpConnection httpConnection);
}
