package gj;

import android.os.Build;
import cn.sharesdk.framework.InnerShareParams;
import fl.g;
import gm.a0;
import gm.l;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public final class j extends c {
    public j(File file) {
        super(file);
        p000do.a.f13275a.h("Init URLConnectionDownloader", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection, T, java.net.URLConnection] */
    @Override // gj.c
    public final void a(g.a aVar, File file, String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        long contentLength;
        l.f(str, InnerShareParams.URL);
        final a0 a0Var = new a0();
        try {
            try {
                try {
                    URLConnection openConnection = new URL(str).openConnection();
                    l.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    ?? r72 = (HttpURLConnection) openConnection;
                    a0Var.f15485a = r72;
                    r72.setConnectTimeout((int) this.f15366b);
                    aVar.e(new wk.c() { // from class: gj.i
                        @Override // wk.c
                        public final void cancel() {
                            a0 a0Var2 = a0.this;
                            l.f(a0Var2, "$connection");
                            try {
                                ((HttpURLConnection) a0Var2.f15485a).disconnect();
                            } catch (Exception e10) {
                                p000do.a.f13275a.q(e10);
                            }
                        }
                    });
                    ((HttpURLConnection) a0Var.f15485a).setRequestProperty("Accept-Encoding", "identity");
                    inputStream = ((HttpURLConnection) a0Var.f15485a).getInputStream();
                } catch (Exception e10) {
                    aVar.f(new a(0, 3, null, e10));
                    httpURLConnection = (HttpURLConnection) a0Var.f15485a;
                    if (httpURLConnection == null) {
                        return;
                    }
                }
                try {
                    l.e(inputStream, "input");
                    if (Build.VERSION.SDK_INT >= 24) {
                        contentLength = ((HttpURLConnection) a0Var.f15485a).getContentLengthLong();
                    } else {
                        contentLength = ((HttpURLConnection) a0Var.f15485a).getContentLength();
                    }
                    c.b(aVar, inputStream, file, contentLength);
                    tl.l lVar = tl.l.f28297a;
                    mf.a0.d(inputStream, null);
                    httpURLConnection = (HttpURLConnection) a0Var.f15485a;
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        mf.a0.d(inputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) a0Var.f15485a;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Exception e11) {
                    p000do.a.f13275a.q(e11);
                }
                throw th4;
            }
        } catch (Exception e12) {
            p000do.a.f13275a.q(e12);
        }
    }
}
