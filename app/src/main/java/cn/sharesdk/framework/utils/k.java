package cn.sharesdk.framework.utils;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public abstract class k implements Escaper {

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<char[]> {
        private a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public char[] initialValue() {
            return new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        }
    }

    private static final char[] a(char[] cArr, int i10, int i11) {
        char[] cArr2 = new char[i11];
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        }
        return cArr2;
    }

    public static final int b(CharSequence charSequence, int i10, int i11) {
        if (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            int i12 = i10 + 1;
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected low surrogate character '");
                sb2.append(charAt);
                sb2.append("' with value ");
                sb2.append((int) charAt);
                sb2.append(" at index ");
                sb2.append(i12 - 1);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i12 == i11) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i12);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i12);
            }
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    public int a(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            int b10 = b(charSequence, i10, i11);
            if (b10 < 0 || a(b10) != null) {
                break;
            }
            i10 += Character.isSupplementaryCodePoint(b10) ? 2 : 1;
        }
        return i10;
    }

    public final String a(String str, int i10) {
        int length = str.length();
        char[] cArr = new a().get();
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int b10 = b(str, i10, length);
            if (b10 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] a10 = a(b10);
            if (a10 != null) {
                int i13 = i10 - i11;
                int i14 = i12 + i13;
                int length2 = a10.length + i14;
                if (cArr.length < length2) {
                    cArr = a(cArr, i12, (length - i10) + length2 + 32);
                }
                if (i13 > 0) {
                    str.getChars(i11, i10, cArr, i12);
                    i12 = i14;
                }
                if (a10.length > 0) {
                    System.arraycopy(a10, 0, cArr, i12, a10.length);
                    i12 += a10.length;
                }
            }
            i11 = (Character.isSupplementaryCodePoint(b10) ? 2 : 1) + i10;
            i10 = a(str, i11, length);
        }
        int i15 = length - i11;
        if (i15 > 0) {
            int i16 = i15 + i12;
            if (cArr.length < i16) {
                cArr = a(cArr, i12, i16);
            }
            str.getChars(i11, length, cArr, i12);
            i12 = i16;
        }
        return new String(cArr, 0, i12);
    }

    public abstract char[] a(int i10);

    @Override // cn.sharesdk.framework.utils.Escaper
    public Appendable escape(final Appendable appendable) {
        e.a(appendable);
        return new Appendable() { // from class: cn.sharesdk.framework.utils.k.1

            /* renamed from: a */
            public int f5319a = -1;

            /* renamed from: b */
            public char[] f5320b = new char[2];

            private void a(char[] cArr, int i10) {
                for (int i11 = 0; i11 < i10; i11++) {
                    appendable.append(cArr[i11]);
                }
            }

            @Override // java.lang.Appendable
            public Appendable append(char c10) {
                if (this.f5319a != -1) {
                    if (!Character.isLowSurrogate(c10)) {
                        throw new IllegalArgumentException("Expected low surrogate character but got '" + c10 + "' with value " + ((int) c10));
                    }
                    char[] a10 = k.this.a(Character.toCodePoint((char) this.f5319a, c10));
                    if (a10 != null) {
                        a(a10, a10.length);
                    } else {
                        appendable.append((char) this.f5319a);
                        appendable.append(c10);
                    }
                    this.f5319a = -1;
                } else if (Character.isHighSurrogate(c10)) {
                    this.f5319a = c10;
                } else if (Character.isLowSurrogate(c10)) {
                    throw new IllegalArgumentException("Unexpected low surrogate character '" + c10 + "' with value " + ((int) c10));
                } else {
                    char[] a11 = k.this.a(c10);
                    if (a11 != null) {
                        a(a11, a11.length);
                    } else {
                        appendable.append(c10);
                    }
                }
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence) {
                return append(charSequence, 0, charSequence.length());
            }

            @Override // java.lang.Appendable
            public Appendable append(CharSequence charSequence, int i10, int i11) {
                int i12;
                if (i10 < i11) {
                    if (this.f5319a != -1) {
                        char charAt = charSequence.charAt(i10);
                        int i13 = i10 + 1;
                        if (!Character.isLowSurrogate(charAt)) {
                            throw new IllegalArgumentException("Expected low surrogate character but got " + charAt);
                        }
                        char[] a10 = k.this.a(Character.toCodePoint((char) this.f5319a, charAt));
                        if (a10 != null) {
                            a(a10, a10.length);
                            i10 = i13;
                        } else {
                            appendable.append((char) this.f5319a);
                        }
                        this.f5319a = -1;
                        i12 = i10;
                        i10 = i13;
                    } else {
                        i12 = i10;
                    }
                    while (true) {
                        int a11 = k.this.a(charSequence, i10, i11);
                        if (a11 > i12) {
                            appendable.append(charSequence, i12, a11);
                        }
                        if (a11 == i11) {
                            break;
                        }
                        int b10 = k.b(charSequence, a11, i11);
                        if (b10 < 0) {
                            this.f5319a = -b10;
                            break;
                        }
                        char[] a12 = k.this.a(b10);
                        if (a12 != null) {
                            a(a12, a12.length);
                        } else {
                            a(this.f5320b, Character.toChars(b10, this.f5320b, 0));
                        }
                        i12 = (Character.isSupplementaryCodePoint(b10) ? 2 : 1) + a11;
                        i10 = i12;
                    }
                }
                return this;
            }
        };
    }

    @Override // cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        int a10 = a(str, 0, length);
        return a10 == length ? str : a(str, a10);
    }
}
