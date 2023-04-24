package bi;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import java.io.BufferedReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import no.nordicsemi.android.dfu.DfuBaseService;
import pm.a2;
import pm.c2;
import pm.g2;
import pm.n1;
import pm.o1;
import pm.z1;
import xl.e;

/* loaded from: classes2.dex */
public class z0 {
    public static a2 a() {
        return new a2(null);
    }

    public static long b(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 + j10;
        } while (!atomicLong.compareAndSet(j11, j12 >= 0 ? j12 : Long.MAX_VALUE));
        return j11;
    }

    public static final vl.h c(vl.h hVar) {
        vl.b<E, ?> bVar = hVar.f29470a;
        bVar.c();
        bVar.f29458l = true;
        return hVar;
    }

    public static final void d(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    public static final HashSet e(Object... objArr) {
        HashSet hashSet = new HashSet(ih.v.j(objArr.length));
        ul.i.E(hashSet, objArr);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [pm.a, pm.z1] */
    public static final z1 f(pm.e0 e0Var, xl.f fVar, int i10, fm.p pVar) {
        boolean z10;
        o1 o1Var;
        xl.f a10 = pm.z.a(e0Var.E(), fVar, true);
        wm.c cVar = pm.o0.f24381a;
        if (a10 != cVar && a10.b(e.a.f30630a) == null) {
            a10 = a10.s(cVar);
        }
        if (i10 != 0) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                o1Var = new o1(a10, pVar);
            } else {
                o1Var = new z1(a10, true);
            }
            o1Var.A0(i10, o1Var, pVar);
            return o1Var;
        }
        throw null;
    }

    public static /* synthetic */ z1 g(pm.e0 e0Var, xl.f fVar, int i10, fm.p pVar, int i11) {
        if ((i11 & 1) != 0) {
            fVar = xl.g.f30632a;
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        return f(e0Var, fVar, i10, pVar);
    }

    public static String h(int i10) {
        if (i10 != 26) {
            if (i10 != 30) {
                if (i10 != 34) {
                    if (i10 != 42) {
                        if (i10 != 257) {
                            if (i10 != 58) {
                                if (i10 != 59) {
                                    switch (i10) {
                                        case 1:
                                            return "GATT INVALID HANDLE";
                                        case 2:
                                            return "GATT READ NOT PERMIT";
                                        case 3:
                                            return "GATT WRITE NOT PERMIT";
                                        case 4:
                                            return "GATT INVALID PDU";
                                        case 5:
                                            return "GATT INSUF AUTHENTICATION";
                                        case 6:
                                            return "GATT REQ NOT SUPPORTED";
                                        case 7:
                                            return "GATT INVALID OFFSET";
                                        case 8:
                                            return "GATT INSUF AUTHORIZATION";
                                        case 9:
                                            return "GATT PREPARE Q FULL";
                                        case 10:
                                            return "GATT NOT FOUND";
                                        case 11:
                                            return "GATT NOT LONG";
                                        case 12:
                                            return "GATT INSUF KEY SIZE";
                                        case 13:
                                            return "GATT INVALID ATTR LEN";
                                        case 14:
                                            return "GATT ERR UNLIKELY";
                                        case 15:
                                            return "GATT INSUF ENCRYPTION";
                                        case 16:
                                            return "GATT UNSUPPORT GRP TYPE";
                                        case 17:
                                            return "GATT INSUF RESOURCE";
                                        default:
                                            switch (i10) {
                                                case 128:
                                                    return "GATT NO RESOURCES";
                                                case 129:
                                                    return "GATT INTERNAL ERROR";
                                                case 130:
                                                    return "GATT WRONG STATE";
                                                case 131:
                                                    return "GATT DB FULL";
                                                case 132:
                                                    return "GATT BUSY";
                                                case 133:
                                                    return "GATT ERROR";
                                                case 134:
                                                    return "GATT CMD STARTED";
                                                case 135:
                                                    return "GATT ILLEGAL PARAMETER";
                                                case 136:
                                                    return "GATT PENDING";
                                                case 137:
                                                    return "GATT AUTH FAIL";
                                                case 138:
                                                    return "GATT MORE";
                                                case 139:
                                                    return "GATT INVALID CFG";
                                                case 140:
                                                    return "GATT SERVICE STARTED";
                                                case 141:
                                                    return "GATT ENCRYPTED NO MITM";
                                                case 142:
                                                    return "GATT NOT ENCRYPTED";
                                                case 143:
                                                    return "GATT CONGESTED";
                                                default:
                                                    switch (i10) {
                                                        case 253:
                                                            return "GATT CCCD CFG ERROR";
                                                        case 254:
                                                            return "GATT PROCEDURE IN PROGRESS";
                                                        case 255:
                                                            return "GATT VALUE OUT OF RANGE";
                                                        default:
                                                            switch (i10) {
                                                                case 4096:
                                                                    return "DFU DEVICE DISCONNECTED";
                                                                case DfuBaseService.ERROR_FILE_NOT_FOUND /* 4097 */:
                                                                    return "DFU FILE NOT FOUND";
                                                                case DfuBaseService.ERROR_FILE_ERROR /* 4098 */:
                                                                    return "DFU FILE ERROR";
                                                                case DfuBaseService.ERROR_FILE_INVALID /* 4099 */:
                                                                    return "DFU NOT A VALID HEX FILE";
                                                                case DfuBaseService.ERROR_FILE_IO_EXCEPTION /* 4100 */:
                                                                    return "DFU IO EXCEPTION";
                                                                case DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED /* 4101 */:
                                                                    return "DFU SERVICE DISCOVERY NOT STARTED";
                                                                case DfuBaseService.ERROR_SERVICE_NOT_FOUND /* 4102 */:
                                                                    return "DFU CHARACTERISTICS NOT FOUND";
                                                                default:
                                                                    switch (i10) {
                                                                        case DfuBaseService.ERROR_INVALID_RESPONSE /* 4104 */:
                                                                            return "DFU INVALID RESPONSE";
                                                                        case DfuBaseService.ERROR_FILE_TYPE_UNSUPPORTED /* 4105 */:
                                                                            return "DFU FILE TYPE NOT SUPPORTED";
                                                                        case DfuBaseService.ERROR_BLUETOOTH_DISABLED /* 4106 */:
                                                                            return "BLUETOOTH ADAPTER DISABLED";
                                                                        case DfuBaseService.ERROR_INIT_PACKET_REQUIRED /* 4107 */:
                                                                        case DfuBaseService.ERROR_FILE_SIZE_INVALID /* 4108 */:
                                                                            return "DFU INIT PACKET REQUIRED";
                                                                        case DfuBaseService.ERROR_CRC_ERROR /* 4109 */:
                                                                            return "DFU CRC ERROR";
                                                                        case DfuBaseService.ERROR_DEVICE_NOT_BONDED /* 4110 */:
                                                                            return "DFU DEVICE NOT BONDED";
                                                                        default:
                                                                            return androidx.activity.i.a("UNKNOWN (", i10, ")");
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                }
                                return "GATT UNACCEPT CONN INTERVAL";
                            }
                            return "GATT CONTROLLER BUSY";
                        }
                        return "TOO MANY OPEN CONNECTIONS";
                    }
                    return "HCI ERROR DIFF TRANSACTION COLLISION";
                }
                return "GATT CONN LMP TIMEOUT";
            }
            return "HCI ERROR INVALID LMP PARAM";
        }
        return "HCI ERROR UNSUPPORTED REMOTE FEATURE";
    }

    public static String i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 8) {
                    if (i10 != 19) {
                        if (i10 != 22) {
                            if (i10 != 34) {
                                if (i10 != 62) {
                                    if (i10 != 133) {
                                        if (i10 != 256) {
                                            return androidx.activity.i.a("UNKNOWN (", i10, ")");
                                        }
                                        return "GATT CONN CANCEL ";
                                    }
                                    return "GATT ERROR";
                                }
                                return "GATT CONN FAIL ESTABLISH";
                            }
                            return "GATT CONN LMP TIMEOUT";
                        }
                        return "GATT CONN TERMINATE LOCAL HOST";
                    }
                    return "GATT CONN TERMINATE PEER USER";
                }
                return "GATT CONN TIMEOUT";
            }
            return "GATT CONN L2C FAILURE";
        }
        return MonitorResult.SUCCESS;
    }

    public static String j(int i10) {
        int i11 = i10 & 3840;
        if (i11 != 256) {
            if (i11 != 512) {
                if (i11 != 1024) {
                    if (i11 != 2048) {
                        return androidx.activity.i.a("UNKNOWN (", i10, ")");
                    }
                    return hb.d.h(i10);
                }
                return hb.d.i(i10);
            }
            return hb.d.g(i10);
        }
        return m0.z(i10);
    }

    public static final Object k(Object obj, um.k kVar) {
        if (obj == null) {
            return kVar;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(kVar);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(kVar);
        return arrayList;
    }

    public static void l(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                ol.a.a(new IllegalStateException(a0.q0.a("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
    }

    public static final String m(BufferedReader bufferedReader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[DfuBaseService.ERROR_REMOTE_MASK];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read >= 0) {
                stringWriter.write(cArr, 0, read);
            } else {
                String stringWriter2 = stringWriter.toString();
                gm.l.e(stringWriter2, "buffer.toString()");
                return stringWriter2;
            }
        }
    }

    public static Object n(fm.p pVar) {
        long j10;
        xl.g gVar = xl.g.f30632a;
        Thread currentThread = Thread.currentThread();
        e.a aVar = e.a.f30630a;
        pm.u uVar = null;
        pm.u0 a10 = c2.a();
        xl.f a11 = pm.z.a(gVar, a10, true);
        wm.c cVar = pm.o0.f24381a;
        if (a11 != cVar && a11.b(aVar) == null) {
            a11 = a11.s(cVar);
        }
        pm.d dVar = new pm.d(a11, currentThread, a10);
        dVar.A0(1, dVar, pVar);
        pm.u0 u0Var = dVar.f24330d;
        if (u0Var != null) {
            int i10 = pm.u0.f24397f;
            u0Var.u0(false);
        }
        while (!Thread.interrupted()) {
            pm.u0 u0Var2 = dVar.f24330d;
            if (u0Var2 != null) {
                j10 = u0Var2.x0();
            } else {
                j10 = Long.MAX_VALUE;
            }
            if (!dVar.b0()) {
                LockSupport.parkNanos(dVar, j10);
            } else {
                pm.u0 u0Var3 = dVar.f24330d;
                if (u0Var3 != null) {
                    int i11 = pm.u0.f24397f;
                    u0Var3.q0(false);
                }
                Object a12 = n1.a(dVar.d0());
                if (a12 instanceof pm.u) {
                    uVar = (pm.u) a12;
                }
                if (uVar == null) {
                    return a12;
                }
                throw uVar.f24396a;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        dVar.B(interruptedException);
        throw interruptedException;
    }

    public static final Set o(Object obj) {
        Set singleton = Collections.singleton(obj);
        gm.l.e(singleton, "singleton(element)");
        return singleton;
    }

    public static final Set p(Object... objArr) {
        if (objArr.length > 0) {
            int length = objArr.length;
            if (length != 0) {
                if (length != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(ih.v.j(objArr.length));
                    ul.i.E(linkedHashSet, objArr);
                    return linkedHashSet;
                }
                return o(objArr[0]);
            }
            return ul.u.f28881a;
        }
        return ul.u.f28881a;
    }

    public static final long q(String str, long j10, long j11, long j12) {
        String str2;
        int i10 = um.y.f28943a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long T = om.g.T(str2);
            if (T != null) {
                long longValue = T.longValue();
                boolean z10 = false;
                if (j11 <= longValue && longValue <= j12) {
                    z10 = true;
                }
                if (z10) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j10;
    }

    public static int r(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) q(str, i10, i11, i12);
    }

    public static final Object s(xl.d dVar, xl.f fVar, fm.p pVar) {
        xl.f a10;
        xl.f e10 = dVar.e();
        if (!((Boolean) fVar.Z(Boolean.FALSE, pm.a0.f24321b)).booleanValue()) {
            a10 = e10.s(fVar);
        } else {
            a10 = pm.z.a(e10, fVar, false);
        }
        m0.j(a10);
        if (a10 == e10) {
            um.v vVar = new um.v(dVar, a10);
            return gm.f.d(vVar, vVar, pVar);
        }
        e.a aVar = e.a.f30630a;
        if (gm.l.a(a10.b(aVar), e10.b(aVar))) {
            g2 g2Var = new g2(dVar, a10);
            Object c10 = um.z.c(a10, null);
            try {
                return gm.f.d(g2Var, g2Var, pVar);
            } finally {
                um.z.a(a10, c10);
            }
        }
        pm.l0 l0Var = new pm.l0(dVar, a10);
        try {
            um.h.a(mf.a0.i(mf.a0.e(l0Var, l0Var, pVar)), tl.l.f28297a, null);
            return l0Var.B0();
        } catch (Throwable th2) {
            l0Var.l(mf.a0.f(th2));
            throw th2;
        }
    }
}
