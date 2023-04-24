package com.mob.commons.cc;

import android.text.TextUtils;
import com.mob.commons.C0744r;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.Data;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class q implements s<q> {
    private byte[] a(byte[] bArr, int i10) {
        if (bArr.length <= i10 - 1) {
            byte[] bArr2 = new byte[i10];
            bArr2[0] = 1;
            int length = bArr.length;
            bArr2[1] = (byte) (length >> 24);
            bArr2[2] = (byte) (length >> 16);
            bArr2[3] = (byte) (length >> 8);
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, i10 - length, length);
            return bArr2;
        }
        throw new Throwable("Message too large");
    }

    private byte[] a(byte[] bArr, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, int i12) {
        if (bArr.length != i11 || i10 != 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i12));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public String a(InputStream inputStream) {
        byte[] bArr = null;
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            MessageDigest messageDigest = MessageDigest.getInstance(com.mob.commons.j.a("003Segdgfc"));
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr2, 0, read);
            }
            bArr = messageDigest.digest();
        } catch (Throwable unused) {
        }
        return b(bArr);
    }

    public String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, bArr.length);
            String a10 = a(byteArrayInputStream);
            byteArrayInputStream.close();
            return a10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2, String str) {
        ArrayList<HashMap<String, String>> arrayList3 = new ArrayList<>();
        Iterator<HashMap<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            HashMap<String, String> next = it.next();
            String str2 = next.get(str);
            if (!TextUtils.isEmpty(str2)) {
                boolean z10 = false;
                Iterator<HashMap<String, String>> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (str2.equals(it2.next().get(str))) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    arrayList3.add(next);
                }
            }
        }
        return arrayList3;
    }

    @Override // com.mob.commons.cc.s
    public boolean a(q qVar, Class<q> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
        if ("bm5".equals(str) && objArr.length == 1) {
            objArr2[0] = qVar.a((byte[]) objArr[0]);
            return true;
        } else if ("sm5".equals(str)) {
            objArr2[0] = qVar.a((InputStream) objArr[0]);
            return true;
        } else if ("thx".equals(str)) {
            objArr2[0] = qVar.b((byte[]) objArr[0]);
            return true;
        } else if ("fnil".equals(str) && objArr.length == 3) {
            objArr2[0] = qVar.a((ArrayList) objArr[0], (ArrayList) objArr[1], (String) objArr[2]);
            return true;
        } else if ("aesen".equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = a((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th2) {
                objArr2[0] = null;
                thArr[0] = th2;
            }
            return true;
        } else if (com.mob.commons.j.a("005_bd4g*deIfg").equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = b((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th3) {
                objArr2[0] = null;
                thArr[0] = th3;
            }
            return true;
        } else if (com.mob.commons.j.a("006TbdRg5de_f^db+c").equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = c((String) objArr[0], (String) objArr[1], (byte[]) objArr[2], (byte[]) objArr[3]);
            } catch (Throwable th4) {
                objArr2[0] = null;
                thArr[0] = th4;
            }
            return true;
        } else if ("enc".equals(str) && objArr.length == 4) {
            try {
                objArr2[0] = a(((Integer) objArr[0]).intValue(), (byte[]) objArr[1], (BigInteger) objArr[2], (BigInteger) objArr[3]);
            } catch (Throwable th5) {
                objArr2[0] = null;
                thArr[0] = th5;
            }
            return true;
        } else if (!"d".equals(str)) {
            return false;
        } else {
            if (objArr.length == 1 && (objArr[0] instanceof String)) {
                NLog mobLog = MobLog.getInstance();
                StringBuilder a10 = android.support.v4.media.d.a("[sasa] ");
                a10.append(objArr[0]);
                mobLog.d("%s", a10.toString());
            } else if (objArr.length == 1 && (objArr[0] instanceof Throwable)) {
                MobLog.getInstance().d((Throwable) objArr[0], "%s", "[sasa]");
            }
            return true;
        }
    }

    public byte[] a(int i10, byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        int i11 = i10 / 8;
        int i12 = i11 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i13 = 0;
            while (bArr.length > i13) {
                try {
                    int min = Math.min(bArr.length - i13, i12);
                    byte[] a10 = a(bArr, i13, min, bigInteger, bigInteger2, i11);
                    dataOutputStream2.writeInt(a10.length);
                    dataOutputStream2.write(a10);
                    i13 += min;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    C0744r.a(dataOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C0744r.a(dataOutputStream2);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public byte[] a(String str, String str2, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, com.mob.commons.j.a("003Tchebcf"));
        Cipher cipher = Data.getCipher(str, str2);
        cipher.init(1, secretKeySpec);
        byte[] bArr4 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr4, cipher.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return stringBuffer.toString();
    }

    public byte[] b(String str, String str2, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, com.mob.commons.j.a("003+chebcf"));
        Cipher cipher = Data.getCipher(str, str2);
        cipher.init(2, secretKeySpec);
        byte[] bArr4 = new byte[cipher.getOutputSize(bArr2.length)];
        cipher.doFinal(bArr4, cipher.update(bArr2, 0, bArr2.length, bArr4, 0));
        return bArr4;
    }

    public byte[] c(String str, String str2, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, Math.min(bArr.length, 16));
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, com.mob.commons.j.a("0032chebcf"));
        Cipher cipher = Data.getCipher(str, str2);
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr2);
    }
}
