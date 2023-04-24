package x3;

import gm.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import org.json.JSONStringer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final ByteOrder f30193a = ByteOrder.LITTLE_ENDIAN;

    public static void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(ByteBuffer.allocate(2).order(f30193a).putShort((short) i10).array(), 0, bArr, i11, 2);
    }

    public static byte[] b(byte b10) {
        byte[] bArr = {3, 1, 0, 85};
        bArr[3] = b10;
        String a10 = a.a(bArr);
        j.e("DataUtils", "encodeStr ==> " + a10);
        return c("FND", a10);
    }

    public static byte[] c(String str, String str2) {
        try {
            String jSONStringer = new JSONStringer().object().key("sid").value(str).key("data").value(str2).key("ver").value(1L).endObject().toString();
            j.e("DataUtils", "target to bt data json ==> " + jSONStringer);
            return jSONStringer.getBytes(StandardCharsets.UTF_8);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
