package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    private static final String f8559a = j.a("002Acgdi");

    /* renamed from: b */
    private static final String f8560b = j.a("005NcjcaJcb2bi");

    /* renamed from: c */
    private static final String f8561c = j.a("005)cjcaQcfRbi");

    /* renamed from: d */
    private static final String f8562d = j.a("016Qejeihahgfcgcgfehffdcbddabe,fDdfbc");

    /* renamed from: e */
    private static x f8563e;

    /* renamed from: f */
    private String f8564f;

    /* renamed from: g */
    private Context f8565g = MobSDK.getContext();

    /* renamed from: h */
    private TreeMap<String, Object> f8566h;

    private x() {
    }

    public static x a() {
        if (f8563e == null) {
            synchronized (x.class) {
                if (f8563e == null) {
                    f8563e = new x();
                }
            }
        }
        return f8563e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String a(String str) {
        DataOutputStream dataOutputStream;
        BufferedOutputStream bufferedOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = null;
        try {
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            SecureRandom secureRandom = new SecureRandom();
            dataOutputStream.writeLong(secureRandom.nextLong());
            dataOutputStream.writeLong(secureRandom.nextLong());
            dataOutputStream.flush();
            C0744r.a(dataOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream2));
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                bufferedOutputStream.write(str.getBytes("utf-8"));
                bufferedOutputStream.flush();
                C0744r.a(bufferedOutputStream);
                byte[] AES128Encode = Data.AES128Encode(byteArray, byteArrayOutputStream2.toByteArray());
                byte[] encode = new MobRSA(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED).encode(byteArray, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream3);
                try {
                    dataOutputStream3.writeInt(encode.length);
                    dataOutputStream3.write(encode);
                    dataOutputStream3.writeInt(AES128Encode.length);
                    dataOutputStream3.write(AES128Encode);
                    dataOutputStream3.flush();
                    C0744r.a(dataOutputStream3);
                    return Base64.encodeToString(byteArrayOutputStream3.toByteArray(), 2);
                } catch (Throwable th4) {
                    C0744r.a(dataOutputStream3);
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                dataOutputStream2 = bufferedOutputStream;
                C0744r.a(dataOutputStream2);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            dataOutputStream2 = dataOutputStream;
            C0744r.a(dataOutputStream2);
            throw th;
        }
    }

    private String a(TreeMap<String, Object> treeMap) {
        HashMap hashMap;
        String str = null;
        if (!b.c() || treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(j.a("007:dfbdbe'b1cabfbg"), treeMap.get(j.a("007:dfbdbe'b1cabfbg")));
            hashMap2.put(j.a("005j@ca fg!cb"), treeMap.get(j.a("005j@ca fg!cb")));
            hashMap2.put(j.a("006+debgdeRhgEbf"), treeMap.get(j.a("006+debgdeRhgEbf")));
            hashMap2.put(j.a("008fgh;bcbeJg2ceRf"), treeMap.get(j.a("008fgh;bcbeJg2ceRf")));
            hashMap2.put(j.a("004f'babcXf"), treeMap.get(j.a("004f'babcXf")));
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put(j.a("006'bd4cc4bhWg8bg"), MobSDK.getAppkey());
            hashMap3.put("m", a(HashonHelper.fromHashMap(hashMap2)));
            HashMap<String, String> hashMap4 = new HashMap<>();
            hashMap4.put(j.a("013XccdeQg7bffgce^fg_biEb bc2b_bg"), v.c());
            hashMap4.put(j.a("004j.cabc^f"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aY());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            NetworkHelper networkHelper = new NetworkHelper();
            HashMap fromJson = HashonHelper.fromJson(networkHelper.httpPostNew(c.a(c.f8283c) + j.a("007eVcaUcg bibcWf"), hashMap3, hashMap4, networkTimeOut));
            if (!"200".equals(String.valueOf(fromJson.get(j.a("004]beca*fg")))) || (hashMap = (HashMap) fromJson.get(j.a("004fAbd,bJbd"))) == null) {
                return null;
            }
            String str2 = (String) hashMap.get(j.a("005bKcabhXg[bi"));
            try {
                f8563e.f8564f = str2;
                b(str2);
                return str2;
            } catch (Throwable th2) {
                th = th2;
                str = str2;
                MobLog.getInstance().e(th);
                return str;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new HashMap<>();
        }
    }

    private boolean a(HashMap<String, Object> hashMap) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        DH.requester(MobSDK.getContext()).getDeviceKey().request(new DH.DHResponder() { // from class: com.mob.commons.x.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                strArr[0] = dHResponse.getDeviceKey();
                countDownLatch.countDown();
            }
        });
        try {
            this.f8566h.put(j.a("007*dfbdbe.b<cabfbg"), DH.SyncMtd.getManufacturer());
            this.f8566h.put(j.a("005j*ca fg?cb"), DH.SyncMtd.getModel());
            this.f8566h.put(j.a("006OdebgdeHhgDbf"), Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
            String str = strArr[0];
            if (!TextUtils.isEmpty(str)) {
                this.f8566h.put(j.a("008fgh*bcbe6gMce0f"), str);
            }
            this.f8566h.put(j.a("004fVbabcIf"), e.a((MobProduct) null));
            String MD5 = Data.MD5(new JSONObject(this.f8566h).toString());
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put(j.a("010-dd;g5bi]gRbfbdcbegXf2fc"), MD5);
            b(treeMap);
            if (hashMap == null || hashMap.isEmpty() || !MD5.equals((String) hashMap.get(j.a("010Mdd4gUbi0g^bfbdcbeg9f6fc")))) {
                return true;
            }
            MobLog.getInstance().d("[%s] %s", f8559a, "No changes");
            return false;
        } catch (Throwable th2) {
            MobLog.getInstance().e(th2);
            return false;
        }
    }

    private byte[] a(String str, TreeMap<String, Object> treeMap) {
        try {
            return Data.AES128Encode(str, new JSONObject(treeMap).toString());
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return null;
        }
    }

    private void b(String str) {
        DataOutputStream dataOutputStream = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f8565g, f8560b);
            if (dataCacheFile != null) {
                DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(dataCacheFile));
                try {
                    dataOutputStream2.writeUTF(str);
                    dataOutputStream2.flush();
                    dataOutputStream = dataOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    try {
                        MobLog.getInstance().d(th);
                        C0744r.a(dataOutputStream);
                        return;
                    } catch (Throwable th3) {
                        C0744r.a(dataOutputStream);
                        throw th3;
                    }
                }
            }
            C0744r.a(dataOutputStream);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void b(TreeMap<String, Object> treeMap) {
        FileChannel fileChannel = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f8565g, f8561c);
            byte[] a10 = a(f8562d, treeMap);
            if (a10 != null && a10.length > 0) {
                fileChannel = new FileOutputStream(dataCacheFile).getChannel();
                fileChannel.write(ByteBuffer.wrap(a10));
                fileChannel.force(true);
            }
            C0744r.a(fileChannel);
        } catch (Throwable th2) {
            try {
                MobLog.getInstance().d(th2);
                C0744r.a(fileChannel);
            } catch (Throwable th3) {
                C0744r.a(fileChannel);
                throw th3;
            }
        }
    }

    private String d() {
        String e10;
        boolean a10;
        TreeMap<String, Object> treeMap;
        this.f8566h = new TreeMap<>();
        String str = null;
        try {
            e10 = e();
            a10 = a(f());
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (TextUtils.isEmpty(e10)) {
            treeMap = this.f8566h;
        } else {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("[%s] %s", f8559a, "tk status: " + a10);
            if (!a10) {
                str = e10;
                f8563e.f8564f = str;
                return str;
            }
            treeMap = this.f8566h;
        }
        str = a(treeMap);
        f8563e.f8564f = str;
        return str;
    }

    private String e() {
        DataInputStream dataInputStream;
        String str;
        DataInputStream dataInputStream2 = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f8565g, f8560b);
            if (dataCacheFile == null || !dataCacheFile.exists()) {
                str = null;
            } else {
                dataInputStream = new DataInputStream(new FileInputStream(dataCacheFile));
                try {
                    str = dataInputStream.readUTF();
                    dataInputStream2 = dataInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MobLog.getInstance().d(th);
                        C0744r.a(dataInputStream);
                        return null;
                    } catch (Throwable th3) {
                        C0744r.a(dataInputStream);
                        throw th3;
                    }
                }
            }
            C0744r.a(dataInputStream2);
            return str;
        } catch (Throwable th4) {
            th = th4;
            dataInputStream = null;
        }
    }

    private HashMap<String, Object> f() {
        FileChannel fileChannel;
        HashMap<String, Object> hashMap;
        FileChannel fileChannel2 = null;
        try {
            File dataCacheFile = ResHelper.getDataCacheFile(this.f8565g, f8561c);
            if (dataCacheFile == null || !dataCacheFile.exists()) {
                hashMap = null;
            } else {
                fileChannel = new FileInputStream(dataCacheFile).getChannel();
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    while (fileChannel.read(allocate) > 0) {
                    }
                    hashMap = a(f8562d, allocate.array());
                    fileChannel2 = fileChannel;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MobLog.getInstance().d(th);
                        C0744r.a(fileChannel);
                        return null;
                    } catch (Throwable th3) {
                        C0744r.a(fileChannel);
                        throw th3;
                    }
                }
            }
            C0744r.a(fileChannel2);
            return hashMap;
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f8564f)) {
            synchronized (x.class) {
                if (TextUtils.isEmpty(this.f8564f)) {
                    return d();
                }
            }
        }
        return this.f8564f;
    }

    public String c() {
        return this.f8564f;
    }
}
