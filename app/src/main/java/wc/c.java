package wc;

import android.os.Bundle;
import ed.g;
import h4.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c extends kd.c<b> {

    /* renamed from: j */
    public static volatile c f29781j;

    @Override // kd.c
    public final void b(ed.a aVar) {
        int i10;
        short s10 = aVar.f13543a;
        byte b10 = aVar.f13544b;
        if (s10 != 1664) {
            if (s10 != 1669) {
                if (s10 != 1677) {
                    if (s10 != 1666) {
                        if (s10 != 1667) {
                            if (s10 != 1671) {
                                if (s10 != 1672) {
                                    return;
                                }
                                if (b10 == 2 || b10 == 1) {
                                    ge.b.p("CMD_TRANS_EXIT not supported");
                                }
                                i10 = 6;
                            } else {
                                if (b10 == 2 || b10 == 1) {
                                    ge.b.p("CMD_TRANS_CANCEL not supported");
                                }
                                i10 = 5;
                            }
                        } else {
                            if (b10 == 2 || b10 == 1) {
                                ge.b.p("CMD_TRANS_CONTINUE not supported");
                            }
                            i10 = 3;
                        }
                    } else {
                        if (b10 == 2 || b10 == 1) {
                            ge.b.p("CMD_TRANS_START not supported");
                        }
                        a(b10, 2);
                        return;
                    }
                } else {
                    if (b10 == 2 || b10 == 1) {
                        ge.b.p("CMD_GET_SDCARD_SPACE_INFO not supported");
                    }
                    i10 = 7;
                }
            } else {
                if (b10 == 2 || b10 == 1) {
                    ge.b.p("CMD_VALID_SONG not supported");
                }
                i10 = 4;
            }
            a(b10, i10);
            return;
        }
        if (b10 == 2 || b10 == 1) {
            ge.b.p("CMD_QUERY_INFO not supported");
        }
        a(b10, 1);
    }

    @Override // kd.c
    public final void d(g gVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        short s10 = gVar.f13581d;
        byte[] bArr = gVar.f13582e;
        int i11 = 0;
        switch (s10) {
            case 1664:
                if (bArr != null && bArr.length >= 32) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    byte b10 = wrap.get(5);
                    int i12 = b10 & 1;
                    int i13 = (b10 & 2) >> 1;
                    wrap.get(6);
                    Bundle bundle = new Bundle();
                    bundle.putInt("com.realsil.android.extra.SEND_PACKET_SIZE", wrap.getShort(0) & 65535);
                    bundle.putInt("com.realsil.android.extra.BUFFER_CHECK_SIZE", wrap.getShort(2) & 65535);
                    bundle.putInt("com.realsil.android.extra.PROTOCOL_VERSION", wrap.get(4) & 255);
                    bundle.putInt("com.realsil.android.extra.RWS_STATUS", i12);
                    bundle.putInt("com.realsil.android.extra.BUD_ROLE", i13);
                    bundle.putInt("com.realsil.android.extra.SUPPORT_FORMATS", wrap.get(7) & 255);
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator it = this.f18448b.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).f(bundle);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1665:
                if (bArr != null && bArr.length > 0) {
                    byte b11 = bArr[0];
                    if (b11 == 0) {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        int i14 = wrap2.getShort(1) & 65535;
                        long j10 = wrap2.getInt(3) & 4294967295L;
                        boolean z14 = kd.c.f18444g;
                        ge.b.q("current file crc: " + i14 + ", total length: " + j10, z14);
                        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f18448b;
                        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                            Iterator it2 = this.f18448b.iterator();
                            while (it2.hasNext()) {
                                ((b) it2.next()).i(i14, j10);
                            }
                            return;
                        }
                        return;
                    } else if (b11 == 1 || b11 == 2) {
                        ByteBuffer wrap3 = ByteBuffer.wrap(bArr);
                        wrap3.order(ByteOrder.LITTLE_ENDIAN);
                        int i15 = wrap3.getShort(1) & 65535;
                        boolean z15 = kd.c.f18444g;
                        ge.b.q("current file length: " + i15, z15);
                        byte[] bArr2 = new byte[i15];
                        System.arraycopy(bArr, 3, bArr2, 0, i15);
                        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f18448b;
                        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                            Iterator it3 = this.f18448b.iterator();
                            while (it3.hasNext()) {
                                b bVar = (b) it3.next();
                                if (b11 == 1) {
                                    bVar.g(bArr2);
                                } else {
                                    bVar.h(bArr2);
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1666:
                if (bArr != null && bArr.length > 0) {
                    int i16 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = this.f18448b;
                    if (copyOnWriteArrayList4 != null && copyOnWriteArrayList4.size() > 0) {
                        Iterator it4 = this.f18448b.iterator();
                        while (it4.hasNext()) {
                            b bVar2 = (b) it4.next();
                            if (i16 == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            bVar2.d(z10);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1667:
                if (bArr != null && bArr.length > 0) {
                    int i17 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = this.f18448b;
                    if (copyOnWriteArrayList5 != null && copyOnWriteArrayList5.size() > 0) {
                        Iterator it5 = this.f18448b.iterator();
                        while (it5.hasNext()) {
                            b bVar3 = (b) it5.next();
                            if (i17 != 241 && i17 != 242) {
                                bVar3.l();
                            } else {
                                bVar3.m(i17);
                            }
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1668:
                if (bArr != null && bArr.length > 0) {
                    int i18 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList6 = this.f18448b;
                    if (copyOnWriteArrayList6 != null && copyOnWriteArrayList6.size() > 0) {
                        Iterator it6 = this.f18448b.iterator();
                        while (it6.hasNext()) {
                            ((b) it6.next()).k(i18);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1669:
            case 1674:
            default:
                return;
            case 1670:
                if (bArr != null && bArr.length > 0) {
                    int i19 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList7 = this.f18448b;
                    if (copyOnWriteArrayList7 != null && copyOnWriteArrayList7.size() > 0) {
                        Iterator it7 = this.f18448b.iterator();
                        while (it7.hasNext()) {
                            b bVar4 = (b) it7.next();
                            if (i19 == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            bVar4.b(z11);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1671:
                if (bArr != null && bArr.length > 0) {
                    int i20 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList8 = this.f18448b;
                    if (copyOnWriteArrayList8 != null && copyOnWriteArrayList8.size() > 0) {
                        Iterator it8 = this.f18448b.iterator();
                        while (it8.hasNext()) {
                            b bVar5 = (b) it8.next();
                            if (i20 == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar5.e(z12);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1672:
                if (bArr != null && bArr.length > 0) {
                    int i21 = bArr[0] & 255;
                    CopyOnWriteArrayList copyOnWriteArrayList9 = this.f18448b;
                    if (copyOnWriteArrayList9 != null && copyOnWriteArrayList9.size() > 0) {
                        Iterator it9 = this.f18448b.iterator();
                        while (it9.hasNext()) {
                            ((b) it9.next()).c(i21);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1673:
                if (bArr != null && bArr.length > 0) {
                    byte b12 = bArr[0];
                    CopyOnWriteArrayList copyOnWriteArrayList10 = this.f18448b;
                    if (copyOnWriteArrayList10 != null && copyOnWriteArrayList10.size() > 0) {
                        Iterator it10 = this.f18448b.iterator();
                        while (it10.hasNext()) {
                            ((b) it10.next()).getClass();
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1675:
                if (bArr != null && bArr.length > 0) {
                    byte b13 = bArr[0];
                    CopyOnWriteArrayList copyOnWriteArrayList11 = this.f18448b;
                    if (copyOnWriteArrayList11 != null && copyOnWriteArrayList11.size() > 0) {
                        Iterator it11 = this.f18448b.iterator();
                        while (it11.hasNext()) {
                            ((b) it11.next()).getClass();
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return parameter error", kd.c.f18443f);
                return;
            case 1676:
                if (bArr != null && bArr.length > 0) {
                    ByteBuffer wrap4 = ByteBuffer.wrap(bArr);
                    wrap4.order(ByteOrder.LITTLE_ENDIAN);
                    if (wrap4.get(0) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        i11 = wrap4.getInt(1);
                        i10 = wrap4.getInt(5);
                    } else {
                        i10 = 0;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList12 = this.f18448b;
                    if (copyOnWriteArrayList12 != null && copyOnWriteArrayList12.size() > 0) {
                        Iterator it12 = this.f18448b.iterator();
                        while (it12.hasNext()) {
                            ((b) it12.next()).j(i11, i10, z13);
                        }
                        return;
                    }
                    ge.b.o("no callback registered", kd.c.f18444g);
                    return;
                }
                ge.b.g("return sdcard space info error", kd.c.f18443f);
                return;
        }
    }

    public final void j(short s10, short s11, int i10, short s12, byte[] bArr) {
        if (s10 < 0) {
            ge.b.g("seq number is invalid", kd.c.f18443f);
            new l(48, 1);
        } else if (s12 <= 0) {
            ge.b.g("data length is invalid", kd.c.f18443f);
            new l(48, 1);
        } else if (bArr.length == 0) {
            ge.b.g("song data length can not be 0", kd.c.f18443f);
            new l(48, 1);
        } else {
            int length = bArr.length + 10;
            byte[] bArr2 = new byte[length];
            ByteBuffer wrap = ByteBuffer.wrap(bArr2);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            wrap.putShort(0, s10);
            wrap.putShort(2, s11);
            wrap.putInt(4, i10);
            wrap.putShort(8, s12);
            System.arraycopy(bArr, 0, bArr2, 10, s12);
            byte[] bArr3 = new byte[length + 2];
            bArr3[0] = (byte) 131;
            bArr3[1] = (byte) 6;
            if (length > 0) {
                System.arraycopy(bArr2, 0, bArr3, 2, length);
            }
            g(new ed.b(1, (short) 1667, (short) 0, bArr3));
        }
    }
}
