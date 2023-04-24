package u4;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: d */
    public static final Bitmap.Config[] f28503d;

    /* renamed from: e */
    public static final Bitmap.Config[] f28504e;

    /* renamed from: f */
    public static final Bitmap.Config[] f28505f;

    /* renamed from: g */
    public static final Bitmap.Config[] f28506g;

    /* renamed from: h */
    public static final Bitmap.Config[] f28507h;

    /* renamed from: a */
    public final c f28508a = new c();

    /* renamed from: b */
    public final g<b, Bitmap> f28509b = new g<>();

    /* renamed from: c */
    public final HashMap f28510c = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28511a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f28511a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28511a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28511a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28511a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements l {

        /* renamed from: a */
        public final c f28512a;

        /* renamed from: b */
        public int f28513b;

        /* renamed from: c */
        public Bitmap.Config f28514c;

        public b(c cVar) {
            this.f28512a = cVar;
        }

        @Override // u4.l
        public final void a() {
            this.f28512a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f28513b == bVar.f28513b && m5.l.b(this.f28514c, bVar.f28514c);
            }
            return false;
        }

        public final int hashCode() {
            int i10 = this.f28513b * 31;
            Bitmap.Config config = this.f28514c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return m.c(this.f28513b, this.f28514c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends u4.c {
        @Override // u4.c
        public final l a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f28503d = configArr;
        f28504e = configArr;
        f28505f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f28506g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f28507h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d10 = m5.l.d(config) * i10 * i11;
        b bVar = (b) this.f28508a.b();
        bVar.f28513b = d10;
        bVar.f28514c = config;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f28504e;
        } else {
            int i13 = a.f28511a[config.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        configArr = i13 != 4 ? new Bitmap.Config[]{config} : f28507h;
                    } else {
                        configArr = f28506g;
                    }
                } else {
                    configArr = f28505f;
                }
            } else {
                configArr = f28503d;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i12];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d10));
            if (ceilingKey != null && ceilingKey.intValue() <= d10 * 8) {
                if (ceilingKey.intValue() != d10 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.f28508a.c(bVar);
                    c cVar = this.f28508a;
                    int intValue = ceilingKey.intValue();
                    bVar = (b) cVar.b();
                    bVar.f28513b = intValue;
                    bVar.f28514c = config2;
                }
            } else {
                i12++;
            }
        }
        Bitmap a10 = this.f28509b.a(bVar);
        if (a10 != null) {
            a(Integer.valueOf(bVar.f28513b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f28510c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f28510c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(m5.l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = m5.l.c(bitmap);
        c cVar = this.f28508a;
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) cVar.b();
        bVar.f28513b = c10;
        bVar.f28514c = config;
        this.f28509b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f28513b));
        Integer valueOf = Integer.valueOf(bVar.f28513b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SizeConfigStrategy{groupedMap=");
        a10.append(this.f28509b);
        a10.append(", sortedSizes=(");
        for (Map.Entry entry : this.f28510c.entrySet()) {
            a10.append(entry.getKey());
            a10.append('[');
            a10.append(entry.getValue());
            a10.append("], ");
        }
        if (!this.f28510c.isEmpty()) {
            a10.replace(a10.length() - 2, a10.length(), "");
        }
        a10.append(")}");
        return a10.toString();
    }
}
