package com.mob.commons;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private boolean f8204a = false;

    /* renamed from: b */
    private final byte[] f8205b = new byte[0];

    /* renamed from: com.mob.commons.a$a */
    /* loaded from: classes.dex */
    public static class C0104a {

        /* renamed from: a */
        private String f8211a;

        /* renamed from: b */
        private long f8212b;

        /* renamed from: c */
        private String f8213c;

        /* renamed from: d */
        private long f8214d;

        /* renamed from: e */
        private String f8215e;

        public C0104a(String str, long j10, String str2, long j11, String str3) {
            this.f8211a = str;
            this.f8212b = j10;
            this.f8213c = str2;
            this.f8214d = j11;
            this.f8215e = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:83:0x007f A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:53:0x0007, B:56:0x001f, B:60:0x0027, B:62:0x0035, B:66:0x003e, B:68:0x004c, B:72:0x0055, B:74:0x005f, B:76:0x0063, B:81:0x0077, B:83:0x007f, B:85:0x0083, B:91:0x0098, B:87:0x008b, B:89:0x008f, B:77:0x006a, B:79:0x006e), top: B:96:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.mob.commons.a.C0104a a(java.lang.String r12) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r12)
                r1 = 0
                if (r0 != 0) goto Laa
                java.util.HashMap r12 = com.mob.tools.utils.HashonHelper.fromJson(r12)     // Catch: java.lang.Throwable -> La2
                java.lang.String r0 = "004h4dcdeVh"
                java.lang.String r0 = com.mob.commons.o.a(r0)     // Catch: java.lang.Throwable -> La2
                java.lang.Object r0 = r12.get(r0)     // Catch: java.lang.Throwable -> La2
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La2
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La2
                java.lang.String r3 = "null"
                if (r2 != 0) goto L26
                boolean r2 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> La2
                if (r2 != 0) goto L26
                goto L27
            L26:
                r0 = r1
            L27:
                java.lang.String r2 = "genType"
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La2
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La2
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La2
                if (r4 != 0) goto L3d
                boolean r4 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La2
                if (r4 != 0) goto L3d
                r6 = r2
                goto L3e
            L3d:
                r6 = r1
            L3e:
                java.lang.String r2 = "gp"
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La2
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La2
                boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La2
                if (r4 != 0) goto L54
                boolean r3 = android.text.TextUtils.equals(r3, r2)     // Catch: java.lang.Throwable -> La2
                if (r3 != 0) goto L54
                r9 = r2
                goto L55
            L54:
                r9 = r1
            L55:
                java.lang.String r2 = "gt"
                java.lang.Object r2 = r12.get(r2)     // Catch: java.lang.Throwable -> La2
                r3 = 0
                if (r2 == 0) goto L76
                boolean r5 = r2 instanceof java.lang.Long     // Catch: java.lang.Throwable -> La2
                if (r5 == 0) goto L6a
                java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> La2
                long r7 = r2.longValue()     // Catch: java.lang.Throwable -> La2
                goto L77
            L6a:
                boolean r5 = r2 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> La2
                if (r5 == 0) goto L76
                java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> La2
                int r2 = r2.intValue()     // Catch: java.lang.Throwable -> La2
                long r7 = (long) r2     // Catch: java.lang.Throwable -> La2
                goto L77
            L76:
                r7 = r3
            L77:
                java.lang.String r2 = "expTime"
                java.lang.Object r12 = r12.get(r2)     // Catch: java.lang.Throwable -> La2
                if (r12 == 0) goto L97
                boolean r2 = r12 instanceof java.lang.Long     // Catch: java.lang.Throwable -> La2
                if (r2 == 0) goto L8b
                java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Throwable -> La2
                long r2 = r12.longValue()     // Catch: java.lang.Throwable -> La2
            L89:
                r10 = r2
                goto L98
            L8b:
                boolean r2 = r12 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> La2
                if (r2 == 0) goto L97
                java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> La2
                int r12 = r12.intValue()     // Catch: java.lang.Throwable -> La2
                long r2 = (long) r12     // Catch: java.lang.Throwable -> La2
                goto L89
            L97:
                r10 = r3
            L98:
                com.mob.commons.a$a r12 = new com.mob.commons.a$a     // Catch: java.lang.Throwable -> La2
                r2 = r12
                r3 = r0
                r4 = r7
                r7 = r10
                r2.<init>(r3, r4, r6, r7, r9)     // Catch: java.lang.Throwable -> La2
                return r12
            La2:
                r12 = move-exception
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r12)
            Laa:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.C0104a.a(java.lang.String):com.mob.commons.a$a");
        }

        public String a() {
            try {
                return HashonHelper.fromHashMap(b());
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        public boolean a(long j10) {
            long j11 = this.f8214d;
            return j11 == 0 || (j11 * 1000) + j10 <= System.currentTimeMillis();
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(o.a("004h6dcdeOh"), this.f8211a);
            hashMap.put("gt", Long.valueOf(this.f8212b));
            hashMap.put("genType", this.f8213c);
            hashMap.put("expTime", Long.valueOf(this.f8214d));
            hashMap.put("gp", this.f8215e);
            return hashMap;
        }

        public String c() {
            return this.f8211a;
        }

        public long d() {
            return this.f8212b;
        }

        public String e() {
            return this.f8213c;
        }

        public long f() {
            return this.f8214d;
        }

        public String g() {
            return this.f8215e;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static final List<String> f8229a = Arrays.asList("4c5f81a0-4728-476f-a57f-b46fa44f07d3", "f6af99e2-2b64-4eb6-aba6-4d44fb935939", "00000000-0000-0000-0000-000000000000");

        /* renamed from: b */
        private static final List<String> f8230b = Arrays.asList("0", "867731020001006", "00000000", "012345678912345", "1152", "000000000000000");

        /* renamed from: c */
        private static final List<String> f8231c = Arrays.asList("D01EB0A014660Q99", "ZTEBA611T", "C1330", "ZTEBA610T", "28Y67IJ7T3", "HMN5S1FLOQ", "01234567890123456789", o.a("007Wdcdkdjdkecfddk"), "1234567890ABCDEF", "SY58S62YHN", "ACKRZJFKSN", "ZTEBA910", "LenovoTAB2A8", "ZTEBA520", "0123456789ABCDEF", "ZTEBA510");

        /* renamed from: d */
        private static final List<String> f8232d = Arrays.asList("14:63:18:3D:AB:18", "00:81:df:d5:a6:a5", "080027C446C0", "08:00:27:a9:d5:97", "00:02:00:00:00:00", o.a("017^fegk%fTfefeGfDfefeGfBfefeGf;fefe1fMfefe"), "ff:ff:ff:ff:ff:ff", "00:81:3c:75:32:e1", "A6:C0:80:E4:1A:50", o.a("017*fefeVfFfefe0f+fefe*f'fefeSfDfefe[f3fefe"), "58:02:03:04:05:06", "00:90:4c:11:22:33", "08:00:27:b2:8b:50", "90:67:1c:e6:4d:55");

        /* renamed from: e */
        private static final List<String> f8233e = Arrays.asList("00000000-0000-0000-0000-000000000000", "00000000000000000000000000000000");

        /* renamed from: f */
        private List<String> f8234f;

        /* renamed from: g */
        private List<String> f8235g;

        /* renamed from: h */
        private List<String> f8236h;

        /* renamed from: i */
        private List<String> f8237i;

        /* renamed from: j */
        private List<String> f8238j;

        private b() {
        }

        public String a(long j10) {
            try {
                String uuid = UUID.randomUUID().toString();
                return TextUtils.isEmpty(uuid) ? b(j10) : uuid;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        private String b(long j10) {
            DataOutputStream dataOutputStream;
            long nextLong;
            long currentTimeMillis;
            ByteArrayOutputStream byteArrayOutputStream;
            String str = null;
            try {
                try {
                    nextLong = new SecureRandom().nextLong();
                    currentTimeMillis = j10 + System.currentTimeMillis();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = null;
                }
            } catch (Throwable th3) {
                MobLog.getInstance().d(th3);
            }
            try {
                dataOutputStream.writeLong(nextLong);
                dataOutputStream.writeLong(currentTimeMillis);
                str = Data.byteToHex(byteArrayOutputStream.toByteArray());
                dataOutputStream.flush();
                dataOutputStream.close();
            } catch (Throwable th4) {
                th = th4;
                try {
                    MobLog.getInstance().d(th);
                    if (dataOutputStream != null) {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    }
                    return str;
                } catch (Throwable th5) {
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (Throwable th6) {
                            MobLog.getInstance().d(th6);
                        }
                    }
                    throw th5;
                }
            }
            return str;
        }

        private void c() {
            c d10 = MobSDK.SDK_VERSION_CODE + 30 >= d() ? w.a().d() : e();
            if (d10 != null) {
                if (d10.c() != null) {
                    this.f8234f = d10.c();
                }
                if (d10.d() != null) {
                    this.f8235g = d10.d();
                }
                if (d10.e() != null) {
                    this.f8236h = d10.e();
                }
                if (d10.f() != null) {
                    this.f8237i = d10.f();
                }
                if (d10.g() != null) {
                    this.f8238j = d10.g();
                }
            }
            if (this.f8234f == null) {
                this.f8234f = f8229a;
            }
            if (this.f8235g == null) {
                this.f8235g = f8230b;
            }
            if (this.f8236h == null) {
                this.f8236h = f8231c;
            }
            if (this.f8237i == null) {
                this.f8237i = f8232d;
            }
            if (this.f8238j == null) {
                this.f8238j = f8233e;
            }
        }

        private int d() {
            try {
                return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return 0;
            }
        }

        private c e() {
            try {
                NetworkHelper networkHelper = new NetworkHelper();
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.connectionTimeout = 2000;
                networkTimeOut.readTimout = 5000;
                String httpPostNew = networkHelper.httpPostNew(com.mob.commons.c.a(com.mob.commons.c.f8285e) + "/getDuidBlacklist", null, null, networkTimeOut);
                HashMap fromJson = HashonHelper.fromJson(httpPostNew);
                if (fromJson != null && !fromJson.isEmpty()) {
                    if (!"200".equals(String.valueOf(fromJson.get(o.a("006$fg7dKdf*dLdcfg"))))) {
                        throw new Throwable("RS is illegal: " + httpPostNew);
                    }
                    String valueOf = String.valueOf(fromJson.get(o.a("004h.df*d]df")));
                    if (!TextUtils.isEmpty(valueOf)) {
                        c a10 = c.a(Data.AES128Decode(f(), Base64.decode(valueOf, 0)));
                        w.a().a(a10);
                        return a10;
                    }
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
            return null;
        }

        private String f() {
            String[] strArr = {"QvxJJ", "FYsAX", "cvWe", "MqlWJL"};
            return strArr[1] + strArr[3] + new String[]{"akuRE", "wbMqR", "uBs", "CDpnc"}[3];
        }

        public C0104a a() {
            try {
                c();
                return b();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return null;
            }
        }

        public C0104a b() {
            final AtomicReference atomicReference = new AtomicReference(null);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                DH.requester(MobSDK.getContext()).getAdvertisingID().request(new DH.DHResponder() { // from class: com.mob.commons.a.b.1
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        try {
                            String advertisingID = dHResponse.getAdvertisingID();
                            if (TextUtils.isEmpty(advertisingID) || b.this.f8234f.contains(advertisingID)) {
                                advertisingID = null;
                            }
                            if (TextUtils.isEmpty(advertisingID)) {
                                advertisingID = b.this.a(SystemClock.elapsedRealtime());
                            }
                            C0104a c0104a = new C0104a(TextUtils.isEmpty(advertisingID) ? null : Data.byteToHex(Data.SHA1(advertisingID)), System.currentTimeMillis(), "client", 0L, Base64.encodeToString(advertisingID.getBytes(), 2));
                            w.a().a(c0104a);
                            atomicReference.getAndSet(c0104a);
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
                countDownLatch.await(150L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            return (C0104a) atomicReference.get();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private List<String> f8246a;

        /* renamed from: b */
        private List<String> f8247b;

        /* renamed from: c */
        private List<String> f8248c;

        /* renamed from: d */
        private List<String> f8249d;

        /* renamed from: e */
        private List<String> f8250e;

        public c(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
            this.f8246a = list;
            this.f8247b = list2;
            this.f8248c = list3;
            this.f8249d = list4;
            this.f8250e = list5;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0083 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:65:0x0007, B:67:0x0013, B:69:0x0017, B:75:0x0027, B:77:0x002f, B:79:0x0033, B:85:0x0043, B:87:0x004b, B:89:0x004f, B:95:0x005f, B:97:0x0067, B:99:0x006b, B:105:0x007b, B:107:0x0083, B:109:0x0087, B:115:0x0097, B:111:0x008f, B:113:0x0093, B:101:0x0073, B:103:0x0077, B:91:0x0057, B:93:0x005b, B:81:0x003b, B:83:0x003f, B:71:0x001f, B:73:0x0023), top: B:120:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x002f A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:65:0x0007, B:67:0x0013, B:69:0x0017, B:75:0x0027, B:77:0x002f, B:79:0x0033, B:85:0x0043, B:87:0x004b, B:89:0x004f, B:95:0x005f, B:97:0x0067, B:99:0x006b, B:105:0x007b, B:107:0x0083, B:109:0x0087, B:115:0x0097, B:111:0x008f, B:113:0x0093, B:101:0x0073, B:103:0x0077, B:91:0x0057, B:93:0x005b, B:81:0x003b, B:83:0x003f, B:71:0x001f, B:73:0x0023), top: B:120:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x004b A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:65:0x0007, B:67:0x0013, B:69:0x0017, B:75:0x0027, B:77:0x002f, B:79:0x0033, B:85:0x0043, B:87:0x004b, B:89:0x004f, B:95:0x005f, B:97:0x0067, B:99:0x006b, B:105:0x007b, B:107:0x0083, B:109:0x0087, B:115:0x0097, B:111:0x008f, B:113:0x0093, B:101:0x0073, B:103:0x0077, B:91:0x0057, B:93:0x005b, B:81:0x003b, B:83:0x003f, B:71:0x001f, B:73:0x0023), top: B:120:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0067 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:65:0x0007, B:67:0x0013, B:69:0x0017, B:75:0x0027, B:77:0x002f, B:79:0x0033, B:85:0x0043, B:87:0x004b, B:89:0x004f, B:95:0x005f, B:97:0x0067, B:99:0x006b, B:105:0x007b, B:107:0x0083, B:109:0x0087, B:115:0x0097, B:111:0x008f, B:113:0x0093, B:101:0x0073, B:103:0x0077, B:91:0x0057, B:93:0x005b, B:81:0x003b, B:83:0x003f, B:71:0x001f, B:73:0x0023), top: B:120:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.mob.commons.a.c a(java.lang.String r8) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                r1 = 0
                if (r0 != 0) goto La6
                java.util.HashMap r8 = com.mob.tools.utils.HashonHelper.fromJson(r8)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r0 = "idfas"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L26
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L1f
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L9e
            L1d:
                r3 = r0
                goto L27
            L1f:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L26
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9e
                goto L1d
            L26:
                r3 = r1
            L27:
                java.lang.String r0 = "ieid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L42
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L3b
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L9e
            L39:
                r4 = r0
                goto L43
            L3b:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L42
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9e
                goto L39
            L42:
                r4 = r1
            L43:
                java.lang.String r0 = "snid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L5e
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L57
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L9e
            L55:
                r5 = r0
                goto L5f
            L57:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L5e
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9e
                goto L55
            L5e:
                r5 = r1
            L5f:
                java.lang.String r0 = "mcid"
                java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L7a
                boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L73
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L9e
                java.util.List r0 = b(r0)     // Catch: java.lang.Throwable -> L9e
            L71:
                r6 = r0
                goto L7b
            L73:
                boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L9e
                if (r2 == 0) goto L7a
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9e
                goto L71
            L7a:
                r6 = r1
            L7b:
                java.lang.String r0 = "oiid"
                java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L9e
                if (r8 == 0) goto L96
                boolean r0 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L8f
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L9e
                java.util.List r8 = b(r8)     // Catch: java.lang.Throwable -> L9e
            L8d:
                r7 = r8
                goto L97
            L8f:
                boolean r0 = r8 instanceof java.util.List     // Catch: java.lang.Throwable -> L9e
                if (r0 == 0) goto L96
                java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L9e
                goto L8d
            L96:
                r7 = r1
            L97:
                com.mob.commons.a$c r8 = new com.mob.commons.a$c     // Catch: java.lang.Throwable -> L9e
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9e
                return r8
            L9e:
                r8 = move-exception
                com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
                r0.d(r8)
            La6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.c.a(java.lang.String):com.mob.commons.a$c");
        }

        private static List<String> b(String str) {
            String[] split;
            ArrayList arrayList = new ArrayList();
            try {
                return (TextUtils.isEmpty(str) || (split = str.split(",")) == null || split.length <= 0) ? arrayList : new ArrayList(Arrays.asList(split));
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return arrayList;
            }
        }

        public String a() {
            return HashonHelper.fromHashMap(b());
        }

        public HashMap<String, Object> b() {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("idfas", this.f8246a);
            hashMap.put("ieid", this.f8247b);
            hashMap.put("snid", this.f8248c);
            hashMap.put("mcid", this.f8249d);
            hashMap.put("oiid", this.f8250e);
            return hashMap;
        }

        public List<String> c() {
            return this.f8246a;
        }

        public List<String> d() {
            return this.f8247b;
        }

        public List<String> e() {
            return this.f8248c;
        }

        public List<String> f() {
            return this.f8249d;
        }

        public List<String> g() {
            return this.f8250e;
        }
    }

    public String a(String str, DH.DHResponse dHResponse) {
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
        if (com.mob.commons.b.c()) {
            C0104a e10 = w.a().e();
            if (e10 == null || e10.a(w.a().b("key_request_duid_time", 0L)) || t.a().d()) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(o.a("004e[eddf?d"), 1);
                hashMap.put("iemt", dHResponse.getIMEI());
                hashMap.put("snmt", dHResponse.getSerialno());
                hashMap.put(o.a("005l9ec_hi2ed"), DH.SyncMtd.getModel());
                hashMap.put(o.a("007Rfhdfdg6dRecdhdi"), DH.SyncMtd.getManufacturer());
                hashMap.put("admt", dHResponse.getAdvertisingID());
                hashMap.put("oamt", com.mob.tools.a.c.a(MobSDK.getContext()).b().aX());
                hashMap.put("ismt", dHResponse.getIMSI());
                hashMap.put("ssnmt", dHResponse.getSimSerialNumber());
                hashMap.put("inpkgt", Long.valueOf(dHResponse.getAppLastUpdateTime()));
                hashMap.put("btt", Long.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put(o.a("004MdhThTde*h"), t.a().e());
                hashMap.put("v", t.a().b());
                hashMap.put(o.a("004e5dcde5h"), t.a().g());
                hashMap.put(o.a("005hJdhGl-deYh"), t.a().h());
                hashMap.put(o.a("008d_ec5eIdd!h]dhDl,fg"), t.a().i());
                if (e10 == null) {
                    hashMap.put(o.a("004h!dcde+h"), str);
                    hashMap.put("genType", "common");
                } else {
                    hashMap.put(o.a("004h.dcdeXh"), e10.c());
                    hashMap.put("gt", Long.valueOf(e10.d()));
                    hashMap.put("genType", e10.e());
                    hashMap.put("expTime", Long.valueOf(e10.f()));
                    hashMap.put("gp", e10.g());
                }
                NetCommunicator netCommunicator = new NetCommunicator(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, "ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", "191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd");
                HashMap hashMap2 = (HashMap) netCommunicator.requestSynchronized(hashMap, com.mob.commons.c.a(com.mob.commons.c.f8285e) + "/v3/dgen", false);
                if (hashMap2 != null) {
                    w.a().a("key_request_duid_time", System.currentTimeMillis());
                    try {
                        String str2 = (String) hashMap2.get(o.a("004[dhJhTde'h"));
                        if (!TextUtils.isEmpty(str2)) {
                            t.a().a(str2);
                        }
                    } catch (Throwable unused) {
                    }
                    C0104a a10 = C0104a.a(HashonHelper.fromHashMap(hashMap2));
                    if (a10 != null) {
                        w.a().a(a10);
                        return a10.c();
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private HashMap<String, Object> a(File file) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        HashMap<String, Object> hashMap = null;
        if (file.exists() && file.isFile()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        hashMap = (HashMap) objectInputStream.readObject();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    objectInputStream = null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
                objectInputStream = null;
            }
            if (hashMap != null) {
                try {
                    if (!hashMap.isEmpty() && hashMap.keySet().contains(o.a("004h^dcdeHh"))) {
                        file.delete();
                        b(d(), hashMap);
                        C0744r.a(fileInputStream, objectInputStream);
                    }
                } catch (Throwable th2) {
                    try {
                        MobLog.getInstance().w(th2);
                        C0744r.a(fileInputStream, objectInputStream);
                    } catch (Throwable th3) {
                        C0744r.a(fileInputStream, objectInputStream);
                        throw th3;
                    }
                }
            }
            hashMap = b(file);
            C0744r.a(fileInputStream, objectInputStream);
        }
        return hashMap;
    }

    private static HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return HashonHelper.fromJson(Data.AES128Decode(str, bArr));
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new HashMap<>();
        }
    }

    public void a(final HashMap<String, Object> hashMap) {
        l.a(l.a(l.f8435c), new k() { // from class: com.mob.commons.a.2
            @Override // com.mob.commons.k
            public boolean a(FileLocker fileLocker) {
                try {
                    a.b(a.this.d(), hashMap);
                    return false;
                } catch (Throwable th2) {
                    MobLog.getInstance().w(th2);
                    return false;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x0146 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x0229, blocks: (B:136:0x0002, B:138:0x0010, B:139:0x001e, B:141:0x0043, B:154:0x0084, B:156:0x008e, B:162:0x00a1, B:164:0x00a7, B:183:0x00f4, B:218:0x0152, B:220:0x015c, B:221:0x0165, B:225:0x017f, B:238:0x01c0, B:240:0x01ca, B:242:0x01d0, B:243:0x01d3, B:245:0x01f2, B:246:0x01fb, B:248:0x0209, B:249:0x0212, B:142:0x004c, B:144:0x0056, B:226:0x018c, B:230:0x0194, B:171:0x00c4, B:173:0x00ce, B:234:0x01aa, B:158:0x0094, B:185:0x00f9, B:187:0x00ff, B:212:0x013d, B:214:0x0146, B:177:0x00dc, B:179:0x00e6, B:165:0x00ac, B:167:0x00b6, B:148:0x0068, B:150:0x0072), top: B:258:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x015c A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:136:0x0002, B:138:0x0010, B:139:0x001e, B:141:0x0043, B:154:0x0084, B:156:0x008e, B:162:0x00a1, B:164:0x00a7, B:183:0x00f4, B:218:0x0152, B:220:0x015c, B:221:0x0165, B:225:0x017f, B:238:0x01c0, B:240:0x01ca, B:242:0x01d0, B:243:0x01d3, B:245:0x01f2, B:246:0x01fb, B:248:0x0209, B:249:0x0212, B:142:0x004c, B:144:0x0056, B:226:0x018c, B:230:0x0194, B:171:0x00c4, B:173:0x00ce, B:234:0x01aa, B:158:0x0094, B:185:0x00f9, B:187:0x00ff, B:212:0x013d, B:214:0x0146, B:177:0x00dc, B:179:0x00e6, B:165:0x00ac, B:167:0x00b6, B:148:0x0068, B:150:0x0072), top: B:258:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01f2 A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:136:0x0002, B:138:0x0010, B:139:0x001e, B:141:0x0043, B:154:0x0084, B:156:0x008e, B:162:0x00a1, B:164:0x00a7, B:183:0x00f4, B:218:0x0152, B:220:0x015c, B:221:0x0165, B:225:0x017f, B:238:0x01c0, B:240:0x01ca, B:242:0x01d0, B:243:0x01d3, B:245:0x01f2, B:246:0x01fb, B:248:0x0209, B:249:0x0212, B:142:0x004c, B:144:0x0056, B:226:0x018c, B:230:0x0194, B:171:0x00c4, B:173:0x00ce, B:234:0x01aa, B:158:0x0094, B:185:0x00f9, B:187:0x00ff, B:212:0x013d, B:214:0x0146, B:177:0x00dc, B:179:0x00e6, B:165:0x00ac, B:167:0x00b6, B:148:0x0068, B:150:0x0072), top: B:258:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0209 A[Catch: all -> 0x0229, TryCatch #4 {all -> 0x0229, blocks: (B:136:0x0002, B:138:0x0010, B:139:0x001e, B:141:0x0043, B:154:0x0084, B:156:0x008e, B:162:0x00a1, B:164:0x00a7, B:183:0x00f4, B:218:0x0152, B:220:0x015c, B:221:0x0165, B:225:0x017f, B:238:0x01c0, B:240:0x01ca, B:242:0x01d0, B:243:0x01d3, B:245:0x01f2, B:246:0x01fb, B:248:0x0209, B:249:0x0212, B:142:0x004c, B:144:0x0056, B:226:0x018c, B:230:0x0194, B:171:0x00c4, B:173:0x00ce, B:234:0x01aa, B:158:0x0094, B:185:0x00f9, B:187:0x00ff, B:212:0x013d, B:214:0x0146, B:177:0x00dc, B:179:0x00e6, B:165:0x00ac, B:167:0x00b6, B:148:0x0068, B:150:0x0072), top: B:258:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.HashMap<java.lang.String, java.lang.Object> r12, com.mob.tools.utils.DH.DHResponse r13) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.a(java.util.HashMap, com.mob.tools.utils.DH$DHResponse):void");
    }

    public void a(HashMap<String, Object> hashMap, String str, DH.DHResponse dHResponse) {
        try {
            if (com.mob.commons.b.c()) {
                a(hashMap, dHResponse);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(o.a("005d:ecdjWi<dk"), x.a().b());
                for (Map.Entry entry : ((HashMap) hashMap.get(o.a("010hij=dedg%i*egdkfhec"))).entrySet()) {
                    hashMap2.put(entry.getKey(), entry.getValue());
                }
                try {
                    hashMap2.put(o.a("007%dgdfdhdhde>iFdh"), Integer.valueOf(Integer.parseInt(String.valueOf(hashMap2.get(o.a("007PdgdfdhdhdeIiAdh"))))));
                } catch (Throwable unused) {
                }
                hashMap2.put(o.a("004h dcde9h"), str);
                String[] queryIMEI = dHResponse.queryIMEI();
                if (queryIMEI != null && queryIMEI.length > 0) {
                    hashMap2.put("iemtarr", queryIMEI);
                }
                HashMap<String, Long> memoryInfo = dHResponse.getMemoryInfo();
                HashMap<String, HashMap<String, Long>> sizeInfo = dHResponse.getSizeInfo();
                if (memoryInfo != null) {
                    hashMap2.put(o.a("0033dhdfJl"), memoryInfo.get(o.a("005d;ecPd$dfed")));
                }
                if (sizeInfo != null) {
                    HashMap<String, Long> hashMap3 = sizeInfo.get(o.a("006+fgSh7dgdfdh+h"));
                    if (hashMap3 != null) {
                        hashMap2.put(o.a("013'fgHhCdgdfdhDh!ehVdXecdhdfff%i"), hashMap3.get(o.a("005dIec0dQdfed")));
                    }
                    HashMap<String, Long> hashMap4 = sizeInfo.get(o.a("004hEdf+dSdf"));
                    if (hashMap4 != null) {
                        hashMap2.put(o.a("011hUdfIdEdfehBd8ecdhdfffLi"), hashMap4.get(o.a("005d8ec1dUdfed")));
                    }
                }
                hashMap2.put(o.a("006Odhec5l3egXl[ff"), dHResponse.getMIUIVersion());
                if (TextUtils.isEmpty((String) hashMap2.get("iemt"))) {
                    hashMap2.put("iemt", com.mob.tools.a.c.a(MobSDK.getContext()).b().a(true));
                }
                if (TextUtils.isEmpty((String) hashMap2.get("ismt"))) {
                    hashMap2.put("ismt", com.mob.tools.a.c.a(MobSDK.getContext()).b().b(true));
                }
                String encodeToString = Base64.encodeToString(Data.AES128Encode(c(), HashonHelper.fromHashMap(hashMap2)), 2);
                HashMap<String, Object> hashMap5 = new HashMap<>();
                hashMap5.put("m", encodeToString);
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 30000;
                networkTimeOut.connectionTimeout = 30000;
                NetworkHelper networkHelper = new NetworkHelper();
                String str2 = com.mob.commons.c.a(com.mob.commons.c.f8285e) + o.a("006ghXdedkfhec");
                HashMap<String, String> hashMap6 = new HashMap<>();
                hashMap6.put(o.a("013Ieefg9iSdhhiegWhi'dk1d+de^d(di"), v.c());
                hashMap6.put(o.a("004lUecde_h"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aY());
                if ("200".equals(String.valueOf(HashonHelper.fromJson(networkHelper.httpPostNew(str2, hashMap5, hashMap6, networkTimeOut)).get(o.a("006'fgYdWdf;dRdcfg"))))) {
                    w.a().a(w.f8532a, System.currentTimeMillis());
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    private boolean a(MobProduct mobProduct, HashMap<String, Object> hashMap, DH.DHResponse dHResponse) {
        if (com.mob.commons.b.c()) {
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put(o.a("007eVdhec-h]dcdgBd"), mobProduct.getProductTag());
            C0104a e10 = w.a().e();
            String c10 = e10 != null ? e10.c() : null;
            String valueOf = String.valueOf(DH.SyncMtd.getPackageName());
            hashMap2.put(o.a("0068df7ee[djMi.di"), MobSDK.getAppkey());
            hashMap2.put(o.a("004h0dcdeFh"), c10);
            hashMap2.put(o.a("006Rdf4eee djff"), valueOf);
            hashMap2.put(o.a("006Ddf.eeji=dh"), String.valueOf(DH.SyncMtd.getAppVersion()));
            hashMap2.put(o.a("0066fg6h8dj$ji+dh"), String.valueOf(mobProduct.getSdkver()));
            hashMap2.put(o.a("007IdkNid*fdecdhdj"), String.valueOf(dHResponse.getDetailNetworkTypeForStatic()));
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put(o.a("013Jeefg.iMdhhieg=hiLdk9d,de6d:di"), v.c());
            hashMap3.put(o.a("004l1ecde_h"), dHResponse.getODH());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 10000;
            networkTimeOut.connectionTimeout = 10000;
            HashMap fromJson = HashonHelper.fromJson(new NetworkHelper().httpPostNew(com.mob.commons.c.a(com.mob.commons.c.f8285e) + o.a("006ghLfgdeffdk"), hashMap2, hashMap3, networkTimeOut));
            if (o.a("004d-dhdcAi").equals(String.valueOf(fromJson.get(o.a("004%dh7i^dc2e"))))) {
                this.f8204a = true;
            }
            if ("200".equals(String.valueOf(fromJson.get(o.a("006*fg9dJdf*d4dcfg"))))) {
                HashMap hashMap4 = (HashMap) hashMap.get(o.a("007Kdf1eeWegdkfhec"));
                HashMap hashMap5 = (HashMap) hashMap4.get(valueOf);
                if (hashMap5 == null) {
                    hashMap5 = new HashMap();
                }
                hashMap5.put(mobProduct.getProductTag(), MobSDK.getAppkey());
                hashMap4.put(valueOf, hashMap5);
                hashMap.put(o.a("007*df2eeUegdkfhec"), hashMap4);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean a(HashMap<String, Object> hashMap, MobProduct mobProduct, DH.DHResponse dHResponse) {
        if (mobProduct == null) {
            mobProduct = new MobProduct() { // from class: com.mob.commons.Authorizer$2
                @Override // com.mob.commons.MobProduct
                public String getProductTag() {
                    return o.a("0069ggflgigiflef");
                }

                @Override // com.mob.commons.MobProduct
                public int getSdkver() {
                    return MobSDK.SDK_VERSION_CODE;
                }
            };
        }
        boolean z10 = false;
        try {
            HashMap hashMap2 = (HashMap) hashMap.get(o.a("0073dfVeeOegdkfhec"));
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(o.a("007(df8eeVegdkfhec"), hashMap2);
                z10 = true;
            }
            HashMap hashMap3 = (HashMap) hashMap2.get(DH.SyncMtd.getPackageName());
            String str = hashMap3 != null ? (String) hashMap3.get(mobProduct.getProductTag()) : null;
            String appkey = MobSDK.getAppkey();
            if (str == null || !str.equals(appkey)) {
                if (a(mobProduct, hashMap, dHResponse)) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return z10;
    }

    public boolean a(HashMap<String, Object> hashMap, boolean z10, DH.DHResponse dHResponse) {
        HashMap hashMap2;
        int i10;
        if (hashMap != null && !hashMap.isEmpty() && (hashMap2 = (HashMap) hashMap.get(o.a("010hij=dedg]iFegdkfhec"))) != null && !hashMap2.isEmpty()) {
            Object obj = hashMap2.get("admt");
            String str = null;
            try {
                str = dHResponse.getAdvertisingID();
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
            }
            boolean z11 = (str == null || str.equals(obj)) ? false : true;
            Object obj2 = hashMap2.get("ssnmt");
            String simSerialNumber = dHResponse.getSimSerialNumber();
            if (simSerialNumber != null && !simSerialNumber.equals(obj2)) {
                z11 = true;
            }
            Object obj3 = hashMap2.get("iemt");
            String imei = dHResponse.getIMEI();
            if (imei == null || imei.equals(obj3)) {
                i10 = 0;
            } else {
                z11 = true;
                i10 = 1;
            }
            Object obj4 = hashMap2.get("ismt");
            String imsi = dHResponse.getIMSI();
            if (imsi != null && !imsi.equals(obj4)) {
                i10 |= 2;
                z11 = true;
            }
            if (z10) {
                i10 |= 4;
            }
            Object obj5 = hashMap2.get(o.a("004Tecdfde4h"));
            String aX = com.mob.tools.a.c.a(MobSDK.getContext()).b().aX();
            if ((obj5 == null && !TextUtils.isEmpty(aX)) || (obj5 != null && !String.valueOf(obj5).equals(aX))) {
                i10 |= 8;
                z11 = true;
            }
            Object obj6 = hashMap2.get(o.a("004+dh?h(de*h"));
            String c10 = t.a().c();
            if ((obj6 == null && !TextUtils.isEmpty(c10)) || (obj6 != null && !String.valueOf(obj6).equals(c10))) {
                i10 |= 16;
                z11 = true;
            }
            Object obj7 = hashMap2.get(o.a("005h[dh[l;deLh"));
            String h10 = t.a().h();
            if ((obj7 == null && !TextUtils.isEmpty(h10)) || (obj7 != null && !String.valueOf(obj7).equals(h10))) {
                i10 |= 32;
                z11 = true;
            }
            Object obj8 = hashMap2.get(o.a("004e=dcde5h"));
            String g10 = t.a().g();
            if ((obj8 == null && !TextUtils.isEmpty(g10)) || (obj8 != null && !String.valueOf(obj8).equals(g10))) {
                i10 |= 64;
                z11 = true;
            }
            Object obj9 = hashMap2.get(o.a("004(dcUh<deZh"));
            String ud2 = dHResponse.getUD();
            if ((obj9 == null && !TextUtils.isEmpty(ud2)) || (obj9 != null && !String.valueOf(obj9).equals(ud2))) {
                i10 |= 128;
            }
            Object obj10 = hashMap2.get("v");
            String b10 = t.a().b();
            if ((obj10 == null && !TextUtils.isEmpty(b10)) || (obj10 != null && !String.valueOf(obj10).equals(b10))) {
                z11 = true;
            }
            hashMap2.put("cid_modify", Integer.valueOf(i10));
            if (z11) {
                return true;
            }
            Object obj11 = hashMap2.get("snmt");
            String serialno = dHResponse.getSerialno();
            if (serialno != null && !serialno.equals(obj11)) {
                return true;
            }
            Object obj12 = hashMap2.get(o.a("005lTec]hi)ed"));
            String model = DH.SyncMtd.getModel();
            if (model != null && !model.equals(obj12)) {
                return true;
            }
            Object obj13 = hashMap2.get(o.a("0073fhdfdgZdVecdhdi"));
            String manufacturer = DH.SyncMtd.getManufacturer();
            if (manufacturer != null && !manufacturer.equals(obj13)) {
                return true;
            }
            Object obj14 = hashMap2.get(o.a("007PdgdfdhdhdeMi<dh"));
            String carrier = dHResponse.getCarrier();
            if (carrier != null && !carrier.equals(obj14)) {
                return true;
            }
            Object obj15 = hashMap2.get("ismtarr");
            String[] queryIMSI = dHResponse.queryIMSI();
            if (queryIMSI != null && queryIMSI.length > 0) {
                if (obj15 == null) {
                    return true;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj15;
                    if (arrayList.size() != queryIMSI.length) {
                        return true;
                    }
                    boolean z12 = false;
                    for (String str2 : queryIMSI) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str2.equals((String) it.next())) {
                                    z12 = false;
                                    break;
                                }
                            } else {
                                z12 = true;
                                break;
                            }
                        }
                    }
                    if (z12) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            Object obj16 = hashMap2.get(o.a("006(fgdifg?jiHdh"));
            String oSVersionName = DH.SyncMtd.getOSVersionName();
            if (oSVersionName != null && !oSVersionName.equals(obj16)) {
                return true;
            }
            Object obj17 = hashMap2.get(o.a("002<dlMe"));
            boolean cx = dHResponse.cx();
            if (obj17 != null && String.valueOf(cx ? 1 : 0).equals(String.valueOf(obj17))) {
                Object obj18 = hashMap2.get(o.a("007)fcdhVi_dfdj<ih"));
                boolean isRooted = dHResponse.isRooted();
                return (obj18 == null && isRooted) || !(obj18 == null || String.valueOf(obj18).equals(String.valueOf(isRooted)));
            }
        }
        return true;
    }

    private static byte[] a(String str, HashMap<String, Object> hashMap) {
        String fromHashMap = HashonHelper.fromHashMap(hashMap);
        try {
            return Data.AES128Encode(str, fromHashMap);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return fromHashMap.getBytes();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static HashMap<String, Object> b(File file) {
        FileChannel fileChannel;
        FileInputStream fileInputStream;
        if (file.exists()) {
            FileChannel fileChannel2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileChannel = null;
            }
            try {
                fileChannel2 = fileInputStream.getChannel();
                ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel2.size());
                while (fileChannel2.read(allocate) > 0) {
                }
                HashMap<String, Object> a10 = a(DH.SyncMtd.getModel(), allocate.array());
                C0744r.a(fileChannel2, fileInputStream);
                return a10;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = fileChannel2;
                fileChannel2 = fileInputStream;
                try {
                    MobLog.getInstance().d(th);
                    C0744r.a(fileChannel, fileChannel2);
                    return new HashMap<>();
                } catch (Throwable th4) {
                    C0744r.a(fileChannel, fileChannel2);
                    throw th4;
                }
            }
        }
        return new HashMap<>();
    }

    public static void b(File file, HashMap<String, Object> hashMap) {
        FileOutputStream fileOutputStream;
        try {
            byte[] a10 = a(DH.SyncMtd.getModel(), hashMap);
            ResHelper.deleteFileAndFolder(file);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            FileChannel fileChannel = null;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                fileChannel = fileOutputStream.getChannel();
                fileChannel.write(ByteBuffer.wrap(a10));
                fileChannel.force(true);
                C0744r.a(fileChannel, fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                C0744r.a(fileChannel, fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            MobLog.getInstance().d(th4);
        }
    }

    private String c() {
        return o.a("016Ufg7h%djeldgec>llZecdkdfMeHelfg@h1dj");
    }

    public File d() {
        return ResHelper.getDataCacheFile(MobSDK.getContext(), j.f8426b, true);
    }

    public HashMap<String, Object> e() {
        try {
            return a(d());
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public boolean f() {
        w a10 = w.a();
        String str = w.f8532a;
        long b10 = a10.b(str, -1L);
        if (b10 != -1) {
            return System.currentTimeMillis() >= (((Long) com.mob.commons.b.a(o.a("005h@deffdfFe"), 2592000L)).longValue() * 1000) + b10;
        }
        w.a().a(str, System.currentTimeMillis());
        return false;
    }

    public synchronized String a() {
        String str;
        str = null;
        try {
            C0104a e10 = w.a().e();
            if (e10 == null || TextUtils.isEmpty(e10.c())) {
                HashMap<String, Object> e11 = e();
                if (e11 != null) {
                    str = (String) e11.get(o.a("004h.dcde-h"));
                }
            } else {
                str = e10.c();
            }
        } finally {
            return str;
        }
        return str;
    }

    public void a(final MobProduct mobProduct, final com.mob.tools.utils.b<Void> bVar) {
        MobLog.getInstance().d("di init", new Object[0]);
        DH.requester(MobSDK.getContext()).getAdvertisingID().getSimSerialNumber().getIMEI().getIMSI().getSerialno().getCarrier().getMemoryInfo().getSizeInfo().queryIMSI().queryIMEI().cx().isRooted().getDeviceType().checkPad().getScreenSize().getDetailNetworkTypeForStatic().getODH().getOD().getAppLastUpdateTime().getMIUIVersion().request(new DH.DHResponder() { // from class: com.mob.commons.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                boolean z10;
                boolean z11;
                try {
                    synchronized (a.this.f8205b) {
                        String a10 = a.this.a(e.f8388a, dHResponse);
                        HashMap e10 = a.this.e();
                        boolean z12 = false;
                        boolean z13 = true;
                        if (a10 != null) {
                            z11 = !TextUtils.equals(a10, (String) e10.get(o.a("004h5dcde!h")));
                            e10.put(o.a("004hZdcde9h"), a10);
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = false;
                        }
                        boolean a11 = a.this.a(e10, z11, dHResponse);
                        boolean f10 = a.this.f();
                        MobLog.getInstance().d("map: " + e10 + "\nisCh: " + a11 + "\nisG: " + f10, new Object[0]);
                        a.this.f8204a = (a11 || f10) ? true : true;
                        if (a.this.f8204a) {
                            a.this.a(e10, dHResponse);
                            z10 = true;
                        }
                        if (!a.this.a(e10, mobProduct, dHResponse)) {
                            z13 = z10;
                        }
                        if (a.this.f8204a) {
                            a.this.a(e10, (String) e10.get(o.a("004hAdcde5h")), dHResponse);
                        }
                        if (z13) {
                            a.this.a(e10);
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        });
    }

    public synchronized String b() {
        String str;
        Throwable th2;
        try {
            str = a();
        } catch (Throwable th3) {
            str = null;
            th2 = th3;
        }
        try {
        } catch (Throwable th4) {
            th2 = th4;
            MobLog.getInstance().d(th2);
            return str;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            C0104a a10 = new b().a();
            if (a10 != null) {
                String c10 = a10.c();
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(o.a("004h$dcde h"), c10);
                a(hashMap);
                str = c10;
            }
            return str;
        }
        return str;
    }
}
