package e7;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import gm.l;
import java.io.File;

/* loaded from: classes.dex */
public final class a {
    public static Intent a(Context context, File file) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri b10 = FileProvider.b(context, file);
        l.e(b10, "getUriForFile(context, authority, file)");
        intent.setClipData(ClipData.newRawUri("", b10));
        intent.addFlags(3);
        intent.putExtra("output", b10);
        return intent;
    }

    public static Intent b(Context context, Uri uri, File file, int i10, int i11, int i12, int i13) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", i10);
        intent.putExtra("aspectY", i11);
        intent.putExtra("outputX", i12);
        intent.putExtra("outputY", i13);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", false);
        intent.setDataAndType(uri, "image/*");
        Uri b10 = FileProvider.b(context, file);
        l.e(b10, "getUriForFile(context, authority, dst)");
        intent.setClipData(ClipData.newRawUri("", b10));
        intent.addFlags(3);
        intent.putExtra("output", b10);
        return intent;
    }
}
