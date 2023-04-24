package e4;

/* loaded from: classes.dex */
public enum m {
    CamelCase,
    /* JADX INFO: Fake field, exist only in values array */
    PascalCase,
    /* JADX INFO: Fake field, exist only in values array */
    SnakeCase,
    /* JADX INFO: Fake field, exist only in values array */
    KebabCase,
    /* JADX INFO: Fake field, exist only in values array */
    NoChange,
    NeverUseThisValueExceptDefaultValue;

    public final String a(String str) {
        int ordinal = ordinal();
        int i10 = 0;
        if (ordinal == 0) {
            char charAt = str.charAt(0);
            if (charAt < 'A' || charAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        } else if (ordinal == 1) {
            char charAt2 = str.charAt(0);
            if (charAt2 < 'a' || charAt2 > 'z') {
                return str;
            }
            char[] charArray2 = str.toCharArray();
            charArray2[0] = (char) (charArray2[0] - ' ');
            return new String(charArray2);
        } else if (ordinal == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (i10 < str.length()) {
                char charAt3 = str.charAt(i10);
                if (charAt3 >= 'A' && charAt3 <= 'Z') {
                    charAt3 = (char) (charAt3 + ' ');
                    if (i10 > 0) {
                        sb2.append('_');
                    }
                }
                sb2.append(charAt3);
                i10++;
            }
            return sb2.toString();
        } else if (ordinal != 3) {
            return str;
        } else {
            StringBuilder sb3 = new StringBuilder();
            while (i10 < str.length()) {
                char charAt4 = str.charAt(i10);
                if (charAt4 >= 'A' && charAt4 <= 'Z') {
                    charAt4 = (char) (charAt4 + ' ');
                    if (i10 > 0) {
                        sb3.append('-');
                    }
                }
                sb3.append(charAt4);
                i10++;
            }
            return sb3.toString();
        }
    }
}
