package rn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import pn.s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b */
    public static final byte[] f25864b = {-99, -89, -39, Byte.MIN_VALUE, 5, -72, -119, -100};

    /* renamed from: a */
    public Hashtable f25865a = new Hashtable();

    public static char[] b(String str) {
        try {
            String substring = str.substring(5);
            int i10 = b.f25866a;
            byte[] bytes = substring.getBytes();
            int length = bytes.length;
            int i11 = (length * 3) / 4;
            byte[] bArr = new byte[i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (length < 4) {
                    break;
                }
                int i14 = i12;
                long a10 = b.a(bytes, i14, 4);
                length -= 4;
                i12 = i14 + 4;
                for (int i15 = 2; i15 >= 0; i15--) {
                    bArr[i13 + i15] = (byte) (a10 & 255);
                    a10 >>= 8;
                }
                i13 += 3;
            }
            if (length == 3) {
                long a11 = b.a(bytes, i12, 3);
                int i16 = 1;
                while (i16 >= 0) {
                    bArr[i13 + i16] = (byte) (a11 & 255);
                    a11 >>= 8;
                    i16--;
                    i12 = i12;
                }
            }
            int i17 = i12;
            if (length == 2) {
                bArr[i13] = (byte) (b.a(bytes, i17, 2) & 255);
            }
            for (int i18 = 0; i18 < i11; i18++) {
                bArr[i18] = (byte) ((bArr[i18] ^ f25864b[i18 % 8]) & 255);
            }
            char[] cArr = new char[i11 / 2];
            int i19 = 0;
            int i20 = 0;
            while (i20 < i11) {
                int i21 = i20 + 1;
                cArr[i19] = (char) ((bArr[i20] & 255) + ((bArr[i21] & 255) << 8));
                i19++;
                i20 = i21 + 1;
            }
            return cArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final SSLSocketFactory a() {
        SSLContext sSLContext;
        KeyManager[] keyManagerArr;
        TrustManager[] trustManagerArr;
        TrustManagerFactory trustManagerFactory;
        KeyManagerFactory keyManagerFactory;
        String j10 = j();
        if (j10 == null) {
            j10 = "TLS";
        }
        String d10 = d();
        try {
            if (d10 == null) {
                sSLContext = SSLContext.getInstance(j10);
            } else {
                sSLContext = SSLContext.getInstance(j10, d10);
            }
            String i10 = i(null, "com.ibm.ssl.keyStore", null);
            if (i10 == null) {
                i10 = i(null, "com.ibm.ssl.keyStore", "javax.net.ssl.keyStore");
            }
            char[] f10 = f();
            String h10 = h();
            if (h10 == null) {
                h10 = KeyStore.getDefaultType();
            }
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            String g10 = g();
            String e10 = e();
            if (e10 != null) {
                defaultAlgorithm = e10;
            }
            if (i10 != null && h10 != null && defaultAlgorithm != null) {
                try {
                    KeyStore keyStore = KeyStore.getInstance(h10);
                    keyStore.load(new FileInputStream(i10), f10);
                    if (g10 != null) {
                        keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm, g10);
                    } else {
                        keyManagerFactory = KeyManagerFactory.getInstance(defaultAlgorithm);
                    }
                    keyManagerFactory.init(keyStore, f10);
                    keyManagerArr = keyManagerFactory.getKeyManagers();
                } catch (FileNotFoundException e11) {
                    throw new s(e11);
                } catch (IOException e12) {
                    throw new s(e12);
                } catch (KeyStoreException e13) {
                    throw new s(e13);
                } catch (UnrecoverableKeyException e14) {
                    throw new s(e14);
                } catch (CertificateException e15) {
                    throw new s(e15);
                }
            } else {
                keyManagerArr = null;
            }
            String l10 = l();
            char[] m10 = m();
            String o10 = o();
            if (o10 == null) {
                o10 = KeyStore.getDefaultType();
            }
            String defaultAlgorithm2 = TrustManagerFactory.getDefaultAlgorithm();
            String n10 = n();
            String k10 = k();
            if (k10 != null) {
                defaultAlgorithm2 = k10;
            }
            if (l10 != null && o10 != null && defaultAlgorithm2 != null) {
                try {
                    KeyStore keyStore2 = KeyStore.getInstance(o10);
                    keyStore2.load(new FileInputStream(l10), m10);
                    if (n10 != null) {
                        trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm2, n10);
                    } else {
                        trustManagerFactory = TrustManagerFactory.getInstance(defaultAlgorithm2);
                    }
                    trustManagerFactory.init(keyStore2);
                    trustManagerArr = trustManagerFactory.getTrustManagers();
                } catch (FileNotFoundException e16) {
                    throw new s(e16);
                } catch (IOException e17) {
                    throw new s(e17);
                } catch (KeyStoreException e18) {
                    throw new s(e18);
                } catch (CertificateException e19) {
                    throw new s(e19);
                }
            } else {
                trustManagerArr = null;
            }
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e20) {
            throw new s(e20);
        } catch (NoSuchAlgorithmException e21) {
            throw new s(e21);
        } catch (NoSuchProviderException e22) {
            throw new s(e22);
        }
    }

    public final String[] c() {
        String i10 = i(null, "com.ibm.ssl.enabledCipherSuites", null);
        if (i10 == null) {
            return null;
        }
        Vector vector = new Vector();
        int indexOf = i10.indexOf(44);
        int i11 = 0;
        while (indexOf > -1) {
            vector.add(i10.substring(i11, indexOf));
            i11 = indexOf + 1;
            indexOf = i10.indexOf(44, i11);
        }
        vector.add(i10.substring(i11));
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    public final String d() {
        return i(null, "com.ibm.ssl.contextProvider", null);
    }

    public final String e() {
        return i(null, "com.ibm.ssl.keyManager", "ssl.KeyManagerFactory.algorithm");
    }

    public final char[] f() {
        String i10 = i(null, "com.ibm.ssl.keyStorePassword", "javax.net.ssl.keyStorePassword");
        if (i10 != null) {
            return i10.startsWith("{xor}") ? b(i10) : i10.toCharArray();
        }
        return null;
    }

    public final String g() {
        return i(null, "com.ibm.ssl.keyStoreProvider", null);
    }

    public final String h() {
        return i(null, "com.ibm.ssl.keyStoreType", "javax.net.ssl.keyStoreType");
    }

    public final String i(String str, String str2, String str3) {
        Properties properties;
        String str4 = null;
        if (str != null) {
            properties = (Properties) this.f25865a.get(str);
        } else {
            properties = null;
        }
        if (properties != null) {
            str4 = properties.getProperty(str2);
        }
        if (str4 != null) {
            return str4;
        }
        if (str3 != null) {
            return System.getProperty(str3);
        }
        return str4;
    }

    public final String j() {
        return i(null, "com.ibm.ssl.protocol", null);
    }

    public final String k() {
        return i(null, "com.ibm.ssl.trustManager", "ssl.TrustManagerFactory.algorithm");
    }

    public final String l() {
        return i(null, "com.ibm.ssl.trustStore", "javax.net.ssl.trustStore");
    }

    public final char[] m() {
        String i10 = i(null, "com.ibm.ssl.trustStorePassword", "javax.net.ssl.trustStorePassword");
        if (i10 != null) {
            return i10.startsWith("{xor}") ? b(i10) : i10.toCharArray();
        }
        return null;
    }

    public final String n() {
        return i(null, "com.ibm.ssl.trustStoreProvider", null);
    }

    public final String o() {
        return i(null, "com.ibm.ssl.trustStoreType", null);
    }
}
