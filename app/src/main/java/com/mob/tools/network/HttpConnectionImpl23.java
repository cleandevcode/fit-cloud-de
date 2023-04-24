package com.mob.tools.network;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HttpConnectionImpl23 implements HttpConnection {

    /* renamed from: a */
    private HttpURLConnection f9122a;

    public HttpConnectionImpl23(HttpURLConnection httpURLConnection) {
        this.f9122a = httpURLConnection;
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getErrorStream() {
        return this.f9122a.getErrorStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f9122a.getHeaderFields();
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getInputStream() {
        return this.f9122a.getInputStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public int getResponseCode() {
        return this.f9122a.getResponseCode();
    }
}
