package j8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import androidx.appcompat.widget.u0;
import java.util.ArrayList;
import s.p1;
import w1.h;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j8.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + n10);
        return readBundle;
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + n10);
        return createFromParcel;
    }

    public static String c(Parcel parcel, int i10) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + n10);
        return readString;
    }

    public static <T> T[] d(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + n10);
        return tArr;
    }

    public static <T> ArrayList<T> e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + n10);
        return createTypedArrayList;
    }

    public static void f(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a(u0.a("Overread allowed size end=", i10), parcel);
    }

    public static boolean g(Parcel parcel, int i10) {
        r(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte h(Parcel parcel, int i10) {
        r(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static float i(Parcel parcel, int i10) {
        r(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float j(Parcel parcel, int i10) {
        int n10 = n(parcel, i10);
        if (n10 == 0) {
            return null;
        }
        q(parcel, n10);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder k(Parcel parcel, int i10) {
        int n10 = n(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (n10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + n10);
        return readStrongBinder;
    }

    public static int l(Parcel parcel, int i10) {
        r(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long m(Parcel parcel, int i10) {
        r(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int n(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void o(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + n(parcel, i10));
    }

    public static int p(Parcel parcel) {
        int readInt = parcel.readInt();
        int n10 = n(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i10 = n10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a(p1.a("Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void q(Parcel parcel, int i10) {
        if (i10 == 4) {
            return;
        }
        throw new a(e.b(h.a("Expected size ", 4, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void r(Parcel parcel, int i10, int i11) {
        int n10 = n(parcel, i10);
        if (n10 == i11) {
            return;
        }
        throw new a(e.b(h.a("Expected size ", i11, " got ", n10, " (0x"), Integer.toHexString(n10), ")"), parcel);
    }
}
