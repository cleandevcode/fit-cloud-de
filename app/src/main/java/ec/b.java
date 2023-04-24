package ec;

import android.support.v4.media.d;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final String f13534a;

    /* renamed from: b */
    public final int f13535b;

    /* renamed from: c */
    public int f13536c;

    /* renamed from: d */
    public int f13537d;

    /* renamed from: e */
    public int f13538e;

    /* renamed from: f */
    public int f13539f;

    /* renamed from: g */
    public char[] f13540g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f13534a = name;
        this.f13535b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 < this.f13535b) {
            char[] cArr = this.f13540g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i11 = c10 - '7';
            } else {
                StringBuilder a10 = d.a("Malformed DN: ");
                a10.append(this.f13534a);
                throw new IllegalStateException(a10.toString());
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 >= 'A' && c11 <= 'F') {
                i12 = c11 - '7';
            } else {
                StringBuilder a11 = d.a("Malformed DN: ");
                a11.append(this.f13534a);
                throw new IllegalStateException(a11.toString());
            }
            return (i11 << 4) + i12;
        }
        StringBuilder a12 = d.a("Malformed DN: ");
        a12.append(this.f13534a);
        throw new IllegalStateException(a12.toString());
    }

    public final char b() {
        int i10;
        int i11 = this.f13536c + 1;
        this.f13536c = i11;
        if (i11 != this.f13535b) {
            char c10 = this.f13540g[i11];
            if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
                switch (c10) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c10) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a10 = a(i11);
                                this.f13536c++;
                                if (a10 >= 128) {
                                    if (a10 < 192 || a10 > 247) {
                                        return '?';
                                    }
                                    if (a10 <= 223) {
                                        a10 &= 31;
                                        i10 = 1;
                                    } else if (a10 <= 239) {
                                        i10 = 2;
                                        a10 &= 15;
                                    } else {
                                        i10 = 3;
                                        a10 &= 7;
                                    }
                                    for (int i12 = 0; i12 < i10; i12++) {
                                        int i13 = this.f13536c + 1;
                                        this.f13536c = i13;
                                        if (i13 == this.f13535b || this.f13540g[i13] != '\\') {
                                            return '?';
                                        }
                                        int i14 = i13 + 1;
                                        this.f13536c = i14;
                                        int a11 = a(i14);
                                        this.f13536c++;
                                        if ((a11 & 192) != 128) {
                                            return '?';
                                        }
                                        a10 = (a10 << 6) + (a11 & 63);
                                    }
                                }
                                return (char) a10;
                        }
                }
            }
            return c10;
        }
        StringBuilder a12 = d.a("Unexpected end of DN: ");
        a12.append(this.f13534a);
        throw new IllegalStateException(a12.toString());
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        char c11;
        char c12;
        int i13;
        int i14;
        char c13;
        char c14;
        while (true) {
            i10 = this.f13536c;
            i11 = this.f13535b;
            if (i10 >= i11 || this.f13540g[i10] != ' ') {
                break;
            }
            this.f13536c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f13537d = i10;
        do {
            this.f13536c = i10 + 1;
            i10 = this.f13536c;
            i12 = this.f13535b;
            if (i10 >= i12 || (c14 = this.f13540g[i10]) == '=') {
                break;
            }
        } while (c14 != ' ');
        if (i10 < i12) {
            this.f13538e = i10;
            if (this.f13540g[i10] == ' ') {
                while (true) {
                    i13 = this.f13536c;
                    i14 = this.f13535b;
                    if (i13 >= i14 || (c13 = this.f13540g[i13]) == '=' || c13 != ' ') {
                        break;
                    }
                    this.f13536c = i13 + 1;
                }
                if (this.f13540g[i13] != '=' || i13 == i14) {
                    StringBuilder a10 = d.a("Unexpected end of DN: ");
                    a10.append(this.f13534a);
                    throw new IllegalStateException(a10.toString());
                }
            }
            int i15 = this.f13536c;
            do {
                this.f13536c = i15 + 1;
                i15 = this.f13536c;
                if (i15 >= this.f13535b) {
                    break;
                }
            } while (this.f13540g[i15] == ' ');
            int i16 = this.f13538e;
            int i17 = this.f13537d;
            if (i16 - i17 > 4) {
                char[] cArr = this.f13540g;
                if (cArr[i17 + 3] == '.' && (((c10 = cArr[i17]) == 'O' || c10 == 'o') && (((c11 = cArr[i17 + 1]) == 'I' || c11 == 'i') && ((c12 = cArr[i17 + 2]) == 'D' || c12 == 'd')))) {
                    this.f13537d = i17 + 4;
                }
            }
            char[] cArr2 = this.f13540g;
            int i18 = this.f13537d;
            return new String(cArr2, i18, i16 - i18);
        }
        StringBuilder a11 = d.a("Unexpected end of DN: ");
        a11.append(this.f13534a);
        throw new IllegalStateException(a11.toString());
    }
}
