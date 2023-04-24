package qa;

import java.lang.reflect.Field;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b implements qa.c {

    /* renamed from: a */
    public static final a f24647a;

    /* renamed from: b */
    public static final /* synthetic */ b[] f24648b;

    /* loaded from: classes.dex */
    public enum a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // qa.c
        public final String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        f24647a = aVar;
        f24648b = new b[]{aVar, new b() { // from class: qa.b.b
            @Override // qa.c
            public final String a(Field field) {
                return b.d(field.getName());
            }
        }, new b() { // from class: qa.b.c
            @Override // qa.c
            public final String a(Field field) {
                return b.d(b.c(field.getName(), ' '));
            }
        }, new b() { // from class: qa.b.d
            @Override // qa.c
            public final String a(Field field) {
                return b.c(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new b() { // from class: qa.b.e
            @Override // qa.c
            public final String a(Field field) {
                return b.c(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: qa.b.f
            @Override // qa.c
            public final String a(Field field) {
                return b.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new b() { // from class: qa.b.g
            @Override // qa.c
            public final String a(Field field) {
                return b.c(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public b() {
        throw null;
    }

    public b(String str, int i10) {
        super(str, i10);
    }

    public static String c(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String d(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f24648b.clone();
    }
}
