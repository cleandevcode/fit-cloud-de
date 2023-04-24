package j1;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a */
    public int f17259a;

    /* renamed from: b */
    public Object f17260b;

    public e(int i10, int i11) {
        if (i11 == 1) {
            this.f17260b = new byte[i10];
        } else if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else {
            this.f17260b = new Object[i10];
        }
    }

    public final void a(int i10) {
        Object obj = this.f17260b;
        int length = ((byte[]) obj).length * 2;
        int i11 = this.f17259a;
        int i12 = i10 + i11;
        if (length <= i12) {
            length = i12;
        }
        byte[] bArr = new byte[length];
        System.arraycopy((byte[]) obj, 0, bArr, 0, i11);
        this.f17260b = bArr;
    }

    @Override // j1.d
    public Object acquire() {
        int i10 = this.f17259a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object obj = this.f17260b;
            Object obj2 = ((Object[]) obj)[i11];
            ((Object[]) obj)[i11] = null;
            this.f17259a = i10 - 1;
            return obj2;
        }
        return null;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f17259a;
        if (i12 + 2 > ((byte[]) this.f17260b).length) {
            a(2);
        }
        byte[] bArr = (byte[]) this.f17260b;
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        bArr[i13] = (byte) i11;
        this.f17259a = i13 + 1;
    }

    public final void c(int i10, int i11) {
        int i12 = this.f17259a;
        if (i12 + 3 > ((byte[]) this.f17260b).length) {
            a(3);
        }
        byte[] bArr = (byte[]) this.f17260b;
        int i13 = i12 + 1;
        bArr[i12] = (byte) i10;
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i14] = (byte) i11;
        this.f17259a = i14 + 1;
    }

    public final void d(int i10) {
        int i11 = this.f17259a;
        int i12 = i11 + 1;
        if (i12 > ((byte[]) this.f17260b).length) {
            a(1);
        }
        ((byte[]) this.f17260b)[i11] = (byte) i10;
        this.f17259a = i12;
    }

    public final void e(byte[] bArr, int i10) {
        if (this.f17259a + i10 > ((byte[]) this.f17260b).length) {
            a(i10);
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, (byte[]) this.f17260b, this.f17259a, i10);
        }
        this.f17259a += i10;
    }

    public final void f(int i10) {
        int i11 = this.f17259a;
        if (i11 + 4 > ((byte[]) this.f17260b).length) {
            a(4);
        }
        byte[] bArr = (byte[]) this.f17260b;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >>> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i10 >>> 8);
        bArr[i14] = (byte) i10;
        this.f17259a = i14 + 1;
    }

    public final void g(int i10) {
        int i11 = this.f17259a;
        if (i11 + 2 > ((byte[]) this.f17260b).length) {
            a(2);
        }
        byte[] bArr = (byte[]) this.f17260b;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i12] = (byte) i10;
        this.f17259a = i12 + 1;
    }

    @Override // j1.d
    public boolean release(Object obj) {
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f17259a;
            if (i11 < i10) {
                if (((Object[]) this.f17260b)[i11] == obj) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            Object obj2 = this.f17260b;
            if (i10 >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i10] = obj;
            this.f17259a = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
