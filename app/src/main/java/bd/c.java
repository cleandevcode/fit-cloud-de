package bd;

import yb.y;

/* loaded from: classes.dex */
public final class c extends y {

    /* renamed from: c */
    public int f4150c;

    public c(int i10) {
        this.f4150c = i10;
    }

    @Override // yb.y
    public final ed.b j() {
        int i10 = this.f4150c;
        if (i10 == 1) {
            byte[] bArr = {(byte) 24, (byte) 0};
            System.arraycopy(new byte[]{7}, 0, bArr, 2, 1);
            return new ed.b(2, (short) 24, (short) 25, bArr);
        } else if (i10 == 2) {
            return new ed.b(2, (short) 527, (short) 517, new byte[]{(byte) 15, (byte) 2});
        } else {
            if (i10 == 3) {
                return new ed.b(2, (short) 3118, (short) 3118, new byte[]{(byte) 46, (byte) 12});
            }
            return new ed.b(2, (short) 3118, (short) 3118, new byte[]{(byte) 46, (byte) 12});
        }
    }

    public final String toString() {
        return String.format("GetAptVolumeInfoReq(volumeSpecVersion=0x%04X) {", Integer.valueOf(this.f4150c)) + "\n}";
    }
}
