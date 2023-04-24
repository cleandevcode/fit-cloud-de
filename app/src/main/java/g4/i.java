package g4;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e */
    public static final i f14989e = new i(0, 1443168256, 1, null);

    /* renamed from: f */
    public static final i f14990f = new i(1, 1509950721, 1, null);

    /* renamed from: g */
    public static final i f14991g = new i(2, 1124075009, 1, null);

    /* renamed from: h */
    public static final i f14992h = new i(3, 1107297537, 1, null);

    /* renamed from: i */
    public static final i f14993i = new i(4, 1392510721, 1, null);

    /* renamed from: j */
    public static final i f14994j = new i(5, 1224736769, 1, null);

    /* renamed from: k */
    public static final i f14995k = new i(6, 1174536705, 1, null);

    /* renamed from: l */
    public static final i f14996l = new i(7, 1241579778, 1, null);

    /* renamed from: m */
    public static final i f14997m = new i(8, 1141048066, 1, null);

    /* renamed from: a */
    public final int f14998a;

    /* renamed from: b */
    public final char[] f14999b;

    /* renamed from: c */
    public final int f15000c;

    /* renamed from: d */
    public final int f15001d;

    public i(int i10, int i11, int i12, char[] cArr) {
        this.f14998a = i10;
        this.f14999b = cArr;
        this.f15000c = i11;
        this.f15001d = i12;
    }

    public static i b(String str) {
        return c(str.toCharArray(), 0);
    }

    public static i c(char[] cArr, int i10) {
        char c10;
        char c11 = cArr[i10];
        if (c11 != 'F') {
            if (c11 != 'S') {
                if (c11 != 'V') {
                    if (c11 != 'I') {
                        if (c11 != 'J') {
                            if (c11 != 'Z') {
                                if (c11 != '[') {
                                    switch (c11) {
                                        case 'B':
                                            return f14992h;
                                        case 'C':
                                            return f14991g;
                                        case 'D':
                                            return f14997m;
                                        default:
                                            int i11 = 1;
                                            while (cArr[i10 + i11] != ';') {
                                                i11++;
                                            }
                                            return new i(10, i10 + 1, i11 - 1, cArr);
                                    }
                                }
                                int i12 = 1;
                                while (true) {
                                    c10 = cArr[i10 + i12];
                                    if (c10 != '[') {
                                        break;
                                    }
                                    i12++;
                                }
                                if (c10 == 'L') {
                                    do {
                                        i12++;
                                    } while (cArr[i10 + i12] != ';');
                                    return new i(9, i10, i12 + 1, cArr);
                                }
                                return new i(9, i10, i12 + 1, cArr);
                            }
                            return f14990f;
                        }
                        return f14996l;
                    }
                    return f14994j;
                }
                return f14989e;
            }
            return f14993i;
        }
        return f14995k;
    }

    public final String a() {
        switch (this.f14998a) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                char[] cArr = this.f14999b;
                int i10 = this.f15000c;
                int i11 = 1;
                int i12 = 1;
                while (this.f14999b[this.f15000c + i12] == '[') {
                    i12++;
                }
                StringBuilder sb2 = new StringBuilder(c(cArr, i12 + i10).a());
                while (this.f14999b[this.f15000c + i11] == '[') {
                    i11++;
                }
                while (i11 > 0) {
                    sb2.append("[]");
                    i11--;
                }
                return sb2.toString();
            default:
                return new String(this.f14999b, this.f15000c, this.f15001d).replace('/', '.');
        }
    }
}
