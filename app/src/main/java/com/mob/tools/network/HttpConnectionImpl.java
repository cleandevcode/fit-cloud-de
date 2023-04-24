package com.mob.tools.network;

import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ReflectHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class HttpConnectionImpl implements HttpConnection {

    /* renamed from: a */
    private Object f9121a;

    static {
        try {
            ReflectHelper.importClass("org.apache.http.HttpResponse");
            ReflectHelper.importClass("org.apache.http.Header");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public HttpConnectionImpl(Object obj) {
        this.f9121a = obj;
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getErrorStream() {
        return getInputStream();
    }

    @Override // com.mob.tools.network.HttpConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            HashMap hashMap = new HashMap();
            Object invokeInstanceMethod = ReflectHelper.invokeInstanceMethod(this.f9121a, "getAllHeaders", new Object[0]);
            if (invokeInstanceMethod != null) {
                int intValue = ((Integer) ReflectHelper.getInstanceField(invokeInstanceMethod, i.a("006KgfQkZfmhh;fe"))).intValue();
                Object[] objArr = new Object[intValue];
                System.arraycopy(invokeInstanceMethod, 0, objArr, 0, intValue);
                for (int i10 = 0; i10 < intValue; i10++) {
                    Object obj = objArr[i10];
                    String str = (String) ReflectHelper.invokeInstanceMethod(obj, i.a("0071hh9kfXghfh!nk"), new Object[0]);
                    String str2 = (String) ReflectHelper.invokeInstanceMethod(obj, "getValue", new Object[0]);
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put(str, Arrays.asList(str2.split(",")));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public InputStream getInputStream() {
        try {
            return (InputStream) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f9121a, "getEntity", new Object[0]), "getContent", new Object[0]);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @Override // com.mob.tools.network.HttpConnection
    public int getResponseCode() {
        try {
            return ((Integer) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeInstanceMethod(this.f9121a, "getStatusLine", new Object[0]), "getStatusCode", new Object[0])).intValue();
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
