package eb;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: h */
    public static final int[][] f13533h = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String E(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }
}
