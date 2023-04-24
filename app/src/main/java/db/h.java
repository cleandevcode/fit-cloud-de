package db;

import pm.g0;

/* loaded from: classes.dex */
public final class h extends g0 {
    @Override // pm.g0
    public final int f(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else if (c10 < 'a' || c10 > 'z') {
                if (c10 < ' ') {
                    sb2.append((char) 0);
                } else {
                    char c12 = '!';
                    if (c10 < '!' || c10 > '/') {
                        if (c10 >= ':' && c10 <= '@') {
                            sb2.append((char) 1);
                            i10 = (c10 - ':') + 15;
                        } else if (c10 < '[' || c10 > '_') {
                            c12 = '`';
                            if (c10 == '`') {
                                sb2.append((char) 2);
                            } else if (c10 >= 'A' && c10 <= 'Z') {
                                sb2.append((char) 2);
                                i10 = (c10 - 'A') + 1;
                            } else if (c10 < '{' || c10 > 127) {
                                sb2.append("\u0001\u001e");
                                return f((char) (c10 - 128), sb2) + 2;
                            } else {
                                sb2.append((char) 2);
                                i10 = (c10 - '{') + 27;
                            }
                        } else {
                            sb2.append((char) 1);
                            i10 = (c10 - '[') + 22;
                        }
                        c10 = (char) i10;
                    } else {
                        sb2.append((char) 1);
                    }
                    i10 = c10 - c12;
                    c10 = (char) i10;
                }
                sb2.append(c10);
                return 2;
            } else {
                i11 = (c10 - 'a') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    @Override // pm.g0
    public final int i() {
        return 2;
    }
}
