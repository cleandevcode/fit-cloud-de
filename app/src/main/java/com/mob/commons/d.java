package com.mob.commons;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.mob.MobSDK;
import com.mob.tools.MDP;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.SQLiteHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private static d f8368a;

    /* renamed from: b */
    private static volatile SQLiteHelper.SingleTableDB f8369b;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public boolean f8376a = false;

        /* renamed from: b */
        private String f8377b;

        /* renamed from: c */
        private byte[] f8378c;

        /* renamed from: d */
        private String f8379d;

        public a(String str, String str2) {
            this.f8377b = str;
            this.f8379d = str2;
        }

        public a(byte[] bArr, String str) {
            this.f8378c = bArr;
            this.f8379d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Method[] methods;
            try {
                Method method = null;
                boolean z10 = false;
                for (Method method2 : com.mob.tools.b.a.class.getMethods()) {
                    Annotation[] annotations = method2.getAnnotations();
                    if (annotations != null) {
                        int length = annotations.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            Annotation annotation = annotations[i10];
                            if (annotation != null && annotation.annotationType() == com.mob.tools.b.b.class) {
                                method = method2;
                                z10 = true;
                                break;
                            }
                            i10++;
                        }
                        if (z10) {
                            break;
                        }
                    }
                }
                if (this.f8376a) {
                    com.mob.commons.cc.a.a(MobSDK.getContext(), this.f8378c, this.f8379d, method);
                } else {
                    com.mob.commons.cc.a.a(MobSDK.getContext(), this.f8377b, this.f8379d, method);
                }
            } catch (Throwable th2) {
                try {
                    f.a().a(6, th2);
                    MobLog.getInstance().d(th2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        private static final b[] f8380a = new b[3];

        /* renamed from: b */
        private long f8381b;

        /* renamed from: c */
        private HashMap<String, Object> f8382c;

        private b(long j10, HashMap<String, Object> hashMap) {
            this.f8381b = j10;
            this.f8382c = hashMap;
        }

        private void a() {
            try {
                b[] bVarArr = f8380a;
                synchronized (bVarArr) {
                    for (int i10 = 0; i10 < 3; i10++) {
                        if (bVarArr[i10] == null) {
                            this.f8381b = 0L;
                            HashMap<String, Object> hashMap = this.f8382c;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                            this.f8382c = null;
                            bVarArr[i10] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public static b b(long j10, HashMap<String, Object> hashMap) {
            b[] bVarArr = f8380a;
            synchronized (bVarArr) {
                for (int i10 = 0; i10 < 3; i10++) {
                    b bVar = bVarArr[i10];
                    if (bVar != null) {
                        bVar.f8381b = j10;
                        HashMap<String, Object> hashMap2 = bVar.f8382c;
                        if (hashMap2 != null) {
                            hashMap2.clear();
                        }
                        bVar.f8382c = hashMap;
                        bVarArr[i10] = null;
                        return bVar;
                    }
                }
                return new b(j10, hashMap);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                l.a(l.a(l.f8434b), new k() { // from class: com.mob.commons.d.b.1
                    @Override // com.mob.commons.k
                    public boolean a(FileLocker fileLocker) {
                        DH.requester(MobSDK.getContext()).getNetworkType().request(new DH.DHResponder() { // from class: com.mob.commons.d.b.1.1
                            @Override // com.mob.tools.utils.DH.DHResponder
                            public void onResponse(DH.DHResponse dHResponse) {
                                c a10;
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(i.a("004f'fg0nk"), String.valueOf(b.this.f8381b));
                                    if (b.this.f8382c != null) {
                                        b.this.f8382c.put(i.a("006WfhSggOfl7kPfk"), MobSDK.getAppkey());
                                        b.this.f8382c.put(i.a("006(fhVgggFflhh"), DH.SyncMtd.getPackageName());
                                        b.this.f8382c.put(i.a("006FfhSgglkJfj"), DH.SyncMtd.getAppVersionName());
                                        long longValue = ((Long) com.mob.commons.b.a(i.a("010Uhi@fDfjfhKfkThhfkgiCj"), 0L)).longValue();
                                        if (longValue != 0) {
                                            b.this.f8382c.put(i.a("010,hi0f.fjfhRfk.hhfkgi1j"), Long.valueOf(longValue));
                                        }
                                    }
                                    contentValues.put(i.a("004jYfhAfTfh"), Base64.encodeToString(Data.AES128Encode(Data.rawMD5(DH.SyncMtd.getManufacturer()), HashonHelper.fromHashMap(b.this.f8382c).getBytes("utf-8")), 2));
                                    SQLiteHelper.insert(d.f8369b, contentValues);
                                    ((Long) com.mob.commons.b.a(i.a("004jk,fe6g"), 2L)).longValue();
                                    String networkType = dHResponse.getNetworkType();
                                    long j10 = (networkType == null || i.a("004%fmgefm;k").equals(networkType)) ? 120L : 120L;
                                    if (!com.mob.commons.b.c() || (a10 = c.a()) == null) {
                                        return;
                                    }
                                    if (j10 <= 0) {
                                        a10.run();
                                    } else if (com.mob.commons.a.d.a().a(j10, a10)) {
                                    } else {
                                        a10.c();
                                    }
                                } catch (Throwable th2) {
                                    MobLog.getInstance().w(th2);
                                }
                            }
                        });
                        return false;
                    }
                });
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b */
        private static final c[] f8385b;

        /* renamed from: a */
        public boolean f8386a = false;

        static {
            f8385b = r0;
            c[] cVarArr = {new c()};
        }

        public int a(SparseArray<String> sparseArray) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\'');
                    sb2.append(sparseArray.valueAt(i10));
                    sb2.append('\'');
                }
                SQLiteHelper.SingleTableDB singleTableDB = d.f8369b;
                return SQLiteHelper.delete(singleTableDB, "time in (" + sb2.toString() + ")", null);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return 0;
            }
        }

        public int a(String[][] strArr) {
            Cursor cursor = null;
            int i10 = 0;
            try {
                cursor = SQLiteHelper.query(d.f8369b, new String[]{i.a("004f,fg-nk"), i.a("004j%fhXf@fh")}, null, null, null);
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                } else if (!cursor.moveToFirst()) {
                    try {
                        cursor.close();
                    } catch (Throwable unused2) {
                    }
                    return 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i11 = 0;
                    try {
                        do {
                            try {
                                String[] strArr2 = new String[2];
                                strArr2[0] = cursor.getString(0);
                                strArr2[1] = cursor.getString(1);
                                long j10 = -1;
                                try {
                                    j10 = Long.parseLong(strArr2[0]);
                                } catch (Throwable unused3) {
                                }
                                if (j10 <= currentTimeMillis) {
                                    strArr[i11] = strArr2;
                                    i11++;
                                }
                                if (i11 >= strArr.length) {
                                    break;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i10 = i11;
                                try {
                                    MobLog.getInstance().w(th);
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    return i10;
                                } catch (Throwable th3) {
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        } while (cursor.moveToNext());
                        break;
                        cursor.close();
                    } catch (Throwable unused6) {
                        return i11;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public SparseArray<String> a(String[][] strArr, int i10, DH.DHResponse dHResponse) {
            HashMap hashMap;
            ArrayList arrayList;
            SparseArray<String> sparseArray = new SparseArray<>();
            try {
                hashMap = new HashMap();
                hashMap.put(i.a("004gNgffh)f"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
                hashMap.put(i.a("006jklVfgfi@k"), dHResponse.getDeviceKey());
                hashMap.put(i.a("005n3geZjkGgf"), DH.SyncMtd.getModel());
                hashMap.put(i.a("004jBfefg'j"), e.a((MobProduct) null));
                hashMap.put("iemt", dHResponse.getIMEI());
                hashMap.put("snmt", dHResponse.getSerialno());
                hashMap.put(i.a("0114fmDkfOhfgefjflRf1fkKgk"), dHResponse.getDetailNetworkTypeForStatic());
                hashMap.put(i.a("015j(fh_fXfhgh'kf8hfgefjflgkfkMgk"), Integer.valueOf(dHResponse.getDataNtType()));
                arrayList = new ArrayList();
                byte[] rawMD5 = Data.rawMD5(DH.SyncMtd.getManufacturer());
                for (int i11 = 0; i11 < i10; i11++) {
                    String[] strArr2 = strArr[i11];
                    HashMap fromJson = HashonHelper.fromJson(new String(Data.AES128Decode(rawMD5, Base64.decode(strArr2[1], 2)), "utf-8").trim());
                    sparseArray.put(i11, strArr2[0]);
                    arrayList.add(fromJson);
                }
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
            if (arrayList.isEmpty()) {
                return new SparseArray<>();
            }
            hashMap.put(i.a("005j fhRf=fhhi"), arrayList);
            hashMap.put(i.a("005f@gefl<k1fm"), x.a().b());
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(i.a("013Cgghi6k.fjjkgi%jkBfmRf+fg7f3fk"), v.c());
            hashMap2.put(i.a("004n7gefg6j"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aY());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            NetworkHelper networkHelper = new NetworkHelper();
            if (!"200".equals(String.valueOf(HashonHelper.fromJson(networkHelper.httpPostWithBytes(com.mob.commons.c.a(com.mob.commons.c.f8283c) + "/v6/gcl", a(HashonHelper.fromHashMap(hashMap)), hashMap2, networkTimeOut)).get(i.a("006Khi>fEfhBfSfehi"))))) {
                sparseArray.clear();
            }
            return sparseArray;
        }

        public static /* synthetic */ c a() {
            return b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static byte[] a(String str) {
            DataOutputStream dataOutputStream;
            BufferedOutputStream bufferedOutputStream;
            DataOutputStream dataOutputStream2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream3 = null;
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
                    try {
                        dataOutputStream2 = new DataOutputStream(byteArrayOutputStream3);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        dataOutputStream2.writeInt(encode.length);
                        dataOutputStream2.write(encode);
                        dataOutputStream2.writeInt(AES128Encode.length);
                        dataOutputStream2.write(AES128Encode);
                        dataOutputStream2.flush();
                        C0744r.a(dataOutputStream2);
                        return byteArrayOutputStream3.toByteArray();
                    } catch (Throwable th5) {
                        th = th5;
                        dataOutputStream = dataOutputStream2;
                        C0744r.a(dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    dataOutputStream3 = bufferedOutputStream;
                    C0744r.a(dataOutputStream3);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                dataOutputStream3 = dataOutputStream;
                C0744r.a(dataOutputStream3);
                throw th;
            }
        }

        private static c b() {
            c[] cVarArr = f8385b;
            synchronized (cVarArr) {
                c cVar = cVarArr[0];
                if (cVar != null) {
                    cVarArr[0] = null;
                    if (cVar.f8386a) {
                        cVar.f8386a = false;
                    }
                    return cVar;
                }
                return null;
            }
        }

        public void c() {
            try {
                c[] cVarArr = f8385b;
                synchronized (cVarArr) {
                    if (cVarArr[0] == null) {
                        cVarArr[0] = this;
                    }
                }
                this.f8386a = false;
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DH.requester(MobSDK.getContext()).getDeviceKey().getIMEI().getSerialno().getDetailNetworkTypeForStatic().getDataNtType().request(new DH.DHResponder() { // from class: com.mob.commons.d.c.1
                /* JADX WARN: Code restructure failed: missing block: B:42:0x001e, code lost:
                    com.mob.commons.a.d.a().b();
                 */
                @Override // com.mob.tools.utils.DH.DHResponder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onResponse(com.mob.tools.utils.DH.DHResponse r6) {
                    /*
                        r5 = this;
                        r0 = 50
                        java.lang.String[][] r1 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L37
                        com.mob.commons.d$c r2 = com.mob.commons.d.c.this     // Catch: java.lang.Throwable -> L37
                    L6:
                        int r2 = com.mob.commons.d.c.a(r2, r1)     // Catch: java.lang.Throwable -> L37
                        if (r2 <= 0) goto L3f
                        com.mob.commons.d$c r3 = com.mob.commons.d.c.this     // Catch: java.lang.Throwable -> L37
                        android.util.SparseArray r3 = com.mob.commons.d.c.a(r3, r1, r2, r6)     // Catch: java.lang.Throwable -> L37
                        int r4 = r3.size()     // Catch: java.lang.Throwable -> L37
                        if (r4 != 0) goto L26
                        com.mob.commons.d$c r4 = com.mob.commons.d.c.this     // Catch: java.lang.Throwable -> L37
                        boolean r4 = r4.f8386a     // Catch: java.lang.Throwable -> L37
                        if (r4 == 0) goto L26
                        com.mob.commons.a.d r6 = com.mob.commons.a.d.a()     // Catch: java.lang.Throwable -> L37
                        r6.b()     // Catch: java.lang.Throwable -> L37
                        goto L3f
                    L26:
                        int r4 = r3.size()     // Catch: java.lang.Throwable -> L37
                        if (r4 <= 0) goto L31
                        com.mob.commons.d$c r4 = com.mob.commons.d.c.this     // Catch: java.lang.Throwable -> L37
                        com.mob.commons.d.c.a(r4, r3)     // Catch: java.lang.Throwable -> L37
                    L31:
                        if (r2 >= r0) goto L34
                        goto L3f
                    L34:
                        com.mob.commons.d$c r2 = com.mob.commons.d.c.this     // Catch: java.lang.Throwable -> L37
                        goto L6
                    L37:
                        r6 = move-exception
                        com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L45
                        r0.d(r6)     // Catch: java.lang.Throwable -> L45
                    L3f:
                        com.mob.commons.d$c r6 = com.mob.commons.d.c.this
                        com.mob.commons.d.c.a(r6)
                        return
                    L45:
                        r6 = move-exception
                        com.mob.commons.d$c r0 = com.mob.commons.d.c.this
                        com.mob.commons.d.c.a(r0)
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.d.c.AnonymousClass1.onResponse(com.mob.tools.utils.DH$DHResponse):void");
                }
            });
        }
    }

    private d() {
        try {
            Context context = MobSDK.getContext();
            String str = j.f8425a;
            File dataCacheFile = ResHelper.getDataCacheFile(context, str, true);
            if (dataCacheFile.exists() && dataCacheFile.length() > 209715200) {
                dataCacheFile.delete();
                dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
            }
            String absolutePath = dataCacheFile.getAbsolutePath();
            f8369b = SQLiteHelper.getDatabase(absolutePath, i.a("008=hkfh6f fhjfUkAfh+g") + "_1");
            f8369b.addField(i.a("004f%fg;nk"), i.a("004fkCfn'f"), true);
            f8369b.addField(i.a("004jJfh[f!fh"), i.a("004fkEfnZf"), true);
            c a10 = c.a();
            if (a10 != null) {
                com.mob.commons.a.d.a().a(0L, 180, a10);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f8368a == null) {
                f8368a = new d();
            }
            dVar = f8368a;
        }
        return dVar;
    }

    public static String a(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            String e10 = s.e();
            if (iArr[i10] < e10.length()) {
                sb2.append((char) (e10.charAt(iArr[i10]) - 2));
            }
        }
        return sb2.toString();
    }

    public static void a(final ArrayList<HashMap<String, Object>> arrayList, final com.mob.tools.utils.b<Void> bVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            bVar.a(null);
            return;
        }
        final File file = new File(MobSDK.getContext().getFilesDir(), i.a("0031hihegf"));
        DH.requester(MobSDK.getContext()).getDeviceKey().getIMEI().getIMSI().getSerialno().getSimSerialNumber().getMIUIVersion().getAdvertisingID().getBssid().request(new DH.DHResponder() { // from class: com.mob.commons.d.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                ByteArrayOutputStream byteArrayOutputStream;
                Thread thread;
                FileOutputStream fileOutputStream;
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        HashMap hashMap = (HashMap) it.next();
                        Boolean bool = (Boolean) hashMap.get(i.a("002Wfhhi"));
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        String str = (String) hashMap.get(i.a("002Hhjgf"));
                        String str2 = (String) hashMap.get("m");
                        String str3 = (String) hashMap.get("args");
                        Object obj = hashMap.get(i.a("002-fgNj"));
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                            String a10 = e.a((MobProduct) null);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(i.a("004jXfefg>j"), a10);
                            hashMap2.put(i.a("005f*gefl!k%fm"), x.a().b());
                            hashMap2.put(i.a("004nIgefgHj"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aX());
                            hashMap2.put(i.a("010$hiGj*flihYkCfjhifggefm"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                            hashMap2.put(i.a("0066fh*ggVflUkYfk"), MobSDK.getAppkey());
                            hashMap2.put(i.a("009?fh2ggUgj'k%fifj%kf"), MobSDK.getAppSecret());
                            hashMap2.put(i.a("006jLge*n[fhfgfm"), MobSDK.getDomain().getDomain());
                            hashMap2.put(i.a("010=hjgefjfiOk<jfXffgMhi"), Boolean.valueOf(MobSDK.checkForceHttps()));
                            hashMap2.put(i.a("004k-fi1k=fn"), Long.valueOf(((Long) com.mob.commons.b.a(i.a("004k*fi4k]fn"), 5L)).longValue()));
                            hashMap2.put(i.a("002JfiIj"), (String) com.mob.commons.b.a(i.a("002Rfi,j"), i.a("006Cimiminininin")));
                            hashMap2.put("usridt", v.d());
                            hashMap2.put(i.a("002_fg^j"), obj);
                            if (!TextUtils.isEmpty(str3)) {
                                hashMap2.put("args", HashonHelper.fromJson(str3));
                            }
                            hashMap2.put(i.a("008jklDfgfi+k8gi$j"), dHResponse.getDeviceKey());
                            hashMap2.put(i.a("004FfgAnk.fg"), dHResponse.getIMEI());
                            hashMap2.put(i.a("004IfgSn-hifg"), dHResponse.getIMSI());
                            hashMap2.put("sno", dHResponse.getSerialno());
                            hashMap2.put("ssno", dHResponse.getSimSerialNumber());
                            hashMap2.put("miui", dHResponse.getMIUIVersion());
                            hashMap2.put(i.a("005nXgeHjk3gf"), DH.SyncMtd.getModel());
                            hashMap2.put(i.a("007,hjfhfiEfHgefjfk"), DH.SyncMtd.getManufacturer());
                            hashMap2.put(i.a("005%hefjfhfm$j"), DH.SyncMtd.getBrand());
                            hashMap2.put(i.a("005^fh%j@hifg2j"), dHResponse.getAdvertisingID());
                            hashMap2.put(i.a("0064fhWgglk:fj"), DH.SyncMtd.getAppVersionName());
                            hashMap2.put("appVerCode", Integer.valueOf(DH.SyncMtd.getAppVersion()));
                            hashMap2.put(i.a("011gAfhfiflfhhh=k0ghfhMnk"), DH.SyncMtd.getPackageName());
                            hashMap2.put(i.a("005MhehihifgXj"), dHResponse.getBssid());
                            hashMap2.put("osint", Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                            hashMap2.put("osname", DH.SyncMtd.getOSVersionName());
                            hashMap2.put("mdpName", MDP.class.getName());
                            String fromHashMap = HashonHelper.fromHashMap(hashMap2);
                            String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str);
                            if (booleanValue) {
                                File file2 = new File(file, str2);
                                if (file2.exists() && str2.equals(Data.MD5(file2))) {
                                    thread = new Thread(new a(file2.getAbsolutePath(), fromHashMap));
                                }
                                if (file2.exists()) {
                                    file2.delete();
                                }
                                file.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(file2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = null;
                                }
                                try {
                                    new NetworkHelper().download(checkHttpRequestUrl, fileOutputStream, null);
                                    C0744r.a(fileOutputStream);
                                    if (file2.length() > 0 && TextUtils.equals(str2, Data.MD5(file2))) {
                                        thread = new Thread(new a(file2.getAbsolutePath(), fromHashMap));
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    C0744r.a(fileOutputStream);
                                    throw th;
                                }
                            } else {
                                File file3 = new File(file, str2);
                                if (file3.exists()) {
                                    file3.delete();
                                }
                                final byte[][] bArr = new byte[1];
                                final int[] iArr = new int[1];
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream() { // from class: com.mob.commons.d.1.1
                                        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                        public void close() {
                                            super.close();
                                            bArr[0] = ((ByteArrayOutputStream) this).buf;
                                            iArr[0] = ((ByteArrayOutputStream) this).count;
                                        }
                                    };
                                } catch (Throwable th4) {
                                    th = th4;
                                    byteArrayOutputStream = null;
                                }
                                try {
                                    new NetworkHelper().download(checkHttpRequestUrl, byteArrayOutputStream, null);
                                    C0744r.a(byteArrayOutputStream);
                                    thread = new Thread(new a(byteArrayOutputStream.toByteArray(), fromHashMap));
                                } catch (Throwable th5) {
                                    th = th5;
                                    C0744r.a(byteArrayOutputStream);
                                    throw th;
                                }
                            }
                            thread.start();
                        }
                        return;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
    }

    public void a(long j10, HashMap<String, Object> hashMap) {
        boolean a10 = com.mob.commons.b.a();
        NLog mobLog = MobLog.getInstance();
        StringBuilder a11 = android.support.v4.media.d.a("DH PD: ");
        a11.append(hashMap.get(i.a("004fZfkCgk")));
        a11.append(", to: ");
        a11.append(a10);
        mobLog.d(a11.toString(), new Object[0]);
        if (a10) {
            u.f8517d.execute(b.b(j10, hashMap));
        }
    }
}
