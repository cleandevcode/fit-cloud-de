package com.mob.commons.cc;

import android.graphics.Bitmap;
import com.mob.tools.utils.BitmapHelper;
import java.io.File;

/* loaded from: classes.dex */
public class b implements s<b> {
    public static Bitmap a(File file, int i10) {
        return BitmapHelper.getBitmap(file, i10);
    }

    public static Bitmap a(String str, int i10, int i11) {
        return BitmapHelper.getBitmapByCompressSize(str, i10, i11);
    }

    public static Bitmap a(String str, int i10, int i11, int i12, long j10) {
        return BitmapHelper.getBitmapByCompressQuality(str, i10, i11, i12, j10);
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        return BitmapHelper.fixRect(iArr, iArr2);
    }

    @Override // com.mob.commons.cc.s
    public boolean a(b bVar, Class<b> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("getBitmapByCompressSize".equals(str) && objArr.length == 3) {
            try {
                objArr2[0] = a((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            } catch (Throwable th2) {
                objArr2[0] = null;
                thArr[0] = th2;
            }
            return true;
        } else if ("getBitmapByCompressQuality".equals(str) && objArr.length == 5) {
            try {
                objArr2[0] = a((String) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue(), ((Long) objArr[4]).longValue());
            } catch (Throwable th3) {
                objArr2[0] = null;
                thArr[0] = th3;
            }
            return true;
        } else if ("getBitmap".equals(str) && objArr.length == 2) {
            try {
                objArr2[0] = a((File) objArr[0], ((Integer) objArr[1]).intValue());
            } catch (Throwable th4) {
                objArr2[0] = null;
                thArr[0] = th4;
            }
            return true;
        } else if ("fixRect".equals(str) && objArr.length == 2) {
            try {
                objArr2[0] = a((int[]) objArr[0], (int[]) objArr[1]);
            } catch (Throwable th5) {
                objArr2[0] = null;
                thArr[0] = th5;
            }
            return true;
        } else {
            return false;
        }
    }
}
