package tc;

import android.os.ParcelUuid;
import androidx.appcompat.widget.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public static final UUID f28004a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    public static byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static rc.v b(byte[] r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.m0.b(byte[]):rc.v");
    }

    public static void c(byte[] bArr, int i10, int i11, int i12, ArrayList arrayList) {
        while (i11 > 0) {
            arrayList.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
    }

    public static void d(byte[] bArr, int i10, int i11, int i12, ArrayList arrayList) {
        while (i11 > 0) {
            arrayList.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
    }

    public static ParcelUuid e(byte[] bArr) {
        long j10;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException(u0.a("uuidBytes length invalid - ", length));
        }
        if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        }
        if (length == 2) {
            j10 = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
        } else {
            j10 = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
        }
        UUID uuid = f28004a;
        return new ParcelUuid(new UUID(uuid.getMostSignificantBits() + (j10 << 32), uuid.getLeastSignificantBits()));
    }
}
