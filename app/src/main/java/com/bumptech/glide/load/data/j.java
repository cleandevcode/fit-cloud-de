package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements d<InputStream> {

    /* renamed from: a */
    public final x4.f f5716a;

    /* renamed from: b */
    public final int f5717b;

    /* renamed from: c */
    public HttpURLConnection f5718c;

    /* renamed from: d */
    public InputStream f5719d;

    /* renamed from: e */
    public volatile boolean f5720e;

    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public j(x4.f fVar, int i10) {
        this.f5716a = fVar;
        this.f5717b = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f5719d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5718c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5718c = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f5720e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final r4.a d() {
        return r4.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        int i10 = m5.h.f20372b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(this.f5716a.d(), 0, null, this.f5716a.f30212b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder();
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(m5.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder a10 = android.support.v4.media.d.a("Finished http url fetcher fetch in ");
                a10.append(m5.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", a10.toString());
            }
            throw th2;
        }
    }

    public final InputStream f(URL url, int i10, URL url2, Map<String, String> map) {
        boolean z10;
        InputStream inputStream;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new r4.e("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z11 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f5717b);
                httpURLConnection.setReadTimeout(this.f5717b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f5718c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f5719d = this.f5718c.getInputStream();
                    if (this.f5720e) {
                        return null;
                    }
                    int c10 = c(this.f5718c);
                    int i11 = c10 / 100;
                    if (i11 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        HttpURLConnection httpURLConnection2 = this.f5718c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new m5.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f5719d = inputStream;
                            return inputStream;
                        } catch (IOException e10) {
                            throw new r4.e("Failed to obtain InputStream", c(httpURLConnection2), e10);
                        }
                    }
                    if (i11 == 3) {
                        z11 = true;
                    }
                    if (z11) {
                        String headerField = this.f5718c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return f(url3, i10 + 1, url, map);
                            } catch (MalformedURLException e11) {
                                throw new r4.e(a.b.b("Bad redirect url: ", headerField), c10, e11);
                            }
                        }
                        throw new r4.e("Received empty or null redirect url", c10, null);
                    } else if (c10 == -1) {
                        throw new r4.e("Http request failed", c10, null);
                    } else {
                        try {
                            throw new r4.e(this.f5718c.getResponseMessage(), c10, null);
                        } catch (IOException e12) {
                            throw new r4.e("Failed to get a response message", c10, e12);
                        }
                    }
                } catch (IOException e13) {
                    throw new r4.e("Failed to connect or obtain data", c(this.f5718c), e13);
                }
            } catch (IOException e14) {
                throw new r4.e("URL.openConnection threw", 0, e14);
            }
        }
        throw new r4.e("Too many (> 5) redirects!", -1, null);
    }
}
