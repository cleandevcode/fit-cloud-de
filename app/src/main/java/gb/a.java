package gb;

/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int b(String str) {
        if (str != null) {
            if (str.equals("L")) {
                return 1;
            }
            if (str.equals("M")) {
                return 2;
            }
            if (str.equals("Q")) {
                return 3;
            }
            if (str.equals("H")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
