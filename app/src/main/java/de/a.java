package de;

import android.os.ParcelUuid;
import cn.sharesdk.framework.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final ParcelUuid f13016a;

    /* renamed from: b */
    public static final ParcelUuid f13017b;

    /* renamed from: c */
    public static final ParcelUuid[] f13018c;

    static {
        ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
        ParcelUuid fromString = ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
        ParcelUuid fromString2 = ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
        ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
        f13016a = ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
        ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000112e-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
        f13017b = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
        f13018c = new ParcelUuid[]{fromString, fromString2};
    }

    public static UUID a(int i10) {
        return UUID.fromString("0000" + String.format("%04X", Integer.valueOf(i10 & Platform.CUSTOMER_ACTION_MASK)) + "-0000-1000-8000-00805F9B34FB");
    }

    public static boolean b(ParcelUuid parcelUuid) {
        UUID uuid = parcelUuid.getUuid();
        return uuid.getLeastSignificantBits() == f13017b.getUuid().getLeastSignificantBits() && (uuid.getMostSignificantBits() & (-281470681743361L)) == 4096;
    }

    public static boolean c(ParcelUuid parcelUuid) {
        UUID uuid = parcelUuid.getUuid();
        return uuid.getLeastSignificantBits() == f13017b.getUuid().getLeastSignificantBits() && !b(parcelUuid) && (uuid.getMostSignificantBits() & 4294967295L) == 4096;
    }

    public static ParcelUuid d(byte[] bArr) {
        long j10;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j10 = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
            } else {
                j10 = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
            }
            ParcelUuid parcelUuid = f13017b;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j10 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    public static int e(UUID uuid) {
        return (int) ((uuid.getMostSignificantBits() >> 32) & 65535);
    }
}
