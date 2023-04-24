package cn.sharesdk.sina.weibo.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.StateSet;
import cn.sharesdk.framework.ShareSDKCallback;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;

/* loaded from: classes.dex */
public class a {
    public static ColorStateList a(int i10, int i11) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[]{16842908}, StateSet.WILD_CARD}, new int[]{i11, i11, i11, i10});
    }

    public static void a(Context context, String str, final ShareSDKCallback<String> shareSDKCallback) {
        DH.requester(context).getPInfoForce(true, str, 64).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.sdk.a.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                for (int i10 = 0; i10 < dHResponse.getPInfoForce(new int[0]).signatures.length; i10++) {
                    try {
                        byte[] byteArray = dHResponse.getPInfoForce(new int[0]).signatures[i10].toByteArray();
                        if (byteArray != null) {
                            String MD5 = Data.MD5(byteArray);
                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                            if (shareSDKCallback2 != null) {
                                shareSDKCallback2.onCallback(MD5);
                            }
                        } else {
                            ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                            if (shareSDKCallback3 != null) {
                                shareSDKCallback3.onCallback(null);
                            }
                        }
                    } catch (Throwable unused) {
                        ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                        if (shareSDKCallback4 != null) {
                            shareSDKCallback4.onCallback(null);
                            return;
                        }
                        return;
                    }
                }
            }
        });
    }

    public static byte[] a(byte[] bArr) {
        boolean z10;
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = (bArr[i10] & 255) << 8;
            int i13 = i10 + 1;
            boolean z11 = true;
            if (i13 < bArr.length) {
                i12 |= bArr[i13] & 255;
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = i12 << 8;
            int i15 = i10 + 2;
            if (i15 < bArr.length) {
                i14 |= bArr[i15] & 255;
            } else {
                z11 = false;
            }
            int i16 = 64;
            bArr2[i11 + 3] = (byte) charArray[z11 ? i14 & 63 : 64];
            int i17 = i14 >> 6;
            int i18 = i11 + 2;
            if (z10) {
                i16 = i17 & 63;
            }
            bArr2[i18] = (byte) charArray[i16];
            int i19 = i17 >> 6;
            bArr2[i11 + 1] = (byte) charArray[i19 & 63];
            bArr2[i11 + 0] = (byte) charArray[(i19 >> 6) & 63];
            i10 += 3;
            i11 += 4;
        }
        return bArr2;
    }
}
