package m2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class y implements r2.e, r2.d {

    /* renamed from: i */
    public static final TreeMap<Integer, y> f20318i = new TreeMap<>();

    /* renamed from: a */
    public final int f20319a;

    /* renamed from: b */
    public volatile String f20320b;

    /* renamed from: c */
    public final long[] f20321c;

    /* renamed from: d */
    public final double[] f20322d;

    /* renamed from: e */
    public final String[] f20323e;

    /* renamed from: f */
    public final byte[][] f20324f;

    /* renamed from: g */
    public final int[] f20325g;

    /* renamed from: h */
    public int f20326h;

    public y(int i10) {
        this.f20319a = i10;
        int i11 = i10 + 1;
        this.f20325g = new int[i11];
        this.f20321c = new long[i11];
        this.f20322d = new double[i11];
        this.f20323e = new String[i11];
        this.f20324f = new byte[i11];
    }

    public static final y h(int i10, String str) {
        TreeMap<Integer, y> treeMap = f20318i;
        synchronized (treeMap) {
            Map.Entry<Integer, y> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                y value = ceilingEntry.getValue();
                value.f20320b = str;
                value.f20326h = i10;
                return value;
            }
            tl.l lVar = tl.l.f28297a;
            y yVar = new y(i10);
            yVar.f20320b = str;
            yVar.f20326h = i10;
            return yVar;
        }
    }

    @Override // r2.d
    public final void H(int i10, long j10) {
        this.f20325g[i10] = 2;
        this.f20321c[i10] = j10;
    }

    @Override // r2.d
    public final void Q(int i10, byte[] bArr) {
        gm.l.f(bArr, "value");
        this.f20325g[i10] = 5;
        this.f20324f[i10] = bArr;
    }

    @Override // r2.e
    public final void a(r2.d dVar) {
        int i10 = this.f20326h;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f20325g[i11];
            if (i12 == 1) {
                dVar.m0(i11);
            } else if (i12 == 2) {
                dVar.H(i11, this.f20321c[i11]);
            } else if (i12 == 3) {
                dVar.j0(this.f20322d[i11], i11);
            } else if (i12 == 4) {
                dVar.p(i11, this.f20323e[i11]);
            } else if (i12 == 5) {
                dVar.Q(i11, this.f20324f[i11]);
            }
            if (i11 == i10) {
                return;
            }
            i11++;
        }
    }

    @Override // r2.e
    public final String b() {
        String str = this.f20320b;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void j() {
        TreeMap<Integer, y> treeMap = f20318i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f20319a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                gm.l.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            tl.l lVar = tl.l.f28297a;
        }
    }

    @Override // r2.d
    public final void j0(double d10, int i10) {
        this.f20325g[i10] = 3;
        this.f20322d[i10] = d10;
    }

    @Override // r2.d
    public final void m0(int i10) {
        this.f20325g[i10] = 1;
    }

    @Override // r2.d
    public final void p(int i10, String str) {
        gm.l.f(str, "value");
        this.f20325g[i10] = 4;
        this.f20323e[i10] = str;
    }
}
