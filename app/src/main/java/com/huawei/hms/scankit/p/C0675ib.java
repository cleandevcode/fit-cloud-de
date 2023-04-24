package com.huawei.hms.scankit.p;

import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.ml.scan.HmsScan;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.huawei.hms.scankit.p.ib */
/* loaded from: classes.dex */
public final class C0675ib extends AbstractC0699ob {

    /* renamed from: h */
    private volatile String f7928h;

    /* renamed from: i */
    private volatile String f7929i;

    /* renamed from: j */
    private boolean f7930j;

    /* renamed from: k */
    private volatile long f7931k;

    /* renamed from: l */
    private b f7932l;

    /* renamed from: com.huawei.hms.scankit.p.ib$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f7933a;

        /* renamed from: b */
        private String f7934b;

        /* renamed from: c */
        private String f7935c;

        /* renamed from: d */
        private long f7936d;

        /* renamed from: e */
        private long f7937e;

        /* renamed from: f */
        private String f7938f;

        /* renamed from: g */
        private String f7939g;

        /* renamed from: h */
        private boolean f7940h;

        /* renamed from: i */
        private int f7941i;

        /* renamed from: j */
        private boolean f7942j;

        private a(long j10, String str, String str2, boolean z10, int i10, int i11) {
            this.f7936d = j10;
            this.f7934b = str;
            this.f7935c = str2;
            this.f7940h = z10;
            this.f7941i = i10;
            this.f7933a = i11;
        }

        public /* synthetic */ a(long j10, String str, String str2, boolean z10, int i10, int i11, C0667gb c0667gb) {
            this(j10, str, str2, z10, i10, i11);
        }

        public a a(long j10) {
            this.f7937e = j10;
            return this;
        }

        public a a(String str) {
            this.f7938f = str;
            return this;
        }

        public a a(boolean z10) {
            this.f7942j = z10;
            return this;
        }

        public a b(String str) {
            this.f7939g = str;
            return this;
        }

        public a a(int i10) {
            this.f7933a = i10;
            return this;
        }
    }

    /* renamed from: com.huawei.hms.scankit.p.ib$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        private String f7943a;

        /* renamed from: b */
        private Timer f7944b;

        /* renamed from: c */
        private volatile boolean f7945c;

        /* renamed from: d */
        private List<a> f7946d;

        /* renamed from: e */
        private List<a> f7947e;

        /* renamed from: com.huawei.hms.scankit.p.ib$b$a */
        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private StringBuilder f7949a;

            /* renamed from: b */
            private AtomicInteger[] f7950b;

            /* renamed from: c */
            private String[] f7951c;

            /* renamed from: d */
            private long[] f7952d;

            private a() {
                b.this = r11;
                this.f7949a = new StringBuilder(100);
                this.f7950b = new AtomicInteger[]{new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger()};
                this.f7951c = new String[]{"lt10K:", "lt100K:", "lt1M:", "lt3M:", "lt10M:", "lt40M:", "gt40M:"};
                this.f7952d = new long[]{10240, 102400, 1048576, 3145728, 10485760, 41943040, Long.MAX_VALUE};
            }

            public /* synthetic */ a(b bVar, C0667gb c0667gb) {
                this();
            }

            public String a() {
                StringBuilder sb2 = this.f7949a;
                sb2.delete(0, sb2.length());
                this.f7949a.append("{");
                for (int i10 = 0; i10 < this.f7950b.length; i10++) {
                    this.f7949a.append(this.f7951c[i10]);
                    this.f7949a.append(this.f7950b[i10]);
                    this.f7949a.append(",");
                }
                StringBuilder sb3 = this.f7949a;
                sb3.replace(sb3.length() - 1, this.f7949a.length(), "}");
                return this.f7949a.toString();
            }

            public void a(int i10) {
                int i11 = 0;
                while (true) {
                    AtomicInteger[] atomicIntegerArr = this.f7950b;
                    if (i11 >= atomicIntegerArr.length) {
                        return;
                    }
                    if (i10 <= this.f7952d[i11]) {
                        atomicIntegerArr[i11].addAndGet(1);
                        return;
                    }
                    i11++;
                }
            }
        }

        /* renamed from: com.huawei.hms.scankit.p.ib$b$b */
        /* loaded from: classes.dex */
        public class C0103b {

            /* renamed from: a */
            private StringBuilder f7954a;

            /* renamed from: b */
            private SparseArray<AtomicInteger> f7955b;

            private C0103b() {
                b.this = r2;
                this.f7954a = new StringBuilder(60);
                this.f7955b = new C0683kb(this);
            }

            public /* synthetic */ C0103b(b bVar, C0667gb c0667gb) {
                this();
            }

            public String a() {
                StringBuilder sb2 = this.f7954a;
                sb2.delete(0, sb2.length());
                this.f7954a.append("{");
                for (int i10 = 0; i10 < this.f7955b.size(); i10++) {
                    this.f7954a.append(this.f7955b.keyAt(i10));
                    this.f7954a.append(":");
                    this.f7954a.append(this.f7955b.valueAt(i10));
                    this.f7954a.append(",");
                }
                StringBuilder sb3 = this.f7954a;
                sb3.replace(sb3.length() - 1, this.f7954a.length(), "}");
                return this.f7954a.toString();
            }

            public void a(int i10) {
                if (this.f7955b.get(i10) == null) {
                    this.f7955b.put(i10, new C0687lb(this));
                } else {
                    this.f7955b.get(i10).addAndGet(1);
                }
            }
        }

        private b() {
            C0675ib.this = r2;
            this.f7943a = b.class.getSimpleName();
            this.f7944b = new Timer();
            this.f7945c = true;
            this.f7946d = new ArrayList(10);
            this.f7947e = new ArrayList(10);
        }

        public /* synthetic */ b(C0675ib c0675ib, C0667gb c0667gb) {
            this();
        }

        public void a() {
            if (this.f7946d.size() > 0) {
                synchronized (this) {
                    List<a> list = this.f7946d;
                    List<a> list2 = this.f7947e;
                    this.f7946d = list2;
                    this.f7947e = list;
                    list2.clear();
                }
                a(this.f7947e);
            }
        }

        public void a(a aVar) {
            if (this.f7946d.size() > 100) {
                return;
            }
            synchronized (this) {
                this.f7946d.add(aVar);
                if (this.f7945c) {
                    this.f7945c = false;
                    this.f7944b.schedule(new C0679jb(this), 1000L);
                }
            }
        }

        private void a(List<a> list) {
            HashSet hashSet = new HashSet();
            for (a aVar : list) {
                hashSet.add(aVar.f7935c);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Boolean bool = null;
                C0103b c0103b = new C0103b(this, null);
                a aVar2 = new a(this, null);
                long j10 = Long.MAX_VALUE;
                long j11 = Long.MIN_VALUE;
                String str2 = "";
                String str3 = "";
                String str4 = str3;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                for (a aVar3 : list) {
                    str2 = aVar3.f7934b;
                    str3 = aVar3.f7938f;
                    str4 = aVar3.f7939g;
                    Boolean valueOf = Boolean.valueOf(aVar3.f7940h);
                    j13 = (aVar3.f7937e - aVar3.f7936d) + j13;
                    c0103b.a(aVar3.f7933a);
                    aVar2.a(aVar3.f7941i);
                    j12++;
                    if (aVar3.f7942j) {
                        j15++;
                    }
                    if (aVar3.f7933a != 0) {
                        j14++;
                    }
                    if (aVar3.f7937e - aVar3.f7936d < j10) {
                        j10 = aVar3.f7937e - aVar3.f7936d;
                    }
                    if (aVar3.f7937e - aVar3.f7936d > j11) {
                        j11 = aVar3.f7937e - aVar3.f7936d;
                    }
                    bool = valueOf;
                }
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.putAll(C0675ib.this.f8024f);
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_RESULT, c0103b.a());
                linkedHashMap.put("imgSizeHistogram", aVar2.a());
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_CALLTIME, str2);
                linkedHashMap.put("transId", str);
                if (j12 != 0) {
                    j13 /= j12;
                }
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(j13));
                linkedHashMap.put("allCnt", String.valueOf(j12));
                linkedHashMap.put("failCnt", String.valueOf(j14));
                linkedHashMap.put("codeCnt", String.valueOf(j15));
                linkedHashMap.put("scanType", str3);
                linkedHashMap.put("sceneType", str4);
                linkedHashMap.put("min", String.valueOf(j10));
                linkedHashMap.put("max", String.valueOf(j11));
                linkedHashMap.put("algPhotoMode", String.valueOf(bool));
                C0710rb.a().a("60001", linkedHashMap);
            }
        }
    }

    public C0675ib(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext());
        this.f7930j = false;
        this.f7932l = new b(this, null);
        this.f8024f.put(WiseOpenHianalyticsData.UNION_API_NAME, str);
        if (DetailRect.PHOTO_MODE.equals(str)) {
            this.f7930j = true;
        }
    }

    public a a(boolean z10, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (this.f7930j) {
                    new a(currentTimeMillis, new C0667gb(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(currentTimeMillis)), UUID.randomUUID().toString(), z10, i10, 0, null);
                    return new a(currentTimeMillis, this.f7928h, this.f7929i, z10, i10, 0, null);
                }
                if (currentTimeMillis - this.f7931k > 1500) {
                    String format = new C0671hb(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(currentTimeMillis));
                    String uuid = UUID.randomUUID().toString();
                    if (currentTimeMillis - this.f7931k > 1500) {
                        this.f7928h = format;
                        this.f7929i = uuid;
                        this.f7931k = currentTimeMillis;
                    }
                }
                new a(currentTimeMillis, this.f7928h, this.f7929i, z10, i10, 0, null);
                return new a(currentTimeMillis, this.f7928h, this.f7929i, z10, i10, 0, null);
            } catch (Exception unused) {
                com.huawei.hms.scankit.util.a.b("HaLog6001", "exception happens");
                return new a(currentTimeMillis, this.f7928h, this.f7929i, z10, i10, 0, null);
            }
        } catch (Throwable unused2) {
            return new a(currentTimeMillis, this.f7928h, this.f7929i, z10, i10, 0, null);
        }
    }

    public void a(String str) {
        this.f8024f.put("algapi", str);
    }

    public void a(HmsScan[] hmsScanArr, a aVar) {
        String str;
        try {
            String str2 = AbstractC0699ob.f8019a;
            String str3 = AbstractC0699ob.f8020b;
            if (a()) {
                boolean z10 = false;
                int i10 = 0;
                z10 = false;
                if (hmsScanArr != null && hmsScanArr.length > 0) {
                    int length = hmsScanArr.length;
                    while (i10 < length) {
                        HmsScan hmsScan = hmsScanArr[i10];
                        String a10 = AbstractC0699ob.a(hmsScan.scanType);
                        i10++;
                        str3 = AbstractC0699ob.b(hmsScan.scanTypeForm);
                        str2 = a10;
                    }
                    z10 = true;
                }
                this.f7932l.a(aVar.a(System.currentTimeMillis()).a(z10).a(str2).b(str3));
                this.f7931k = aVar.f7937e;
            }
        } catch (NullPointerException unused) {
            str = "nullPoint";
            com.huawei.hms.scankit.util.a.b("HaLog60001", str);
        } catch (Exception unused2) {
            str = "logEnd Exception";
            com.huawei.hms.scankit.util.a.b("HaLog60001", str);
        }
    }
}
