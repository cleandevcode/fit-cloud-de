package com.mob.tools.network;

import a.b;
import android.content.Context;
import android.support.v4.media.d;
import com.mob.MobSDK;
import com.mob.commons.i;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes.dex */
public class NetworkHelper implements EverythingKeeper {
    public static int connectionTimeout = 0;
    private static boolean followRedirects = true;
    public static int readTimout;
    public boolean instanceFollowRedirects = followRedirects;

    /* loaded from: classes.dex */
    public static class NetworkTimeOut implements PublicMemberKeeper {
        public int connectionTimeout;
        public int readTimout;
    }

    /* loaded from: classes.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a */
        private Object f9159a;

        /* renamed from: b */
        private String f9160b;

        private a(String str) {
            try {
                this.f9160b = str;
                Method declaredMethod = Class.forName(i.a("033Jjhfh[l*fhfngnfmAkfOgnhihigfgngkfjfehiSfEikfhfmfhhh1kOfjhmfhfiBfBgefjfk")).getDeclaredMethod(i.a("0118hh4kf?gifmhi[f[fhfmfi=k"), String.class);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, i.a("004Kjijghgjj"));
                Method method = invoke.getClass().getMethod(i.a("004?fgfmfgCf"), Class.forName(i.a("0223jhfh-l2fhgnhi>kYfifefjfg fZfkgnjl=k.fkgjRf,gefjVk")));
                method.setAccessible(true);
                method.invoke(invoke, null);
                Method method2 = invoke.getClass().getMethod(i.a("0167hh>kfIgkfjfehiTfXikfhfmfhhh%kKfjhi"), new Class[0]);
                method2.setAccessible(true);
                Object[] objArr = (Object[]) method2.invoke(invoke, new Object[0]);
                if (objArr != null && objArr.length != 0) {
                    this.f9159a = objArr[0];
                    return;
                }
                throw new NoSuchAlgorithmException("no trust manager found.");
            } catch (Exception e10) {
                NLog mobLog = MobLog.getInstance();
                StringBuilder a10 = d.a("failed to initialize the standard trust manager: ");
                a10.append(e10.getMessage());
                mobLog.d(a10.toString(), new Object[0]);
                this.f9159a = null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (name.equals(i.a("018WfiVek!fifliigffg1kDfmWfKgkfjfehi=fkj"))) {
                return null;
            }
            try {
                if (!name.equals(i.a("0187fi'ek<fiflgjPk,fj(lkLfjgkfjfehiKfkj"))) {
                    if (name.equals(i.a("0186hh_kf(glfifiBkgfkj_gihihifeFk8fjhi"))) {
                        return Array.newInstance(Class.forName(i.a("034BjhfhAlVfhgnhiQk.fifefjfg]fLfkgnfiBk0fj7fGgnjijghgjjiiSkIfjUfJfghjfgfifh[fk")), 0);
                    }
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name.equals("toString")) {
                        return toString();
                    }
                    return null;
                }
                Object[] objArr2 = (Object[]) objArr[0];
                String str = (String) objArr[1];
                if (objArr2 != null) {
                    if (objArr2.length == 1) {
                        Method declaredMethod = objArr2[0].getClass().getDeclaredMethod(i.a("013>fiOek5fiflihfhgffg?j fgWf$fk"), new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(objArr2[0], new Object[0]);
                        return null;
                    } else if (this.f9159a != null) {
                        Object newInstance = Class.forName("android.net.http.X509TrustManagerExtensions").getConstructor(Class.forName(i.a("030]jhfh^l fhfngnfmZkf=gnhihigfgnjijghgjjgkfjfehi]fTikfhfmfhhh kJfj"))).newInstance(this.f9159a);
                        Method declaredMethod2 = newInstance.getClass().getDeclaredMethod(i.a("018?fi-ek@fiflgj<kSfjAlk_fjgkfjfehi8fkj"), Array.newInstance(Class.forName(i.a("034+jhfhXl<fhgnhi@k fifefjfgAfFfkgnfi!k3fjSfZgnjijghgjjii_kFfj)f-fghjfgfifhOfk")), 0).getClass(), String.class, String.class);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(newInstance, objArr2, str, this.f9160b);
                        return null;
                    } else {
                        throw new CertificateException("there were one more certificates but no trust manager found.");
                    }
                }
                throw new IllegalArgumentException("there were no certificates.");
            } catch (Throwable th2) {
                MobLog.getInstance().e(th2);
                return null;
            }
        }
    }

    @Deprecated
    public static String checkHttpRequestUrl(String str) {
        return NetCommunicator.checkHttpRequestUrl(str);
    }

    private HttpURLConnection getConnection(String str, NetworkTimeOut networkTimeOut) {
        Object obj;
        boolean z10;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String a10 = i.a("012nkfeBgeUj2gkgeflXk*fmhi");
        try {
            obj = ReflectHelper.getInstanceField(httpURLConnection, a10);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            a10 = "PERMITTED_USER_METHODS";
            try {
                obj = ReflectHelper.getStaticField("HttpURLConnection", "PERMITTED_USER_METHODS");
            } catch (Throwable unused2) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj != null) {
            String[] strArr = (String[]) obj;
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = i.a("0055ijglgkiijf");
            if (z10) {
                ReflectHelper.setStaticField("HttpURLConnection", a10, strArr2);
            } else {
                ReflectHelper.setInstanceField(httpURLConnection, a10, strArr2);
            }
        }
        System.setProperty("http.keepAlive", "false");
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = SSLContext.getInstance(i.a("003Pgkgmgj"));
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) getTrustManager(httpsURLConnection.getURL().getHost())};
            } catch (Throwable th2) {
                MobLog.getInstance().e(th2);
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
        }
        int i10 = networkTimeOut == null ? connectionTimeout : networkTimeOut.connectionTimeout;
        if (i10 > 0) {
            httpURLConnection.setConnectTimeout(i10);
        }
        int i11 = networkTimeOut == null ? readTimout : networkTimeOut.readTimout;
        if (i11 > 0) {
            httpURLConnection.setReadTimeout(i11);
        }
        return httpURLConnection;
    }

    @Deprecated
    private HTTPPart getDataPostHttpPart(HttpURLConnection httpURLConnection, String str, byte[] bArr) {
        ByteArrayPart byteArrayPart = new ByteArrayPart();
        byteArrayPart.append(bArr);
        return byteArrayPart;
    }

    @Deprecated
    private HTTPPart getFilePostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2) {
        FileInputStream fileInputStream;
        String uuid = UUID.randomUUID().toString();
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + uuid);
        MultiPart multiPart = new MultiPart();
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                stringPart.append("--").append(uuid).append("\r\n");
                stringPart.append("Content-Disposition: form-data; name=\"").append(next.name).append("\"\r\n\r\n");
                stringPart.append(next.value).append("\r\n");
            }
        }
        multiPart.append(stringPart);
        Iterator<KVPair<String>> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KVPair<String> next2 = it2.next();
            StringPart stringPart2 = new StringPart();
            File file = new File(next2.value);
            stringPart2.append("--").append(uuid).append("\r\n");
            stringPart2.append("Content-Disposition: form-data; name=\"").append(next2.name).append("\"; filename=\"").append(file.getName()).append("\"\r\n");
            String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(next2.value);
            if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                if (next2.value.toLowerCase().endsWith("jpg") || next2.value.toLowerCase().endsWith("jpeg")) {
                    contentTypeFor = "image/jpeg";
                } else if (next2.value.toLowerCase().endsWith("png")) {
                    contentTypeFor = "image/png";
                } else if (next2.value.toLowerCase().endsWith("gif")) {
                    contentTypeFor = "image/gif";
                } else {
                    FileInputStream fileInputStream2 = null;
                    try {
                        fileInputStream = new FileInputStream(next2.value);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                        FileUtils.closeIO(fileInputStream);
                        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                            contentTypeFor = DfuBaseService.MIME_TYPE_OCTET_STREAM;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        FileUtils.closeIO(fileInputStream2);
                        throw th;
                    }
                }
            }
            stringPart2.append("Content-Type: ").append(contentTypeFor).append("\r\n\r\n");
            multiPart.append(stringPart2);
            FilePart filePart = new FilePart();
            filePart.setFile(next2.value);
            multiPart.append(filePart);
            StringPart stringPart3 = new StringPart();
            stringPart3.append("\r\n");
            multiPart.append(stringPart3);
        }
        StringPart stringPart4 = new StringPart();
        stringPart4.append("--").append(uuid).append("--\r\n");
        multiPart.append(stringPart4);
        return multiPart;
    }

    @Deprecated
    private HTTPPart getTextPostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList) {
        httpURLConnection.setRequestProperty("Content-Type", i.a("033Rfh_ggUgffgfifh4f5fggefmMi fnjkhfhfhfjkhjgefj=nEjkfefjgfEkUfmfige^jkj"));
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            stringPart.append(requestParamsToUrl(kvPairsToObjHashMap(arrayList)));
        }
        return stringPart;
    }

    public static Object getTrustManager(String str) {
        Class<?> cls = Class.forName(i.a("030Rjhfh!l6fhfngnfm@kf]gnhihigfgnjijghgjjgkfjfehi<fGikfhfmfhhh)kXfj"));
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls}, new a(str));
    }

    @Deprecated
    private void jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        jsonPost(str, hashMap, arrayList2, networkTimeOut, httpResponseCallback);
    }

    @Deprecated
    private HashMap<String, Object> kvPairsToObjHashMap(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    @Deprecated
    private HashMap<String, String> kvPairsToStrHashMap(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    private String requestParamsToUrl(HashMap<String, Object> hashMap) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String urlEncode = Data.urlEncode(entry.getKey(), "utf-8");
            String urlEncode2 = entry.getValue() == null ? "" : Data.urlEncode(String.valueOf(entry.getValue()), "utf-8");
            if (sb2.length() > 0) {
                sb2.append('&');
            }
            sb2.append(urlEncode);
            sb2.append('=');
            sb2.append(urlEncode2);
        }
        return sb2.toString();
    }

    private void setHeader(URLConnection uRLConnection, HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void download(String str, final OutputStream outputStream, NetworkTimeOut networkTimeOut) {
        final byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        rawGet(str, new RawNetworkCallback() { // from class: com.mob.tools.network.NetworkHelper.1
            @Override // com.mob.tools.network.RawNetworkCallback
            public void onResponse(InputStream inputStream) {
                int read = inputStream.read(bArr);
                while (read != -1) {
                    outputStream.write(bArr, 0, read);
                    read = inputStream.read(bArr);
                }
            }
        }, networkTimeOut);
        outputStream.flush();
    }

    public String downloadCache(Context context, String str, String str2, boolean z10, NetworkTimeOut networkTimeOut) {
        return downloadCache(context, str, str2, z10, networkTimeOut, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:15|(1:143)(3:21|(3:23|(4:25|(1:29)|30|31)(1:33)|32)|34)|(11:(4:36|(4:42|(1:44)(1:63)|45|(3:47|(1:49)|50)(3:51|(1:53)(1:62)|(1:61)))|64|(20:73|(1:75)|76|(1:78)|(3:80|81|(2:83|(2:85|86)(1:87)))|93|94|95|96|97|98|99|(3:101|(3:(1:104)(1:128)|105|(2:107|108)(1:126))(2:129|130)|127)|131|(2:110|(6:112|(1:114)|115|116|117|118)(2:119|120))|121|122|123|124|125)(4:68|(1:70)|71|72))|98|99|(0)|131|(0)|121|122|123|124|125)|142|64|(1:66)|73|(0)|76|(0)|(0)|93|94|95|96|97) */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x028b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x028c, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x028e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x028f, code lost:
        r13 = null;
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01f6 A[Catch: all -> 0x0289, TryCatch #3 {all -> 0x0289, blocks: (B:268:0x01ed, B:270:0x01f6, B:275:0x0209, B:279:0x021d, B:274:0x0205, B:281:0x0226, B:283:0x022c, B:285:0x0232, B:286:0x0235, B:292:0x0248, B:293:0x025b), top: B:337:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0226 A[Catch: all -> 0x0289, TryCatch #3 {all -> 0x0289, blocks: (B:268:0x01ed, B:270:0x01f6, B:275:0x0209, B:279:0x021d, B:274:0x0205, B:281:0x0226, B:283:0x022c, B:285:0x0232, B:286:0x0235, B:292:0x0248, B:293:0x025b), top: B:337:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String downloadCache(android.content.Context r18, java.lang.String r19, java.lang.String r20, boolean r21, com.mob.tools.network.NetworkHelper.NetworkTimeOut r22, com.mob.tools.network.FileDownloadListener r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.network.NetworkHelper.downloadCache(android.content.Context, java.lang.String, java.lang.String, boolean, com.mob.tools.network.NetworkHelper$NetworkTimeOut, com.mob.tools.network.FileDownloadListener):java.lang.String");
    }

    @Deprecated
    public String httpGet(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) {
        return httpGetNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    public String httpGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        NetworkTimeOut networkTimeOut = new NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 10000;
        return httpGetNew(str, hashMap, hashMap2, networkTimeOut);
    }

    public String httpGetNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        MobLog.getInstance().d(String.format("hgt: %s", str) + "\n" + String.format("hd: %s", hashMap2), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = android.support.v4.media.a.a(str, "?", requestParamsToUrl);
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap2);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        BufferedReader bufferedReader = null;
        if (responseCode == 200) {
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine != null) {
                                if (sb2.length() > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                            } else {
                                FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                                connection.disconnect();
                                String sb3 = sb2.toString();
                                NLog mobLog = MobLog.getInstance();
                                StringBuilder a10 = d.a("use time: ");
                                a10.append(System.currentTimeMillis() - currentTimeMillis);
                                mobLog.d(a10.toString(), new Object[0]);
                                return sb3;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            FileUtils.closeIO(bufferedReader, inputStreamReader2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader2 = null;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine2 = bufferedReader3.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            if (sb4.length() > 0) {
                                sb4.append('\n');
                            }
                            sb4.append(readLine2);
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = bufferedReader3;
                            FileUtils.closeIO(bufferedReader, inputStreamReader);
                            throw th;
                        }
                    }
                    FileUtils.closeIO(bufferedReader3, inputStreamReader);
                    connection.disconnect();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(i.a("005kDfjfjgefj"), sb4.toString());
                    hashMap3.put(i.a("006IhiIf.fh,f!fehi"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = null;
            }
        }
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, int i10, NetworkTimeOut networkTimeOut) {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, i10, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.5
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                        hashMap.put("resp", sb2.toString());
                                        return;
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            while (true) {
                                try {
                                    String readLine2 = bufferedReader3.readLine();
                                    if (readLine2 == null) {
                                        break;
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = bufferedReader3;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                    throw th;
                                }
                            }
                            FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(i.a("005kRfjfjgefj"), sb3.toString());
                            hashMap2.put(i.a("006Jhi%fDfh*f:fehi"), Integer.valueOf(responseCode));
                            throw new Throwable(new Hashon().fromHashMap(hashMap2));
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) {
        return httpPostNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, int i10, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("0100iigefmfmBkEfi6f0fggefm"), "Keep-Alive");
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        InputStream inputStream = null;
        stringPart.append(null);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                InputStream inputStream2 = stringPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    FileUtils.closeIO(inputStream2, outputStream);
                    if (httpResponseCallback != null) {
                        try {
                            httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        } finally {
                        }
                    }
                    connection.disconnect();
                    NLog mobLog = MobLog.getInstance();
                    StringBuilder a10 = d.a("use time: ");
                    a10.append(System.currentTimeMillis() - currentTimeMillis);
                    mobLog.i(a10.toString());
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    FileUtils.closeIO(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    @Deprecated
    public String httpPostFiles(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i10, NetworkTimeOut networkTimeOut) {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, arrayList2, arrayList3, i10, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.3
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                        hashMap.put("resp", sb2.toString());
                                        return;
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            while (true) {
                                try {
                                    String readLine2 = bufferedReader3.readLine();
                                    if (readLine2 == null) {
                                        break;
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = bufferedReader3;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                    throw th;
                                }
                            }
                            FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(i.a("005k]fjfjgefj"), sb3.toString());
                            hashMap2.put(i.a("006YhiLfCfhIf,fehi"), Integer.valueOf(responseCode));
                            throw new Throwable(new Hashon().fromHashMap(hashMap2));
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public String httpPostFilesChecked(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i10, NetworkTimeOut networkTimeOut) {
        final HashMap hashMap = new HashMap();
        httpPost(str, arrayList, bArr, arrayList2, i10, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.4
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode < 300) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                        hashMap.put("resp", sb2.toString());
                                        return;
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            while (true) {
                                try {
                                    String readLine2 = bufferedReader3.readLine();
                                    if (readLine2 == null) {
                                        break;
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = bufferedReader3;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                    throw th;
                                }
                            }
                            FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(i.a("005kHfjfjgefj"), sb3.toString());
                            hashMap2.put(i.a("006Yhi8f fhPf fehi"), Integer.valueOf(responseCode));
                            throw new Throwable(new Hashon().fromHashMap(hashMap2));
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    public String httpPostNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) {
        InputStream inputStream;
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hpt: " + str + "\nhd: " + hashMap2, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap2);
        connection.setRequestProperty(i.a("010=iigefmfm*k8fiGf;fggefm"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", i.a("0338fh-ggOgffgfifhZf<fggefmYi1fnjkhfhfhfjkhjgefj=n1jkfefjgf_k0fmfigeAjkj"));
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(requestParamsToUrl(hashMap));
        }
        connection.setFixedLengthStreamingMode((int) stringPart.b());
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200 && responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder();
                try {
                    inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader2);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                            } catch (Throwable th4) {
                                th = th4;
                                FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                                throw th;
                            }
                        }
                        FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(i.a("005k[fjfjgefj"), sb2.toString());
                        hashMap3.put(i.a("006$hi:f6fh2f2fehi"), Integer.valueOf(responseCode));
                        throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader2 = null;
                    inputStreamReader2 = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                try {
                    inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                } catch (Throwable th7) {
                    th = th7;
                    inputStreamReader = null;
                }
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String readLine2 = bufferedReader.readLine();
                            if (readLine2 != null) {
                                if (sb3.length() > 0) {
                                    sb3.append('\n');
                                }
                                sb3.append(readLine2);
                            } else {
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                String sb4 = sb3.toString();
                                connection.disconnect();
                                FileUtils.closeIO(inputStream, outputStream);
                                NLog mobLog2 = MobLog.getInstance();
                                StringBuilder a10 = d.a("use time: ");
                                a10.append(System.currentTimeMillis() - currentTimeMillis);
                                mobLog2.d(a10.toString(), new Object[0]);
                                return sb4;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            FileUtils.closeIO(bufferedReader, inputStreamReader);
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    bufferedReader = null;
                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                    throw th;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            connection.disconnect();
            FileUtils.closeIO(inputStream, outputStream);
            NLog mobLog3 = MobLog.getInstance();
            StringBuilder a11 = d.a("use time: ");
            a11.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog3.d(a11.toString(), new Object[0]);
            throw th;
        }
    }

    public String httpPostWithBytes(String str, byte[] bArr, HashMap<String, String> hashMap, NetworkTimeOut networkTimeOut) {
        ByteArrayInputStream byteArrayInputStream;
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d(b.b("hpt: ", str), new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap);
        connection.setRequestProperty(i.a("010,iigefmfm<kMfiOf-fggefm"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", DfuBaseService.MIME_TYPE_OCTET_STREAM);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                byte[] bytes = MobSDK.getAppkey().getBytes("utf-8");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.write(bArr);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = null;
            outputStream = null;
        }
        try {
            byte[] bArr2 = new byte[65536];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr2, 0, read);
            }
            outputStream.flush();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200 && responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder();
                try {
                    inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader2);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                            } catch (Throwable th4) {
                                th = th4;
                                FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                                throw th;
                            }
                        }
                        FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(i.a("005k4fjfjgefj"), sb2.toString());
                        hashMap2.put(i.a("006VhiRf0fh[fKfehi"), Integer.valueOf(responseCode));
                        throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedReader2 = null;
                    inputStreamReader2 = null;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = null;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            if (sb3.length() > 0) {
                                sb3.append('\n');
                            }
                            sb3.append(readLine2);
                        } else {
                            FileUtils.closeIO(bufferedReader, inputStreamReader);
                            String sb4 = sb3.toString();
                            connection.disconnect();
                            FileUtils.closeIO(byteArrayInputStream, outputStream);
                            NLog mobLog = MobLog.getInstance();
                            StringBuilder a10 = d.a("use time: ");
                            a10.append(System.currentTimeMillis() - currentTimeMillis);
                            mobLog.d(a10.toString(), new Object[0]);
                            return sb4;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        FileUtils.closeIO(bufferedReader, inputStreamReader);
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                bufferedReader = null;
                FileUtils.closeIO(bufferedReader, inputStreamReader);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            connection.disconnect();
            FileUtils.closeIO(byteArrayInputStream, outputStream);
            NLog mobLog2 = MobLog.getInstance();
            StringBuilder a11 = d.a("use time: ");
            a11.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog2.d(a11.toString(), new Object[0]);
            throw th;
        }
    }

    @Deprecated
    public String httpPut(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) {
        return httpPut(str, kvPairsToObjHashMap(arrayList), kVPair, arrayList2, networkTimeOut, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public String httpPut(String str, HashMap<String, Object> hashMap, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, OnReadListener onReadListener) {
        OutputStream outputStream;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        Throwable th2;
        InputStreamReader inputStreamReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPut: " + str);
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = android.support.v4.media.a.a(str, "?", requestParamsToUrl);
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestMethod("PUT");
        connection.setRequestProperty("Content-Type", DfuBaseService.MIME_TYPE_OCTET_STREAM);
        setHeader(connection, kvPairsToStrHashMap(arrayList));
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                FilePart filePart = new FilePart();
                if (onReadListener != null) {
                    filePart.setOnReadListener(onReadListener);
                }
                filePart.setFile(kVPair.value);
                inputStream = filePart.toInputStream();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            int responseCode = connection.getResponseCode();
            if (responseCode != 200 && responseCode != 201) {
                StringBuilder sb2 = new StringBuilder();
                try {
                    inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader2);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (sb2.length() > 0) {
                                    sb2.append('\n');
                                }
                                sb2.append(readLine);
                            } catch (Throwable th5) {
                                th2 = th5;
                                inputStream2 = bufferedReader;
                                FileUtils.closeIO(inputStream2, inputStreamReader2);
                                throw th2;
                            }
                        }
                        FileUtils.closeIO(bufferedReader, inputStreamReader2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(i.a("005kAfjfjgefj"), sb2.toString());
                        hashMap2.put(i.a("006UhiUf$fhTfGfehi"), Integer.valueOf(responseCode));
                        throw new Throwable(new Hashon().fromHashMap(hashMap2));
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    inputStreamReader2 = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                try {
                    inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine2 = bufferedReader2.readLine();
                                if (readLine2 != null) {
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                } else {
                                    FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                    connection.disconnect();
                                    String sb4 = sb3.toString();
                                    NLog mobLog = MobLog.getInstance();
                                    StringBuilder a10 = d.a("use time: ");
                                    a10.append(System.currentTimeMillis() - currentTimeMillis);
                                    mobLog.i(a10.toString());
                                    return sb4;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                inputStream2 = bufferedReader2;
                                FileUtils.closeIO(inputStream2, inputStreamReader);
                                throw th;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    inputStreamReader = null;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            inputStream2 = inputStream;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    @Deprecated
    public String jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) {
        final HashMap hashMap = new HashMap();
        jsonPost(str, arrayList, arrayList2, networkTimeOut, new HttpResponseCallback() { // from class: com.mob.tools.network.NetworkHelper.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                InputStreamReader inputStreamReader;
                InputStreamReader inputStreamReader2;
                int responseCode = httpConnection.getResponseCode();
                BufferedReader bufferedReader = null;
                if (responseCode == 200 || responseCode == 201) {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(httpConnection.getInputStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        FileUtils.closeIO(bufferedReader2, inputStreamReader);
                                        hashMap.put(i.a("003Wfj3kChi"), sb2.toString());
                                        return;
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        inputStreamReader2 = new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                            while (true) {
                                try {
                                    String readLine2 = bufferedReader3.readLine();
                                    if (readLine2 == null) {
                                        break;
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append('\n');
                                    }
                                    sb3.append(readLine2);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = bufferedReader3;
                                    FileUtils.closeIO(bufferedReader, inputStreamReader2);
                                    throw th;
                                }
                            }
                            FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(i.a("005k)fjfjgefj"), sb3.toString());
                            hashMap2.put(i.a("006$hiEf+fhVf*fehi"), Integer.valueOf(responseCode));
                            throw new Throwable(new Hashon().fromHashMap(hashMap2));
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStreamReader2 = null;
                    }
                }
            }
        });
        if (hashMap.containsKey(i.a("0031fjXkPhi"))) {
            return (String) hashMap.get(i.a("003CfjMkFhi"));
        }
        return null;
    }

    @Deprecated
    public void jsonPost(String str, HashMap<String, Object> hashMap, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) {
        OutputStream outputStream;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("jsonPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestProperty("content-type", "application/json");
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(new Hashon().fromHashMap(hashMap));
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = stringPart.toInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                } finally {
                }
            }
            connection.disconnect();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = d.a("use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog.i(a10.toString());
        } catch (Throwable th4) {
            th = th4;
            inputStream2 = inputStream;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    public void rawGet(String str, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        rawGet(str, new HashMap<>(), httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) {
        rawGet(str, new HashMap<>(), rawNetworkCallback, networkTimeOut);
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        rawGet(str, kvPairsToStrHashMap(arrayList), httpResponseCallback, networkTimeOut);
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) {
        rawGet(str, kvPairsToStrHashMap(arrayList), rawNetworkCallback, networkTimeOut);
    }

    public void rawGet(String str, HashMap<String, String> hashMap, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d(b.b("rawGet: ", str), new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        if (connection.getResponseCode() == 301) {
            rawGet(connection.getHeaderField(i.a("008Lgmgefifh_fTfggefm")), new HashMap<>(), httpResponseCallback, networkTimeOut);
        } else if (httpResponseCallback != null) {
            try {
                httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
            } finally {
            }
        }
        NLog mobLog = MobLog.getInstance();
        StringBuilder a10 = d.a("use time: ");
        a10.append(System.currentTimeMillis() - currentTimeMillis);
        mobLog.d(a10.toString(), new Object[0]);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, int i10, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        rawPost(str, kvPairsToStrHashMap(arrayList), hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        rawPost(str, arrayList, hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) {
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("rawpost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                InputStream inputStream2 = hTTPPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    FileUtils.closeIO(inputStream2, outputStream);
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        if (rawNetworkCallback != null) {
                            InputStream inputStream3 = connection.getInputStream();
                            try {
                                rawNetworkCallback.onResponse(inputStream3);
                                FileUtils.closeIO(inputStream3);
                            } finally {
                            }
                        }
                        connection.disconnect();
                        NLog mobLog = MobLog.getInstance();
                        StringBuilder a10 = d.a("use time: ");
                        a10.append(System.currentTimeMillis() - currentTimeMillis);
                        mobLog.i(a10.toString());
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    if (sb2.length() > 0) {
                                        sb2.append('\n');
                                    }
                                    sb2.append(readLine);
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = bufferedReader;
                                    FileUtils.closeIO(inputStream, inputStreamReader);
                                    throw th;
                                }
                            }
                            FileUtils.closeIO(bufferedReader, inputStreamReader);
                            connection.disconnect();
                            HashMap hashMap = new HashMap();
                            hashMap.put(i.a("005k5fjfjgefj"), sb2.toString());
                            hashMap.put(i.a("006Chi*fNfhBf%fehi"), Integer.valueOf(responseCode));
                            throw new Throwable(new Hashon().fromHashMap(hashMap));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = inputStream2;
                    FileUtils.closeIO(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            outputStream = null;
        }
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i10, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        Throwable th2;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("010KiigefmfmSkQfiUf8fggefm"), "Keep-Alive");
        if (arrayList2 == null || arrayList2.size() <= 0) {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        } else {
            textPostHTTPPart = getFilePostHTTPPart(connection, str, arrayList, arrayList2);
            if (i10 >= 0) {
                connection.setChunkedStreamingMode(i10);
            }
        }
        if (arrayList3 != null) {
            Iterator<KVPair<String>> it = arrayList3.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
            } catch (Throwable th3) {
                th2 = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                } finally {
                }
            }
            connection.disconnect();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = d.a("use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog.i(a10.toString());
        } catch (Throwable th5) {
            th2 = th5;
            Throwable th6 = th2;
            inputStream2 = inputStream;
            th = th6;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    public void rawPost(String str, HashMap<String, String> hashMap, HTTPPart hTTPPart, int i10, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        OutputStream outputStream;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d(b.b("hptr: ", str), new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        if (i10 >= 0) {
            connection.setChunkedStreamingMode(0);
        }
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = hTTPPart.toInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                } finally {
                }
            }
            connection.disconnect();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = d.a("use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog.d(a10.toString(), new Object[0]);
        } catch (Throwable th4) {
            th = th4;
            inputStream2 = inputStream;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i10, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        Throwable th2;
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(i.a("0100iigefmfm)kRfiBf0fggefm"), "Keep-Alive");
        if (bArr == null || bArr.length <= 0) {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        } else {
            textPostHTTPPart = getDataPostHttpPart(connection, str, bArr);
            if (i10 >= 0) {
                connection.setChunkedStreamingMode(i10);
            }
        }
        if (arrayList2 != null) {
            Iterator<KVPair<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
            } catch (Throwable th3) {
                th2 = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        try {
            byte[] bArr2 = new byte[65536];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read <= 0) {
                    break;
                }
                outputStream.write(bArr2, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                } finally {
                }
            }
            connection.disconnect();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = d.a("use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog.i(a10.toString());
        } catch (Throwable th5) {
            th2 = th5;
            Throwable th6 = th2;
            inputStream2 = inputStream;
            th = th6;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    public void rawGet(String str, HashMap<String, String> hashMap, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) {
        InputStreamReader inputStreamReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d(b.b("rawGet: ", str), new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            if (rawNetworkCallback != null) {
                rawNetworkCallback.onResponse(connection.getInputStream());
            }
            connection.disconnect();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a10 = d.a("use time: ");
            a10.append(System.currentTimeMillis() - currentTimeMillis);
            mobLog.d(a10.toString(), new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        FileUtils.closeIO(bufferedReader, inputStreamReader);
                        throw th;
                    }
                }
                FileUtils.closeIO(bufferedReader2, inputStreamReader);
                connection.disconnect();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(i.a("005kMfjfjgefj"), sb2.toString());
                hashMap2.put(i.a("006Chi6fQfh@f5fehi"), Integer.valueOf(responseCode));
                throw new Throwable(HashonHelper.fromHashMap(hashMap2));
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
    }
}
