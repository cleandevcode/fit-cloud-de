package com.mob.commons;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    public static volatile boolean f8445a = false;

    /* renamed from: b */
    private static m f8446b;

    /* renamed from: c */
    private File f8447c;

    /* renamed from: d */
    private BigInteger f8448d;

    /* renamed from: e */
    private BigInteger f8449e;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        private static final a[] f8452a = new a[2];

        /* renamed from: b */
        private int f8453b;

        /* renamed from: c */
        private int f8454c;

        /* renamed from: d */
        private String f8455d;

        /* renamed from: e */
        private String f8456e;

        private a() {
        }

        public static /* synthetic */ a a() {
            return b();
        }

        private static a b() {
            a[] aVarArr = f8452a;
            synchronized (aVarArr) {
                for (int i10 = 0; i10 < 2; i10++) {
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                }
                return new a();
            }
        }

        private void b(final int i10, final int i11, final String str, final String str2) {
            if (m.a().a(new com.mob.tools.utils.e() { // from class: com.mob.commons.m.a.1
                @Override // com.mob.tools.utils.e
                public void a() {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put(n.b("010MefDg^cife.hHcgefcddbcj"), Integer.valueOf(i10));
                        hashMap.put(n.b("0064ef?g'cidhceee"), str);
                        hashMap.put(n.b("004c5ch!dh"), Integer.valueOf(i11));
                        hashMap.put(n.b("005h1cgcgce4c"), Long.valueOf(System.currentTimeMillis()));
                        hashMap.put(n.b("003kDefee"), Base64.encodeToString(str2.getBytes("utf-8"), 2));
                        hashMap.put(n.b("005c@cdFkh-ef"), 1);
                        m.b(i11).a(HashonHelper.fromHashMap(hashMap));
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
            })) {
                u.f8516c.execute(c.a());
            }
        }

        private void c() {
            try {
                a[] aVarArr = f8452a;
                synchronized (aVarArr) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (aVarArr[i10] == null) {
                            aVarArr[i10] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public a a(int i10, int i11, String str, String str2) {
            this.f8453b = i10;
            this.f8454c = i11;
            this.f8455d = str;
            this.f8456e = str2;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b(this.f8453b, this.f8454c, this.f8455d, this.f8456e);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0112a {

        /* renamed from: a */
        public ArrayList<HashMap<String, Object>> f8462a;

        /* renamed from: b */
        public int f8463b;

        /* renamed from: c */
        public String f8464c;

        private b() {
            this.f8462a = new ArrayList<>();
            this.f8463b = -1;
        }

        private HashMap<String, Object> a(DH.DHResponse dHResponse, int i10, String str) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(n.b("003OciPhPch"), MobSDK.getAppkey());
            hashMap.put(n.b("004dFdcceBc"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
            hashMap.put(n.b("003;ef^gHci"), str);
            hashMap.put(n.b("006=efHgWciDih*cg"), Integer.valueOf(i10));
            hashMap.put(n.b("007Dce+dd*cjce-kh"), dHResponse.getAppName());
            hashMap.put(n.b("006GceHdddFciee"), DH.SyncMtd.getPackageName());
            hashMap.put(n.b("006-ceYddihRcg"), String.valueOf(DH.SyncMtd.getAppVersion()));
            hashMap.put(n.b("005kFdb]gh?dc"), DH.SyncMtd.getModel());
            if (com.mob.commons.b.b()) {
                hashMap.put(n.b("008ghi;cdcfChKcd$g"), dHResponse.getDeviceKey());
                hashMap.put(n.b("004=cbBgScd g"), dHResponse.getDeviceId());
            }
            hashMap.put(n.b("0063efchef]ihUcg"), String.valueOf(DH.SyncMtd.getOSVersionInt()));
            hashMap.put(n.b("011TcjNhcMecdbcgci)c@ch2dh"), dHResponse.getDetailNetworkTypeForStatic());
            return hashMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String b(String str) {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            byte[] bArr;
            GZIPOutputStream gZIPOutputStream;
            Throwable th3;
            try {
                bArr = str.getBytes();
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th4) {
                byteArrayInputStream = null;
                th2 = th4;
                bArr = null;
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (Throwable th5) {
                        gZIPOutputStream = null;
                        th3 = th5;
                    }
                    try {
                        byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        while (true) {
                            int read = byteArrayInputStream.read(bArr2, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                            if (read != -1) {
                                gZIPOutputStream.write(bArr2, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        gZIPOutputStream.flush();
                        C0744r.a(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        String encodeToString = Base64.encodeToString(byteArray, 2);
                        C0744r.a(byteArrayOutputStream, byteArrayInputStream);
                        return encodeToString;
                    } catch (Throwable th6) {
                        th3 = th6;
                        C0744r.a(gZIPOutputStream);
                        throw th3;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    bArr = null;
                    C0744r.a(bArr, byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th8) {
                th2 = th8;
                C0744r.a(bArr, byteArrayInputStream);
                throw th2;
            }
        }

        @Override // com.mob.tools.a.InterfaceC0112a
        public void a(String str) {
            HashMap<String, Object> fromJson = HashonHelper.fromJson(str);
            try {
                this.f8463b = Integer.parseInt(String.valueOf(fromJson.get(n.b("010!ef]gRcife?h[cgefcddbcj"))));
            } catch (Throwable unused) {
            }
            this.f8464c = (String) fromJson.get(n.b("0065ef-gQcidhceee"));
            this.f8462a.add(fromJson);
        }

        @Override // com.mob.tools.a.InterfaceC0112a
        public boolean a(DH.DHResponse dHResponse) {
            HashMap<String, Object> a10 = a(dHResponse, this.f8463b, this.f8464c);
            a10.put(n.b("006h.cgcgSkNefee"), this.f8462a);
            try {
                String fromHashMap = HashonHelper.fromHashMap(a10);
                this.f8462a.clear();
                String b10 = b(fromHashMap);
                if (n.b("004=cjdbcj]h").equals(dHResponse.getDetailNetworkTypeForStatic())) {
                    throw new IllegalStateException("network is disconnected!");
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("m", b10);
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 10000;
                networkTimeOut.connectionTimeout = 10000;
                String str = com.mob.commons.c.a(com.mob.commons.c.f8284d) + "/errlog";
                MobLog.getInstance().d(String.format("Response(%s): %s", str, new NetworkHelper().httpPostNew(str, hashMap, null, networkTimeOut)), new Object[0]);
                return true;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a */
        private static final c[] f8465a = new c[2];

        /* renamed from: b */
        private Runnable f8466b = new com.mob.tools.utils.e() { // from class: com.mob.commons.m.c.1
            @Override // com.mob.tools.utils.e
            public void a() {
                m.b(1).a(new b());
            }
        };

        /* renamed from: c */
        private Runnable f8467c = new com.mob.tools.utils.e() { // from class: com.mob.commons.m.c.2
            @Override // com.mob.tools.utils.e
            public void a() {
                m.b(2).a(new b());
            }
        };

        private c() {
        }

        public static /* synthetic */ c a() {
            return b();
        }

        private static c b() {
            c[] cVarArr = f8465a;
            synchronized (cVarArr) {
                for (int i10 = 0; i10 < 2; i10++) {
                    c cVar = cVarArr[i10];
                    if (cVar != null) {
                        cVarArr[i10] = null;
                        return cVar;
                    }
                }
                return new c();
            }
        }

        public void c() {
            try {
                c[] cVarArr = f8465a;
                synchronized (cVarArr) {
                    for (int i10 = 0; i10 < 2; i10++) {
                        if (cVarArr[i10] == null) {
                            cVarArr[i10] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mob.commons.b.c()) {
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.m.c.3
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        if (n.b("0049cjdbcj9h").equals(dHResponse.getDetailNetworkTypeForStatic())) {
                            return;
                        }
                        if (((Integer) com.mob.commons.b.a(n.b("004[cfRh2cgcg"), 1)).intValue() == 1) {
                            m.a().a(c.this.f8466b);
                        } else {
                            m.b(1).a(((Long) com.mob.commons.b.a("cerr_max", 104857600L)).longValue());
                        }
                        if (((Integer) com.mob.commons.b.a(n.b("004]ef.h*cgcg"), 0)).intValue() == 1) {
                            m.a().a(c.this.f8467c);
                        } else {
                            m.b(2).a(((Long) com.mob.commons.b.a("serr_max", 20971520L)).longValue());
                        }
                    }
                });
            }
        }
    }

    private m() {
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            if (f8446b == null) {
                f8446b = new m();
            }
            mVar = f8446b;
        }
        return mVar;
    }

    private String a(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (this.f8448d == null) {
                this.f8448d = new BigInteger("f53c224aefb38daa0825c1b8ea691b16d2e16db10880548afddd780c6670a091a11dafa954ea4a9483797fda1045d2693a08daa48cf9cedce1e8733b857304cb", 16);
                this.f8449e = new BigInteger("27749621e6ca022469645faed16e8261acf6af822467382d55c24bb9bc02356ab16e76ddc799dc8ba6b4f110411996eeb63505c9dcf969d3fc085d712f0f1a9713b67aa1128d7cc41bda363afb0ec7ade60e542a4e22869395331cc0096de412034551e98bb2629ae1b7168b8bc82006d064ab335d8567283e70beb6a49e9423", 16);
            }
            byte[] c10 = c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
            try {
                byte[] encode = new MobRSA(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED).encode(c10, this.f8448d, this.f8449e);
                dataOutputStream.writeInt(encode.length);
                dataOutputStream.write(encode);
                byte[] AES128Encode = Data.AES128Encode(c10, str.getBytes("utf-8"));
                dataOutputStream.writeInt(AES128Encode.length);
                dataOutputStream.write(AES128Encode);
                dataOutputStream.flush();
                C0744r.a(dataOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            } catch (Throwable th3) {
                th = th3;
                C0744r.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().d(th4);
            return null;
        }
    }

    public boolean a(final Runnable runnable) {
        if (this.f8447c == null) {
            File file = new File(MobSDK.getContext().getFilesDir(), n.b("005 dkdcdbcfci"));
            this.f8447c = file;
            if (!file.exists()) {
                try {
                    this.f8447c.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
        return l.a(this.f8447c, new k() { // from class: com.mob.commons.m.1
            @Override // com.mob.commons.k
            public boolean a(FileLocker fileLocker) {
                try {
                    runnable.run();
                    return false;
                } catch (Throwable th2) {
                    MobLog.getInstance().i(th2);
                    return false;
                }
            }
        });
    }

    public static com.mob.tools.a b(int i10) {
        String b10 = n.b("005*dkMk.cfdcee");
        return new com.mob.tools.a(b10, n.b("005*dkMk.cfdcee") + "-" + i10, 50);
    }

    private byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                SecureRandom secureRandom = new SecureRandom();
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.writeLong(secureRandom.nextLong());
                dataOutputStream2.flush();
                C0744r.a(dataOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                C0744r.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public int a(int i10, String str) {
        if (MobSDK.getContextSafely() == null || !f8445a) {
            return 0;
        }
        try {
            Intent intent = new Intent();
            intent.setPackage(n.b("0152cfcjdkef,bMcecgFh1efPg(cidkdcdbee"));
            intent.putExtra(n.b("007dAcecfciceeeWh"), MobSDK.getContext().getPackageName());
            intent.putExtra(n.b("008dKcgcddbcgcd^c<ch"), i10);
            intent.putExtra("ver", MobSDK.SDK_VERSION_CODE);
            intent.putExtra(n.b("003k?efee"), a(str));
            MobSDK.getContextSafely().sendBroadcast(intent);
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void a(int i10, String str, int i11, String str2) {
        if (i10 == 1) {
            a.a().a(i11, i10, str, str2).run();
        } else {
            u.f8516c.execute(a.a().a(i11, i10, str, str2));
        }
    }

    public void b() {
        u.f8516c.execute(c.a());
    }
}
