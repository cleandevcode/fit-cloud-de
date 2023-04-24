package com.mob.tools.network;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.d;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.C0744r;
import com.mob.commons.MobProduct;
import com.mob.commons.e;
import com.mob.commons.o;
import com.mob.commons.v;
import com.mob.tools.MobLog;
import com.mob.tools.a.c;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.UIHandler;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class NetCommunicator implements PublicMemberKeeper {
    public static final String KEY_DUID_PREVIOUS = "duidPrevious";
    public static final String KEY_IS_MODIFIED = "isModified";

    /* renamed from: c */
    private BigInteger f9128c;

    /* renamed from: d */
    private BigInteger f9129d;

    /* renamed from: e */
    private MobRSA f9130e;

    /* renamed from: g */
    private NetworkHelper.NetworkTimeOut f9132g;

    /* renamed from: h */
    private ThreadPoolExecutor f9133h;
    public static final String KEY_DUID = o.a("004h=dcde9h");

    /* renamed from: a */
    private static final ThreadPoolExecutor f9126a = new ThreadPoolExecutor(3, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: b */
    private SecureRandom f9127b = new SecureRandom();

    /* renamed from: f */
    private NetworkHelper f9131f = new NetworkHelper();

    /* loaded from: classes.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th2) {
        }

        public void onResultOk(T t10) {
        }
    }

    /* loaded from: classes.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
            super(str);
        }
    }

    public NetCommunicator(int i10, String str, String str2) {
        this.f9130e = new MobRSA(i10);
        this.f9128c = new BigInteger(str, 16);
        this.f9129d = new BigInteger(str2, 16);
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        this.f9132g = networkTimeOut;
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 5000;
        this.f9133h = f9126a;
    }

    public long a(HttpConnection httpConnection) {
        List<String> a10 = a(httpConnection, o.a("014UggecdkKdiBdk(dPhiek>i5dkff+dc"));
        if (a10 == null || a10.size() <= 0) {
            return -1L;
        }
        return Long.parseLong(a10.get(0));
    }

    private HttpResponseCallback a(final byte[] bArr, final String[] strArr) {
        return new HttpResponseCallback() { // from class: com.mob.tools.network.NetCommunicator.2
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                int responseCode = httpConnection.getResponseCode();
                InputStream inputStream = responseCode == 200 ? httpConnection.getInputStream() : httpConnection.getErrorStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                while (true) {
                    int read = inputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                inputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (responseCode != 200) {
                    HashMap fromJson = HashonHelper.fromJson(new String(byteArray, "utf-8"));
                    fromJson.put(o.a("010cdde[ehAdMdfKdOdcfg"), Integer.valueOf(responseCode));
                    throw new NetworkError(HashonHelper.fromHashMap(fromJson));
                }
                long a10 = NetCommunicator.this.a(httpConnection);
                if (a10 != -1 && a10 == byteArray.length) {
                    strArr[0] = NetCommunicator.this.a(bArr, byteArray);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(o.a("010cdde]ehDd-df d?dcfg"), Integer.valueOf(responseCode));
                hashMap.put(o.a("0065fgPd dfSd>dcfg"), -2);
                hashMap.put(o.a("005iQdhdhecdh"), "Illegal content length");
                throw new NetworkError(HashonHelper.fromHashMap(hashMap));
            }
        };
    }

    private Object a(String str) {
        if (str == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(o.a("006+fg[dZdfKdRdcfg"), -1);
            hashMap.put(o.a("005i1dhdhecdh"), "RS is empty");
            throw new NetworkError(HashonHelper.fromHashMap(hashMap));
        }
        HashMap fromJson = HashonHelper.fromJson(str.trim());
        if (!fromJson.isEmpty()) {
            Object obj = fromJson.get(o.a("003 dh<iTfg"));
            return obj == null ? fromJson.get(o.a("004hPdfPdFdf")) : obj;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(o.a("006'fg6d)dfBdSdcfg"), -1);
        hashMap2.put(o.a("005iTdhdhecdh"), "RS is empty");
        throw new NetworkError(HashonHelper.fromHashMap(hashMap2));
    }

    private String a(byte[] bArr, String str, boolean z10) {
        byte[] bytes = str.getBytes("utf-8");
        if (z10) {
            bytes = a(bytes);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] encode = this.f9130e.encode(bArr, this.f9128c, this.f9129d);
        dataOutputStream.writeInt(encode.length);
        dataOutputStream.write(encode);
        byte[] AES128Encode = Data.AES128Encode(bArr, bytes);
        dataOutputStream.writeInt(AES128Encode.length);
        dataOutputStream.write(AES128Encode);
        dataOutputStream.flush();
        dataOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public String a(byte[] bArr, byte[] bArr2) {
        return new String(Data.AES128Decode(bArr, Base64.decode(bArr2, 2)), "utf-8");
    }

    private HashMap<String, String> a(String str, int i10) {
        HashMap<String, String> commonDefaultHeaders = getCommonDefaultHeaders();
        String a10 = o.a("004]fgdeffdk");
        StringBuilder a11 = d.a(str);
        a11.append(MobSDK.getAppSecret());
        commonDefaultHeaders.put(a10, Data.MD5(a11.toString()));
        commonDefaultHeaders.put(o.a("003Sdj5iDdi"), MobSDK.getAppkey());
        commonDefaultHeaders.put(o.a("014HggecdkVdiPdk%d(hiek*iUdkff:dc"), String.valueOf(i10));
        return commonDefaultHeaders;
    }

    private HashMap<String, String> a(boolean z10, HashMap<String, String> hashMap, String str, int i10) {
        HashMap<String, String> a10 = z10 ? a(str, i10) : null;
        if (a10 == null) {
            a10 = new HashMap<>();
        }
        if (hashMap != null) {
            a10.putAll(hashMap);
        }
        return a10;
    }

    private List<String> a(HttpConnection httpConnection, String str) {
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) {
            return null;
        }
        for (String str2 : headerFields.keySet()) {
            if (str2 != null && str2.equals(str)) {
                return headerFields.get(str2);
            }
        }
        return null;
    }

    private byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(this.f9127b.nextLong());
        dataOutputStream.writeLong(this.f9127b.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static String checkHttpRequestUrl(String str) {
        return C0744r.b(str);
    }

    public static String dynamicModifyUrl(String str) {
        return C0744r.a(str);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(o.a("003 djOi=di"), MobSDK.getAppkey());
        hashMap.put(o.a("0133eefgMiSdhhieg2hiZdkRdMdeHd[di"), v.c());
        hashMap.put(o.a("004l]ecde-h"), c.a(MobSDK.getContext()).b().aY());
        return hashMap;
    }

    public static synchronized String getDUID(MobProduct mobProduct) {
        String a10;
        synchronized (NetCommunicator.class) {
            a10 = e.a(mobProduct);
        }
        return a10;
    }

    public static synchronized HashMap<String, Object> getDUIDWithModifyInfo(MobProduct mobProduct) {
        HashMap<String, Object> b10;
        synchronized (NetCommunicator.class) {
            b10 = e.b(mobProduct);
        }
        return b10;
    }

    public static String getSDKDomain(String str, String str2) {
        return com.mob.commons.c.a(str, str2);
    }

    public static boolean initSDKDM(HashMap<String, List<String>> hashMap) {
        return com.mob.commons.c.a(hashMap);
    }

    public void addTcpIntercept(String str) {
    }

    public void removeTcpIntercept(String str) {
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z10, Callback<T> callback) {
        request(true, null, hashMap, str, z10, callback);
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z10, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z10, callback);
    }

    public <T> void request(final boolean z10, final HashMap<String, String> hashMap, final HashMap<String, Object> hashMap2, final String str, final boolean z11, final Callback<T> callback) {
        this.f9133h.execute(new com.mob.tools.utils.e() { // from class: com.mob.tools.network.NetCommunicator.1
            @Override // com.mob.tools.utils.e
            public void a() {
                try {
                    final Object requestSynchronized = NetCommunicator.this.requestSynchronized(z10, hashMap, hashMap2, str, z11);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.1
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultOk(requestSynchronized);
                                return false;
                            }
                        });
                    }
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                    if (callback != null) {
                        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.tools.network.NetCommunicator.1.2
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                callback.onResultError(th2);
                                return false;
                            }
                        });
                    }
                }
            }
        });
    }

    public <T> T requestSynchronized(String str, String str2, boolean z10) {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z10);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z10) {
        return (T) requestSynchronized(true, hashMap, str, str2, z10);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z10) {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z10);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z10) {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z10);
    }

    public <T> T requestSynchronized(boolean z10, HashMap<String, String> hashMap, String str, String str2, boolean z11) {
        byte[] a10 = a();
        String a11 = a(a10, str, z11);
        HashMap<String, String> a12 = a(z10, hashMap, str, a11.getBytes("utf-8").length);
        String[] strArr = new String[1];
        HttpResponseCallback a13 = a(a10, strArr);
        StringPart stringPart = new StringPart();
        stringPart.append(a11);
        NLog mobLog = MobLog.getInstance();
        mobLog.d(">>>  request(" + str2 + "): " + str + "\nheader = " + a12.toString(), new Object[0]);
        this.f9131f.rawPost(str2, a12, stringPart, -1, a13, this.f9132g);
        if (strArr[0] != null) {
            NLog mobLog2 = MobLog.getInstance();
            StringBuilder a14 = androidx.activity.result.d.a(">>> response(", str2, "): ");
            a14.append(strArr[0]);
            mobLog2.d(a14.toString(), new Object[0]);
            return (T) a(strArr[0]);
        }
        return null;
    }

    public <T> T requestSynchronized(boolean z10, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z11) {
        String str2;
        if (hashMap2 != null) {
            String fromHashMap = HashonHelper.fromHashMap(hashMap2);
            if (fromHashMap.length() != 0) {
                str2 = fromHashMap;
                return (T) requestSynchronized(z10, hashMap, str2, str, z11);
            }
        }
        str2 = "{}";
        return (T) requestSynchronized(z10, hashMap, str2, str, z11);
    }

    public String requestSynchronizedGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        return this.f9131f.httpGetNew(str, hashMap, hashMap2, this.f9132g);
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f9133h = threadPoolExecutor;
    }
}
