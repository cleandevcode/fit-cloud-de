package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface HttpConnection extends PublicMemberKeeper {
    InputStream getErrorStream();

    Map<String, List<String>> getHeaderFields();

    InputStream getInputStream();

    int getResponseCode();
}
