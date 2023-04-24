package i1;

import android.text.SpannableStringBuilder;
import i1.f;
import i1.g;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public static final String f16197d;

    /* renamed from: e */
    public static final String f16198e;

    /* renamed from: f */
    public static final a f16199f;

    /* renamed from: g */
    public static final a f16200g;

    /* renamed from: a */
    public final boolean f16201a;

    /* renamed from: b */
    public final int f16202b;

    /* renamed from: c */
    public final e f16203c;

    /* renamed from: i1.a$a */
    /* loaded from: classes.dex */
    public static class C0287a {

        /* renamed from: e */
        public static final byte[] f16204e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f16205a;

        /* renamed from: b */
        public final int f16206b;

        /* renamed from: c */
        public int f16207c;

        /* renamed from: d */
        public char f16208d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f16204e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0287a(CharSequence charSequence) {
            this.f16205a = charSequence;
            this.f16206b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.f16205a.charAt(this.f16207c - 1);
            this.f16208d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f16205a, this.f16207c);
                this.f16207c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f16207c--;
            char c10 = this.f16208d;
            return c10 < 1792 ? f16204e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        f.d dVar = f.f16215c;
        f16197d = Character.toString((char) 8206);
        f16198e = Character.toString((char) 8207);
        f16199f = new a(false, 2, dVar);
        f16200g = new a(true, 2, dVar);
    }

    public a(boolean z10, int i10, f.d dVar) {
        this.f16201a = z10;
        this.f16202b = i10;
        this.f16203c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0070, code lost:
        if (r3 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0073, code lost:
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0079, code lost:
        if (r0.f16207c <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0086, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0088, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x008a, code lost:
        if (r3 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            i1.a$a r0 = new i1.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f16207c = r9
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.f16207c
            int r7 = r0.f16206b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f16205a
            char r6 = r7.charAt(r6)
            r0.f16208d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f16205a
            int r7 = r0.f16207c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f16207c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f16207c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f16207c
            int r6 = r6 + r2
            r0.f16207c = r6
            char r6 = r0.f16208d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = i1.a.C0287a.f16204e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r9 = r4
            goto L91
        L77:
            int r4 = r0.f16207c
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r9 = 1
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r9 = -1
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        C0287a c0287a = new C0287a(charSequence);
        c0287a.f16207c = c0287a.f16206b;
        int i10 = 0;
        int i11 = 0;
        while (c0287a.f16207c > 0) {
            byte a10 = c0287a.a();
            if (a10 != 0) {
                if (a10 == 1 || a10 == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                        i11 = i10;
                    }
                } else if (a10 != 9) {
                    switch (a10) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                                break;
                            } else {
                                i11 = i10;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i10 == 0) {
                return -1;
            } else {
                if (i11 == 0) {
                    i11 = i10;
                }
            }
        }
        return 0;
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = g.f16220a;
        boolean z10 = true;
        if (g.a.a(locale) != 1) {
            z10 = false;
        }
        if (z10) {
            return f16200g;
        }
        return f16199f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, e eVar) {
        boolean z10;
        f.d dVar;
        char c10;
        f.d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((f.c) eVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f16202b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = "";
        if (z10) {
            if (b10) {
                dVar2 = f.f16214b;
            } else {
                dVar2 = f.f16213a;
            }
            boolean b11 = dVar2.b(charSequence, charSequence.length());
            if (!this.f16201a && (b11 || a(charSequence) == 1)) {
                str = f16197d;
            } else if (!this.f16201a || (b11 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = f16198e;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b10 != this.f16201a) {
            if (b10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b10) {
            dVar = f.f16214b;
        } else {
            dVar = f.f16213a;
        }
        boolean b12 = dVar.b(charSequence, charSequence.length());
        if (!this.f16201a && (b12 || b(charSequence) == 1)) {
            str2 = f16197d;
        } else if (this.f16201a && (!b12 || b(charSequence) == -1)) {
            str2 = f16198e;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
