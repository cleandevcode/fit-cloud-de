package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import z2.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2191a = bVar.j(iconCompat.f2191a, 1);
        byte[] bArr = iconCompat.f2193c;
        if (bVar.h(2)) {
            bArr = bVar.f();
        }
        iconCompat.f2193c = bArr;
        iconCompat.f2194d = bVar.l(iconCompat.f2194d, 3);
        iconCompat.f2195e = bVar.j(iconCompat.f2195e, 4);
        iconCompat.f2196f = bVar.j(iconCompat.f2196f, 5);
        iconCompat.f2197g = (ColorStateList) bVar.l(iconCompat.f2197g, 6);
        String str = iconCompat.f2199i;
        if (bVar.h(7)) {
            str = bVar.m();
        }
        iconCompat.f2199i = str;
        String str2 = iconCompat.f2200j;
        if (bVar.h(8)) {
            str2 = bVar.m();
        }
        iconCompat.f2200j = str2;
        iconCompat.f2198h = PorterDuff.Mode.valueOf(iconCompat.f2199i);
        switch (iconCompat.f2191a) {
            case -1:
                parcelable = iconCompat.f2194d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2192b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f2194d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f2193c;
                    iconCompat.f2192b = bArr2;
                    iconCompat.f2191a = 3;
                    iconCompat.f2195e = 0;
                    iconCompat.f2196f = bArr2.length;
                    break;
                }
                iconCompat.f2192b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2193c, Charset.forName("UTF-16"));
                iconCompat.f2192b = str3;
                if (iconCompat.f2191a == 2 && iconCompat.f2200j == null) {
                    iconCompat.f2200j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f2192b = iconCompat.f2193c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f2199i = iconCompat.f2198h.name();
        switch (iconCompat.f2191a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f2194d = (Parcelable) iconCompat.f2192b;
                break;
            case 2:
                iconCompat.f2193c = ((String) iconCompat.f2192b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2193c = (byte[]) iconCompat.f2192b;
                break;
            case 4:
            case 6:
                iconCompat.f2193c = iconCompat.f2192b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f2191a;
        if (-1 != i10) {
            bVar.t(i10, 1);
        }
        byte[] bArr = iconCompat.f2193c;
        if (bArr != null) {
            bVar.o(2);
            bVar.q(bArr);
        }
        Parcelable parcelable = iconCompat.f2194d;
        if (parcelable != null) {
            bVar.o(3);
            bVar.u(parcelable);
        }
        int i11 = iconCompat.f2195e;
        if (i11 != 0) {
            bVar.t(i11, 4);
        }
        int i12 = iconCompat.f2196f;
        if (i12 != 0) {
            bVar.t(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2197g;
        if (colorStateList != null) {
            bVar.o(6);
            bVar.u(colorStateList);
        }
        String str = iconCompat.f2199i;
        if (str != null) {
            bVar.o(7);
            bVar.v(str);
        }
        String str2 = iconCompat.f2200j;
        if (str2 != null) {
            bVar.o(8);
            bVar.v(str2);
        }
    }
}
