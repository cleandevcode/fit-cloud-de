package pd;

import cn.sharesdk.framework.Platform;
import com.realsil.sdk.bbpro.internal.BaseBeeProManager;
import ed.g;
import gm.j;
import h4.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import md.d;
import nd.e;
import oc.r;
import x2.i;

/* loaded from: classes.dex */
public class c extends kd.c<a> {

    /* renamed from: j */
    public nd.b f24013j;

    @Override // kd.c
    public final void b(ed.a aVar) {
        String str;
        short s10 = aVar.f13543a;
        byte b10 = aVar.f13544b;
        if (s10 == 2) {
            if (kd.c.f18444g) {
                ge.b.n(String.format("onCreateConnectionResponse: 0x%02X", Byte.valueOf(b10)));
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                if (kd.c.f18444g) {
                    ge.b.n("no callback registered");
                    return;
                }
                return;
            }
            Iterator it = this.f18448b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).getClass();
            }
        } else if (s10 == 3) {
            if (kd.c.f18444g) {
                ge.b.n(String.format("onDisconnectResponse: 0x%02X", Byte.valueOf(b10)));
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f18448b;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                if (kd.c.f18444g) {
                    ge.b.n("no callback registered");
                    return;
                }
                return;
            }
            Iterator it2 = this.f18448b.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).getClass();
            }
        } else {
            int i10 = 4;
            int i11 = 16;
            if (s10 != 4) {
                int i12 = 23;
                if (s10 != 23) {
                    i12 = 24;
                    if (s10 != 24) {
                        if (s10 == 521) {
                            if (b10 == 2) {
                                str = "CMD_DSP_SET_APT_GAIN not supported";
                                ge.b.n(str);
                            }
                            a(b10, 40);
                            return;
                        }
                        if (s10 != 522) {
                            if (s10 == 526) {
                                if (b10 == 2) {
                                    str = "CMD_APT_SET_VOLUME_OUT_LEVEL not supported";
                                    ge.b.n(str);
                                    a(b10, 40);
                                    return;
                                }
                                if (b10 == 0) {
                                    f(new bd.c(2));
                                }
                                a(b10, 40);
                                return;
                            } else if (s10 == 527) {
                                if (b10 == 2) {
                                    ge.b.n("CMD_APT_GET_VOLUME_OUT_LEVEL not supported");
                                }
                                a(b10, 39);
                                return;
                            } else if (s10 == 3115) {
                                i11 = 36;
                            } else if (s10 == 3116) {
                                if (b10 == 2) {
                                    ge.b.d("CMD_LISTENING_MODE_CYCLE_GET not supported");
                                    i(kd.c.f18445h);
                                }
                                i11 = 37;
                            } else if (s10 == 3585) {
                                if (b10 != 2) {
                                    a(b10, 45);
                                    return;
                                }
                                ge.b.n("CMD_GET_LOW_LATENCY_MODE_STATUS not supported");
                                l().f22269z = false;
                                j(21);
                                return;
                            } else if (s10 == 3586) {
                                if (b10 != 2) {
                                    a(b10, 35);
                                    return;
                                }
                                ge.b.n("CMD_GET_EAR_DETECTION_STATUS not supported");
                                l().D = (byte) 0;
                                j(55);
                                return;
                            } else {
                                i10 = 22;
                                switch (s10) {
                                    case 12:
                                        if (b10 == 2) {
                                            ge.b.d("CMD_INFO_REQ not supported");
                                            nd.b l10 = l();
                                            l10.getClass();
                                            l10.f22232c = 0;
                                            l10.f22234d = 0;
                                            l10.d(null);
                                        }
                                        i11 = 30;
                                        break;
                                    case 18:
                                        i11 = 26;
                                        break;
                                    case 33:
                                        if (b10 == 2) {
                                            ge.b.d("CMD_GET_BUD_INFO not supported");
                                        }
                                        i11 = 54;
                                        break;
                                    case 261:
                                        if (b10 == 2) {
                                            ge.b.d("CMD_GET_LE_ADDR not supported");
                                            l().f22240g = null;
                                            break;
                                        }
                                        break;
                                    case 534:
                                        i11 = 64;
                                        break;
                                    case 776:
                                        if (b10 != 0) {
                                            a(b10, 63);
                                            return;
                                        }
                                        return;
                                    case 783:
                                        if (b10 == 2) {
                                            ge.b.d("CMD_GET_PACKAGE_ID not supported, cmdVersion=0");
                                        }
                                        i11 = 34;
                                        break;
                                    case 789:
                                        if (b10 == 2) {
                                            ge.b.d("CMD_GET_NUM_OF_CONNECTION not supported");
                                        }
                                        a(b10, 55);
                                        return;
                                    case 1536:
                                        if (b10 == 2 || b10 == 1) {
                                            l().f22255n0 = false;
                                            j(14);
                                        } else if (b10 == 0) {
                                            l().f22255n0 = true;
                                        }
                                        i11 = 25;
                                        break;
                                    case 2832:
                                        if (kd.c.f18444g) {
                                            ge.b.n(String.format("onPlayRingtongResponse: 0x%02X", Byte.valueOf(b10)));
                                        }
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f18448b;
                                        if (copyOnWriteArrayList3 == null || copyOnWriteArrayList3.size() <= 0) {
                                            if (kd.c.f18444g) {
                                                ge.b.n("no callback registered");
                                                return;
                                            }
                                            return;
                                        }
                                        Iterator it3 = this.f18448b.iterator();
                                        while (it3.hasNext()) {
                                            ((a) it3.next()).getClass();
                                        }
                                        return;
                                    case 3588:
                                        if (b10 != 2) {
                                            a(b10, 46);
                                            return;
                                        }
                                        ge.b.n("CMD_SET_LOW_LATENCY_LEVEL not supported");
                                        j(22);
                                        return;
                                    default:
                                        switch (s10) {
                                            case 3118:
                                                if (b10 != 0) {
                                                    ge.b.o("CMD_APT_VOLUME_INFO not supported", kd.c.f18444g);
                                                    a(b10, 39);
                                                    return;
                                                }
                                                return;
                                            case 3119:
                                                if (b10 != 0) {
                                                    ge.b.o("CMD_APT_VOLUME_SET not supported", kd.c.f18444g);
                                                    a(b10, 40);
                                                    return;
                                                }
                                                return;
                                            case 3120:
                                                if (b10 != 0) {
                                                    ge.b.e("CMD_APT_VOLUME_STATUS not supported", kd.c.f18444g);
                                                    a(b10, 41);
                                                    return;
                                                }
                                                return;
                                            case 3121:
                                                if (b10 != 0) {
                                                    ge.b.e("CMD_LLAPT_BRIGHTNESS_INFO not supported", kd.c.f18444g);
                                                    a(b10, 44);
                                                    return;
                                                }
                                                return;
                                            case 3122:
                                                if (b10 != 0) {
                                                    ge.b.e("CMD_LLAPT_BRIGHTNESS_SET not supported", kd.c.f18444g);
                                                    a(b10, 42);
                                                    return;
                                                }
                                                return;
                                            case 3123:
                                                if (b10 != 0) {
                                                    ge.b.d("CMD_LLAPT_BRIGHTNESS_STATUS not supported");
                                                    a(b10, 43);
                                                    return;
                                                }
                                                return;
                                            case 3124:
                                                if (b10 != 0) {
                                                    ge.b.e("CMD_APT_SET_NR_ON_OFF not supported", kd.c.f18444g);
                                                    a(b10, 47);
                                                    return;
                                                }
                                                return;
                                            case 3125:
                                                if (b10 != 0) {
                                                    ge.b.e("CMD_APT_GET_NR_ON_OFF not supported", kd.c.f18444g);
                                                    a(b10, 48);
                                                    return;
                                                }
                                                return;
                                            case 3126:
                                                if (b10 != 0) {
                                                    ge.b.d("CMD_LLAPT_SCENARIO_CHOOSE_INFO not supported");
                                                    a(b10, 49);
                                                    return;
                                                }
                                                return;
                                            case 3127:
                                                if (b10 != 0) {
                                                    ge.b.d("CMD_LLAPT_SCENARIO_CHOOSE_TRY not supported");
                                                    a(b10, 50);
                                                    return;
                                                }
                                                return;
                                            case 3128:
                                                if (b10 == 2) {
                                                    ge.b.d("CMD_LLAPT_SCENARIO_CHOOSE_RESULT not supported");
                                                    a(b10, 51);
                                                    return;
                                                }
                                                return;
                                            case 3129:
                                                if (b10 != 0) {
                                                    ge.b.o("CMD_APT_GET_POWER_ON_DELAY_TIME not supported", kd.c.f18444g);
                                                    a(b10, 52);
                                                    return;
                                                }
                                                return;
                                            case 3130:
                                                if (b10 != 0) {
                                                    ge.b.o("CMD_APT_SET_POWER_ON_DELAY_TIME not supported", kd.c.f18444g);
                                                    a(b10, 53);
                                                    return;
                                                }
                                                return;
                                            case 3131:
                                                if (b10 != 0) {
                                                    a(b10, 38);
                                                    return;
                                                }
                                                return;
                                            case 3132:
                                                if (b10 == 2) {
                                                    ge.b.d("CMD_LISTENING_MODE_STATUS not supported");
                                                    i(kd.c.f18445h);
                                                    return;
                                                }
                                                return;
                                            case 3133:
                                                if (b10 != 0) {
                                                    i(kd.c.f18445h);
                                                    a(b10, 66);
                                                    return;
                                                }
                                                return;
                                            case 3134:
                                                if (b10 != 0) {
                                                    a(b10, 67);
                                                    return;
                                                }
                                                return;
                                            default:
                                                switch (s10) {
                                                    case 3140:
                                                        if (b10 != 0) {
                                                            ge.b.e("CMD_ANC_SCENARIO_CHOOSE_INFO not supported", kd.c.f18443f);
                                                            a(b10, 57);
                                                            return;
                                                        }
                                                        return;
                                                    case 3141:
                                                        if (b10 != 0) {
                                                            ge.b.e("CMD_ANC_SCENARIO_CHOOSE_TRY not supported", kd.c.f18443f);
                                                            a(b10, 58);
                                                            return;
                                                        }
                                                        return;
                                                    case 3142:
                                                        if (b10 == 2) {
                                                            ge.b.e("CMD_ANC_SCENARIO_CHOOSE_RESULT not supported", kd.c.f18443f);
                                                            a(b10, 59);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        switch (s10) {
                                                            case 1792:
                                                                if (b10 == 2) {
                                                                    ge.b.n("CMD_GET_SUPPORTED_MMI_LIST not supported");
                                                                    l().f22260q = null;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1793:
                                                                if (b10 == 2) {
                                                                    ge.b.n("CMD_GET_SUPPORTED_CLICK_TYPE not supported");
                                                                    l().f22261r = null;
                                                                }
                                                                i11 = 17;
                                                                break;
                                                            case 1794:
                                                                if (b10 == 2) {
                                                                    ge.b.n("CMD_GET_SUPPORTED_CALL_STATUS not supported");
                                                                    l().f22262s = null;
                                                                }
                                                                i11 = 18;
                                                                break;
                                                            case 1795:
                                                                if (b10 == 2) {
                                                                    ge.b.o("CMD_GET_KEY_MMI_MAP not supported", kd.c.f18444g);
                                                                    l().f22263t = null;
                                                                }
                                                                i11 = 19;
                                                                break;
                                                            case 1796:
                                                                a(b10, 20);
                                                                if (b10 == 0) {
                                                                    byte[] f10 = b0.c.f((short) 1795);
                                                                    BaseBeeProManager baseBeeProManager = this.f18447a;
                                                                    if (baseBeeProManager == null) {
                                                                        new l(16, 1);
                                                                        return;
                                                                    } else {
                                                                        baseBeeProManager.o(f10);
                                                                        return;
                                                                    }
                                                                }
                                                                return;
                                                            default:
                                                                switch (s10) {
                                                                    case 1798:
                                                                        a(b10, 1);
                                                                        return;
                                                                    case 1799:
                                                                        i11 = 56;
                                                                        break;
                                                                    case 1800:
                                                                        if (b10 == 2) {
                                                                            ge.b.o("CMD_GET_RWS_KEY_MMI_MAP not supported", kd.c.f18444g);
                                                                            l().f22264u = null;
                                                                        }
                                                                        i11 = 60;
                                                                        break;
                                                                    case 1801:
                                                                        a(b10, 61);
                                                                        if (b10 == 0) {
                                                                            byte[] f11 = b0.c.f((short) 1800);
                                                                            BaseBeeProManager baseBeeProManager2 = this.f18447a;
                                                                            if (baseBeeProManager2 == null) {
                                                                                new l(16, 1);
                                                                                return;
                                                                            } else {
                                                                                baseBeeProManager2.o(f11);
                                                                                return;
                                                                            }
                                                                        }
                                                                        return;
                                                                    case 1802:
                                                                        i11 = 62;
                                                                        break;
                                                                    default:
                                                                        switch (s10) {
                                                                            case 1808:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_SET_ENABLE not supported");
                                                                                }
                                                                                i11 = 6;
                                                                                break;
                                                                            case 1809:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_SET_DISENABLE not supported");
                                                                                }
                                                                                i11 = 7;
                                                                                break;
                                                                            case 1810:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_TOGGLE not supported");
                                                                                }
                                                                                i11 = 8;
                                                                                break;
                                                                            case 1811:
                                                                                ge.b.n("ACK-CMD_MOTOR_GET_STATUS");
                                                                                if (b10 == 2 || b10 == 1) {
                                                                                    l().E = (byte) 0;
                                                                                    l().F = (byte) 0;
                                                                                } else if (b10 == 0) {
                                                                                    l().E = (byte) 1;
                                                                                }
                                                                                i11 = 10;
                                                                                break;
                                                                            case 1812:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_SET_MODE not supported");
                                                                                }
                                                                                i11 = 13;
                                                                                break;
                                                                            case 1813:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_STOP_VIBRATION not supported");
                                                                                }
                                                                                i11 = 9;
                                                                                break;
                                                                            case 1814:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_CHECK_VIBRATION not supported");
                                                                                }
                                                                                i11 = 11;
                                                                                break;
                                                                            case 1815:
                                                                                if (b10 == 2) {
                                                                                    ge.b.n("CMD_MOTOR_GET_MODE_PARAMETER not supported");
                                                                                }
                                                                                i11 = 12;
                                                                                break;
                                                                            default:
                                                                                switch (s10) {
                                                                                    case 3104:
                                                                                        if (b10 == 2) {
                                                                                            ge.b.e("CMD_ANC_QUERY not supported", kd.c.f18443f);
                                                                                            l().Z = null;
                                                                                            i(kd.c.f18445h);
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 3105:
                                                                                        if (b10 == 2) {
                                                                                            ge.b.e("CMD_ANC_SET_STATE not supported", kd.c.f18443f);
                                                                                            l().Y = (byte) 0;
                                                                                        }
                                                                                        a(b10, 14);
                                                                                        return;
                                                                                    case 3106:
                                                                                        if (b10 == 2) {
                                                                                            ge.b.e("CMD_LLAPT_QUERY not supported", kd.c.f18443f);
                                                                                            l().f22239f0 = (byte) 0;
                                                                                            i(kd.c.f18445h);
                                                                                        }
                                                                                        i11 = 32;
                                                                                        break;
                                                                                    case 3107:
                                                                                        if (b10 == 2) {
                                                                                            ge.b.e("CMD_LLAPT_ENABLE_DISABLE not supported", kd.c.f18443f);
                                                                                            l().f22239f0 = (byte) 0;
                                                                                        }
                                                                                        if (b10 != 0) {
                                                                                            a(b10, 33);
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    case 3108:
                                                                                        if (b10 == 2) {
                                                                                            ge.b.e("CMD_SPECIFY_ANC_QUERY not supported", kd.c.f18443f);
                                                                                            l().f22233c0 = null;
                                                                                            i(kd.c.f18445h);
                                                                                        }
                                                                                        i11 = 65;
                                                                                        break;
                                                                                    default:
                                                                                        return;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                        } else if (b10 == 2) {
                            ge.b.n("CMD_SET_VOLUME not supported");
                        }
                        a(b10, i10);
                        return;
                    }
                    if (b10 == 2 || b10 == 1) {
                        ge.b.d("CMD_GET_STATUS not supported");
                        i(kd.c.f18445h);
                    }
                    i11 = 31;
                } else if (b10 == 2) {
                    ge.b.e("CMD_GET_CFG_SETTINGS not supported", kd.c.f18443f);
                }
                a(b10, i12);
                return;
            }
            if (b10 != 0) {
                ge.b.d("CMD_MMI not supported");
            }
            i11 = 29;
            a(b10, i11);
        }
    }

    @Override // kd.c
    public final void d(g gVar) {
        qd.b bVar;
        boolean z10;
        boolean z11;
        qd.a aVar;
        boolean z12;
        boolean z13;
        int i10;
        byte b10;
        byte b11;
        boolean z14;
        ld.a aVar2;
        bd.a aVar3;
        qb.b bVar2;
        boolean z15;
        boolean z16;
        bd.a aVar4;
        cd.b bVar3;
        bd.b bVar4;
        int i11;
        short s10 = gVar.f13581d;
        byte[] bArr = gVar.f13582e;
        boolean z17 = true;
        if (s10 == 3) {
            if (kd.c.f18444g) {
                ge.b.n(">> EVENT_BT_CONNECT_STATUS");
            }
            if (bArr == null || bArr.length < 7) {
                return;
            }
            byte b12 = bArr[0];
            System.arraycopy(bArr, 1, new byte[6], 0, 6);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                if (kd.c.f18444g) {
                    ge.b.n("no callback registered");
                    return;
                }
                return;
            }
            Iterator it = this.f18448b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).getClass();
            }
        } else if (s10 == 4) {
            if (kd.c.f18444g) {
                ge.b.n(">> EVENT_BT_DISCONNECT_STATUS");
            }
            if (bArr == null || bArr.length < 7) {
                return;
            }
            byte b13 = bArr[0];
            System.arraycopy(bArr, 1, new byte[6], 0, 6);
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f18448b;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                if (kd.c.f18444g) {
                    ge.b.n("no callback registered");
                    return;
                }
                return;
            }
            Iterator it2 = this.f18448b.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).getClass();
            }
        } else if (s10 == 521) {
            if (bArr == null || bArr.length < 6) {
                ge.b.n("invalid packet");
                bVar = null;
            } else {
                int i12 = bArr[0] & 255;
                int i13 = bArr[1] & 255;
                byte b14 = bArr[2];
                int i14 = bArr[3] & 255;
                int i15 = bArr[4] & 255;
                byte b15 = bArr[5];
                if (bArr.length >= 7) {
                    byte b16 = bArr[6];
                    if ((b16 & 255) != 255) {
                        if ((b16 & 1) == 1) {
                            z10 = true;
                            z11 = true;
                            bVar = new qd.b(i12, i13, b14, i14, i15, b15, z10, z11);
                        }
                        z10 = z17;
                        z11 = false;
                        bVar = new qd.b(i12, i13, b14, i14, i15, b15, z10, z11);
                    }
                }
                z17 = false;
                z10 = z17;
                z11 = false;
                bVar = new qd.b(i12, i13, b14, i14, i15, b15, z10, z11);
            }
            if (bVar == null) {
                if (kd.c.f18444g) {
                    ge.b.n(">> EVENT_VP_TONE_VOLUME_STATUS");
                    return;
                }
                return;
            }
            if (kd.c.f18443f) {
                ge.b.d(bVar.toString());
            }
            l().f22253m0 = bVar.a();
            j(56);
        } else if (s10 == 522) {
            if (bArr == null || bArr.length < 7) {
                ge.b.n("invalid packet");
                aVar = null;
            } else {
                byte b17 = bArr[0];
                int i16 = bArr[1] & 255;
                int i17 = bArr[2] & 255;
                byte b18 = bArr[3];
                int i18 = bArr[4] & 255;
                int i19 = bArr[5] & 255;
                byte b19 = bArr[6];
                if (bArr.length >= 8) {
                    byte b20 = bArr[7];
                    if ((b20 & 255) != 255) {
                        if ((b20 & 1) == 1) {
                            z12 = true;
                            z13 = true;
                            aVar = new qd.a(b17, i16, i17, b18, i18, i19, b19, z12, z13);
                        }
                        z12 = z17;
                        z13 = false;
                        aVar = new qd.a(b17, i16, i17, b18, i18, i19, b19, z12, z13);
                    }
                }
                z17 = false;
                z12 = z17;
                z13 = false;
                aVar = new qd.a(b17, i16, i17, b18, i18, i19, b19, z12, z13);
            }
            if (aVar == null) {
                if (kd.c.f18444g) {
                    ge.b.n(">> EVENT_VP_TONE_VOLUME_LEVEL_SET");
                    return;
                }
                return;
            }
            if (kd.c.f18443f) {
                ge.b.n(aVar.toString());
            }
            l().f22253m0 = aVar.a();
            j(56);
        } else if (s10 == 3115 || s10 == 3116) {
            if (kd.c.f18444g) {
                ge.b.n(">> EVENT_LISTENING_MODE_CYCLE_SET/GET");
            }
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            l().f22249k0 = bArr[0];
            i(kd.c.f18445h);
            j(41);
        } else {
            switch (s10) {
                case 17:
                    if (bArr == null || bArr.length < 2) {
                        return;
                    }
                    byte b21 = bArr[0];
                    if (b21 == 0) {
                        jd.b a10 = jd.b.a(bArr);
                        nd.b l10 = l();
                        l10.getClass();
                        int i20 = a10.f17640a;
                        l10.f22232c = i20;
                        l10.f22234d = a10.f17641b;
                        if (i20 == 0) {
                            l10.d(null);
                        }
                        i10 = 12;
                    } else if (b21 != 1 || bArr[1] != 0 || bArr.length < 8) {
                        return;
                    } else {
                        int length = bArr.length - 2;
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 2, bArr2, 0, length);
                        l().d(new e(bArr2));
                        i10 = 13;
                    }
                    j(i10);
                    return;
                case 24:
                    int i21 = 58;
                    if (kd.c.f18444g) {
                        ge.b.n(">> EVENT_REPORT_CFG_SETTINGS");
                    }
                    jd.a b22 = jd.a.b(bArr);
                    if (b22 != null) {
                        if (kd.c.f18444g) {
                            ge.b.n(b22.toString());
                        }
                        byte b23 = b22.f17638a;
                        if (b23 == 0) {
                            l().f22238f = b22.g();
                            j(3);
                            return;
                        } else if (1 == b23) {
                            l().f22236e = b22.h();
                            j(2);
                            return;
                        } else {
                            if (2 == b23) {
                                l().f22242h = b22.e();
                            } else if (3 == b23) {
                                l().f22244i = b22.a();
                                l().f22246j = b22.i();
                                i21 = 59;
                            } else if (4 == b23) {
                                l().f22248k = b22.c();
                                i21 = 60;
                            } else if (5 == b23) {
                                l().f22250l = b22.f();
                                i21 = 61;
                            } else if (6 != b23) {
                                return;
                            } else {
                                l().f22252m = b22.j();
                                i21 = 62;
                            }
                            j(i21);
                            return;
                        }
                    }
                    return;
                case 34:
                    int length2 = bArr != null ? bArr.length : 0;
                    if (length2 < 5) {
                        aVar2 = null;
                    } else {
                        byte b24 = bArr[0];
                        byte b25 = bArr[1];
                        byte b26 = bArr[2];
                        byte b27 = (byte) ((b26 & 240) >> 4);
                        byte b28 = (byte) (b26 & 15);
                        byte b29 = bArr[3];
                        byte b30 = bArr[4];
                        if (length2 >= 6) {
                            b10 = bArr[5];
                            if ((b10 & 255) != 255) {
                                b11 = b10;
                                z14 = true;
                                aVar2 = new ld.a(b24, b25, b27, b28, b29, b30, b11, z14);
                            }
                        } else {
                            b10 = 0;
                        }
                        b11 = b10;
                        z14 = false;
                        aVar2 = new ld.a(b24, b25, b27, b28, b29, b30, b11, z14);
                    }
                    if (aVar2 != null) {
                        if (kd.c.f18444g) {
                            ge.b.n(aVar2.toString());
                        }
                        l().f22256o = aVar2.a();
                        j(39);
                        return;
                    }
                    return;
                case 260:
                    if (kd.c.f18444g) {
                        ge.b.n(">> EVENT_LE_ADDR");
                    }
                    l().f22240g = p.b.h(bArr);
                    j(4);
                    return;
                case 517:
                    if (bArr.length < 1) {
                        aVar3 = null;
                    } else {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        int i22 = wrap.get() & 15;
                        aVar3 = new bd.a(15, 15, i22, i22, i22, i22, false, false);
                    }
                    if (aVar3 != null) {
                        if (kd.c.f18444g) {
                            ge.b.n(aVar3.toString());
                        }
                        l().V = aVar3;
                        i(kd.c.f18445h);
                        j(33);
                        return;
                    }
                    return;
                case 789:
                    if (bArr == null || bArr.length < 1) {
                        ge.b.n("invalid packet");
                        bVar2 = null;
                    } else {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        bVar2 = new qb.b(wrap2.get() & 255);
                    }
                    if (bVar2 != null) {
                        if (kd.c.f18444g) {
                            ge.b.n(bVar2.toString());
                        }
                        od.a aVar5 = new od.a();
                        aVar5.f23079a = bVar2.f24676b;
                        k(aVar5);
                        return;
                    }
                    return;
                case 1536:
                    if (kd.c.f18444g) {
                        ge.b.n(">> EVENT_OTA_GET_DEVICE_INFO");
                    }
                    j(14);
                    return;
                case 1800:
                    l().f22264u = j.b(bArr);
                    CopyOnWriteArrayList copyOnWriteArrayList3 = this.f18448b;
                    if (copyOnWriteArrayList3 == null || copyOnWriteArrayList3.size() <= 0) {
                        if (kd.c.f18444g) {
                            ge.b.n("no callback registered");
                            return;
                        }
                        return;
                    }
                    Iterator it3 = this.f18448b.iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).getClass();
                    }
                    return;
                case 2313:
                    ld.b a11 = ld.b.a(bArr);
                    if (a11 != null) {
                        if (kd.c.f18444g) {
                            ge.b.n(a11.toString());
                        }
                        l().f22257o0 = a11.f19448b;
                        j(63);
                        return;
                    }
                    return;
                case 2321:
                    if (bArr == null || bArr.length < 2) {
                        return;
                    }
                    l().f22230a = bArr[0];
                    l().f22231b = bArr[1];
                    j(11);
                    return;
                case 2832:
                    if (kd.c.f18444g) {
                        ge.b.n(">> EVENT_SOUND_PRESS_CALIBRATION");
                    }
                    if (bArr == null || bArr.length < 1) {
                        return;
                    }
                    byte b31 = bArr[0];
                    CopyOnWriteArrayList copyOnWriteArrayList4 = this.f18448b;
                    if (copyOnWriteArrayList4 == null || copyOnWriteArrayList4.size() <= 0) {
                        if (kd.c.f18444g) {
                            ge.b.n("no callback registered");
                            return;
                        }
                        return;
                    }
                    Iterator it4 = this.f18448b.iterator();
                    while (it4.hasNext()) {
                        ((a) it4.next()).getClass();
                    }
                    return;
                case 8451:
                    if (bArr == null || bArr.length < 1) {
                        return;
                    }
                    l().f22236e = new String(bArr, 0, bArr.length, StandardCharsets.UTF_8).trim();
                    j(2);
                    return;
                default:
                    switch (s10) {
                        case 3118:
                            if (bArr.length < 9) {
                                aVar4 = null;
                            } else {
                                ByteBuffer wrap3 = ByteBuffer.wrap(bArr);
                                wrap3.order(ByteOrder.LITTLE_ENDIAN);
                                int i23 = wrap3.get() & 255;
                                int i24 = wrap3.getShort() & 65535;
                                byte b32 = wrap3.get();
                                short s11 = wrap3.getShort();
                                byte b33 = wrap3.get();
                                short s12 = wrap3.getShort();
                                byte b34 = b32 == -1 ? (byte) 0 : b32;
                                short s13 = s11 == -1 ? (short) 0 : s11;
                                byte b35 = b33 == -1 ? (byte) 0 : b33;
                                short s14 = s12 == -1 ? (short) 0 : s12;
                                if (bArr.length < 10) {
                                    z17 = false;
                                } else if ((wrap3.get() & 255) == 1) {
                                    z15 = true;
                                    z16 = true;
                                    aVar4 = new bd.a(i23, i24, b34, s13, b35, s14, z15, z16);
                                }
                                z15 = z17;
                                z16 = false;
                                aVar4 = new bd.a(i23, i24, b34, s13, b35, s14, z15, z16);
                            }
                            if (aVar4 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(aVar4.toString());
                                }
                                l().V = aVar4;
                                i(kd.c.f18445h);
                                j(33);
                                return;
                            }
                            return;
                        case 3119:
                            if (bArr == null || bArr.length < 7) {
                                ge.b.n("invalid packet");
                                bVar3 = null;
                            } else {
                                ByteBuffer wrap4 = ByteBuffer.wrap(bArr);
                                wrap4.order(ByteOrder.LITTLE_ENDIAN);
                                byte b36 = wrap4.get();
                                byte b37 = wrap4.get();
                                short s15 = wrap4.getShort();
                                byte b38 = wrap4.get();
                                short s16 = wrap4.getShort();
                                bVar3 = new cd.b(b36, b37 == -1 ? (byte) 0 : b37, s15 == -1 ? (short) 0 : s15, b38 == -1 ? (byte) 0 : b38, s16 == -1 ? (short) 0 : s16);
                            }
                            if (bVar3 != null) {
                                if (!bVar3.b()) {
                                    a((byte) 5, 40);
                                    return;
                                }
                                nd.b l11 = l();
                                bd.b a12 = bVar3.a();
                                bd.a aVar6 = l11.V;
                                if (aVar6 != null) {
                                    aVar6.f4139b = a12.f4146a;
                                    aVar6.f4140c = a12.f4148c;
                                    aVar6.f4142e = a12.f4147b;
                                    aVar6.f4143f = a12.f4149d;
                                }
                                j(33);
                                return;
                            }
                            return;
                        case 3120:
                            if (bArr.length < 6) {
                                bVar4 = null;
                            } else {
                                ByteBuffer wrap5 = ByteBuffer.wrap(bArr);
                                wrap5.order(ByteOrder.LITTLE_ENDIAN);
                                byte b39 = wrap5.get();
                                short s17 = wrap5.getShort();
                                byte b40 = wrap5.get();
                                short s18 = wrap5.getShort();
                                if (b39 == -1) {
                                    b39 = 0;
                                }
                                if (s17 == -1) {
                                    s17 = 0;
                                }
                                if (b40 == -1) {
                                    b40 = 0;
                                }
                                bVar4 = new bd.b(b39, s17, b40, s18 != -1 ? s18 : (short) 0);
                            }
                            if (bVar4 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(bVar4.toString());
                                }
                                bd.a aVar7 = l().V;
                                if (aVar7 != null) {
                                    aVar7.f4139b = bVar4.f4146a;
                                    aVar7.f4140c = bVar4.f4148c;
                                    aVar7.f4142e = bVar4.f4147b;
                                    aVar7.f4143f = bVar4.f4149d;
                                }
                                j(33);
                                return;
                            }
                            return;
                        case 3121:
                            md.b a13 = md.b.a(bArr);
                            if (a13 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(a13.toString());
                                }
                                l().f22245i0 = a13;
                                i(kd.c.f18445h);
                                j(51);
                                return;
                            }
                            return;
                        case 3122:
                            hd.b a14 = hd.b.a(bArr);
                            if (a14 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(a14.toString());
                                }
                                if (!a14.c()) {
                                    a((byte) 5, 42);
                                    return;
                                }
                                l().e(a14.b());
                                j(52);
                                return;
                            }
                            return;
                        case 3123:
                            md.c a15 = md.c.a(bArr);
                            if (a15 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(a15.toString());
                                }
                                l().e(a15);
                                j(52);
                                return;
                            }
                            return;
                        case 3124:
                            cd.a a16 = cd.a.a(bArr);
                            if (a16 != null) {
                                if (kd.c.f18444g) {
                                    ge.b.n(a16.toString());
                                }
                                l().W = a16.b();
                                j(32);
                                return;
                            }
                            return;
                        default:
                            switch (s10) {
                                case 3140:
                                    w.j a17 = w.j.a(bArr);
                                    if (a17 != null) {
                                        if (kd.c.f18444g) {
                                            ge.b.n(a17.toString());
                                        }
                                        l().f22235d0 = (ad.a) a17.f29497b;
                                        j(57);
                                        return;
                                    }
                                    return;
                                case 3141:
                                    zc.b a18 = zc.b.a(bArr);
                                    if (a18 == null || !a18.b()) {
                                        a((byte) 5, 58);
                                        return;
                                    } else {
                                        a((byte) 0, 58);
                                        return;
                                    }
                                case 3142:
                                    zc.a a19 = zc.a.a(bArr);
                                    if (a19 == null || !a19.b()) {
                                        a((byte) 5, 59);
                                        return;
                                    }
                                    a((byte) 0, 59);
                                    m();
                                    return;
                                default:
                                    switch (s10) {
                                        case 3584:
                                            fd.a a20 = fd.a.a(bArr);
                                            if (a20 != null) {
                                                l().h(a20);
                                                if (kd.c.f18444g) {
                                                    ge.b.n(a20.toString());
                                                }
                                                j(21);
                                                return;
                                            }
                                            return;
                                        case 3585:
                                            if (bArr != null && bArr.length > 0) {
                                                l().D = bArr[0];
                                                if (kd.c.f18444g) {
                                                    ge.b.n(String.format("isEarDetectionOn=%b", Boolean.valueOf(l().b())));
                                                }
                                                i11 = 55;
                                                break;
                                            } else {
                                                return;
                                            }
                                        case 3586:
                                            fd.b a21 = fd.b.a(bArr);
                                            if (a21 != null) {
                                                nd.b l12 = l();
                                                l12.getClass();
                                                l12.A = a21.f14237b;
                                                l12.C = a21.f14236a;
                                                if (kd.c.f18444g) {
                                                    ge.b.n(a21.toString());
                                                }
                                                j(22);
                                                return;
                                            }
                                            return;
                                        default:
                                            switch (s10) {
                                                case 1792:
                                                    if (bArr == null || bArr.length <= 0) {
                                                        return;
                                                    }
                                                    int i25 = bArr[0] & 255;
                                                    if (bArr.length >= i25 + 1) {
                                                        byte[] bArr3 = new byte[i25];
                                                        System.arraycopy(bArr, 1, bArr3, 0, i25);
                                                        l().f22260q = bArr3;
                                                        j(35);
                                                        return;
                                                    }
                                                    return;
                                                case 1793:
                                                    if (bArr == null || bArr.length <= 0) {
                                                        return;
                                                    }
                                                    int i26 = bArr[0] & 255;
                                                    if (bArr.length >= i26 + 1) {
                                                        byte[] bArr4 = new byte[i26];
                                                        System.arraycopy(bArr, 1, bArr4, 0, i26);
                                                        l().f22261r = bArr4;
                                                        j(36);
                                                        return;
                                                    }
                                                    return;
                                                case 1794:
                                                    if (bArr == null || bArr.length <= 0) {
                                                        return;
                                                    }
                                                    int i27 = bArr[0] & 255;
                                                    if (bArr.length >= i27 + 1) {
                                                        byte[] bArr5 = new byte[i27];
                                                        System.arraycopy(bArr, 1, bArr5, 0, i27);
                                                        l().f22262s = bArr5;
                                                        j(37);
                                                        return;
                                                    }
                                                    return;
                                                case 1795:
                                                    l().f22263t = j.b(bArr);
                                                    CopyOnWriteArrayList copyOnWriteArrayList5 = this.f18448b;
                                                    if (copyOnWriteArrayList5 == null || copyOnWriteArrayList5.size() <= 0) {
                                                        if (kd.c.f18444g) {
                                                            ge.b.n("no callback registered");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    Iterator it5 = this.f18448b.iterator();
                                                    while (it5.hasNext()) {
                                                        ((a) it5.next()).getClass();
                                                    }
                                                    return;
                                                default:
                                                    switch (s10) {
                                                        case 1808:
                                                            if (kd.c.f18444g) {
                                                                ge.b.n(">> EVENT_REPORT_MOTOR_STATUS");
                                                            }
                                                            if (bArr != null && bArr.length > 0) {
                                                                l().F = bArr[0];
                                                                i11 = 18;
                                                                break;
                                                            } else {
                                                                return;
                                                            }
                                                            break;
                                                        case 1809:
                                                            if (kd.c.f18444g) {
                                                                ge.b.n(">> EVENT_REPORT_MOTOR_VIBRATION_STATUS");
                                                            }
                                                            if (bArr != null && bArr.length > 0) {
                                                                l().H = bArr[0];
                                                                i11 = 20;
                                                                break;
                                                            } else {
                                                                return;
                                                            }
                                                            break;
                                                        case 1810:
                                                            if (kd.c.f18444g) {
                                                                ge.b.n(">> EVENT_REPORT_MOTOR_MODE_PARAMETERS");
                                                            }
                                                            if (bArr == null || bArr.length <= 0) {
                                                                return;
                                                            }
                                                            CopyOnWriteArrayList copyOnWriteArrayList6 = this.f18448b;
                                                            if (copyOnWriteArrayList6 == null || copyOnWriteArrayList6.size() <= 0) {
                                                                if (kd.c.f18444g) {
                                                                    ge.b.n("no callback registered");
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            int i28 = ((bArr[1] << 8) | (bArr[0] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                                                            int i29 = ((bArr[3] << 8) | (bArr[2] & 255)) & Platform.CUSTOMER_ACTION_MASK;
                                                            l().L = i28;
                                                            l().M = i29;
                                                            l().Q = bArr[4] & 255;
                                                            j(19);
                                                            return;
                                                        default:
                                                            switch (s10) {
                                                                case 3072:
                                                                case 3073:
                                                                case 3074:
                                                                case 3075:
                                                                case 3076:
                                                                    if (kd.c.f18444g) {
                                                                        ge.b.n(">> onToneAndTalkKeyEventReport" + ((int) s10));
                                                                    }
                                                                    CopyOnWriteArrayList copyOnWriteArrayList7 = this.f18448b;
                                                                    if (copyOnWriteArrayList7 == null || copyOnWriteArrayList7.size() <= 0) {
                                                                        if (kd.c.f18444g) {
                                                                            ge.b.n("no callback registered");
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    Iterator it6 = this.f18448b.iterator();
                                                                    while (it6.hasNext()) {
                                                                        ((a) it6.next()).getClass();
                                                                    }
                                                                    return;
                                                                default:
                                                                    switch (s10) {
                                                                        case 3104:
                                                                            if (bArr == null || bArr.length <= 0) {
                                                                                return;
                                                                            }
                                                                            if (kd.c.f18444g) {
                                                                                ge.b.n(">> EVENT_ANC_QUERY");
                                                                            }
                                                                            nd.a b41 = nd.a.b(bArr);
                                                                            nd.b l13 = l();
                                                                            l13.Z = b41;
                                                                            if (b41 != null) {
                                                                                l13.Y = b41.f22226b;
                                                                            }
                                                                            i(kd.c.f18445h);
                                                                            j(16);
                                                                            return;
                                                                        case 3105:
                                                                            if (bArr == null || bArr.length <= 1) {
                                                                                return;
                                                                            }
                                                                            if (kd.c.f18444g) {
                                                                                ge.b.n(">> EVENT_ANC_SET_STATE");
                                                                            }
                                                                            if (bArr[1] == 0) {
                                                                                return;
                                                                            }
                                                                            a((byte) 5, 14);
                                                                            return;
                                                                        case 3106:
                                                                            if (bArr == null || bArr.length <= 0) {
                                                                                return;
                                                                            }
                                                                            if (kd.c.f18444g) {
                                                                                ge.b.n(">> EVENT_LLAPT_QUERY");
                                                                            }
                                                                            l().f(md.a.b(bArr));
                                                                            i(kd.c.f18445h);
                                                                            j(49);
                                                                            return;
                                                                        case 3107:
                                                                            if (bArr == null || bArr.length <= 1) {
                                                                                return;
                                                                            }
                                                                            if (kd.c.f18444g) {
                                                                                ge.b.n(">> EVENT_LLAPT_ENABLE_DISABLE");
                                                                            }
                                                                            if (bArr[1] == 0) {
                                                                                return;
                                                                            }
                                                                            a((byte) 5, 33);
                                                                            return;
                                                                        case 3108:
                                                                            if (bArr == null || bArr.length <= 0) {
                                                                                return;
                                                                            }
                                                                            if (kd.c.f18444g) {
                                                                                ge.b.n(">> EVENT_SPECIFY_ANC_QUERY");
                                                                            }
                                                                            nd.a b42 = nd.a.b(bArr);
                                                                            nd.b l14 = l();
                                                                            l14.f22233c0 = b42;
                                                                            if (b42 != null) {
                                                                                l14.Y = b42.f22226b;
                                                                            }
                                                                            i(kd.c.f18445h);
                                                                            j(65);
                                                                            return;
                                                                        default:
                                                                            switch (s10) {
                                                                                case 3126:
                                                                                    i a22 = i.a(bArr);
                                                                                    if (a22 != null) {
                                                                                        if (kd.c.f18444g) {
                                                                                            ge.b.n(a22.toString());
                                                                                        }
                                                                                        l().f22243h0 = (d) a22.f30183b;
                                                                                        j(53);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                case 3127:
                                                                                    hd.d a23 = hd.d.a(bArr);
                                                                                    if (a23 == null || !a23.b()) {
                                                                                        a((byte) 5, 50);
                                                                                        return;
                                                                                    } else {
                                                                                        a((byte) 0, 50);
                                                                                        return;
                                                                                    }
                                                                                case 3128:
                                                                                    hd.c a24 = hd.c.a(bArr);
                                                                                    if (a24 != null && a24.b()) {
                                                                                        a((byte) 0, 51);
                                                                                        f(new hd.a((byte) 1));
                                                                                        return;
                                                                                    }
                                                                                    a((byte) 5, 51);
                                                                                    return;
                                                                                case 3129:
                                                                                    r b43 = r.b(bArr);
                                                                                    if (b43 != null) {
                                                                                        if (kd.c.f18444g) {
                                                                                            ge.b.n(b43.toString());
                                                                                        }
                                                                                        l().X = b43.f23028b;
                                                                                        j(34);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                default:
                                                                                    switch (s10) {
                                                                                        case 3131:
                                                                                            if (bArr == null || bArr.length <= 0) {
                                                                                                return;
                                                                                            }
                                                                                            if (kd.c.f18444g) {
                                                                                                ge.b.n(">> EVENT_LISTENING_MODE_SET");
                                                                                            }
                                                                                            if (bArr[0] == 0) {
                                                                                                a((byte) 0, 38);
                                                                                                return;
                                                                                            } else {
                                                                                                a((byte) 5, 38);
                                                                                                return;
                                                                                            }
                                                                                        case 3132:
                                                                                            if (kd.c.f18444g) {
                                                                                                ge.b.n(">> EVENT_LISTENING_MODE_STATUS");
                                                                                            }
                                                                                            id.a a25 = id.a.a(bArr);
                                                                                            if (a25 != null) {
                                                                                                if (kd.c.f18444g) {
                                                                                                    ge.b.n(a25.toString());
                                                                                                }
                                                                                                l().g(a25);
                                                                                                i(kd.c.f18445h);
                                                                                                j(48);
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        case 3133:
                                                                                            if (kd.c.f18444g) {
                                                                                                ge.b.n(">> EVENT_APT_TYPE_QUERY");
                                                                                            }
                                                                                            if (bArr == null || bArr.length < 2 || bArr[0] != 0) {
                                                                                                a((byte) 5, 66);
                                                                                                return;
                                                                                            }
                                                                                            l().f22247j0 = bArr[1];
                                                                                            i(kd.c.f18445h);
                                                                                            a((byte) 0, 66);
                                                                                            return;
                                                                                        case 3134:
                                                                                            if (kd.c.f18444g) {
                                                                                                ge.b.n(">> EVENT_ASSIGN_APT_TYPE");
                                                                                            }
                                                                                            if (bArr == null || bArr.length < 1) {
                                                                                                a((byte) 5, 67);
                                                                                                return;
                                                                                            }
                                                                                            l().f22247j0 = bArr[0];
                                                                                            a((byte) 0, 67);
                                                                                            return;
                                                                                        default:
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    j(i11);
                                    return;
                            }
                    }
            }
        }
    }

    public final void j(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            ge.b.o("no callback registered", kd.c.f18444g);
            return;
        }
        ge.b.e(String.format("dispatchDeviceInfoChanged: indicator=0x%02X", Integer.valueOf(i10)), kd.c.f18443f);
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(i10, l());
        }
    }

    public final void k(od.a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18448b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            ge.b.o("no callback registered", kd.c.f18444g);
            return;
        }
        ge.b.e(String.format("dispatchMultilinkInfoChanged: %s", aVar.toString()), kd.c.f18443f);
        Iterator it = this.f18448b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
    }

    public final nd.b l() {
        if (this.f24013j == null) {
            this.f24013j = new nd.b();
        }
        return this.f24013j;
    }

    public final void m() {
        byte[] bArr = {(byte) 32, (byte) 12};
        System.arraycopy(new byte[]{0}, 0, bArr, 2, 1);
        g(new ed.b(2, (short) 3104, (short) 3104, bArr));
    }
}
