package m6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import gm.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import um.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final x f20386a = new x("CONDITION_FALSE");

    /* renamed from: b */
    public static final x f20387b = new x("LIST_EMPTY");

    public static final String a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            l.e(signatureArr, "signatures");
            int length = signatureArr.length;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatureArr[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            l.e(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
