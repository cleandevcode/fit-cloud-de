package kl;

/* loaded from: classes2.dex */
public final class f<T> {

    /* renamed from: a */
    public int f18625a;

    /* renamed from: b */
    public int f18626b;

    /* renamed from: c */
    public int f18627c;

    /* renamed from: d */
    public T[] f18628d;

    public f() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f18625a = numberOfLeadingZeros - 1;
        this.f18627c = (int) (numberOfLeadingZeros * 0.75f);
        this.f18628d = (T[]) new Object[numberOfLeadingZeros];
    }

    public final void a(Object obj) {
        T t10;
        Object obj2;
        Object[] objArr = this.f18628d;
        int i10 = this.f18625a;
        int hashCode = obj.hashCode() * (-1640531527);
        int i11 = (hashCode ^ (hashCode >>> 16)) & i10;
        Object obj3 = objArr[i11];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj2 = objArr[i11];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return;
        }
        objArr[i11] = obj;
        int i12 = this.f18626b + 1;
        this.f18626b = i12;
        if (i12 < this.f18627c) {
            return;
        }
        T[] tArr = this.f18628d;
        int length = tArr.length;
        int i13 = length << 1;
        int i14 = i13 - 1;
        T[] tArr2 = (T[]) new Object[i13];
        while (true) {
            int i15 = i12 - 1;
            if (i12 == 0) {
                this.f18625a = i14;
                this.f18627c = (int) (i13 * 0.75f);
                this.f18628d = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int hashCode2 = t10.hashCode() * (-1640531527);
            int i16 = (hashCode2 ^ (hashCode2 >>> 16)) & i14;
            if (tArr2[i16] != null) {
                do {
                    i16 = (i16 + 1) & i14;
                } while (tArr2[i16] != null);
            }
            tArr2[i16] = tArr[length];
            i12 = i15;
        }
    }

    public final void b(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f18626b--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i14 = (hashCode ^ (hashCode >>> 16)) & i11;
                if (i10 > i12) {
                    if (i10 >= i14 && i14 > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < i14 && i14 <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }
}
