package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface RawNetworkCallback extends PublicMemberKeeper {
    void onResponse(InputStream inputStream);
}
