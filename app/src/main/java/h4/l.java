package h4;

import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final /* synthetic */ int f15866a;

    /* renamed from: b */
    public int f15867b;

    /* renamed from: c */
    public Serializable f15868c;

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String[], java.io.Serializable] */
    public l(int i10, int i11) {
        this.f15866a = i11;
        if (i11 == 1) {
            this.f15867b = i10;
            this.f15868c = i10 != 0 ? i10 != 1 ? i10 != 16 ? i10 != 17 ? i10 != 32 ? i10 != 33 ? i10 != 48 ? i10 != 49 ? i10 != 64 ? "Unknown" : "retrans exceed max times" : "CMD_NOT_SUPPORTED" : "Parameter invalid" : "Connect device failed" : "Device disconnected" : "operation failed" : "Service not initialized" : "Error" : "Success";
            return;
        }
        this.f15867b = i10 - 1;
        this.f15868c = new String[i10];
        b(0, "$ref", 4, 1185263);
        String str = e4.a.f13341c;
        b(0, str, str.length(), e4.a.f13341c.hashCode());
    }

    public final String a(int i10, int i11, int i12, char[] cArr) {
        int i13 = this.f15867b & i12;
        String str = ((String[]) this.f15868c)[i13];
        if (str == null) {
            String intern = new String(cArr, i10, i11).intern();
            ((String[]) this.f15868c)[i13] = intern;
            return intern;
        }
        boolean z10 = false;
        if (i12 == str.hashCode() && i11 == str.length()) {
            int i14 = 0;
            while (true) {
                if (i14 >= i11) {
                    z10 = true;
                    break;
                } else if (cArr[i10 + i14] != str.charAt(i14)) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        return z10 ? str : new String(cArr, i10, i11);
    }

    public final String b(int i10, String str, int i11, int i12) {
        int i13 = this.f15867b & i12;
        String str2 = ((String[]) this.f15868c)[i13];
        if (str2 != null) {
            if (i12 != str2.hashCode() || i11 != str2.length() || !str.startsWith(str2, i10)) {
                char[] cArr = new char[i11];
                str.getChars(i10, i11 + i10, cArr, 0);
                return new String(cArr);
            }
            return str2;
        }
        if (i11 != str.length()) {
            char[] cArr2 = new char[i11];
            str.getChars(i10, i11 + i10, cArr2, 0);
            str = new String(cArr2);
        }
        String intern = str.intern();
        ((String[]) this.f15868c)[i13] = intern;
        return intern;
    }

    public final String toString() {
        switch (this.f15866a) {
            case 1:
                return String.format(Locale.US, "%d--%s", Integer.valueOf(this.f15867b), (String) this.f15868c);
            default:
                return super.toString();
        }
    }

    public l(String str) {
        this.f15866a = 1;
        this.f15867b = 1;
        this.f15868c = str;
    }
}
