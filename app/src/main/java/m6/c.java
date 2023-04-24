package m6;

import android.util.Base64;
import android.util.Log;
import android.view.View;
import bi.z0;
import gm.a0;
import gm.l;
import i2.f0;
import i2.g0;
import i2.m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import nm.e;
import nm.j;
import nm.p;
import no.nordicsemi.android.dfu.DfuBaseService;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import o5.v;
import om.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    public static final m a(View view) {
        Object next;
        e.a aVar = new e.a(new e(new p(j.H(view, f0.f16277b), g0.f16281b)));
        if (!aVar.hasNext()) {
            next = null;
        } else {
            next = aVar.next();
        }
        m mVar = (m) next;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final PublicKey b(String str) {
        byte[] decode = Base64.decode(h.Y(h.Y(h.Y(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        l.e(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        l.e(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    public static final String c(final String str) {
        l.f(str, "kid");
        v vVar = v.f22837a;
        final URL url = new URL("https", l.k(v.f22854r, "www."), "/.well-known/oauth/openid/keys/");
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final a0 a0Var = new a0();
        v.c().execute(new Runnable() { // from class: m6.b
            /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
            @Override // java.lang.Runnable
            public final void run() {
                URL url2 = url;
                a0 a0Var2 = a0Var;
                String str2 = str;
                ReentrantLock reentrantLock2 = reentrantLock;
                Condition condition = newCondition;
                l.f(url2, "$openIdKeyUrl");
                l.f(a0Var2, "$result");
                l.f(str2, "$kid");
                l.f(reentrantLock2, "$lock");
                URLConnection openConnection = url2.openConnection();
                if (openConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        l.e(inputStream, "connection.inputStream");
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, om.a.f23623a);
                        String m10 = z0.m(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, DfuBaseService.ERROR_REMOTE_MASK));
                        httpURLConnection.getInputStream().close();
                        a0Var2.f15485a = new JSONObject(m10).optString(str2);
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            tl.l lVar = tl.l.f28297a;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            tl.l lVar2 = tl.l.f28297a;
                            throw th2;
                        } finally {
                        }
                    }
                } catch (Exception e10) {
                    String name = c.class.getName();
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    reentrantLock2.lock();
                    try {
                        condition.signal();
                        tl.l lVar3 = tl.l.f28297a;
                    } finally {
                    }
                }
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) a0Var.f15485a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final boolean d(PublicKey publicKey, String str, String str2) {
        l.f(str, "data");
        l.f(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(om.a.f23623a);
            l.e(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            l.e(decode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}
